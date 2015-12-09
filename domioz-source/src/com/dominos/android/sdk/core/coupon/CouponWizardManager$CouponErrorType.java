// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.coupon;


public final class  extends Enum
{

    private static final UnKnown $VALUES[];
    public static final UnKnown BelowMinimumOrderAmount;
    public static final UnKnown CouponExclusivityViolation;
    public static final UnKnown CouponIsInvalidForDayOfWeek;
    public static final UnKnown CouponIsInvalidForDayPart;
    public static final UnKnown CouponIsNotEffectiveOrExpired;
    public static final UnKnown CouponNotInStore;
    public static final UnKnown ExpiredPromotionalRedemptionCoupon;
    public static final UnKnown Fulfilled;
    public static final UnKnown InValidCoupon;
    public static final UnKnown InvalidServiceMethodForCoupon;
    public static final UnKnown MinimumOrderAmount;
    public static final Known PromotionalUsageViolation;
    public static final UnKnown UnKnown;
    public static final UnKnown Unfulfilled;
    public static final UnKnown UsageCountViolation;
    public static final UnKnown ValidCoupon;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/android/sdk/core/coupon/CouponWizardManager$CouponErrorType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CouponExclusivityViolation = new <init>("CouponExclusivityViolation", 0);
        CouponIsInvalidForDayPart = new <init>("CouponIsInvalidForDayPart", 1);
        CouponIsInvalidForDayOfWeek = new <init>("CouponIsInvalidForDayOfWeek", 2);
        PromotionalUsageViolation = new <init>("PromotionalUsageViolation", 3);
        UsageCountViolation = new <init>("UsageCountViolation", 4);
        InvalidServiceMethodForCoupon = new <init>("InvalidServiceMethodForCoupon", 5);
        BelowMinimumOrderAmount = new <init>("BelowMinimumOrderAmount", 6);
        MinimumOrderAmount = new <init>("MinimumOrderAmount", 7);
        CouponIsNotEffectiveOrExpired = new <init>("CouponIsNotEffectiveOrExpired", 8);
        ExpiredPromotionalRedemptionCoupon = new <init>("ExpiredPromotionalRedemptionCoupon", 9);
        Unfulfilled = new <init>("Unfulfilled", 10);
        Fulfilled = new <init>("Fulfilled", 11);
        ValidCoupon = new <init>("ValidCoupon", 12);
        InValidCoupon = new <init>("InValidCoupon", 13);
        CouponNotInStore = new <init>("CouponNotInStore", 14);
        UnKnown = new <init>("UnKnown", 15);
        $VALUES = (new .VALUES[] {
            CouponExclusivityViolation, CouponIsInvalidForDayPart, CouponIsInvalidForDayOfWeek, PromotionalUsageViolation, UsageCountViolation, InvalidServiceMethodForCoupon, BelowMinimumOrderAmount, MinimumOrderAmount, CouponIsNotEffectiveOrExpired, ExpiredPromotionalRedemptionCoupon, 
            Unfulfilled, Fulfilled, ValidCoupon, InValidCoupon, CouponNotInStore, UnKnown
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
