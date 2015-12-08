// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            PendingResult, BatchResult, Status, Result, 
//            GoogleApiClient, BatchResultToken

public final class Batch extends a.a
{
    public static final class Builder
    {

        private List AR;
        private Looper AS;

        public BatchResultToken add(PendingResult pendingresult)
        {
            BatchResultToken batchresulttoken = new BatchResultToken(AR.size());
            AR.add(pendingresult);
            return batchresulttoken;
        }

        public Batch build()
        {
            return new Batch(AR, AS);
        }

        public Builder(GoogleApiClient googleapiclient)
        {
            AR = new ArrayList();
            AS = googleapiclient.getLooper();
        }
    }


    private int AM;
    private boolean AN;
    private boolean AO;
    private final PendingResult AP[];
    private final Object li;

    private Batch(List list, Looper looper)
    {
        super(new a.c(looper));
        li = new Object();
        AM = list.size();
        AP = new PendingResult[AM];
        for (int i = 0; i < list.size(); i++)
        {
            looper = (PendingResult)list.get(i);
            AP[i] = looper;
            looper.a(new PendingResult.a() {

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

            
            {
                AQ = Batch.this;
                super();
            }
            });
        }

    }


    static Object a(Batch batch)
    {
        return batch.li;
    }

    static boolean a(Batch batch, boolean flag)
    {
        batch.AO = flag;
        return flag;
    }

    static int b(Batch batch)
    {
        int i = batch.AM;
        batch.AM = i - 1;
        return i;
    }

    static boolean b(Batch batch, boolean flag)
    {
        batch.AN = flag;
        return flag;
    }

    static int c(Batch batch)
    {
        return batch.AM;
    }

    static boolean d(Batch batch)
    {
        return batch.AO;
    }

    static void e(Batch batch)
    {
        batch.a.a.cancel();
    }

    static boolean f(Batch batch)
    {
        return batch.AN;
    }

    static PendingResult[] g(Batch batch)
    {
        return batch.AP;
    }

    public void cancel()
    {
        super.cancel();
        PendingResult apendingresult[] = AP;
        int j = apendingresult.length;
        for (int i = 0; i < j; i++)
        {
            apendingresult[i].cancel();
        }

    }

    public BatchResult createFailedResult(Status status)
    {
        return new BatchResult(status, AP);
    }

    public Result d(Status status)
    {
        return createFailedResult(status);
    }
}
