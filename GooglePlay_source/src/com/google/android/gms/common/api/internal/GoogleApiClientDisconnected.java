// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientState, GoogleApiClientStateHolder, GoogleApiClientImpl, GoogleApiClientConnecting

public final class GoogleApiClientDisconnected
    implements GoogleApiClientState
{

    private final GoogleApiClientStateHolder mHolder;

    public GoogleApiClientDisconnected(GoogleApiClientStateHolder googleapiclientstateholder)
    {
        mHolder = googleapiclientstateholder;
    }

    public final void begin()
    {
        for (Iterator iterator = mHolder.mClients.values().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.Client)iterator.next()).disconnect()) { }
        mHolder.mApiClient.mValidatedScopes = Collections.emptySet();
    }

    public final void connect()
    {
        GoogleApiClientStateHolder googleapiclientstateholder;
        googleapiclientstateholder = mHolder;
        googleapiclientstateholder.mLock.lock();
        googleapiclientstateholder.mState = new GoogleApiClientConnecting(googleapiclientstateholder, googleapiclientstateholder.mClientSettings, googleapiclientstateholder.mApiTypeMap, googleapiclientstateholder.mApiAvailability, googleapiclientstateholder.mSignInApiBuilder, googleapiclientstateholder.mLock, googleapiclientstateholder.mContext);
        googleapiclientstateholder.mState.begin();
        googleapiclientstateholder.mStateChanged.signalAll();
        googleapiclientstateholder.mLock.unlock();
        return;
        Exception exception;
        exception;
        googleapiclientstateholder.mLock.unlock();
        throw exception;
    }

    public final void disconnect()
    {
        mHolder.mApiClient.cancelAndClearWorkQueue();
    }

    public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        mHolder.mApiClient.mWorkQueue.add(apimethodimpl);
        return apimethodimpl;
    }

    public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void onConnected(Bundle bundle)
    {
    }

    public final void onConnectionFailed(ConnectionResult connectionresult, Api api, int i)
    {
    }

    public final void onConnectionSuspended(int i)
    {
    }
}
