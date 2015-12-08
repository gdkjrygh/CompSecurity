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
//            cz, fb, ia, le, 
//            ba, z, ea, iy

public final class ie
{

    private AtomicInteger a;
    private final Map b;
    private final Set c;
    private final PriorityBlockingQueue d;
    private final PriorityBlockingQueue e;
    private final z f;
    private final ea g;
    private final iy h;
    private fb i[];
    private ba j;
    private List k;

    private ie(z z, ea ea)
    {
        this(z, ea, ((iy) (new cz(new Handler(Looper.getMainLooper())))));
    }

    public ie(z z, ea ea, byte byte0)
    {
        this(z, ea);
    }

    private ie(z z, ea ea, iy iy)
    {
        a = new AtomicInteger();
        b = new HashMap();
        c = new HashSet();
        d = new PriorityBlockingQueue();
        e = new PriorityBlockingQueue();
        k = new ArrayList();
        f = z;
        g = ea;
        i = new fb[4];
        h = iy;
    }

    public final ia a(ia ia1)
    {
        ia1.a(this);
        synchronized (c)
        {
            c.add(ia1);
        }
        ia1.a(a.incrementAndGet());
        ia1.a("add-to-queue");
        if (!ia1.i())
        {
            e.add(ia1);
            return ia1;
        }
        break MISSING_BLOCK_LABEL_67;
        ia1;
        set;
        JVM INSTR monitorexit ;
        throw ia1;
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s;
        s = ia1.e();
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
        ((Queue) (obj)).add(ia1);
        b.put(s, obj);
        if (le.b)
        {
            le.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
                s
            });
        }
_L1:
        map;
        JVM INSTR monitorexit ;
        return ia1;
        ia1;
        map;
        JVM INSTR monitorexit ;
        throw ia1;
        b.put(s, null);
        d.add(ia1);
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

        j = new ba(d, e, f, h);
        j.start();
        for (int i1 = ((flag) ? 1 : 0); i1 < i.length; i1++)
        {
            fb fb1 = new fb(e, g, f, h);
            i[i1] = fb1;
            fb1.start();
        }

    }

    final void b(ia ia1)
    {
        synchronized (c)
        {
            c.remove(ia1);
        }
        obj = k;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = k.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_66;
        ia1;
        obj;
        JVM INSTR monitorexit ;
        throw ia1;
        ia1;
        obj;
        JVM INSTR monitorexit ;
        throw ia1;
        obj;
        JVM INSTR monitorexit ;
        if (!ia1.i())
        {
            break MISSING_BLOCK_LABEL_153;
        }
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        ia1 = ia1.e();
        queue = (Queue)b.remove(ia1);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        if (le.b)
        {
            le.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), ia1
            });
        }
        d.addAll(queue);
        map;
        JVM INSTR monitorexit ;
        return;
        ia1;
        map;
        JVM INSTR monitorexit ;
        throw ia1;
    }
}
