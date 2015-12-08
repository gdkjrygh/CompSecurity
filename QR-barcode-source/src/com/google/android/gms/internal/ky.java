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
//            kk, kp

public class ky
    implements ConfigApi
{
    private static class a extends ko.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(DataTypeResult datatyperesult)
        {
            De.b(datatyperesult);
        }

        private a(com.google.android.gms.common.api.BaseImplementation.b b)
        {
            De = b;
        }

    }


    public ky()
    {
    }

    public PendingResult createCustomDataType(GoogleApiClient googleapiclient, DataTypeCreateRequest datatypecreaterequest)
    {
        return googleapiclient.b(new kk.a(datatypecreaterequest) {

            final DataTypeCreateRequest TE;
            final ky TF;

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
                kk1.jb().a(TE, a1, s);
            }

            protected Result c(Status status)
            {
                return x(status);
            }

            protected DataTypeResult x(Status status)
            {
                return DataTypeResult.F(status);
            }

            
            {
                TF = ky.this;
                TE = datatypecreaterequest;
                super();
            }
        });
    }

    public PendingResult disableFit(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new kk.c() {

            final ky TF;

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
                kk1.jb().a(b, s);
            }

            
            {
                TF = ky.this;
                super();
            }
        });
    }

    public PendingResult readDataType(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.a(new kk.a(new j(s)) {

            final ky TF;
            final j TG;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                a a1 = new a(this);
                String s1 = kk1.getContext().getPackageName();
                kk1.jb().a(TG, a1, s1);
            }

            protected Result c(Status status)
            {
                return x(status);
            }

            protected DataTypeResult x(Status status)
            {
                return DataTypeResult.F(status);
            }

            
            {
                TF = ky.this;
                TG = j1;
                super();
            }
        });
    }
}
