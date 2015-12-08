// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientConnecting, GoogleApiClientState

final class val.resolveAccountResponse extends val.resolveAccountResponse
{

    final val.resolveAccountResponse this$0;
    final ResolveAccountResponse val$resolveAccountResponse;
    final GoogleApiClientConnecting val$state;

    public final void runLocked()
    {
        GoogleApiClientConnecting googleapiclientconnecting;
        ConnectionResult connectionresult;
label0:
        {
            googleapiclientconnecting = val$state;
            ResolveAccountResponse resolveaccountresponse = val$resolveAccountResponse;
            if (googleapiclientconnecting.checkStepLocked(0))
            {
                connectionresult = resolveaccountresponse.mConnectionResult;
                if (!connectionresult.isSuccess())
                {
                    break label0;
                }
                googleapiclientconnecting.mResolvedAccountAccessor = com.google.android.gms.common.internal.r._cls1.val.resolveAccountResponse(resolveaccountresponse.mAccountAccessorBinder);
                googleapiclientconnecting.mAccountResolved = true;
                googleapiclientconnecting.mSaveDefaultAccount = resolveaccountresponse.mSaveDefaultAccount;
                googleapiclientconnecting.mShowCrossClientAuthToast = resolveaccountresponse.mIsFromCrossClientAuth;
                googleapiclientconnecting.tryEndServiceBindingLocked();
            }
            return;
        }
        if (googleapiclientconnecting.shouldSkipSignInLocked(connectionresult))
        {
            googleapiclientconnecting.cancelSignInLocked();
            googleapiclientconnecting.tryEndServiceBindingLocked();
            return;
        } else
        {
            googleapiclientconnecting.handleConnectionFailureLocked(connectionresult);
            return;
        }
    }

    (ResolveAccountResponse resolveaccountresponse)
    {
        this$0 = final_;
        val$state = GoogleApiClientConnecting.this;
        val$resolveAccountResponse = resolveaccountresponse;
        super(final_googleapiclientstate);
    }
}
