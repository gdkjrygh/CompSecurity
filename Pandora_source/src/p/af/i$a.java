// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.af;

import java.util.Queue;
import p.ap.h;
import p.n.a;

// Referenced classes of package p.af:
//            i

static class .Queue
{

    private final Queue a = h.a(0);

    public a a(p.n. )
    {
        this;
        JVM INSTR monitorenter ;
        a a2 = (a)a.poll();
        a a1;
        a1 = a2;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        a1 = new a();
        this;
        JVM INSTR monitorexit ;
        return a1;
        ;
        throw ;
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        a1.g();
        a.offer(a1);
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    .Queue()
    {
    }
}
