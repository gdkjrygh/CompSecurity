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
import java.util.Iterator;
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
        event.d = SystemClock.elapsedRealtime();
        event.e = event.e | BackgroundChecker.a().e();
        if (event.f != null)
        {
            event.f.m();
        }
    }

    private Event f(String s)
    {
        Event event = new Event((byte)0);
        event.b = s;
        event.c = SystemClock.elapsedRealtime();
        event.e = BackgroundChecker.a().e();
        event.f = null;
        c.add(event);
        Systrace.a(6L, s);
        return event;
    }

    private Event g(String s)
    {
        s = f(s);
        s.f = (new PerfStats()).l();
        return s;
    }

    public final void a(Marker marker)
    {
        Event event;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); marker.a(event.a, event.b, event.c, event.d, event.e, event.f))
        {
            event = (Event)iterator.next();
        }

        c.clear();
    }

    public final void a(String s)
    {
        s = f(s);
        a.push(s);
    }

    public final void a(String s, int i)
    {
        if (b.containsKey(s))
        {
            throw new IllegalArgumentException();
        } else
        {
            Event event = f(s);
            event.a = i;
            b.put(s, event);
            return;
        }
    }

    public final void b(String s)
    {
        Event event = (Event)a.pop();
        if (!event.b.equals(s))
        {
            throw new IllegalStateException(String.format("Unbalanced LightweightPerfEvents.stop(). Expected: %s Actual: %s", new Object[] {
                event.b, s
            }));
        } else
        {
            a(event);
            return;
        }
    }

    public final void c(String s)
    {
        s = g(s);
        a.push(s);
    }

    public final void d(String s)
    {
        if (b.containsKey(s))
        {
            throw new IllegalArgumentException();
        } else
        {
            Event event = f(s);
            b.put(s, event);
            return;
        }
    }

    public final void e(String s)
    {
        Event event = (Event)b.remove(s);
        if (event == null)
        {
            throw new IllegalStateException(String.format("LightweightPerfEvents.stopAsync() called for %s without first calling startAsync().", new Object[] {
                s
            }));
        } else
        {
            a(event);
            return;
        }
    }

    private class Event
    {

        public int a;
        public String b;
        public long c;
        public long d;
        public boolean e;
        public PerfStats f;

        private Event()
        {
        }

        Event(byte byte0)
        {
            this();
        }
    }


    private class Marker
    {

        public abstract void a(int i, String s, long l, long l1, boolean flag, 
                PerfStats perfstats);
    }

}
