// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;
import android.support.v4.e.p;
import android.util.Log;

public final class ik
{

    private final long a;
    private final int b;
    private final p c;

    public ik()
    {
        a = 60000L;
        b = 10;
        c = new p((byte)0);
    }

    public ik(long l)
    {
        a = l;
        b = 1024;
        c = new p();
    }

    public final Long a(Long long1)
    {
        long l1 = SystemClock.elapsedRealtime();
        long l = a;
        this;
        JVM INSTR monitorenter ;
_L3:
        if (c.size() < b) goto _L2; else goto _L1
_L1:
        int i = c.size() - 1;
_L4:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (l1 - ((Long)c.c(i)).longValue() > l)
        {
            c.d(i);
        }
        break MISSING_BLOCK_LABEL_143;
        l /= 2L;
        Log.w("PassiveTimedConnectionMap", (new StringBuilder("The max capacity ")).append(b).append(" is not enough. Current durationThreshold is: ").append(l).toString());
          goto _L3
_L2:
        long1 = (Long)c.put(long1, Long.valueOf(l1));
        this;
        JVM INSTR monitorexit ;
        return long1;
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
        i--;
          goto _L4
    }

    public final boolean a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (c.remove(Long.valueOf(l)) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
