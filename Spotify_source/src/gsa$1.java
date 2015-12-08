// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class ang.Object
    implements Runnable
{

    private gsa a;

    public final void run()
    {
        gsa gsa1 = a;
        gsa1;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!gsa.a(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!(flag | gsa.b(a)))
        {
            break MISSING_BLOCK_LABEL_39;
        }
        gsa1;
        JVM INSTR monitorexit ;
        return;
        gsa.c(a);
        if (gsa.d(a))
        {
            gsa.e(a);
            gsa.f(a);
        }
        gsa1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        gsa1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw new RuntimeException(((Throwable) (obj)));
    }

    (gsa gsa1)
    {
        a = gsa1;
        super();
    }
}
