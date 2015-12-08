// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.PropertyAnimationUtil;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            VideoMonitor, CallAgent

public final class VideoMonitor_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
    private final Provider analyticsProvider;
    private final Provider animationUtilProvider;
    private final Provider callAgentProvider;
    private final Provider conversationUtilProvider;
    private final Provider libProvider;
    private final Provider stateManagerProvider;

    public VideoMonitor_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        callAgentProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        accessibilityUtilProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        stateManagerProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        animationUtilProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        } else
        {
            libProvider = provider6;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        return new VideoMonitor_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public static void injectAccessibilityUtil(VideoMonitor videomonitor, Provider provider)
    {
        videomonitor.accessibilityUtil = (AccessibilityUtil)provider.get();
    }

    public static void injectAnalytics(VideoMonitor videomonitor, Provider provider)
    {
        videomonitor.analytics = (Analytics)provider.get();
    }

    public static void injectAnimationUtil(VideoMonitor videomonitor, Provider provider)
    {
        videomonitor.animationUtil = (PropertyAnimationUtil)provider.get();
    }

    public static void injectCallAgent(VideoMonitor videomonitor, Provider provider)
    {
        videomonitor.callAgent = (CallAgent)provider.get();
    }

    public static void injectConversationUtil(VideoMonitor videomonitor, Provider provider)
    {
        videomonitor.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectLib(VideoMonitor videomonitor, Provider provider)
    {
        videomonitor.lib = (SkyLib)provider.get();
    }

    public static void injectStateManager(VideoMonitor videomonitor, Provider provider)
    {
        videomonitor.stateManager = (ViewStateManager)provider.get();
    }

    public final void injectMembers(VideoMonitor videomonitor)
    {
        if (videomonitor == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            videomonitor.callAgent = (CallAgent)callAgentProvider.get();
            videomonitor.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            videomonitor.accessibilityUtil = (AccessibilityUtil)accessibilityUtilProvider.get();
            videomonitor.stateManager = (ViewStateManager)stateManagerProvider.get();
            videomonitor.animationUtil = (PropertyAnimationUtil)animationUtilProvider.get();
            videomonitor.analytics = (Analytics)analyticsProvider.get();
            videomonitor.lib = (SkyLib)libProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((VideoMonitor)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/calling/VideoMonitor_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
