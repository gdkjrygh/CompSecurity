// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;

public class e
{

    private final long a;
    private final int b;
    private final SimpleArrayMap c;

    public e()
    {
        a = 60000L;
        b = 10;
        c = new SimpleArrayMap(10);
    }

    public e(int i, long l)
    {
        a = l;
        b = i;
        c = new SimpleArrayMap();
    }

    private void a(long l, long l1)
    {
        for (int i = c.size() - 1; i >= 0; i--)
        {
            if (l1 - ((Long)c.valueAt(i)).longValue() > l)
            {
                c.removeAt(i);
            }
        }

    }

    public Long a(String s)
    {
        long l1 = SystemClock.elapsedRealtime();
        long l = a;
        this;
        JVM INSTR monitorenter ;
        for (; c.size() >= b; Log.w("ConnectionTracker", (new StringBuilder()).append("The max capacity ").append(b).append(" is not enough. Current durationThreshold is: ").append(l).toString()))
        {
            a(l, l1);
            l /= 2L;
        }

        break MISSING_BLOCK_LABEL_84;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s = (Long)c.put(s, Long.valueOf(l1));
        this;
        JVM INSTR monitorexit ;
        return s;
    }

    public boolean b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (c.remove(s) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }
}
