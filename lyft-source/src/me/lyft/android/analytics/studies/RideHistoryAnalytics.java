// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;

public class RideHistoryAnalytics
{

    public RideHistoryAnalytics()
    {
    }

    public static void trackAddTipTap(String s)
    {
        UiAnalytics.trackTap(UiElement.RIDE_DETAILS_ADD_TIP, Category.RIDE_HISTORY, s);
    }

    public static void trackIndividualItemTap(String s)
    {
        UiAnalytics.trackTap(UiElement.RIDE_HISTORY, Category.RIDE_HISTORY, s);
    }

    public static AsyncActionAnalytics trackLoadMoreRideHistory()
    {
        return (new AsyncActionAnalytics(ActionName.RIDE_HISTORY_LOAD_MORE_RIDES, Category.RIDE_HISTORY)).trackRequest();
    }

    public static AsyncActionAnalytics trackLoadRideHistory()
    {
        return (new AsyncActionAnalytics(ActionName.RIDE_HISTORY_LOAD_RIDES, Category.RIDE_HISTORY)).trackRequest();
    }

    public static AsyncActionAnalytics trackLoadRideHistoryDetails()
    {
        return (new AsyncActionAnalytics(ActionName.RIDE_HISTORY_LOAD_DETAILS, Category.RIDE_HISTORY)).trackRequest();
    }

    public static void trackLostAndFoundTap(String s)
    {
        UiAnalytics.trackTap(UiElement.RIDE_DETAILS_LOST_AND_FOUND, Category.RIDE_HISTORY, s);
    }

    public static void trackPriceReviewTap(String s)
    {
        UiAnalytics.trackTap(UiElement.RIDE_DETAILS_PRICE_REVIEW, Category.RIDE_HISTORY, s);
    }

    public static void trackRideHistorySidebarTap()
    {
        UiAnalytics.trackTap(UiElement.RIDE_HISTORY_SIDEBAR, Category.RIDE_HISTORY);
    }
}
