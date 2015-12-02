// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import java.util.PriorityQueue;

public final class NetworkLock
{

    public static final NetworkLock a = new NetworkLock();
    private final Object b = new Object();
    private final PriorityQueue c = new PriorityQueue();
    private int d;

    private NetworkLock()
    {
        d = 0x7fffffff;
    }

    public final void a(int i)
    {
        synchronized (b)
        {
            c.add(Integer.valueOf(i));
            d = Math.min(d, i);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(int i)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        c.remove(Integer.valueOf(i));
        if (!c.isEmpty()) goto _L2; else goto _L1
_L1:
        i = 0x7fffffff;
_L4:
        d = i;
        b.notifyAll();
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        i = ((Integer)c.peek()).intValue();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
