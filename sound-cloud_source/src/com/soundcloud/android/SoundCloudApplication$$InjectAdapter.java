// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import com.facebook.s;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.ads.AdIdHelper;
import com.soundcloud.android.ads.AdsController;
import com.soundcloud.android.analytics.AnalyticsEngine;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.api.legacy.model.ScModelManager;
import com.soundcloud.android.cast.CastSessionController;
import com.soundcloud.android.configuration.ConfigurationFeatureController;
import com.soundcloud.android.configuration.ConfigurationManager;
import com.soundcloud.android.crypto.CryptoOperations;
import com.soundcloud.android.crypto.EncryptionTester;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.peripherals.PeripheralsController;
import com.soundcloud.android.playback.PlayPublisher;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.android.playback.skippy.SkippyFactory;
import com.soundcloud.android.playback.widget.PlayerWidgetController;
import com.soundcloud.android.policies.DailyUpdateScheduler;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.search.PlaylistTagStorage;
import com.soundcloud.android.startup.migrations.MigrationEngine;
import com.soundcloud.android.stations.StationsController;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android:
//            SoundCloudApplication

public final class troller extends b
    implements a, Provider
{

    private b accountOperations;
    private b adIdHelper;
    private b adsController;
    private b analyticsEngine;
    private b castSessionController;
    private b configurationFeatureController;
    private b configurationManager;
    private b cryptoOperations;
    private b dailyUpdateScheduler;
    private b encryptionTester;
    private b eventBus;
    private b facebookSdk;
    private b featureFlags;
    private b imageOperations;
    private b migrationEngine;
    private b modelManager;
    private b peripheralsController;
    private b playPublisher;
    private b playSessionController;
    private b playSessionStateProvider;
    private b playlistTagStorage;
    private b screenProvider;
    private b skippyFactory;
    private b stationsController;
    private b widgetController;

    public final void attach(l l1)
    {
        migrationEngine = l1.a("com.soundcloud.android.startup.migrations.MigrationEngine", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        modelManager = l1.a("com.soundcloud.android.api.legacy.model.ScModelManager", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        configurationManager = l1.a("com.soundcloud.android.configuration.ConfigurationManager", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        widgetController = l1.a("com.soundcloud.android.playback.widget.PlayerWidgetController", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        peripheralsController = l1.a("com.soundcloud.android.peripherals.PeripheralsController", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        playSessionController = l1.a("com.soundcloud.android.playback.PlaySessionController", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        playSessionStateProvider = l1.a("com.soundcloud.android.playback.PlaySessionStateProvider", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        playPublisher = l1.a("com.soundcloud.android.playback.PlayPublisher", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        adsController = l1.a("com.soundcloud.android.ads.AdsController", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        playlistTagStorage = l1.a("com.soundcloud.android.search.PlaylistTagStorage", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        skippyFactory = l1.a("com.soundcloud.android.playback.skippy.SkippyFactory", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        cryptoOperations = l1.a("com.soundcloud.android.crypto.CryptoOperations", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        configurationFeatureController = l1.a("com.soundcloud.android.configuration.ConfigurationFeatureController", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        screenProvider = l1.a("com.soundcloud.android.analytics.ScreenProvider", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        adIdHelper = l1.a("com.soundcloud.android.ads.AdIdHelper", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        castSessionController = l1.a("com.soundcloud.android.cast.CastSessionController", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        stationsController = l1.a("com.soundcloud.android.stations.StationsController", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        facebookSdk = l1.a("com.facebook.FacebookSdk", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        dailyUpdateScheduler = l1.a("com.soundcloud.android.policies.DailyUpdateScheduler", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        encryptionTester = l1.a("com.soundcloud.android.crypto.EncryptionTester", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
        analyticsEngine = l1.a("com.soundcloud.android.analytics.AnalyticsEngine", com/soundcloud/android/SoundCloudApplication, getClass().getClassLoader());
    }

    public final SoundCloudApplication get()
    {
        SoundCloudApplication soundcloudapplication = new SoundCloudApplication();
        injectMembers(soundcloudapplication);
        return soundcloudapplication;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(migrationEngine);
        set1.add(eventBus);
        set1.add(modelManager);
        set1.add(imageOperations);
        set1.add(accountOperations);
        set1.add(configurationManager);
        set1.add(widgetController);
        set1.add(peripheralsController);
        set1.add(playSessionController);
        set1.add(playSessionStateProvider);
        set1.add(playPublisher);
        set1.add(adsController);
        set1.add(playlistTagStorage);
        set1.add(skippyFactory);
        set1.add(featureFlags);
        set1.add(cryptoOperations);
        set1.add(configurationFeatureController);
        set1.add(screenProvider);
        set1.add(adIdHelper);
        set1.add(castSessionController);
        set1.add(stationsController);
        set1.add(facebookSdk);
        set1.add(dailyUpdateScheduler);
        set1.add(encryptionTester);
        set1.add(analyticsEngine);
    }

    public final void injectMembers(SoundCloudApplication soundcloudapplication)
    {
        soundcloudapplication.migrationEngine = (MigrationEngine)migrationEngine.get();
        soundcloudapplication.eventBus = (EventBus)eventBus.get();
        soundcloudapplication.modelManager = (ScModelManager)modelManager.get();
        soundcloudapplication.imageOperations = (ImageOperations)imageOperations.get();
        soundcloudapplication.accountOperations = (AccountOperations)accountOperations.get();
        soundcloudapplication.configurationManager = (ConfigurationManager)configurationManager.get();
        soundcloudapplication.widgetController = (PlayerWidgetController)widgetController.get();
        soundcloudapplication.peripheralsController = (PeripheralsController)peripheralsController.get();
        soundcloudapplication.playSessionController = (PlaySessionController)playSessionController.get();
        soundcloudapplication.playSessionStateProvider = (PlaySessionStateProvider)playSessionStateProvider.get();
        soundcloudapplication.playPublisher = (PlayPublisher)playPublisher.get();
        soundcloudapplication.adsController = (AdsController)adsController.get();
        soundcloudapplication.playlistTagStorage = (PlaylistTagStorage)playlistTagStorage.get();
        soundcloudapplication.skippyFactory = (SkippyFactory)skippyFactory.get();
        soundcloudapplication.featureFlags = (FeatureFlags)featureFlags.get();
        soundcloudapplication.cryptoOperations = (CryptoOperations)cryptoOperations.get();
        soundcloudapplication.configurationFeatureController = (ConfigurationFeatureController)configurationFeatureController.get();
        soundcloudapplication.screenProvider = (ScreenProvider)screenProvider.get();
        soundcloudapplication.adIdHelper = (AdIdHelper)adIdHelper.get();
        soundcloudapplication.castSessionController = (CastSessionController)castSessionController.get();
        soundcloudapplication.stationsController = (StationsController)stationsController.get();
        soundcloudapplication.facebookSdk = (s)facebookSdk.get();
        soundcloudapplication.dailyUpdateScheduler = (DailyUpdateScheduler)dailyUpdateScheduler.get();
        soundcloudapplication.encryptionTester = (EncryptionTester)encryptionTester.get();
        soundcloudapplication.analyticsEngine = (AnalyticsEngine)analyticsEngine.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SoundCloudApplication)obj);
    }

    public troller()
    {
        super("com.soundcloud.android.SoundCloudApplication", "members/com.soundcloud.android.SoundCloudApplication", false, com/soundcloud/android/SoundCloudApplication);
    }
}
