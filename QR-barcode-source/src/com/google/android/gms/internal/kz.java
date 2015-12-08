// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.HistoryApi;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.result.DataReadResult;

// Referenced classes of package com.google.android.gms.internal:
//            kk, kp

public class kz
    implements HistoryApi
{
    private static class a extends km.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        private int TL;
        private DataReadResult TM;

        public void a(DataReadResult datareadresult)
        {
            this;
            JVM INSTR monitorenter ;
            Log.v("Fitness", "Received batch result");
            if (TM != null)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            TM = datareadresult;
_L2:
            TL = TL + 1;
            if (TL == TM.jH())
            {
                De.b(TM);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            TM.b(datareadresult);
            if (true) goto _L2; else goto _L1
_L1:
            datareadresult;
            this;
            JVM INSTR monitorexit ;
            throw datareadresult;
        }

        private a(com.google.android.gms.common.api.BaseImplementation.b b)
        {
            TL = 0;
            TM = null;
            De = b;
        }

    }


    public kz()
    {
    }

    public PendingResult deleteData(GoogleApiClient googleapiclient, DataDeleteRequest datadeleterequest)
    {
        return googleapiclient.a(new kk.c(datadeleterequest) {

            final kz TI;
            final DataDeleteRequest TJ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                kk.b b = new kk.b(this);
                String s = kk1.getContext().getPackageName();
                kk1.jb().a(TJ, b, s);
            }

            
            {
                TI = kz.this;
                TJ = datadeleterequest;
                super();
            }
        });
    }

    public PendingResult insertData(GoogleApiClient googleapiclient, DataSet dataset)
    {
        return googleapiclient.a(new kk.c(dataset) {

            final DataSet TH;
            final kz TI;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                kk.b b = new kk.b(this);
                String s = kk1.getContext().getPackageName();
                kk1.jb().a((new com.google.android.gms.fitness.request.e.a()).b(TH).jj(), b, s);
            }

            
            {
                TI = kz.this;
                TH = dataset;
                super();
            }
        });
    }

    public PendingResult readData(GoogleApiClient googleapiclient, DataReadRequest datareadrequest)
    {
        return googleapiclient.a(new kk.a(datareadrequest) {

            final kz TI;
            final DataReadRequest TK;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                a a1 = new a(this);
                String s = kk1.getContext().getPackageName();
                kk1.jb().a(TK, a1, s);
            }

            protected Result c(Status status)
            {
                return y(status);
            }

            protected DataReadResult y(Status status)
            {
                return DataReadResult.a(status, TK);
            }

            
            {
                TI = kz.this;
                TK = datareadrequest;
                super();
            }
        });
    }
}
