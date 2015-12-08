// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.chimera.AsyncOperation;
import com.google.android.gms.chimera.AsyncOperationService;
import com.google.android.gms.chimera.BaseAsyncOperationService;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.service.OperationException;
import com.google.android.gms.common.util.AccountUtils;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.games.broker.Agents;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IGamesSignInCallbacks;
import com.google.android.gms.games.server.error.GamesException;
import com.google.android.gms.games.signin.SignInAuthenticator;
import com.google.android.gms.games.utils.GamesDataUtils;
import java.io.IOException;

public final class PlayGamesSignInIntentService extends AsyncOperationService
{
    static abstract class BaseOperation
    {

        public final void execute(Context context, DataBroker databroker)
        {
            int i;
            try
            {
                i = executeInternal(context, databroker);
            }
            catch (GamesException gamesexception)
            {
                GamesLog.e("SignInIntentService", gamesexception.mLogMessage, gamesexception);
                if (gamesexception.mInternalStatusCode == 1003)
                {
                    databroker.clearRevisionCheck(context);
                }
                onGamesException(gamesexception);
                i = gamesexception.mClientStatusCode;
            }
            provideResult(i);
        }

        public abstract int executeInternal(Context context, DataBroker databroker);

        protected void onGamesException(GamesException gamesexception)
        {
        }

        public abstract void provideResult(int i);

        BaseOperation()
        {
        }
    }

    static final class CheckOAuthConsentOperation extends BaseOperation
    {

        private final IGamesSignInCallbacks mCallbacks;
        private final ClientContext mClientContext;
        private PendingIntent mResolution;
        private final Bundle mSignInOptionsBundle;

        public final int executeInternal(Context context, DataBroker databroker)
        {
            ConnectionResult connectionresult;
            char c;
            new SignInAuthenticator();
            connectionresult = SignInAuthenticator.authWithSignInService(context, mClientContext, mSignInOptionsBundle);
            c = '\u03E8';
            if (!connectionresult.isSuccess())
            {
                break MISSING_BLOCK_LABEL_89;
            }
            boolean flag = databroker.checkRevision(context, Agents.buildFirstPartyClientContext(mClientContext));
            if (!flag) goto _L2; else goto _L1
_L1:
            c = '\0';
_L4:
            return c;
_L2:
            return 1;
            databroker;
            if (!(databroker instanceof UserRecoverableAuthException)) goto _L4; else goto _L3
_L3:
            mResolution = PendingIntent.getActivity(context, 0, ((UserRecoverableAuthException)databroker).getIntent(), 0);
            return 1001;
            switch (connectionresult.mStatusCode)
            {
            case 5: // '\005'
            default:
                return 1000;

            case 4: // '\004'
            case 6: // '\006'
                mResolution = connectionresult.mPendingIntent;
                return 1001;

            case 7: // '\007'
                return 6;
            }
        }

        public final void provideResult(int i)
        {
            try
            {
                mCallbacks.onCheckOAuthComplete(i, mResolution);
                return;
            }
            catch (RemoteException remoteexception)
            {
                return;
            }
        }

        public CheckOAuthConsentOperation(ClientContext clientcontext, Bundle bundle, IGamesSignInCallbacks igamessignincallbacks)
        {
            mClientContext = clientcontext;
            mSignInOptionsBundle = bundle;
            mCallbacks = igamessignincallbacks;
        }
    }

    static final class ForceRefreshTokenOperation extends BaseOperation
    {

        private final Account mAccount;
        private final IGamesSignInCallbacks mCallbacks;

        public final int executeInternal(Context context, DataBroker databroker)
        {
            try
            {
                GoogleAuthUtil.invalidateToken(context, GoogleAuthUtil.getToken(context, mAccount, "cp"));
                GoogleAuthUtil.getToken(context, mAccount, "cp");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return 6;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return 1000;
            }
            return 0;
        }

        public final void provideResult(int i)
        {
            try
            {
                mCallbacks.onTokenRefreshed(i);
                return;
            }
            catch (RemoteException remoteexception)
            {
                return;
            }
        }

        ForceRefreshTokenOperation(Account account, IGamesSignInCallbacks igamessignincallbacks)
        {
            mAccount = account;
            mCallbacks = igamessignincallbacks;
        }
    }

    static final class LoadGameOperation extends BaseOperation
    {

