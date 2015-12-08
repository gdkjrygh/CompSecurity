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
//            me, lu, lz

public class mm
    implements SensorsApi
{
    private static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public a(GoogleApiClient googleapiclient)
        {
            super(Fitness.DQ, googleapiclient);
        }
    }

    private static interface b
    {

        public abstract void jO();
    }

    private static class c extends lx.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(DataSourcesResult datasourcesresult)
        {
            Ea.b(datasourcesresult);
        }

        private c(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = b1;
        }

    }

    private static class d extends md.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;
        private final b Vu;

        public void j(Status status)
        {
            if (Vu != null && status.isSuccess())
            {
                Vu.jO();
            }
            Ea.b(status);
        }

        private d(com.google.android.gms.common.api.BaseImplementation.b b1, b b2)
        {
            Ea = b1;
            Vu = b2;
        }

    }


    public mm()
    {
    }

    private PendingResult a(GoogleApiClient googleapiclient, o o1)
    {
        return googleapiclient.a(new a(googleapiclient, o1) {

            final mm Vp;
            final o Vq;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                lu.b b1 = new lu.b(this);
                String s = lu1.getContext().getPackageName();
                lu1.jM().a(Vq, b1, s);
            }

            protected Status b(Status status)
            {
                return status;
            }

            protected Result c(Status status)
            {
                return b(status);
            }

            
            {
                Vp = mm.this;
                Vq = o1;
                super(googleapiclient);
            }
        });
    }

    private PendingResult a(GoogleApiClient googleapiclient, q q1, b b1)
    {
        return googleapiclient.b(new a(googleapiclient, b1, q1) {

            final mm Vp;
            final b Vs;
            final q Vt;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                d d1 = new d(this, Vs);
                String s = lu1.getContext().getPackageName();
                lu1.jM().a(Vt, d1, s);
            }

            protected Status b(Status status)
            {
                return status;
            }

            protected Result c(Status status)
            {
                return b(status);
            }

            
            {
                Vp = mm.this;
                Vs = b1;
                Vt = q1;
                super(googleapiclient);
            }
        });
    }

    public PendingResult add(GoogleApiClient googleapiclient, SensorRequest sensorrequest, PendingIntent pendingintent)
    {
        return a(googleapiclient, new o(sensorrequest, null, pendingintent));
    }

    public PendingResult add(GoogleApiClient googleapiclient, SensorRequest sensorrequest, OnDataPointListener ondatapointlistener)
    {
        return a(googleapiclient, new o(sensorrequest, com.google.android.gms.fitness.data.l.a.jG().a(ondatapointlistener), null));
    }

    public PendingResult findDataSources(GoogleApiClient googleapiclient, DataSourcesRequest datasourcesrequest)
    {
        return googleapiclient.a(new a(googleapiclient, datasourcesrequest) {

            final DataSourcesRequest Vo;
            final mm Vp;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                c c1 = new c(this);
                String s = lu1.getContext().getPackageName();
                lu1.jM().a(Vo, c1, s);
            }

            protected Result c(Status status)
            {
                return z(status);
            }

            protected DataSourcesResult z(Status status)
            {
                return DataSourcesResult.D(status);
            }

            
            {
                Vp = mm.this;
                Vo = datasourcesrequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult remove(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return a(googleapiclient, new q(null, pendingintent), null);
    }

    public PendingResult remove(GoogleApiClient googleapiclient, OnDataPointListener ondatapointlistener)
    {
        com.google.android.gms.fitness.data.l l = com.google.android.gms.fitness.data.l.a.jG().b(ondatapointlistener);
        if (l == null)
        {
            return new me(Status.Kw);
        } else
        {
            return a(googleapiclient, new q(l, null), new b(ondatapointlistener) {

                final mm Vp;
                final OnDataPointListener Vr;

                public void jO()
                {
                    com.google.android.gms.fitness.data.l.a.jG().c(Vr);
                }

            
            {
                Vp = mm.this;
                Vr = ondatapointlistener;
                super();
            }
            });
        }
    }
}
