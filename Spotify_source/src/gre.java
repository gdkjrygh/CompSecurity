// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class gre
{

    private int a;
    private int b;
    private ExecutorService c;
    private final Deque d = new ArrayDeque();
    private final Deque e = new ArrayDeque();
    private final Deque f = new ArrayDeque();

    public gre()
    {
        a = 64;
        b = 5;
    }

    private ExecutorService a()
    {
        this;
        JVM INSTR monitorenter ;
        ExecutorService executorservice;
        if (c == null)
        {
            c = new ThreadPoolExecutor(0, 0x7fffffff, 60L, TimeUnit.SECONDS, new SynchronousQueue(), gsp.a("OkHttp Dispatcher", false));
        }
        executorservice = c;
        this;
        JVM INSTR monitorexit ;
        return executorservice;
        Exception exception;
        exception;
        throw exception;
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
                gqu gqu1 = (gqu)iterator.next();
                if (c(gqu1) < b)
                {
                    iterator.remove();
                    e.add(gqu1);
                    a().execute(gqu1);
                }
            } while (e.size() < a);
        }
          goto _L1
        if (true) goto _L2; else goto _L1
_L1:
    }

    private int c(gqu gqu1)
    {
        Iterator iterator = e.iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((gqu)iterator.next()).a().equals(gqu1.a()))
            {
                i++;
            }
        } while (true);
        return i;
    }

    final void a(gqs gqs)
    {
        this;
        JVM INSTR monitorenter ;
        f.add(gqs);
        this;
        JVM INSTR monitorexit ;
        return;
        gqs;
        throw gqs;
    }

    final void a(gqu gqu1)
    {
        this;
        JVM INSTR monitorenter ;
        if (e.size() >= a || c(gqu1) >= b) goto _L2; else goto _L1
_L1:
        e.add(gqu1);
        a().execute(gqu1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d.add(gqu1);
        if (true) goto _L4; else goto _L3
_L3:
        gqu1;
        throw gqu1;
    }

    final void b(gqs gqs)
    {
        this;
        JVM INSTR monitorenter ;
        if (!f.remove(gqs))
        {
            throw new AssertionError("Call wasn't in-flight!");
        }
        break MISSING_BLOCK_LABEL_30;
        gqs;
        this;
        JVM INSTR monitorexit ;
        throw gqs;
        this;
        JVM INSTR monitorexit ;
    }

    final void b(gqu gqu1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!e.remove(gqu1))
        {
            throw new AssertionError("AsyncCall wasn't running!");
        }
        break MISSING_BLOCK_LABEL_30;
        gqu1;
        this;
        JVM INSTR monitorexit ;
        throw gqu1;
        b();
        this;
        JVM INSTR monitorexit ;
    }
}