        private final IGamesSignInCallbacks mCallbacks;
        private final ClientContext mClientContext;
        private DataHolder mDataHolder;
        private final String mExternalGameId;
        private final String mGamePackageName;

        public final int executeInternal(Context context, DataBroker databroker)
        {
            mDataHolder = DataHolder.empty(1);
            try
            {
                mDataHolder = databroker.getGame(GamesClientContext.buildContextForTargetGame(context, mClientContext, mExternalGameId), mGamePackageName);
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            return mDataHolder.mStatusCode;
        }

        protected final void onGamesException(GamesException gamesexception)
        {
            mDataHolder = DataHolder.empty(gamesexception.mClientStatusCode);
        }

        public final void provideResult(int i)
        {
            mCallbacks.onGameLoaded(mDataHolder);
            if (mDataHolder != null)
            {
                mDataHolder.close();
            }
_L2:
            return;
            Object obj;
            obj;
            if (mDataHolder == null) goto _L2; else goto _L1
_L1:
            mDataHolder.close();
            return;
            obj;
            if (mDataHolder != null)
            {
                mDataHolder.close();
            }
            throw obj;
        }

        LoadGameOperation(ClientContext clientcontext, IGamesSignInCallbacks igamessignincallbacks, String s, String s1)
        {
            mClientContext = clientcontext;
            mCallbacks = igamessignincallbacks;
            mExternalGameId = s;
            mGamePackageName = s1;
        }
    }

    static final class LoadGameplayAclOperation extends BaseOperation
    {

        private final IGamesSignInCallbacks mCallbacks;
        private final ClientContext mClientContext;
        private DataHolder mDataHolder;
        private final String mExternalGameId;

        public final int executeInternal(Context context, DataBroker databroker)
        {
            mDataHolder = DataHolder.empty(1);
            try
            {
                mDataHolder = databroker.getGameplayAcl(context, mClientContext, mExternalGameId);
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            return mDataHolder.mStatusCode;
        }

        protected final void onGamesException(GamesException gamesexception)
        {
            mDataHolder = DataHolder.empty(gamesexception.mClientStatusCode);
        }

        public final void provideResult(int i)
        {
            mCallbacks.onGameplayAclLoaded(mDataHolder);
            if (mDataHolder != null)
            {
                mDataHolder.close();
            }
_L2:
            return;
            Object obj;
            obj;
            if (mDataHolder == null) goto _L2; else goto _L1
_L1:
            mDataHolder.close();
            return;
            obj;
            if (mDataHolder != null)
            {
                mDataHolder.close();
            }
            throw obj;
        }

        LoadGameplayAclOperation(ClientContext clientcontext, IGamesSignInCallbacks igamessignincallbacks, String s)
        {
            mClientContext = clientcontext;
            mCallbacks = igamessignincallbacks;
            mExternalGameId = s;
        }
    }

    static final class LoadSelfOperation extends BaseOperation
    {

        private final IGamesSignInCallbacks mCallbacks;
        private final ClientContext mClientContext;
        private DataHolder mDataHolder;
        private final String mExternalGameId;
        private final boolean mForceRefresh = true;

        public final int executeInternal(Context context, DataBroker databroker)
        {
            if (!TextUtils.isEmpty(mExternalGameId)) goto _L2; else goto _L1
_L1:
            Object obj;
            obj = new com.google.android.gms.games.broker.GamesClientContext.Builder(context, mClientContext);
            obj.mForceReload = mForceRefresh;
            obj = ((com.google.android.gms.games.broker.GamesClientContext.Builder) (obj)).build();
_L3:
            mDataHolder = databroker.loadSelf(((GamesClientContext) (obj)));
_L4:
            return mDataHolder.mStatusCode;
_L2:
            obj = new com.google.android.gms.games.broker.GamesClientContext.Builder(context, mClientContext);
            obj.mForceReload = mForceRefresh;
            obj.mExternalOwningGameId = mExternalGameId;
            obj.mExternalTargetGameId = mExternalGameId;
            obj = ((com.google.android.gms.games.broker.GamesClientContext.Builder) (obj)).build();
              goto _L3
            context;
            if (context instanceof UserRecoverableAuthException)
            {
                mDataHolder = DataHolder.empty(1001);
            } else
            {
                mDataHolder = DataHolder.empty(1000);
            }
              goto _L4
            GamesException gamesexception;
            gamesexception;
            GamesLog.e("SignInIntentService", gamesexception.mLogMessage, gamesexception);
            int i = gamesexception.mInternalStatusCode;
            if (i == 1002)
            {
                mDataHolder = DataHolder.empty(i);
            } else
            if (i == 1500)
            {
                GamesDataUtils.markGameplayAclUnset(context, mClientContext, databroker);
                mDataHolder = DataHolder.empty(i);
            } else
            {
                if (i == 1003)
                {
                    databroker.clearRevisionCheck(context);
                }
                mDataHolder = DataHolder.empty(gamesexception.mClientStatusCode);
            }
              goto _L4
        }

