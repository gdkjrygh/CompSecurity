// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.c;

import com.c.a.b.ac;
import com.kik.g.p;
import com.kik.g.r;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kik.a.e.f;
import kik.a.f.f.z;

// Referenced classes of package kik.a.c:
//            h

public final class g
{

    private final f a;
    private final AtomicBoolean b = new AtomicBoolean();
    private final LinkedBlockingQueue c = new LinkedBlockingQueue(10);

    public g(f f1)
    {
        a = f1;
    }

    private void a()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry = (java.util.Map.Entry)c.poll();
        if (entry != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        b.set(false);
        obj;
        JVM INSTR monitorexit ;
        return;
        obj;
        JVM INSTR monitorexit ;
        obj = a.a((z)entry.getKey());
        ((p) (obj)).a((r)entry.getValue());
        ((p) (obj)).a(new h(this));
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(g g1)
    {
        g1.a();
    }

    public final void a(z z1, r r1)
    {
        boolean flag;
        synchronized (c)
        {
            flag = c.offer(ac.a(z1, r1));
        }
        if (flag)
        {
            if (!b.getAndSet(true))
            {
                a();
            }
            return;
        } else
        {
            r1.b(new Exception("Sending queue at capacity"));
            return;
        }
        z1;
        linkedblockingqueue;
        JVM INSTR monitorexit ;
        throw z1;
    }
}
