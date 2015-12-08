// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.ActivityRecognitionApi;

public class nb
    implements ActivityRecognitionApi
{

    public nb()
    {
    }

    public PendingResult removeActivityUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.b(new _cls2(googleapiclient, pendingintent));
    }

    public PendingResult requestActivityUpdates(GoogleApiClient googleapiclient, long l, PendingIntent pendingintent)
    {
        return googleapiclient.b(new _cls1(googleapiclient, l, pendingintent));
    }

    private class _cls2 extends a
    {
        private class a extends com.google.android.gms.location.ActivityRecognition.a
        {

            public Status b(Status status)
            {
                return status;
            }

            public Result c(Status status)
            {
                return b(status);
            }

            public a(GoogleApiClient googleapiclient)
            {
                super(googleapiclient);
            }
        }


        final PendingIntent agB;
        final nb agC;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
        {
            nk1.a(agB);
            b(Status.Kw);
        }

        _cls2(GoogleApiClient googleapiclient, PendingIntent pendingintent)
        {
            agC = nb.this;
            agB = pendingintent;
            super(googleapiclient);
        }
    }


    private class _cls1 extends a
    {

        final long agA;
        final PendingIntent agB;
        final nb agC;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
        {
            nk1.a(agA, agB);
            b(Status.Kw);
        }

        _cls1(GoogleApiClient googleapiclient, long l, PendingIntent pendingintent)
        {
            agC = nb.this;
            agA = l;
            agB = pendingintent;
            super(googleapiclient);
        }
    }

}
