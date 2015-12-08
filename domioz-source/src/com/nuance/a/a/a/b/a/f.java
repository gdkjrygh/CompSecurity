// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.a;

import com.nuance.a.a.a.a.d.a.e;

// Referenced classes of package com.nuance.a.a.a.b.a:
//            k, e

final class f
    implements k
{

    private com.nuance.a.a.a.b.a.e a;

    f(com.nuance.a.a.a.b.a.e e1)
    {
        a = e1;
        super();
    }

    public final void a()
    {
        if (e.c().c())
        {
            e.c();
        }
        Object obj = e.a(a);
        obj;
        JVM INSTR monitorenter ;
        if (e.b(a))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        e.c(a);
        e.a(a).notify();
_L2:
        return;
        e.d(a);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        if (e.c().c())
        {
            e.c();
        }
        synchronized (e.a(a))
        {
            e.d(a);
            if (!e.b(a))
            {
                e.c(a);
                e.a(a).notify();
            }
        }
    }
}
