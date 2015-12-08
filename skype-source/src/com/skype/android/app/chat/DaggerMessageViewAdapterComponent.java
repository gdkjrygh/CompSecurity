// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.Translator;
import com.skype.android.SkypeApplicationComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.NavigationUrl_Factory;
import com.skype.android.app.Navigation_Factory;
import com.skype.android.app.calling.CallQualityFeedbackManager;
import com.skype.android.app.media.MediaDocumentUploadUtil_Factory;
import com.skype.android.app.settings.UserPreferences_Factory;
import com.skype.android.app.settings.UserPreferences_MembersInjector;
import com.skype.android.app.transfer.TransferQueue;
import com.skype.android.app.transfer.TransferThumbnails_Factory;
import com.skype.android.app.transfer.TransferUtil_Factory;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.inject.AccountProvider;
import com.skype.android.inject.ActivityModule;
import com.skype.android.inject.ActivityModule_ActivityFactory;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.res.ChatText;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.res.Urls;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.telemetry.LoggingTelemetry_Factory;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.util.ContactUtil_Factory;
import com.skype.android.util.ConversationUtil_Factory;
import com.skype.android.util.ImageCache;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil_Factory;
import com.skype.android.util.accessibility.AccessibilityUtil_Factory;
import com.skype.android.util.cache.ContactMoodCache;
import com.skype.android.util.cache.FormattedMessageCache;
import com.skype.android.util.permission.PermissionRequestStorage;
import com.skype.android.util.permission.PermissionRequest_Factory;
import com.skype.android.wakeup.DreamKeeper;
import com.skype.pcmhost.PcmHost;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            MessageViewAdapterComponent, AnnotationUtil_Factory, MessageHolderUtil_Factory, MojiMediaMessageViewAdapter_MembersInjector, 
//            CallNotificationViewAdapter_MembersInjector, TextMessageViewAdapter_MembersInjector, ContactRequestViewAdapter_MembersInjector, AsyncMediaViewAdapter_MembersInjector, 
//            VideomailMessageViewAdapter_MembersInjector, TransferMessageViewAdapter_MembersInjector, DefaultMessageViewAdapter_MembersInjector, XmmMessageViewAdapter_MembersInjector, 
//            MessageViewAdapter_MembersInjector, MediaMessageViewAdapter_MembersInjector, LocationMessageViewAdapter_MembersInjector, VoicemailMessageViewAdapter_MembersInjector, 
//            AsyncMediaViewAdapter, CallNotificationViewAdapter, MediaMessageViewAdapter, MessageViewAdapter, 
//            MojiMediaMessageViewAdapter, TextMessageViewAdapter, XmmMessageViewAdapter, a, 
//            b, g, k, l, 
//            m

