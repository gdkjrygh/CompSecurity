// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.signin;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IGamesSignInService;
import com.google.android.gms.games.service.AbstractSignInCallbacks;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import java.util.ArrayList;

public final class SignInClient
{
    public final class AccountValidatedBinderCallback extends AbstractSignInCallbacks
    {

        private final OnAccountValidatedCallback mCallback;
        final SignInClient this$0;

        public final void onAccountValidated(int i)
        {
            mHandler.sendMessage(mHandler.obtainMessage(0, new AccountValidatedCallback(mCallback, i)));
        }

        public AccountValidatedBinderCallback(OnAccountValidatedCallback onaccountvalidatedcallback)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = onaccountvalidatedcallback;
        }
    }

    final class AccountValidatedCallback
        implements CallbackProxy
    {

        private final OnAccountValidatedCallback mCallback;
        private final int mStatusCode;
        final SignInClient this$0;

        public final void deliverCallback()
        {
            mCallback.onAccountValidated(mStatusCode);
        }

        AccountValidatedCallback(OnAccountValidatedCallback onaccountvalidatedcallback, int i)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = onaccountvalidatedcallback;
            mStatusCode = i;
        }
    }

    final class CallbackHandler extends Handler
    {

        final SignInClient this$0;

        public final void handleMessage(Message message)
        {
            if (!isConnected())
            {
                return;
            } else
            {
                ((CallbackProxy)message.obj).deliverCallback();
                return;
            }
        }

        CallbackHandler()
        {
            this$0 = SignInClient.this;
            super();
        }
    }

    static interface CallbackProxy
    {

        public abstract void deliverCallback();
    }

    public final class CheckOAuthCompleteBinderCallback extends AbstractSignInCallbacks
    {

        private final OnCheckOAuthCompleteCallback mCallback;
        final SignInClient this$0;

        public final void onCheckOAuthComplete(int i, PendingIntent pendingintent)
        {
            mHandler.sendMessage(mHandler.obtainMessage(0, new CheckOAuthCompleteCallback(mCallback, i, pendingintent)));
        }

        public CheckOAuthCompleteBinderCallback(OnCheckOAuthCompleteCallback oncheckoauthcompletecallback)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = oncheckoauthcompletecallback;
        }
    }

    final class CheckOAuthCompleteCallback
        implements CallbackProxy
    {

        private final OnCheckOAuthCompleteCallback mCallback;
        private final PendingIntent mResolution;
        private final int mStatusCode;
        final SignInClient this$0;

        public final void deliverCallback()
        {
            mCallback.onCheckOAuthComplete(mStatusCode, mResolution);
        }

        CheckOAuthCompleteCallback(OnCheckOAuthCompleteCallback oncheckoauthcompletecallback, int i, PendingIntent pendingintent)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = oncheckoauthcompletecallback;
            mStatusCode = i;
            mResolution = pendingintent;
        }
    }

    public final class GameLoadedBinderCallback extends AbstractSignInCallbacks
    {

        private final ResultCallback mCallback;
        final SignInClient this$0;

        public final void onGameLoaded(DataHolder dataholder)
            throws RemoteException
        {
            mHandler.sendMessage(mHandler.obtainMessage(0, new GameLoadedCallback(mCallback, dataholder)));
        }

        public GameLoadedBinderCallback(ResultCallback resultcallback)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = resultcallback;
        }
    }

    final class GameLoadedCallback
        implements com.google.android.gms.games.GamesMetadata.LoadGamesResult, CallbackProxy
    {

        private final GameBuffer mBuffer;
        private final ResultCallback mCallback;
        private final Status mStatus;
        final SignInClient this$0;

        public final void deliverCallback()
        {
            mCallback.onResult(this);
        }

        public final GameBuffer getGames()
        {
            return mBuffer;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public final void release()
        {
            mBuffer.release();
        }

        GameLoadedCallback(ResultCallback resultcallback, DataHolder dataholder)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = resultcallback;
            mStatus = GamesStatusCodes.create(dataholder.mStatusCode);
            mBuffer = new GameBuffer(dataholder);
        }
    }

    public final class GameplayAclLoadedBinderCallback extends AbstractSignInCallbacks
    {

        private final com.google.android.gms.games.internal.game.Acls.OnGameplayAclLoadedCallback mCallback;
        final SignInClient this$0;

        public final void onGameplayAclLoaded(DataHolder dataholder)
            throws RemoteException
        {
            mHandler.sendMessage(mHandler.obtainMessage(0, new GameplayAclLoadedCallback(mCallback, dataholder)));
        }

        public GameplayAclLoadedBinderCallback(com.google.android.gms.games.internal.game.Acls.OnGameplayAclLoadedCallback ongameplayaclloadedcallback)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = ongameplayaclloadedcallback;
        }
    }

    final class GameplayAclLoadedCallback
        implements com.google.android.gms.games.internal.game.Acls.LoadAclResult, CallbackProxy
    {

        private final com.google.android.gms.games.internal.game.Acls.OnGameplayAclLoadedCallback mCallback;
        private final DataHolder mDataHolder;
        private final Status mStatus;
        final SignInClient this$0;

        public final void deliverCallback()
        {
            mCallback.onGameplayAclLoaded(this);
        }

        public final DataHolder getDataHolder()
        {
            return mDataHolder;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public final void release()
        {
            if (mDataHolder != null)
            {
                mDataHolder.close();
            }
        }

        GameplayAclLoadedCallback(com.google.android.gms.games.internal.game.Acls.OnGameplayAclLoadedCallback ongameplayaclloadedcallback, DataHolder dataholder)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = ongameplayaclloadedcallback;
            mStatus = GamesStatusCodes.create(dataholder.mStatusCode);
            mDataHolder = dataholder;
        }
    }

    public final class GameplayAclUpdatedBinderCallback extends AbstractSignInCallbacks
    {

        private final com.google.android.gms.games.internal.game.Acls.OnGameplayAclUpdatedCallback mCallback;
        final SignInClient this$0;

        public final void onGameplayAclUpdated(int i)
            throws RemoteException
        {
            mHandler.sendMessage(mHandler.obtainMessage(0, new GameplayAclUpdatedCallback(mCallback, i)));
        }

        public GameplayAclUpdatedBinderCallback(com.google.android.gms.games.internal.game.Acls.OnGameplayAclUpdatedCallback ongameplayaclupdatedcallback)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = ongameplayaclupdatedcallback;
        }
    }

    final class GameplayAclUpdatedCallback
        implements CallbackProxy
    {

        private final com.google.android.gms.games.internal.game.Acls.OnGameplayAclUpdatedCallback mCallback;
        private final Status mStatus;
        final SignInClient this$0;

        public final void deliverCallback()
        {
            mCallback.onGameplayAclUpdated(mStatus);
        }

        GameplayAclUpdatedCallback(com.google.android.gms.games.internal.game.Acls.OnGameplayAclUpdatedCallback ongameplayaclupdatedcallback, int i)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = ongameplayaclupdatedcallback;
            mStatus = GamesStatusCodes.create(i);
        }
    }

    public static interface OnAccountValidatedCallback
    {

        public abstract void onAccountValidated(int i);
    }

    public static interface OnCheckOAuthCompleteCallback
    {

        public abstract void onCheckOAuthComplete(int i, PendingIntent pendingintent);
    }

    public static interface OnConnectedListener
    {

        public abstract void onConnected();
    }

    public static interface OnConnectionFailedListener
    {

        public abstract void onConnectionFailed();
    }

    public static interface OnSignInRecordedCallback
    {

        public abstract void onSignInRecorded(int i);
    }

    public static interface OnTokenRefreshedCallback
    {

        public abstract void onTokenRefreshed(int i);
    }

    public final class PlayersLoadedBinderCallback extends AbstractSignInCallbacks
    {

        private final ResultCallback mCallback;
        final SignInClient this$0;

        public final void onPlayersLoaded(DataHolder dataholder)
        {
            mHandler.sendMessage(mHandler.obtainMessage(0, new PlayersLoadedCallback(mCallback, dataholder)));
        }

        public PlayersLoadedBinderCallback(ResultCallback resultcallback)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = resultcallback;
        }
    }

    final class PlayersLoadedCallback
        implements com.google.android.gms.games.Players.LoadPlayersResult, CallbackProxy
    {

        private final PlayerBuffer mBuffer;
        private final ResultCallback mCallback;
        private final Status mStatus;
        final SignInClient this$0;

        public final void deliverCallback()
        {
            mCallback.onResult(this);
        }

        public final PlayerBuffer getPlayers()
        {
            return mBuffer;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public final void release()
        {
            mBuffer.release();
        }

        PlayersLoadedCallback(ResultCallback resultcallback, DataHolder dataholder)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = resultcallback;
            mStatus = GamesStatusCodes.create(dataholder.mStatusCode);
            mBuffer = new PlayerBuffer(dataholder);
        }
    }

    public final class SignInRecordedBinderCallback extends AbstractSignInCallbacks
    {

        private final OnSignInRecordedCallback mCallback;
        final SignInClient this$0;

        public final void onSignInRecorded(int i)
        {
            mHandler.sendMessage(mHandler.obtainMessage(0, new SignInRecordedCallback(mCallback, i)));
        }

        public SignInRecordedBinderCallback(OnSignInRecordedCallback onsigninrecordedcallback)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = onsigninrecordedcallback;
        }
    }

    final class SignInRecordedCallback
        implements CallbackProxy
    {

        private final OnSignInRecordedCallback mCallback;
        private final int mStatusCode;
        final SignInClient this$0;

        public final void deliverCallback()
        {
            mCallback.onSignInRecorded(mStatusCode);
        }

        SignInRecordedCallback(OnSignInRecordedCallback onsigninrecordedcallback, int i)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = onsigninrecordedcallback;
            mStatusCode = i;
        }
    }

    final class SignInServiceConnection
        implements ServiceConnection
    {

        final Context mContext;
        final SignInClient this$0;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            if (!"com.google.android.gms.games.internal.IGamesSignInService".equals(ibinder.getInterfaceDescriptor()))
            {
                break MISSING_BLOCK_LABEL_89;
            }
            mService = com.google.android.gms.games.internal.IGamesSignInService.Stub.asInterface(ibinder);
            this;
            JVM INSTR monitorenter ;
            int j = mConnectionListeners.size();
            int i = 0;
_L2:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            ((OnConnectedListener)mConnectionListeners.get(i)).onConnected();
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
            componentname;
            this;
            JVM INSTR monitorexit ;
            try
            {
                throw componentname;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname)
            {
                GamesLog.e("SignInClient", "Unable to connect to sign-in service");
            }
            ConnectionTracker.getInstance().unbindService(mContext, this);
            mConnection = null;
            mConnectionFailedListener.onConnectionFailed();
            return;
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            this;
            JVM INSTR monitorenter ;
            int j = mConnectionListeners.size();
            int i = 0;
_L2:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            mConnectionListeners.get(i);
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
            componentname;
            this;
            JVM INSTR monitorexit ;
            throw componentname;
        }

        public SignInServiceConnection(Context context)
        {
            this$0 = SignInClient.this;
            super();
            mContext = context;
        }
    }

    public final class TokenRefreshedBinderCallback extends AbstractSignInCallbacks
    {

        private final OnTokenRefreshedCallback mCallback;
        final SignInClient this$0;

        public final void onTokenRefreshed(int i)
        {
            mHandler.sendMessage(mHandler.obtainMessage(0, new TokenRefreshedCallback(mCallback, i)));
        }

        public TokenRefreshedBinderCallback(OnTokenRefreshedCallback ontokenrefreshedcallback)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = ontokenrefreshedcallback;
        }
    }

    final class TokenRefreshedCallback
        implements CallbackProxy
    {

        private final OnTokenRefreshedCallback mCallback;
        private final int mStatusCode;
        final SignInClient this$0;

        public final void deliverCallback()
        {
            mCallback.onTokenRefreshed(mStatusCode);
        }

        TokenRefreshedCallback(OnTokenRefreshedCallback ontokenrefreshedcallback, int i)
        {
            this$0 = SignInClient.this;
            super();
            mCallback = ontokenrefreshedcallback;
            mStatusCode = i;
        }
    }


    public final String mCallingPackageName;
    public SignInServiceConnection mConnection;
    final OnConnectionFailedListener mConnectionFailedListener;
    final ArrayList mConnectionListeners = new ArrayList();
    public final Context mContext;
    CallbackHandler mHandler;
    public final String mScopes[];
    public IGamesSignInService mService;
    private final Bundle mSignInOptionsBundle;

    public SignInClient(Context context, String s, String as[], Bundle bundle, OnConnectedListener onconnectedlistener, OnConnectionFailedListener onconnectionfailedlistener)
    {
        mContext = (Context)Preconditions.checkNotNull(context);
        mCallingPackageName = (String)Preconditions.checkNotNull(s);
        mScopes = (String[])Preconditions.checkNotNull(as);
        mSignInOptionsBundle = bundle;
        mConnectionListeners.add(onconnectedlistener);
        mConnectionFailedListener = onconnectionfailedlistener;
        mHandler = new CallbackHandler();
    }

    public final void checkConnected()
    {
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public final void connect()
    {
        Intent intent = (new Intent("com.google.android.gms.games.signin.service.START")).setPackage("com.google.android.gms");
        if (mSignInOptionsBundle != null)
        {
            intent.putExtra("com.google.android.gms.games.EXTRA_SIGNIN_OPTIONS", mSignInOptionsBundle);
        }
        intent.putExtra("client_version", 0x7e6378);
        if (mConnection != null)
        {
            GamesLog.e("SignInClient", "Calling connect() while still connected, missing disconnect().");
            mService = null;
            ConnectionTracker.getInstance().unbindService(mContext, mConnection);
        }
        mConnection = new SignInServiceConnection(mContext);
        ConnectionTracker.getInstance().bindService(mContext, intent, mConnection, 129);
    }

    public final Intent getPlusUpgradeIntent(Account account, String s, String as[], PlusCommonExtras pluscommonextras)
    {
        checkConnected();
        try
        {
            account = mService.getPlusUpgradeIntent(account, s, as, pluscommonextras);
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            GamesLog.w("SignInClient", "service died");
            return null;
        }
        return account;
    }

    public final Account getResolvedGmsAccount(boolean flag)
    {
        checkConnected();
        Account account;
        try
        {
            account = mService.getResolvedGmsAccount(mCallingPackageName, flag);
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.w("SignInClient", "service died");
            return null;
        }
        return account;
    }

    public final boolean isConnected()
    {
        return mService != null;
    }
}
