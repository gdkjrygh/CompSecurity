// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientConnecting, GoogleApiClientStateHolder, GoogleApiClientImpl

private static final class mApiType
    implements com.google.android.gms.common.api.acksImpl
{

    private final Api mApi;
    private final int mApiType;
    private final WeakReference mStateRef;

    public final void onReportAccountValidation(ConnectionResult connectionresult)
    {
        GoogleApiClientConnecting googleapiclientconnecting;
        boolean flag = true;
        googleapiclientconnecting = (GoogleApiClientConnecting)mStateRef.get();
        if (googleapiclientconnecting == null)
        {
            return;
        }
        if (Looper.myLooper() != googleapiclientconnecting.mHolder.mApiClient.mLooper)
        {
            flag = false;
        }
        Preconditions.checkState(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        googleapiclientconnecting.mLock.lock();
        flag = googleapiclientconnecting.checkStepLocked(1);
        if (!flag)
        {
            googleapiclientconnecting.mLock.unlock();
            return;
        }
        if (!connectionresult.isSuccess())
        {
            googleapiclientconnecting.recordFailedConnectionLocked(connectionresult, mApi, mApiType);
        }
        if (googleapiclientconnecting.onClientStepCallback())
        {
            googleapiclientconnecting.startAuthAccountLocked();
        }
        googleapiclientconnecting.mLock.unlock();
        return;
        connectionresult;
        googleapiclientconnecting.mLock.unlock();
        throw connectionresult;
    }

    public final void onReportServiceBinding(ConnectionResult connectionresult)
    {
        GoogleApiClientConnecting googleapiclientconnecting;
        boolean flag = false;
        googleapiclientconnecting = (GoogleApiClientConnecting)mStateRef.get();
        if (googleapiclientconnecting == null)
        {
            return;
        }
        if (Looper.myLooper() == googleapiclientconnecting.mHolder.mApiClient.mLooper)
        {
            flag = true;
        }
        Preconditions.checkState(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        googleapiclientconnecting.mLock.lock();
        boolean flag1 = googleapiclientconnecting.checkStepLocked(0);
        if (!flag1)
        {
            googleapiclientconnecting.mLock.unlock();
            return;
        }
        if (!connectionresult.isSuccess())
        {
            googleapiclientconnecting.recordFailedConnectionLocked(connectionresult, mApi, mApiType);
        }
        if (googleapiclientconnecting.onClientStepCallback())
        {
            googleapiclientconnecting.tryEndServiceBindingLocked();
        }
        googleapiclientconnecting.mLock.unlock();
        return;
        connectionresult;
        googleapiclientconnecting.mLock.unlock();
        throw connectionresult;
    }

    public (GoogleApiClientConnecting googleapiclientconnecting, Api api, int i)
    {
        mStateRef = new WeakReference(googleapiclientconnecting);
        mApi = api;
        mApiType = i;
    }
}
