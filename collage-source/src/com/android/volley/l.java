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
//            ExecutorDelivery, NetworkDispatcher, k, s, 
//            CacheDispatcher, b, e, n

public class l
{
    public static interface a
    {

        public abstract boolean a(k k1);
    }

    public static interface b
    {

        public abstract void a(k k1);
    }


    private AtomicInteger a;
    private final Map b;
    private final Set c;
    private final PriorityBlockingQueue d;
    private final PriorityBlockingQueue e;
    private final com.android.volley.b f;
    private final e g;
    private final n h;
    private NetworkDispatcher i[];
    private CacheDispatcher j;
    private List k;

    public l(com.android.volley.b b1, e e1)
    {
        this(b1, e1, 4);
    }

    public l(com.android.volley.b b1, e e1, int i1)
    {
        this(b1, e1, i1, ((n) (new ExecutorDelivery(new Handler(Looper.getMainLooper())))));
    }

    public l(com.android.volley.b b1, e e1, int i1, n n)
    {
        a = new AtomicInteger();
        b = new HashMap();
        c = new HashSet();
        d = new PriorityBlockingQueue();
        e = new PriorityBlockingQueue();
        k = new ArrayList();
        f = b1;
        g = e1;
        i = new NetworkDispatcher[i1];
        h = n;
    }

    public k a(k k1)
    {
        k1.a(this);
        synchronized (c)
        {
            c.add(k1);
        }
        k1.a(c());
        k1.a("add-to-queue");
        if (!k1.t())
        {
            e.add(k1);
            return k1;
        }
        break MISSING_BLOCK_LABEL_64;
        k1;
        set;
        JVM INSTR monitorexit ;
        throw k1;
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s1;
        s1 = k1.g();
        if (!b.containsKey(s1))
        {
            break MISSING_BLOCK_LABEL_174;
        }
        queue = (Queue)b.get(s1);
        Object obj;
        obj = queue;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj = new LinkedList();
        ((Queue) (obj)).add(k1);
        b.put(s1, obj);
        if (s.b)
        {
            s.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
                s1
            });
        }
_L1:
        map;
        JVM INSTR monitorexit ;
        return k1;
        k1;
        map;
        JVM INSTR monitorexit ;
        throw k1;
        b.put(s1, null);
        d.add(k1);
          goto _L1
    }

    public void a()
    {
        b();
        j = new CacheDispatcher(d, e, f, h);
        j.start();
        for (int i1 = 0; i1 < i.length; i1++)
        {
            NetworkDispatcher networkdispatcher = new NetworkDispatcher(e, g, f, h);
            i[i1] = networkdispatcher;
            networkdispatcher.start();
        }

    }

    public void a(a a1)
    {
        Set set = c;
        set;
        JVM INSTR monitorenter ;
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            k k1 = (k)iterator.next();
            if (a1.a(k1))
            {
                k1.i();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_61;
        a1;
        set;
        JVM INSTR monitorexit ;
        throw a1;
        set;
        JVM INSTR monitorexit ;
    }

    public void a(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        } else
        {
            a(new a(obj) {

                final Object a;
                final l b;

                public boolean a(k k1)
                {
                    return k1.b() == a;
                }

            
            {
                b = l.this;
                a = obj;
                super();
            }
            });
            return;
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

    void b(k k1)
    {
        synchronized (c)
        {
            c.remove(k1);
        }
        obj = k;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((b)iterator.next()).a(k1)) { }
        break MISSING_BLOCK_LABEL_74;
        k1;
        obj;
        JVM INSTR monitorexit ;
        throw k1;
        k1;
        obj;
        JVM INSTR monitorexit ;
        throw k1;
        obj;
        JVM INSTR monitorexit ;
        if (!k1.t())
        {
            break MISSING_BLOCK_LABEL_161;
        }
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        k1 = k1.g();
        queue = (Queue)b.remove(k1);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        if (s.b)
        {
            s.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), k1
            });
        }
        d.addAll(queue);
        map;
        JVM INSTR monitorexit ;
        return;
        k1;
        map;
        JVM INSTR monitorexit ;
        throw k1;
    }

    public int c()
    {
        return a.incrementAndGet();
    }

    public com.android.volley.b d()
    {
        return f;
    }
}
