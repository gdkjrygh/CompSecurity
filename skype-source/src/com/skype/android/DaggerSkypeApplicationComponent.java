// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.DownloadManager;
import android.app.NotificationManager;
import android.app.UiModeManager;
import android.app.admin.DevicePolicyManager;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.nfc.NfcManager;
import android.os.PowerManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.Translator;
import com.skype.android.ads.AdManager;
import com.skype.android.ads.AdPlacer;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsInAppObserver;
import com.skype.android.analytics.AnalyticsInAppObserver_Factory;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.analytics.Analytics_Factory;
import com.skype.android.analytics.SessionReporter;
import com.skype.android.analytics.SessionReporter_Factory;
import com.skype.android.analytics.SessionReporter_MembersInjector;
import com.skype.android.app.BackgroundMode;
import com.skype.android.app.BackgroundMode_Factory;
import com.skype.android.app.BackgroundNavigation_Factory;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.NavigationUrl_Factory;
import com.skype.android.app.WakeupSchedulerAgent_Factory;
import com.skype.android.app.WakeupSchedulerAgent_MembersInjector;
import com.skype.android.app.access.AccessAgent_Factory;
import com.skype.android.app.access.AccessAgent_MembersInjector;
import com.skype.android.app.ads.AdManagerInitializer_Factory;
import com.skype.android.app.app2app.App2AppManager_Factory;
import com.skype.android.app.calling.CallAgent;
import com.skype.android.app.calling.CallAgent_Factory;
import com.skype.android.app.calling.CallAgent_MembersInjector;
import com.skype.android.app.calling.CallQualityFeedbackManager;
import com.skype.android.app.calling.CallQualityFeedbackManager_Factory;
import com.skype.android.app.calling.OngoingNotificationsManager;
import com.skype.android.app.calling.OngoingNotificationsManager_Factory;
import com.skype.android.app.chat.AnnotationUtil_Factory;
import com.skype.android.app.chat.ChatServiceMonitor;
import com.skype.android.app.chat.ChatServiceMonitor_Factory;
import com.skype.android.app.chat.HandheldMessageNotification_Factory;
import com.skype.android.app.chat.MessageAgent_Factory;
import com.skype.android.app.chat.MessageAgent_MembersInjector;
import com.skype.android.app.chat.MessageHolderUtil_Factory;
import com.skype.android.app.chat.NotificationRouter;
import com.skype.android.app.chat.NotificationRouter_Factory;
import com.skype.android.app.chat.picker.MRUManager;
import com.skype.android.app.chat.picker.MRUManager_Factory;
import com.skype.android.app.contacts.ContactAgent_Factory;
import com.skype.android.app.contacts.ContactAgent_MembersInjector;
import com.skype.android.app.media.MediaDocumentDownloadUtil_Factory;
import com.skype.android.app.media.MediaDocumentUploadUtil_Factory;
import com.skype.android.app.media.MediaMessageAgent_Factory;
import com.skype.android.app.media.MediaMessageAgent_MembersInjector;
import com.skype.android.app.media.MediaSaveToGalleryAgent_Factory;
import com.skype.android.app.media.MediaSaveToGalleryAgent_MembersInjector;
import com.skype.android.app.media.UrlPreviewMediaAgent;
import com.skype.android.app.media.UrlPreviewMediaAgent_Factory;
import com.skype.android.app.mnv.MnvAnalytics_Factory;
import com.skype.android.app.mnv.MnvCases_Factory;
import com.skype.android.app.mnv.MnvManager;
import com.skype.android.app.mnv.MnvManagerEvents_Factory;
import com.skype.android.app.mnv.MnvManager_Factory;
import com.skype.android.app.mnv.MnvPostRequest_Factory;
import com.skype.android.app.mnv.MnvUtil_Factory;
import com.skype.android.app.mnv.ProfileServicesClient_Factory;
import com.skype.android.app.mnv.ProfileServicesResponse_Factory;
import com.skype.android.app.settings.SkypePreferenceListener_Factory;
import com.skype.android.app.settings.UserPreferences_Factory;
import com.skype.android.app.settings.UserPreferences_MembersInjector;
import com.skype.android.app.shortcircuit.AutoBuddyManager_Factory;
import com.skype.android.app.shortcircuit.ProfileServiceTokenRequest_Factory;
import com.skype.android.app.shortcircuit.PromotedSCDContactsManager;
import com.skype.android.app.shortcircuit.PromotedSCDContactsManager_Factory;
import com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient;
import com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient_Factory;
import com.skype.android.app.signin.AccountAgent_Factory;
import com.skype.android.app.signin.AccountAgent_MembersInjector;
import com.skype.android.app.signin.tasks.AccountTaskComposition_Factory;
import com.skype.android.app.signin.tasks.ConfigUpdate_Factory;
import com.skype.android.app.signin.tasks.CrashReporterContact_Factory;
import com.skype.android.app.signin.tasks.CreateDeviceAccount_Factory;
import com.skype.android.app.signin.tasks.ExternalCacheCleanup_Factory;
import com.skype.android.app.signin.tasks.MigratePreferences_Factory;
import com.skype.android.app.signin.tasks.PushServiceRegister_Factory;
import com.skype.android.app.signin.tasks.ReportAccountStats_Factory;
import com.skype.android.app.token.MsaTokenRequest_Factory;
import com.skype.android.app.token.SkypeTokenAccess;
import com.skype.android.app.token.SkypeTokenRequest_Factory;
import com.skype.android.app.transfer.TransferAgent_Factory;
import com.skype.android.app.transfer.TransferAgent_MembersInjector;
import com.skype.android.app.transfer.TransferQueue;
import com.skype.android.app.transfer.TransferQueue_Factory;
import com.skype.android.app.transfer.TransferUtil_Factory;
import com.skype.android.app.wear.WearDataRequestCache;
import com.skype.android.app.wear.WearDataRequestCache_Factory;
import com.skype.android.app.wearable.WearMessageNotificationRenderer_Factory;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.ConfigUpdater_Factory;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.config.ecs.EcsConfiguration_Factory;
import com.skype.android.config.web.WebConfigUpdater_Factory;
import com.skype.android.crash.CrashReporter;
import com.skype.android.crash.DumpUploader_Factory;
import com.skype.android.event.EventBus;
import com.skype.android.inject.AccountProvider;
import com.skype.android.inject.AccountProvider_Factory;
import com.skype.android.inject.ApplicationModule;
import com.skype.android.inject.ApplicationModule_AccessibilityManagerFactory;
import com.skype.android.inject.ApplicationModule_AccountManagerFactory;
import com.skype.android.inject.ApplicationModule_ActivityManagerFactory;
import com.skype.android.inject.ApplicationModule_AlarmManagerFactory;
import com.skype.android.inject.ApplicationModule_ApplicationFactory;
import com.skype.android.inject.ApplicationModule_AssetManagerFactory;
import com.skype.android.inject.ApplicationModule_AudioManagerFactory;
import com.skype.android.inject.ApplicationModule_BluetoothManagerFactory;
import com.skype.android.inject.ApplicationModule_ConnectivityManagerFactory;
import com.skype.android.inject.ApplicationModule_ContentResolverFactory;
import com.skype.android.inject.ApplicationModule_ContextFactory;
import com.skype.android.inject.ApplicationModule_DevicePolicyManagerFactory;
import com.skype.android.inject.ApplicationModule_DisplayManagerFactory;
import com.skype.android.inject.ApplicationModule_DownloadManagerFactory;
import com.skype.android.inject.ApplicationModule_InputManagerFactory;
import com.skype.android.inject.ApplicationModule_InputMethodManagerFactory;
import com.skype.android.inject.ApplicationModule_LocationManagerFactory;
import com.skype.android.inject.ApplicationModule_NfcManagerFactory;
import com.skype.android.inject.ApplicationModule_NotificationManagerFactory;
import com.skype.android.inject.ApplicationModule_PackageManagerFactory;
import com.skype.android.inject.ApplicationModule_PowerManagerFactory;
import com.skype.android.inject.ApplicationModule_ResourcesFactory;
import com.skype.android.inject.ApplicationModule_SensorManagerFactory;
import com.skype.android.inject.ApplicationModule_StorageManagerFactory;
import com.skype.android.inject.ApplicationModule_TelephonyManagerFactory;
import com.skype.android.inject.ApplicationModule_UiModeManagerFactory;
import com.skype.android.inject.ApplicationModule_UsbManagerFactory;
import com.skype.android.inject.ApplicationModule_VibratorFactory;
import com.skype.android.inject.ApplicationModule_WifiManagerFactory;
import com.skype.android.inject.ApplicationModule_WindowManagerFactory;
import com.skype.android.inject.LoginManager_Factory;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.MediaContentRoster_Factory;
import com.skype.android.push.CallPushMessageListener_Factory;
import com.skype.android.push.ConciergePushMessageListener_Factory;
import com.skype.android.push.PushHandlingHelper;
import com.skype.android.push.PushHandlingHelper_Factory;
import com.skype.android.push.PushManager;
import com.skype.android.push.PushManagerProvider_Factory;
import com.skype.android.push.PushMessageRepository;
import com.skype.android.push.PushMessageRepository_Factory;
import com.skype.android.push.PushToMobileMessageListener_Factory;
import com.skype.android.push.SkypePushListener;
import com.skype.android.push.SkypePushListener_Factory;
import com.skype.android.res.ChatText;
import com.skype.android.res.ChatText_Factory;
import com.skype.android.res.CountryFlags;
import com.skype.android.res.CountryFlags_Factory;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.res.DefaultAvatars_Factory;
import com.skype.android.res.Sounds;
import com.skype.android.res.Sounds_Factory;
import com.skype.android.res.Urls;
import com.skype.android.res.Urls_Factory;
import com.skype.android.res.Vibration;
import com.skype.android.res.Vibration_Factory;
import com.skype.android.res.Vibration_MembersInjector;
import com.skype.android.ringtone.RingtoneStorage;
import com.skype.android.service.ContactsScrapeAgent_Factory;
import com.skype.android.service.ContactsScrapeAgent_MembersInjector;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.skylib.PcmHostCallback;
import com.skype.android.skylib.SkyLibInitializer;
import com.skype.android.sync.ContactIngestionTokenRequest_Factory;
import com.skype.android.sync.ContactsIngestManager;
import com.skype.android.sync.ContactsIngestManager_Factory;
import com.skype.android.sync.ContactsObserver_Factory;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.telemetry.TelemetryHelper_Factory;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.text.TypeFaceTextStyleCallback;
import com.skype.android.update.UpdateManager;
import com.skype.android.util.ContactUtil_Factory;
import com.skype.android.util.ConversationParticipantsUtil_Factory;
import com.skype.android.util.ConversationUtil_Factory;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ImageCache_Factory;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.NetworkUtil_Factory;
import com.skype.android.util.ServerClock;
import com.skype.android.util.ServerClock_Factory;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.SignInDurationReporter_Factory;
import com.skype.android.util.SpanUtil;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil_Factory;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.ViewStateManager_Factory;
import com.skype.android.util.accessibility.AccessibilityUtil_Factory;
import com.skype.android.util.cache.ContactMoodCache;
import com.skype.android.util.cache.ContactMoodCache_Factory;
import com.skype.android.util.cache.FormattedMessageCache;
import com.skype.android.util.cache.FormattedMessageCache_Factory;
import com.skype.android.util.cache.SpannedStringCache;
import com.skype.android.util.cache.SpannedStringCache_Factory;
import com.skype.android.util.permission.PermissionRequestStorage;
import com.skype.android.util.permission.PermissionRequestStorage_Factory;
import com.skype.android.wakeup.DreamKeeper;
import com.skype.android.wakeup.DreamKeeper_Factory;
import com.skype.android.wakeup.ForegroundObserver_Factory;
import com.skype.android.wakeup.ForegroundState;
import com.skype.android.wakeup.ForegroundState_Factory;
import com.skype.pcmhost.PcmHost;
import com.skype.telemetry.TelemetryProviderFactory;
import com.skype.telemetry.sdk.FlurryAccessInterface;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.c;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeApplicationComponent, SkypeModule_GetAnalyticsPersistentStorageFactory, SkypeModule_SkyLibFactory, SkypeModule_ObjectIdMapFactory, 
//            SkypeModule_AsyncServiceFactory, SkypeModule_HttpUtilFactory, SkypeModule_EcsClientFactory, SkypeModule_FlurryFactory, 
//            SkypeModule_TelemetryProviderFactoryFactory, SkypeModule_EventBusFactory, SkypeModule_AccountProviderFactory, SkypeModule_SctManagerFactory, 
//            SkypeModule_TimeAnomalyTelemetryFactory, SkypeModule_SpanUtilFactory, SkypeModule_LayoutExperienceFactory, SkypeModule_PushManagerFactory, 
//            SkypeModule_AdManagerFactory, SkypeModule_ApplicationConfigFactory, SkypeModule_SkypeTokenAccessFactory, SkypeModule_ContactsIngestTaskFactory, 
//            SkypeModule_CrashReporterFactory, SkypeModule_SkyLibInitializerFactory, SkypeModule_PcmHostFactory, SkypeModule_PcmHostCallbackFactory, 
//            SkypeModule_GetTranslatorFactory, SkypeApplication_MembersInjector, SkypeModule_UpdateManagerFactory, SkypeModule_TypeFaceFactoryFactory, 
//            SkypeModule_TypeFaceStyleCallbackFactory, SkypeModule_AdPlacerFactory, SkypeModule_GetRingtoneStorageFactory, SkypeApplication, 
//            SkypeModule

