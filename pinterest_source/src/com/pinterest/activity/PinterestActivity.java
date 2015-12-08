// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.google.gson.JsonPrimitive;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Application;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.base.Services;
import com.pinterest.base.Social;
import com.pinterest.base.StopWatch;
import com.pinterest.experience.Experiences;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.autoupdate.AutoUpdateManager;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.kit.notification.AppRater;
import com.pinterest.receiver.GlobalDataUpdateReceiver;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.badge.AppBadgeUtils;

// Referenced classes of package com.pinterest.activity:
//            ActivityHelper

public class PinterestActivity extends Activity
{

    private static int _instanceCount = 0;

    public PinterestActivity()
    {
        StopWatch.get().start("ttrfp");
        StopWatch.get().start("ttrfp_tmp_log");
        StopWatch.get().putAuxData("ttrfp_tmp_log", "sts_pinterest_activity_count", new JsonPrimitive(new Integer(_instanceCount)));
        _instanceCount++;
        startMeasuringDeepLink();
    }

    private void authedUserStartup()
    {
        GlobalDataUpdateReceiver.a();
        AppRater.registerLaunch(this);
        Experiences.a();
        AppBadgeUtils.removeBadge(Application.context());
    }

    private boolean isValidInstance()
    {
        boolean flag1 = true;
        boolean flag = flag1;
        if (!isTaskRoot())
        {
            Intent intent = getIntent();
            String s = intent.getAction();
            flag = flag1;
            if (intent.hasCategory("android.intent.category.LAUNCHER"))
            {
                flag = flag1;
                if (s != null)
                {
                    flag = flag1;
                    if (s.equals("android.intent.action.MAIN"))
                    {
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }

    private void reportClientNotif()
    {
        if ("CLIENT_NOTIF".equals(getIntent().getStringExtra("com.pinterest.EXTRA_SOURCE")))
        {
            Pinalytics.a(EventType.CLIENT_NOTIFICATION_OPENED_BY, ApplicationInfo.getInstallId());
            AnalyticsApi.a("client_notif_clicked");
        }
    }

    private void startAdjust()
    {
        String s = "production";
        if (ApplicationInfo.isNonProduction())
        {
            s = "sandbox";
        }
        Adjust.a(new AdjustConfig(this, "c7mmnwll85ea", s));
    }

    private void startMeasuringDeepLink()
    {
        if (!Preferences.persisted().contains("PREF_FIRST_LAUNCH"))
        {
            StopWatch.get().start("INSTALL_REFERRER_DELAY");
        }
    }

    protected void init()
    {
        ImageCache.initDefault();
        Experiments.aa();
        ImageCache.setAllowPersistentCache(Experiments.v());
        reportClientNotif();
        Services.startNotificationService();
        if (MyUser.hasAccessTokenAndUser())
        {
            MyUser.setLoggedIn(true);
            authedUserStartup();
            startActivity(ActivityHelper.getHomeIntent(this));
        } else
        {
            MyUser.setLoggedIn(false);
            ActivityHelper.goSplash(this);
        }
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        StopWatch.get().logTimeStamp("ttrfp_tmp_log", "ts_10_pinterest_activity_init").startSubWatch("ttrfp_tmp_log", "du_10_pinterest_activity_init");
        Social.init();
        super.onCreate(bundle);
        AutoUpdateManager.a().checkForUpdate();
        startAdjust();
        ApplicationInfo.reportInstall(this);
        CrashReporting.a();
        Pinalytics.a(EventType.APP_START, null, Pinalytics.b());
    }

    public void onNewIntent(Intent intent)
    {
        setIntent(intent);
    }

    protected void onStart()
    {
        super.onStart();
        if (isValidInstance())
        {
            init();
        } else
        {
            finish();
        }
        StopWatch.get().stopSubWatch("ttrfp_tmp_log", "du_10_pinterest_activity_init");
    }

}
