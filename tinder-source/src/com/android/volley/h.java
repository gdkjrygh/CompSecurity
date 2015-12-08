// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

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

// Referenced classes of package com.android.volley:
//            d, g, Request, l, 
//            b, a, f, j

public final class h
{
    public static interface a
    {

        public abstract boolean a(Request request);
    }


    final Map a;
    final Set b;
    final PriorityBlockingQueue c;
    List d;
    private AtomicInteger e;
    private final PriorityBlockingQueue f;
    private final com.android.volley.a g;
    private final f h;
    private final j i;
    private g j[];
    private b k;

    private h(com.android.volley.a a1, f f1)
    {
        this(a1, f1, ((j) (new d(new Handler(Looper.getMainLooper())))));
    }

    public h(com.android.volley.a a1, f f1, byte byte0)
    {
        this(a1, f1);
    }

    private h(com.android.volley.a a1, f f1, j j1)
    {
        e = new AtomicInteger();
        a = new HashMap();
        b = new HashSet();
        c = new PriorityBlockingQueue();
        f = new PriorityBlockingQueue();
        d = new ArrayList();
        g = a1;
        h = f1;
        j = new g[4];
        i = j1;
    }

    private void a(a a1)
    {
        Set set = b;
        set;
        JVM INSTR monitorenter ;
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Request request = (Request)iterator.next();
            if (a1.a(request))
            {
                request.h = true;
            }
        } while (true);
        break MISSING_BLOCK_LABEL_62;
        a1;
        set;
        JVM INSTR monitorexit ;
        throw a1;
        set;
        JVM INSTR monitorexit ;
    }

    public final Request a(Request request)
    {
        request.f = this;
        synchronized (b)
        {
            b.add(request);
        }
        request.e = Integer.valueOf(e.incrementAndGet());
        request.a("add-to-queue");
        if (!request.g)
        {
            f.add(request);
            return request;
        }
        break MISSING_BLOCK_LABEL_68;
        request;
        set;
        JVM INSTR monitorexit ;
        throw request;
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s;
        s = request.c();
        if (!a.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_178;
        }
        queue = (Queue)a.get(s);
        Object obj;
        obj = queue;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        obj = new LinkedList();
        ((Queue) (obj)).add(request);
        a.put(s, obj);
        if (l.b)
        {
            l.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
                s
            });
        }
_L1:
        map;
        JVM INSTR monitorexit ;
        return request;
        request;
        map;
        JVM INSTR monitorexit ;
        throw request;
        a.put(s, null);
        c.add(request);
          goto _L1
    }

    public final void a()
    {
        boolean flag = false;
        if (k != null)
        {
            b b1 = k;
            b1.a = true;
            b1.interrupt();
        }
        for (int i1 = 0; i1 < j.length; i1++)
        {
            if (j[i1] != null)
            {
                g g1 = j[i1];
                g1.a = true;
                g1.interrupt();
            }
        }

        k = new b(c, f, g, i);
        k.start();
        for (int j1 = ((flag) ? 1 : 0); j1 < j.length; j1++)
        {
            g g2 = new g(f, h, g, i);
            j[j1] = g2;
            g2.start();
        }

    }

    public final void a(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        } else
        {
            a(new a(obj) {

                final Object a;
                final h b;

                public final boolean a(Request request)
                {
                    return request.l == a;
                }

            
            {
                b = h.this;
                a = obj;
                super();
            }
            });
            return;
        }
    }
}
