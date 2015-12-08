// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.app.calling.SeamlessCapabilityReceiver;
import com.skype.android.app.calling.SeamlessCapabilityReceiver_MembersInjector;
import com.skype.android.app.settings.SnoozeNotificationHelper;
import com.skype.android.app.settings.SnoozeNotificationHelper_MembersInjector;
import com.skype.android.app.settings.UserPreferences_Factory;
import com.skype.android.app.settings.UserPreferences_MembersInjector;
import com.skype.android.app.wearable.CarReadReceiver;
import com.skype.android.app.wearable.CarReadReceiver_MembersInjector;
import com.skype.android.app.wearable.WearReplyReceiver;
import com.skype.android.app.wearable.WearReplyReceiver_MembersInjector;
import com.skype.android.config.partner.CampaignReceiver;
import com.skype.android.config.partner.CampaignReceiver_MembersInjector;
import com.skype.android.inject.LoginManager_Factory;
import com.skype.android.push.RegisterReceiver;
import com.skype.android.push.RegisterReceiver_MembersInjector;
import com.skype.android.service.ContactsAlarmReceiver;
import com.skype.android.service.ContactsAlarmReceiver_MembersInjector;
import com.skype.android.service.GetAccountReceiver;
import com.skype.android.service.GetAccountReceiver_MembersInjector;
import com.skype.android.service.LocaleChangedReceiver;
import com.skype.android.service.LocaleChangedReceiver_MembersInjector;
import com.skype.android.util.ContactUtil_Factory;
import com.skype.android.util.ConversationUtil_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeBroadcastReceiverComponent, SkypeBroadcastReceiver, SkypeApplicationComponent

