// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;


// Referenced classes of package com.google.android.gms.common.api:
//            Batch, Status, BatchResult

class AQ
    implements esult.a
{

    final Batch AQ;

    public void l(Status status)
    {
label0:
        {
            synchronized (Batch.a(AQ))
            {
                if (!AQ.isCanceled())
                {
                    break label0;
                }
            }
            return;
        }
        if (!status.isCanceled()) goto _L2; else goto _L1
_L1:
        Batch.a(AQ, true);
_L8:
        Batch.b(AQ);
        if (Batch.c(AQ) != 0) goto _L4; else goto _L3
_L3:
        if (!Batch.d(AQ)) goto _L6; else goto _L5
_L5:
        Batch.e(AQ);
_L4:
        obj;
        JVM INSTR monitorexit ;
        return;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
_L2:
        if (status.isSuccess()) goto _L8; else goto _L7
_L7:
        Batch.b(AQ, true);
          goto _L8
_L6:
        if (!Batch.f(AQ))
        {
            break MISSING_BLOCK_LABEL_146;
        }
        status = new Status(13);
_L9:
        AQ.a(new BatchResult(status, Batch.g(AQ)));
          goto _L4
        status = Status.Bv;
          goto _L9
    }

    ult(Batch batch)
    {
        AQ = batch;
        super();
    }
}
