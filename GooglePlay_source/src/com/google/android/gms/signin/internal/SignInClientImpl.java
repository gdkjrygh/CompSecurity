// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IResolveAccountCallbacks;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            ISignInService, AuthAccountResult, ISignInCallbacks, CheckServerAuthResult

public final class SignInClientImpl extends GmsClient
    implements SignInClient
{
    private static final class OfflineAccessCallbacksWrapper extends IOfflineAccessCallbacks.Stub
    {

        private final ExecutorService mOfflineAccessCallbackExecutor;
        private final SignInOptions mSignInOptions;

        public final void checkServerAuthorization(final String idToken, final List scopes, ISignInService isigninservice)
            throws RemoteException
        {
            mOfflineAccessCallbackExecutor.submit(isigninservice. new Runnable() {

                final OfflineAccessCallbacksWrapper this$0;
                final String val$idToken;
                final List val$scopes;
                final ISignInService val$signInService;

                public final void run()
                {
                    try
                    {
                        OfflineAccessCallbacksWrapper.this.Object;
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
                this$0 = final_offlineaccesscallbackswrapper;
                scopes = list;
                idToken = s;
                signInService = ISignInService.this;
                super();
            }
            });
        }

        public final void uploadServerAuthCode(final String idToken, final String serverAuthCode, ISignInService isigninservice)
            throws RemoteException
        {
            mOfflineAccessCallbackExecutor.submit(isigninservice. new Runnable() {

                final OfflineAccessCallbacksWrapper this$0;
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
                this$0 = final_offlineaccesscallbackswrapper;
                idToken = s;
                serverAuthCode = s1;
                signInService = ISignInService.this;
                super();
            }
            });
        }


        public OfflineAccessCallbacksWrapper(SignInOptions signinoptions, ExecutorService executorservice)
        {
            mSignInOptions = signinoptions;
            mOfflineAccessCallbackExecutor = executorservice;
        }
    }


    private final ClientSettings mClientSettings;
    private final boolean mIsExposedSignInApi;
    private Integer mSessionId;
    private final Bundle mSignInOptionsBundle;

    public SignInClientImpl(Context context, Looper looper, ClientSettings clientsettings, SignInOptions signinoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, ExecutorService executorservice)
    {
        SignInClientImpl(context, looper, true, clientsettings, createBundleFromSignInOptions(signinoptions, clientsettings.mSessionId, executorservice), connectioncallbacks, onconnectionfailedlistener);
    }

    public SignInClientImpl(Context context, Looper looper, boolean flag, ClientSettings clientsettings, Bundle bundle, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        GmsClient(context, looper, 44, clientsettings, connectioncallbacks, onconnectionfailedlistener);
        mIsExposedSignInApi = flag;
        mClientSettings = clientsettings;
        mSignInOptionsBundle = bundle;
        mSessionId = clientsettings.mSessionId;
    }

    public static Bundle createBundleFromSignInOptions(SignInOptions signinoptions, Integer integer, ExecutorService executorservice)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", signinoptions.mOfflineAccessRequested);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", signinoptions.mIdTokenRequested);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", signinoptions.mServerClientId);
        if (signinoptions.mOfflineAccessCallbacks != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new OfflineAccessCallbacksWrapper(signinoptions, executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", signinoptions.mUsePromptModeForAuthCode);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", signinoptions.mForceCodeForRefreshToken);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", signinoptions.mWaitForAccessTokenRefresh);
        return bundle;
    }

    public final void authAccount(IAccountAccessor iaccountaccessor, Set set, ISignInCallbacks isignincallbacks)
    {
        Preconditions.checkNotNull(isignincallbacks, "Expecting a valid ISignInCallbacks");
        try
        {
            ((ISignInService)getService()).authAccount(new AuthAccountRequest(iaccountaccessor, set), isignincallbacks);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        }
        try
        {
            isignincallbacks.onAuthAccountComplete(new ConnectionResult(8, null), new AuthAccountResult(8));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.", iaccountaccessor);
        }
    }

    public final void clearAccountFromSessionStore()
    {
        try
        {
            ((ISignInService)getService()).clearAccountFromSessionStore(mSessionId.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void connect()
    {
        connect(((com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks) (new LegacyClientCallbackAdapter(this))));
    }

    protected final volatile IInterface createServiceInterface(IBinder ibinder)
    {
        return ISignInService.Stub.asInterface(ibinder);
    }

    protected final Bundle getGetServiceRequestExtraArgs()
    {
        String s = mClientSettings.mRealClientPackageName;
        if (!super.mContext.getPackageName().equals(s))
        {
            mSignInOptionsBundle.putString("com.google.android.gms.signin.internal.realClientPackageName", mClientSettings.mRealClientPackageName);
        }
        return mSignInOptionsBundle;
    }

    protected final String getServiceDescriptor()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected final String getStartServiceAction()
    {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean requiresSignIn()
    {
        return mIsExposedSignInApi;
    }

    public final void resolveAccount(IResolveAccountCallbacks iresolveaccountcallbacks)
    {
        Preconditions.checkNotNull(iresolveaccountcallbacks, "Expecting a valid IResolveAccountCallbacks");
        Object obj = mClientSettings;
        if (((ClientSettings) (obj)).mAccount == null) goto _L2; else goto _L1
_L1:
        obj = ((ClientSettings) (obj)).mAccount;
_L4:
        Object obj1 = null;
        try
        {
            if ("<<default account>>".equals(((Account) (obj)).name))
            {
                obj1 = Storage.getInstance(super.mContext);
                obj1 = ((Storage) (obj1)).getSavedGoogleSignInAccount(((Storage) (obj1)).getFromStore("defaultGoogleSignInAccount"));
            }
            obj = new ResolveAccountRequest(((Account) (obj)), mSessionId.intValue(), ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) (obj1)));
            ((ISignInService)getService()).resolveAccount(((ResolveAccountRequest) (obj)), iresolveaccountcallbacks);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
            try
            {
                iresolveaccountcallbacks.onAccountResolutionComplete(new ResolveAccountResponse());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (IResolveAccountCallbacks iresolveaccountcallbacks)
            {
                Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.", remoteexception);
            }
            return;
        }
_L2:
        obj = new Account("<<default account>>", "com.google");
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void saveDefaultAccount(IAccountAccessor iaccountaccessor, boolean flag)
    {
        try
        {
            ((ISignInService)getService()).saveDefaultAccountToSharedPref(iaccountaccessor, mSessionId.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }
}
