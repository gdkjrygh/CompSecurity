// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b;

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

// Referenced classes of package com.android.b:
//            g, l, q, ad, 
//            d, u, b, k, 
//            y

public class t
{

    private AtomicInteger a;
    private final Map b;
    private final Set c;
    private final PriorityBlockingQueue d;
    private final PriorityBlockingQueue e;
    private final b f;
    private final k g;
    private final y h;
    private l i[];
    private d j;
    private List k;

    public t(b b1, k k1)
    {
        this(b1, k1, 4);
    }

    public t(b b1, k k1, int i1)
    {
        this(b1, k1, i1, ((y) (new g(new Handler(Looper.getMainLooper())))));
    }

    public t(b b1, k k1, int i1, y y)
    {
        a = new AtomicInteger();
        b = new HashMap();
        c = new HashSet();
        d = new PriorityBlockingQueue();
        e = new PriorityBlockingQueue();
        k = new ArrayList();
        f = b1;
        g = k1;
        i = new l[i1];
        h = y;
    }

    public q a(q q1)
    {
        q1.a(this);
        synchronized (c)
        {
            c.add(q1);
        }
        q1.a(c());
        q1.a("add-to-queue");
        if (!q1.q())
        {
            e.add(q1);
            return q1;
        }
        break MISSING_BLOCK_LABEL_64;
        q1;
        set;
        JVM INSTR monitorexit ;
        throw q1;
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s;
        s = q1.e();
        if (!b.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_174;
        }
        queue = (Queue)b.get(s);
        Object obj;
        obj = queue;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj = new LinkedList();
        ((Queue) (obj)).add(q1);
        b.put(s, obj);
        if (ad.b)
        {
            ad.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
                s
            });
        }
_L1:
        map;
        JVM INSTR monitorexit ;
        return q1;
        q1;
        map;
        JVM INSTR monitorexit ;
        throw q1;
        b.put(s, null);
        d.add(q1);
          goto _L1
    }

    public void a()
    {
        b();
        j = new d(d, e, f, h);
        j.start();
        for (int i1 = 0; i1 < i.length; i1++)
        {
            l l1 = new l(e, g, f, h);
            i[i1] = l1;
            l1.start();
        }

    }

    public void b()
    {
        if (j != null)
        {
            j.a();
        }
        for (int i1 = 0; i1 < i.length; i1++)
        {
            if (i[i1] != null)
            {
                i[i1].a();
            }
        }

    }

    void b(q q1)
    {
        synchronized (c)
        {
            c.remove(q1);
        }
        obj = k;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((u)iterator.next()).a(q1)) { }
        break MISSING_BLOCK_LABEL_74;
        q1;
        obj;
        JVM INSTR monitorexit ;
        throw q1;
        q1;
        obj;
        JVM INSTR monitorexit ;
        throw q1;
        obj;
        JVM INSTR monitorexit ;
        if (!q1.q())
        {
            break MISSING_BLOCK_LABEL_161;
        }
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        q1 = q1.e();
        queue = (Queue)b.remove(q1);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        if (ad.b)
        {
            ad.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), q1
            });
        }
        d.addAll(queue);
        map;
        JVM INSTR monitorexit ;
        return;
        q1;
        map;
        JVM INSTR monitorexit ;
        throw q1;
    }

    public int c()
    {
        return a.incrementAndGet();
    }
}
