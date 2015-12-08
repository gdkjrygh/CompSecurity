// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.calling.CallQualityFeedbackManager;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.FormattedMessageCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            CallNotificationViewAdapter, MessageHolderUtil, MessageViewAdapter, AnnotationUtil

public final class CallNotificationViewAdapter_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityAndAccessibilityUtilProvider;
    private final Provider analyticsProvider;
    private final Provider annotationUtilProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider cqfManagerProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider messageCacheProvider;
    private final Provider messageHolderUtilProvider;
    private final Provider navigationProvider;
    private final Provider navigationUrlProvider;
    private final Provider timeUtilProvider;

    public CallNotificationViewAdapter_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        messageCacheProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        cqfManagerProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        } else
        {
            conversationUtilProvider = provider13;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13)
    {
        return new CallNotificationViewAdapter_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static void injectAccessibilityUtil(CallNotificationViewAdapter callnotificationviewadapter, Provider provider)
    {
        callnotificationviewadapter.accessibilityUtil = (AccessibilityUtil)provider.get();
    }

    public static void injectConversationUtil(CallNotificationViewAdapter callnotificationviewadapter, Provider provider)
    {
        callnotificationviewadapter.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectCqfManager(CallNotificationViewAdapter callnotificationviewadapter, Provider provider)
    {
        callnotificationviewadapter.cqfManager = (CallQualityFeedbackManager)provider.get();
    }

    public static void injectLib(CallNotificationViewAdapter callnotificationviewadapter, Provider provider)
    {
        callnotificationviewadapter.lib = (SkyLib)provider.get();
    }

    public static void injectMessageCache(CallNotificationViewAdapter callnotificationviewadapter, Provider provider)
    {
        callnotificationviewadapter.messageCache = (FormattedMessageCache)provider.get();
    }

    public static void injectMessageHolderUtil(CallNotificationViewAdapter callnotificationviewadapter, Provider provider)
    {
        callnotificationviewadapter.messageHolderUtil = (MessageHolderUtil)provider.get();
    }

    public static void injectTimeUtil(CallNotificationViewAdapter callnotificationviewadapter, Provider provider)
    {
        callnotificationviewadapter.timeUtil = (TimeUtil)provider.get();
    }

    public final void injectMembers(CallNotificationViewAdapter callnotificationviewadapter)
    {
        if (callnotificationviewadapter == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            callnotificationviewadapter.timeUtil = (TimeUtil)timeUtilProvider.get();
            callnotificationviewadapter.contactUtil = (ContactUtil)contactUtilProvider.get();
            callnotificationviewadapter.imageCache = (ImageCache)imageCacheProvider.get();
            callnotificationviewadapter.navigation = (Navigation)navigationProvider.get();
            callnotificationviewadapter.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            callnotificationviewadapter.accessibility = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            callnotificationviewadapter.analytics = (Analytics)analyticsProvider.get();
            callnotificationviewadapter.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            callnotificationviewadapter.annotationUtil = (AnnotationUtil)annotationUtilProvider.get();
            callnotificationviewadapter.messageHolderUtil = (MessageHolderUtil)messageHolderUtilProvider.get();
            callnotificationviewadapter.lib = (SkyLib)libProvider.get();
            callnotificationviewadapter.timeUtil = (TimeUtil)timeUtilProvider.get();
            callnotificationviewadapter.messageCache = (FormattedMessageCache)messageCacheProvider.get();
            callnotificationviewadapter.accessibilityUtil = (AccessibilityUtil)accessibilityAndAccessibilityUtilProvider.get();
            callnotificationviewadapter.cqfManager = (CallQualityFeedbackManager)cqfManagerProvider.get();
            callnotificationviewadapter.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            callnotificationviewadapter.messageHolderUtil = (MessageHolderUtil)messageHolderUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CallNotificationViewAdapter)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/CallNotificationViewAdapter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
