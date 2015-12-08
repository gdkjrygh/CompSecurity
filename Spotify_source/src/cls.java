// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.zzk;
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

public final class cls
{

    public final Map a;
    public final Set b;
    public final PriorityBlockingQueue c;
    public List d;
    private AtomicInteger e;
    private final PriorityBlockingQueue f;
    private final bzx g;
    private final cfx h;
    private final cnw i;
    private chk j[];
    private cbd k;

    private cls(bzx bzx, cfx cfx)
    {
        this(bzx, cfx, ((cnw) (new cej(new Handler(Looper.getMainLooper())))));
    }

    public cls(bzx bzx, cfx cfx, byte byte0)
    {
        this(bzx, cfx);
    }

    private cls(bzx bzx, cfx cfx, cnw cnw)
    {
        e = new AtomicInteger();
        a = new HashMap();
        b = new HashSet();
        c = new PriorityBlockingQueue();
        f = new PriorityBlockingQueue();
        d = new ArrayList();
        g = bzx;
        h = cfx;
        j = new chk[4];
        i = cnw;
    }

    public final zzk a(zzk zzk1)
    {
        zzk1.e = this;
        synchronized (b)
        {
            b.add(zzk1);
        }
        zzk1.d = Integer.valueOf(e.incrementAndGet());
        zzk1.a("add-to-queue");
        if (!zzk1.f)
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
        s = zzk1.a;
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
        if (cop.a)
        {
            cop.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
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
            cbd cbd1 = k;
            cbd1.a = true;
            cbd1.interrupt();
        }
        for (int l = 0; l < j.length; l++)
        {
            if (j[l] != null)
            {
                chk chk1 = j[l];
                chk1.a = true;
                chk1.interrupt();
            }
        }

        k = new cbd(c, f, g, i);
        k.start();
        for (int i1 = ((flag) ? 1 : 0); i1 < j.length; i1++)
        {
            chk chk2 = new chk(f, h, g, i);
            j[i1] = chk2;
            chk2.start();
        }

    }
}
