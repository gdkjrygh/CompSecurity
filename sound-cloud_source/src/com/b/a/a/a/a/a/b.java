// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a.a.a.a;

import java.util.concurrent.Callable;

// Referenced classes of package com.b.a.a.a.a.a:
//            a

final class b
    implements Callable
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    private Void a()
        throws Exception
    {
label0:
        {
            synchronized (a)
            {
                if (com.b.a.a.a.a.a.a.a(a) != null)
                {
                    break label0;
                }
            }
            return null;
        }
        com.b.a.a.a.a.a.a.b(a);
        com.b.a.a.a.a.a.a.c(a);
        if (com.b.a.a.a.a.a.a.d(a))
        {
            com.b.a.a.a.a.a.a.e(a);
            com.b.a.a.a.a.a.a.f(a);
        }
        a1;
        JVM INSTR monitorexit ;
        return null;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Object call()
        throws Exception
    {
        return a();
    }
}
