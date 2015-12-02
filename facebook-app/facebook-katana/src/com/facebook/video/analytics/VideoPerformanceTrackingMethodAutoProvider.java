// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import android.content.Context;
import com.facebook.analytics.AnalyticsLoggerMethodAutoProvider;
import com.facebook.analytics.logger.AnalyticsLogger;
import com.facebook.common.errorreporting.FbErrorReporter;
import com.facebook.common.errorreporting.FbErrorReporterImpl;
import com.facebook.common.executors.ScheduledExecutorService_BackgroundExecutorServiceMethodAutoProvider;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.AbstractProvider;
import com.facebook.inject.InjectorLike;
import com.facebook.inject.ScopeSet;
import com.facebook.inject.SingletonScope;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.video.analytics:
//            VideoCacheCounters, VideoAnalyticsModule, VideoPerformanceTracking

public final class VideoPerformanceTrackingMethodAutoProvider extends AbstractProvider
{

    private static volatile VideoPerformanceTracking a;

    public VideoPerformanceTrackingMethodAutoProvider()
    {
    }

    private VideoPerformanceTracking a()
    {
        return VideoAnalyticsModule.a((Context)getInstance(android/content/Context), (VideoCacheCounters)VideoCacheCounters.a(this), (ScheduledExecutorService)ScheduledExecutorService_BackgroundExecutorServiceMethodAutoProvider.a(this), (AnalyticsLogger)AnalyticsLoggerMethodAutoProvider.a(this), (FbNetworkManager)FbNetworkManager.a(this), (FbErrorReporter)FbErrorReporterImpl.a(this));
    }

    public static VideoPerformanceTracking a(InjectorLike injectorlike)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/facebook/video/analytics/VideoPerformanceTrackingMethodAutoProvider;
        JVM INSTR monitorenter ;
        if (a != null || injectorlike == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        byte byte0;
        ScopeSet scopeset;
        scopeset = ScopeSet.a();
        byte0 = scopeset.b();
        com.facebook.inject.InjectorThreadStack injectorthreadstack = ((SingletonScope)injectorlike.getInstance(com/facebook/inject/SingletonScope)).enterScope();
        a = b(injectorlike.getApplicationInjector());
        SingletonScope.a(injectorthreadstack);
        scopeset.c(byte0);
        com/facebook/video/analytics/VideoPerformanceTrackingMethodAutoProvider;
        JVM INSTR monitorexit ;
_L2:
        return a;
        injectorlike;
        SingletonScope.a(injectorthreadstack);
        throw injectorlike;
        injectorlike;
        scopeset.c(byte0);
        throw injectorlike;
        injectorlike;
        com/facebook/video/analytics/VideoPerformanceTrackingMethodAutoProvider;
        JVM INSTR monitorexit ;
        throw injectorlike;
    }

    private static VideoPerformanceTracking b(InjectorLike injectorlike)
    {
        return VideoAnalyticsModule.a((Context)injectorlike.getInstance(android/content/Context), (VideoCacheCounters)VideoCacheCounters.a(injectorlike), (ScheduledExecutorService)ScheduledExecutorService_BackgroundExecutorServiceMethodAutoProvider.a(injectorlike), (AnalyticsLogger)AnalyticsLoggerMethodAutoProvider.a(injectorlike), (FbNetworkManager)FbNetworkManager.a(injectorlike), (FbErrorReporter)FbErrorReporterImpl.a(injectorlike));
    }

    public final Object get()
    {
        return a();
    }
}
