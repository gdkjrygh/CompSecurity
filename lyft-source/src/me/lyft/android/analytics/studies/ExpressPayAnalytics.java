// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.UxAnalytics;
import me.lyft.android.analytics.definitions.UiElement;

public class ExpressPayAnalytics
{

    public static final String ADD_DEBIT_CARD_SCREEN = "add_debit_card_screen";
    public static final String EDIT_DEBIT_CARD_SCREEN = "edit_debit_card_screen";

    public ExpressPayAnalytics()
    {
    }

    public static void trackAddDebitCardTaps()
    {
        UxAnalytics.tap(UiElement.ADD_DEBIT_CARD_BUTTON).setParent("express_pay_screen").track();
    }

    public static void trackConfirmDepositTaps()
    {
        UxAnalytics.tap(UiElement.CONFIRM_DEPOSIT_BUTTON).setParent("express_pay_screen").track();
    }

    public static void trackEditDebitCardTaps()
    {
        UxAnalytics.tap(UiElement.EDIT_DEBIT_CARD_BUTTON).setParent("express_pay_screen").track();
    }

    public static void trackExpressPayPromoTaps()
    {
        UxAnalytics.tap(UiElement.CHECK_IT_OUT_BUTTON).setParent("express_pay_promo").track();
    }

    public static void trackGetPaidTaps()
    {
        UxAnalytics.tap(UiElement.GET_PAID_BUTTON).setParent("express_pay_card").track();
    }

    public static void trackSaveDebitCardTaps(String s)
    {
        UxAnalytics.tap(UiElement.SAVE_DEBIT_CARD_BUTTON).setParent(s).track();
    }
}
