// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.e;

// Referenced classes of package com.google.android.gms.internal:
//            jx

public final class oy
    implements Account
{

    public oy()
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
        jx.b(flag, "GoogleApiClient parameter is required.");
        jx.a(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        googleapiclient = (e)googleapiclient.a(c);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.a(flag, "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    public final void clearDefaultAccount(GoogleApiClient googleapiclient)
    {
        a(googleapiclient, Plus.DQ).clearDefaultAccount();
    }

    public final String getAccountName(GoogleApiClient googleapiclient)
    {
        return a(googleapiclient, Plus.DQ).getAccountName();
    }

    public final PendingResult revokeAccessAndDisconnect(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new _cls1(googleapiclient));
    }

    private class _cls1 extends a
    {
        private class a extends com.google.android.gms.plus.Plus.a
        {

            public Status b(Status status)
            {
                return status;
            }

            public Result c(Status status)
            {
                return b(status);
            }

            private a(GoogleApiClient googleapiclient)
            {
                super(googleapiclient);
            }

            a(GoogleApiClient googleapiclient, _cls1 _pcls1)
            {
                this(googleapiclient);
            }
        }


        final oy anY;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((e)a1);
        }

        protected void a(e e1)
        {
            e1.l(this);
        }

        _cls1(GoogleApiClient googleapiclient)
        {
            anY = oy.this;
            super(googleapiclient, null);
        }
    }

}
