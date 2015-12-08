// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.SensorsApi;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.fitness.request.o;
import com.google.android.gms.fitness.request.q;
import com.google.android.gms.fitness.result.DataSourcesResult;

// Referenced classes of package com.google.android.gms.internal:
//            ku, kk, kp

public class lc
    implements SensorsApi
{
    private static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public a()
        {
            super(Fitness.CU);
        }
    }

    private static interface b
    {

        public abstract void jd();
    }

    private static class c extends kn.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(DataSourcesResult datasourcesresult)
        {
            De.b(datasourcesresult);
        }

        private c(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = b1;
        }

    }

    private static class d extends kt.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        private final b TX;

        public void k(Status status)
        {
            if (TX != null && status.isSuccess())
            {
                TX.jd();
            }
            De.b(status);
        }

        private d(com.google.android.gms.common.api.BaseImplementation.b b1, b b2)
        {
            De = b1;
            TX = b2;
        }

    }


    public lc()
    {
    }

    private PendingResult a(GoogleApiClient googleapiclient, o o1)
    {
        return googleapiclient.a(new a(o1) {

            final lc TS;
            final o TT;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                kk.b b1 = new kk.b(this);
                String s = kk1.getContext().getPackageName();
                kk1.jb().a(TT, b1, s);
            }

            protected Result c(Status status)
            {
                return d(status);
            }

            protected Status d(Status status)
            {
                return status;
            }

            
            {
                TS = lc.this;
                TT = o1;
                super();
            }
        });
    }

    private PendingResult a(GoogleApiClient googleapiclient, q q1, b b1)
    {
        return googleapiclient.b(new a(b1, q1) {

            final lc TS;
            final b TV;
            final q TW;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                d d1 = new d(this, TV);
                String s = kk1.getContext().getPackageName();
                kk1.jb().a(TW, d1, s);
            }

            protected Result c(Status status)
            {
                return d(status);
            }

            protected Status d(Status status)
            {
                return status;
            }

            
            {
                TS = lc.this;
                TV = b1;
                TW = q1;
                super();
            }
        });
    }

    public PendingResult add(GoogleApiClient googleapiclient, SensorRequest sensorrequest, PendingIntent pendingintent)
    {
        return a(googleapiclient, new o(sensorrequest, null, pendingintent));
    }

    public PendingResult add(GoogleApiClient googleapiclient, SensorRequest sensorrequest, OnDataPointListener ondatapointlistener)
    {
        return a(googleapiclient, new o(sensorrequest, com.google.android.gms.fitness.data.l.a.iV().a(ondatapointlistener), null));
    }

    public PendingResult findDataSources(GoogleApiClient googleapiclient, DataSourcesRequest datasourcesrequest)
    {
        return googleapiclient.a(new a(datasourcesrequest) {

            final DataSourcesRequest TR;
            final lc TS;

            protected DataSourcesResult A(Status status)
            {
                return DataSourcesResult.E(status);
            }

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                c c1 = new c(this);
                String s = kk1.getContext().getPackageName();
                kk1.jb().a(TR, c1, s);
            }

            protected Result c(Status status)
            {
                return A(status);
            }

            
            {
                TS = lc.this;
                TR = datasourcesrequest;
                super();
            }
        });
    }

    public PendingResult remove(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return a(googleapiclient, new q(null, pendingintent), null);
    }

    public PendingResult remove(GoogleApiClient googleapiclient, OnDataPointListener ondatapointlistener)
    {
        com.google.android.gms.fitness.data.l l = com.google.android.gms.fitness.data.l.a.iV().b(ondatapointlistener);
        if (l == null)
        {
            return new ku(Status.Jv);
        } else
        {
            return a(googleapiclient, new q(l, null), new b(ondatapointlistener) {

                final lc TS;
                final OnDataPointListener TU;

                public void jd()
                {
                    com.google.android.gms.fitness.data.l.a.iV().c(TU);
                }

            
            {
                TS = lc.this;
                TU = ondatapointlistener;
                super();
            }
            });
        }
    }
}
