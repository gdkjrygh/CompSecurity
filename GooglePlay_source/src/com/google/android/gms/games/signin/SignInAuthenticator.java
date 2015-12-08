// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.signin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AccountAccessor;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.ScopeUtil;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.BaseSignInCallbacks;
import com.google.android.gms.signin.internal.ISignInService;
import java.util.concurrent.ExecutionException;

public final class SignInAuthenticator
{
    private static final class SignInAuthAccountCallbacks extends BaseSignInCallbacks
    {

        private RequestFuture mConnectionResultFuture;

        public final void onAuthAccountComplete(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
        {
            mConnectionResultFuture.onResponse(connectionresult);
        }

        SignInAuthAccountCallbacks(RequestFuture requestfuture)
        {
            mConnectionResultFuture = requestfuture;
        }
    }


    public SignInAuthenticator()
    {
    }

    public static ConnectionResult authWithSignInService(Context context, ClientContext clientcontext, Bundle bundle)
    {
        Object obj = null;
        BlockingServiceConnection blockingserviceconnection = new BlockingServiceConnection();
        ISignInService isigninservice = getSignInService(blockingserviceconnection, context, clientcontext, bundle);
        bundle = obj;
        if (isigninservice != null)
        {
            bundle = ScopeUtil.fromScopeString(clientcontext.getGrantedScopes());
            clientcontext = new AuthAccountRequest(new AccountAccessor(context, clientcontext.mResolvedAccount), bundle);
            bundle = RequestFuture.newFuture();
            try
            {
                isigninservice.authAccount(clientcontext, new SignInAuthAccountCallbacks(bundle));
                bundle = (ConnectionResult)bundle.get();
            }
            // Misplaced declaration of an exception variable
            catch (ClientContext clientcontext)
            {
                GamesLog.e("SignInAuthenticator", "Error calling authAccount on SignIn service", clientcontext);
                bundle = obj;
            }
            // Misplaced declaration of an exception variable
            catch (ClientContext clientcontext)
            {
                GamesLog.e("SignInAuthenticator", "Calling authAccount on SignIn service was interrupted", clientcontext);
                bundle = obj;
            }
            // Misplaced declaration of an exception variable
            catch (ClientContext clientcontext)
            {
                GamesLog.e("SignInAuthenticator", "Calling authAccount on SignIn service got exception", clientcontext);
                bundle = obj;
            }
        }
        try
        {
            ConnectionTracker.getInstance().unbindService(context, blockingserviceconnection);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.w("SignInAuthenticator", (new StringBuilder("Failed to unbind from service: ")).append(blockingserviceconnection).toString(), context);
        }
        if (bundle != null)
        {
            return bundle;
        } else
        {
            return new ConnectionResult(8, null);
        }
    }

    private static ISignInService getSignInService(BlockingServiceConnection blockingserviceconnection, Context context, ClientContext clientcontext, Bundle bundle)
    {
        Intent intent = new Intent("com.google.android.gms.signin.service.INTERNAL_START");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.PACKAGE_NAME", clientcontext.mCallingPackageName);
        intent.putExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.SCOPES", clientcontext.getGrantedScopes());
        intent.putExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.CALLING_UID", clientcontext.mCallingUid);
        intent.putExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.SIGNIN_OPTIONS", bundle);
        ConnectionTracker.getInstance().bindService(context, intent, blockingserviceconnection, 1);
        try
        {
            blockingserviceconnection = com.google.android.gms.signin.internal.ISignInService.Stub.asInterface(blockingserviceconnection.getService());
        }
        // Misplaced declaration of an exception variable
        catch (BlockingServiceConnection blockingserviceconnection)
        {
            GamesLog.e("SignInAuthenticator", "Cannot get SignIn service instance", blockingserviceconnection);
            return null;
        }
        return blockingserviceconnection;
    }
}
