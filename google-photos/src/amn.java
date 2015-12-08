// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;

final class amn
    implements Callable
{

    private amm a;

    amn(amm amm1)
    {
        a = amm1;
        super();
    }

    private Void a()
    {
label0:
        {
            synchronized (a)
            {
                if (amm.a(a) != null)
                {
                    break label0;
                }
            }
            return null;
        }
        amm.b(a);
        if (amm.c(a))
        {
            amm.d(a);
            amm.a(a, 0);
        }
        amm1;
        JVM INSTR monitorexit ;
        return null;
        exception;
        amm1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Object call()
    {
        return a();
    }
}
