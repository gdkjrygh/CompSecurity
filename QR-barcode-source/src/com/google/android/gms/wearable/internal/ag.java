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
//            d, aw

public final class ag
    implements MessageApi
{
    public static class a
        implements com.google.android.gms.wearable.MessageApi.SendMessageResult
    {

        private final Status CM;
        private final int uQ;

        public int getRequestId()
        {
            return uQ;
        }

        public Status getStatus()
        {
            return CM;
        }

        public a(Status status, int i)
        {
            CM = status;
            uQ = i;
        }
    }


    public ag()
    {
    }

    private PendingResult a(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        return googleapiclient.a(new d(messagelistener, aintentfilter) {

            final ag avF;
            final com.google.android.gms.wearable.MessageApi.MessageListener avG;
            final IntentFilter avr[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.a(this, avG, avr);
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
                avF = ag.this;
                avG = messagelistener;
                avr = aintentfilter;
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

            final ag avF;
            final com.google.android.gms.wearable.MessageApi.MessageListener avG;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.a(this, avG);
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
                avF = ag.this;
                avG = messagelistener;
                super();
            }
        });
    }

    public PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1, byte abyte0[])
    {
        return googleapiclient.a(new d(s, s1, abyte0) {

            final byte CY[];
            final String avD;
            final String avE;
            final ag avF;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.a(this, avD, avE, CY);
            }

            protected com.google.android.gms.wearable.MessageApi.SendMessageResult aJ(Status status)
            {
                return new a(status, -1);
            }

            protected Result c(Status status)
            {
                return aJ(status);
            }

            
            {
                avF = ag.this;
                avD = s;
                avE = s1;
                CY = abyte0;
                super();
            }
        });
    }
}
