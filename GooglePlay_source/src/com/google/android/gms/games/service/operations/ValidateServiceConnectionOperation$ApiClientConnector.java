// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.service.ApiClientTracker;

// Referenced classes of package com.google.android.gms.games.service.operations:
//            ValidateServiceConnectionOperation

private final class mProxyThread
    implements com.google.android.gms.common.api.ientConnector, com.google.android.gms.common.api.ientConnector
{

    GoogleApiClient mApiClient;
    private final DataBroker mBroker;
    private final ClientContext mClientContext;
    private final Context mContext;
    private final String mExternalGameId;
    private final com.google.android.gms.games.service.tConnector mGamesService;
    final HandlerThread mProxyThread = new HandlerThread("ApiClientConnector");
    final ValidateServiceConnectionOperation this$0;

    public final void onConnected(Bundle bundle)
    {
        bundle = mGamesService;
        GoogleApiClient googleapiclient = mApiClient;
        ApiClientTracker apiclienttracker = ((com.google.android.gms.games.service.tConnector.mApiClient) (bundle)).mApiClient;
        bundle.mApiClient = new ApiClientTracker(googleapiclient);
        if (apiclienttracker != null)
        {
            apiclienttracker.decRef();
        }
        bundle = mBroker.getForegroundGamesContext$1ae37e10(mContext, mClientContext, mExternalGameId);
        serviceValidated(bundle, mGamesService, mBroker);
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        Bundle bundle = new Bundle();
        if (connectionresult.hasResolution())
        {
            bundle.putParcelable("pendingIntent", connectionresult.mPendingIntent);
        }
        sendCallback(mContext, connectionresult.mStatusCode, mGamesService, null, bundle);
        mProxyThread.quit();
    }

    public final void onConnectionSuspended(int i)
    {
    }

    public (Context context, ClientContext clientcontext, com.google.android.gms.games.service.tConnector tconnector, DataBroker databroker, String s)
    {
        this$0 = ValidateServiceConnectionOperation.this;
        super();
        mContext = context;
        mClientContext = clientcontext;
        mGamesService = tconnector;
        mBroker = databroker;
        mExternalGameId = s;
        mProxyThread.start();
    }
}
