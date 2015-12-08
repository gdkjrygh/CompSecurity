// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Application;
import android.content.Context;
import android.os.Vibrator;
import com.skype.Account;
import com.skype.android.SkypeApplicationComponent;
import com.skype.android.app.settings.UserPreferences_Factory;
import com.skype.android.app.settings.UserPreferences_MembersInjector;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.PackInfoUtils_Factory;
import com.skype.android.res.ChatText;
import com.skype.android.util.ImageCache;
import com.skype.android.util.PropertyAnimationUtil_Factory;
import com.skype.android.util.accessibility.AccessibilityUtil_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            MessageAreaComponent, MessageArea_MembersInjector, MessageArea

public final class DaggerMessageAreaComponent
    implements MessageAreaComponent
{
    public static final class Builder
    {

        private SkypeApplicationComponent skypeApplicationComponent;

        public final MessageAreaComponent build()
        {
            if (skypeApplicationComponent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerMessageAreaComponent(this);
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
    private Provider applicationProvider;
    private Provider chatTextProvider;
    private Provider contextProvider;
    private Provider ecsConfigurationProvider;
    private Provider imageCacheProvider;
    private Provider mediaContentRosterProvider;
    private MembersInjector messageAreaMembersInjector;
    private Provider packInfoUtilsProvider;
    private MembersInjector userPreferencesMembersInjector;
    private Provider userPreferencesProvider;
    private Provider vibratorProvider;

    private DaggerMessageAreaComponent(Builder builder1)
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
            final DaggerMessageAreaComponent this$0;
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
                this$0 = DaggerMessageAreaComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        contextProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageAreaComponent this$0;
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
                this$0 = DaggerMessageAreaComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        accessibilityUtilProvider = AccessibilityUtil_Factory.create(contextProvider);
        ecsConfigurationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageAreaComponent this$0;
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
                this$0 = DaggerMessageAreaComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        vibratorProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageAreaComponent this$0;
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
                this$0 = DaggerMessageAreaComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        userPreferencesMembersInjector = UserPreferences_MembersInjector.create(vibratorProvider);
        accountProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageAreaComponent this$0;
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
                this$0 = DaggerMessageAreaComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        applicationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageAreaComponent this$0;
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
                this$0 = DaggerMessageAreaComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        userPreferencesProvider = UserPreferences_Factory.create(userPreferencesMembersInjector, accountProvider, applicationProvider);
        chatTextProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageAreaComponent this$0;
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
                this$0 = DaggerMessageAreaComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        imageCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerMessageAreaComponent this$0;
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
                this$0 = DaggerMessageAreaComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        packInfoUtilsProvider = PackInfoUtils_Factory.create(imageCacheProvider);
        messageAreaMembersInjector = MessageArea_MembersInjector.create(mediaContentRosterProvider, PropertyAnimationUtil_Factory.create(), accessibilityUtilProvider, ecsConfigurationProvider, userPreferencesProvider, chatTextProvider, packInfoUtilsProvider);
    }

    public final void inject(MessageArea messagearea)
    {
        messageAreaMembersInjector.injectMembers(messagearea);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/DaggerMessageAreaComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
