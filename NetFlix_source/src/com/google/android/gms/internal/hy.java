// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.e;

// Referenced classes of package com.google.android.gms.internal:
//            fq

public final class hy
    implements Account
{
    private static abstract class a extends com.google.android.gms.plus.Plus.a
    {

        public Result d(Status status)
        {
            return f(status);
        }

        public Status f(Status status)
        {
            return status;
        }

        private a()
        {
        }

    }


    public hy()
    {
    }

    private static e a(GoogleApiClient googleapiclient, com.google.android.gms.common.api.Api.c c)
    {
        boolean flag1 = true;
        boolean flag;
        if (googleapiclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.b(flag, "GoogleApiClient parameter is required.");
        fq.a(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        googleapiclient = (e)googleapiclient.a(c);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        fq.a(flag, "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    public void clearDefaultAccount(GoogleApiClient googleapiclient)
    {
        a(googleapiclient, Plus.wx).clearDefaultAccount();
    }

    public String getAccountName(GoogleApiClient googleapiclient)
    {
        return a(googleapiclient, Plus.wx).getAccountName();
    }

    public PendingResult revokeAccessAndDisconnect(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new a() {

            final hy Uu;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((e)a1);
            }

            protected void a(e e1)
            {
                e1.n(this);
            }

            
            {
                Uu = hy.this;
                super();
            }
        });
    }
}
