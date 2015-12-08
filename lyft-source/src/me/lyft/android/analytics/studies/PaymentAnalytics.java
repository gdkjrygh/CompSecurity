// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.SpanningAnalytics;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;

public final class PaymentAnalytics
{

    public static final String FACEBOOK = "facebook";
    public static final String PAYMENTS = "payments";

    public PaymentAnalytics()
    {
    }

    public static void changeCardCountry()
    {
        UiAnalytics.trackTap(UiElement.CHANGE_CARD_COUNTRY, Category.PAYMENT);
    }

    public static AsyncActionAnalytics createAddCardAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.ADD_CARD, Category.PAYMENT);
    }

    public static AsyncActionAnalytics createCouponAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.ADD_COUPON, Category.PAYMENT);
    }

    public static AsyncActionAnalytics createEditCardAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.EDIT_CARD, Category.PAYMENT);
    }

    public static AsyncActionAnalytics createPayPalAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.ADD_PAYPAL, Category.PAYMENT);
    }

    public static AsyncActionAnalytics createScanCardAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.SCAN_CARD, Category.PAYMENT);
    }

    public static AsyncActionAnalytics createWalletAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.ADD_WALLET, Category.PAYMENT);
    }

    public static void openAddCardItem()
    {
        UiAnalytics.trackTap(UiElement.OPEN_ADD_CARD_ITEM, Category.PAYMENT);
    }

    public static void openEditCardItem()
    {
        UiAnalytics.trackTap(UiElement.OPEN_EDIT_CARD_ITEM, Category.PAYMENT);
    }

    public static void openEditCreditLine()
    {
        UiAnalytics.trackTap(UiElement.OPEN_CREDIT_LINE_ITEM, Category.PAYMENT);
    }

    public static void openEditPayPal()
    {
        UiAnalytics.trackTap(UiElement.OPEN_EDIT_PAYPAL_ITEM, Category.PAYMENT);
    }

    public static void openEditWalletItem()
    {
        UiAnalytics.trackTap(UiElement.OPEN_EDIT_WALLET_ITEM, Category.PAYMENT);
    }

    public static void trackEditFacebookCard()
    {
        (new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.EDIT_FACEBOOK_CARD)).setTag("payments").trackInitiation().trackSuccess();
    }

    public static void trackEnterCreditCard()
    {
        UiAnalytics.trackTap(UiElement.ENTER_CC, Category.PAYMENT);
    }

    public static ActionAnalytics trackOpenFacebookMessenger()
    {
        return (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.OPEN_FACEBOOK_MESSENGER)).setTag("payments").trackInitiation();
    }

    public static void trackPaymentDialogClose()
    {
        UiAnalytics.trackTap(UiElement.PAYMENT_DIALOG_CLOSE, Category.PAYMENT);
    }

    public static void trackPaymentFraudClose()
    {
        UiAnalytics.trackTap(UiElement.PAYMENT_FRAUD_CLOSE, Category.PAYMENT);
    }

    public static void trackPaymentSelectTap()
    {
        UiAnalytics.trackTap(UiElement.PAYMENT_SELECT, Category.PAYMENT);
    }

    public static ActionAnalytics trackSetDefaultFacebook()
    {
        return (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.SET_DEFAULT_PAYMENT)).setParameter("facebook").setTag("payments").trackInitiation();
    }
}
