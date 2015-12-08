// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.order;


public final class PriceOrderErrorCode extends Enum
{

    private static final PriceOrderErrorCode $VALUES[];
    public static final PriceOrderErrorCode BelowMinimumOrderAmount;
    public static final PriceOrderErrorCode CouponExclusivityViolation;
    public static final PriceOrderErrorCode CouponIsInvalidForDayOfWeek;
    public static final PriceOrderErrorCode CouponIsInvalidForDayPart;
    public static final PriceOrderErrorCode CouponIsNotEffectiveOrExpired;
    public static final PriceOrderErrorCode ExpiredPromotionalRedemptionCoupon;
    public static final PriceOrderErrorCode Fulfilled;
    public static final PriceOrderErrorCode InvalidCoupon;
    public static final PriceOrderErrorCode InvalidServiceMethodForCoupon;
    public static final PriceOrderErrorCode NonLoyaltyStore;
    public static final PriceOrderErrorCode PromotionalUsageViolation;
    public static final PriceOrderErrorCode TooManyItems;
    public static final PriceOrderErrorCode TooManyToppings;
    public static final PriceOrderErrorCode UnableToProcessLoyalty;
    public static final PriceOrderErrorCode Unfulfilled;
    public static final PriceOrderErrorCode Unknown;
    public static final PriceOrderErrorCode UnknownProductError;
    public static final PriceOrderErrorCode UsageCountViolation;
    public static final PriceOrderErrorCode ValidCoupon;

    private PriceOrderErrorCode(String s, int i)
    {
        super(s, i);
    }

    public static PriceOrderErrorCode valueOf(String s)
    {
        return (PriceOrderErrorCode)Enum.valueOf(com/dominos/android/sdk/core/order/PriceOrderErrorCode, s);
    }

    public static PriceOrderErrorCode[] values()
    {
        return (PriceOrderErrorCode[])$VALUES.clone();
    }

    static 
    {
        TooManyToppings = new PriceOrderErrorCode("TooManyToppings", 0);
        TooManyItems = new PriceOrderErrorCode("TooManyItems", 1);
        CouponExclusivityViolation = new PriceOrderErrorCode("CouponExclusivityViolation", 2);
        CouponIsInvalidForDayPart = new PriceOrderErrorCode("CouponIsInvalidForDayPart", 3);
        CouponIsInvalidForDayOfWeek = new PriceOrderErrorCode("CouponIsInvalidForDayOfWeek", 4);
        PromotionalUsageViolation = new PriceOrderErrorCode("PromotionalUsageViolation", 5);
        UsageCountViolation = new PriceOrderErrorCode("UsageCountViolation", 6);
        InvalidServiceMethodForCoupon = new PriceOrderErrorCode("InvalidServiceMethodForCoupon", 7);
        BelowMinimumOrderAmount = new PriceOrderErrorCode("BelowMinimumOrderAmount", 8);
        CouponIsNotEffectiveOrExpired = new PriceOrderErrorCode("CouponIsNotEffectiveOrExpired", 9);
        ExpiredPromotionalRedemptionCoupon = new PriceOrderErrorCode("ExpiredPromotionalRedemptionCoupon", 10);
        Unfulfilled = new PriceOrderErrorCode("Unfulfilled", 11);
        Fulfilled = new PriceOrderErrorCode("Fulfilled", 12);
        ValidCoupon = new PriceOrderErrorCode("ValidCoupon", 13);
        InvalidCoupon = new PriceOrderErrorCode("InvalidCoupon", 14);
        UnknownProductError = new PriceOrderErrorCode("UnknownProductError", 15);
        NonLoyaltyStore = new PriceOrderErrorCode("NonLoyaltyStore", 16);
        UnableToProcessLoyalty = new PriceOrderErrorCode("UnableToProcessLoyalty", 17);
        Unknown = new PriceOrderErrorCode("Unknown", 18);
        $VALUES = (new PriceOrderErrorCode[] {
            TooManyToppings, TooManyItems, CouponExclusivityViolation, CouponIsInvalidForDayPart, CouponIsInvalidForDayOfWeek, PromotionalUsageViolation, UsageCountViolation, InvalidServiceMethodForCoupon, BelowMinimumOrderAmount, CouponIsNotEffectiveOrExpired, 
            ExpiredPromotionalRedemptionCoupon, Unfulfilled, Fulfilled, ValidCoupon, InvalidCoupon, UnknownProductError, NonLoyaltyStore, UnableToProcessLoyalty, Unknown
        });
    }
}
