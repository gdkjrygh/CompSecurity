// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import com.facebook.analytics.counter.AnalyticsCounters;
import com.facebook.analytics.counter.CountersPrefWriter;
import com.facebook.analytics.counter.CountersPrefWriterMethodAutoProvider;
import com.facebook.inject.InjectorLike;
import com.facebook.inject.ScopeSet;
import com.facebook.inject.SingletonScope;

public class VideoCacheCounters extends AnalyticsCounters
{

    private static volatile VideoCacheCounters b;

    public VideoCacheCounters(CountersPrefWriter countersprefwriter)
    {
        super(countersprefwriter);
    }

    public static VideoCacheCounters a(InjectorLike injectorlike)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/facebook/video/analytics/VideoCacheCounters;
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
        com/facebook/video/analytics/VideoCacheCounters;
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
        com/facebook/video/analytics/VideoCacheCounters;
        JVM INSTR monitorexit ;
        throw injectorlike;
    }

    private static VideoCacheCounters b(InjectorLike injectorlike)
    {
        return new VideoCacheCounters((CountersPrefWriter)CountersPrefWriterMethodAutoProvider.a(injectorlike));
    }

    protected final String a()
    {
        return "video_cachecounters";
    }
}
