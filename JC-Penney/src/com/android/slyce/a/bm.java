// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import java.nio.channels.Selector;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class bm
{

    boolean a;
    Semaphore b;
    private Selector c;

    public bm(Selector selector)
    {
        b = new Semaphore(0);
        c = selector;
    }

    public Selector a()
    {
        return c;
    }

    public void a(long l)
    {
        b.drainPermits();
        c.select(l);
        b.release(0x7fffffff);
        return;
        Exception exception;
        exception;
        b.release(0x7fffffff);
        throw exception;
    }

    public int b()
    {
        return c.selectNow();
    }

    public void c()
    {
        a(0L);
    }

    public Set d()
    {
        return c.keys();
    }

    public Set e()
    {
        return c.selectedKeys();
    }

    public void f()
    {
        c.close();
    }

    public boolean g()
    {
        return c.isOpen();
    }

    public void h()
    {
        boolean flag1;
        boolean flag = true;
        flag1 = false;
        if (b.tryAcquire())
        {
            flag = false;
        }
        c.wakeup();
        if (flag)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!a)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        a = true;
        this;
        JVM INSTR monitorexit ;
        int i = ((flag1) ? 1 : 0);
_L2:
        if (i >= 100)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag2 = b.tryAcquire(10L, TimeUnit.MILLISECONDS);
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        this;
        JVM INSTR monitorenter ;
        a = false;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        c.wakeup();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        a = false;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorenter ;
        a = false;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
