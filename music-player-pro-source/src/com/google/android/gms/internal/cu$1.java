// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            cu, ct

class qM
    implements Runnable
{

    final ct qM;
    final cu qN;

    public void run()
    {
label0:
        {
            synchronized (cu.a(qN))
            {
                if (cu.b(qN) == -2)
                {
                    break label0;
                }
            }
            return;
        }
        cu.a(qN, cu.c(qN));
        if (cu.d(qN) != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        qN.k(4);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        qM.a(qN);
        cu.a(qN, qM);
        obj;
        JVM INSTR monitorexit ;
    }

    (cu cu1, ct ct1)
    {
        qN = cu1;
        qM = ct1;
        super();
    }
}
