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

        private List DB;
        private Looper DC;

        public BatchResultToken add(PendingResult pendingresult)
        {
            BatchResultToken batchresulttoken = new BatchResultToken(DB.size());
            DB.add(pendingresult);
            return batchresulttoken;
        }

        public Batch build()
        {
            return new Batch(DB, DC);
        }

        public Builder(GoogleApiClient googleapiclient)
        {
            DB = new ArrayList();
            DC = googleapiclient.getLooper();
        }
    }


    private int Dw;
    private boolean Dx;
    private boolean Dy;
    private final PendingResult Dz[];
    private final Object lq;

    private Batch(List list, Looper looper)
    {
        super(new a.c(looper));
        lq = new Object();
        Dw = list.size();
        Dz = new PendingResult[Dw];
        for (int i = 0; i < list.size(); i++)
        {
            looper = (PendingResult)list.get(i);
            Dz[i] = looper;
            looper.a(new PendingResult.a() {

                final Batch DA;

                public void n(Status status)
                {
label0:
                    {
                        synchronized (Batch.a(DA))
                        {
                            if (!DA.isCanceled())
                            {
                                break label0;
                            }
                        }
                        return;
                    }
                    if (!status.isCanceled()) goto _L2; else goto _L1
_L1:
                    Batch.a(DA, true);
_L8:
                    Batch.b(DA);
                    if (Batch.c(DA) != 0) goto _L4; else goto _L3
_L3:
                    if (!Batch.d(DA)) goto _L6; else goto _L5
_L5:
                    Batch.e(DA);
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
                    Batch.b(DA, true);
                      goto _L8
_L6:
                    if (!Batch.f(DA))
                    {
                        break MISSING_BLOCK_LABEL_146;
                    }
                    status = new Status(13);
_L9:
                    DA.b(new BatchResult(status, Batch.g(DA)));
                      goto _L4
                    status = Status.Ek;
                      goto _L9
                }

            
            {
                DA = Batch.this;
                super();
            }
            });
        }

    }


    static Object a(Batch batch)
    {
        return batch.lq;
    }

    static boolean a(Batch batch, boolean flag)
    {
        batch.Dy = flag;
        return flag;
    }

    static int b(Batch batch)
    {
        int i = batch.Dw;
        batch.Dw = i - 1;
        return i;
    }

    static boolean b(Batch batch, boolean flag)
    {
        batch.Dx = flag;
        return flag;
    }

    static int c(Batch batch)
    {
        return batch.Dw;
    }

    static boolean d(Batch batch)
    {
        return batch.Dy;
    }

    static void e(Batch batch)
    {
        batch.a.a.cancel();
    }

    static boolean f(Batch batch)
    {
        return batch.Dx;
    }

    static PendingResult[] g(Batch batch)
    {
        return batch.Dz;
    }

    public Result c(Status status)
    {
        return createFailedResult(status);
    }

    public void cancel()
    {
        super.cancel();
        PendingResult apendingresult[] = Dz;
        int j = apendingresult.length;
        for (int i = 0; i < j; i++)
        {
            apendingresult[i].cancel();
        }

    }

    public BatchResult createFailedResult(Status status)
    {
        return new BatchResult(status, Dz);
    }
}
