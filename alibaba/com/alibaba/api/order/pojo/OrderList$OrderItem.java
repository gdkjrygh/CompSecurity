// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.order.pojo;

import java.util.List;

// Referenced classes of package com.alibaba.api.order.pojo:
//            OrderList, Money

public static class SubOrder
{
    public static class SubOrder
    {

        public String issueStatus;
        public String parentId;
        public Money productBuyerLocalPrice;
        public Integer productCount;
        public String productId;
        public String productName;
        public List productSku;
        public String smallPhotoFullPath;
        public String subOrderId;
        public String subOrderStatus;

        public SubOrder()
        {
        }
    }


    public String buyerAliId;
    public Boolean canConfirmReceived;
    public Boolean canEvaluate;
    public Boolean canPay;
    public Boolean canTracking;
    public String carrioperator;
    public String country;
    public String gmtTradeCreate;
    public String gmtTradeCreateString;
    public String mobileNO;
    public Money orderAmount;
    public int orderCount;
    public String orderId;
    public String orderSignature;
    public String orderStatus;
    public String orderType;
    public Money originOrderAmount;
    public String parentId;
    public String sellerAliId;
    public String shopNumber;
    public String showId;
    public String showStatus;
    public List subList;

    public SubOrder()
    {
    }
}
