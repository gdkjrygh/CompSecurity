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
//            d, ba

public final class ah
    implements MessageApi
{
    private static final class a extends d
    {

        private IntentFilter axD[];
        private com.google.android.gms.wearable.MessageApi.MessageListener axV;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((ba)a1);
        }

        protected void a(ba ba1)
            throws RemoteException
        {
            ba1.a(this, axV, axD);
            axV = null;
            axD = null;
        }

        public Status b(Status status)
        {
            axV = null;
            axD = null;
            return status;
        }

        public Result c(Status status)
        {
            return b(status);
        }

        private a(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
        {
            super(googleapiclient);
            axV = messagelistener;
            axD = aintentfilter;
        }

    }

    public static class b
        implements com.google.android.gms.wearable.MessageApi.SendMessageResult
    {

        private final Status Eb;
        private final int ve;

        public int getRequestId()
        {
            return ve;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public b(Status status, int i)
        {
            Eb = status;
            ve = i;
        }
    }


    public ah()
    {
    }

    private PendingResult a(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        return googleapiclient.a(new a(googleapiclient, messagelistener, aintentfilter));
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
    {
        return a(googleapiclient, messagelistener, null);
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
    {
        return googleapiclient.a(new d(googleapiclient, messagelistener) {

            final ah axT;
            final com.google.android.gms.wearable.MessageApi.MessageListener axU;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ba)a1);
            }

            protected void a(ba ba1)
                throws RemoteException
            {
                ba1.a(this, axU);
            }

            public Status b(Status status)
            {
                return status;
            }

            public Result c(Status status)
            {
                return b(status);
            }

            
            {
                axT = ah.this;
                axU = messagelistener;
                super(googleapiclient);
            }
        });
    }

    public PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1, byte abyte0[])
    {
        return googleapiclient.a(new d(googleapiclient, s, s1, abyte0) {

            final byte DU[];
            final String axR;
            final String axS;
            final ah axT;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ba)a1);
            }

            protected void a(ba ba1)
                throws RemoteException
            {
                ba1.a(this, axR, axS, DU);
            }

            protected com.google.android.gms.wearable.MessageApi.SendMessageResult aI(Status status)
            {
                return new b(status, -1);
            }

            protected Result c(Status status)
            {
                return aI(status);
            }

            
            {
                axT = ah.this;
                axR = s;
                axS = s1;
                DU = abyte0;
                super(googleapiclient);
            }
        });
    }
}
