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
//            f, i, n, x, 
//            c, q, b, h, 
//            s

public class p
{
    public static interface a
    {

        public abstract boolean a(n n1);
    }


    private AtomicInteger a;
    private final Map b;
    private final Set c;
    private final PriorityBlockingQueue d;
    private final PriorityBlockingQueue e;
    private final b f;
    private final h g;
    private final s h;
    private i i[];
    private c j;

    public p(b b1, h h1)
    {
        this(b1, h1, 4);
    }

    public p(b b1, h h1, int k)
    {
        this(b1, h1, k, ((s) (new f(new Handler(Looper.getMainLooper())))));
    }

    private p(b b1, h h1, int k, s s)
    {
        a = new AtomicInteger();
        b = new HashMap();
        c = new HashSet();
        d = new PriorityBlockingQueue();
        e = new PriorityBlockingQueue();
        f = b1;
        g = h1;
        i = new i[k];
        h = s;
    }

    private void a(a a1)
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
            n n1 = (n)iterator.next();
            if (a1.a(n1))
            {
                n1.g();
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

    public final n a(n n1)
    {
        n1.a(this);
        synchronized (c)
        {
            c.add(n1);
        }
        n1.a(a.incrementAndGet());
        n1.a("add-to-queue");
        if (!n1.n())
        {
            e.add(n1);
            return n1;
        }
        break MISSING_BLOCK_LABEL_65;
        n1;
        set;
        JVM INSTR monitorexit ;
        throw n1;
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s;
        s = n1.e();
        if (!b.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_175;
        }
        queue = (Queue)b.get(s);
        Object obj;
        obj = queue;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj = new LinkedList();
        ((Queue) (obj)).add(n1);
        b.put(s, obj);
        if (x.b)
        {
            x.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
                s
            });
        }
_L1:
        map;
        JVM INSTR monitorexit ;
        return n1;
        n1;
        map;
        JVM INSTR monitorexit ;
        throw n1;
        b.put(s, null);
        d.add(n1);
          goto _L1
    }

    public final void a()
    {
        b();
        j = new c(d, e, f, h);
        j.start();
        for (int l = 0; l < i.length; l++)
        {
            i k = new i(e, g, f, h);
            i[l] = k;
            k.start();
        }

    }

    public final void a(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        } else
        {
            a(((a) (new q(this, obj))));
            return;
        }
    }

    public final void b()
    {
        if (j != null)
        {
            j.a();
        }
        for (int k = 0; k < i.length; k++)
        {
            if (i[k] != null)
            {
                i[k].a();
            }
        }

    }

    final void b(n n1)
    {
        synchronized (c)
        {
            c.remove(n1);
        }
        if (!n1.n()) goto _L2; else goto _L1
_L1:
        obj = b;
        obj;
        JVM INSTR monitorenter ;
        Queue queue;
        n1 = n1.e();
        queue = (Queue)b.remove(n1);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (x.b)
        {
            x.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), n1
            });
        }
        d.addAll(queue);
        obj;
        JVM INSTR monitorexit ;
_L2:
        return;
        n1;
        obj;
        JVM INSTR monitorexit ;
        throw n1;
        n1;
        obj;
        JVM INSTR monitorexit ;
        throw n1;
    }

    public final b c()
    {
        return f;
    }
}
