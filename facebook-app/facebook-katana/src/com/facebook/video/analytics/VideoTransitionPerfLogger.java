// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import com.facebook.common.util.StringUtil;
import com.facebook.inject.InjectorLike;
import com.facebook.inject.ScopeSet;
import com.facebook.inject.SingletonScope;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.module.QuickPerformanceLoggerMethodAutoProvider;

public class VideoTransitionPerfLogger
{

    private static volatile VideoTransitionPerfLogger b;
    private QuickPerformanceLogger a;

    public VideoTransitionPerfLogger(QuickPerformanceLogger quickperformancelogger)
    {
        a = quickperformancelogger;
    }

    public static VideoTransitionPerfLogger a(InjectorLike injectorlike)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/facebook/video/analytics/VideoTransitionPerfLogger;
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
        com/facebook/video/analytics/VideoTransitionPerfLogger;
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
        com/facebook/video/analytics/VideoTransitionPerfLogger;
        JVM INSTR monitorexit ;
        throw injectorlike;
    }

    private static int b(String s)
    {
        if (!StringUtil.a(s))
        {
            return s.hashCode();
        } else
        {
            return 0;
        }
    }

    private static VideoTransitionPerfLogger b(InjectorLike injectorlike)
    {
        return new VideoTransitionPerfLogger((QuickPerformanceLogger)QuickPerformanceLoggerMethodAutoProvider.a(injectorlike));
    }

    public final void a(String s)
    {
        a.f(0x1d0003, b(s));
    }

    public final void a(String s, boolean flag)
    {
        a.b(0x1d0003, b(s), (new StringBuilder("was_playing_")).append(String.valueOf(flag)).toString());
    }

    public final void b(String s, boolean flag)
    {
        a.b(0x1d0003, b(s), (new StringBuilder("reuse_player_")).append(String.valueOf(flag)).toString());
    }

    public final void c(String s, boolean flag)
    {
        a.b(0x1d0003, b(s), (new StringBuilder("new_player_")).append(String.valueOf(flag)).toString());
    }

    public final void d(String s, boolean flag)
    {
        int i = b(s);
        if (a.i(0x1d0003, i))
        {
            s = a;
            short word0;
            if (flag)
            {
                word0 = 2;
            } else
            {
                word0 = 3;
            }
            s.b(0x1d0003, i, word0);
        }
    }
}
