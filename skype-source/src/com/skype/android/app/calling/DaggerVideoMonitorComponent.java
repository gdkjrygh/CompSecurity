// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.app.Application;
import android.content.Context;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeApplicationComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.ChatText;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil_Factory;
import com.skype.android.util.ConversationUtil_Factory;
import com.skype.android.util.ImageCache;
import com.skype.android.util.PropertyAnimationUtil_Factory;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.accessibility.AccessibilityUtil_Factory;
import com.skype.android.util.cache.ContactMoodCache;
import com.skype.android.util.cache.FormattedMessageCache;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            VideoMonitorComponent, VideoMonitor_MembersInjector, VideoMonitor, CallAgent

public final class DaggerVideoMonitorComponent
    implements VideoMonitorComponent
{
    public static final class Builder
    {

        private SkypeApplicationComponent skypeApplicationComponent;

        public final VideoMonitorComponent build()
        {
            if (skypeApplicationComponent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerVideoMonitorComponent(this);
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
    private Provider analyticsProvider;
    private Provider applicationProvider;
    private Provider asyncServiceProvider;
    private Provider callAgentProvider;
    private Provider chatTextProvider;
    private Provider contactMoodCacheProvider;
    private Provider contactUtilProvider;
    private Provider contextProvider;
    private Provider conversationUtilProvider;
    private Provider defaultAvatarsProvider;
    private Provider ecsConfigurationProvider;
    private Provider formattedMessageCacheProvider;
    private Provider imageCacheProvider;
    private Provider objectIdMapProvider;
    private Provider skyLibProvider;
    private MembersInjector videoMonitorMembersInjector;
    private Provider viewStateManagerProvider;

    private DaggerVideoMonitorComponent(Builder builder1)
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
        callAgentProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
            final Builder val$builder;

            public final CallAgent get()
            {
                CallAgent callagent = skypeApplicationComponent.callAgent();
                if (callagent == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return callagent;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        applicationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
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
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        asyncServiceProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
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
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        skyLibProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
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
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        objectIdMapProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
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
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        formattedMessageCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
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
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        accountProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
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
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        contactMoodCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
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
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        ecsConfigurationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
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
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        imageCacheProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
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
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        defaultAvatarsProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
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
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        contactUtilProvider = ContactUtil_Factory.create(applicationProvider, accountProvider, skyLibProvider, objectIdMapProvider, contactMoodCacheProvider, ecsConfigurationProvider, imageCacheProvider, defaultAvatarsProvider);
        chatTextProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
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
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        conversationUtilProvider = ConversationUtil_Factory.create(applicationProvider, asyncServiceProvider, skyLibProvider, objectIdMapProvider, formattedMessageCacheProvider, accountProvider, contactUtilProvider, ecsConfigurationProvider, chatTextProvider);
        contextProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
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
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        accessibilityUtilProvider = AccessibilityUtil_Factory.create(contextProvider);
        viewStateManagerProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
            final Builder val$builder;

            public final ViewStateManager get()
            {
                ViewStateManager viewstatemanager = skypeApplicationComponent.viewStateManager();
                if (viewstatemanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return viewstatemanager;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        analyticsProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerVideoMonitorComponent this$0;
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
                this$0 = DaggerVideoMonitorComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        videoMonitorMembersInjector = VideoMonitor_MembersInjector.create(callAgentProvider, conversationUtilProvider, accessibilityUtilProvider, viewStateManagerProvider, PropertyAnimationUtil_Factory.create(), analyticsProvider, skyLibProvider);
    }

    public final void inject(VideoMonitor videomonitor)
    {
        videoMonitorMembersInjector.injectMembers(videomonitor);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/calling/DaggerVideoMonitorComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