        public final void provideResult(int i)
        {
            mCallbacks.onPlayersLoaded(mDataHolder);
            if (mDataHolder != null)
            {
                mDataHolder.close();
            }
_L2:
            return;
            Object obj;
            obj;
            if (mDataHolder == null) goto _L2; else goto _L1
_L1:
            mDataHolder.close();
            return;
            obj;
            if (mDataHolder != null)
            {
                mDataHolder.close();
            }
            throw obj;
        }

        public LoadSelfOperation(ClientContext clientcontext, String s, boolean flag, IGamesSignInCallbacks igamessignincallbacks)
        {
            mClientContext = clientcontext;
            mExternalGameId = s;
            mCallbacks = igamessignincallbacks;
        }
    }

    private static final class OperationAdapter
        implements AsyncOperation
    {

        private final BaseOperation mOperation;

        public final volatile void execute(BaseAsyncOperationService baseasyncoperationservice)
            throws OperationException, RemoteException
        {
            PlayGamesSignInIntentService playgamessigninintentservice;
            playgamessigninintentservice = (PlayGamesSignInIntentService)baseasyncoperationservice;
            baseasyncoperationservice = DataBroker.acquireBroker(playgamessigninintentservice);
            SystemClock.elapsedRealtime();
            mOperation.execute(playgamessigninintentservice, baseasyncoperationservice);
            SystemClock.elapsedRealtime();
            baseasyncoperationservice.release();
            return;
            Exception exception;
            exception;
            baseasyncoperationservice.release();
            throw exception;
        }

        public OperationAdapter(BaseOperation baseoperation)
        {
            mOperation = baseoperation;
        }
    }

    static final class RecordSignInOperation extends BaseOperation
    {

        private final IGamesSignInCallbacks mCallbacks;
        private final ClientContext mClientContext;
        private final String mExternalPlayerId;
        private final Integer mSignInSessionId;

        public final int executeInternal(Context context, DataBroker databroker)
        {
            return databroker.recordSignIn(context, mClientContext, mExternalPlayerId, mSignInSessionId);
        }

        public final void provideResult(int i)
        {
            try
            {
                mCallbacks.onSignInRecorded(i);
                return;
            }
            catch (RemoteException remoteexception)
            {
                return;
            }
        }

        RecordSignInOperation(ClientContext clientcontext, IGamesSignInCallbacks igamessignincallbacks, String s, Integer integer)
        {
            mClientContext = clientcontext;
            mCallbacks = igamessignincallbacks;
            mExternalPlayerId = s;
            mSignInSessionId = integer;
        }
    }

    static final class RefreshGameplayAclStatusOperation extends BaseOperation
    {

        private final ClientContext mClientContext;
        private final String mExternalGameId;

        public final int executeInternal(Context context, DataBroker databroker)
        {
            Object obj = null;
            context = databroker.getGameplayAcl(context, mClientContext, mExternalGameId);
            databroker = context;
            if (context != null)
            {
                context.close();
                databroker = context;
            }
_L1:
            if (databroker != null)
            {
                return ((DataHolder) (databroker)).mStatusCode;
            } else
            {
                return 1;
            }
            context;
            GamesLog.w("SignInIntentService", "Failed to update gameplay ACL status");
            databroker = obj;
              goto _L1
            context;
            throw context;
        }

        public final void provideResult(int i)
        {
        }

        RefreshGameplayAclStatusOperation(ClientContext clientcontext, String s)
        {
            mClientContext = clientcontext;
            mExternalGameId = s;
        }
    }

    static final class UpdateGameplayAclOperation extends BaseOperation
    {

        private final String mAclData;
        private final IGamesSignInCallbacks mCallbacks;
        private final ClientContext mClientContext;
        private final String mExternalGameId;

