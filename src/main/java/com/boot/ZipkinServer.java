package com.boot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinStreamServer
public class ZipkinServer {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServer.class, args);
        System.out.println("====cloud-zipkin 启动成功====");
    }
}