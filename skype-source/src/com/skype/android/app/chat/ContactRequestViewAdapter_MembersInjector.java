// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.NotificationManager;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.ChatText;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.FormattedMessageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            a, MessageViewAdapter, AnnotationUtil, MessageHolderUtil

public final class ContactRequestViewAdapter_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider analyticsProvider;
    private final Provider annotationUtilProvider;
    private final Provider chatTextProvider;
    private final Provider contactUtilProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider messageCacheProvider;
    private final Provider messageHolderUtilProvider;
    private final Provider navigationProvider;
    private final Provider navigationUrlProvider;
    private final Provider notificationManagerProvider;
    private final Provider timeUtilProvider;

    public ContactRequestViewAdapter_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        navigationUrlProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        ecsConfigurationProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        annotationUtilProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        messageHolderUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        messageCacheProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        chatTextProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        } else
        {
            notificationManagerProvider = provider13;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13)
    {
        return new ContactRequestViewAdapter_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static void injectChatText(a a1, Provider provider)
    {
        a1.chatText = (ChatText)provider.get();
    }

    public static void injectContactUtil(a a1, Provider provider)
    {
        a1.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectImageCache(a a1, Provider provider)
    {
        a1.imageCache = (ImageCache)provider.get();
    }

    public static void injectLib(a a1, Provider provider)
    {
        a1.lib = (SkyLib)provider.get();
    }

    public static void injectMessageCache(a a1, Provider provider)
    {
        a1.messageCache = (FormattedMessageCache)provider.get();
    }

    public static void injectNotificationManager(a a1, Provider provider)
    {
        a1.notificationManager = (NotificationManager)provider.get();
    }

    public final void injectMembers(a a1)
    {
        if (a1 == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            a1.timeUtil = (TimeUtil)timeUtilProvider.get();
            a1.contactUtil = (ContactUtil)contactUtilProvider.get();
            a1.imageCache = (ImageCache)imageCacheProvider.get();
            a1.navigation = (Navigation)navigationProvider.get();
            a1.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            a1.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            a1.analytics = (Analytics)analyticsProvider.get();
            a1.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            a1.annotationUtil = (AnnotationUtil)annotationUtilProvider.get();
            a1.messageHolderUtil = (MessageHolderUtil)messageHolderUtilProvider.get();
            a1.lib = (SkyLib)libProvider.get();
            a1.messageCache = (FormattedMessageCache)messageCacheProvider.get();
            a1.chatText = (ChatText)chatTextProvider.get();
            a1.contactUtil = (ContactUtil)contactUtilProvider.get();
            a1.imageCache = (ImageCache)imageCacheProvider.get();
            a1.notificationManager = (NotificationManager)notificationManagerProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((a)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/ContactRequestViewAdapter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
