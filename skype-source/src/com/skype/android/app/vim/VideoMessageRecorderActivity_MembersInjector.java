// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.media.AudioManager;
import android.telephony.TelephonyManager;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageRecorderActivity

public final class VideoMessageRecorderActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsProvider;
    private final Provider audioManagerProvider;
    private final Provider conversationUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider libProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider telephonyManagerProvider;
    private final Provider timeAnomalyTelemetryProvider;
    private final Provider timeUtilProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public VideoMessageRecorderActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        upActionObserverProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        analyticsObserverProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        analyticsInAppObserverProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        shakeBugReportObserverProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        crashReporterProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        typeFaceTextStyleCallbackProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        activityAccountStateObserverProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        audioManagerProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        telephonyManagerProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        timeAnomalyTelemetryProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider15;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15)
    {
        return new VideoMessageRecorderActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static void injectAccessibility(VideoMessageRecorderActivity videomessagerecorderactivity, Provider provider)
    {
        videomessagerecorderactivity.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectAnalytics(VideoMessageRecorderActivity videomessagerecorderactivity, Provider provider)
    {
        videomessagerecorderactivity.analytics = (Analytics)provider.get();
    }

    public static void injectAudioManager(VideoMessageRecorderActivity videomessagerecorderactivity, Provider provider)
    {
        videomessagerecorderactivity.audioManager = (AudioManager)provider.get();
    }

    public static void injectConversationUtil(VideoMessageRecorderActivity videomessagerecorderactivity, Provider provider)
    {
        videomessagerecorderactivity.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectLib(VideoMessageRecorderActivity videomessagerecorderactivity, Provider provider)
    {
        videomessagerecorderactivity.lib = (SkyLib)provider.get();
    }

    public static void injectTelephonyManager(VideoMessageRecorderActivity videomessagerecorderactivity, Provider provider)
    {
        videomessagerecorderactivity.telephonyManager = (TelephonyManager)provider.get();
    }

    public static void injectTimeAnomalyTelemetry(VideoMessageRecorderActivity videomessagerecorderactivity, Provider provider)
    {
        videomessagerecorderactivity.timeAnomalyTelemetry = (TimeAnomalyTelemetry)provider.get();
    }

    public static void injectTimeUtil(VideoMessageRecorderActivity videomessagerecorderactivity, Provider provider)
    {
        videomessagerecorderactivity.timeUtil = (TimeUtil)provider.get();
    }

    public final void injectMembers(VideoMessageRecorderActivity videomessagerecorderactivity)
    {
        if (videomessagerecorderactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(videomessagerecorderactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(videomessagerecorderactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(videomessagerecorderactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(videomessagerecorderactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(videomessagerecorderactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(videomessagerecorderactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(videomessagerecorderactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(videomessagerecorderactivity, activityAccountStateObserverProvider);
            videomessagerecorderactivity.lib = (SkyLib)libProvider.get();
            videomessagerecorderactivity.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            videomessagerecorderactivity.timeUtil = (TimeUtil)timeUtilProvider.get();
            videomessagerecorderactivity.audioManager = (AudioManager)audioManagerProvider.get();
            videomessagerecorderactivity.telephonyManager = (TelephonyManager)telephonyManagerProvider.get();
            videomessagerecorderactivity.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            videomessagerecorderactivity.timeAnomalyTelemetry = (TimeAnomalyTelemetry)timeAnomalyTelemetryProvider.get();
            videomessagerecorderactivity.analytics = (Analytics)analyticsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((VideoMessageRecorderActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/vim/VideoMessageRecorderActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
