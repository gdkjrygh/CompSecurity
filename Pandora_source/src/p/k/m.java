// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.k;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package p.k:
//            e, g, l, t, 
//            c, b, f, o

public class m
{

    private AtomicInteger a;
    private final Map b;
    private final Set c;
    private final PriorityBlockingQueue d;
    private final PriorityBlockingQueue e;
    private final b f;
    private final f g;
    private final o h;
    private g i[];
    private c j;

    public m(b b1, f f1)
    {
        this(b1, f1, 4);
    }

    public m(b b1, f f1, int k)
    {
        this(b1, f1, k, ((o) (new e(new Handler(Looper.getMainLooper())))));
    }

    public m(b b1, f f1, int k, o o)
    {
        a = new AtomicInteger();
        b = new HashMap();
        c = new HashSet();
        d = new PriorityBlockingQueue();
        e = new PriorityBlockingQueue();
        f = b1;
        g = f1;
        i = new g[k];
        h = o;
    }

    public l a(l l1)
    {
        l1.a(this);
        synchronized (c)
        {
            c.add(l1);
        }
        l1.a(c());
        l1.a("add-to-queue");
        if (!l1.r())
        {
            e.add(l1);
            return l1;
        }
        break MISSING_BLOCK_LABEL_64;
        l1;
        set;
        JVM INSTR monitorexit ;
        throw l1;
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s;
        s = l1.e();
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
        ((Queue) (obj)).add(l1);
        b.put(s, obj);
        if (t.b)
        {
            t.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
                s
            });
        }
_L1:
        map;
        JVM INSTR monitorexit ;
        return l1;
        l1;
        map;
        JVM INSTR monitorexit ;
        throw l1;
        b.put(s, null);
        d.add(l1);
          goto _L1
    }

    public void a()
    {
        b();
        j = new c(d, e, f, h);
        j.start();
        for (int k = 0; k < i.length; k++)
        {
            g g1 = new g(e, g, f, h);
            i[k] = g1;
            g1.start();
        }

    }

    public void b()
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

    void b(l l1)
    {
        synchronized (c)
        {
            c.remove(l1);
        }
        if (!l1.r()) goto _L2; else goto _L1
_L1:
        obj = b;
        obj;
        JVM INSTR monitorenter ;
        Queue queue;
        l1 = l1.e();
        queue = (Queue)b.remove(l1);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (t.b)
        {
            t.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), l1
            });
        }
        d.addAll(queue);
        obj;
        JVM INSTR monitorexit ;
_L2:
        return;
        l1;
        obj;
        JVM INSTR monitorexit ;
        throw l1;
        l1;
        obj;
        JVM INSTR monitorexit ;
        throw l1;
    }

    public int c()
    {
        return a.incrementAndGet();
    }
}
