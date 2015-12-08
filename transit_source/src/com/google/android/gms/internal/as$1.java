// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            as, ar

class fj
    implements Runnable
{

    final ar fj;
    final as fk;

    public void run()
    {
label0:
        {
            synchronized (as.a(fk))
            {
                if (as.b(fk) == -2)
                {
                    break label0;
                }
            }
            return;
        }
        as.a(fk, as.c(fk));
        if (as.d(fk) != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        fk.d(4);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        fj.a(fk);
        as.a(fk, fj);
        obj;
        JVM INSTR monitorexit ;
    }

    (as as1, ar ar1)
    {
        fk = as1;
        fj = ar1;
        super();
    }
}
