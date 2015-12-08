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

        private final int qX;
        private final Status yw;

        public int getRequestId()
        {
            return qX;
        }

        public Status getStatus()
        {
            return yw;
        }

        public a(Status status, int i)
        {
            yw = status;
            qX = i;
        }
    }


    public ae()
    {
    }

    private PendingResult a(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        return googleapiclient.a(new d(messagelistener, aintentfilter) {

            final IntentFilter alD[];
            final ae alQ;
            final com.google.android.gms.wearable.MessageApi.MessageListener alR;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alR, alD);
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
                alQ = ae.this;
                alR = messagelistener;
                alD = aintentfilter;
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

            final ae alQ;
            final com.google.android.gms.wearable.MessageApi.MessageListener alR;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alR);
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
                alQ = ae.this;
                alR = messagelistener;
                super();
            }
        });
    }

    public PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1, byte abyte0[])
    {
        return googleapiclient.a(new d(s, s1, abyte0) {

            final String alO;
            final String alP;
            final ae alQ;
            final byte yI[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alO, alP, yI);
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
                alQ = ae.this;
                alO = s;
                alP = s1;
                yI = abyte0;
                super();
            }
        });
    }
}
