// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.client;

import android.content.Context;
import android.os.Bundle;
import com.dominos.android.sdk.common.LogUtil;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.a;
import com.google.android.gms.wearable.q;

// Referenced classes of package com.dominos.wear.client:
//            WearBaseOrderClient

class initGoogleClient
    implements n, o
{

    private final Context context;
    private l mGoogleApiClient;
    private final PutDataRequest mPutDataRequest;
    final WearBaseOrderClient this$0;

    private void initGoogleClient()
    {
        if (mGoogleApiClient == null)
        {
            mGoogleApiClient = (new m(context)).a(q.h).a(this).a(this).c();
        }
    }

    public void connect()
    {
        while (mGoogleApiClient.g() || mGoogleApiClient.f()) 
        {
            return;
        }
        mGoogleApiClient.c();
        LogUtil.d(WearBaseOrderClient.access$100(WearBaseOrderClient.this), "GoogleApiClient Connecting...", new Object[0]);
    }

    public void disconnect()
    {
        if (mGoogleApiClient != null)
        {
            mGoogleApiClient.e();
            LogUtil.d(WearBaseOrderClient.access$100(WearBaseOrderClient.this), "GoogleApiClient Disconnected.", new Object[0]);
        }
    }

    public void onConnected(Bundle bundle)
    {
        q.a.a(mGoogleApiClient, mPutDataRequest);
        LogUtil.d(WearBaseOrderClient.access$100(WearBaseOrderClient.this), "Response data sent to wear!", new Object[0]);
        disconnect();
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        LogUtil.d(WearBaseOrderClient.access$100(WearBaseOrderClient.this), (new StringBuilder("GoogleApiClient connection failed!  ConnectionResult ErrorCode :")).append(connectionresult.c()).toString(), new Object[0]);
    }

    public void onConnectionSuspended(int i)
    {
        LogUtil.d(WearBaseOrderClient.access$100(WearBaseOrderClient.this), (new StringBuilder("GoogleApiClient Connection suspended. Failure code :")).append(i).toString(), new Object[0]);
    }

    public void send()
    {
        connect();
    }

    public (Context context1, PutDataRequest putdatarequest)
    {
        this$0 = WearBaseOrderClient.this;
        super();
        context = context1;
        mPutDataRequest = putdatarequest;
        initGoogleClient();
    }
}
