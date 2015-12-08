// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionApi;

// Referenced classes of package com.google.android.gms.internal:
//            nk

public class nb
    implements ActivityRecognitionApi
{
    private static abstract class a extends com.google.android.gms.location.ActivityRecognition.a
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


    public nb()
    {
    }

    public PendingResult removeActivityUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(googleapiclient, pendingintent) {

            final PendingIntent agB;
            final nb agC;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((nk)a1);
            }

            protected void a(nk nk1)
                throws RemoteException
            {
                nk1.a(agB);
                b(Status.Kw);
            }

            
            {
                agC = nb.this;
                agB = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestActivityUpdates(GoogleApiClient googleapiclient, long l, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(googleapiclient, l, pendingintent) {

            final long agA;
            final PendingIntent agB;
            final nb agC;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((nk)a1);
            }

            protected void a(nk nk1)
                throws RemoteException
            {
                nk1.a(agA, agB);
                b(Status.Kw);
            }

            
            {
                agC = nb.this;
                agA = l;
                agB = pendingintent;
                super(googleapiclient);
            }
        });
    }
}
