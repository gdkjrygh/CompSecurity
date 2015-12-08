// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            hx, mb, tj, xv, 
//            da, bd, ka, wp

public final class tm
{

    private AtomicInteger a;
    private final Map b;
    private final Set c;
    private final PriorityBlockingQueue d;
    private final PriorityBlockingQueue e;
    private final bd f;
    private final ka g;
    private final wp h;
    private mb i[];
    private da j;
    private List k;

    private tm(bd bd, ka ka)
    {
        this(bd, ka, ((wp) (new hx(new Handler(Looper.getMainLooper())))));
    }

    public tm(bd bd, ka ka, byte byte0)
    {
        this(bd, ka);
    }

    private tm(bd bd, ka ka, wp wp)
    {
        a = new AtomicInteger();
        b = new HashMap();
        c = new HashSet();
        d = new PriorityBlockingQueue();
        e = new PriorityBlockingQueue();
        k = new ArrayList();
        f = bd;
        g = ka;
        i = new mb[4];
        h = wp;
    }

    public final tj a(tj tj1)
    {
        tj1.a(this);
        synchronized (c)
        {
            c.add(tj1);
        }
        tj1.a(a.incrementAndGet());
        tj1.a("add-to-queue");
        if (!tj1.i())
        {
            e.add(tj1);
            return tj1;
        }
        break MISSING_BLOCK_LABEL_67;
        tj1;
        set;
        JVM INSTR monitorexit ;
        throw tj1;
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s;
        s = tj1.e();
        if (!b.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_177;
        }
        queue = (Queue)b.get(s);
        Object obj;
        obj = queue;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        obj = new LinkedList();
        ((Queue) (obj)).add(tj1);
        b.put(s, obj);
        if (xv.b)
        {
            xv.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
                s
            });
        }
_L1:
        map;
        JVM INSTR monitorexit ;
        return tj1;
        tj1;
        map;
        JVM INSTR monitorexit ;
        throw tj1;
        b.put(s, null);
        d.add(tj1);
          goto _L1
    }

    public final void a()
    {
        boolean flag = false;
        if (j != null)
        {
            j.a();
        }
        for (int l = 0; l < i.length; l++)
        {
            if (i[l] != null)
            {
                i[l].a();
            }
        }

        j = new da(d, e, f, h);
        j.start();
        for (int i1 = ((flag) ? 1 : 0); i1 < i.length; i1++)
        {
            mb mb1 = new mb(e, g, f, h);
            i[i1] = mb1;
            mb1.start();
        }

    }

    final void b(tj tj1)
    {
        synchronized (c)
        {
            c.remove(tj1);
        }
        obj = k;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = k.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_66;
        tj1;
        obj;
        JVM INSTR monitorexit ;
        throw tj1;
        tj1;
        obj;
        JVM INSTR monitorexit ;
        throw tj1;
        obj;
        JVM INSTR monitorexit ;
        if (!tj1.i())
        {
            break MISSING_BLOCK_LABEL_153;
        }
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        tj1 = tj1.e();
        queue = (Queue)b.remove(tj1);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        if (xv.b)
        {
            xv.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), tj1
            });
        }
        d.addAll(queue);
        map;
        JVM INSTR monitorexit ;
        return;
        tj1;
        map;
        JVM INSTR monitorexit ;
        throw tj1;
    }
}
