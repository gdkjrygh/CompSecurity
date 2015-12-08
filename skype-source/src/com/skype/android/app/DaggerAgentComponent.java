// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.accounts.AccountManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Vibrator;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeApplicationComponent;
import com.skype.android.ads.AdManager;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsInAppObserver;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.app.access.AccessAgent;
import com.skype.android.app.access.AccessAgent_MembersInjector;
import com.skype.android.app.ads.AdManagerInitializer_Factory;
import com.skype.android.app.calling.CallAgent;
import com.skype.android.app.calling.CallAgent_MembersInjector;
import com.skype.android.app.chat.ChatServiceMonitor;
import com.skype.android.app.chat.MessageAgent;
import com.skype.android.app.chat.MessageAgent_MembersInjector;
import com.skype.android.app.contacts.ContactAgent;
import com.skype.android.app.contacts.ContactAgent_MembersInjector;
import com.skype.android.app.media.MediaDocumentDownloadUtil_Factory;
import com.skype.android.app.media.MediaDocumentUploadUtil_Factory;
import com.skype.android.app.media.MediaMessageAgent;
import com.skype.android.app.media.MediaMessageAgent_MembersInjector;
import com.skype.android.app.media.MediaSaveToGalleryAgent;
import com.skype.android.app.media.MediaSaveToGalleryAgent_MembersInjector;
import com.skype.android.app.media.UrlPreviewMediaAgent;
import com.skype.android.app.settings.SkypePreferenceListener_Factory;
import com.skype.android.app.settings.UserPreferences_Factory;
import com.skype.android.app.settings.UserPreferences_MembersInjector;
import com.skype.android.app.signin.AccountAgent;
import com.skype.android.app.signin.AccountAgent_MembersInjector;
import com.skype.android.app.signin.tasks.AccountTaskComposition_Factory;
import com.skype.android.app.signin.tasks.ConfigUpdate_Factory;
import com.skype.android.app.signin.tasks.CrashReporterContact_Factory;
import com.skype.android.app.signin.tasks.CreateDeviceAccount_Factory;
import com.skype.android.app.signin.tasks.ExternalCacheCleanup_Factory;
import com.skype.android.app.signin.tasks.MigratePreferences_Factory;
import com.skype.android.app.signin.tasks.PushServiceRegister_Factory;
import com.skype.android.app.signin.tasks.ReportAccountStats_Factory;
import com.skype.android.app.transfer.TransferAgent;
import com.skype.android.app.transfer.TransferAgent_MembersInjector;
import com.skype.android.app.transfer.TransferQueue;
import com.skype.android.app.transfer.TransferUtil_Factory;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.ConfigUpdater_Factory;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.config.web.WebConfigUpdater_Factory;
import com.skype.android.crash.CrashReporter;
import com.skype.android.event.EventBus;
import com.skype.android.inject.AccountProvider;
import com.skype.android.push.PushManager;
import com.skype.android.push.PushMessageRepository;
import com.skype.android.res.ChatText;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.res.Sounds;
import com.skype.android.res.Urls;
import com.skype.android.service.ContactsScrapeAgent;
import com.skype.android.service.ContactsScrapeAgent_MembersInjector;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.sync.ContactsIngestManager;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.telemetry.TelemetryHelper_Factory;
import com.skype.android.util.ContactUtil_Factory;
import com.skype.android.util.ConversationUtil_Factory;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil_Factory;
import com.skype.android.util.cache.ContactMoodCache;
import com.skype.android.util.cache.FormattedMessageCache;
import com.skype.android.wakeup.DreamKeeper;
import com.skype.android.wakeup.ForegroundState;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app:
//            AgentComponent, BackgroundNavigation_Factory, WakeupSchedulerAgent_MembersInjector, Agent_MembersInjector, 
//            Agent, WakeupSchedulerAgent, LayoutExperience

