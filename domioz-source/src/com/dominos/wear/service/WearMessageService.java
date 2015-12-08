// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.service;

import android.app.NotificationManager;
import android.content.Intent;
import com.dominos.activities.InitialLaunchActivity;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.wear.api.WearAPI;
import com.dominos.wear.api.WearAPI_;
import com.dominos.wear.client.WearCustomerLoginClient;
import com.dominos.wear.client.WearEasyOrderClient;
import com.dominos.wear.client.WearFindOrderClient;
import com.dominos.wear.client.WearLoyaltyInfoClient;
import com.dominos.wear.client.WearPlaceOrderClient;
import com.dominos.wear.client.WearPriceOrderClient;
import com.dominos.wear.client.WearRecentOrdersClient;
import com.dominos.wear.client.WearTrackOrderInfoClient;
import com.dominos.wear.manager.WearRequestManager;
import com.dominos.wear.util.WearAnalytics;
import com.google.android.gms.wearable.WearableListenerService;
import com.google.android.gms.wearable.k;

public class WearMessageService extends WearableListenerService
{

    private static final String TAG = com/dominos/wear/service/WearMessageService.getSimpleName();
    WearRequestManager mRequestManager;
    WearAnalytics mWearAnalytics;

    public WearMessageService()
    {
    }

    public void onMessageReceived(k k1)
    {
        String s = k1.a();
        LogUtil.d(TAG, (new StringBuilder("Message received from wear : MessageEvent Path : ")).append(s).toString(), new Object[0]);
        if (StringHelper.isEmpty(s))
        {
            LogUtil.d(TAG, "Message path is empty", new Object[0]);
        } else
        {
            if (StringHelper.equals("/dominos-wear-customer-login", s))
            {
                mRequestManager.request("com.dominos.wear.customer-login", null, new WearCustomerLoginClient());
                return;
            }
            if (StringHelper.equals("/dominos-get-easy-order", s))
            {
                LogUtil.d(TAG, "Analytics : Easy order clicked.", new Object[0]);
                mRequestManager.request("com.dominos.wear.get-easy-order", null, new WearEasyOrderClient());
                mWearAnalytics.publishEasyOrderClick();
                return;
            }
            if (StringHelper.equals("/dominos-get-recent-orders", s))
            {
                mRequestManager.request("com.dominos.wear.get-recent-orders", null, new WearRecentOrdersClient());
                LogUtil.d(TAG, "Analytics : Recent orders clicked.", new Object[0]);
                mWearAnalytics.publishRecentOrdersClick();
                return;
            }
            if (StringHelper.equals("/dominos-get-track-order-info", s))
            {
                mRequestManager.request("com.dominos.wear.get-track-order-info", null, new WearTrackOrderInfoClient());
                LogUtil.d(TAG, "Analytics : Tracker clicked.", new Object[0]);
                mWearAnalytics.publishTrackerClick();
                return;
            }
            if (StringHelper.equals("/dominos-price-order", s))
            {
                mRequestManager.request("com.dominos.wear.create-historical-order", new String(k1.b()), new WearPriceOrderClient());
                return;
            }
            if (StringHelper.equals("/dominos-place-order", s))
            {
                mRequestManager.request("com.dominos.wear.place-order", new String(k1.b()), new WearPlaceOrderClient());
                return;
            }
            if (StringHelper.equals("/dominos-find-order", s))
            {
                mRequestManager.request("com.dominos.wear.find-order", new String(k1.b()), new WearFindOrderClient());
                return;
            }
            if (StringHelper.equals("/dominos-Loyalty-info", s))
            {
                mRequestManager.request("com.dominos.wear.loyalty-info", null, new WearLoyaltyInfoClient());
                return;
            }
            if (StringHelper.equals("/dominos-open-on-phone", s))
            {
                LogUtil.d(TAG, "Starting the app on phone...", new Object[0]);
                k1 = new Intent(this, com/dominos/activities/InitialLaunchActivity);
                k1.setFlags(0x10000000);
                startActivity(k1);
                return;
            }
            if (StringHelper.equals("/dominos-notification-dismissed", s))
            {
                LogUtil.d(TAG, "Notification : dismissed in wearable device.", new Object[0]);
                ((NotificationManager)getSystemService("notification")).cancel(0x4a6f43d2);
                return;
            }
            if (StringHelper.equals("/dominos-intro-notification-shown", s))
            {
                LogUtil.d(TAG, "Intro notification shown on wearable device.", new Object[0]);
                WearAPI_.getInstance_(this).setTriggerWearIntro(true);
                return;
            }
        }
    }

}
