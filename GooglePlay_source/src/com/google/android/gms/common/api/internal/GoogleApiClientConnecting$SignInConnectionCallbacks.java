// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.SignInClient;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientConnecting

private final class <init>
    implements com.google.android.gms.common.api.allbacks, com.google.android.gms.common.api.allbacks
{

    final GoogleApiClientConnecting this$0;

    public final void onConnected(Bundle bundle)
    {
        mSignInClient.resolveAccount(new andler(GoogleApiClientConnecting.this));
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        mLock.lock();
        if (!shouldSkipSignInLocked(connectionresult)) goto _L2; else goto _L1
_L1:
        cancelSignInLocked();
        startGetRemoteServiceLocked();
_L4:
        mLock.unlock();
        return;
_L2:
        handleConnectionFailureLocked(connectionresult);
        if (true) goto _L4; else goto _L3
_L3:
        connectionresult;
        mLock.unlock();
        throw connectionresult;
    }

    public final void onConnectionSuspended(int i)
    {
    }

    private andler()
    {
        this$0 = GoogleApiClientConnecting.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
