// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.util.Log;

public final class kde
{

    private final long a;
    private final int b;
    private final jz c;

    public kde()
    {
        a = 60000L;
        b = 10;
        c = new jz(10);
    }

    public kde(int i, long l)
    {
        a = l;
        b = 1024;
        c = new jz();
    }

    public final Long a(String s)
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
        Log.w("ConnectionTracker", (new StringBuilder("The max capacity ")).append(b).append(" is not enough. Current durationThreshold is: ").append(l).toString());
          goto _L3
_L2:
        s = (Long)c.put(s, Long.valueOf(l1));
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        i--;
          goto _L4
    }

    public final boolean b(String s)
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