public final class DaggerAgentComponent
    implements AgentComponent
{
    public static final class Builder
    {

        private SkypeApplicationComponent skypeApplicationComponent;

        public final AgentComponent build()
        {
            if (skypeApplicationComponent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerAgentComponent(this);
            }
        }

        public final Builder skypeApplicationComponent(SkypeApplicationComponent skypeapplicationcomponent)
        {
            if (skypeapplicationcomponent == null)
            {
                throw new NullPointerException();
            } else
            {
                skypeApplicationComponent = skypeapplicationcomponent;
                return this;
            }
        }


        private Builder()
        {
        }

    }


    static final boolean $assertionsDisabled;
    private MembersInjector accessAgentMembersInjector;
    private MembersInjector accountAgentMembersInjector;
    private Provider accountManagerProvider;
    private Provider accountProvider;
    private Provider accountProvider1;
    private Provider accountTaskCompositionProvider;
    private Provider adManagerInitializerProvider;
    private Provider adManagerProvider;
    private MembersInjector agentMembersInjector;
    private Provider analyticsInAppObserverProvider;
    private Provider analyticsProvider;
    private Provider applicationConfigProvider;
    private Provider applicationProvider;
    private Provider asyncServiceProvider;
    private Provider backgroundNavigationProvider;
    private MembersInjector callAgentMembersInjector;
    private Provider chatServiceMonitorProvider;
    private Provider chatTextProvider;
    private Provider configUpdateProvider;
    private Provider configUpdaterProvider;
    private MembersInjector contactAgentMembersInjector;
    private Provider contactMoodCacheProvider;
    private Provider contactUtilProvider;
    private Provider contactsIngestManagerProvider;
    private MembersInjector contactsScrapeAgentMembersInjector;
    private Provider contextProvider;
    private Provider conversationUtilProvider;
    private Provider crashReporterContactProvider;
    private Provider crashReporterProvider;
    private Provider createDeviceAccountProvider;
    private Provider defaultAvatarsProvider;
    private Provider dreamKeeperProvider;
    private Provider ecsClientProvider;
    private Provider ecsConfigurationProvider;
    private Provider eventBusProvider;
    private Provider externalCacheCleanupProvider;
    private Provider foregroundStateProvider;
    private Provider formattedMessageCacheProvider;
    private Provider getAnalyticsPersistentStorageProvider;
    private Provider httpUtilProvider;
    private Provider imageCacheProvider;
    private Provider layoutExperienceProvider;
    private Provider mediaDocumentDownloadUtilProvider;
    private Provider mediaDocumentUploadUtilProvider;
    private MembersInjector mediaMessageAgentMembersInjector;
    private MembersInjector mediaSaveToGalleryAgentMembersInjector;
    private MembersInjector messageAgentMembersInjector;
    private Provider migratePreferencesProvider;
    private Provider networkUtilProvider;
    private Provider notificationManagerProvider;
    private Provider objectIdMapProvider;
    private Provider pushManagerProvider;
    private Provider pushMessageRepositoryProvider;
    private Provider pushServiceRegisterProvider;
    private Provider reportAccountStatsProvider;
    private Provider sctManagerProvider;
    private Provider signInDurationReporterProvider;
    private Provider skyLibProvider;
    private Provider skypePreferenceListenerProvider;
    private Provider soundsProvider;
    private Provider telemetryHelperProvider;
    private Provider timeAnomalyTelemetryProvider;
    private Provider timeUtilProvider;
    private MembersInjector transferAgentMembersInjector;
    private Provider transferQueueProvider;
    private Provider transferUtilProvider;
    private Provider urlPreviewMediaAgentProvider;
    private Provider urlsProvider;
    private MembersInjector userPreferencesMembersInjector;
    private Provider userPreferencesProvider;
    private Provider vibratorProvider;
    private MembersInjector wakeupSchedulerAgentMembersInjector;
    private Provider webConfigUpdaterProvider;

    private DaggerAgentComponent(Builder builder1)
    {
        if (!$assertionsDisabled && builder1 == null)
        {
            throw new AssertionError();
        } else
        {
            initialize(builder1);
            return;
        }
    }


    public static Builder builder()
    {
        return new Builder();
    }

    private void initialize(final Builder builder)
    {
        accountProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final Account get()
            {
                Account account = skypeApplicationComponent.account();
                if (account == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return account;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        vibratorProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final Vibrator get()
            {
                Vibrator vibrator = skypeApplicationComponent.vibrator();
                if (vibrator == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return vibrator;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        userPreferencesMembersInjector = UserPreferences_MembersInjector.create(vibratorProvider);
        applicationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final Application get()
            {
                Application application = skypeApplicationComponent.application();
                if (application == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return application;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        userPreferencesProvider = UserPreferences_Factory.create(userPreferencesMembersInjector, accountProvider, applicationProvider);
        skyLibProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final SkyLib get()
            {
                SkyLib skylib = skypeApplicationComponent.skyLib();
                if (skylib == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return skylib;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        imageCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final ImageCache get()
            {
                ImageCache imagecache = skypeApplicationComponent.imageCache();
                if (imagecache == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return imagecache;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        notificationManagerProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final NotificationManager get()
            {
                NotificationManager notificationmanager = skypeApplicationComponent.notificationManager();
                if (notificationmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return notificationmanager;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        objectIdMapProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final ObjectIdMap get()
            {
                ObjectIdMap objectidmap = skypeApplicationComponent.objectIdMap();
                if (objectidmap == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return objectidmap;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        contactMoodCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final ContactMoodCache get()
            {
                ContactMoodCache contactmoodcache = skypeApplicationComponent.contactMoodCache();
                if (contactmoodcache == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return contactmoodcache;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        ecsConfigurationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final EcsConfiguration get()
            {
                EcsConfiguration ecsconfiguration = skypeApplicationComponent.ecsConfiguration();
                if (ecsconfiguration == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return ecsconfiguration;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        defaultAvatarsProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final DefaultAvatars get()
            {
                DefaultAvatars defaultavatars = skypeApplicationComponent.defaultAvatars();
                if (defaultavatars == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return defaultavatars;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        contactUtilProvider = ContactUtil_Factory.create(applicationProvider, accountProvider, skyLibProvider, objectIdMapProvider, contactMoodCacheProvider, ecsConfigurationProvider, imageCacheProvider, defaultAvatarsProvider);
        foregroundStateProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final ForegroundState get()
            {
                ForegroundState foregroundstate = skypeApplicationComponent.foregroundState();
                if (foregroundstate == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return foregroundstate;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        timeUtilProvider = TimeUtil_Factory.create(applicationProvider);
        contactAgentMembersInjector = ContactAgent_MembersInjector.create(accountProvider, userPreferencesProvider, skyLibProvider, imageCacheProvider, notificationManagerProvider, objectIdMapProvider, contactUtilProvider, foregroundStateProvider, timeUtilProvider);
        callAgentMembersInjector = CallAgent_MembersInjector.create(accountProvider, userPreferencesProvider);
        asyncServiceProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final AsyncService get()
            {
                AsyncService asyncservice = skypeApplicationComponent.asyncService();
                if (asyncservice == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return asyncservice;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        analyticsProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final Analytics get()
            {
                Analytics analytics = skypeApplicationComponent.analytics();
                if (analytics == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return analytics;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        httpUtilProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final HttpUtil get()
            {
                HttpUtil httputil = skypeApplicationComponent.httpUtil();
                if (httputil == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return httputil;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        urlPreviewMediaAgentProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final UrlPreviewMediaAgent get()
            {
                UrlPreviewMediaAgent urlpreviewmediaagent = skypeApplicationComponent.urlPreviewMediaAgent();
                if (urlpreviewmediaagent == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return urlpreviewmediaagent;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        mediaDocumentDownloadUtilProvider = MediaDocumentDownloadUtil_Factory.create(applicationProvider, asyncServiceProvider, httpUtilProvider, imageCacheProvider, objectIdMapProvider, skyLibProvider, urlPreviewMediaAgentProvider);
        eventBusProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final EventBus get()
            {
                EventBus eventbus = skypeApplicationComponent.eventBus();
                if (eventbus == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return eventbus;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        mediaSaveToGalleryAgentMembersInjector = MediaSaveToGalleryAgent_MembersInjector.create(accountProvider, userPreferencesProvider, asyncServiceProvider, analyticsProvider, objectIdMapProvider, mediaDocumentDownloadUtilProvider, eventBusProvider);
        soundsProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final Sounds get()
            {
                Sounds sounds = skypeApplicationComponent.sounds();
                if (sounds == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return sounds;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        pushManagerProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final PushManager get()
            {
                PushManager pushmanager = skypeApplicationComponent.pushManager();
                if (pushmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return pushmanager;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        networkUtilProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final NetworkUtil get()
            {
                NetworkUtil networkutil = skypeApplicationComponent.networkUtil();
                if (networkutil == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return networkutil;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        contactsIngestManagerProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final ContactsIngestManager get()
            {
                ContactsIngestManager contactsingestmanager = skypeApplicationComponent.contactsIngestManager();
                if (contactsingestmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return contactsingestmanager;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        skypePreferenceListenerProvider = SkypePreferenceListener_Factory.create(applicationProvider, contactsIngestManagerProvider);
        adManagerProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final AdManager get()
            {
                AdManager admanager = skypeApplicationComponent.adManager();
                if (admanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return admanager;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        applicationConfigProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final ApplicationConfig get()
            {
                ApplicationConfig applicationconfig = skypeApplicationComponent.applicationConfig();
                if (applicationconfig == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return applicationconfig;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        adManagerInitializerProvider = AdManagerInitializer_Factory.create(applicationProvider, adManagerProvider, applicationConfigProvider, userPreferencesProvider, asyncServiceProvider, eventBusProvider);
        accountProvider1 = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final AccountProvider get()
            {
                AccountProvider accountprovider = skypeApplicationComponent.accountProvider();
                if (accountprovider == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return accountprovider;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        dreamKeeperProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final DreamKeeper get()
            {
                DreamKeeper dreamkeeper = skypeApplicationComponent.dreamKeeper();
                if (dreamkeeper == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dreamkeeper;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        formattedMessageCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final FormattedMessageCache get()
            {
                FormattedMessageCache formattedmessagecache = skypeApplicationComponent.formattedMessageCache();
                if (formattedmessagecache == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return formattedmessagecache;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        chatTextProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final ChatText get()
            {
                ChatText chattext = skypeApplicationComponent.chatText();
                if (chattext == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return chattext;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        conversationUtilProvider = ConversationUtil_Factory.create(applicationProvider, asyncServiceProvider, skyLibProvider, objectIdMapProvider, formattedMessageCacheProvider, accountProvider, contactUtilProvider, ecsConfigurationProvider, chatTextProvider);
        signInDurationReporterProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final SignInDurationReporter get()
            {
                SignInDurationReporter signindurationreporter = skypeApplicationComponent.signInDurationReporter();
                if (signindurationreporter == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return signindurationreporter;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        getAnalyticsPersistentStorageProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final AnalyticsPersistentStorage get()
            {
                AnalyticsPersistentStorage analyticspersistentstorage = skypeApplicationComponent.getAnalyticsPersistentStorage();
                if (analyticspersistentstorage == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return analyticspersistentstorage;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        layoutExperienceProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final LayoutExperience get()
            {
                LayoutExperience layoutexperience = skypeApplicationComponent.layoutExperience();
                if (layoutexperience == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return layoutexperience;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        backgroundNavigationProvider = BackgroundNavigation_Factory.create(MembersInjectors.a(), applicationProvider, accountProvider1, skyLibProvider, dreamKeeperProvider, conversationUtilProvider, analyticsProvider, networkUtilProvider, ecsConfigurationProvider, signInDurationReporterProvider, getAnalyticsPersistentStorageProvider, layoutExperienceProvider, timeUtilProvider);
        sctManagerProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final SCTManager get()
            {
                SCTManager sctmanager = skypeApplicationComponent.sctManager();
                if (sctmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return sctmanager;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        ecsClientProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final EcsClient get()
            {
                EcsClient ecsclient = skypeApplicationComponent.ecsClient();
                if (ecsclient == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return ecsclient;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        telemetryHelperProvider = TelemetryHelper_Factory.create(applicationProvider, sctManagerProvider, ecsClientProvider, networkUtilProvider, getAnalyticsPersistentStorageProvider);
        accountManagerProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final AccountManager get()
            {
                AccountManager accountmanager = skypeApplicationComponent.accountManager();
                if (accountmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return accountmanager;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        createDeviceAccountProvider = CreateDeviceAccount_Factory.create(applicationProvider, accountManagerProvider, userPreferencesProvider, timeUtilProvider);
        contextProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final Context get()
            {
                Context context = skypeApplicationComponent.context();
                if (context == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return context;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        pushMessageRepositoryProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final PushMessageRepository get()
            {
                PushMessageRepository pushmessagerepository = skypeApplicationComponent.pushMessageRepository();
                if (pushmessagerepository == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return pushmessagerepository;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        pushServiceRegisterProvider = PushServiceRegister_Factory.create(contextProvider, pushMessageRepositoryProvider);
        migratePreferencesProvider = MigratePreferences_Factory.create(contextProvider, userPreferencesProvider);
        configUpdaterProvider = ConfigUpdater_Factory.create(applicationProvider);
        webConfigUpdaterProvider = WebConfigUpdater_Factory.create(contextProvider, httpUtilProvider);
        urlsProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final Urls get()
            {
                Urls urls = skypeApplicationComponent.urls();
                if (urls == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return urls;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        configUpdateProvider = ConfigUpdate_Factory.create(applicationProvider, applicationConfigProvider, configUpdaterProvider, webConfigUpdaterProvider, urlsProvider);
        reportAccountStatsProvider = ReportAccountStats_Factory.create(contextProvider, analyticsProvider, userPreferencesProvider, skyLibProvider);
        crashReporterProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final CrashReporter get()
            {
                CrashReporter crashreporter = skypeApplicationComponent.crashReporter();
                if (crashreporter == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return crashreporter;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        crashReporterContactProvider = CrashReporterContact_Factory.create(crashReporterProvider);
        externalCacheCleanupProvider = ExternalCacheCleanup_Factory.create(contextProvider);
        analyticsInAppObserverProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final AnalyticsInAppObserver get()
            {
                AnalyticsInAppObserver analyticsinappobserver = skypeApplicationComponent.analyticsInAppObserver();
                if (analyticsinappobserver == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return analyticsinappobserver;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        accountTaskCompositionProvider = AccountTaskComposition_Factory.create(createDeviceAccountProvider, pushServiceRegisterProvider, migratePreferencesProvider, configUpdateProvider, reportAccountStatsProvider, crashReporterContactProvider, externalCacheCleanupProvider, analyticsInAppObserverProvider);
        chatServiceMonitorProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final ChatServiceMonitor get()
            {
                ChatServiceMonitor chatservicemonitor = skypeApplicationComponent.chatServiceMonitor();
                if (chatservicemonitor == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return chatservicemonitor;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        accountAgentMembersInjector = AccountAgent_MembersInjector.create(accountProvider, userPreferencesProvider, analyticsProvider, foregroundStateProvider, soundsProvider, notificationManagerProvider, pushManagerProvider, contactUtilProvider, skyLibProvider, networkUtilProvider, skypePreferenceListenerProvider, adManagerInitializerProvider, backgroundNavigationProvider, telemetryHelperProvider, accountTaskCompositionProvider, imageCacheProvider, timeUtilProvider, chatServiceMonitorProvider, getAnalyticsPersistentStorageProvider);
        contactsScrapeAgentMembersInjector = ContactsScrapeAgent_MembersInjector.create(accountProvider, userPreferencesProvider);
        accessAgentMembersInjector = AccessAgent_MembersInjector.create(accountProvider, userPreferencesProvider, skyLibProvider);
        wakeupSchedulerAgentMembersInjector = WakeupSchedulerAgent_MembersInjector.create(accountProvider, userPreferencesProvider);
        messageAgentMembersInjector = MessageAgent_MembersInjector.create(accountProvider, userPreferencesProvider);
        agentMembersInjector = Agent_MembersInjector.create(accountProvider, userPreferencesProvider);
        mediaDocumentUploadUtilProvider = MediaDocumentUploadUtil_Factory.create(applicationProvider, asyncServiceProvider, skyLibProvider, conversationUtilProvider, imageCacheProvider, ecsConfigurationProvider, eventBusProvider);
        mediaMessageAgentMembersInjector = MediaMessageAgent_MembersInjector.create(accountProvider, userPreferencesProvider, skyLibProvider, analyticsProvider, notificationManagerProvider, conversationUtilProvider, imageCacheProvider, mediaDocumentUploadUtilProvider, networkUtilProvider, contactUtilProvider, accountProvider1);
        transferQueueProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final TransferQueue get()
            {
                TransferQueue transferqueue = skypeApplicationComponent.transferQueue();
                if (transferqueue == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return transferqueue;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        timeAnomalyTelemetryProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAgentComponent this$0;
            final Builder val$builder;

            public final TimeAnomalyTelemetry get()
            {
                TimeAnomalyTelemetry timeanomalytelemetry = skypeApplicationComponent.timeAnomalyTelemetry();
                if (timeanomalytelemetry == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return timeanomalytelemetry;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAgentComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        transferUtilProvider = TransferUtil_Factory.create(contextProvider, accountProvider1, objectIdMapProvider, timeUtilProvider, timeAnomalyTelemetryProvider, analyticsProvider);
        transferAgentMembersInjector = TransferAgent_MembersInjector.create(accountProvider, userPreferencesProvider, transferQueueProvider, skyLibProvider, objectIdMapProvider, notificationManagerProvider, transferUtilProvider, analyticsProvider);
    }

    public final void inject(Agent agent)
    {
        agentMembersInjector.injectMembers(agent);
    }

    public final void inject(WakeupSchedulerAgent wakeupscheduleragent)
    {
        wakeupSchedulerAgentMembersInjector.injectMembers(wakeupscheduleragent);
    }

    public final void inject(AccessAgent accessagent)
    {
        accessAgentMembersInjector.injectMembers(accessagent);
    }

    public final void inject(CallAgent callagent)
    {
        callAgentMembersInjector.injectMembers(callagent);
    }

    public final void inject(MessageAgent messageagent)
    {
        messageAgentMembersInjector.injectMembers(messageagent);
    }

    public final void inject(ContactAgent contactagent)
    {
        contactAgentMembersInjector.injectMembers(contactagent);
    }

    public final void inject(MediaMessageAgent mediamessageagent)
    {
        mediaMessageAgentMembersInjector.injectMembers(mediamessageagent);
    }

    public final void inject(MediaSaveToGalleryAgent mediasavetogalleryagent)
    {
        mediaSaveToGalleryAgentMembersInjector.injectMembers(mediasavetogalleryagent);
    }

    public final void inject(AccountAgent accountagent)
    {
        accountAgentMembersInjector.injectMembers(accountagent);
    }

    public final void inject(TransferAgent transferagent)
    {
        transferAgentMembersInjector.injectMembers(transferagent);
    }

    public final void inject(ContactsScrapeAgent contactsscrapeagent)
    {
        contactsScrapeAgentMembersInjector.injectMembers(contactsscrapeagent);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/DaggerAgentComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
