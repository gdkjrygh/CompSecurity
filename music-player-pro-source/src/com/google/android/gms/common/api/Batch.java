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

public final class Batch extends BaseImplementation.AbstractPendingResult
{
    public static final class Builder
    {

        private List JE;
        private Looper JF;

        public BatchResultToken add(PendingResult pendingresult)
        {
            BatchResultToken batchresulttoken = new BatchResultToken(JE.size());
            JE.add(pendingresult);
            return batchresulttoken;
        }

        public Batch build()
        {
            return new Batch(JE, JF);
        }

        public Builder(GoogleApiClient googleapiclient)
        {
            JE = new ArrayList();
            JF = googleapiclient.getLooper();
        }
    }


    private boolean JA;
    private boolean JB;
    private final PendingResult JC[];
    private int Jz;
    private final Object mH;

    private Batch(List list, Looper looper)
    {
        super(new BaseImplementation.CallbackHandler(looper));
        mH = new Object();
        Jz = list.size();
        JC = new PendingResult[Jz];
        for (int i = 0; i < list.size(); i++)
        {
            looper = (PendingResult)list.get(i);
            JC[i] = looper;
            looper.a(new PendingResult.a() {

                final Batch JD;

                public void m(Status status)
                {
label0:
                    {
                        synchronized (Batch.a(JD))
                        {
                            if (!JD.isCanceled())
                            {
                                break label0;
                            }
                        }
                        return;
                    }
                    if (!status.isCanceled()) goto _L2; else goto _L1
_L1:
                    Batch.a(JD, true);
_L8:
                    Batch.b(JD);
                    if (Batch.c(JD) != 0) goto _L4; else goto _L3
_L3:
                    if (!Batch.d(JD)) goto _L6; else goto _L5
_L5:
                    Batch.e(JD);
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
                    Batch.b(JD, true);
                      goto _L8
_L6:
                    if (!Batch.f(JD))
                    {
                        break MISSING_BLOCK_LABEL_146;
                    }
                    status = new Status(13);
_L9:
                    JD.b(new BatchResult(status, Batch.g(JD)));
                      goto _L4
                    status = Status.Kw;
                      goto _L9
                }

            
            {
                JD = Batch.this;
                super();
            }
            });
        }

    }


    static Object a(Batch batch)
    {
        return batch.mH;
    }

    static boolean a(Batch batch, boolean flag)
    {
        batch.JB = flag;
        return flag;
    }

    static int b(Batch batch)
    {
        int i = batch.Jz;
        batch.Jz = i - 1;
        return i;
    }

    static boolean b(Batch batch, boolean flag)
    {
        batch.JA = flag;
        return flag;
    }

    static int c(Batch batch)
    {
        return batch.Jz;
    }

    static boolean d(Batch batch)
    {
        return batch.JB;
    }

    static void e(Batch batch)
    {
        batch.BaseImplementation.AbstractPendingResult.cancel();
    }

    static boolean f(Batch batch)
    {
        return batch.JA;
    }

    static PendingResult[] g(Batch batch)
    {
        return batch.JC;
    }

    public Result c(Status status)
    {
        return createFailedResult(status);
    }

    public void cancel()
    {
        super.cancel();
        PendingResult apendingresult[] = JC;
        int j = apendingresult.length;
        for (int i = 0; i < j; i++)
        {
            apendingresult[i].cancel();
        }

    }

    public BatchResult createFailedResult(Status status)
    {
        return new BatchResult(status, JC);
    }
}