        public final int executeInternal(Context context, DataBroker databroker)
            throws GamesException
        {
            int i;
            try
            {
                i = databroker.updateGameplayAcl(context, mClientContext, mAclData, mExternalGameId);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return 1;
            }
            return i;
        }

        public final void provideResult(int i)
        {
            try
            {
                mCallbacks.onGameplayAclUpdated(i);
                return;
            }
            catch (RemoteException remoteexception)
            {
                return;
            }
        }

        UpdateGameplayAclOperation(ClientContext clientcontext, IGamesSignInCallbacks igamessignincallbacks, String s, String s1)
        {
            mClientContext = clientcontext;
            mCallbacks = igamessignincallbacks;
            mExternalGameId = s;
            mAclData = s1;
        }
    }

    static final class ValidateGamesAccountOperation extends BaseOperation
    {

        private final Account mAccount;
        private final IGamesSignInCallbacks mCallbacks;

        public final int executeInternal(Context context, DataBroker databroker)
        {
            return !AccountUtils.isUnicornAccount(context, mAccount.name) ? 0 : 1004;
        }

        public final void provideResult(int i)
        {
            try
            {
                mCallbacks.onAccountValidated(i);
                return;
            }
            catch (RemoteException remoteexception)
            {
                return;
            }
        }

        ValidateGamesAccountOperation(Account account, IGamesSignInCallbacks igamessignincallbacks)
        {
            mAccount = account;
            mCallbacks = igamessignincallbacks;
        }
    }


    private static final com.google.android.gms.chimera.BaseAsyncOperationService.AsyncOperationQueue sOperations = new com.google.android.gms.chimera.BaseAsyncOperationService.AsyncOperationQueue();

    public PlayGamesSignInIntentService()
    {
        super("SignInIntentService", sOperations);
    }

    public static void checkOAuthConsent(Context context, ClientContext clientcontext, Bundle bundle, IGamesSignInCallbacks igamessignincallbacks)
    {
        startService(context, new CheckOAuthConsentOperation(clientcontext, bundle, igamessignincallbacks));
    }

    public static void forceRefreshToken(Context context, IGamesSignInCallbacks igamessignincallbacks, Account account)
    {
        startService(context, new ForceRefreshTokenOperation(account, igamessignincallbacks));
    }

    public static void loadGame(Context context, ClientContext clientcontext, IGamesSignInCallbacks igamessignincallbacks, String s, String s1)
    {
        startService(context, new LoadGameOperation(clientcontext, igamessignincallbacks, s, s1));
    }

    public static void loadGameplayAcl(Context context, ClientContext clientcontext, IGamesSignInCallbacks igamessignincallbacks, String s)
    {
        startService(context, new LoadGameplayAclOperation(clientcontext, igamessignincallbacks, s));
    }

    public static void loadSelf$66d73af3(Context context, ClientContext clientcontext, String s, IGamesSignInCallbacks igamessignincallbacks)
    {
        startService(context, new LoadSelfOperation(clientcontext, s, true, igamessignincallbacks));
    }

    public static void recordSignIn(Context context, ClientContext clientcontext, IGamesSignInCallbacks igamessignincallbacks, String s, Integer integer)
    {
        startService(context, new RecordSignInOperation(clientcontext, igamessignincallbacks, s, integer));
    }

    public static void refreshGameplayAclStatus(Context context, ClientContext clientcontext, String s)
    {
        startService(context, new RefreshGameplayAclStatusOperation(clientcontext, s));
    }

    private static void startService(Context context, BaseOperation baseoperation)
    {
        AndroidUtils.assertMainGmsProcess();
        sOperations.offer(new OperationAdapter(baseoperation));
        context.startService(AndroidUtils.createGmsCoreIntent("com.google.android.gms.games.signin.service.INTENT"));
    }

    public static void updateGameplayAcl(Context context, ClientContext clientcontext, IGamesSignInCallbacks igamessignincallbacks, String s, String s1)
    {
        startService(context, new UpdateGameplayAclOperation(clientcontext, igamessignincallbacks, s, s1));
    }

    public static void validateAccount(Context context, IGamesSignInCallbacks igamessignincallbacks, Account account)
    {
        startService(context, new ValidateGamesAccountOperation(account, igamessignincallbacks));
    }

    protected final void handleRuntimeException(RuntimeException runtimeexception)
    {
        throw runtimeexception;
    }

}
