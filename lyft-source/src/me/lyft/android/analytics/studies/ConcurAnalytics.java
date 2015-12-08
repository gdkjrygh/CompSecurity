// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;

public class ConcurAnalytics
{

    public ConcurAnalytics()
    {
    }

    public static AsyncActionAnalytics linkAccountAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.T_AND_E_LINK_ACCOUNT, Category.CONCUR);
    }

    public static AsyncActionAnalytics sendReceiptsAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.T_AND_E_RECEIPTS, Category.CONCUR);
    }

    public static void sendReceiptsDisabled()
    {
        UiAnalytics.trackTap(UiElement.T_AND_E_SEND_RECEIPTS_DISABLED, Category.CONCUR);
    }

    public static void sendReceiptsDisabledDuringRide()
    {
        UiAnalytics.trackTap(UiElement.T_AND_E_SEND_RECEIPTS_DISABLED_DURING_RIDE, Category.CONCUR);
    }

    public static void sendReceiptsEnabled()
    {
        UiAnalytics.trackTap(UiElement.T_AND_E_SEND_RECEIPTS_ENABLED, Category.CONCUR);
    }

    public static void sendReceiptsEnabledDuringRide()
    {
        UiAnalytics.trackTap(UiElement.T_AND_E_SEND_RECEIPTS_ENABLED_DURING_RIDE, Category.CONCUR);
    }

    public static AsyncActionAnalytics unlinkAccountAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.T_AND_E_UNLINK_ACCOUNT, Category.CONCUR);
    }
}
