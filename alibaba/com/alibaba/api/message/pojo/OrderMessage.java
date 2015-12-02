// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.message.pojo;


public class OrderMessage
{
    public static class Content
    {

        public String value;

        public Content()
        {
        }
    }


    public Content content;
    public String gmtCreate;
    public String gmtModified;
    public long id;
    public String poster;
    public String receiverFirstName;
    public String receiverLastName;
    public String senderFirstName;
    public String senderLastName;
    public String status;

    public OrderMessage()
    {
    }
}
