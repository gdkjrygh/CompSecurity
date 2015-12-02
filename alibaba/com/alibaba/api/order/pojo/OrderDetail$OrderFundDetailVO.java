// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.order.pojo;

import java.util.Date;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.alibaba.api.order.pojo:
//            OrderDetail, Money

public static class RefundItemView
{
    public static class PromotionDiscountView
    {

        public Money localMoney;
        public Money money;

        public PromotionDiscountView()
        {
        }
    }

    public static class RefundItemView
    {

        public Date gmtRefundTime;
        public String gmtRefundTimeString;
        public String memo;
        public Money refundAmount;
        public Money refundBuyerLocal;

        public RefundItemView()
        {
        }
    }


    public Money buyerPaymentCash;
    public Money couponAmt;
    public Money discountAmt;
    public Money discountAmtBuyerLoal;
    public String fundStatus;
    public Date gmtReceiptDate;
    public String gmtReceiptDateString;
    public Money logisticsPrice;
    public Money logisticsPriceBuyerLoal;
    public Money orderAmount;
    public Money orderAmountBuyerLoal;
    public Money paymentAmount;
    public Money paymentAmountBuyerLoal;
    public String paymentType;
    public String paymentTypeFullName;
    public Money promotionDiscountAmt;
    public Money promotionDiscountAmtBuyerLoal;
    public Map promotionDiscountDetailAmt;
    public Money receiptAmount;
    public Money receiptAmountBuyerLocal;
    public String receiptNum;
    public List refundList;
    public Money shouldpaymentAmount;
    public Money totalProductPrice;
    public Money totalProductPriceBuyerLocal;

    public RefundItemView()
    {
    }
}
