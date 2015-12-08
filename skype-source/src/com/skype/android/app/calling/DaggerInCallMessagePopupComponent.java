// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.app.Application;
import android.content.Context;
import android.os.Vibrator;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeApplicationComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.settings.UserPreferences_Factory;
import com.skype.android.app.settings.UserPreferences_MembersInjector;
import com.skype.android.app.transfer.TransferUtil_Factory;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.res.ChatText;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil_Factory;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil_Factory;
import com.skype.android.util.cache.ContactMoodCache;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            InCallMessagePopupComponent, InCallMessagePopup_MembersInjector, InCallMessagePopup

public final class DaggerInCallMessagePopupComponent
    implements InCallMessagePopupComponent
{
    public static final class Builder
    {

        private SkypeApplicationComponent skypeApplicationComponent;

        public final InCallMessagePopupComponent build()
        {
            if (skypeApplicationComponent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerInCallMessagePopupComponent(this);
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
    private Provider chatTextProvider;
    private Provider contactMoodCacheProvider;
    private Provider contactUtilProvider;
    private Provider contextProvider;
    private Provider defaultAvatarsProvider;
    private Provider ecsConfigurationProvider;
    private Provider imageCacheProvider;
    private MembersInjector inCallMessagePopupMembersInjector;
    private Provider objectIdMapProvider;
    private Provider skyLibProvider;
    private Provider timeAnomalyTelemetryProvider;
    private Provider timeUtilProvider;
    private Provider transferUtilProvider;
    private MembersInjector userPreferencesMembersInjector;
    private Provider userPreferencesProvider;
    private Provider vibratorProvider;

    private DaggerInCallMessagePopupComponent(Builder builder1)
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
        chatTextProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerInCallMessagePopupComponent this$0;
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
                this$0 = DaggerInCallMessagePopupComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        applicationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerInCallMessagePopupComponent this$0;
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
                this$0 = DaggerInCallMessagePopupComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        accountProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerInCallMessagePopupComponent this$0;
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
                this$0 = DaggerInCallMessagePopupComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        skyLibProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerInCallMessagePopupComponent this$0;
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
                this$0 = DaggerInCallMessagePopupComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        objectIdMapProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerInCallMessagePopupComponent this$0;
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
                this$0 = DaggerInCallMessagePopupComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        contactMoodCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerInCallMessagePopupComponent this$0;
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
                this$0 = DaggerInCallMessagePopupComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        ecsConfigurationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerInCallMessagePopupComponent this$0;
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
                this$0 = DaggerInCallMessagePopupComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        imageCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerInCallMessagePopupComponent this$0;
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
                this$0 = DaggerInCallMessagePopupComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        defaultAvatarsProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerInCallMessagePopupComponent this$0;
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
                this$0 = DaggerInCallMessagePopupComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        contactUtilProvider = ContactUtil_Factory.create(applicationProvider, accountProvider, skyLibProvider, objectIdMapProvider, contactMoodCacheProvider, ecsConfigurationProvider, imageCacheProvider, defaultAvatarsProvider);
        contextProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerInCallMessagePopupComponent this$0;
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
                this$0 = DaggerInCallMessagePopupComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        accountProvider1 = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerInCallMessagePopupComponent this$0;
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
                this$0 = DaggerInCallMessagePopupComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        timeUtilProvider = TimeUtil_Factory.create(applicationProvider);
        timeAnomalyTelemetryProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerInCallMessagePopupComponent this$0;
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
                this$0 = DaggerInCallMessagePopupComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        analyticsProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerInCallMessagePopupComponent this$0;
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
                this$0 = DaggerInCallMessagePopupComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        transferUtilProvider = TransferUtil_Factory.create(contextProvider, accountProvider1, objectIdMapProvider, timeUtilProvider, timeAnomalyTelemetryProvider, analyticsProvider);
        vibratorProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerInCallMessagePopupComponent this$0;
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
                this$0 = DaggerInCallMessagePopupComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        userPreferencesMembersInjector = UserPreferences_MembersInjector.create(vibratorProvider);
        userPreferencesProvider = UserPreferences_Factory.create(userPreferencesMembersInjector, accountProvider, applicationProvider);
        inCallMessagePopupMembersInjector = InCallMessagePopup_MembersInjector.create(chatTextProvider, contactUtilProvider, imageCacheProvider, skyLibProvider, transferUtilProvider, userPreferencesProvider, ecsConfigurationProvider);
    }

    public final void inject(InCallMessagePopup incallmessagepopup)
    {
        inCallMessagePopupMembersInjector.injectMembers(incallmessagepopup);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/calling/DaggerInCallMessagePopupComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