public final class DaggerSkypeApplicationComponent
    implements SkypeApplicationComponent
{
    public static final class Builder
    {

        private ApplicationModule a;
        private SkypeModule b;

        static ApplicationModule a(Builder builder1)
        {
            return builder1.a;
        }

        static SkypeModule b(Builder builder1)
        {
            return builder1.b;
        }

        public final Builder a(SkypeModule skypemodule)
        {
            b = skypemodule;
            return this;
        }

        public final Builder a(ApplicationModule applicationmodule)
        {
            a = applicationmodule;
            return this;
        }

        public final SkypeApplicationComponent a()
        {
            if (a == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/inject/ApplicationModule.getCanonicalName()).append(" must be set").toString());
            }
            if (b == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeModule.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerSkypeApplicationComponent(this);
            }
        }

        private Builder()
        {
        }

        Builder(byte byte0)
        {
            this();
        }
    }


    static final boolean $assertionsDisabled;
    private MembersInjector accessAgentMembersInjector;
    private Provider accessAgentProvider;
    private Provider accessibilityManagerProvider;
    private Provider accessibilityUtilProvider;
    private MembersInjector accountAgentMembersInjector;
    private Provider accountAgentProvider;
    private Provider accountManagerProvider;
    private Provider accountProvider;
    private Provider accountProvider1;
    private Provider accountTaskCompositionProvider;
    private Provider activityManagerProvider;
    private Provider adManagerInitializerProvider;
    private Provider adManagerProvider;
    private Provider adPlacerProvider;
    private Provider alarmManagerProvider;
    private Provider analyticsInAppObserverProvider;
    private Provider analyticsProvider;
    private Provider annotationUtilProvider;
    private Provider app2AppManagerProvider;
    private Provider applicationConfigProvider;
    private Provider applicationProvider;
    private Provider assetManagerProvider;
    private Provider asyncServiceProvider;
    private Provider audioManagerProvider;
    private Provider autoBuddyManagerProvider;
    private Provider backgroundModeProvider;
    private Provider backgroundNavigationProvider;
    private Provider bluetoothManagerProvider;
    private MembersInjector callAgentMembersInjector;
    private Provider callAgentProvider;
    private Provider callPushMessageListenerProvider;
    private Provider callQualityFeedbackManagerProvider;
    private Provider chatServiceMonitorProvider;
    private Provider chatTextProvider;
    private Provider conciergePushMessageListenerProvider;
    private Provider configUpdateProvider;
    private Provider configUpdaterProvider;
    private Provider connectivityManagerProvider;
    private MembersInjector contactAgentMembersInjector;
    private Provider contactAgentProvider;
    private Provider contactIngestionTokenRequestProvider;
    private Provider contactMoodCacheProvider;
    private Provider contactUtilProvider;
    private Provider contactsIngestManagerProvider;
    private Provider contactsIngestTaskProvider;
    private Provider contactsObserverProvider;
    private MembersInjector contactsScrapeAgentMembersInjector;
    private Provider contactsScrapeAgentProvider;
    private Provider contentResolverProvider;
    private Provider contextProvider;
    private Provider conversationParticipantsUtilProvider;
    private Provider conversationUtilProvider;
    private Provider countryFlagsProvider;
    private Provider crashReporterContactProvider;
    private Provider crashReporterProvider;
    private Provider createDeviceAccountProvider;
    private Provider defaultAvatarsProvider;
    private Provider devicePolicyManagerProvider;
    private Provider displayManagerProvider;
    private Provider downloadManagerProvider;
    private Provider dreamKeeperProvider;
    private Provider dumpUploaderProvider;
    private Provider ecsClientProvider;
    private Provider ecsConfigurationProvider;
    private Provider eventBusProvider;
    private Provider externalCacheCleanupProvider;
    private Provider flurryProvider;
    private Provider foregroundObserverProvider;
    private Provider foregroundStateProvider;
    private Provider formattedMessageCacheProvider;
    private Provider getAnalyticsPersistentStorageProvider;
    private Provider getRingtoneStorageProvider;
    private Provider getTranslatorProvider;
    private Provider handheldMessageNotificationProvider;
    private Provider httpUtilProvider;
    private Provider imageCacheProvider;
    private Provider inputManagerProvider;
    private Provider inputMethodManagerProvider;
    private Provider layoutExperienceProvider;
    private Provider locationManagerProvider;
    private Provider loginManagerProvider;
    private Provider mRUManagerProvider;
    private Provider mediaContentRosterProvider;
    private Provider mediaDocumentDownloadUtilProvider;
    private Provider mediaDocumentUploadUtilProvider;
    private MembersInjector mediaMessageAgentMembersInjector;
    private Provider mediaMessageAgentProvider;
    private MembersInjector mediaSaveToGalleryAgentMembersInjector;
    private Provider mediaSaveToGalleryAgentProvider;
    private MembersInjector messageAgentMembersInjector;
    private Provider messageAgentProvider;
    private Provider messageHolderUtilProvider;
    private Provider migratePreferencesProvider;
    private Provider mnvAnalyticsProvider;
    private Provider mnvCasesProvider;
    private Provider mnvManagerEventsProvider;
    private Provider mnvManagerProvider;
    private Provider mnvPostRequestProvider;
    private Provider mnvUtilProvider;
    private Provider msaTokenRequestProvider;
    private Provider navigationUrlProvider;
    private Provider networkUtilProvider;
    private Provider nfcManagerProvider;
    private Provider notificationManagerProvider;
    private Provider notificationRouterProvider;
    private Provider objectIdMapProvider;
    private Provider ongoingNotificationsManagerProvider;
    private Provider packageManagerProvider;
    private Provider pcmHostCallbackProvider;
    private Provider pcmHostProvider;
    private Provider permissionRequestStorageProvider;
    private Provider powerManagerProvider;
    private Provider profileServiceTokenRequestProvider;
    private Provider profileServicesClientProvider;
    private Provider profileServicesResponseProvider;
    private Provider promotedSCDContactsManagerProvider;
    private Provider pushHandlingHelperProvider;
    private Provider pushManagerProvider;
    private Provider pushManagerProvider1;
    private Provider pushMessageRepositoryProvider;
    private Provider pushServiceRegisterProvider;
    private Provider pushToMobileMessageListenerProvider;
    private Provider reportAccountStatsProvider;
    private Provider resourcesProvider;
    private Provider sctManagerProvider;
    private Provider sensorManagerProvider;
    private Provider serverClockProvider;
    private MembersInjector sessionReporterMembersInjector;
    private Provider sessionReporterProvider;
    private Provider shortCircuitProfileWebClientProvider;
    private Provider signInDurationReporterProvider;
    private Provider skyLibInitializerProvider;
    private Provider skyLibProvider;
    private MembersInjector skypeApplicationMembersInjector;
    private Provider skypePreferenceListenerProvider;
    private Provider skypePushListenerProvider;
    private Provider skypeTokenAccessProvider;
    private Provider skypeTokenRequestProvider;
    private Provider soundsProvider;
    private Provider spanUtilProvider;
    private Provider spannedStringCacheProvider;
    private Provider storageManagerProvider;
    private Provider telemetryHelperProvider;
    private Provider telemetryProviderFactoryProvider;
    private Provider telephonyManagerProvider;
    private Provider timeAnomalyTelemetryProvider;
    private Provider timeUtilProvider;
    private MembersInjector transferAgentMembersInjector;
    private Provider transferAgentProvider;
    private Provider transferQueueProvider;
    private Provider transferUtilProvider;
    private Provider typeFaceFactoryProvider;
    private Provider typeFaceStyleCallbackProvider;
    private Provider uiModeManagerProvider;
    private Provider updateManagerProvider;
    private Provider urlPreviewMediaAgentProvider;
    private Provider urlsProvider;
    private Provider usbManagerProvider;
    private MembersInjector userPreferencesMembersInjector;
    private Provider userPreferencesProvider;
    private MembersInjector vibrationMembersInjector;
    private Provider vibrationProvider;
    private Provider vibratorProvider;
    private Provider viewStateManagerProvider;
    private MembersInjector wakeupSchedulerAgentMembersInjector;
    private Provider wakeupSchedulerAgentProvider;
    private Provider wearDataRequestCacheProvider;
    private Provider wearMessageNotificationRendererProvider;
    private Provider webConfigUpdaterProvider;
    private Provider wifiManagerProvider;
    private Provider windowManagerProvider;

    private DaggerSkypeApplicationComponent(Builder builder1)
    {
        if (!$assertionsDisabled && builder1 == null)
        {
            throw new AssertionError();
        } else
        {
            initialize(builder1);
            initialize1(builder1);
            return;
        }
    }


    public static Builder builder()
    {
        return new Builder((byte)0);
    }

    private void initialize(Builder builder1)
    {
        contextProvider = ApplicationModule_ContextFactory.create(Builder.a(builder1));
        applicationProvider = ApplicationModule_ApplicationFactory.create(Builder.a(builder1));
        alarmManagerProvider = ApplicationModule_AlarmManagerFactory.create(Builder.a(builder1));
        accessibilityManagerProvider = ApplicationModule_AccessibilityManagerFactory.create(Builder.a(builder1));
        accountManagerProvider = ApplicationModule_AccountManagerFactory.create(Builder.a(builder1));
        activityManagerProvider = ApplicationModule_ActivityManagerFactory.create(Builder.a(builder1));
        audioManagerProvider = ApplicationModule_AudioManagerFactory.create(Builder.a(builder1));
        assetManagerProvider = ApplicationModule_AssetManagerFactory.create(Builder.a(builder1));
        bluetoothManagerProvider = ApplicationModule_BluetoothManagerFactory.create(Builder.a(builder1));
        connectivityManagerProvider = ApplicationModule_ConnectivityManagerFactory.create(Builder.a(builder1));
        contentResolverProvider = ApplicationModule_ContentResolverFactory.create(Builder.a(builder1));
        devicePolicyManagerProvider = ApplicationModule_DevicePolicyManagerFactory.create(Builder.a(builder1));
        displayManagerProvider = ApplicationModule_DisplayManagerFactory.create(Builder.a(builder1));
        downloadManagerProvider = ApplicationModule_DownloadManagerFactory.create(Builder.a(builder1));
        inputManagerProvider = ApplicationModule_InputManagerFactory.create(Builder.a(builder1));
        inputMethodManagerProvider = ApplicationModule_InputMethodManagerFactory.create(Builder.a(builder1));
        locationManagerProvider = ApplicationModule_LocationManagerFactory.create(Builder.a(builder1));
        nfcManagerProvider = ApplicationModule_NfcManagerFactory.create(Builder.a(builder1));
        notificationManagerProvider = ApplicationModule_NotificationManagerFactory.create(Builder.a(builder1));
        packageManagerProvider = ApplicationModule_PackageManagerFactory.create(Builder.a(builder1));
        powerManagerProvider = ApplicationModule_PowerManagerFactory.create(Builder.a(builder1));
        resourcesProvider = ApplicationModule_ResourcesFactory.create(Builder.a(builder1));
        sensorManagerProvider = ApplicationModule_SensorManagerFactory.create(Builder.a(builder1));
        storageManagerProvider = ApplicationModule_StorageManagerFactory.create(Builder.a(builder1));
        telephonyManagerProvider = ApplicationModule_TelephonyManagerFactory.create(Builder.a(builder1));
        uiModeManagerProvider = ApplicationModule_UiModeManagerFactory.create(Builder.a(builder1));
        usbManagerProvider = ApplicationModule_UsbManagerFactory.create(Builder.a(builder1));
        vibratorProvider = ApplicationModule_VibratorFactory.create(Builder.a(builder1));
        windowManagerProvider = ApplicationModule_WindowManagerFactory.create(Builder.a(builder1));
        wifiManagerProvider = ApplicationModule_WifiManagerFactory.create(Builder.a(builder1));
        getAnalyticsPersistentStorageProvider = c.a(SkypeModule_GetAnalyticsPersistentStorageFactory.create(Builder.b(builder1), applicationProvider));
        skyLibProvider = c.a(SkypeModule_SkyLibFactory.create(Builder.b(builder1), applicationProvider, getAnalyticsPersistentStorageProvider));
        objectIdMapProvider = c.a(SkypeModule_ObjectIdMapFactory.create(Builder.b(builder1), skyLibProvider));
        accountProvider = c.a(AccountProvider_Factory.create(skyLibProvider, objectIdMapProvider));
        asyncServiceProvider = c.a(SkypeModule_AsyncServiceFactory.create(Builder.b(builder1)));
        spannedStringCacheProvider = c.a(SpannedStringCache_Factory.create(MembersInjectors.a(), activityManagerProvider));
        urlsProvider = c.a(Urls_Factory.create(applicationProvider));
        navigationUrlProvider = NavigationUrl_Factory.create(contextProvider, urlsProvider);
        httpUtilProvider = c.a(SkypeModule_HttpUtilFactory.create(Builder.b(builder1)));
        conversationParticipantsUtilProvider = ConversationParticipantsUtil_Factory.create(skyLibProvider, objectIdMapProvider);
        ecsClientProvider = c.a(SkypeModule_EcsClientFactory.create(Builder.b(builder1), skyLibProvider));
        ecsConfigurationProvider = c.a(EcsConfiguration_Factory.create(ecsClientProvider));
        flurryProvider = c.a(SkypeModule_FlurryFactory.create(Builder.b(builder1)));
        telemetryProviderFactoryProvider = c.a(SkypeModule_TelemetryProviderFactoryFactory.create(Builder.b(builder1), applicationProvider, asyncServiceProvider, flurryProvider, accountProvider, ecsConfigurationProvider));
        analyticsProvider = c.a(Analytics_Factory.create(MembersInjectors.a(), applicationProvider, asyncServiceProvider, ecsConfigurationProvider, flurryProvider, telemetryProviderFactoryProvider));
        imageCacheProvider = c.a(ImageCache_Factory.create(MembersInjectors.a(), applicationProvider, asyncServiceProvider, httpUtilProvider, conversationParticipantsUtilProvider, objectIdMapProvider, analyticsProvider));
        countryFlagsProvider = c.a(CountryFlags_Factory.create(applicationProvider, imageCacheProvider, skyLibProvider));
        eventBusProvider = c.a(SkypeModule_EventBusFactory.create(Builder.b(builder1)));
        mediaContentRosterProvider = c.a(MediaContentRoster_Factory.create(applicationProvider, skyLibProvider, objectIdMapProvider, imageCacheProvider, spannedStringCacheProvider, analyticsProvider, ecsConfigurationProvider, eventBusProvider));
        userPreferencesMembersInjector = UserPreferences_MembersInjector.create(vibratorProvider);
        accountProvider1 = SkypeModule_AccountProviderFactory.create(Builder.b(builder1), accountProvider);
        userPreferencesProvider = UserPreferences_Factory.create(userPreferencesMembersInjector, accountProvider1, applicationProvider);
        timeUtilProvider = TimeUtil_Factory.create(applicationProvider);
        sctManagerProvider = c.a(SkypeModule_SctManagerFactory.create(Builder.b(builder1), skyLibProvider));
        networkUtilProvider = c.a(NetworkUtil_Factory.create(applicationProvider));
        timeAnomalyTelemetryProvider = c.a(SkypeModule_TimeAnomalyTelemetryFactory.create(Builder.b(builder1), applicationProvider, sctManagerProvider, ecsClientProvider, networkUtilProvider, getAnalyticsPersistentStorageProvider, skyLibProvider));
        chatTextProvider = c.a(ChatText_Factory.create(applicationProvider, skyLibProvider, navigationUrlProvider, countryFlagsProvider, mediaContentRosterProvider, ecsConfigurationProvider, userPreferencesProvider, timeUtilProvider, timeAnomalyTelemetryProvider));
        contactMoodCacheProvider = c.a(ContactMoodCache_Factory.create(spannedStringCacheProvider, chatTextProvider, asyncServiceProvider));
        defaultAvatarsProvider = c.a(DefaultAvatars_Factory.create(applicationProvider, ecsConfigurationProvider));
        contactUtilProvider = ContactUtil_Factory.create(applicationProvider, accountProvider1, skyLibProvider, objectIdMapProvider, contactMoodCacheProvider, ecsConfigurationProvider, imageCacheProvider, defaultAvatarsProvider);
        spanUtilProvider = c.a(SkypeModule_SpanUtilFactory.create(Builder.b(builder1), contextProvider));
        formattedMessageCacheProvider = c.a(FormattedMessageCache_Factory.create(applicationProvider, asyncServiceProvider, spannedStringCacheProvider, chatTextProvider, accountProvider1, skyLibProvider, timeUtilProvider, objectIdMapProvider, contactUtilProvider, timeAnomalyTelemetryProvider, spanUtilProvider));
        conversationUtilProvider = ConversationUtil_Factory.create(applicationProvider, asyncServiceProvider, skyLibProvider, objectIdMapProvider, formattedMessageCacheProvider, accountProvider1, contactUtilProvider, ecsConfigurationProvider, chatTextProvider);
        foregroundStateProvider = c.a(ForegroundState_Factory.create());
        backgroundModeProvider = c.a(BackgroundMode_Factory.create(skyLibProvider, objectIdMapProvider, accountProvider, conversationUtilProvider, foregroundStateProvider, eventBusProvider, analyticsProvider));
        dreamKeeperProvider = c.a(DreamKeeper_Factory.create(backgroundModeProvider, skyLibProvider, eventBusProvider));
        foregroundObserverProvider = c.a(ForegroundObserver_Factory.create(applicationProvider, dreamKeeperProvider, foregroundStateProvider));
        loginManagerProvider = LoginManager_Factory.create(applicationProvider, accountProvider1, skyLibProvider);
        callPushMessageListenerProvider = CallPushMessageListener_Factory.create(loginManagerProvider, skyLibProvider, dreamKeeperProvider, eventBusProvider);
        pushHandlingHelperProvider = c.a(PushHandlingHelper_Factory.create(applicationProvider));
        pushMessageRepositoryProvider = c.a(PushMessageRepository_Factory.create(ecsConfigurationProvider, pushHandlingHelperProvider, eventBusProvider));
        signInDurationReporterProvider = c.a(SignInDurationReporter_Factory.create(analyticsProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider));
        layoutExperienceProvider = c.a(SkypeModule_LayoutExperienceFactory.create(Builder.b(builder1), contextProvider));
        backgroundNavigationProvider = BackgroundNavigation_Factory.create(MembersInjectors.a(), applicationProvider, accountProvider, skyLibProvider, dreamKeeperProvider, conversationUtilProvider, analyticsProvider, networkUtilProvider, ecsConfigurationProvider, signInDurationReporterProvider, getAnalyticsPersistentStorageProvider, layoutExperienceProvider, timeUtilProvider);
        pushToMobileMessageListenerProvider = PushToMobileMessageListener_Factory.create(accountProvider, contextProvider, userPreferencesProvider, foregroundStateProvider, notificationManagerProvider, backgroundNavigationProvider, analyticsProvider);
        conciergePushMessageListenerProvider = ConciergePushMessageListener_Factory.create(applicationProvider);
        skypePushListenerProvider = c.a(SkypePushListener_Factory.create(applicationProvider, skyLibProvider, sctManagerProvider, loginManagerProvider, networkUtilProvider, accountProvider, ecsClientProvider, eventBusProvider, getAnalyticsPersistentStorageProvider, callPushMessageListenerProvider, pushMessageRepositoryProvider, pushToMobileMessageListenerProvider, conciergePushMessageListenerProvider));
        pushManagerProvider = c.a(PushManagerProvider_Factory.create(applicationProvider, skypePushListenerProvider));
        pushManagerProvider1 = SkypeModule_PushManagerFactory.create(Builder.b(builder1), pushManagerProvider);
        dumpUploaderProvider = DumpUploader_Factory.create(asyncServiceProvider, httpUtilProvider, networkUtilProvider, timeUtilProvider);
        adManagerProvider = c.a(SkypeModule_AdManagerFactory.create(Builder.b(builder1)));
        applicationConfigProvider = c.a(SkypeModule_ApplicationConfigFactory.create(Builder.b(builder1)));
        adManagerInitializerProvider = AdManagerInitializer_Factory.create(applicationProvider, adManagerProvider, applicationConfigProvider, userPreferencesProvider, asyncServiceProvider, eventBusProvider);
        wakeupSchedulerAgentMembersInjector = WakeupSchedulerAgent_MembersInjector.create(accountProvider1, userPreferencesProvider);
        wakeupSchedulerAgentProvider = c.a(WakeupSchedulerAgent_Factory.create(wakeupSchedulerAgentMembersInjector, applicationProvider, applicationConfigProvider, dreamKeeperProvider, skyLibProvider, loginManagerProvider));
        vibrationMembersInjector = Vibration_MembersInjector.create(vibratorProvider, audioManagerProvider, foregroundStateProvider, userPreferencesProvider);
        vibrationProvider = c.a(Vibration_Factory.create(vibrationMembersInjector));
        soundsProvider = c.a(Sounds_Factory.create(applicationProvider, audioManagerProvider, vibrationProvider));
        msaTokenRequestProvider = MsaTokenRequest_Factory.create(eventBusProvider, skyLibProvider);
        skypeTokenRequestProvider = c.a(SkypeTokenRequest_Factory.create(skyLibProvider, analyticsProvider, accountProvider, eventBusProvider));
        skypeTokenAccessProvider = c.a(SkypeModule_SkypeTokenAccessFactory.create(Builder.b(builder1), skypeTokenRequestProvider));
        contactIngestionTokenRequestProvider = ContactIngestionTokenRequest_Factory.create(MembersInjectors.a(), accountProvider, msaTokenRequestProvider, skypeTokenAccessProvider);
        mnvAnalyticsProvider = MnvAnalytics_Factory.create(analyticsProvider, ecsConfigurationProvider);
        contactsIngestTaskProvider = SkypeModule_ContactsIngestTaskFactory.create(Builder.b(builder1), contextProvider, skyLibProvider, ecsConfigurationProvider, accountProvider, contactIngestionTokenRequestProvider, networkUtilProvider, mnvAnalyticsProvider, contactUtilProvider);
        contactsIngestManagerProvider = c.a(ContactsIngestManager_Factory.create(userPreferencesProvider, ecsConfigurationProvider, skyLibProvider, accountProvider1, analyticsProvider, contactsIngestTaskProvider, dreamKeeperProvider, eventBusProvider));
    }

    private void initialize1(Builder builder1)
    {
        skypePreferenceListenerProvider = SkypePreferenceListener_Factory.create(applicationProvider, contactsIngestManagerProvider);
        telemetryHelperProvider = TelemetryHelper_Factory.create(applicationProvider, sctManagerProvider, ecsClientProvider, networkUtilProvider, getAnalyticsPersistentStorageProvider);
        createDeviceAccountProvider = CreateDeviceAccount_Factory.create(applicationProvider, accountManagerProvider, userPreferencesProvider, timeUtilProvider);
        pushServiceRegisterProvider = PushServiceRegister_Factory.create(contextProvider, pushMessageRepositoryProvider);
        migratePreferencesProvider = MigratePreferences_Factory.create(contextProvider, userPreferencesProvider);
        configUpdaterProvider = ConfigUpdater_Factory.create(applicationProvider);
        webConfigUpdaterProvider = WebConfigUpdater_Factory.create(contextProvider, httpUtilProvider);
        configUpdateProvider = ConfigUpdate_Factory.create(applicationProvider, applicationConfigProvider, configUpdaterProvider, webConfigUpdaterProvider, urlsProvider);
        reportAccountStatsProvider = ReportAccountStats_Factory.create(contextProvider, analyticsProvider, userPreferencesProvider, skyLibProvider);
        crashReporterProvider = SkypeModule_CrashReporterFactory.create(Builder.b(builder1));
        crashReporterContactProvider = CrashReporterContact_Factory.create(crashReporterProvider);
        externalCacheCleanupProvider = ExternalCacheCleanup_Factory.create(contextProvider);
        analyticsInAppObserverProvider = c.a(AnalyticsInAppObserver_Factory.create(MembersInjectors.a(), applicationProvider, analyticsProvider, sctManagerProvider, networkUtilProvider, ecsClientProvider, ecsConfigurationProvider, accountProvider1, foregroundStateProvider, eventBusProvider, getAnalyticsPersistentStorageProvider));
        accountTaskCompositionProvider = AccountTaskComposition_Factory.create(createDeviceAccountProvider, pushServiceRegisterProvider, migratePreferencesProvider, configUpdateProvider, reportAccountStatsProvider, crashReporterContactProvider, externalCacheCleanupProvider, analyticsInAppObserverProvider);
        chatServiceMonitorProvider = c.a(ChatServiceMonitor_Factory.create(applicationProvider, networkUtilProvider, analyticsProvider, eventBusProvider, ecsConfigurationProvider));
        accountAgentMembersInjector = AccountAgent_MembersInjector.create(accountProvider1, userPreferencesProvider, analyticsProvider, foregroundStateProvider, soundsProvider, notificationManagerProvider, pushManagerProvider1, contactUtilProvider, skyLibProvider, networkUtilProvider, skypePreferenceListenerProvider, adManagerInitializerProvider, backgroundNavigationProvider, telemetryHelperProvider, accountTaskCompositionProvider, imageCacheProvider, timeUtilProvider, chatServiceMonitorProvider, getAnalyticsPersistentStorageProvider);
        accountAgentProvider = c.a(AccountAgent_Factory.create(accountAgentMembersInjector, applicationProvider, ecsConfigurationProvider));
        callAgentMembersInjector = CallAgent_MembersInjector.create(accountProvider1, userPreferencesProvider);
        viewStateManagerProvider = c.a(ViewStateManager_Factory.create(MembersInjectors.a()));
        ongoingNotificationsManagerProvider = c.a(OngoingNotificationsManager_Factory.create(applicationProvider));
        app2AppManagerProvider = c.a(App2AppManager_Factory.create(skyLibProvider, accountProvider, eventBusProvider));
        callQualityFeedbackManagerProvider = c.a(CallQualityFeedbackManager_Factory.create(objectIdMapProvider, skyLibProvider, conversationUtilProvider, userPreferencesProvider, analyticsProvider));
        skyLibInitializerProvider = SkypeModule_SkyLibInitializerFactory.create(Builder.b(builder1));
        pcmHostProvider = SkypeModule_PcmHostFactory.create(Builder.b(builder1), skyLibInitializerProvider);
        pcmHostCallbackProvider = SkypeModule_PcmHostCallbackFactory.create(Builder.b(builder1), skyLibInitializerProvider);
        accessibilityUtilProvider = AccessibilityUtil_Factory.create(contextProvider);
        getTranslatorProvider = c.a(SkypeModule_GetTranslatorFactory.create(Builder.b(builder1), applicationProvider, skyLibProvider, objectIdMapProvider));
        callAgentProvider = c.a(CallAgent_Factory.create(callAgentMembersInjector, applicationProvider, skyLibProvider, objectIdMapProvider, eventBusProvider, notificationManagerProvider, powerManagerProvider, telephonyManagerProvider, wifiManagerProvider, audioManagerProvider, viewStateManagerProvider, adManagerProvider, ongoingNotificationsManagerProvider, app2AppManagerProvider, callQualityFeedbackManagerProvider, pcmHostProvider, pcmHostCallbackProvider, soundsProvider, analyticsProvider, accessibilityUtilProvider, layoutExperienceProvider, ecsConfigurationProvider, backgroundNavigationProvider, imageCacheProvider, conversationUtilProvider, contactUtilProvider, getTranslatorProvider, foregroundStateProvider));
        messageAgentMembersInjector = MessageAgent_MembersInjector.create(accountProvider1, userPreferencesProvider);
        handheldMessageNotificationProvider = HandheldMessageNotification_Factory.create(MembersInjectors.a(), contextProvider, skyLibProvider, conversationUtilProvider, imageCacheProvider, formattedMessageCacheProvider, notificationManagerProvider, userPreferencesProvider, backgroundNavigationProvider, ecsConfigurationProvider);
        messageHolderUtilProvider = MessageHolderUtil_Factory.create(accountProvider1, objectIdMapProvider);
        transferUtilProvider = TransferUtil_Factory.create(contextProvider, accountProvider, objectIdMapProvider, timeUtilProvider, timeAnomalyTelemetryProvider, analyticsProvider);
        wearMessageNotificationRendererProvider = WearMessageNotificationRenderer_Factory.create(MembersInjectors.a(), contextProvider, skyLibProvider, conversationUtilProvider, formattedMessageCacheProvider, imageCacheProvider, notificationManagerProvider, asyncServiceProvider, objectIdMapProvider, messageHolderUtilProvider, transferUtilProvider);
        notificationRouterProvider = c.a(NotificationRouter_Factory.create(handheldMessageNotificationProvider, wearMessageNotificationRendererProvider));
        annotationUtilProvider = AnnotationUtil_Factory.create(objectIdMapProvider);
        messageAgentProvider = c.a(MessageAgent_Factory.create(messageAgentMembersInjector, applicationProvider, foregroundStateProvider, dreamKeeperProvider, skyLibProvider, objectIdMapProvider, conversationUtilProvider, contactUtilProvider, notificationManagerProvider, imageCacheProvider, pushMessageRepositoryProvider, pushHandlingHelperProvider, loginManagerProvider, notificationRouterProvider, ecsConfigurationProvider, analyticsProvider, annotationUtilProvider));
        urlPreviewMediaAgentProvider = c.a(UrlPreviewMediaAgent_Factory.create(eventBusProvider));
        mediaDocumentDownloadUtilProvider = MediaDocumentDownloadUtil_Factory.create(applicationProvider, asyncServiceProvider, httpUtilProvider, imageCacheProvider, objectIdMapProvider, skyLibProvider, urlPreviewMediaAgentProvider);
        mediaSaveToGalleryAgentMembersInjector = MediaSaveToGalleryAgent_MembersInjector.create(accountProvider1, userPreferencesProvider, asyncServiceProvider, analyticsProvider, objectIdMapProvider, mediaDocumentDownloadUtilProvider, eventBusProvider);
        mediaSaveToGalleryAgentProvider = c.a(MediaSaveToGalleryAgent_Factory.create(mediaSaveToGalleryAgentMembersInjector, applicationProvider));
        transferQueueProvider = c.a(TransferQueue_Factory.create(transferUtilProvider));
        transferAgentMembersInjector = TransferAgent_MembersInjector.create(accountProvider1, userPreferencesProvider, transferQueueProvider, skyLibProvider, objectIdMapProvider, notificationManagerProvider, transferUtilProvider, analyticsProvider);
        transferAgentProvider = c.a(TransferAgent_Factory.create(transferAgentMembersInjector, applicationProvider));
        contactAgentMembersInjector = ContactAgent_MembersInjector.create(accountProvider1, userPreferencesProvider, skyLibProvider, imageCacheProvider, notificationManagerProvider, objectIdMapProvider, contactUtilProvider, foregroundStateProvider, timeUtilProvider);
        contactAgentProvider = c.a(ContactAgent_Factory.create(contactAgentMembersInjector, applicationProvider, analyticsProvider));
        accessAgentMembersInjector = AccessAgent_MembersInjector.create(accountProvider1, userPreferencesProvider, skyLibProvider);
        accessAgentProvider = c.a(AccessAgent_Factory.create(accessAgentMembersInjector, applicationProvider));
        mediaDocumentUploadUtilProvider = MediaDocumentUploadUtil_Factory.create(applicationProvider, asyncServiceProvider, skyLibProvider, conversationUtilProvider, imageCacheProvider, ecsConfigurationProvider, eventBusProvider);
        mediaMessageAgentMembersInjector = MediaMessageAgent_MembersInjector.create(accountProvider1, userPreferencesProvider, skyLibProvider, analyticsProvider, notificationManagerProvider, conversationUtilProvider, imageCacheProvider, mediaDocumentUploadUtilProvider, networkUtilProvider, contactUtilProvider, accountProvider);
        mediaMessageAgentProvider = c.a(MediaMessageAgent_Factory.create(mediaMessageAgentMembersInjector, applicationProvider, eventBusProvider, objectIdMapProvider));
        contactsScrapeAgentMembersInjector = ContactsScrapeAgent_MembersInjector.create(accountProvider1, userPreferencesProvider);
        contactsObserverProvider = c.a(ContactsObserver_Factory.create(MembersInjectors.a(), contactsIngestManagerProvider));
        contactsScrapeAgentProvider = c.a(ContactsScrapeAgent_Factory.create(contactsScrapeAgentMembersInjector, applicationProvider, contactsObserverProvider, ecsConfigurationProvider, skyLibProvider));
        skypeApplicationMembersInjector = SkypeApplication_MembersInjector.create(foregroundObserverProvider, pushManagerProvider1, dumpUploaderProvider, adManagerInitializerProvider, wakeupSchedulerAgentProvider, accountAgentProvider, callAgentProvider, messageAgentProvider, mediaSaveToGalleryAgentProvider, transferAgentProvider, contactAgentProvider, accessAgentProvider, accessibilityUtilProvider, mediaMessageAgentProvider, contactsScrapeAgentProvider, sctManagerProvider);
        sessionReporterMembersInjector = SessionReporter_MembersInjector.create(analyticsProvider, accountProvider1);
        sessionReporterProvider = c.a(SessionReporter_Factory.create(sessionReporterMembersInjector));
        updateManagerProvider = SkypeModule_UpdateManagerFactory.create(Builder.b(builder1));
        typeFaceFactoryProvider = c.a(SkypeModule_TypeFaceFactoryFactory.create(Builder.b(builder1), applicationProvider));
        typeFaceStyleCallbackProvider = SkypeModule_TypeFaceStyleCallbackFactory.create(Builder.b(builder1), typeFaceFactoryProvider);
        adPlacerProvider = c.a(SkypeModule_AdPlacerFactory.create(Builder.b(builder1)));
        mRUManagerProvider = c.a(MRUManager_Factory.create(objectIdMapProvider, formattedMessageCacheProvider, accountProvider1, contextProvider, eventBusProvider, ecsConfigurationProvider));
        mnvUtilProvider = MnvUtil_Factory.create(accountProvider, networkUtilProvider, ecsConfigurationProvider, contactUtilProvider);
        autoBuddyManagerProvider = AutoBuddyManager_Factory.create(contactsIngestManagerProvider, userPreferencesProvider, skypeTokenAccessProvider, httpUtilProvider, eventBusProvider, ecsConfigurationProvider);
        mnvCasesProvider = MnvCases_Factory.create(ecsConfigurationProvider, mnvAnalyticsProvider, userPreferencesProvider, mnvUtilProvider, autoBuddyManagerProvider, accountProvider);
        profileServicesResponseProvider = ProfileServicesResponse_Factory.create(mnvAnalyticsProvider);
        profileServicesClientProvider = ProfileServicesClient_Factory.create(mnvUtilProvider, mnvCasesProvider, httpUtilProvider, mnvAnalyticsProvider, networkUtilProvider, contactUtilProvider, accountProvider, profileServicesResponseProvider, ecsConfigurationProvider);
        mnvManagerEventsProvider = MnvManagerEvents_Factory.create(accountProvider, mnvAnalyticsProvider, mnvUtilProvider, mnvCasesProvider, skyLibProvider, userPreferencesProvider);
        mnvPostRequestProvider = MnvPostRequest_Factory.create(mnvUtilProvider, mnvCasesProvider);
        mnvManagerProvider = c.a(MnvManager_Factory.create(applicationProvider, profileServicesClientProvider, mnvManagerEventsProvider, mnvCasesProvider, mnvAnalyticsProvider, mnvPostRequestProvider, eventBusProvider, userPreferencesProvider));
        promotedSCDContactsManagerProvider = c.a(PromotedSCDContactsManager_Factory.create(MembersInjectors.a(), skyLibProvider, contactUtilProvider, userPreferencesProvider, ecsConfigurationProvider, eventBusProvider));
        profileServiceTokenRequestProvider = ProfileServiceTokenRequest_Factory.create(MembersInjectors.a(), accountProvider, msaTokenRequestProvider, skypeTokenAccessProvider);
        shortCircuitProfileWebClientProvider = ShortCircuitProfileWebClient_Factory.create(profileServiceTokenRequestProvider, httpUtilProvider, eventBusProvider, ecsConfigurationProvider);
        permissionRequestStorageProvider = c.a(PermissionRequestStorage_Factory.create());
        getRingtoneStorageProvider = c.a(SkypeModule_GetRingtoneStorageFactory.create(Builder.b(builder1), applicationProvider));
        serverClockProvider = c.a(ServerClock_Factory.create(skyLibProvider));
        wearDataRequestCacheProvider = c.a(WearDataRequestCache_Factory.create(applicationProvider, eventBusProvider));
    }

    public final AccessibilityManager accessibilityManager()
    {
        return (AccessibilityManager)accessibilityManagerProvider.get();
    }

    public final Account account()
    {
        return (Account)accountProvider1.get();
    }

    public final AccountManager accountManager()
    {
        return (AccountManager)accountManagerProvider.get();
    }

    public final AccountProvider accountProvider()
    {
        return (AccountProvider)accountProvider.get();
    }

    public final ActivityManager activityManager()
    {
        return (ActivityManager)activityManagerProvider.get();
    }

    public final AdManager adManager()
    {
        return (AdManager)adManagerProvider.get();
    }

    public final AdPlacer adPlacer()
    {
        return (AdPlacer)adPlacerProvider.get();
    }

    public final AlarmManager alarmManager()
    {
        return (AlarmManager)alarmManagerProvider.get();
    }

    public final Analytics analytics()
    {
        return (Analytics)analyticsProvider.get();
    }

    public final AnalyticsInAppObserver analyticsInAppObserver()
    {
        return (AnalyticsInAppObserver)analyticsInAppObserverProvider.get();
    }

    public final Application application()
    {
        return (Application)applicationProvider.get();
    }

    public final ApplicationConfig applicationConfig()
    {
        return (ApplicationConfig)applicationConfigProvider.get();
    }

    public final AssetManager assetManager()
    {
        return (AssetManager)assetManagerProvider.get();
    }

    public final AsyncService asyncService()
    {
        return (AsyncService)asyncServiceProvider.get();
    }

    public final AudioManager audioManager()
    {
        return (AudioManager)audioManagerProvider.get();
    }

    public final BackgroundMode backgroundMode()
    {
        return (BackgroundMode)backgroundModeProvider.get();
    }

    public final BluetoothManager bluetoothManager()
    {
        return (BluetoothManager)bluetoothManagerProvider.get();
    }

    public final CallAgent callAgent()
    {
        return (CallAgent)callAgentProvider.get();
    }

    public final CallQualityFeedbackManager callQualityFeedbackManager()
    {
        return (CallQualityFeedbackManager)callQualityFeedbackManagerProvider.get();
    }

    public final ChatServiceMonitor chatServiceMonitor()
    {
        return (ChatServiceMonitor)chatServiceMonitorProvider.get();
    }

    public final ChatText chatText()
    {
        return (ChatText)chatTextProvider.get();
    }

    public final ConnectivityManager connectivityManager()
    {
        return (ConnectivityManager)connectivityManagerProvider.get();
    }

    public final ContactMoodCache contactMoodCache()
    {
        return (ContactMoodCache)contactMoodCacheProvider.get();
    }

    public final ContactsIngestManager contactsIngestManager()
    {
        return (ContactsIngestManager)contactsIngestManagerProvider.get();
    }

    public final ContentResolver contentResolver()
    {
        return (ContentResolver)contentResolverProvider.get();
    }

    public final Context context()
    {
        return (Context)contextProvider.get();
    }

    public final CountryFlags countryFlags()
    {
        return (CountryFlags)countryFlagsProvider.get();
    }

    public final CrashReporter crashReporter()
    {
        return (CrashReporter)crashReporterProvider.get();
    }

    public final DefaultAvatars defaultAvatars()
    {
        return (DefaultAvatars)defaultAvatarsProvider.get();
    }

    public final DevicePolicyManager devicePolicyManager()
    {
        return (DevicePolicyManager)devicePolicyManagerProvider.get();
    }

    public final DisplayManager displayManager()
    {
        return (DisplayManager)displayManagerProvider.get();
    }

    public final DownloadManager downloadManager()
    {
        return (DownloadManager)downloadManagerProvider.get();
    }

    public final DreamKeeper dreamKeeper()
    {
        return (DreamKeeper)dreamKeeperProvider.get();
    }

    public final EcsClient ecsClient()
    {
        return (EcsClient)ecsClientProvider.get();
    }

    public final EcsConfiguration ecsConfiguration()
    {
        return (EcsConfiguration)ecsConfigurationProvider.get();
    }

    public final EventBus eventBus()
    {
        return (EventBus)eventBusProvider.get();
    }

    public final FlurryAccessInterface flurryAccess()
    {
        return (FlurryAccessInterface)flurryProvider.get();
    }

    public final ForegroundState foregroundState()
    {
        return (ForegroundState)foregroundStateProvider.get();
    }

    public final FormattedMessageCache formattedMessageCache()
    {
        return (FormattedMessageCache)formattedMessageCacheProvider.get();
    }

    public final AnalyticsPersistentStorage getAnalyticsPersistentStorage()
    {
        return (AnalyticsPersistentStorage)getAnalyticsPersistentStorageProvider.get();
    }

    public final PermissionRequestStorage getPermissionRequestStorage()
    {
        return (PermissionRequestStorage)permissionRequestStorageProvider.get();
    }

    public final RingtoneStorage getRingtoneStorage()
    {
        return (RingtoneStorage)getRingtoneStorageProvider.get();
    }

    public final Translator getTranslator()
    {
        return (Translator)getTranslatorProvider.get();
    }

    public final HttpUtil httpUtil()
    {
        return (HttpUtil)httpUtilProvider.get();
    }

    public final ImageCache imageCache()
    {
        return (ImageCache)imageCacheProvider.get();
    }

    public final void inject(SkypeApplication skypeapplication)
    {
        skypeApplicationMembersInjector.injectMembers(skypeapplication);
    }

    public final InputManager inputManager()
    {
        return (InputManager)inputManagerProvider.get();
    }

    public final InputMethodManager inputMethodManager()
    {
        return (InputMethodManager)inputMethodManagerProvider.get();
    }

    public final LayoutExperience layoutExperience()
    {
        return (LayoutExperience)layoutExperienceProvider.get();
    }

    public final LocationManager locationManager()
    {
        return (LocationManager)locationManagerProvider.get();
    }

    public final MediaContentRoster mediaContentRoster()
    {
        return (MediaContentRoster)mediaContentRosterProvider.get();
    }

    public final MnvManager mnvManager()
    {
        return (MnvManager)mnvManagerProvider.get();
    }

    public final MRUManager mruManager()
    {
        return (MRUManager)mRUManagerProvider.get();
    }

    public final NetworkUtil networkUtil()
    {
        return (NetworkUtil)networkUtilProvider.get();
    }

    public final NfcManager nfcManager()
    {
        return (NfcManager)nfcManagerProvider.get();
    }

    public final NotificationManager notificationManager()
    {
        return (NotificationManager)notificationManagerProvider.get();
    }

    public final NotificationRouter notificationRendererFactory()
    {
        return (NotificationRouter)notificationRouterProvider.get();
    }

    public final ObjectIdMap objectIdMap()
    {
        return (ObjectIdMap)objectIdMapProvider.get();
    }

    public final OngoingNotificationsManager ongoingNotificationsManager()
    {
        return (OngoingNotificationsManager)ongoingNotificationsManagerProvider.get();
    }

    public final PackageManager packageManager()
    {
        return (PackageManager)packageManagerProvider.get();
    }

    public final PcmHost pcmHost()
    {
        return (PcmHost)pcmHostProvider.get();
    }

    public final PcmHostCallback pcmHostCallback()
    {
        return (PcmHostCallback)pcmHostCallbackProvider.get();
    }

    public final PowerManager powerManager()
    {
        return (PowerManager)powerManagerProvider.get();
    }

    public final PromotedSCDContactsManager promotedSCDContactsManager()
    {
        return (PromotedSCDContactsManager)promotedSCDContactsManagerProvider.get();
    }

    public final PushHandlingHelper pushHandlingHelper()
    {
        return (PushHandlingHelper)pushHandlingHelperProvider.get();
    }

    public final PushManager pushManager()
    {
        return (PushManager)pushManagerProvider1.get();
    }

    public final PushMessageRepository pushMessageRepository()
    {
        return (PushMessageRepository)pushMessageRepositoryProvider.get();
    }

    public final Resources resources()
    {
        return (Resources)resourcesProvider.get();
    }

    public final SCTManager sctManager()
    {
        return (SCTManager)sctManagerProvider.get();
    }

    public final SensorManager sensorManager()
    {
        return (SensorManager)sensorManagerProvider.get();
    }

    public final ServerClock serverClock()
    {
        return (ServerClock)serverClockProvider.get();
    }

    public final SessionReporter sessionReporter()
    {
        return (SessionReporter)sessionReporterProvider.get();
    }

    public final ShortCircuitProfileWebClient shortCircuitProfileWebClient()
    {
        return (ShortCircuitProfileWebClient)shortCircuitProfileWebClientProvider.get();
    }

    public final SignInDurationReporter signInDurationReporter()
    {
        return (SignInDurationReporter)signInDurationReporterProvider.get();
    }

    public final SkyLib skyLib()
    {
        return (SkyLib)skyLibProvider.get();
    }

    public final SkyLibInitializer skyLibInitializer()
    {
        return (SkyLibInitializer)skyLibInitializerProvider.get();
    }

    public final SkypePushListener skypePushListener()
    {
        return (SkypePushListener)skypePushListenerProvider.get();
    }

    public final SkypeTokenAccess skypeTokenAccess()
    {
        return (SkypeTokenAccess)skypeTokenAccessProvider.get();
    }

    public final Sounds sounds()
    {
        return (Sounds)soundsProvider.get();
    }

    public final SpanUtil spanUtil()
    {
        return (SpanUtil)spanUtilProvider.get();
    }

    public final SpannedStringCache spannedStringCache()
    {
        return (SpannedStringCache)spannedStringCacheProvider.get();
    }

    public final StorageManager storageManager()
    {
        return (StorageManager)storageManagerProvider.get();
    }

    public final TelemetryProviderFactory telemetryProviderFactory()
    {
        return (TelemetryProviderFactory)telemetryProviderFactoryProvider.get();
    }

    public final TelephonyManager telephonyManager()
    {
        return (TelephonyManager)telephonyManagerProvider.get();
    }

    public final TimeAnomalyTelemetry timeAnomalyTelemetry()
    {
        return (TimeAnomalyTelemetry)timeAnomalyTelemetryProvider.get();
    }

    public final TransferQueue transferQueue()
    {
        return (TransferQueue)transferQueueProvider.get();
    }

    public final TypeFaceFactory typeFaceFactory()
    {
        return (TypeFaceFactory)typeFaceFactoryProvider.get();
    }

    public final TypeFaceTextStyleCallback typeFaceStyleCallback()
    {
        return (TypeFaceTextStyleCallback)typeFaceStyleCallbackProvider.get();
    }

    public final UiModeManager uiModeManager()
    {
        return (UiModeManager)uiModeManagerProvider.get();
    }

    public final UpdateManager updateManager()
    {
        return (UpdateManager)updateManagerProvider.get();
    }

    public final UrlPreviewMediaAgent urlPreviewMediaAgent()
    {
        return (UrlPreviewMediaAgent)urlPreviewMediaAgentProvider.get();
    }

    public final Urls urls()
    {
        return (Urls)urlsProvider.get();
    }

    public final UsbManager usbManager()
    {
        return (UsbManager)usbManagerProvider.get();
    }

    public final Vibration vibration()
    {
        return (Vibration)vibrationProvider.get();
    }

    public final Vibrator vibrator()
    {
        return (Vibrator)vibratorProvider.get();
    }

    public final ViewStateManager viewStateManager()
    {
        return (ViewStateManager)viewStateManagerProvider.get();
    }

    public final WearDataRequestCache wearDataRequestCache()
    {
        return (WearDataRequestCache)wearDataRequestCacheProvider.get();
    }

    public final WifiManager wifiManager()
    {
        return (WifiManager)wifiManagerProvider.get();
    }

    public final WindowManager windowManager()
    {
        return (WindowManager)windowManagerProvider.get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/DaggerSkypeApplicationComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
