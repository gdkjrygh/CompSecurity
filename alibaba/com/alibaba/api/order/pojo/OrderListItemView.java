// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.order.pojo;

import java.util.List;

public class OrderListItemView
{

    public String buyerAliId;
    public Boolean canConfirmReceived;
    public Boolean canEvaluate;
    public Boolean canPay;
    public Boolean canTracking;
    public String carrioperator;
    public String country;
    public boolean expanded;
    public String gmtTradeCreate;
    public String gmtTradeCreateString;
    public String mobileNO;
    public String orderAmount;
    public int orderCount;
    public String orderId;
    public String orderSignature;
    public String orderStatus;
    public String orderType;
    public String originOrderAmount;
    public String parentId;
    public String sellerAliId;
    public String shopNumber;
    public String showId;
    public String showStatus;
    public List subList;
    public int viewType;

    public OrderListItemView()
    {
        expanded = false;
    }
}
