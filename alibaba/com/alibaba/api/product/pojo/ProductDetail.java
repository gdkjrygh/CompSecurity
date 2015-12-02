// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.product.pojo;

import com.alibaba.api.base.pojo.AEBigSaleExtDTO;
import com.alibaba.api.base.pojo.AEBigSaleMarkDTO;
import com.alibaba.api.base.pojo.Amount;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductDetail
    implements Serializable
{
    public static class ActivityOption
        implements Serializable
    {

        public static final int ACTIVITY_STATUS_END = 3;
        public static final int ACTIVITY_STATUS_NOSTART = 0;
        public static final int ACTIVITY_STATUS_SELLING = 2;
        public static final int ACTIVITY_STATUS_SOLDOUT = 1;
        public static final int ACTIVITY_STATUS_UNKOWN = -1;
        public Amount actMaxAmount;
        public Amount actMinAmount;
        public String activityStatus;
        public long activityWholeTime;
        public int discount;
        public long expirationTime;
        public boolean isDisplayBulkPrice;
        public boolean isDisplayIcon;
        public boolean isStock;
        public int maxPurchaseNum;
        public String mbExclusiveDisplay;
        public String mbExclusiveFlag;
        public String name;
        public Amount previewActMaxAmount;
        public Amount previewActMinAmount;
        public long promotionId;
        public int promotionLeftDays;
        public int promotionLeftHours;
        public int promotionLeftMinutes;
        public int promotionLeftSecs;
        public int totalAvailQuantity;
        public int totalQuantity;
        public String type;

        public int getActivityStatus()
        {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }

        public void setNextActivityStatus()
        {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }

        public ActivityOption()
        {
        }
    }

    public static class BuyerProtectInfo
        implements Serializable
    {

        public String onTimeDeliveryDesc;
        public String onTimeDeliveryTitle;
        public String returnNoReasonDesc;
        public String returnNoReasonTitle;
        public String returnPolicyDesc;
        public String returnPolicyTitle;

        public BuyerProtectInfo()
        {
        }
    }

    public static class EvaStatistic
        implements Serializable
    {

        public int fiveStarNum;
        public int fourStarNum;
        public int negativeNum;
        public int neutralNum;
        public int oneStarNum;
        public int positiveNum;
        public int threeStarNum;
        public int totalValidNum;
        public int twoStarNum;

        public EvaStatistic()
        {
        }
    }

    public static class EvaluationInfo
        implements Serializable
    {

        public ArrayList evaluationList;
        public int totalNum;

        public EvaluationInfo()
        {
            evaluationList = new ArrayList();
        }
    }

    public static class FixedDiscount
        implements Serializable
    {

        public Amount discountAmount;
        public Amount fixedAmount;
        public String name;
        public long promotionId;
        public int promotionLeftDays;
        public int promotionLeftHours;
        public int promotionLeftMinutes;
        public int promotionLeftSecs;
        public String type;

        public FixedDiscount()
        {
        }
    }

    public static class PackageInfo
        implements Serializable
    {

        public int height;
        public int length;
        public float weight;
        public int width;

        public PackageInfo()
        {
        }
    }

    public static class PriceDevice
        implements Serializable
    {

        public int deliveryTime;
        public int endNumber;
        public int index;
        public float price;
        public int startNumber;

        public PriceDevice()
        {
        }
    }

    public static class PriceUnit
        implements Serializable
    {

        public BulkOption bulkOption;
        public boolean isActivity;
        public boolean isBulk;
        public Amount maxAmount;
        public int maxPurchaseNumber;
        public Amount minAmount;
        public int minPurchaseNumber;
        public Amount previewMaxAmount;
        public Amount previewMinAmount;
        public ArrayList priceRangeList;
        public int processingTime;

        public PriceUnit()
        {
        }
    }

    public static class PriceUnit.BulkOption
        implements Serializable
    {

        public Amount skuBulkAmount;
        public int skuBulkDiscount;
        public int skuBulkOrder;

        public PriceUnit.BulkOption()
        {
        }
    }

    public static class ProductMultiLangProps
        implements Serializable
    {

        public String productId;
        public String subject;
        public String translateSource;

        public ProductMultiLangProps()
        {
        }
    }

    public static class ProductProperty
        implements Serializable
    {

        public String attrName;
        public String attrValue;

        public ProductProperty()
        {
        }
    }

    public static class SellerBasicInfo
        implements Serializable
    {

        public String email;
        public boolean isLocalSeller;
        public String loginId;
        public String sellerCountryCode;
        public String storeName;

        public SellerBasicInfo()
        {
        }
    }

    public static class SellerFeedbackInfo
        implements Serializable
    {

        public String sellerLevel;
        public int sellerPositiveNum;
        public String sellerPositiveRate;
        public long sellerScore;

        public SellerFeedbackInfo()
        {
        }
    }

    public static class SizeInfo
        implements Serializable
    {

        public boolean hasSizeInfo;
        public String sizeInfoUrl;
        public String title;

        public SizeInfo()
        {
        }
    }

    public static class SkuProperty
        implements Serializable
    {

        public boolean isShowTypeColor;
        public int order;
        public String showType;
        public SizeInfo sizeInfo;
        public long skuPropertyId;
        public String skuPropertyName;
        public ArrayList skuPropertyValues;

        public SkuProperty()
        {
            skuPropertyValues = new ArrayList();
        }
    }

    public static class SkuPropertyValue
        implements Serializable
    {

        public String SkuPropertySendGoodsCountryCode;
        public int isFake;
        public String propertyValueDefinitionName;
        public long propertyValueId;
        public String propertyValueName;
        public String skuColorValue;
        public String skuPropertyImagePath;
        public String skuPropertyImageSummPath;
        public int skuPropertyValueShowOrder;
        public String skuPropertyValueTips;

        public SkuPropertyValue()
        {
        }
    }

    public static class SupplierStoreCoupon
        implements Serializable
    {

        public String acquireEndDateString;
        public String acquireStartDate;
        public String activityDesc;
        public String activityName;
        public int availableNum;
        public long consumeValidTime;
        public Amount denominationAmount;
        public long id;
        public boolean isAcquirable;
        public int numPerBuyer;
        public long sellerAdminSeq;

        public SupplierStoreCoupon()
        {
        }
    }

    public static class TimeRemaining
        implements Serializable
    {

        public int days;
        public int hours;
        public int mins;

        public TimeRemaining()
        {
        }
    }

    public static class Transaction
        implements Serializable
    {

        public int totalCount;
        public int tradeCount;

        public Transaction()
        {
        }
    }


    public ActivityOption activityOption;
    public AEBigSaleExtDTO bigSaleExtDTO;
    public AEBigSaleMarkDTO bigSaleMarkDTO;
    public BuyerProtectInfo bpDetail;
    public long categoryId;
    public long companyId;
    public String countPerLot;
    public String detailUrl;
    public EvaStatistic evaStatistic;
    public FixedDiscount fixedDiscount;
    public ArrayList freeShippingCountries;
    public boolean isDiscountActivity;
    public boolean isFixedDiscount;
    public boolean isItemWished;
    public boolean isLocalProd;
    public String multiUnit;
    public PackageInfo packageInfo;
    public ArrayList priceOption;
    public EvaluationInfo productEvaluationInfo;
    public String productId;
    public ArrayList productImageUrl;
    public ProductMultiLangProps productMultiLangProps;
    public int productType;
    public List props;
    public float ratings;
    public String sellByLot;
    public long sellerAdminSeq;
    public SellerBasicInfo sellerBasicInfo;
    public SellerFeedbackInfo sellerFeedbackInfo;
    public boolean showCoinAnim;
    public ArrayList skuPropertyList;
    public int stock;
    public String subject;
    public SupplierStoreCoupon supplierCouponView;
    public TimeRemaining timeRemaining;
    public Transaction transaction;
    public String unit;
    public String useStock;
    public int wishListCount;

    public ProductDetail()
    {
    }
}
