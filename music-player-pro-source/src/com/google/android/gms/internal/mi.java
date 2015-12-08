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
import com.google.android.gms.fitness.ConfigApi;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.j;
import com.google.android.gms.fitness.result.DataTypeResult;

// Referenced classes of package com.google.android.gms.internal:
//            lu, lz

public class mi
    implements ConfigApi
{
    private static class a extends ly.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(DataTypeResult datatyperesult)
        {
            Ea.b(datatyperesult);
        }

        private a(com.google.android.gms.common.api.BaseImplementation.b b)
        {
            Ea = b;
        }

    }


    public mi()
    {
    }

    public PendingResult createCustomDataType(GoogleApiClient googleapiclient, DataTypeCreateRequest datatypecreaterequest)
    {
        return googleapiclient.b(new lu.a(googleapiclient, datatypecreaterequest) {

            final DataTypeCreateRequest Vb;
            final mi Vc;

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
                lu1.jM().a(Vb, a1, s);
            }

            protected Result c(Status status)
            {
                return w(status);
            }

            protected DataTypeResult w(Status status)
            {
                return DataTypeResult.E(status);
            }

            
            {
                Vc = mi.this;
                Vb = datatypecreaterequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult disableFit(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new lu.c(googleapiclient) {

            final mi Vc;

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
                lu1.jM().a(b, s);
            }

            
            {
                Vc = mi.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult readDataType(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.a(new lu.a(googleapiclient, new j(s)) {

            final mi Vc;
            final j Vd;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                a a1 = new a(this);
                String s1 = lu1.getContext().getPackageName();
                lu1.jM().a(Vd, a1, s1);
            }

            protected Result c(Status status)
            {
                return w(status);
            }

            protected DataTypeResult w(Status status)
            {
                return DataTypeResult.E(status);
            }

            
            {
                Vc = mi.this;
                Vd = j1;
                super(googleapiclient);
            }
        });
    }
}
