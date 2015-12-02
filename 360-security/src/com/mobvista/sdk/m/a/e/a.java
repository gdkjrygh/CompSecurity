// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.mobvista.sdk.m.a.e:
//            d, b, c

public final class a
    implements d
{

    private static a b = null;
    private final int a = 5;
    private final int c = 1;
    private final int d = 2;
    private int e;
    private ExecutorService f;
    private ExecutorService g;
    private ExecutorService h;
    private LinkedList i;
    private LinkedList j;
    private c k;
    private HashMap l;
    private Handler m;

    protected a()
    {
        e = 0;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        l = null;
        m = new b(this, Looper.getMainLooper());
        f = Executors.newFixedThreadPool(5);
        g = Executors.newCachedThreadPool();
        h = Executors.newSingleThreadExecutor();
        i = new LinkedList();
        j = new LinkedList();
        l = new HashMap();
    }

    public static a a()
    {
        if (b == null)
        {
            b = new a();
        }
        return b;
    }

    static HashMap a(a a1)
    {
        return a1.l;
    }

    private int c(c c1, d d1)
    {
        c1.e = 2;
        int i1 = d();
        c1.a(i1);
        c1.a(this);
        f.execute(c1);
        return i1;
    }

    private int d()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        e = e + 1;
        i1 = e;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    private void e()
    {
        LinkedList linkedlist = i;
        linkedlist;
        JVM INSTR monitorenter ;
        for (Iterator iterator = i.iterator(); iterator.hasNext();)
        {
            ((c)iterator.next()).c = false;
        }

        break MISSING_BLOCK_LABEL_45;
        Exception exception;
        exception;
        throw exception;
        i.clear();
        linkedlist;
        JVM INSTR monitorexit ;
    }

    private void f()
    {
        if (k != null)
        {
            k.c = false;
        }
        k = null;
    }

    public final int a(c c1, d d1)
    {
        c1.e = 1;
        int i1 = d();
        c1.a(i1);
        if (d1 != null)
        {
            l.put(Integer.valueOf(i1), d1);
        }
        c1.a(this);
        g.execute(c1);
        return i1;
    }

    public final void a(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        if (l.containsKey(Integer.valueOf(c1.b())))
        {
            Message message = m.obtainMessage(1);
            message.obj = c1;
            message.sendToTarget();
        }
        if (c1.e != 2) goto _L2; else goto _L1
_L1:
        synchronized (j)
        {
            j.add(c1);
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
        c1;
        linkedlist;
        JVM INSTR monitorexit ;
        throw c1;
        c1;
        this;
        JVM INSTR monitorexit ;
        throw c1;
_L2:
        if (c1.e == 3)
        {
            k = c1;
            continue; /* Loop/switch isn't completed */
        }
        synchronized (i)
        {
            i.add(c1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        c1;
        linkedlist1;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public final int b(c c1, d d1)
    {
        c1.e = 3;
        int i1 = d();
        c1.a(i1);
        if (d1 != null)
        {
            l.put(Integer.valueOf(i1), d1);
        }
        c1.a(this);
        h.execute(c1);
        return i1;
    }

    public final void b()
    {
        LinkedList linkedlist = j;
        linkedlist;
        JVM INSTR monitorenter ;
        for (Iterator iterator = j.iterator(); iterator.hasNext();)
        {
            ((c)iterator.next()).c = false;
        }

        break MISSING_BLOCK_LABEL_45;
        Exception exception;
        exception;
        throw exception;
        j.clear();
        linkedlist;
        JVM INSTR monitorexit ;
    }

    public final void b(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        if (l.containsKey(Integer.valueOf(c1.b())))
        {
            Message message = m.obtainMessage(2);
            message.obj = c1;
            message.sendToTarget();
        }
        if (c1.e != 2) goto _L2; else goto _L1
_L1:
        synchronized (j)
        {
            j.remove(c1);
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
        c1;
        linkedlist;
        JVM INSTR monitorexit ;
        throw c1;
        c1;
        this;
        JVM INSTR monitorexit ;
        throw c1;
_L2:
        synchronized (i)
        {
            i.remove(c1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        c1;
        linkedlist1;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public final int c(c c1)
    {
        return a(c1, null);
    }

    public final void c()
    {
        b();
        e();
        f();
        b = null;
    }

    public final int d(c c1)
    {
        return c(c1, null);
    }

}
