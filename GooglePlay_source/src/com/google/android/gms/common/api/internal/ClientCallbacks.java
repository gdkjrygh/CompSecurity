// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientStateHolder, GoogleApiClientState

public final class ClientCallbacks
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

    public final Api mApi;
    private final int mApiType;
    GoogleApiClientStateHolder mGoogleApiClient;

    public ClientCallbacks(Api api, int i)
    {
        mApi = api;
        mApiType = i;
    }

    private void assertGoogleApiClientSet()
    {
        Preconditions.checkNotNull(mGoogleApiClient, "Callbacks must be attached to a GoogleApiClient instance before connecting the client.");
    }

    public final void onConnected(Bundle bundle)
    {
        GoogleApiClientStateHolder googleapiclientstateholder;
        assertGoogleApiClientSet();
        googleapiclientstateholder = mGoogleApiClient;
        googleapiclientstateholder.mLock.lock();
        googleapiclientstateholder.mState.onConnected(bundle);
        googleapiclientstateholder.mLock.unlock();
        return;
        bundle;
        googleapiclientstateholder.mLock.unlock();
        throw bundle;
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        GoogleApiClientStateHolder googleapiclientstateholder;
        Api api;
        int i;
        assertGoogleApiClientSet();
        googleapiclientstateholder = mGoogleApiClient;
        api = mApi;
        i = mApiType;
        googleapiclientstateholder.mLock.lock();
        googleapiclientstateholder.mState.onConnectionFailed(connectionresult, api, i);
        googleapiclientstateholder.mLock.unlock();
        return;
        connectionresult;
        googleapiclientstateholder.mLock.unlock();
        throw connectionresult;
    }

    public final void onConnectionSuspended(int i)
    {
        assertGoogleApiClientSet();
        mGoogleApiClient.onConnectionSuspended(i);
    }
}
