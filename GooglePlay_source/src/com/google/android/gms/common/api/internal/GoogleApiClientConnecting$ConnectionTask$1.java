// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientConnecting, GoogleApiClientState

final class t> extends t>
{

    final val.failure this$1;
    final ConnectionResult val$failure;

    public final void runLocked()
    {
        handleConnectionFailureLocked(val$failure);
    }

    (ConnectionResult connectionresult)
    {
        this$1 = final_;
        val$failure = connectionresult;
        super(GoogleApiClientState.this);
    }
}
