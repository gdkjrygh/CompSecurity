// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.m4b.maps.a:
//            f, k, s, b, 
//            e, n, c

public class l
{

    final Map a = new HashMap();
    final Set b = new HashSet();
    public final PriorityBlockingQueue c = new PriorityBlockingQueue();
    public final PriorityBlockingQueue d = new PriorityBlockingQueue();
    public final b e;
    public final e f;
    public final n g;
    public f h[];
    public c i;
    List j;
    private AtomicInteger k;

    public l(b b1, e e1, n n)
    {
        k = new AtomicInteger();
        j = new ArrayList();
        e = b1;
        f = e1;
        h = new f[4];
        g = n;
    }

    public k a(k k1)
    {
        k1.f = this;
        synchronized (b)
        {
            b.add(k1);
        }
        k1.e = Integer.valueOf(k.incrementAndGet());
        k1.a("add-to-queue");
        if (!k1.g)
        {
            d.add(k1);
            return k1;
        }
        break MISSING_BLOCK_LABEL_68;
        k1;
        set;
        JVM INSTR monitorexit ;
        throw k1;
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s1;
        s1 = k1.b;
        if (!a.containsKey(s1))
        {
            break MISSING_BLOCK_LABEL_178;
        }
        queue = (Queue)a.get(s1);
        Object obj;
        obj = queue;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        obj = new LinkedList();
        ((Queue) (obj)).add(k1);
        a.put(s1, obj);
        if (s.a)
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
        a.put(s1, null);
        c.add(k1);
          goto _L1
    }
}
