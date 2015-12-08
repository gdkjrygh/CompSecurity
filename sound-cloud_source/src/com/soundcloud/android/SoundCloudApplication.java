// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.support.multidex.MultiDexApplication;
import b.a.a.a.d;
import b.a.a.a.l;
import com.a.a.a;
import com.facebook.s;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.ads.AdIdHelper;
import com.soundcloud.android.ads.AdsController;
import com.soundcloud.android.analytics.AnalyticsEngine;
import com.soundcloud.android.analytics.AnalyticsModule;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.ScModelManager;
import com.soundcloud.android.api.oauth.Token;
import com.soundcloud.android.cast.CastSessionController;
import com.soundcloud.android.configuration.ConfigurationFeatureController;
import com.soundcloud.android.configuration.ConfigurationManager;
import com.soundcloud.android.crypto.CryptoOperations;
import com.soundcloud.android.crypto.EncryptionTester;
import com.soundcloud.android.gcm.GcmModule;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.main.LegacyModule;
import com.soundcloud.android.onboarding.auth.SignupVia;
import com.soundcloud.android.peripherals.PeripheralsController;
import com.soundcloud.android.playback.PlayPublisher;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.android.playback.PlaybackServiceModule;
import com.soundcloud.android.playback.skippy.SkippyFactory;
import com.soundcloud.android.playback.widget.PlayerWidgetController;
import com.soundcloud.android.playback.widget.WidgetModule;
import com.soundcloud.android.policies.DailyUpdateScheduler;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.search.PlaylistTagStorage;
import com.soundcloud.android.skippy.Skippy;
import com.soundcloud.android.startup.migrations.MigrationEngine;
import com.soundcloud.android.stations.StationsController;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.storage.provider.ScContentProvider;
import com.soundcloud.android.sync.ApiSyncService;
import com.soundcloud.android.sync.SyncModule;
import com.soundcloud.android.utils.AndroidUtils;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.f;
import dagger.b;

// Referenced classes of package com.soundcloud.android:
//            UncaughtExceptionHandlerController, ApplicationModule, FeaturesModule

public class SoundCloudApplication extends MultiDexApplication
{

    public static final String TAG = com/soundcloud/android/SoundCloudApplication.getSimpleName();
    public static SoundCloudApplication instance;
    public static ScModelManager sModelManager;
    AccountOperations accountOperations;
    AdIdHelper adIdHelper;
    AdsController adsController;
    AnalyticsEngine analyticsEngine;
    private ApplicationProperties applicationProperties;
    CastSessionController castSessionController;
    ConfigurationFeatureController configurationFeatureController;
    ConfigurationManager configurationManager;
    CryptoOperations cryptoOperations;
    DailyUpdateScheduler dailyUpdateScheduler;
    EncryptionTester encryptionTester;
    EventBus eventBus;
    s facebookSdk;
    FeatureFlags featureFlags;
    ImageOperations imageOperations;
    MigrationEngine migrationEngine;
    ScModelManager modelManager;
    protected b objectGraph;
    PeripheralsController peripheralsController;
    PlayPublisher playPublisher;
    PlaySessionController playSessionController;
    PlaySessionStateProvider playSessionStateProvider;
    PlaylistTagStorage playlistTagStorage;
    ScreenProvider screenProvider;
    private SharedPreferences sharedPreferences;
    SkippyFactory skippyFactory;
    StationsController stationsController;
    private UncaughtExceptionHandlerController uncaughtExceptionHandlerController;
    PlayerWidgetController widgetController;

    public SoundCloudApplication()
    {
    }

    public static SoundCloudApplication fromContext(Context context)
    {
        if (context.getApplicationContext() instanceof SoundCloudApplication)
        {
            return (SoundCloudApplication)context.getApplicationContext();
        } else
        {
            throw new RuntimeException("can't obtain app from context");
        }
    }

    private void generateDeviceKey()
    {
        cryptoOperations.generateAndStoreDeviceKeyIfNeeded();
        encryptionTester.runEncryptionTest();
    }

    public static b getObjectGraph()
    {
        if (instance == null || instance.objectGraph == null)
        {
            throw new IllegalStateException("Cannot access the app graph before the application has been created");
        } else
        {
            return instance.objectGraph;
        }
    }

    private void initializePreInjectionObjects()
    {
        applicationProperties = new ApplicationProperties(getResources());
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        uncaughtExceptionHandlerController = new UncaughtExceptionHandlerController(this, isReportingCrashes());
    }

    private boolean isReportingCrashes()
    {
        return applicationProperties.shouldReportCrashes() && sharedPreferences.getBoolean("acra.enable", true);
    }

