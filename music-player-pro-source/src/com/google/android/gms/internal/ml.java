// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.RecordingApi;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.request.af;
import com.google.android.gms.fitness.request.aj;
import com.google.android.gms.fitness.request.m;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

// Referenced classes of package com.google.android.gms.internal:
//            lu, lz

public class ml
    implements RecordingApi
{
    private static class a extends ma.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(ListSubscriptionsResult listsubscriptionsresult)
        {
            Ea.b(listsubscriptionsresult);
        }

        private a(com.google.android.gms.common.api.BaseImplementation.b b)
        {
            Ea = b;
        }

    }


    public ml()
    {
    }

    private PendingResult a(GoogleApiClient googleapiclient, m m)
    {
        return googleapiclient.a(new lu.a(googleapiclient, m) {

            final m Vk;
            final ml Vl;

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
                lu1.jM().a(Vk, a1, s);
            }

            protected Result c(Status status)
            {
                return y(status);
            }

            protected ListSubscriptionsResult y(Status status)
            {
                return ListSubscriptionsResult.F(status);
            }

            
            {
                Vl = ml.this;
                Vk = m;
                super(googleapiclient);
            }
        });
    }

    public PendingResult a(GoogleApiClient googleapiclient, af af)
    {
        return googleapiclient.a(new lu.c(googleapiclient, af) {

            final ml Vl;
            final af Vm;

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
                lu1.jM().a(Vm, b, s);
            }

            
            {
                Vl = ml.this;
                Vm = af;
                super(googleapiclient);
            }
        });
    }

    public PendingResult a(GoogleApiClient googleapiclient, aj aj)
    {
        return googleapiclient.b(new lu.c(googleapiclient, aj) {

            final ml Vl;
            final aj Vn;

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
                lu1.jM().a(Vn, b, s);
            }

            
            {
                Vl = ml.this;
                Vn = aj;
                super(googleapiclient);
            }
        });
    }

    public PendingResult listSubscriptions(GoogleApiClient googleapiclient)
    {
        return a(googleapiclient, (new com.google.android.gms.fitness.request.m.a()).ka());
    }

    public PendingResult listSubscriptions(GoogleApiClient googleapiclient, DataType datatype)
    {
        return a(googleapiclient, (new com.google.android.gms.fitness.request.m.a()).c(datatype).ka());
    }

    public PendingResult subscribe(GoogleApiClient googleapiclient, DataSource datasource)
    {
        return a(googleapiclient, (new com.google.android.gms.fitness.request.af.a()).b((new com.google.android.gms.fitness.data.Subscription.a()).b(datasource).jK()).kp());
    }

    public PendingResult subscribe(GoogleApiClient googleapiclient, DataType datatype)
    {
        return a(googleapiclient, (new com.google.android.gms.fitness.request.af.a()).b((new com.google.android.gms.fitness.data.Subscription.a()).b(datatype).jK()).kp());
    }

    public PendingResult unsubscribe(GoogleApiClient googleapiclient, DataSource datasource)
    {
        return a(googleapiclient, (new com.google.android.gms.fitness.request.aj.a()).d(datasource).kq());
    }

    public PendingResult unsubscribe(GoogleApiClient googleapiclient, DataType datatype)
    {
        return a(googleapiclient, (new com.google.android.gms.fitness.request.aj.a()).d(datatype).kq());
    }

    public PendingResult unsubscribe(GoogleApiClient googleapiclient, Subscription subscription)
    {
        if (subscription.getDataType() == null)
        {
            return unsubscribe(googleapiclient, subscription.getDataSource());
        } else
        {
            return unsubscribe(googleapiclient, subscription.getDataType());
        }
    }
}
