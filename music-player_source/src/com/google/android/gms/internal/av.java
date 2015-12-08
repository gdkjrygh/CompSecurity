// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            au, at

final class av
    implements Runnable
{

    final at a;
    final au b;

    av(au au1, at at1)
    {
        b = au1;
        a = at1;
        super();
    }

    public final void run()
    {
label0:
        {
            synchronized (au.a(b))
            {
                if (au.b(b) == -2)
                {
                    break label0;
                }
            }
            return;
        }
        au.a(b, au.c(b));
        if (au.d(b) != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        b.a(4);
        obj;
        JVM INSTR monitorexit ;
        return;
        a.a(b);
        au.a(b, a);
        obj;
        JVM INSTR monitorexit ;
    }
}
