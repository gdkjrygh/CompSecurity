// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;


// Referenced classes of package com.google.android.apps.unveil.env:
//            g, f

final class h
    implements Runnable
{

    final Object a;
    final g b;

    h(g g1, Object obj)
    {
        b = g1;
        a = obj;
        super();
    }

    public final void run()
    {
label0:
        {
            synchronized (b.b)
            {
                if (!b.b.a)
                {
                    break label0;
                }
            }
            return;
        }
        b.b.a(a);
        f1;
        JVM INSTR monitorexit ;
        return;
        exception;
        f1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
