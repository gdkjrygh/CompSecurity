// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            MediaMessageViewAdapter, MessageViewAdapter, AnnotationUtil, MessageHolderUtil

public final class MediaMessageViewAdapter_MembersInjector
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
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider mediaDocumentUploadUtilProvider;
    private final Provider messageHolderUtilProvider;
    private final Provider navigationProvider;
    private final Provider navigationUrlProvider;
    private final Provider timeAnomalyTelemetryProvider;
    private final Provider timeUtilProvider;

    public MediaMessageViewAdapter_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14)
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
        mapProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        mediaDocumentUploadUtilProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        } else
        {
            timeAnomalyTelemetryProvider = provider14;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14)
    {
        return new MediaMessageViewAdapter_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static void injectAccessibility(MediaMessageViewAdapter mediamessageviewadapter, Provider provider)
    {
        mediamessageviewadapter.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectConversationUtil(MediaMessageViewAdapter mediamessageviewadapter, Provider provider)
    {
        mediamessageviewadapter.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectImageCache(MediaMessageViewAdapter mediamessageviewadapter, Provider provider)
    {
        mediamessageviewadapter.imageCache = (ImageCache)provider.get();
    }

    public static void injectLib(MediaMessageViewAdapter mediamessageviewadapter, Provider provider)
    {
        mediamessageviewadapter.lib = (SkyLib)provider.get();
    }

    public static void injectMap(MediaMessageViewAdapter mediamessageviewadapter, Provider provider)
    {
        mediamessageviewadapter.map = (ObjectIdMap)provider.get();
    }

    public static void injectMediaDocumentUploadUtil(MediaMessageViewAdapter mediamessageviewadapter, Provider provider)
    {
        mediamessageviewadapter.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)provider.get();
    }

    public static void injectTimeAnomalyTelemetry(MediaMessageViewAdapter mediamessageviewadapter, Provider provider)
    {
        mediamessageviewadapter.timeAnomalyTelemetry = (TimeAnomalyTelemetry)provider.get();
    }

    public static void injectTimeUtil(MediaMessageViewAdapter mediamessageviewadapter, Provider provider)
    {
        mediamessageviewadapter.timeUtil = (TimeUtil)provider.get();
    }

    public final void injectMembers(MediaMessageViewAdapter mediamessageviewadapter)
    {
        if (mediamessageviewadapter == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            mediamessageviewadapter.timeUtil = (TimeUtil)timeUtilProvider.get();
            mediamessageviewadapter.contactUtil = (ContactUtil)contactUtilProvider.get();
            mediamessageviewadapter.imageCache = (ImageCache)imageCacheProvider.get();
            mediamessageviewadapter.navigation = (Navigation)navigationProvider.get();
            mediamessageviewadapter.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            mediamessageviewadapter.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            mediamessageviewadapter.analytics = (Analytics)analyticsProvider.get();
            mediamessageviewadapter.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            mediamessageviewadapter.annotationUtil = (AnnotationUtil)annotationUtilProvider.get();
            mediamessageviewadapter.messageHolderUtil = (MessageHolderUtil)messageHolderUtilProvider.get();
            mediamessageviewadapter.imageCache = (ImageCache)imageCacheProvider.get();
            mediamessageviewadapter.map = (ObjectIdMap)mapProvider.get();
            mediamessageviewadapter.lib = (SkyLib)libProvider.get();
            mediamessageviewadapter.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            mediamessageviewadapter.timeUtil = (TimeUtil)timeUtilProvider.get();
            mediamessageviewadapter.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)mediaDocumentUploadUtilProvider.get();
            mediamessageviewadapter.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            mediamessageviewadapter.timeAnomalyTelemetry = (TimeAnomalyTelemetry)timeAnomalyTelemetryProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MediaMessageViewAdapter)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/MediaMessageViewAdapter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
