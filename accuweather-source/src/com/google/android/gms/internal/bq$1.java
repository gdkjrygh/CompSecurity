// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bq, bp

class nH
    implements Runnable
{

    final bp nH;
    final bq nI;

    public void run()
    {
label0:
        {
            synchronized (bq.a(nI))
            {
                if (bq.b(nI) == -2)
                {
                    break label0;
                }
            }
            return;
        }
        bq.a(nI, bq.c(nI));
        if (bq.d(nI) != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        nI.g(4);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        nH.a(nI);
        bq.a(nI, nH);
        obj;
        JVM INSTR monitorexit ;
    }

    (bq bq1, bp bp1)
    {
        nI = bq1;
        nH = bp1;
        super();
    }
}
