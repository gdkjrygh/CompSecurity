// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;

import java.util.concurrent.Callable;

// Referenced classes of package com.roidapp.baselib.b:
//            b

final class c
    implements Callable
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    private Void a()
    {
label0:
        {
            synchronized (a)
            {
                if (b.a(a) != null)
                {
                    break label0;
                }
            }
            return null;
        }
        b.b(a);
        if (b.c(a))
        {
            b.d(a);
            b.e(a);
        }
        b1;
        JVM INSTR monitorexit ;
        return null;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Object call()
    {
        return a();
    }
}
