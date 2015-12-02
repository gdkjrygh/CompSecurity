// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.lwperf.perfstats;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.common.dextricks.ClassLoadingStats;

// Referenced classes of package com.facebook.base.lwperf.perfstats:
//            ProcIoStats

public class PerfStats
{

    private static final String a = com/facebook/base/lwperf/perfstats/PerfStats.getSimpleName();
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private com.facebook.common.dextricks.ClassLoadingStats.SnapshotStats k;

    public PerfStats()
    {
        o();
    }

    public PerfStats(PerfStats perfstats)
    {
        o();
        if (perfstats != null)
        {
            d = perfstats.d;
            e = perfstats.e;
            g = perfstats.g;
            h = perfstats.h;
            i = perfstats.i;
            j = perfstats.j;
            k = perfstats.k;
            b = true;
        }
    }

    private void n()
    {
        d = -1;
        h = -1L;
        j = -1L;
    }

    private void o()
    {
        b = false;
        c = false;
        d = -1;
        e = -1;
        f = -1;
        g = -1L;
        h = -1L;
        i = -1L;
        j = -1L;
        k = null;
    }

    public final boolean a()
    {
        return b;
    }

    public final boolean b()
    {
        return c;
    }

    public final int c()
    {
        return e;
    }

    public final int d()
    {
        return f;
    }

    public final long e()
    {
        return g;
    }

    public final long f()
    {
        return i;
    }

    public final long g()
    {
        return h;
    }

    public final long h()
    {
        return j;
    }

    public final int i()
    {
        return k.a;
    }

    public final int j()
    {
        return k.b;
    }

    public final boolean k()
    {
        return c && d != -1;
    }

    public final PerfStats l()
    {
        d = Process.myTid();
        e = Process.getThreadPriority(d);
        g = Process.getElapsedCpuTime();
        h = SystemClock.currentThreadTimeMillis();
        i = ProcIoStats.b()[2];
        j = ProcIoStats.c()[2];
        k = ClassLoadingStats.a().c();
        b = true;
        c = false;
        f = -1;
        return this;
    }

    public final void m()
    {
        if (!b || c)
        {
            return;
        }
        int i1 = Process.myTid();
        f = Process.getThreadPriority(i1);
        g = Process.getElapsedCpuTime() - g;
        i = ProcIoStats.b()[2] - i;
        if (i1 == d)
        {
            h = SystemClock.currentThreadTimeMillis() - h;
            j = ProcIoStats.c()[2] - j;
        } else
        {
            n();
        }
        k = ClassLoadingStats.a().a(k);
        if (g < 0L || i < 0L || k() && (h < 0L || j < 0L))
        {
            if (Log.isLoggable(a, 5))
            {
                Log.w(a, "Negative values detected for PerfStats, discarding stats.");
            }
            o();
            return;
        } else
        {
            c = true;
            return;
        }
    }

}
