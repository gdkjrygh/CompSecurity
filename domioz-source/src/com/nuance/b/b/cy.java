// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.p;
import com.nuance.b.b.a.r;
import com.nuance.b.c.b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.nuance.b.b:
//            ds, fr, bx, cz

class cy
    implements r
{

    final bx a;

    cy(bx bx1)
    {
        a = bx1;
        super();
    }

    final void a(b b1)
    {
        b1.c(new ds(this));
    }

    public void onEnergyLevel(p p1)
    {
        fr.f((new StringBuilder("onEnergyLevel ")).append(p1.a).append(" ").append(p1.b).toString());
        List list = bx.d(a);
        list;
        JVM INSTR monitorenter ;
        r r1;
        for (Iterator iterator = bx.d(a).iterator(); iterator.hasNext(); bx.d().execute(new cz(this, r1, p1)))
        {
            r1 = (r)iterator.next();
        }

        break MISSING_BLOCK_LABEL_104;
        p1;
        list;
        JVM INSTR monitorexit ;
        throw p1;
        list;
        JVM INSTR monitorexit ;
    }
}
