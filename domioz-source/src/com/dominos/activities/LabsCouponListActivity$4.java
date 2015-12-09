// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


class ger.InvalidRedemptionCause
{

    static final int $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[];
    static final int $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[];

    static 
    {
        $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType = new int[com.dominos.android.sdk.core.coupon.nErrorType.values().length];
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.nErrorType.ValidCoupon.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.nErrorType.Fulfilled.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.nErrorType.CouponExclusivityViolation.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.nErrorType.CouponIsInvalidForDayPart.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.nErrorType.CouponIsInvalidForDayOfWeek.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.nErrorType.PromotionalUsageViolation.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.nErrorType.UsageCountViolation.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.nErrorType.InvalidServiceMethodForCoupon.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.nErrorType.BelowMinimumOrderAmount.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.nErrorType.MinimumOrderAmount.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.nErrorType.CouponIsNotEffectiveOrExpired.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.nErrorType.ExpiredPromotionalRedemptionCoupon.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.nErrorType.InValidCoupon.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.nErrorType.UnKnown.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause = new int[com.dominos.android.sdk.core.loyalty.emptionCause.values().length];
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.emptionCause.STORE_NOT_POP.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.emptionCause.REDEMPTION_COUPON_LIMIT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.emptionCause.REDEMPTION_NOT_AVAILABLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.emptionCause.CUSTOMER_AUTH_REQUIRED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.emptionCause.CUSTOMER_NOT_ENOUGH_POINTS.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.emptionCause.CUSTOMER_NOT_ENROLLED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
