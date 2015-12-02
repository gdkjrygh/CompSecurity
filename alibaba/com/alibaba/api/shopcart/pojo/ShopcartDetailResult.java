// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.shopcart.pojo;

import com.alibaba.api.base.pojo.AEBigSaleMarkDTO;
import com.alibaba.api.base.pojo.Amount;
import com.alibaba.api.base.pojo.FixedDiscountPromotion;
import java.util.List;

public class ShopcartDetailResult
{
    public static class MobilePromotionTagDTO
    {

        public boolean bigSaleCountdownSwitch;
        public int bigSaleStatus;
        public boolean promotionCountdownSwitch;
        public long promotionCountdownTime;
        public String promotionTagEndTime;
        public String promotionTagIcon;
        public String promotionTagInfo;
        public boolean promotionTagShowSwitch;
        public String promotionTagStartTime;

        public MobilePromotionTagDTO()
        {
            promotionTagShowSwitch = false;
            promotionCountdownSwitch = false;
            bigSaleCountdownSwitch = false;
            bigSaleStatus = 0;
            promotionCountdownTime = 0L;
        }
    }

    public static class ShopcartPriceSummaryDTO
    {

        public Amount freightAmount;
        public Amount previewTotalAmount;
        public Amount productAmount;
        public Integer productItemCount;
        public Amount savedFreightAmount;
        public String sellerCountryCode;
        public Amount sellerDiscountAmount;
        public Amount totalAmount;

        public ShopcartPriceSummaryDTO()
        {
        }
    }

    public static class ShopcartSellerView
    {

        public Amount availableProductAmount;
        public Amount availableProductTotalAmount;
        public long companyId;
        public String companyName;
        public Integer couponCount;
        public FixedDiscountPromotion fixedDiscountPromotion;
        public Amount fixedDiscountSaveAmount;
        public boolean hasCoupon;
        public Amount previewProductTotalAmount;
        public Amount savedFreightAmount;
        public long sellerAdminSeq;
        public String sellerCountryCode;
        public List shopcartItems;
        public Amount totalFreightAmount;

        public ShopcartSellerView()
        {
        }
    }


    public static final int RECEIVE_DATA_TYPE_FROM_OTHER = 1002;
    public static final int RECEIVE_DATA_TYPE_FROM_SELECT = 1001;
    public static final int VERSION = 3;
    public int availableProductCount;
    public String availableProductShopcartIDs;
    public AEBigSaleMarkDTO bigSaleMarkDTO;
    public String countryCode;
    public String countryFullName;
    public boolean isSuccess;
    public MobilePromotionTagDTO mobilePromotionTagDTO;
    public Amount previewTotalAmount;
    public int productItemCount;
    public List shopcartPriceSummaryList;
    public List shopcartSellers;
    public Amount totalAmount;
    public Amount totalDiscountAmount;
    public Amount totalProductAmount;
    public Amount totalSavedShippingAmount;
    public Amount totalShippingAmount;

    public ShopcartDetailResult()
    {
    }
}