public final class DaggerMessageViewAdapterComponent
    implements MessageViewAdapterComponent
{
    public static final class Builder
    {

        private ActivityModule activityModule;
        private SkypeApplicationComponent skypeApplicationComponent;

        public final Builder activityModule(ActivityModule activitymodule)
        {
            if (activitymodule == null)
            {
                throw new NullPointerException();
            } else
            {
                activityModule = activitymodule;
                return this;
            }
        }

        public final MessageViewAdapterComponent build()
        {
            if (activityModule == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/inject/ActivityModule.getCanonicalName()).append(" must be set").toString());
            }
            if (skypeApplicationComponent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerMessageViewAdapterComponent(this);
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
    private Provider accessibilityUtilProvider;
    private Provider accountProvider;
    private Provider accountProvider1;
    private Provider activityProvider;
    private Provider analyticsProvider;
    private Provider annotationUtilProvider;
    private Provider applicationProvider;
    private MembersInjector asyncMediaViewAdapterMembersInjector;
    private Provider asyncServiceProvider;
    private Provider audioManagerProvider;
    private MembersInjector callNotificationViewAdapterMembersInjector;
    private Provider callQualityFeedbackManagerProvider;
    private Provider chatTextProvider;
    private Provider contactMoodCacheProvider;
    private MembersInjector contactRequestViewAdapterMembersInjector;
    private Provider contactUtilProvider;
    private Provider contextProvider;
    private Provider conversationUtilProvider;
    private Provider defaultAvatarsProvider;
    private MembersInjector defaultMessageViewAdapterMembersInjector;
    private Provider dreamKeeperProvider;
    private Provider ecsClientProvider;
    private Provider ecsConfigurationProvider;
    private Provider eventBusProvider;
    private Provider formattedMessageCacheProvider;
    private Provider getAnalyticsPersistentStorageProvider;
    private Provider getPermissionRequestStorageProvider;
    private Provider getTranslatorProvider;
    private Provider imageCacheProvider;
    private Provider layoutExperienceProvider;
    private MembersInjector locationMessageViewAdapterMembersInjector;
    private Provider loggingTelemetryProvider;
    private Provider mediaContentRosterProvider;
    private Provider mediaDocumentUploadUtilProvider;
    private MembersInjector mediaMessageViewAdapterMembersInjector;
    private Provider messageHolderUtilProvider;
    private MembersInjector messageViewAdapterMembersInjector;
    private MembersInjector mojiMediaMessageViewAdapterMembersInjector;
    private Provider navigationProvider;
    private Provider navigationUrlProvider;
    private Provider networkUtilProvider;
    private Provider notificationManagerProvider;
    private Provider objectIdMapProvider;
    private Provider pcmHostProvider;
    private Provider permissionRequestProvider;
    private Provider sctManagerProvider;
    private Provider signInDurationReporterProvider;
    private Provider skyLibProvider;
    private MembersInjector textMessageViewAdapterMembersInjector;
    private Provider timeAnomalyTelemetryProvider;
    private Provider timeUtilProvider;
    private MembersInjector transferMessageViewAdapterMembersInjector;
    private Provider transferQueueProvider;
    private Provider transferThumbnailsProvider;
    private Provider transferUtilProvider;
    private Provider urlsProvider;
    private MembersInjector userPreferencesMembersInjector;
    private Provider userPreferencesProvider;
    private Provider vibratorProvider;
    private MembersInjector videomailMessageViewAdapterMembersInjector;
    private MembersInjector voicemailMessageViewAdapterMembersInjector;
    private MembersInjector xmmMessageViewAdapterMembersInjector;

    private DaggerMessageViewAdapterComponent(Builder builder1)
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
        applicationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        timeUtilProvider = TimeUtil_Factory.create(applicationProvider);
        accountProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        skyLibProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        objectIdMapProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        contactMoodCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        ecsConfigurationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        imageCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        defaultAvatarsProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        contactUtilProvider = ContactUtil_Factory.create(applicationProvider, accountProvider, skyLibProvider, objectIdMapProvider, contactMoodCacheProvider, ecsConfigurationProvider, imageCacheProvider, defaultAvatarsProvider);
        activityProvider = ActivityModule_ActivityFactory.create(builder.activityModule);
        accountProvider1 = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        dreamKeeperProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        asyncServiceProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        formattedMessageCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        chatTextProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        conversationUtilProvider = ConversationUtil_Factory.create(applicationProvider, asyncServiceProvider, skyLibProvider, objectIdMapProvider, formattedMessageCacheProvider, accountProvider, contactUtilProvider, ecsConfigurationProvider, chatTextProvider);
        analyticsProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        networkUtilProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        signInDurationReporterProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        getAnalyticsPersistentStorageProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        layoutExperienceProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        navigationProvider = Navigation_Factory.create(activityProvider, accountProvider1, skyLibProvider, dreamKeeperProvider, conversationUtilProvider, analyticsProvider, networkUtilProvider, ecsConfigurationProvider, signInDurationReporterProvider, getAnalyticsPersistentStorageProvider, layoutExperienceProvider, timeUtilProvider);
        contextProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        urlsProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        navigationUrlProvider = NavigationUrl_Factory.create(contextProvider, urlsProvider);
        accessibilityUtilProvider = AccessibilityUtil_Factory.create(contextProvider);
        annotationUtilProvider = AnnotationUtil_Factory.create(objectIdMapProvider);
        messageHolderUtilProvider = MessageHolderUtil_Factory.create(accountProvider, objectIdMapProvider);
        eventBusProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        mediaDocumentUploadUtilProvider = MediaDocumentUploadUtil_Factory.create(applicationProvider, asyncServiceProvider, skyLibProvider, conversationUtilProvider, imageCacheProvider, ecsConfigurationProvider, eventBusProvider);
        timeAnomalyTelemetryProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        mojiMediaMessageViewAdapterMembersInjector = MojiMediaMessageViewAdapter_MembersInjector.create(timeUtilProvider, contactUtilProvider, imageCacheProvider, navigationProvider, navigationUrlProvider, accessibilityUtilProvider, analyticsProvider, ecsConfigurationProvider, annotationUtilProvider, messageHolderUtilProvider, objectIdMapProvider, skyLibProvider, mediaDocumentUploadUtilProvider, conversationUtilProvider, timeAnomalyTelemetryProvider);
        callQualityFeedbackManagerProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
            final Builder val$builder;

            public final CallQualityFeedbackManager get()
            {
                CallQualityFeedbackManager callqualityfeedbackmanager = skypeApplicationComponent.callQualityFeedbackManager();
                if (callqualityfeedbackmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return callqualityfeedbackmanager;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        callNotificationViewAdapterMembersInjector = CallNotificationViewAdapter_MembersInjector.create(timeUtilProvider, contactUtilProvider, imageCacheProvider, navigationProvider, navigationUrlProvider, accessibilityUtilProvider, analyticsProvider, ecsConfigurationProvider, annotationUtilProvider, messageHolderUtilProvider, skyLibProvider, formattedMessageCacheProvider, callQualityFeedbackManagerProvider, conversationUtilProvider);
        vibratorProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        userPreferencesMembersInjector = UserPreferences_MembersInjector.create(vibratorProvider);
        userPreferencesProvider = UserPreferences_Factory.create(userPreferencesMembersInjector, accountProvider, applicationProvider);
        sctManagerProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        ecsClientProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        loggingTelemetryProvider = LoggingTelemetry_Factory.create(MembersInjectors.a(), applicationProvider, sctManagerProvider, ecsClientProvider, networkUtilProvider, getAnalyticsPersistentStorageProvider);
        getTranslatorProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
            final Builder val$builder;

            public final Translator get()
            {
                Translator translator = skypeApplicationComponent.getTranslator();
                if (translator == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return translator;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        textMessageViewAdapterMembersInjector = TextMessageViewAdapter_MembersInjector.create(timeUtilProvider, contactUtilProvider, imageCacheProvider, navigationProvider, navigationUrlProvider, accessibilityUtilProvider, analyticsProvider, ecsConfigurationProvider, annotationUtilProvider, messageHolderUtilProvider, skyLibProvider, formattedMessageCacheProvider, conversationUtilProvider, userPreferencesProvider, loggingTelemetryProvider, objectIdMapProvider, getTranslatorProvider);
        notificationManagerProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        contactRequestViewAdapterMembersInjector = ContactRequestViewAdapter_MembersInjector.create(timeUtilProvider, contactUtilProvider, imageCacheProvider, navigationProvider, navigationUrlProvider, accessibilityUtilProvider, analyticsProvider, ecsConfigurationProvider, annotationUtilProvider, messageHolderUtilProvider, skyLibProvider, formattedMessageCacheProvider, chatTextProvider, notificationManagerProvider);
        asyncMediaViewAdapterMembersInjector = AsyncMediaViewAdapter_MembersInjector.create(timeUtilProvider, contactUtilProvider, imageCacheProvider, navigationProvider, navigationUrlProvider, accessibilityUtilProvider, analyticsProvider, ecsConfigurationProvider, annotationUtilProvider, messageHolderUtilProvider, objectIdMapProvider, skyLibProvider, mediaDocumentUploadUtilProvider, conversationUtilProvider, timeAnomalyTelemetryProvider, networkUtilProvider);
        videomailMessageViewAdapterMembersInjector = VideomailMessageViewAdapter_MembersInjector.create(timeUtilProvider, contactUtilProvider, imageCacheProvider, navigationProvider, navigationUrlProvider, accessibilityUtilProvider, analyticsProvider, ecsConfigurationProvider, annotationUtilProvider, messageHolderUtilProvider, chatTextProvider, objectIdMapProvider, conversationUtilProvider);
        transferQueueProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
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
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        transferUtilProvider = TransferUtil_Factory.create(contextProvider, accountProvider1, objectIdMapProvider, timeUtilProvider, timeAnomalyTelemetryProvider, analyticsProvider);
        transferThumbnailsProvider = TransferThumbnails_Factory.create(contextProvider, transferUtilProvider);
        transferMessageViewAdapterMembersInjector = TransferMessageViewAdapter_MembersInjector.create(timeUtilProvider, contactUtilProvider, imageCacheProvider, navigationProvider, navigationUrlProvider, accessibilityUtilProvider, analyticsProvider, ecsConfigurationProvider, annotationUtilProvider, messageHolderUtilProvider, transferQueueProvider, transferThumbnailsProvider, transferUtilProvider);
        mediaContentRosterProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
            final Builder val$builder;

            public final MediaContentRoster get()
            {
                MediaContentRoster mediacontentroster = skypeApplicationComponent.mediaContentRoster();
                if (mediacontentroster == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return mediacontentroster;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        defaultMessageViewAdapterMembersInjector = DefaultMessageViewAdapter_MembersInjector.create(timeUtilProvider, contactUtilProvider, imageCacheProvider, navigationProvider, navigationUrlProvider, accessibilityUtilProvider, analyticsProvider, ecsConfigurationProvider, annotationUtilProvider, messageHolderUtilProvider, skyLibProvider, formattedMessageCacheProvider, mediaContentRosterProvider);
        xmmMessageViewAdapterMembersInjector = XmmMessageViewAdapter_MembersInjector.create(timeUtilProvider, contactUtilProvider, imageCacheProvider, navigationProvider, navigationUrlProvider, accessibilityUtilProvider, analyticsProvider, ecsConfigurationProvider, annotationUtilProvider, messageHolderUtilProvider, objectIdMapProvider, skyLibProvider, mediaDocumentUploadUtilProvider, conversationUtilProvider, timeAnomalyTelemetryProvider);
        messageViewAdapterMembersInjector = MessageViewAdapter_MembersInjector.create(timeUtilProvider, contactUtilProvider, imageCacheProvider, navigationProvider, navigationUrlProvider, accessibilityUtilProvider, analyticsProvider, ecsConfigurationProvider, annotationUtilProvider, messageHolderUtilProvider);
        mediaMessageViewAdapterMembersInjector = MediaMessageViewAdapter_MembersInjector.create(timeUtilProvider, contactUtilProvider, imageCacheProvider, navigationProvider, navigationUrlProvider, accessibilityUtilProvider, analyticsProvider, ecsConfigurationProvider, annotationUtilProvider, messageHolderUtilProvider, objectIdMapProvider, skyLibProvider, mediaDocumentUploadUtilProvider, conversationUtilProvider, timeAnomalyTelemetryProvider);
        getPermissionRequestStorageProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
            final Builder val$builder;

            public final PermissionRequestStorage get()
            {
                PermissionRequestStorage permissionrequeststorage = skypeApplicationComponent.getPermissionRequestStorage();
                if (permissionrequeststorage == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return permissionrequeststorage;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        permissionRequestProvider = PermissionRequest_Factory.create(MembersInjectors.a(), activityProvider, getPermissionRequestStorageProvider);
        locationMessageViewAdapterMembersInjector = LocationMessageViewAdapter_MembersInjector.create(timeUtilProvider, contactUtilProvider, imageCacheProvider, navigationProvider, navigationUrlProvider, accessibilityUtilProvider, analyticsProvider, ecsConfigurationProvider, annotationUtilProvider, messageHolderUtilProvider, conversationUtilProvider, permissionRequestProvider);
        pcmHostProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
            final Builder val$builder;

            public final PcmHost get()
            {
                PcmHost pcmhost = skypeApplicationComponent.pcmHost();
                if (pcmhost == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return pcmhost;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        audioManagerProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageViewAdapterComponent this$0;
            final Builder val$builder;

            public final AudioManager get()
            {
                AudioManager audiomanager = skypeApplicationComponent.audioManager();
                if (audiomanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return audiomanager;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerMessageViewAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        voicemailMessageViewAdapterMembersInjector = VoicemailMessageViewAdapter_MembersInjector.create(timeUtilProvider, contactUtilProvider, imageCacheProvider, navigationProvider, navigationUrlProvider, accessibilityUtilProvider, analyticsProvider, ecsConfigurationProvider, annotationUtilProvider, messageHolderUtilProvider, accountProvider, skyLibProvider, pcmHostProvider, conversationUtilProvider, audioManagerProvider, objectIdMapProvider, layoutExperienceProvider, timeAnomalyTelemetryProvider);
    }

    public final void inject(AsyncMediaViewAdapter asyncmediaviewadapter)
    {
        asyncMediaViewAdapterMembersInjector.injectMembers(asyncmediaviewadapter);
    }

    public final void inject(CallNotificationViewAdapter callnotificationviewadapter)
    {
        callNotificationViewAdapterMembersInjector.injectMembers(callnotificationviewadapter);
    }

    public final void inject(MediaMessageViewAdapter mediamessageviewadapter)
    {
        mediaMessageViewAdapterMembersInjector.injectMembers(mediamessageviewadapter);
    }

    public final void inject(MessageViewAdapter messageviewadapter)
    {
        messageViewAdapterMembersInjector.injectMembers(messageviewadapter);
    }

    public final void inject(MojiMediaMessageViewAdapter mojimediamessageviewadapter)
    {
        mojiMediaMessageViewAdapterMembersInjector.injectMembers(mojimediamessageviewadapter);
    }

    public final void inject(TextMessageViewAdapter textmessageviewadapter)
    {
        textMessageViewAdapterMembersInjector.injectMembers(textmessageviewadapter);
    }

    public final void inject(XmmMessageViewAdapter xmmmessageviewadapter)
    {
        xmmMessageViewAdapterMembersInjector.injectMembers(xmmmessageviewadapter);
    }

    public final void inject(a a)
    {
        contactRequestViewAdapterMembersInjector.injectMembers(a);
    }

    public final void inject(b b)
    {
        defaultMessageViewAdapterMembersInjector.injectMembers(b);
    }

    public final void inject(g g)
    {
        locationMessageViewAdapterMembersInjector.injectMembers(g);
    }

    public final void inject(k k)
    {
        transferMessageViewAdapterMembersInjector.injectMembers(k);
    }

    public final void inject(l l)
    {
        videomailMessageViewAdapterMembersInjector.injectMembers(l);
    }

    public final void inject(m m)
    {
        voicemailMessageViewAdapterMembersInjector.injectMembers(m);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/DaggerMessageViewAdapterComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
