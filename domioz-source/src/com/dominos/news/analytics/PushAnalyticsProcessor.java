// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.news.analytics;

import android.app.Application;
import com.appboy.d.b.a;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.analytics.AnalyticsEvent;
import com.dominos.android.sdk.core.analytics.AnalyticsProcessor;
import com.dominos.android.sdk.core.analytics.AnalyticsService;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.news.manager.PushManager;
import java.util.Map;

public class PushAnalyticsProcessor extends AnalyticsProcessor
{

    private static String EASY_ORDER_CHECKED = "easy-order-checked";
    private AnalyticsService mAnalyticsService;
    protected Application mApp;
    private ConfigurationManager mConfigurationManager;
    MobileSession mMobileSession;
    private PushManager mPushManager;

    public PushAnalyticsProcessor()
    {
    }

    protected void onAfterInject()
    {
        mConfigurationManager = (ConfigurationManager)mMobileSession.getManager("configuration_manager");
        mAnalyticsService = (AnalyticsService)mMobileSession.getManager("analytics_manager");
        mAnalyticsService.register(this);
        mPushManager = (PushManager)mMobileSession.getManager("push_manager");
    }

    protected void processEvent(AnalyticsEvent analyticsevent)
    {
        if (mConfigurationManager.getApplicationConfiguration() == null || !mConfigurationManager.getApplicationConfiguration().isPushNotificationsEnabled()) goto _L2; else goto _L1
_L1:
        if (!StringHelper.equalsIgnoreCase((String)analyticsevent.eventData.get("event_name"), "Place Order")) goto _L4; else goto _L3
_L3:
        analyticsevent = new a();
        analyticsevent.a("Action/CTA", "tap");
        analyticsevent.a("Enable");
        com.appboy.a.a(mApp).a("Place Your Order CTA", analyticsevent);
_L2:
        return;
_L4:
        if (StringHelper.equalsIgnoreCase((String)analyticsevent.eventData.get("page_url"), "order/delivery"))
        {
            com.appboy.a.a(mApp).a("Order Placed - Delivery");
            return;
        }
        if (StringHelper.equalsIgnoreCase((String)analyticsevent.eventData.get("page_url"), "order/carryout"))
        {
            com.appboy.a.a(mApp).a("Order Placed - Carryout");
            return;
        }
        if (StringHelper.equalsIgnoreCase((String)analyticsevent.eventData.get("page_url"), "/checkout"))
        {
            analyticsevent = new a();
            analyticsevent.a("Action/CTA", "tap");
            analyticsevent.a("Enable");
            com.appboy.a.a(mApp).a("Checkout CTA Payment screen", analyticsevent);
            return;
        }
        if (StringHelper.equalsIgnoreCase((String)analyticsevent.eventData.get("event_name"), "Save as Easy Order"))
        {
            a a1 = new a();
            a1.a("Action/CTA", "check /button press");
            a1.a("Enable", (String)analyticsevent.eventData.get("EasyOrder/Checked"));
            com.appboy.a.a(mApp).a("EasyOrder checkbox selected on checkout screen", a1);
            return;
        }
        if (!StringHelper.equals((String)analyticsevent.eventData.get("page_name"), "Login"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!StringHelper.isNotEmpty((String)analyticsevent.eventData.get("user_id"))) goto _L2; else goto _L5
_L5:
        mPushManager.setPushUserId((String)analyticsevent.eventData.get("user_id"));
        return;
        if (!StringHelper.equals((String)analyticsevent.eventData.get("page_name"), "from_push") || !StringHelper.isNotEmpty((String)analyticsevent.eventData.get("campaign_id"))) goto _L2; else goto _L6
_L6:
        com.appboy.a.a(mApp).b((String)analyticsevent.eventData.get("campaign_id"));
        LogUtil.d("appboy", (new StringBuilder("push opened")).append((String)analyticsevent.eventData.get("campaign_id")).toString(), new Object[0]);
        return;
    }

}
