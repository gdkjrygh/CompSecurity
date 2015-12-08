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
//            MojiMediaMessageViewAdapter, MessageViewAdapter, AnnotationUtil, MessageHolderUtil, 
//            MediaMessageViewAdapter

public final class MojiMediaMessageViewAdapter_MembersInjector
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

    public MojiMediaMessageViewAdapter_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        return new MojiMediaMessageViewAdapter_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static void injectAnalytics(MojiMediaMessageViewAdapter mojimediamessageviewadapter, Provider provider)
    {
        mojimediamessageviewadapter.analytics = (Analytics)provider.get();
    }

    public static void injectEcsConfiguration(MojiMediaMessageViewAdapter mojimediamessageviewadapter, Provider provider)
    {
        mojimediamessageviewadapter.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public final void injectMembers(MojiMediaMessageViewAdapter mojimediamessageviewadapter)
    {
        if (mojimediamessageviewadapter == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            mojimediamessageviewadapter.timeUtil = (TimeUtil)timeUtilProvider.get();
            mojimediamessageviewadapter.contactUtil = (ContactUtil)contactUtilProvider.get();
            mojimediamessageviewadapter.imageCache = (ImageCache)imageCacheProvider.get();
            mojimediamessageviewadapter.navigation = (Navigation)navigationProvider.get();
            mojimediamessageviewadapter.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            mojimediamessageviewadapter.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            mojimediamessageviewadapter.analytics = (Analytics)analyticsProvider.get();
            mojimediamessageviewadapter.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            mojimediamessageviewadapter.annotationUtil = (AnnotationUtil)annotationUtilProvider.get();
            mojimediamessageviewadapter.messageHolderUtil = (MessageHolderUtil)messageHolderUtilProvider.get();
            mojimediamessageviewadapter.imageCache = (ImageCache)imageCacheProvider.get();
            mojimediamessageviewadapter.map = (ObjectIdMap)mapProvider.get();
            mojimediamessageviewadapter.lib = (SkyLib)libProvider.get();
            mojimediamessageviewadapter.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            mojimediamessageviewadapter.timeUtil = (TimeUtil)timeUtilProvider.get();
            mojimediamessageviewadapter.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)mediaDocumentUploadUtilProvider.get();
            mojimediamessageviewadapter.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            mojimediamessageviewadapter.timeAnomalyTelemetry = (TimeAnomalyTelemetry)timeAnomalyTelemetryProvider.get();
            mojimediamessageviewadapter.analytics = (Analytics)analyticsProvider.get();
            mojimediamessageviewadapter.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MojiMediaMessageViewAdapter)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/MojiMediaMessageViewAdapter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
