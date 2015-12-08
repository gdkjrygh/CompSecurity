// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.client;

import android.content.Context;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.v;
import com.google.android.gms.wearable.h;
import com.google.android.gms.wearable.n;
import com.google.android.gms.wearable.q;
import java.util.Iterator;
import java.util.List;

public class WearMessageClient
{

    private static final String TAG = com/dominos/wear/client/WearMessageClient.getSimpleName();
    l mGoogleApiClient;
    private v sendMessageResultResultCallback;

    public WearMessageClient(Context context)
    {
        sendMessageResultResultCallback = new _cls1();
        mGoogleApiClient = (new m(context)).a(q.h).c();
    }

    private void connectIfRequired()
    {
        if (mGoogleApiClient != null && !mGoogleApiClient.f())
        {
            mGoogleApiClient.d();
        }
    }

    public void checkIsWearPaired(WearConnectionCallback wearconnectioncallback)
    {
        connectIfRequired();
        if (mGoogleApiClient != null && mGoogleApiClient.f())
        {
            n n1 = (n)q.c.a(mGoogleApiClient).a();
            if (n1 != null && n1.a() != null && !n1.a().isEmpty())
            {
                wearconnectioncallback.onConnectionSuccess();
            } else
            {
                wearconnectioncallback.onConnectionFailed();
            }
            mGoogleApiClient.e();
            return;
        } else
        {
            LogUtil.d(TAG, "Failed client not connected!", new Object[0]);
            wearconnectioncallback.onConnectionFailed();
            return;
        }
    }

    public void sendToWear(String s1, String s2)
    {
        connectIfRequired();
        if (mGoogleApiClient != null && mGoogleApiClient.f())
        {
            n n1 = (n)q.c.a(mGoogleApiClient).a();
            if (n1 != null && n1.a() != null)
            {
                byte abyte0[];
                com.google.android.gms.wearable.l l1;
                for (Iterator iterator = n1.a().iterator(); iterator.hasNext(); q.b.a(mGoogleApiClient, l1.a(), s1, abyte0).a(sendMessageResultResultCallback))
                {
                    l1 = (com.google.android.gms.wearable.l)iterator.next();
                    abyte0 = null;
                    if (StringHelper.isNotEmpty(s2))
                    {
                        abyte0 = s2.getBytes();
                    }
                }

            }
            mGoogleApiClient.e();
            return;
        } else
        {
            LogUtil.d(TAG, "Failed to send message , Google client not connected!", new Object[0]);
            return;
        }
    }



    private class _cls1
        implements v
    {

        final WearMessageClient this$0;

        public volatile void onResult(u u)
        {
            onResult((j)u);
        }

        public void onResult(j j1)
        {
            if (!j1.b().e())
            {
                LogUtil.e(WearMessageClient.TAG, (new StringBuilder("Failed to send message to wear with status code: ")).append(j1.b().f()).toString(), new Object[0]);
            }
        }

        _cls1()
        {
            this$0 = WearMessageClient.this;
            super();
        }
    }


    private class WearConnectionCallback
    {

        public abstract void onConnectionFailed();

        public abstract void onConnectionSuccess();
    }

}
