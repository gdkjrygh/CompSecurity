// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.BaseSignInCallbacks;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientConnecting, GoogleApiClientStateHolder, GoogleApiClientState

private static final class mStateRef extends BaseSignInCallbacks
{

    private final WeakReference mStateRef;

    public final void onAuthAccountComplete(ConnectionResult connectionresult, final AuthAccountResult final_googleapiclientstate)
    {
        final_googleapiclientstate = (GoogleApiClientConnecting)mStateRef.get();
        if (final_googleapiclientstate == null)
        {
            return;
        } else
        {
            ((GoogleApiClientConnecting) (final_googleapiclientstate)).mHolder.postToHandler(new GoogleApiClientStateHolder.HandlerTask(connectionresult) {

                final GoogleApiClientConnecting.AccountAuthCallbackHandler this$0;
                final ConnectionResult val$result;
                final GoogleApiClientConnecting val$state;

                public final void runLocked()
                {
                    GoogleApiClientConnecting googleapiclientconnecting;
                    ConnectionResult connectionresult1;
label0:
                    {
                        googleapiclientconnecting = state;
                        connectionresult1 = result;
                        if (googleapiclientconnecting.checkStepLocked(2))
                        {
                            if (!connectionresult1.isSuccess())
                            {
                                break label0;
                            }
                            googleapiclientconnecting.startGetRemoteServiceLocked();
                        }
                        return;
                    }
                    if (googleapiclientconnecting.shouldSkipSignInLocked(connectionresult1))
                    {
                        googleapiclientconnecting.cancelSignInLocked();
                        googleapiclientconnecting.startGetRemoteServiceLocked();
                        return;
                    } else
                    {
                        googleapiclientconnecting.handleConnectionFailureLocked(connectionresult1);
                        return;
                    }
                }

            
            {
                this$0 = GoogleApiClientConnecting.AccountAuthCallbackHandler.this;
                state = googleapiclientconnecting;
                result = connectionresult;
                super(final_googleapiclientstate);
            }
            });
            return;
        }
    }

    _cls1.val.result(GoogleApiClientConnecting googleapiclientconnecting)
    {
        mStateRef = new WeakReference(googleapiclientconnecting);
    }
}
