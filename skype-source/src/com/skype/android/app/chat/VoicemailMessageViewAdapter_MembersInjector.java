// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.media.AudioManager;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.pcmhost.PcmHost;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            m, MessageViewAdapter, AnnotationUtil, MessageHolderUtil

public final class VoicemailMessageViewAdapter_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider accountProvider;
    private final Provider analyticsProvider;
    private final Provider annotationUtilProvider;
    private final Provider audioManagerProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider imageCacheProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider messageHolderUtilProvider;
    private final Provider navigationProvider;
    private final Provider navigationUrlProvider;
    private final Provider pcmHostProvider;
    private final Provider timeAnomalyTelemetryProvider;
    private final Provider timeUtilProvider;

    public VoicemailMessageViewAdapter_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17)
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
        accountProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        pcmHostProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        audioManagerProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        } else
        {
            timeAnomalyTelemetryProvider = provider17;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17)
    {
        return new VoicemailMessageViewAdapter_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    public static void injectAccessibility(m m1, Provider provider)
    {
        m1.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectAccount(m m1, Provider provider)
    {
        m1.account = (Account)provider.get();
    }

    public static void injectAudioManager(m m1, Provider provider)
    {
        m1.audioManager = (AudioManager)provider.get();
    }

    public static void injectConversationUtil(m m1, Provider provider)
    {
        m1.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectLayoutExperience(m m1, Provider provider)
    {
        m1.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(m m1, Provider provider)
    {
        m1.lib = (SkyLib)provider.get();
    }

    public static void injectMap(m m1, Provider provider)
    {
        m1.map = (ObjectIdMap)provider.get();
    }

    public static void injectPcmHost(m m1, Provider provider)
    {
        m1.pcmHost = (PcmHost)provider.get();
    }

    public static void injectTimeAnomalyTelemetry(m m1, Provider provider)
    {
        m1.timeAnomalyTelemetry = (TimeAnomalyTelemetry)provider.get();
    }

    public static void injectTimeUtil(m m1, Provider provider)
    {
        m1.timeUtil = (TimeUtil)provider.get();
    }

    public final void injectMembers(m m1)
    {
        if (m1 == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            m1.timeUtil = (TimeUtil)timeUtilProvider.get();
            m1.contactUtil = (ContactUtil)contactUtilProvider.get();
            m1.imageCache = (ImageCache)imageCacheProvider.get();
            m1.navigation = (Navigation)navigationProvider.get();
            m1.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            m1.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            m1.analytics = (Analytics)analyticsProvider.get();
            m1.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            m1.annotationUtil = (AnnotationUtil)annotationUtilProvider.get();
            m1.messageHolderUtil = (MessageHolderUtil)messageHolderUtilProvider.get();
            m1.account = (Account)accountProvider.get();
            m1.lib = (SkyLib)libProvider.get();
            m1.pcmHost = (PcmHost)pcmHostProvider.get();
            m1.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            m1.audioManager = (AudioManager)audioManagerProvider.get();
            m1.map = (ObjectIdMap)mapProvider.get();
            m1.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            m1.timeUtil = (TimeUtil)timeUtilProvider.get();
            m1.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            m1.timeAnomalyTelemetry = (TimeAnomalyTelemetry)timeAnomalyTelemetryProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((m)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/VoicemailMessageViewAdapter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
