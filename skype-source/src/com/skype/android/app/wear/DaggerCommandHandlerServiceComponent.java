// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import android.app.Application;
import android.content.Context;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeApplicationComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.app.BackgroundNavigation_Factory;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.chat.MessageHolderUtil_Factory;
import com.skype.android.app.transfer.TransferUtil_Factory;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.inject.LoginManager_Factory;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.res.ChatText;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil_Factory;
import com.skype.android.util.ConversationUtil_Factory;
import com.skype.android.util.ImageCache;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil_Factory;
import com.skype.android.util.cache.ContactMoodCache;
import com.skype.android.util.cache.FormattedMessageCache;
import com.skype.android.wakeup.DreamKeeper;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.wear:
//            CommandHandlerServiceComponent, CommandHandlerService_MembersInjector, CommandHandlerService, WearDataRequestCache

public final class DaggerCommandHandlerServiceComponent
    implements CommandHandlerServiceComponent
{
    public static final class Builder
    {

        private SkypeApplicationComponent skypeApplicationComponent;

        public final CommandHandlerServiceComponent build()
        {
            if (skypeApplicationComponent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerCommandHandlerServiceComponent(this);
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
    private Provider accountProvider;
    private Provider accountProvider1;
    private Provider analyticsProvider;
    private Provider applicationProvider;
    private Provider asyncServiceProvider;
    private Provider backgroundNavigationProvider;
    private Provider chatTextProvider;
    private MembersInjector commandHandlerServiceMembersInjector;
    private Provider contactMoodCacheProvider;
    private Provider contactUtilProvider;
    private Provider contextProvider;
    private Provider conversationUtilProvider;
    private Provider defaultAvatarsProvider;
    private Provider dreamKeeperProvider;
    private Provider ecsConfigurationProvider;
    private Provider formattedMessageCacheProvider;
    private Provider getAnalyticsPersistentStorageProvider;
    private Provider imageCacheProvider;
    private Provider layoutExperienceProvider;
    private Provider loginManagerProvider;
    private Provider mediaContentRosterProvider;
    private Provider messageHolderUtilProvider;
    private Provider networkUtilProvider;
    private Provider objectIdMapProvider;
    private Provider signInDurationReporterProvider;
    private Provider skyLibProvider;
    private Provider timeAnomalyTelemetryProvider;
    private Provider timeUtilProvider;
    private Provider transferUtilProvider;
    private Provider wearDataRequestCacheProvider;

    private DaggerCommandHandlerServiceComponent(Builder builder1)
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
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        accountProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        skyLibProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        dreamKeeperProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        asyncServiceProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        objectIdMapProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        formattedMessageCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        accountProvider1 = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        contactMoodCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        ecsConfigurationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        imageCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        defaultAvatarsProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        contactUtilProvider = ContactUtil_Factory.create(applicationProvider, accountProvider1, skyLibProvider, objectIdMapProvider, contactMoodCacheProvider, ecsConfigurationProvider, imageCacheProvider, defaultAvatarsProvider);
        chatTextProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        conversationUtilProvider = ConversationUtil_Factory.create(applicationProvider, asyncServiceProvider, skyLibProvider, objectIdMapProvider, formattedMessageCacheProvider, accountProvider1, contactUtilProvider, ecsConfigurationProvider, chatTextProvider);
        analyticsProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        networkUtilProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        signInDurationReporterProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        getAnalyticsPersistentStorageProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        layoutExperienceProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        timeUtilProvider = TimeUtil_Factory.create(applicationProvider);
        backgroundNavigationProvider = BackgroundNavigation_Factory.create(MembersInjectors.a(), applicationProvider, accountProvider, skyLibProvider, dreamKeeperProvider, conversationUtilProvider, analyticsProvider, networkUtilProvider, ecsConfigurationProvider, signInDurationReporterProvider, getAnalyticsPersistentStorageProvider, layoutExperienceProvider, timeUtilProvider);
        loginManagerProvider = LoginManager_Factory.create(applicationProvider, accountProvider1, skyLibProvider);
        mediaContentRosterProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        wearDataRequestCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
            final Builder val$builder;

            public final WearDataRequestCache get()
            {
                WearDataRequestCache weardatarequestcache = skypeApplicationComponent.wearDataRequestCache();
                if (weardatarequestcache == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return weardatarequestcache;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        messageHolderUtilProvider = MessageHolderUtil_Factory.create(accountProvider1, objectIdMapProvider);
        contextProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        timeAnomalyTelemetryProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerCommandHandlerServiceComponent this$0;
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
                this$0 = DaggerCommandHandlerServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        transferUtilProvider = TransferUtil_Factory.create(contextProvider, accountProvider, objectIdMapProvider, timeUtilProvider, timeAnomalyTelemetryProvider, analyticsProvider);
        commandHandlerServiceMembersInjector = CommandHandlerService_MembersInjector.create(backgroundNavigationProvider, skyLibProvider, loginManagerProvider, mediaContentRosterProvider, objectIdMapProvider, conversationUtilProvider, asyncServiceProvider, imageCacheProvider, wearDataRequestCacheProvider, formattedMessageCacheProvider, dreamKeeperProvider, defaultAvatarsProvider, messageHolderUtilProvider, transferUtilProvider, analyticsProvider);
    }

    public final void inject(CommandHandlerService commandhandlerservice)
    {
        commandHandlerServiceMembersInjector.injectMembers(commandhandlerservice);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/wear/DaggerCommandHandlerServiceComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
