// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import android.app.Activity;
import android.os.Bundle;
import com.crashlytics.android.Crashlytics;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.studies.AppAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.Preconditions;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.Phone;
import me.lyft.android.domain.User;
import me.lyft.android.infrastructure.activity.ActivityService;
import me.lyft.android.infrastructure.device.IDevice;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.subscriptions.Subscriptions;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AppEventTracker, AnalyticsApi, GoogleEventTracker, LeanplumTracker, 
//            LogEventTracker, RealTimeEventTracker, RedshiftEventTracker

public class AnalyticsService extends ActivityService
{

    private static boolean initialized = false;
    private final AnalyticsApi analyticsApi;
    private final AppEventTracker appEventTracker;
    private Subscription appTrackerSubscription;
    private final IDevice device;
    private final GoogleEventTracker googleTracker;
    private final LeanplumTracker leanplumTracker;
    private final LogEventTracker logEventTracker;
    private final ILyftPreferences lyftPreferences;
    private final Action1 onAppTrackerUpdated = new Action1() {

        final AnalyticsService this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            trackInstallIfNeeded();
            appTrackerSubscription.unsubscribe();
        }

            
            {
                this$0 = AnalyticsService.this;
                super();
            }
    };
    private final Action1 onUserUpdate = new Action1() {

        final AnalyticsService this$0;

        public volatile void call(Object obj)
        {
            call((User)obj);
        }

        public void call(User user)
        {
            appEventTracker.updateUserInfo(user);
            updateCrashlyticsUser(user);
        }

            
            {
                this$0 = AnalyticsService.this;
                super();
            }
    };
    private final RealTimeEventTracker realTimeEventTracker;
    private final RedshiftEventTracker redshiftTracker;
    private final IUserProvider userProvider;
    private Subscription userSubscription;

    AnalyticsService(AnalyticsApi analyticsapi, IDevice idevice, IUserProvider iuserprovider, GoogleEventTracker googleeventtracker, RedshiftEventTracker redshifteventtracker, AppEventTracker appeventtracker, LogEventTracker logeventtracker, 
            LeanplumTracker leanplumtracker, RealTimeEventTracker realtimeeventtracker, ILyftPreferences ilyftpreferences)
    {
        userSubscription = Subscriptions.empty();
        appTrackerSubscription = Subscriptions.empty();
        device = idevice;
        userProvider = iuserprovider;
        googleTracker = googleeventtracker;
        redshiftTracker = redshifteventtracker;
        appEventTracker = appeventtracker;
        logEventTracker = logeventtracker;
        leanplumTracker = leanplumtracker;
        realTimeEventTracker = realtimeeventtracker;
        lyftPreferences = ilyftpreferences;
        analyticsApi = analyticsapi;
        setupCrashlyticsDeviceInfo();
    }

    private void setupCrashlyticsDeviceInfo()
    {
        Crashlytics.a("device_email", device.getGoogleAccountEmail());
        Crashlytics.a("device_phone", device.getPhoneNumber());
    }

    private void trackInstallIfNeeded()
    {
        if (lyftPreferences.getInstallStatus() == 1)
        {
            AppAnalytics.trackAppInstall(device.getApplicationInstallTimestamp(), lyftPreferences.getInstallReferrer());
        }
    }

    private void updateCrashlyticsUser(User user)
    {
        Crashlytics.b(user.getId());
        Crashlytics.c(user.getFullName());
        Crashlytics.d(user.getEmail());
        Crashlytics.a("user_id", user.getId());
        Crashlytics.a("user_mode", user.getMode().name().toLowerCase());
        if (user.hasValidEmail())
        {
            Crashlytics.a("device_email", user.getEmail());
        }
        if (user.hasValidPhoneNumber())
        {
            Crashlytics.a("device_phone", user.getPhone().getNumber());
        }
        Crashlytics.a("facebook_id", user.getFacebookUid());
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        super.onActivityCreated(activity, bundle);
        Preconditions.checkState(initialized, "Initialize before calling onActivityCreated");
        appTrackerSubscription = appEventTracker.observerMobileAppTrackerInit().subscribe(onAppTrackerUpdated);
        appEventTracker.onCreate();
    }

    public void onActivityPaused(Activity activity)
    {
        userSubscription.unsubscribe();
        super.onActivityPaused(activity);
    }

    public void onActivityResumed(Activity activity)
    {
        super.onActivityResumed(activity);
        Preconditions.checkState(initialized, "Initialize before calling onActivityResumed");
        userSubscription = userProvider.observeUserUpdates().subscribe(onUserUpdate);
        appEventTracker.onResume(activity);
    }

    public void onApplicationCreate()
    {
        boolean flag;
        if (!initialized)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "You can only call onApplicationCreate once");
        Analytics.add(googleTracker);
        Analytics.add(redshiftTracker);
        Analytics.add(appEventTracker);
        Analytics.add(leanplumTracker);
        Analytics.add(realTimeEventTracker);
        initialized = true;
    }

    public void setAnalyticsUrl(String s)
    {
        lyftPreferences.setAnalyticsUrl(s);
        analyticsApi.setEndpointHost(s);
    }





}
