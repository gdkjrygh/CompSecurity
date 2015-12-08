// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bp, bo

class nJ
    implements Runnable
{

    final bo nJ;
    final bp nK;

    public void run()
    {
label0:
        {
            synchronized (bp.a(nK))
            {
                if (bp.b(nK) == -2)
                {
                    break label0;
                }
            }
            return;
        }
        bp.a(nK, bp.c(nK));
        if (bp.d(nK) != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        nK.g(4);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        nJ.a(nK);
        bp.a(nK, nJ);
        obj;
        JVM INSTR monitorexit ;
    }

    (bp bp1, bo bo1)
    {
        nK = bp1;
        nJ = bo1;
        super();
    }
}
