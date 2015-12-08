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
//            jg

public class ja
    implements ActivityRecognitionApi
{
    private static abstract class a extends com.google.android.gms.location.ActivityRecognition.a
    {

        public Result c(Status status)
        {
            return d(status);
        }

        public Status d(Status status)
        {
            return status;
        }

        private a()
        {
        }

    }


    public ja()
    {
    }

    public PendingResult removeActivityUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(pendingintent) {

            final PendingIntent Vu;
            final ja Vv;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
                throws RemoteException
            {
                jg1.removeActivityUpdates(Vu);
                b(Status.En);
            }

            
            {
                Vv = ja.this;
                Vu = pendingintent;
                super();
            }
        });
    }

    public PendingResult requestActivityUpdates(GoogleApiClient googleapiclient, long l, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(l, pendingintent) {

            final long Vt;
            final PendingIntent Vu;
            final ja Vv;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
                throws RemoteException
            {
                jg1.requestActivityUpdates(Vt, Vu);
                b(Status.En);
            }

            
            {
                Vv = ja.this;
                Vt = l;
                Vu = pendingintent;
                super();
            }
        });
    }
}
