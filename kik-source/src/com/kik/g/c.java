// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.kik.g:
//            i, d

public final class c extends i
{

    private final i a;
    private final long b = 200L;
    private Object c;
    private Object d;
    private final Object e = new Object();
    private ScheduledFuture f;
    private ScheduledExecutorService g;
    private Runnable h;

    c(ScheduledExecutorService scheduledexecutorservice, i j)
    {
        f = null;
        h = new d(this);
        a = j;
        g = scheduledexecutorservice;
    }

    public final void a()
    {
        Object obj1;
        Object obj2;
        synchronized (e)
        {
            if (f != null)
            {
                f.cancel(false);
                f = null;
            }
            obj1 = c;
            obj2 = d;
            d = null;
            c = null;
        }
        if (obj1 != null)
        {
            a.a(obj1, obj2);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Object obj, Object obj1)
    {
        synchronized (e)
        {
            c = obj;
            d = obj1;
            if (f == null)
            {
                f = g.schedule(h, b, TimeUnit.MILLISECONDS);
            }
        }
        return;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
