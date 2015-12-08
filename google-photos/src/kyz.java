// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public final class kyz
{

    final Map a;
    final Set b;
    final PriorityBlockingQueue c;
    List d;
    private AtomicInteger e;
    private final PriorityBlockingQueue f;
    private final ksv g;
    private final kvh h;
    private final lan i;
    private kwj j[];
    private ktb k;

    public kyz(ksv ksv, kvh kvh)
    {
        this(ksv, kvh, 4);
    }

    private kyz(ksv ksv, kvh kvh, int l)
    {
        this(ksv, kvh, 4, new lan(new Handler(Looper.getMainLooper())));
    }

    private kyz(ksv ksv, kvh kvh, int l, lan lan1)
    {
        e = new AtomicInteger();
        a = new HashMap();
        b = new HashSet();
        c = new PriorityBlockingQueue();
        f = new PriorityBlockingQueue();
        d = new ArrayList();
        g = ksv;
        h = kvh;
        j = new kwj[l];
        i = lan1;
    }

    public final kyw a(kyw kyw1)
    {
        kyw1.f = this;
        synchronized (b)
        {
            b.add(kyw1);
        }
        kyw1.e = Integer.valueOf(e.incrementAndGet());
        kyw1.a("add-to-queue");
        if (!kyw1.g)
        {
            f.add(kyw1);
            return kyw1;
        }
        break MISSING_BLOCK_LABEL_68;
        kyw1;
        set;
        JVM INSTR monitorexit ;
        throw kyw1;
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s;
        s = kyw1.b;
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
        ((Queue) (obj)).add(kyw1);
        a.put(s, obj);
        if (lew.a)
        {
            lew.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
                s
            });
        }
_L1:
        map;
        JVM INSTR monitorexit ;
        return kyw1;
        kyw1;
        map;
        JVM INSTR monitorexit ;
        throw kyw1;
        a.put(s, null);
        c.add(kyw1);
          goto _L1
    }

    public final void a()
    {
        boolean flag = false;
        if (k != null)
        {
            ktb ktb1 = k;
            ktb1.a = true;
            ktb1.interrupt();
        }
        for (int l = 0; l < j.length; l++)
        {
            if (j[l] != null)
            {
                kwj kwj1 = j[l];
                kwj1.a = true;
                kwj1.interrupt();
            }
        }

        k = new ktb(c, f, g, i);
        k.start();
        for (int i1 = ((flag) ? 1 : 0); i1 < j.length; i1++)
        {
            kwj kwj2 = new kwj(f, h, g, i);
            j[i1] = kwj2;
            kwj2.start();
        }

    }
}
