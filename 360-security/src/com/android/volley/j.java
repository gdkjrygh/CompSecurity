// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.android.volley:
//            f, h, Request, n, 
//            b, a, g, l

public class j
{
    public static interface a
    {

        public abstract boolean a(Request request);
    }


    protected final PriorityBlockingQueue a;
    protected final PriorityBlockingQueue b;
    protected final com.android.volley.a c;
    protected final g d;
    protected final l e;
    protected final h f[];
    protected b g;
    private final AtomicInteger h;
    private final Map i;
    private final Set j;

    public j(com.android.volley.a a1, g g1)
    {
        this(a1, g1, 4);
    }

    public j(com.android.volley.a a1, g g1, int k)
    {
        this(a1, g1, k, ((l) (new f(new Handler(Looper.getMainLooper())))));
    }

    public j(com.android.volley.a a1, g g1, int k, l l)
    {
        h = new AtomicInteger();
        i = new HashMap();
        j = new HashSet();
        a = new PriorityBlockingQueue();
        b = new PriorityBlockingQueue();
        c = a1;
        d = g1;
        f = new h[k];
        e = l;
    }

    public Request a(Request request)
    {
        request.a(this);
        synchronized (j)
        {
            j.add(request);
        }
        request.a(c());
        request.a("add-to-queue");
        if (!request.r())
        {
            b.add(request);
            return request;
        }
        break MISSING_BLOCK_LABEL_64;
        request;
        set;
        JVM INSTR monitorexit ;
        throw request;
        Map map = i;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s;
        s = request.e();
        if (!i.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_174;
        }
        queue = (Queue)i.get(s);
        Object obj;
        obj = queue;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj = new LinkedList();
        ((Queue) (obj)).add(request);
        i.put(s, obj);
        if (n.b)
        {
            n.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
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
        i.put(s, null);
        a.add(request);
          goto _L1
    }

    public void a()
    {
        b();
        g = new b(a, b, c, e);
        g.start();
        int k = 0;
        do
        {
            if (k >= f.length)
            {
                return;
            }
            h h1 = new h(b, d, c, e);
            f[k] = h1;
            h1.start();
            k++;
        } while (true);
    }

    public void a(a a1)
    {
        Set set = j;
        set;
        JVM INSTR monitorenter ;
        Iterator iterator = j.iterator();
_L2:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_29;
        }
        return;
        Request request = (Request)iterator.next();
        if (a1.a(request))
        {
            request.g();
        }
        if (true) goto _L2; else goto _L1
_L1:
        a1;
        set;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void a(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        } else
        {
            a(new a(obj) {

                final j a;
                private final Object b;

                public boolean a(Request request)
                {
                    return request.b() == b;
                }

            
            {
                a = j.this;
                b = obj;
                super();
            }
            });
            return;
        }
    }

    public void b()
    {
        if (g != null)
        {
            g.a();
        }
        int k = 0;
        do
        {
            if (k >= f.length)
            {
                return;
            }
            if (f[k] != null)
            {
                f[k].a();
            }
            k++;
        } while (true);
    }

    void b(Request request)
    {
        synchronized (j)
        {
            j.remove(request);
        }
        if (!request.r()) goto _L2; else goto _L1
_L1:
        obj = i;
        obj;
        JVM INSTR monitorenter ;
        Queue queue;
        request = request.e();
        queue = (Queue)i.remove(request);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (n.b)
        {
            n.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), request
            });
        }
        a.addAll(queue);
        obj;
        JVM INSTR monitorexit ;
_L2:
        return;
        request;
        obj;
        JVM INSTR monitorexit ;
        throw request;
        request;
        obj;
        JVM INSTR monitorexit ;
        throw request;
    }

    public int c()
    {
        return h.incrementAndGet();
    }

    public com.android.volley.a d()
    {
        return c;
    }
}