    private void requestSetsSync()
    {
        startService((new Intent(this, com/soundcloud/android/sync/ApiSyncService)).putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true).setData(Content.ME_PLAYLISTS.uri));
    }

    private void setUpCrashReportingIfNeeded()
    {
        if (isReportingCrashes())
        {
            d.a(this, new l[] {
                new a()
            });
        }
        uncaughtExceptionHandlerController.setHandler();
    }

    private void setupCurrentUserAccount()
    {
        android.accounts.Account account = accountOperations.getSoundCloudAccount();
        if (account != null)
        {
            if (ContentResolver.getIsSyncable(account, "com.soundcloud.android.provider.ScContentProvider") <= 0)
            {
                ScContentProvider.enableSyncing(account, 3600L);
            }
            AndroidUtils.doOnce(this, "reset.c2dm.reg_id", new _cls1());
            AndroidUtils.doOnce(this, "delete.old.cache.dir", new _cls2());
            AndroidUtils.doOnce(this, "request.sets.sync", new _cls3());
        }
    }

    private static void setupStrictMode()
    {
        StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).detectAll().penaltyLog().build());
        StrictMode.setVmPolicy((new android.os.StrictMode.VmPolicy.Builder()).detectAll().penaltyLog().build());
    }

    public boolean addUserAccountAndEnableSync(PublicApiUser publicapiuser, Token token, SignupVia signupvia)
    {
        publicapiuser = accountOperations.addOrReplaceSoundCloudAccount(publicapiuser, token, signupvia);
        if (publicapiuser != null)
        {
            ScContentProvider.enableSyncing(publicapiuser, 3600L);
            requestSetsSync();
            return true;
        } else
        {
            return false;
        }
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        context = new ApplicationModule(this);
        AnalyticsModule analyticsmodule = new AnalyticsModule();
        WidgetModule widgetmodule = new WidgetModule();
        LegacyModule legacymodule = new LegacyModule();
        FeaturesModule featuresmodule = new FeaturesModule();
        SyncModule syncmodule = new SyncModule();
        PlaybackServiceModule playbackservicemodule = new PlaybackServiceModule();
        GcmModule gcmmodule = new GcmModule();
        objectGraph = dagger.b.a.a(new f(), new Object[] {
            context, analyticsmodule, widgetmodule, legacymodule, featuresmodule, syncmodule, playbackservicemodule, gcmmodule
        });
    }

    public AccountOperations getAccountOperations()
    {
        return accountOperations;
    }

    public EventBus getEventBus()
    {
        return eventBus;
    }

    public ImageOperations getImageOperations()
    {
        return imageOperations;
    }

    public void onCreate()
    {
        super.onCreate();
        instance = this;
        initializePreInjectionObjects();
        setUpCrashReportingIfNeeded();
        objectGraph.a(this);
        sModelManager = modelManager;
        migrationEngine.migrate();
        (new StringBuilder("Application starting up in mode ")).append(applicationProperties.getBuildType());
        applicationProperties.toString();
        if (applicationProperties.isDevBuildRunningOnDevice() && !ActivityManager.isUserAMonkey())
        {
            setupStrictMode();
            DeviceHelper.getBuildInfo();
        }
        adIdHelper.init();
        uncaughtExceptionHandlerController.reportSystemMemoryStats();
        IOUtils.createCacheDirs();
        analyticsEngine.onAppCreated(this);
        skippyFactory.create().preload(this);
        imageOperations.initialise(this, applicationProperties);
        accountOperations.loadLoggedInUser();
        configurationManager.update();
        setupCurrentUserAccount();
        generateDeviceKey();
        widgetController.subscribe();
        peripheralsController.subscribe();
        playSessionController.subscribe();
        playSessionStateProvider.subscribe();
        adsController.subscribe();
        screenProvider.subscribe();
        castSessionController.startListening();
        if (featureFlags.isEnabled(Flag.FEATURE_PUBLISH_PLAY_EVENTS_TO_TPUB))
        {
            playPublisher.subscribe();
        }
        if (featureFlags.isEnabled(Flag.STATIONS_SOFT_LAUNCH))
        {
            stationsController.subscribe();
        }
        if (featureFlags.isEnabled(Flag.DAILY_POLICY_UPDATES))
        {
            dailyUpdateScheduler.schedule();
        }
        configurationFeatureController.subscribe();
        s.a(getApplicationContext());
        uncaughtExceptionHandlerController.assertHandlerIsSet();
    }

    public void onLowMemory()
    {
        onTrimMemory(80);
        super.onLowMemory();
    }

    public void onTrimMemory(int i)
    {
        uncaughtExceptionHandlerController.reportMemoryTrim(i);
        super.onTrimMemory(i);
    }

    public void setAccountOperations(AccountOperations accountoperations)
    {
        accountOperations = accountoperations;
    }




    private class _cls1
        implements Runnable
    {

        final SoundCloudApplication this$0;

        public void run()
        {
            sharedPreferences.edit().remove("c2dm.device_url").apply();
        }

        _cls1()
        {
            this$0 = SoundCloudApplication.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final SoundCloudApplication this$0;

        public void run()
        {
            IOUtils.deleteDir(Consts.OLD_EXTERNAL_CACHE_DIRECTORY);
        }

        _cls2()
        {
            this$0 = SoundCloudApplication.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final SoundCloudApplication this$0;

        public void run()
        {
            requestSetsSync();
        }

        _cls3()
        {
            this$0 = SoundCloudApplication.this;
            super();
        }
    }

}
