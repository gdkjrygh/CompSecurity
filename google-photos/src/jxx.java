// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

final class jxx
{

    private int a;

    jxx()
    {
        a = 0;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a = a + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean a(long l, TimeUnit timeunit)
    {
        long l1 = System.currentTimeMillis();
        l = TimeUnit.MILLISECONDS.convert(l, timeunit);
        this;
        JVM INSTR monitorenter ;
_L2:
        if (a == 0)
        {
            return true;
        }
        if (l > 0L)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        timeunit;
        this;
        JVM INSTR monitorexit ;
        throw timeunit;
        long l2;
        wait(l);
        l2 = System.currentTimeMillis();
        l -= l2 - l1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == 0)
        {
            throw new RuntimeException("too many decrements");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a = a - 1;
        if (a == 0)
        {
            notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
    }
}
