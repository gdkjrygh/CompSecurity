// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
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

// Referenced classes of package com.google.android.gms.internal:
//            bb, bz, zzk, ez, 
//            w, g, bj, en

public final class df
{

    final Map a;
    final Set b;
    final PriorityBlockingQueue c;
    List d;
    private AtomicInteger e;
    private final PriorityBlockingQueue f;
    private final g g;
    private final bj h;
    private final en i;
    private bz j[];
    private w k;

    private df(g g1, bj bj)
    {
        this(g1, bj, ((en) (new bb(new Handler(Looper.getMainLooper())))));
    }

    public df(g g1, bj bj, byte byte0)
    {
        this(g1, bj);
    }

    private df(g g1, bj bj, en en)
    {
        e = new AtomicInteger();
        a = new HashMap();
        b = new HashSet();
        c = new PriorityBlockingQueue();
        f = new PriorityBlockingQueue();
        d = new ArrayList();
        g = g1;
        h = bj;
        j = new bz[4];
        i = en;
    }

    public final zzk a(zzk zzk1)
    {
        zzk1.h = this;
        synchronized (b)
        {
            b.add(zzk1);
        }
        zzk1.g = Integer.valueOf(e.incrementAndGet());
        zzk1.a("add-to-queue");
        if (!zzk1.i)
        {
            f.add(zzk1);
            return zzk1;
        }
        break MISSING_BLOCK_LABEL_68;
        zzk1;
        set;
        JVM INSTR monitorexit ;
        throw zzk1;
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s;
        s = zzk1.d;
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
        ((Queue) (obj)).add(zzk1);
        a.put(s, obj);
        if (ez.b)
        {
            ez.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
                s
            });
        }
_L1:
        map;
        JVM INSTR monitorexit ;
        return zzk1;
        zzk1;
        map;
        JVM INSTR monitorexit ;
        throw zzk1;
        a.put(s, null);
        c.add(zzk1);
          goto _L1
    }

    public final void a()
    {
        boolean flag = false;
        if (k != null)
        {
            w w1 = k;
            w1.a = true;
            w1.interrupt();
        }
        for (int l = 0; l < j.length; l++)
        {
            if (j[l] != null)
            {
                bz bz1 = j[l];
                bz1.a = true;
                bz1.interrupt();
            }
        }

        k = new w(c, f, g, i);
        k.start();
        for (int i1 = ((flag) ? 1 : 0); i1 < j.length; i1++)
        {
            bz bz2 = new bz(f, h, g, i);
            j[i1] = bz2;
            bz2.start();
        }

    }
}
