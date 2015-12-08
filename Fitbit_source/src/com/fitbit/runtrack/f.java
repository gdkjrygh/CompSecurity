// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.os.Bundle;
import android.os.SystemClock;
import com.fitbit.util.b.a;
import java.util.concurrent.TimeUnit;

public class f
{

    private final long a;
    private final long b;

    public f()
    {
        a = System.currentTimeMillis();
        if (com.fitbit.util.b.a.a(17))
        {
            b = b();
            return;
        } else
        {
            b = -1L;
            return;
        }
    }

    private f(long l, long l1)
    {
        a = l;
        b = l1;
    }

    private static final String a(String s)
    {
        return String.format("%s.%s", new Object[] {
            com/fitbit/runtrack/f.getName(), s
        });
    }

    private long b()
    {
        return SystemClock.elapsedRealtimeNanos() - b;
    }

    public static f b(Bundle bundle)
    {
        long l = bundle.getLong("realtimeclock");
        return new f(bundle.getLong("systemclock"), l);
    }

    public long a()
    {
        if (com.fitbit.util.b.a.a(17))
        {
            return a + TimeUnit.MILLISECONDS.convert(b(), TimeUnit.NANOSECONDS);
        } else
        {
            return System.currentTimeMillis();
        }
    }

    public long a(long l, TimeUnit timeunit)
    {
        l = TimeUnit.NANOSECONDS.convert(l, timeunit);
        long l1 = a;
        return TimeUnit.MILLISECONDS.convert(l - b, TimeUnit.NANOSECONDS) + l1;
    }

    public void a(Bundle bundle)
    {
        bundle.putLong(a("realtimeclock"), b);
        bundle.putLong(a("systemclock"), a);
    }
}
