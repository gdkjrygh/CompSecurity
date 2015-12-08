// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.app.Application;
import android.os.Vibrator;
import com.skype.Account;
import com.skype.android.SkypeApplicationComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.settings.UserPreferences_Factory;
import com.skype.android.app.settings.UserPreferences_MembersInjector;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.PackInfoUtils_Factory;
import com.skype.android.util.ImageCache;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat.picker:
//            AbstractPickerTabComponent, AbstractPickerTab_MembersInjector, MRUTab_MembersInjector, AbstractPickerTab, 
//            MRUTab, MRUManager

public final class DaggerAbstractPickerTabComponent
    implements AbstractPickerTabComponent
{
    public static final class Builder
    {

        private SkypeApplicationComponent skypeApplicationComponent;

        public final AbstractPickerTabComponent build()
        {
            if (skypeApplicationComponent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerAbstractPickerTabComponent(this);
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
    private MembersInjector abstractPickerTabMembersInjector;
    private Provider accountProvider;
    private Provider analyticsProvider;
    private Provider applicationProvider;
    private Provider ecsConfigurationProvider;
    private Provider imageCacheProvider;
    private MembersInjector mRUTabMembersInjector;
    private Provider mediaContentRosterProvider;
    private Provider mruManagerProvider;
    private Provider packInfoUtilsProvider;
    private MembersInjector userPreferencesMembersInjector;
    private Provider userPreferencesProvider;
    private Provider vibratorProvider;

    private DaggerAbstractPickerTabComponent(Builder builder1)
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
        mediaContentRosterProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAbstractPickerTabComponent this$0;
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
                this$0 = DaggerAbstractPickerTabComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        ecsConfigurationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAbstractPickerTabComponent this$0;
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
                this$0 = DaggerAbstractPickerTabComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        analyticsProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAbstractPickerTabComponent this$0;
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
                this$0 = DaggerAbstractPickerTabComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        imageCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAbstractPickerTabComponent this$0;
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
                this$0 = DaggerAbstractPickerTabComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        packInfoUtilsProvider = PackInfoUtils_Factory.create(imageCacheProvider);
        abstractPickerTabMembersInjector = AbstractPickerTab_MembersInjector.create(mediaContentRosterProvider, ecsConfigurationProvider, analyticsProvider, packInfoUtilsProvider);
        mruManagerProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAbstractPickerTabComponent this$0;
            final Builder val$builder;

            public final MRUManager get()
            {
                MRUManager mrumanager = skypeApplicationComponent.mruManager();
                if (mrumanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return mrumanager;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAbstractPickerTabComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        vibratorProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAbstractPickerTabComponent this$0;
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
                this$0 = DaggerAbstractPickerTabComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        userPreferencesMembersInjector = UserPreferences_MembersInjector.create(vibratorProvider);
        accountProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAbstractPickerTabComponent this$0;
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
                this$0 = DaggerAbstractPickerTabComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        applicationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAbstractPickerTabComponent this$0;
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
                this$0 = DaggerAbstractPickerTabComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        userPreferencesProvider = UserPreferences_Factory.create(userPreferencesMembersInjector, accountProvider, applicationProvider);
        mRUTabMembersInjector = MRUTab_MembersInjector.create(mediaContentRosterProvider, ecsConfigurationProvider, analyticsProvider, packInfoUtilsProvider, mruManagerProvider, userPreferencesProvider);
    }

    public final void inject(AbstractPickerTab abstractpickertab)
    {
        abstractPickerTabMembersInjector.injectMembers(abstractpickertab);
    }

    public final void inject(MRUTab mrutab)
    {
        mRUTabMembersInjector.injectMembers(mrutab);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/picker/DaggerAbstractPickerTabComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
