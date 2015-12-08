// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            CompositeGoogleApiClient

final class this._cls0
    implements ernalCallbacks
{

    final CompositeGoogleApiClient this$0;

    public final void handleOnConnectionFailed(ConnectionResult connectionresult)
    {
        mLock.lock();
        mAuthResult = connectionresult;
        CompositeGoogleApiClient.access$300(CompositeGoogleApiClient.this);
        mLock.unlock();
        return;
        connectionresult;
        mLock.unlock();
        throw connectionresult;
    }

    public final void handleOnConnectionSuccess(Bundle bundle)
    {
        mLock.lock();
        mAuthResult = ConnectionResult.RESULT_SUCCESS;
        CompositeGoogleApiClient.access$300(CompositeGoogleApiClient.this);
        mLock.unlock();
        return;
        bundle;
        mLock.unlock();
        throw bundle;
    }

    public final void handleOnConnectionSuspended(int i)
    {
        mLock.lock();
        CompositeGoogleApiClient.access$500(CompositeGoogleApiClient.this, mUnauthenticatedClient, i);
        mLock.unlock();
        return;
        Exception exception;
        exception;
        mLock.unlock();
        throw exception;
    }

    ernalCallbacks()
    {
        this$0 = CompositeGoogleApiClient.this;
        super();
    }
}
