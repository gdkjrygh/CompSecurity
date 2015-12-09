// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;

import java.io.Serializable;

public class OrderHistory
    implements Serializable
{

    private String orderDate;
    private String orderNumber;
    private String orderStatus;
    private String url;

    public OrderHistory()
    {
    }

    public String getOrderDate()
    {
        return orderDate;
    }

    public String getOrderNumber()
    {
        return orderNumber;
    }

    public String getOrderStatus()
    {
        return orderStatus;
    }

    public String getUrl()
    {
        return url;
    }
}
