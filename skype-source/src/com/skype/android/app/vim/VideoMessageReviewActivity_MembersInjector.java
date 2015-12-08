// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import com.skype.SkyLib;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Navigation;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageReviewActivity, VideoMessagePlayerActivity

public final class VideoMessageReviewActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsProvider;
    private final Provider conversationUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider imageCacheProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider mediaDocumentUploadUtilProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider timeAnomalyTelemetryProvider;
    private final Provider timeUtilProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public VideoMessageReviewActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18)
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
        mapProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        accessibilityUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        timeAnomalyTelemetryProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        }
        mediaDocumentUploadUtilProvider = provider17;
        if (!$assertionsDisabled && provider18 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider18;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18)
    {
        return new VideoMessageReviewActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    public static void injectAnalytics(VideoMessageReviewActivity videomessagereviewactivity, Provider provider)
    {
        videomessagereviewactivity.analytics = (Analytics)provider.get();
    }

    public static void injectConversationUtil(VideoMessageReviewActivity videomessagereviewactivity, Provider provider)
    {
        videomessagereviewactivity.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectEcsConfiguration(VideoMessageReviewActivity videomessagereviewactivity, Provider provider)
    {
        videomessagereviewactivity.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectImageCache(VideoMessageReviewActivity videomessagereviewactivity, Provider provider)
    {
        videomessagereviewactivity.imageCache = (ImageCache)provider.get();
    }

    public static void injectLib(VideoMessageReviewActivity videomessagereviewactivity, Provider provider)
    {
        videomessagereviewactivity.lib = (SkyLib)provider.get();
    }

    public static void injectMap(VideoMessageReviewActivity videomessagereviewactivity, Provider provider)
    {
        videomessagereviewactivity.map = (ObjectIdMap)provider.get();
    }

    public static void injectMediaDocumentUploadUtil(VideoMessageReviewActivity videomessagereviewactivity, Provider provider)
    {
        videomessagereviewactivity.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)provider.get();
    }

    public static void injectNavigation(VideoMessageReviewActivity videomessagereviewactivity, Provider provider)
    {
        videomessagereviewactivity.navigation = (Navigation)provider.get();
    }

    public static void injectTimeAnomalyTelemetry(VideoMessageReviewActivity videomessagereviewactivity, Provider provider)
    {
        videomessagereviewactivity.timeAnomalyTelemetry = (TimeAnomalyTelemetry)provider.get();
    }

    public static void injectTimeUtil(VideoMessageReviewActivity videomessagereviewactivity, Provider provider)
    {
        videomessagereviewactivity.timeUtil = (TimeUtil)provider.get();
    }

    public final void injectMembers(VideoMessageReviewActivity videomessagereviewactivity)
    {
        if (videomessagereviewactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(videomessagereviewactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(videomessagereviewactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(videomessagereviewactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(videomessagereviewactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(videomessagereviewactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(videomessagereviewactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(videomessagereviewactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(videomessagereviewactivity, activityAccountStateObserverProvider);
            videomessagereviewactivity.map = (ObjectIdMap)mapProvider.get();
            videomessagereviewactivity.accessibilityUtil = (AccessibilityUtil)accessibilityUtilProvider.get();
            videomessagereviewactivity.analytics = (Analytics)analyticsProvider.get();
            videomessagereviewactivity.lib = (SkyLib)libProvider.get();
            videomessagereviewactivity.map = (ObjectIdMap)mapProvider.get();
            videomessagereviewactivity.navigation = (Navigation)navigationProvider.get();
            videomessagereviewactivity.imageCache = (ImageCache)imageCacheProvider.get();
            videomessagereviewactivity.timeUtil = (TimeUtil)timeUtilProvider.get();
            videomessagereviewactivity.timeAnomalyTelemetry = (TimeAnomalyTelemetry)timeAnomalyTelemetryProvider.get();
            videomessagereviewactivity.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            videomessagereviewactivity.mediaDocumentUploadUtil = (MediaDocumentUploadUtil)mediaDocumentUploadUtilProvider.get();
            videomessagereviewactivity.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((VideoMessageReviewActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/vim/VideoMessageReviewActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
