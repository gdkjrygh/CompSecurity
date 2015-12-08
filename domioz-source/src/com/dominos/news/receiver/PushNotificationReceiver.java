// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.news.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.dominos.MobileSession;
import com.dominos.activities.LandingActivity_;
import com.dominos.activities.SplashScreenActivity_;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.data.sharedpref.ApplicationConfigurationPreferences_;
import com.dominos.utils.AnalyticsUtil;
import org.androidannotations.api.c.d;

public class PushNotificationReceiver extends BroadcastReceiver
{

    private static final String ACTION_NOTIFICATION_OPENED = "com.dominospizza.intent.APPBOY_NOTIFICATION_OPENED";
    private static final String PROMO_CODE_KEY = "promo_code";
    private static final String TAG = com/dominos/news/receiver/PushNotificationReceiver.getSimpleName();
    AnalyticsUtil mAnalyticsUtil;
    ApplicationConfigurationPreferences_ mConfigurationPreferences;
    MobileSession mMobileSession;

    public PushNotificationReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null && StringHelper.equals(intent.getAction(), "com.dominospizza.intent.APPBOY_NOTIFICATION_OPENED") && mConfigurationPreferences.pushNotificationsEnabled().a(Boolean.valueOf(false)).booleanValue())
        {
            String s = "";
            if (StringHelper.isNotEmpty(intent.getExtras().getString("cid")))
            {
                s = intent.getExtras().getString("cid");
            }
            if (StringHelper.isNotEmpty(intent.getExtras().getString("uri")))
            {
                Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(intent.getExtras().getString("uri")));
                intent1.putExtra("push_campaign", s);
                intent1.setFlags(0x10000000);
                context.startActivity(intent1);
                context = intent.getExtras().getString("uri");
            } else
            {
                if (LandingActivity_.getInstance() == null)
                {
                    ((com.dominos.activities.SplashScreenActivity_.IntentBuilder_)SplashScreenActivity_.intent(context).mPushCampaignId(s).flags(0x10000000)).start();
                }
                context = "";
            }
            if (StringHelper.isNotEmpty(intent.getExtras().getBundle("extra").getString("promo_code")))
            {
                intent = intent.getExtras().getBundle("extra").getString("promo_code");
            } else
            {
                intent = "";
            }
            mAnalyticsUtil.postPushNotificationOpened(context, intent);
            LogUtil.d(TAG, "received", new Object[0]);
        }
    }

}
