// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            SignInClientImpl, ISignInService, CheckServerAuthResult

private static final class mOfflineAccessCallbackExecutor extends mOfflineAccessCallbackExecutor
{

    private final ExecutorService mOfflineAccessCallbackExecutor;
    private final SignInOptions mSignInOptions;

    public final void checkServerAuthorization(final String idToken, final List scopes, final ISignInService signInService)
        throws RemoteException
    {
        mOfflineAccessCallbackExecutor.submit(new Runnable() {

            final SignInClientImpl.OfflineAccessCallbacksWrapper this$0;
            final String val$idToken;
            final List val$scopes;
            final ISignInService val$signInService;

            public final void run()
            {
                try
                {
                    SignInClientImpl.OfflineAccessCallbacksWrapper.this.Object;
                    Collections.unmodifiableSet(new HashSet(scopes));
                    CheckServerAuthResult checkserverauthresult = new CheckServerAuthResult(false, null);
                    signInService.onCheckServerAuthorization(checkserverauthresult);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
                }
            }

            
            {
                this$0 = SignInClientImpl.OfflineAccessCallbacksWrapper.this;
                scopes = list;
                idToken = s;
                signInService = isigninservice;
                super();
            }
        });
    }

    public final void uploadServerAuthCode(final String idToken, final String serverAuthCode, final ISignInService signInService)
        throws RemoteException
    {
        mOfflineAccessCallbackExecutor.submit(new Runnable() {

            final SignInClientImpl.OfflineAccessCallbacksWrapper this$0;
            final String val$idToken;
            final String val$serverAuthCode;
            final ISignInService val$signInService;

            public final void run()
            {
                try
                {
                    boolean flag = 
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = SignInClientImpl.OfflineAccessCallbacksWrapper.this;
                idToken = s;
                serverAuthCode = s1;
                signInService = isigninservice;
                super();
            }
        });
    }


    public _cls2.val.signInService(SignInOptions signinoptions, ExecutorService executorservice)
    {
        mSignInOptions = signinoptions;
        mOfflineAccessCallbackExecutor = executorservice;
    }
}
