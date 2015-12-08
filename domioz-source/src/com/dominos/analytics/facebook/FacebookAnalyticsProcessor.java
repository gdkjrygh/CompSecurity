// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.analytics.facebook;

import android.app.Application;
import android.os.Bundle;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.analytics.AnalyticsEvent;
import com.dominos.android.sdk.core.analytics.AnalyticsProcessor;
import com.dominos.android.sdk.core.analytics.AnalyticsService;
import com.facebook.a.a;
import com.facebook.q;
import java.util.Map;

public class FacebookAnalyticsProcessor extends AnalyticsProcessor
{

    private static final String EVENT_CARRYOUT = "Service Method - Carryout";
    private static final String EVENT_COUPON_ADDED = "Coupon Wizard Completed";
    private static final String EVENT_DELIVERY = "Service Method - Delivery";
    private static final String EVENT_DOM_ACTIVATED = "Voice Activated";
    private static final String EVENT_LOYALTY_ACCOUNT_CREATED = "Pizza Rewards Activated";
    private static final String IS_LOGGED_IN = "Is Logged In";
    private AnalyticsService mAnalyticsService;
    protected Application mApp;
    private a mLogger;
    MobileSession mMobileSession;

    public FacebookAnalyticsProcessor()
    {
    }

    protected void onAfterInject()
    {
        mAnalyticsService = (AnalyticsService)mMobileSession.getManager("analytics_manager");
        mAnalyticsService.register(this);
        if (!q.a())
        {
            q.a(mApp.getApplicationContext());
        }
        mLogger = a.c(mApp.getApplicationContext());
    }

    protected void processEvent(AnalyticsEvent analyticsevent)
    {
        if (StringHelper.equals((String)analyticsevent.eventData.get("page_name"), "Login"))
        {
            mLogger.a("Is Logged In");
        } else
        {
            if (StringHelper.equalsIgnoreCase((String)analyticsevent.eventData.get("page_url"), "order/delivery"))
            {
                mLogger.a("Service Method - Delivery");
                return;
            }
            if (StringHelper.equalsIgnoreCase((String)analyticsevent.eventData.get("page_url"), "order/carryout"))
            {
                mLogger.a("Service Method - Carryout");
                return;
            }
            if (StringHelper.equals((String)analyticsevent.eventData.get("page_url"), "/voice/prompt_activate"))
            {
                mLogger.a("Voice Activated");
                return;
            }
            if (StringHelper.equals((String)analyticsevent.eventData.get("page_name"), "coupon_added"))
            {
                Bundle bundle = new Bundle();
                bundle.putString("coupon_code", (String)analyticsevent.eventData.get("coupon_code"));
                mLogger.a("Coupon Wizard Completed", bundle);
                return;
            }
            if (StringHelper.equals((String)analyticsevent.eventData.get("page_name"), "/account_registration_form"))
            {
                mLogger.a("fb_mobile_complete_registration");
                return;
            }
            if (StringHelper.equals((String)analyticsevent.eventData.get("page_name"), "loyalty_account_created"))
            {
                mLogger.a("Pizza Rewards Activated");
                return;
            }
            if (StringHelper.equals((String)analyticsevent.eventData.get("page_name"), "product_added"))
            {
                Bundle bundle1 = new Bundle();
                bundle1.putString("product_code", (String)analyticsevent.eventData.get("product_code"));
                bundle1.putString("units", (String)analyticsevent.eventData.get("units"));
                mLogger.a("fb_mobile_add_to_cart", bundle1);
                return;
            }
            if (StringHelper.equals((String)analyticsevent.eventData.get("event_name"), "Place Order"))
            {
                Bundle bundle2 = new Bundle();
                bundle2.putString("order_grand_total", (String)analyticsevent.eventData.get("order_grand_total"));
                bundle2.putString("fb_currency", "USD");
                mLogger.a("fb_mobile_purchase", bundle2);
                return;
            }
        }
    }
}
