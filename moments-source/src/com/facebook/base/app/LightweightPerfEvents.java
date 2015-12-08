// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.app;

import android.os.SystemClock;
import com.facebook.base.lwperf.LightweightPerfEventsTracer;
import com.facebook.base.lwperf.perfstats.BackgroundChecker;
import com.facebook.base.lwperf.perfstats.PerfStats;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class LightweightPerfEvents
    implements LightweightPerfEventsTracer
{

    private final Stack a = new Stack();
    private final Map b = new HashMap(8);
    private final List c = new ArrayList(8);

    public LightweightPerfEvents()
    {
    }

    private static void a(Event event)
    {
        Systrace.a(6L);
        event.c = SystemClock.elapsedRealtime();
        event.d = event.d | BackgroundChecker.a().c();
        if (event.e != null)
        {
            event.e.m();
        }
    }

    private Event d(String s)
    {
        Event event = new Event((byte)0);
        event.a = s;
        event.b = SystemClock.elapsedRealtime();
        event.d = BackgroundChecker.a().c();
        event.e = null;
        c.add(event);
        Systrace.a(6L, s);
        return event;
    }

    private Event e(String s)
    {
        s = d(s);
        s.e = (new PerfStats()).l();
        return s;
    }

    public final void a(String s)
    {
        s = d(s);
        a.push(s);
    }

    public final void b(String s)
    {
        Event event = (Event)a.pop();
        if (!event.a.equals(s))
        {
            throw new IllegalStateException(String.format("Unbalanced LightweightPerfEvents.stop(). Expected: %s Actual: %s", new Object[] {
                event.a, s
            }));
        } else
        {
            a(event);
            return;
        }
    }

    public final void c(String s)
    {
        s = e(s);
        a.push(s);
    }

    private class Event
    {

        public String a;
        public long b;
        public long c;
        public boolean d;
        public PerfStats e;

        private Event()
        {
        }

        Event(byte byte0)
        {
            this();
        }
    }

}
