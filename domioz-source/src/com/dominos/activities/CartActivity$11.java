// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.cart.CartErrorType;
import com.dominos.android.sdk.core.order.PriceOrderErrorCode;

class eOrderErrorCode
{

    static final int $SwitchMap$com$dominos$android$sdk$core$cart$CartErrorType[];
    static final int $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[];
    static final int $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[];

    static 
    {
        $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType = new int[com.dominos.android.sdk.core.coupon.ger.CouponErrorType.values().length];
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.ger.CouponErrorType.Fulfilled.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror21) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.ger.CouponErrorType.ValidCoupon.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror20) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.ger.CouponErrorType.CouponExclusivityViolation.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        $SwitchMap$com$dominos$android$sdk$core$cart$CartErrorType = new int[CartErrorType.values().length];
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$cart$CartErrorType[CartErrorType.COUPON_PRODUCT_REMOVED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$cart$CartErrorType[CartErrorType.COUPON_REMOVED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$cart$CartErrorType[CartErrorType.PRODUCT_REMOVED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$cart$CartErrorType[CartErrorType.SUCCESS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode = new int[PriceOrderErrorCode.values().length];
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.TooManyToppings.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.TooManyItems.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.UnknownProductError.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.CouponExclusivityViolation.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.PromotionalUsageViolation.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.CouponIsInvalidForDayPart.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.CouponIsInvalidForDayOfWeek.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.CouponIsNotEffectiveOrExpired.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.UsageCountViolation.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.InvalidServiceMethodForCoupon.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.BelowMinimumOrderAmount.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.Unfulfilled.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.InvalidCoupon.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.NonLoyaltyStore.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.UnableToProcessLoyalty.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
