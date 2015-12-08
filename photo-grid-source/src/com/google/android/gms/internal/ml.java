// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            mj, pa

final class ml
    implements Runnable
{

    final pa a;
    final mj b;

    ml(mj mj1, pa pa)
    {
        b = mj1;
        a = pa;
        super();
    }

    public final void run()
    {
        synchronized (b.c)
        {
            b.a(a);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
