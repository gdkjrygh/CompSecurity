// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.order.pojo;


public class OrderStatistics
{

    public Integer aeCompletedOrders;
    public Integer aeFrozenOrders;
    public Integer aeGroupOrders;
    public Integer aeInCancelOrders;
    public Integer aeIssueOrders;
    public Integer aePartSendGoodsOrders;
    public Integer aeUnconfirmedPaymentOrders;
    public Integer aeVerifyingOrders;
    public Integer aeWaitBuyerAcceptGoodsOrders;
    public Integer aeWaitBuyerFeedbackOrders;
    public Integer aeWaitPaymentOrders;
    public Integer aeWaitSellerSendGoodsOrders;
    public Integer phoneRechargeOrders;

    public OrderStatistics()
    {
        aeWaitPaymentOrders = Integer.valueOf(0);
        aeWaitSellerSendGoodsOrders = Integer.valueOf(0);
        aeWaitBuyerAcceptGoodsOrders = Integer.valueOf(0);
        aeWaitBuyerFeedbackOrders = Integer.valueOf(0);
        aeUnconfirmedPaymentOrders = Integer.valueOf(0);
        aeFrozenOrders = Integer.valueOf(0);
        aeVerifyingOrders = Integer.valueOf(0);
        aeInCancelOrders = Integer.valueOf(0);
        aePartSendGoodsOrders = Integer.valueOf(0);
        aeIssueOrders = Integer.valueOf(0);
        aeCompletedOrders = Integer.valueOf(0);
        aeGroupOrders = Integer.valueOf(0);
        phoneRechargeOrders = Integer.valueOf(0);
    }
}
