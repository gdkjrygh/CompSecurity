// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.k;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp:
//            e

public final class m
{

    private int a;
    private int b;
    private ExecutorService c;
    private final Deque d = new ArrayDeque();
    private final Deque e = new ArrayDeque();
    private final Deque f = new ArrayDeque();

    public m()
    {
        a = 64;
        b = 5;
    }

    private void b()
    {
_L2:
        return;
        if (e.size() < a && !d.isEmpty())
        {
            Iterator iterator = d.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                e.b b1 = (e.b)iterator.next();
                if (c(b1) < b)
                {
                    iterator.remove();
                    e.add(b1);
                    a().execute(b1);
                }
            } while (e.size() < a);
        }
          goto _L1
        if (true) goto _L2; else goto _L1
_L1:
    }

    private int c(e.b b1)
    {
        Iterator iterator = e.iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((e.b)iterator.next()).a().equals(b1.a()))
            {
                i++;
            }
        } while (true);
        return i;
    }

    public final ExecutorService a()
    {
        this;
        JVM INSTR monitorenter ;
        ExecutorService executorservice;
        if (c == null)
        {
            c = new ThreadPoolExecutor(0, 0x7fffffff, 60L, TimeUnit.SECONDS, new SynchronousQueue(), k.a("OkHttp Dispatcher", false));
        }
        executorservice = c;
        this;
        JVM INSTR monitorexit ;
        return executorservice;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(e.b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (e.size() >= a || c(b1) >= b) goto _L2; else goto _L1
_L1:
        e.add(b1);
        a().execute(b1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d.add(b1);
        if (true) goto _L4; else goto _L3
_L3:
        b1;
        throw b1;
    }

    final void a(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        f.add(e1);
        this;
        JVM INSTR monitorexit ;
        return;
        e1;
        throw e1;
    }

    final void b(e.b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!e.remove(b1))
        {
            throw new AssertionError("AsyncCall wasn't running!");
        }
        break MISSING_BLOCK_LABEL_30;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
        b();
        this;
        JVM INSTR monitorexit ;
    }

    final void b(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!f.remove(e1))
        {
            throw new AssertionError("Call wasn't in-flight!");
        }
        break MISSING_BLOCK_LABEL_30;
        e1;
        this;
        JVM INSTR monitorexit ;
        throw e1;
        this;
        JVM INSTR monitorexit ;
    }
}
