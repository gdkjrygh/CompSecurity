// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import android.content.Context;
import com.facebook.analytics.logger.AnalyticsLogger;
import com.facebook.common.errorreporting.FbErrorReporter;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.AbstractLibraryModule;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.video.analytics:
//            VideoPerformanceTracking, TimedMicroStorage, VideoCacheCounters

public class VideoAnalyticsModule extends AbstractLibraryModule
{

    public VideoAnalyticsModule()
    {
    }

    static VideoPerformanceTracking a(Context context, VideoCacheCounters videocachecounters, ScheduledExecutorService scheduledexecutorservice, AnalyticsLogger analyticslogger, FbNetworkManager fbnetworkmanager, FbErrorReporter fberrorreporter)
    {
        context = new VideoPerformanceTracking(videocachecounters, analyticslogger, fbnetworkmanager, new TimedMicroStorage(new File(context.getCacheDir(), "video-performance-tracking.data"), scheduledexecutorservice, 30000, fberrorreporter));
        context.a();
        return context;
    }

    protected void configure()
    {
        getBinder();
    }
}
