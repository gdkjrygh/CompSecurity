// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.android.sdk.common.dom.order.ServiceMethod;

class direction
{

    static final int $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[];
    static final int $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[];
    static final int $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Mention[];
    static final int $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[];

    static 
    {
        $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType = new int[com.dominos.android.sdk.core.coupon..CouponErrorType.values().length];
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon..CouponErrorType.Fulfilled.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon..CouponErrorType.ValidCoupon.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Mention = new int[ntion.values().length];
        try
        {
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Mention[ntion.PRODUCT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Mention[ntion.ORDER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Mention[ntion.COUPONADDED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Mention[ntion.COUPONREMOVED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod = new int[ServiceMethod.values().length];
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.CARRYOUT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.DELIVERY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection = new int[direction.values().length];
        try
        {
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[direction.ROOTMENU.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[direction.MENULIST.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[direction.COUPON.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[direction.CHECKOUT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[direction.PRODUCT_EDIT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[direction.PRODUCT_REMOVE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[direction.PRODUCT.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$dominos$nina$dialog$agent$CartConfirmAgent$Redirection[direction.GOOGLE_WALLET.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
