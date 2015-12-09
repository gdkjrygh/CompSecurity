// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.lwperf.perfstats;

import android.os.Process;
import android.os.SystemClock;

// Referenced classes of package com.facebook.base.lwperf.perfstats:
//            ProcReader

public final class BackgroundChecker
{

    private static final String a = com/facebook/base/lwperf/perfstats/BackgroundChecker.getSimpleName();
    private static final BackgroundChecker b = new BackgroundChecker();
    private volatile long c;
    private volatile boolean d;
    private volatile Boolean e;
    private volatile boolean f;

    private BackgroundChecker()
    {
        c = -1L;
        d = false;
    }

    public static BackgroundChecker a()
    {
        return b;
    }

    private boolean d()
    {
        boolean flag = e();
        long l = f();
        d = flag;
        if (flag)
        {
            f = true;
        }
        c = l;
        return flag;
    }

    private static boolean e()
    {
        String s;
        boolean flag;
        try
        {
            int i = Process.myPid();
            s = ProcReader.a((new StringBuilder("/proc/")).append(i).append("/cgroup").toString());
        }
        catch (RuntimeException runtimeexception)
        {
            return false;
        }
        if (s == null)
        {
            return false;
        }
        flag = s.contains(":cpu:/apps/bg_non_interactive");
        return flag;
    }

    private static long f()
    {
        return SystemClock.elapsedRealtime();
    }

    public final Boolean b()
    {
        return e;
    }

    public final boolean c()
    {
        long l = c;
        if (l == -1L || f() - l >= 500L)
        {
            return d();
        } else
        {
            return d;
        }
    }

}
