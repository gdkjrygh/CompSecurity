// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, au

public final class ae
    implements MessageApi
{
    public static class a
        implements com.google.android.gms.wearable.MessageApi.SendMessageResult
    {

        private final int ra;
        private final Status yz;

        public int getRequestId()
        {
            return ra;
        }

        public Status getStatus()
        {
            return yz;
        }

        public a(Status status, int i)
        {
            yz = status;
            ra = i;
        }
    }


    public ae()
    {
    }

    private PendingResult a(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        return googleapiclient.a(new d(messagelistener, aintentfilter) {

            final IntentFilter alG[];
            final ae alT;
            final com.google.android.gms.wearable.MessageApi.MessageListener alU;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alU, alG);
            }

            public Result c(Status status)
            {
                return d(status);
            }

            public Status d(Status status)
            {
                return new Status(13);
            }

            
            {
                alT = ae.this;
                alU = messagelistener;
                alG = aintentfilter;
                super();
            }
        });
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
    {
        return a(googleapiclient, messagelistener, null);
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
    {
        return googleapiclient.a(new d(messagelistener) {

            final ae alT;
            final com.google.android.gms.wearable.MessageApi.MessageListener alU;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alU);
            }

            public Result c(Status status)
            {
                return d(status);
            }

            public Status d(Status status)
            {
                return new Status(13);
            }

            
            {
                alT = ae.this;
                alU = messagelistener;
                super();
            }
        });
    }

    public PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1, byte abyte0[])
    {
        return googleapiclient.a(new d(s, s1, abyte0) {

            final String alR;
            final String alS;
            final ae alT;
            final byte yL[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alR, alS, yL);
            }

            protected com.google.android.gms.wearable.MessageApi.SendMessageResult au(Status status)
            {
                return new a(status, -1);
            }

            protected Result c(Status status)
            {
                return au(status);
            }

            
            {
                alT = ae.this;
                alR = s;
                alS = s1;
                yL = abyte0;
                super();
            }
        });
    }
}
