// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Log;

// Referenced classes of package org.chromium.base:
//            TraceEvent

static final class <init> extends <init>
    implements android.os.IdleHandler
{

    private long a;
    private long b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    private final void a()
    {
        if (TraceEvent.a() && !f)
        {
            a = SystemClock.elapsedRealtime();
            Looper.myQueue().addIdleHandler(this);
            f = true;
        } else
        if (f && !TraceEvent.a())
        {
            Looper.myQueue().removeIdleHandler(this);
            f = false;
            return;
        }
    }

    private static void a(int i, String s)
    {
        TraceEvent.a("TraceEvent.LooperMonitor:IdleStats", s);
        Log.println(i, "TraceEvent.LooperMonitor", s);
    }

    final void a(String s)
    {
        if (e == 0)
        {
            TraceEvent.a("Looper.queueIdle");
        }
        b = SystemClock.elapsedRealtime();
        a();
        super.a(s);
    }

    final void b(String s)
    {
        long l = SystemClock.elapsedRealtime() - b;
        if (l > 16L)
        {
            a(5, (new StringBuilder("observed a task that took ")).append(l).append("ms: ").append(s).toString());
        }
        super.b(s);
        a();
        c = c + 1;
        e = e + 1;
    }

    public final boolean queueIdle()
    {
        long l = SystemClock.elapsedRealtime();
        if (a == 0L)
        {
            a = l;
        }
        long l1 = l - a;
        d = d + 1;
        TraceEvent.b("Looper.queueIdle", (new StringBuilder()).append(e).append(" tasks since last idle.").toString());
        if (l1 > 48L)
        {
            a(3, (new StringBuilder()).append(c).append(" tasks and ").append(d).append(" idles processed so far, ").append(e).append(" tasks bursted and ").append(l1).append("ms elapsed since last idle").toString());
        }
        a = l;
        e = 0;
        return true;
    }

    private dler()
    {
        super((byte)0);
        a = 0L;
        b = 0L;
        c = 0;
        d = 0;
        e = 0;
        f = false;
    }

    f(byte byte0)
    {
        this();
    }
}
