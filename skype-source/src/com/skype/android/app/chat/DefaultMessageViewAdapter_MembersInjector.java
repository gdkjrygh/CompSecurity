// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.FormattedMessageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            b, MessageViewAdapter, AnnotationUtil, MessageHolderUtil

public final class DefaultMessageViewAdapter_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityAndAccessibilityUtilProvider;
    private final Provider analyticsProvider;
    private final Provider annotationUtilProvider;
    private final Provider contactUtilProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider mediaContentRosterProvider;
    private final Provider messageHolderUtilProvider;
    private final Provider navigationProvider;
    private final Provider navigationUrlProvider;
    private final Provider spanCacheProvider;
    private final Provider timeUtilProvider;

    public DefaultMessageViewAdapter_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
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
        accessibilityAndAccessibilityUtilProvider = provider5;
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
        spanCacheProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        } else
        {
            mediaContentRosterProvider = provider12;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        return new DefaultMessageViewAdapter_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectAccessibilityUtil(b b1, Provider provider)
    {
        b1.accessibilityUtil = (AccessibilityUtil)provider.get();
    }

    public static void injectLib(b b1, Provider provider)
    {
        b1.lib = (SkyLib)provider.get();
    }

    public static void injectMediaContentRoster(b b1, Provider provider)
    {
        b1.mediaContentRoster = (MediaContentRoster)provider.get();
    }

    public static void injectSpanCache(b b1, Provider provider)
    {
        b1.spanCache = (FormattedMessageCache)provider.get();
    }

    public final void injectMembers(b b1)
    {
        if (b1 == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b1.timeUtil = (TimeUtil)timeUtilProvider.get();
            b1.contactUtil = (ContactUtil)contactUtilProvider.get();
            b1.imageCache = (ImageCache)imageCacheProvider.get();
            b1.navigation = (Navigation)navigationProvider.get();
            b1.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            b1.accessibility = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            b1.analytics = (Analytics)analyticsProvider.get();
            b1.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            b1.annotationUtil = (AnnotationUtil)annotationUtilProvider.get();
            b1.messageHolderUtil = (MessageHolderUtil)messageHolderUtilProvider.get();
            b1.lib = (SkyLib)libProvider.get();
            b1.accessibilityUtil = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            b1.spanCache = (FormattedMessageCache)spanCacheProvider.get();
            b1.mediaContentRoster = (MediaContentRoster)mediaContentRosterProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((b)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/DefaultMessageViewAdapter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
