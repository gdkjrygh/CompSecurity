// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientConnecting, GoogleApiClientStateHolder, GoogleApiClientState

private static final class mStateRef extends com.google.android.gms.common.internal.ler
{

    private final WeakReference mStateRef;

    public final void onAccountResolutionComplete(ResolveAccountResponse resolveaccountresponse)
    {
        final GoogleApiClientConnecting final_googleapiclientstate = (GoogleApiClientConnecting)mStateRef.get();
        if (final_googleapiclientstate == null)
        {
            return;
        } else
        {
            final_googleapiclientstate.mHolder.postToHandler(new GoogleApiClientStateHolder.HandlerTask(resolveaccountresponse) {

                final GoogleApiClientConnecting.AccountResolutionCallbackHandler this$0;
                final ResolveAccountResponse val$resolveAccountResponse;
                final GoogleApiClientConnecting val$state;

                public final void runLocked()
                {
                    GoogleApiClientConnecting googleapiclientconnecting;
                    ConnectionResult connectionresult;
label0:
                    {
                        googleapiclientconnecting = state;
                        ResolveAccountResponse resolveaccountresponse1 = resolveAccountResponse;
                        if (googleapiclientconnecting.checkStepLocked(0))
                        {
                            connectionresult = resolveaccountresponse1.mConnectionResult;
                            if (!connectionresult.isSuccess())
                            {
                                break label0;
                            }
                            googleapiclientconnecting.mResolvedAccountAccessor = com.google.android.gms.common.internal.IAccountAccessor.Stub.asInterface(resolveaccountresponse1.mAccountAccessorBinder);
                            googleapiclientconnecting.mAccountResolved = true;
                            googleapiclientconnecting.mSaveDefaultAccount = resolveaccountresponse1.mSaveDefaultAccount;
                            googleapiclientconnecting.mShowCrossClientAuthToast = resolveaccountresponse1.mIsFromCrossClientAuth;
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

            
            {
                this$0 = GoogleApiClientConnecting.AccountResolutionCallbackHandler.this;
                state = googleapiclientconnecting;
                resolveAccountResponse = resolveaccountresponse;
                super(final_googleapiclientstate);
            }
            });
            return;
        }
    }

    _cls1.val.resolveAccountResponse(GoogleApiClientConnecting googleapiclientconnecting)
    {
        mStateRef = new WeakReference(googleapiclientconnecting);
    }
}
