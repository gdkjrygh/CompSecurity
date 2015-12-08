// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.multidex.MultiDex;
import com.adobe.mediacore.PSDKConfig;
import com.comscore.analytics.comScore;
import com.conviva.LivePass;
import com.crashlytics.android.Crashlytics;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.ApplicationModule;
import com.nbcsports.liveextra.DaggerApplicationComponent;
import com.nbcsports.liveextra.airship.AirshipLifecycleCallbacks;
import com.nbcsports.liveextra.analytics.AnalyticLifecycleCallbacks;
import com.nbcsports.liveextra.core.CustomRxExecutionHook;
import com.nbcsports.liveextra.core.CustomRxJavaErrorHandler;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.configuration.ConfigurationProvider;
import com.nbcsports.liveextra.library.configuration.RuntimeConfiguration;
import com.nbcsports.liveextra.library.core.CrashReportingTree;
import com.nbcsports.liveextra.urbanairship.AirTrafficController;
import com.orm.SugarApp;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.phunware.nbc.sochi.services.FavoriteReminderService;
import com.phunware.nbc.sochi.services.GeoTrackingService;
import com.phunware.nbc.sochi.system.NBCSystem;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import net.danlew.android.joda.JodaTimeAndroid;
import rx.plugins.RxJavaPlugins;
import timber.log.Timber;

public class NBCSportsApplication extends SugarApp
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private static final String CONFIGURATION = "CONFIGURATION";
    public static final String HAS_CRASHED = "HAS_CRASHED";
    private static ApplicationComponent component;
    AirTrafficController airTrafficController;
    Runnable cancelSubscription;
    RuntimeConfiguration config;
    ConfigurationProvider configurationSubscriber;
    private Handler handler;
    SharedPreferences preferences;
    CustomRxJavaErrorHandler rxErrorHandler;
    CustomRxExecutionHook rxExecutionHook;
    TrackingHelper trackingHelper;

    public NBCSportsApplication()
    {
        handler = new Handler();
        cancelSubscription = new Runnable() {

            final NBCSportsApplication this$0;

            public void run()
            {
                config.onPause();
            }

            
            {
                this$0 = NBCSportsApplication.this;
                super();
            }
        };
    }

    public static ApplicationComponent component()
    {
        return component;
    }

    private void configureCrashSink()
    {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

            final NBCSportsApplication this$0;
            final Thread.UncaughtExceptionHandler val$defaultUEH;

            public void uncaughtException(Thread thread, Throwable throwable)
            {
                preferences.edit().putBoolean("HAS_CRASHED", true).commit();
                Timber.e(throwable, "UEH", new Object[0]);
                defaultUEH.uncaughtException(thread, throwable);
            }

            
            {
                this$0 = NBCSportsApplication.this;
                defaultUEH = uncaughtexceptionhandler;
                super();
            }
        });
        RxJavaPlugins.getInstance().registerErrorHandler(rxErrorHandler);
        try
        {
            RxJavaPlugins.getInstance().registerObservableExecutionHook(rxExecutionHook);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            return;
        }
    }

    private void inject()
    {
        if (component == null)
        {
            component = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
        }
        component.inject(this);
    }

    private void setStrictMode()
    {
    }

    private void startComscore()
    {
        comScore.setAppContext(this);
        comScore.setCustomerC2("6035083");
        comScore.setPublisherSecret("5f94da45f8b0635bdfd6c1ccd9df1227");
    }

    private void startConviva()
    {
        try
        {
            LivePass.init("efcad85fded269f462c434c4c5f84654a17d4a77", this);
            return;
        }
        catch (Exception exception)
        {
            Timber.w("Error initializing Conviva", new Object[0]);
        }
    }

    private void startLogging()
    {
        Fabric.with(this, new Kit[] {
            new Crashlytics()
        });
        Timber.plant(new CrashReportingTree(this));
        Timber.i("Started application", new Object[0]);
    }

    private void startServices()
    {
        startComscore();
        startConviva();
        airTrafficController.takeOff();
        (new Thread(new Runnable() {

            final NBCSportsApplication this$0;

            public void run()
            {
                JodaTimeAndroid.init(NBCSportsApplication.this);
            }

            
            {
                this$0 = NBCSportsApplication.this;
                super();
            }
        })).start();
        startService(new Intent(this, com/phunware/nbc/sochi/services/FavoriteReminderService));
        startService(new Intent(this, com/phunware/nbc/sochi/services/GeoTrackingService));
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        if (bundle != null)
        {
            if ((activity = (Configuration)bundle.getParcelable("CONFIGURATION")) != null && activity.isLoaded())
            {
                configurationSubscriber.update(activity);
                return;
            }
        }
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
        handler.postDelayed(cancelSubscription, 5000L);
    }

    public void onActivityResumed(Activity activity)
    {
        handler.removeCallbacks(cancelSubscription);
        config.onResume();
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        bundle.putParcelable("CONFIGURATION", config.get());
    }

    public void onActivityStarted(Activity activity)
    {
    }

    public void onActivityStopped(Activity activity)
    {
    }

    public void onCreate()
    {
        super.onCreate();
        setStrictMode();
        startLogging();
        inject();
        configureCrashSink();
        startServices();
        PSDKConfig.setSubscribedTags(new String[] {
            "#EXT-X-PROGRAM-DATE-TIME"
        });
        registerActivityLifecycleCallbacks(this);
        NBCSystem.init(getApplicationContext());
        NBCSystem.IS_TAB = getResources().getBoolean(0x7f0b0004);
        NBCSystem.IS_LANDSCAPE = getResources().getBoolean(0x7f0b0003);
        (new Thread(new Runnable() {

            final NBCSportsApplication this$0;

            public void run()
            {
                JodaTimeAndroid.init(NBCSportsApplication.this);
            }

            
            {
                this$0 = NBCSportsApplication.this;
                super();
            }
        })).start();
        registerActivityLifecycleCallbacks(this);
        registerActivityLifecycleCallbacks(new AirshipLifecycleCallbacks());
        registerActivityLifecycleCallbacks(new AnalyticLifecycleCallbacks());
    }

    public void setComponent(ApplicationComponent applicationcomponent)
    {
        component = applicationcomponent;
    }
}
