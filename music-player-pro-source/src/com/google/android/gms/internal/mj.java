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
//            lu, lz

public class mj
    implements HistoryApi
{
    private static class a extends lw.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;
        private int Vi;
        private DataReadResult Vj;

        public void a(DataReadResult datareadresult)
        {
            this;
            JVM INSTR monitorenter ;
            Log.v("Fitness", "Received batch result");
            if (Vj != null)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            Vj = datareadresult;
_L2:
            Vi = Vi + 1;
            if (Vi == Vj.kr())
            {
                Ea.b(Vj);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Vj.b(datareadresult);
            if (true) goto _L2; else goto _L1
_L1:
            datareadresult;
            this;
            JVM INSTR monitorexit ;
            throw datareadresult;
        }

        private a(com.google.android.gms.common.api.BaseImplementation.b b)
        {
            Vi = 0;
            Vj = null;
            Ea = b;
        }

    }


    public mj()
    {
    }

    public PendingResult deleteData(GoogleApiClient googleapiclient, DataDeleteRequest datadeleterequest)
    {
        return googleapiclient.a(new lu.c(googleapiclient, datadeleterequest) {

            final mj Vf;
            final DataDeleteRequest Vg;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                lu.b b = new lu.b(this);
                String s = lu1.getContext().getPackageName();
                lu1.jM().a(Vg, b, s);
            }

            
            {
                Vf = mj.this;
                Vg = datadeleterequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult insertData(GoogleApiClient googleapiclient, DataSet dataset)
    {
        return googleapiclient.a(new lu.c(googleapiclient, dataset) {

            final DataSet Ve;
            final mj Vf;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                lu.b b = new lu.b(this);
                String s = lu1.getContext().getPackageName();
                lu1.jM().a((new com.google.android.gms.fitness.request.e.a()).b(Ve).jU(), b, s);
            }

            
            {
                Vf = mj.this;
                Ve = dataset;
                super(googleapiclient);
            }
        });
    }

    public PendingResult readData(GoogleApiClient googleapiclient, DataReadRequest datareadrequest)
    {
        return googleapiclient.a(new lu.a(googleapiclient, datareadrequest) {

            final mj Vf;
            final DataReadRequest Vh;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                a a1 = new a(this);
                String s = lu1.getContext().getPackageName();
                lu1.jM().a(Vh, a1, s);
            }

            protected Result c(Status status)
            {
                return x(status);
            }

            protected DataReadResult x(Status status)
            {
                return DataReadResult.a(status, Vh);
            }

            
            {
                Vf = mj.this;
                Vh = datareadrequest;
                super(googleapiclient);
            }
        });
    }
}
