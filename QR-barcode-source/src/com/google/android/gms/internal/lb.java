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
//            kk, kp

public class lb
    implements RecordingApi
{
    private static class a extends kq.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(ListSubscriptionsResult listsubscriptionsresult)
        {
            De.b(listsubscriptionsresult);
        }

        private a(com.google.android.gms.common.api.BaseImplementation.b b)
        {
            De = b;
        }

    }


    public lb()
    {
    }

    private PendingResult a(GoogleApiClient googleapiclient, m m)
    {
        return googleapiclient.a(new kk.a(m) {

            final m TN;
            final lb TO;

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
                kk1.jb().a(TN, a1, s);
            }

            protected Result c(Status status)
            {
                return z(status);
            }

            protected ListSubscriptionsResult z(Status status)
            {
                return ListSubscriptionsResult.G(status);
            }

            
            {
                TO = lb.this;
                TN = m;
                super();
            }
        });
    }

    public PendingResult a(GoogleApiClient googleapiclient, af af)
    {
        return googleapiclient.a(new kk.c(af) {

            final lb TO;
            final af TP;

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
                kk1.jb().a(TP, b, s);
            }

            
            {
                TO = lb.this;
                TP = af;
                super();
            }
        });
    }

    public PendingResult a(GoogleApiClient googleapiclient, aj aj)
    {
        return googleapiclient.b(new kk.c(aj) {

            final lb TO;
            final aj TQ;

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
                kk1.jb().a(TQ, b, s);
            }

            
            {
                TO = lb.this;
                TQ = aj;
                super();
            }
        });
    }

    public PendingResult listSubscriptions(GoogleApiClient googleapiclient)
    {
        return a(googleapiclient, (new com.google.android.gms.fitness.request.m.a()).jq());
    }

    public PendingResult listSubscriptions(GoogleApiClient googleapiclient, DataType datatype)
    {
        return a(googleapiclient, (new com.google.android.gms.fitness.request.m.a()).c(datatype).jq());
    }

    public PendingResult subscribe(GoogleApiClient googleapiclient, DataSource datasource)
    {
        return a(googleapiclient, (new com.google.android.gms.fitness.request.af.a()).b((new com.google.android.gms.fitness.data.Subscription.a()).b(datasource).iZ()).jF());
    }

    public PendingResult subscribe(GoogleApiClient googleapiclient, DataType datatype)
    {
        return a(googleapiclient, (new com.google.android.gms.fitness.request.af.a()).b((new com.google.android.gms.fitness.data.Subscription.a()).b(datatype).iZ()).jF());
    }

    public PendingResult unsubscribe(GoogleApiClient googleapiclient, DataSource datasource)
    {
        return a(googleapiclient, (new com.google.android.gms.fitness.request.aj.a()).d(datasource).jG());
    }

    public PendingResult unsubscribe(GoogleApiClient googleapiclient, DataType datatype)
    {
        return a(googleapiclient, (new com.google.android.gms.fitness.request.aj.a()).d(datatype).jG());
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
