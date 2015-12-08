// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.a;

import java.util.concurrent.Callable;

// Referenced classes of package com.bumptech.glide.a:
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
    {
label0:
        {
            synchronized (a)
            {
                if (com.bumptech.glide.a.a.a(a) != null)
                {
                    break label0;
                }
            }
            return null;
        }
        com.bumptech.glide.a.a.b(a);
        if (com.bumptech.glide.a.a.c(a))
        {
            com.bumptech.glide.a.a.d(a);
            com.bumptech.glide.a.a.e(a);
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
    {
        return a();
    }
}
