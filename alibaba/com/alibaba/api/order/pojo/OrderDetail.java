// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.order.pojo;

import java.util.Date;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.alibaba.api.order.pojo:
//            Money

public class OrderDetail
{
    public static class OrderContactPersonVO
    {

        public String address;
        public String address2;
        public String city;
        public String contactPerson;
        public String country;
        public String mobilePhone;
        public String phoneCountry;
        public String province;
        public String zipCode;

        public OrderContactPersonVO()
        {
        }
    }

    public static class OrderFundDetailVO
    {

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

        public OrderFundDetailVO()
        {
        }
    }

    public static class OrderFundDetailVO.PromotionDiscountView
    {

        public Money localMoney;
        public Money money;

        public OrderFundDetailVO.PromotionDiscountView()
        {
        }
    }

    public static class OrderFundDetailVO.RefundItemView
    {

        public Date gmtRefundTime;
        public String gmtRefundTimeString;
        public String memo;
        public Money refundAmount;
        public Money refundBuyerLocal;

        public OrderFundDetailVO.RefundItemView()
        {
        }
    }

    public static class OrderLogisticsItemVO
    {

        public String logisticsNo;
        public String logisticsServiceName;
        public List logisticsTracks;
        public String logisticsTypeCode;
        public String officialWebsite;
        public String sentTime;
        public String sentTimeString;
        public String toAreaWebsite;

        public OrderLogisticsItemVO()
        {
        }
    }

    public static class OrderLogisticsItemVO.OrderLogisticsTrackVO
    {

        public String addressForDisplay;
        public Date eventDate;
        public String eventDateString;
        public String eventDesc;

        public OrderLogisticsItemVO.OrderLogisticsTrackVO()
        {
        }
    }

    public static class OrderProductVO
    {

        public String buyerSignerFirstName;
        public String buyerSignerLastName;
        public boolean canOpenDispute;
        public boolean canSubmitDispute;
        public String childId;
        public String deliveryTime;
        public String disputeDetailUrl;
        public String endReason;
        public String fundStatus;
        public Date gmtTradeEnd;
        public String gmtTradeEndTime;
        public Integer goodsPrepareTime;
        public String issueMode;
        public String issueStatus;
        public Money logisticsAmount;
        public String logisticsServiceName;
        public String logisticsStatus;
        public String logisticsType;
        public String memo;
        public String openDisputeUrl;
        public String orderId;
        public String orderStatus;
        public Integer productCount;
        public String productId;
        public String productImgUrl;
        public String productName;
        public List productSku;
        public String productSnapUrl;
        public String productStandard;
        public String productUnit;
        public Money productUnitPrice;
        public Money productUnitPriceBuyerLocal;
        public String rechageCurrency;
        public String rechargeAmount;
        public String reminderCopywriting;
        public String sellerSignerFirstName;
        public String sellerSignerLastName;
        public Date sendGoodsTime;
        public String sendGoodsTimeString;
        public boolean showDisputeDetail;
        public String showEndReason;
        public String showStatus;
        public String siteLanguage;
        public String siteProductname;
        public String skuCode;
        public String skuImageUrl;
        public String sonOrderStatus;
        public boolean submitDispute;
        public Money totalProductAmount;
        public Money totalProductAmountBuyerLocal;

        public OrderProductVO()
        {
        }
    }


    public String buyerAdminSeq;
    public String buyerFullName;
    public Boolean canCancel;
    public Boolean canConfirmReceived;
    public Boolean canEvaluate;
    public Boolean canExtend;
    public Boolean canPay;
    public Boolean canResume;
    public Boolean canTracking;
    public String cancelOrderReminderCopywriting;
    public String cancelOrederReasonCopywriting;
    public String carrioperator;
    public String companyId;
    public OrderContactPersonVO contactPerson;
    public String country;
    public String endReason;
    public String finishedOrder;
    public String frozenStatus;
    public OrderFundDetailVO fundDetail;
    public String fundStatus;
    public Date gmtCreate;
    public String gmtCreateString;
    public long gmtOverTime;
    public Date gmtPayTime;
    public String gmtPayTimeString;
    public Date gmtSendGoodsTime;
    public String gmtSendGoodsTimeString;
    public String issueStatus;
    public List logisticsList;
    public String logisticsStatus;
    public int maxExtendDays;
    public String memo;
    public String mobileNO;
    public String orderId;
    public String orderSignature;
    public String orderType;
    public List productList;
    public String reminderCopywriting;
    public String sellerAdminSeq;
    public String sellerName;
    public String shopNumber;
    public String showEndReason;
    public String showStatus;
    public String status;
    public String statusCopywriting;
    public String storeName;

    public OrderDetail()
    {
    }
}
