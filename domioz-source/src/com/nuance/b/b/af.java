// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.c;
import com.nuance.b.b.a.d;
import com.nuance.b.c.b;
import com.nuance.b.c.i;

// Referenced classes of package com.nuance.b.b:
//            v, fr, z

final class af extends b
{

    af()
    {
    }

    private void a(com.nuance.b.b.a.b b1)
    {
        this;
        JVM INSTR monitorenter ;
        v v1 = v.v();
        v1;
        JVM INSTR monitorenter ;
        fr.e((new StringBuilder("ConnectDeferred got resolved ")).append(b1.a).toString());
        if (i.a == d()) goto _L2; else goto _L1
_L1:
        fr.e("... but it was ignored, because we have already completed.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (com.nuance.b.b.z.c == v.v().s())
        {
            break MISSING_BLOCK_LABEL_98;
        }
        a(new c(b(), d.h, null, "connection aborted."));
        v1;
        JVM INSTR monitorexit ;
          goto _L3
        b1;
        v1;
        JVM INSTR monitorexit ;
        throw b1;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
        v.v().b(z.a);
        super.a(b1);
        v1;
        JVM INSTR monitorexit ;
          goto _L3
    }

    private void a(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        v v1 = v.v();
        v1;
        JVM INSTR monitorenter ;
        fr.e((new StringBuilder("ConnectDeferred got rejected ")).append(c1.a).toString());
        if (i.a == d()) goto _L2; else goto _L1
_L1:
        fr.e("... but it was ignored, because we have already completed.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (com.nuance.b.b.z.c == v.v().s())
        {
            v.a(v.v());
        }
        super.b(c1);
        v1;
        JVM INSTR monitorexit ;
        if (true) goto _L4; else goto _L3
_L3:
        c1;
        v1;
        JVM INSTR monitorexit ;
        throw c1;
        c1;
        this;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public final volatile void a(Object obj)
    {
        a((com.nuance.b.b.a.b)obj);
    }

    public final void b(Object obj)
    {
        a((c)obj);
    }
}
