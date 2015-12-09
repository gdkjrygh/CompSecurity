// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.util;

import com.dominos.android.sdk.core.analytics.AnalyticsService;
import com.dominos.utils.AnalyticsUtil;
import java.util.Map;

public class WearAnalytics
{

    private static final String ANALYTICS_GROUP = "Android-Wear Action";
    AnalyticsService mAnalyticsService;

    public WearAnalytics()
    {
    }

    public void publishEasyOrderClick()
    {
        Map map = AnalyticsUtil.newAnalyticsViewMap("Android-WearLanding Action \u2013 EasyOrder", "/android-wearlanding_action/easy_order");
        map.put("group", "Android-Wear Action");
        map.put("sub_group", "EasyOrder");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void publishRecentOrdersClick()
    {
        Map map = AnalyticsUtil.newAnalyticsViewMap("Android-WearLanding Action \u2013 RecentOrders", "/android-wearlanding_action/recent_orders");
        map.put("group", "Android-Wear Action");
        map.put("sub_group", "RecentOrders");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }

    public void publishTrackerClick()
    {
        Map map = AnalyticsUtil.newAnalyticsViewMap("Android-WearLanding Action \u2013 Tracker", "/android-wearlanding_action/tracker");
        map.put("group", "Android-Wear Action");
        map.put("sub_group", "Tracker");
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT, map);
    }
}
