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

        private List IG;
        private Looper IH;

        public BatchResultToken add(PendingResult pendingresult)
        {
            BatchResultToken batchresulttoken = new BatchResultToken(IG.size());
            IG.add(pendingresult);
            return batchresulttoken;
        }

        public Batch build()
        {
            return new Batch(IG, IH);
        }

        public Builder(GoogleApiClient googleapiclient)
        {
            IG = new ArrayList();
            IH = googleapiclient.getLooper();
        }
    }


    private int IA;
    private boolean IB;
    private boolean IC;
    private final PendingResult IE[];
    private final Object mw;

    private Batch(List list, Looper looper)
    {
        super(new BaseImplementation.CallbackHandler(looper));
        mw = new Object();
        IA = list.size();
        IE = new PendingResult[IA];
        for (int i = 0; i < list.size(); i++)
        {
            looper = (PendingResult)list.get(i);
            IE[i] = looper;
            looper.a(new PendingResult.a() {

                final Batch IF;

                public void n(Status status)
                {
label0:
                    {
                        synchronized (Batch.a(IF))
                        {
                            if (!IF.isCanceled())
                            {
                                break label0;
                            }
                        }
                        return;
                    }
                    if (!status.isCanceled()) goto _L2; else goto _L1
_L1:
                    Batch.a(IF, true);
_L8:
                    Batch.b(IF);
                    if (Batch.c(IF) != 0) goto _L4; else goto _L3
_L3:
                    if (!Batch.d(IF)) goto _L6; else goto _L5
_L5:
                    Batch.e(IF);
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
                    Batch.b(IF, true);
                      goto _L8
_L6:
                    if (!Batch.f(IF))
                    {
                        break MISSING_BLOCK_LABEL_146;
                    }
                    status = new Status(13);
_L9:
                    IF.b(new BatchResult(status, Batch.g(IF)));
                      goto _L4
                    status = Status.Jv;
                      goto _L9
                }

            
            {
                IF = Batch.this;
                super();
            }
            });
        }

    }


    static Object a(Batch batch)
    {
        return batch.mw;
    }

    static boolean a(Batch batch, boolean flag)
    {
        batch.IC = flag;
        return flag;
    }

    static int b(Batch batch)
    {
        int i = batch.IA;
        batch.IA = i - 1;
        return i;
    }

    static boolean b(Batch batch, boolean flag)
    {
        batch.IB = flag;
        return flag;
    }

    static int c(Batch batch)
    {
        return batch.IA;
    }

    static boolean d(Batch batch)
    {
        return batch.IC;
    }

    static void e(Batch batch)
    {
        batch.BaseImplementation.AbstractPendingResult.cancel();
    }

    static boolean f(Batch batch)
    {
        return batch.IB;
    }

    static PendingResult[] g(Batch batch)
    {
        return batch.IE;
    }

    public Result c(Status status)
    {
        return createFailedResult(status);
    }

    public void cancel()
    {
        super.cancel();
        PendingResult apendingresult[] = IE;
        int j = apendingresult.length;
        for (int i = 0; i < j; i++)
        {
            apendingresult[i].cancel();
        }

    }

    public BatchResult createFailedResult(Status status)
    {
        return new BatchResult(status, IE);
    }
}