public final class DaggerSkypeBroadcastReceiverComponent
    implements SkypeBroadcastReceiverComponent
{
    public static final class Builder
    {

        private SkypeApplicationComponent a;

        static SkypeApplicationComponent a(Builder builder1)
        {
            return builder1.a;
        }

        public final Builder a(SkypeApplicationComponent skypeapplicationcomponent)
        {
            if (skypeapplicationcomponent == null)
            {
                throw new NullPointerException();
            } else
            {
                a = skypeapplicationcomponent;
                return this;
            }
        }

        public final SkypeBroadcastReceiverComponent a()
        {
            if (a == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerSkypeBroadcastReceiverComponent(this);
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
    private Provider accountProvider;
    private Provider accountProvider1;
    private Provider analyticsProvider;
    private Provider applicationProvider;
    private Provider asyncServiceProvider;
    private MembersInjector campaignReceiverMembersInjector;
    private MembersInjector carReadReceiverMembersInjector;
    private Provider chatTextProvider;
    private Provider contactMoodCacheProvider;
    private Provider contactUtilProvider;
    private MembersInjector contactsAlarmReceiverMembersInjector;
    private Provider contactsIngestManagerProvider;
    private Provider conversationUtilProvider;
    private Provider defaultAvatarsProvider;
    private Provider dreamKeeperProvider;
    private Provider ecsConfigurationProvider;
    private Provider formattedMessageCacheProvider;
    private MembersInjector getAccountReceiverMembersInjector;
    private Provider imageCacheProvider;
    private MembersInjector localeChangedReceiverMembersInjector;
    private Provider loginManagerProvider;
    private Provider networkUtilProvider;
    private Provider objectIdMapProvider;
    private Provider pushManagerProvider;
    private MembersInjector registerReceiverMembersInjector;
    private MembersInjector seamlessCapabilityReceiverMembersInjector;
    private Provider serverClockProvider;
    private Provider skyLibProvider;
    private MembersInjector snoozeNotificationHelperMembersInjector;
    private Provider spannedStringCacheProvider;
    private MembersInjector userPreferencesMembersInjector;
    private Provider userPreferencesProvider;
    private Provider vibratorProvider;
    private MembersInjector wearReplyReceiverMembersInjector;

    private DaggerSkypeBroadcastReceiverComponent(Builder builder1)
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
        return new Builder((byte)0);
    }

    private void initialize(Builder builder1)
    {
        contactsIngestManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.sync.ContactsIngestManager contactsingestmanager = c.contactsIngestManager();
                if (contactsingestmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return contactsingestmanager;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        contactsAlarmReceiverMembersInjector = ContactsAlarmReceiver_MembersInjector.create(contactsIngestManagerProvider);
        skyLibProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.SkyLib skylib = c.skyLib();
                if (skylib == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return skylib;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        dreamKeeperProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.wakeup.DreamKeeper dreamkeeper = c.dreamKeeper();
                if (dreamkeeper == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dreamkeeper;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        carReadReceiverMembersInjector = CarReadReceiver_MembersInjector.create(skyLibProvider, dreamKeeperProvider);
        ecsConfigurationProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.config.ecs.EcsConfiguration ecsconfiguration = c.ecsConfiguration();
                if (ecsconfiguration == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return ecsconfiguration;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        applicationProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                android.app.Application application = c.application();
                if (application == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return application;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        asyncServiceProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.concurrent.AsyncService asyncservice = c.asyncService();
                if (asyncservice == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return asyncservice;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        objectIdMapProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.skylib.ObjectIdMap objectidmap = c.objectIdMap();
                if (objectidmap == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return objectidmap;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        formattedMessageCacheProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.cache.FormattedMessageCache formattedmessagecache = c.formattedMessageCache();
                if (formattedmessagecache == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return formattedmessagecache;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        accountProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.Account account = c.account();
                if (account == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return account;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        contactMoodCacheProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.cache.ContactMoodCache contactmoodcache = c.contactMoodCache();
                if (contactmoodcache == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return contactmoodcache;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        imageCacheProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.ImageCache imagecache = c.imageCache();
                if (imagecache == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return imagecache;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        defaultAvatarsProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.res.DefaultAvatars defaultavatars = c.defaultAvatars();
                if (defaultavatars == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return defaultavatars;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        contactUtilProvider = ContactUtil_Factory.create(applicationProvider, accountProvider, skyLibProvider, objectIdMapProvider, contactMoodCacheProvider, ecsConfigurationProvider, imageCacheProvider, defaultAvatarsProvider);
        chatTextProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.res.ChatText chattext = c.chatText();
                if (chattext == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return chattext;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        conversationUtilProvider = ConversationUtil_Factory.create(applicationProvider, asyncServiceProvider, skyLibProvider, objectIdMapProvider, formattedMessageCacheProvider, accountProvider, contactUtilProvider, ecsConfigurationProvider, chatTextProvider);
        loginManagerProvider = LoginManager_Factory.create(applicationProvider, accountProvider, skyLibProvider);
        analyticsProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.analytics.Analytics analytics = c.analytics();
                if (analytics == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return analytics;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        wearReplyReceiverMembersInjector = WearReplyReceiver_MembersInjector.create(skyLibProvider, dreamKeeperProvider, ecsConfigurationProvider, conversationUtilProvider, loginManagerProvider, analyticsProvider);
        vibratorProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                android.os.Vibrator vibrator = c.vibrator();
                if (vibrator == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return vibrator;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        userPreferencesMembersInjector = UserPreferences_MembersInjector.create(vibratorProvider);
        userPreferencesProvider = UserPreferences_Factory.create(userPreferencesMembersInjector, accountProvider, applicationProvider);
        snoozeNotificationHelperMembersInjector = SnoozeNotificationHelper_MembersInjector.create(userPreferencesProvider, ecsConfigurationProvider, analyticsProvider);
        campaignReceiverMembersInjector = CampaignReceiver_MembersInjector.create(accountProvider);
        spannedStringCacheProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.cache.SpannedStringCache spannedstringcache = c.spannedStringCache();
                if (spannedstringcache == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return spannedstringcache;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        serverClockProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.ServerClock serverclock = c.serverClock();
                if (serverclock == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return serverclock;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        localeChangedReceiverMembersInjector = LocaleChangedReceiver_MembersInjector.create(spannedStringCacheProvider, serverClockProvider);
        pushManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.push.PushManager pushmanager = c.pushManager();
                if (pushmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return pushmanager;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        registerReceiverMembersInjector = RegisterReceiver_MembersInjector.create(pushManagerProvider, asyncServiceProvider);
        networkUtilProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.NetworkUtil networkutil = c.networkUtil();
                if (networkutil == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return networkutil;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        seamlessCapabilityReceiverMembersInjector = SeamlessCapabilityReceiver_MembersInjector.create(skyLibProvider, networkUtilProvider);
        accountProvider1 = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeBroadcastReceiverComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.inject.AccountProvider accountprovider = c.accountProvider();
                if (accountprovider == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return accountprovider;
                }
            }

            
            {
                b = DaggerSkypeBroadcastReceiverComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        getAccountReceiverMembersInjector = GetAccountReceiver_MembersInjector.create(accountProvider1, loginManagerProvider);
    }

    public final void inject(SkypeBroadcastReceiver skypebroadcastreceiver)
    {
        MembersInjectors.a().injectMembers(skypebroadcastreceiver);
    }

    public final void inject(SeamlessCapabilityReceiver seamlesscapabilityreceiver)
    {
        seamlessCapabilityReceiverMembersInjector.injectMembers(seamlesscapabilityreceiver);
    }

    public final void inject(SnoozeNotificationHelper snoozenotificationhelper)
    {
        snoozeNotificationHelperMembersInjector.injectMembers(snoozenotificationhelper);
    }

    public final void inject(CarReadReceiver carreadreceiver)
    {
        carReadReceiverMembersInjector.injectMembers(carreadreceiver);
    }

    public final void inject(WearReplyReceiver wearreplyreceiver)
    {
        wearReplyReceiverMembersInjector.injectMembers(wearreplyreceiver);
    }

    public final void inject(CampaignReceiver campaignreceiver)
    {
        campaignReceiverMembersInjector.injectMembers(campaignreceiver);
    }

    public final void inject(RegisterReceiver registerreceiver)
    {
        registerReceiverMembersInjector.injectMembers(registerreceiver);
    }

    public final void inject(ContactsAlarmReceiver contactsalarmreceiver)
    {
        contactsAlarmReceiverMembersInjector.injectMembers(contactsalarmreceiver);
    }

    public final void inject(GetAccountReceiver getaccountreceiver)
    {
        getAccountReceiverMembersInjector.injectMembers(getaccountreceiver);
    }

    public final void inject(LocaleChangedReceiver localechangedreceiver)
    {
        localeChangedReceiverMembersInjector.injectMembers(localechangedreceiver);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/DaggerSkypeBroadcastReceiverComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
