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

        private List DE;
        private Looper DF;

        public BatchResultToken add(PendingResult pendingresult)
        {
            BatchResultToken batchresulttoken = new BatchResultToken(DE.size());
            DE.add(pendingresult);
            return batchresulttoken;
        }

        public Batch build()
        {
            return new Batch(DE, DF);
        }

        public Builder(GoogleApiClient googleapiclient)
        {
            DE = new ArrayList();
            DF = googleapiclient.getLooper();
        }
    }


    private boolean DA;
    private boolean DB;
    private final PendingResult DC[];
    private int Dz;
    private final Object ls;

    private Batch(List list, Looper looper)
    {
        super(new a.c(looper));
        ls = new Object();
        Dz = list.size();
        DC = new PendingResult[Dz];
        for (int i = 0; i < list.size(); i++)
        {
            looper = (PendingResult)list.get(i);
            DC[i] = looper;
            looper.a(new PendingResult.a() {

                final Batch DD;

                public void n(Status status)
                {
label0:
                    {
                        synchronized (Batch.a(DD))
                        {
                            if (!DD.isCanceled())
                            {
                                break label0;
                            }
                        }
                        return;
                    }
                    if (!status.isCanceled()) goto _L2; else goto _L1
_L1:
                    Batch.a(DD, true);
_L8:
                    Batch.b(DD);
                    if (Batch.c(DD) != 0) goto _L4; else goto _L3
_L3:
                    if (!Batch.d(DD)) goto _L6; else goto _L5
_L5:
                    Batch.e(DD);
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
                    Batch.b(DD, true);
                      goto _L8
_L6:
                    if (!Batch.f(DD))
                    {
                        break MISSING_BLOCK_LABEL_146;
                    }
                    status = new Status(13);
_L9:
                    DD.b(new BatchResult(status, Batch.g(DD)));
                      goto _L4
                    status = Status.En;
                      goto _L9
                }

            
            {
                DD = Batch.this;
                super();
            }
            });
        }

    }


    static Object a(Batch batch)
    {
        return batch.ls;
    }

    static boolean a(Batch batch, boolean flag)
    {
        batch.DB = flag;
        return flag;
    }

    static int b(Batch batch)
    {
        int i = batch.Dz;
        batch.Dz = i - 1;
        return i;
    }

    static boolean b(Batch batch, boolean flag)
    {
        batch.DA = flag;
        return flag;
    }

    static int c(Batch batch)
    {
        return batch.Dz;
    }

    static boolean d(Batch batch)
    {
        return batch.DB;
    }

    static void e(Batch batch)
    {
        batch.a.a.cancel();
    }

    static boolean f(Batch batch)
    {
        return batch.DA;
    }

    static PendingResult[] g(Batch batch)
    {
        return batch.DC;
    }

    public Result c(Status status)
    {
        return createFailedResult(status);
    }

    public void cancel()
    {
        super.cancel();
        PendingResult apendingresult[] = DC;
        int j = apendingresult.length;
        for (int i = 0; i < j; i++)
        {
            apendingresult[i].cancel();
        }

    }

    public BatchResult createFailedResult(Status status)
    {
        return new BatchResult(status, DC);
    }
}
