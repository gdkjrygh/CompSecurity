// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Application;
import android.app.NotificationManager;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.LoginManager;
import com.skype.android.push.PushHandlingHelper;
import com.skype.android.push.PushMessageRepository;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.wakeup.DreamKeeper;
import com.skype.android.wakeup.ForegroundState;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            MessageAgent, NotificationRouter, AnnotationUtil

public final class MessageAgent_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider annotationUtilProvider;
    private final Provider contactUtilProvider;
    private final Provider contextProvider;
    private final Provider conversationUtilProvider;
    private final Provider dreamKeeperProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider foregroundStateProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider loginManagerProvider;
    private final Provider mapProvider;
    private final MembersInjector membersInjector;
    private final Provider notificationManagerProvider;
    private final Provider notificationRouterProvider;
    private final Provider pushHandlingHelperProvider;
    private final Provider pushMessageRepositoryProvider;

    public MessageAgent_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, 
            Provider provider13, Provider provider14, Provider provider15)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        foregroundStateProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        dreamKeeperProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        notificationManagerProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        pushMessageRepositoryProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        pushHandlingHelperProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        loginManagerProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        notificationRouterProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        ecsConfigurationProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        } else
        {
            annotationUtilProvider = provider15;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15)
    {
        return new MessageAgent_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public final MessageAgent get()
    {
        MessageAgent messageagent = new MessageAgent((Application)contextProvider.get(), (ForegroundState)foregroundStateProvider.get(), (DreamKeeper)dreamKeeperProvider.get(), (SkyLib)libProvider.get(), (ObjectIdMap)mapProvider.get(), (ConversationUtil)conversationUtilProvider.get(), (ContactUtil)contactUtilProvider.get(), (NotificationManager)notificationManagerProvider.get(), (ImageCache)imageCacheProvider.get(), (PushMessageRepository)pushMessageRepositoryProvider.get(), (PushHandlingHelper)pushHandlingHelperProvider.get(), (LoginManager)loginManagerProvider.get(), (NotificationRouter)notificationRouterProvider.get(), (EcsConfiguration)ecsConfigurationProvider.get(), (Analytics)analyticsProvider.get(), (AnnotationUtil)annotationUtilProvider.get());
        membersInjector.injectMembers(messageagent);
        return messageagent;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/MessageAgent_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
