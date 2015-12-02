// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import com.facebook.analytics.logger.HoneyClientEvent;
import com.facebook.common.identifiers.SafeUUIDGenerator;
import com.facebook.inject.InjectorLike;
import com.facebook.inject.ScopeSet;
import com.facebook.inject.SingletonScope;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

public class VideoChainingSessionManager
{

    private static final HashSet a;
    private static final HashSet b = new HashSet();
    private static final HashSet c;
    private static final Integer d = Integer.valueOf(-1);
    private static volatile VideoChainingSessionManager i;
    private final HashMap e = new HashMap();
    private String f;
    private String g;
    private Integer h;

    public VideoChainingSessionManager()
    {
        f = null;
        g = null;
        h = Integer.valueOf(0);
    }

    public static VideoChainingSessionManager a(InjectorLike injectorlike)
    {
        if (i != null) goto _L2; else goto _L1
_L1:
        com/facebook/video/analytics/VideoChainingSessionManager;
        JVM INSTR monitorenter ;
        if (i != null || injectorlike == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        byte byte0;
        ScopeSet scopeset;
        scopeset = ScopeSet.a();
        byte0 = scopeset.b();
        com.facebook.inject.InjectorThreadStack injectorthreadstack = ((SingletonScope)injectorlike.getInstance(com/facebook/inject/SingletonScope)).enterScope();
        injectorlike.getApplicationInjector();
        i = b();
        SingletonScope.a(injectorthreadstack);
        scopeset.c(byte0);
        com/facebook/video/analytics/VideoChainingSessionManager;
        JVM INSTR monitorexit ;
_L2:
        return i;
        injectorlike;
        SingletonScope.a(injectorthreadstack);
        throw injectorlike;
        injectorlike;
        scopeset.c(byte0);
        throw injectorlike;
        injectorlike;
        com/facebook/video/analytics/VideoChainingSessionManager;
        JVM INSTR monitorexit ;
        throw injectorlike;
    }

    private void a(String s)
    {
        g = s;
        e.clear();
        e.put(s, Integer.valueOf(0));
        f = SafeUUIDGenerator.a().toString();
        h = Integer.valueOf(0);
    }

    private static VideoChainingSessionManager b()
    {
        return new VideoChainingSessionManager();
    }

    public final String a()
    {
        return g;
    }

    public final void a(HoneyClientEvent honeyclientevent)
    {
        String s;
        if (!b.contains(honeyclientevent.k()))
        {
            if ((s = honeyclientevent.m(VideoAnalytics.VideoAnalyticsAttributes.VIDEO_ID.value)) != null)
            {
                if (a.contains(honeyclientevent.k()))
                {
                    if (!e.containsKey(s))
                    {
                        a(s);
                    } else
                    if (((Integer)e.get(s)).equals(d) && honeyclientevent.k().equals(VideoAnalytics.VideoAnalyticsEvents.VIDEO_REQUESTED_PLAYING.value))
                    {
                        HashMap hashmap = e;
                        Integer integer = Integer.valueOf(h.intValue() + 1);
                        h = integer;
                        hashmap.put(s, integer);
                    }
                }
                if (f != null)
                {
                    honeyclientevent.b(VideoAnalytics.VideoChainingAnalyticsAttributes.VIDEO_CHAINING_SESSION_ID.value, f);
                }
                if (e.get(s) != null && !c.contains(honeyclientevent.k()))
                {
                    honeyclientevent.a(VideoAnalytics.VideoChainingAnalyticsAttributes.VIDEO_CHAINING_DEPTH_LEVEL.value, e.get(s));
                    return;
                }
            }
        }
    }

    public final void a(String s, List list)
    {
        if (s == null)
        {
            return;
        }
        if (!e.containsKey(s))
        {
            a(s);
        }
        a(list);
    }

    public final void a(List list)
    {
        if (list != null)
        {
            int j = 0;
            while (j < list.size()) 
            {
                if (!e.containsKey(list.get(j)))
                {
                    e.put(list.get(j), d);
                }
                j++;
            }
        }
    }

    static 
    {
        a = new HashSet(Arrays.asList(new String[] {
            VideoAnalytics.VideoAnalyticsEvents.VIDEO_DISPLAYED.value, VideoAnalytics.VideoAnalyticsEvents.VIDEO_REQUESTED_PLAYING.value, VideoAnalytics.VideoAnalyticsEvents.VIDEO_START.value, VideoAnalytics.VideoAnalyticsEvents.VIDEO_UNPAUSED.value
        }));
        c = new HashSet(Arrays.asList(new String[] {
            VideoAnalytics.VideoChainingAnalyticsEvents.VIDEO_CHAINING_IMPRESSION.value
        }));
    }
}
