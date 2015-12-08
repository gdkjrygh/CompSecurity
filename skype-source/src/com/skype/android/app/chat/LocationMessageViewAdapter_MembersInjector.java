// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.analytics.Analytics;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.permission.PermissionRequest;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            g, MessageViewAdapter, AnnotationUtil, MessageHolderUtil

public final class LocationMessageViewAdapter_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider analyticsProvider;
    private final Provider annotationUtilProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider imageCacheProvider;
    private final Provider messageHolderUtilProvider;
    private final Provider navigationProvider;
    private final Provider navigationUrlProvider;
    private final Provider permissionRequestProvider;
    private final Provider timeUtilProvider;

    public LocationMessageViewAdapter_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11)
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
        conversationUtilProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        } else
        {
            permissionRequestProvider = provider11;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11)
    {
        return new LocationMessageViewAdapter_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static void injectConversationUtil(g g1, Provider provider)
    {
        g1.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectImageCache(g g1, Provider provider)
    {
        g1.imageCache = (ImageCache)provider.get();
    }

    public static void injectNavigation(g g1, Provider provider)
    {
        g1.navigation = (Navigation)provider.get();
    }

    public static void injectPermissionRequest(g g1, Provider provider)
    {
        g1.permissionRequest = (PermissionRequest)provider.get();
    }

    public final void injectMembers(g g1)
    {
        if (g1 == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            g1.timeUtil = (TimeUtil)timeUtilProvider.get();
            g1.contactUtil = (ContactUtil)contactUtilProvider.get();
            g1.imageCache = (ImageCache)imageCacheProvider.get();
            g1.navigation = (Navigation)navigationProvider.get();
            g1.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            g1.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            g1.analytics = (Analytics)analyticsProvider.get();
            g1.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            g1.annotationUtil = (AnnotationUtil)annotationUtilProvider.get();
            g1.messageHolderUtil = (MessageHolderUtil)messageHolderUtilProvider.get();
            g1.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            g1.imageCache = (ImageCache)imageCacheProvider.get();
            g1.navigation = (Navigation)navigationProvider.get();
            g1.permissionRequest = (PermissionRequest)permissionRequestProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((g)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/LocationMessageViewAdapter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
