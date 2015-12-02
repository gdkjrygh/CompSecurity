// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import com.facebook.analytics.HoneyAnalyticsEvent;
import com.facebook.analytics.logger.HoneyClientEvent;
import com.facebook.analytics.logger.IAnalyticsPeriodicEventReporter;
import com.facebook.analytics.tagging.AnalyticsTag;
import com.facebook.inject.InjectorLike;
import com.facebook.inject.ScopeSet;
import com.facebook.inject.SingletonScope;

// Referenced classes of package com.facebook.video.analytics:
//            VideoCacheCounters

public class VideoCachePeriodicReporter
    implements IAnalyticsPeriodicEventReporter
{

    private static volatile VideoCachePeriodicReporter b;
    private final VideoCacheCounters a;

    public VideoCachePeriodicReporter(VideoCacheCounters videocachecounters)
    {
        a = videocachecounters;
    }

    public static VideoCachePeriodicReporter a(InjectorLike injectorlike)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/facebook/video/analytics/VideoCachePeriodicReporter;
        JVM INSTR monitorenter ;
        if (b != null || injectorlike == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        byte byte0;
        ScopeSet scopeset;
        scopeset = ScopeSet.a();
        byte0 = scopeset.b();
        com.facebook.inject.InjectorThreadStack injectorthreadstack = ((SingletonScope)injectorlike.getInstance(com/facebook/inject/SingletonScope)).enterScope();
        b = b(injectorlike.getApplicationInjector());
        SingletonScope.a(injectorthreadstack);
        scopeset.c(byte0);
        com/facebook/video/analytics/VideoCachePeriodicReporter;
        JVM INSTR monitorexit ;
_L2:
        return b;
        injectorlike;
        SingletonScope.a(injectorthreadstack);
        throw injectorlike;
        injectorlike;
        scopeset.c(byte0);
        throw injectorlike;
        injectorlike;
        com/facebook/video/analytics/VideoCachePeriodicReporter;
        JVM INSTR monitorexit ;
        throw injectorlike;
    }

    private static VideoCachePeriodicReporter b(InjectorLike injectorlike)
    {
        return new VideoCachePeriodicReporter((VideoCacheCounters)VideoCacheCounters.a(injectorlike));
    }

    private HoneyClientEvent d()
    {
        HoneyClientEvent honeyclientevent = new HoneyClientEvent(a());
        honeyclientevent.a(AnalyticsTag.MODULE_VIDEO);
        a.a(honeyclientevent);
        return honeyclientevent;
    }

    public final HoneyAnalyticsEvent a(long l, String s)
    {
        return d();
    }

    public final String a()
    {
        return "video_cache_counters";
    }

    public final long b()
    {
        return 0x112a880L;
    }

    public final boolean c()
    {
        return false;
    }
}
