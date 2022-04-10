package com.yyc.test;


import com.yyc.rpc.annotation.Service;
import com.yyc.rpc.api.HelloObject;
import com.yyc.rpc.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Service
public class HelloServiceImpl implements HelloService {

    /*
   static final 在类的准备阶段就可以赋值了。
     */
    private  static  final Logger logger =  LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(HelloObject object) {
        logger.info("接收到：{}",object.getMessage());
        return "调用的返回值为：id："+object.getId();
    }
}
