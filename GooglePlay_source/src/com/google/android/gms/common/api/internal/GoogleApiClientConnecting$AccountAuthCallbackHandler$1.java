// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientConnecting, GoogleApiClientState

final class val.result extends val.result
{

    final  this$0;
    final ConnectionResult val$result;
    final GoogleApiClientConnecting val$state;

    public final void runLocked()
    {
        GoogleApiClientConnecting googleapiclientconnecting;
        ConnectionResult connectionresult;
label0:
        {
            googleapiclientconnecting = val$state;
            connectionresult = val$result;
            if (googleapiclientconnecting.checkStepLocked(2))
            {
                if (!connectionresult.isSuccess())
                {
                    break label0;
                }
                googleapiclientconnecting.startGetRemoteServiceLocked();
            }
            return;
        }
        if (googleapiclientconnecting.shouldSkipSignInLocked(connectionresult))
        {
            googleapiclientconnecting.cancelSignInLocked();
            googleapiclientconnecting.startGetRemoteServiceLocked();
            return;
        } else
        {
            googleapiclientconnecting.handleConnectionFailureLocked(connectionresult);
            return;
        }
    }

    (ConnectionResult connectionresult)
    {
        this$0 = final_;
        val$state = GoogleApiClientConnecting.this;
        val$result = connectionresult;
        super(final_googleapiclientstate);
    }
}
