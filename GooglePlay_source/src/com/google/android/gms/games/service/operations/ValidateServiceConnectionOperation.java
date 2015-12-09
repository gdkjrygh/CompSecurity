// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.android.common.SharedPreferencesCompat;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.ui.ErrorDialogIntentBuilder;
import com.google.android.gms.common.util.AccountUtils;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.GmsVersion;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.PlayerRef;
import com.google.android.gms.games.broker.AccountAgent;
import com.google.android.gms.games.broker.Agents;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.server.GamesServer;
import com.google.android.gms.games.server.error.GamesException;
import com.google.android.gms.games.service.ApiClientTracker;
import com.google.android.gms.games.service.GamesSessionRecorder;
import com.google.android.gms.games.service.PlayGamesAsyncService;
import com.google.android.gms.games.service.PlayGamesServiceBroker;
import com.google.android.gms.games.signin.SignInAuthenticator;
import com.google.android.gms.games.signin.SignInCache;
import com.google.android.gms.games.ui.signin.CheckAccountFragment;
import com.google.android.gms.games.ui.signin.PlusCheckFragment;
import com.google.android.gms.games.util.PackageUtils;
import com.google.android.gms.mdm.DeviceManager;
import com.google.android.gms.nearby.Nearby;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class ValidateServiceConnectionOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{
    private final class ApiClientConnector
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        GoogleApiClient mApiClient;
        private final DataBroker mBroker;
        private final ClientContext mClientContext;
        private final Context mContext;
        private final String mExternalGameId;
        private final com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService mGamesService;
        final HandlerThread mProxyThread = new HandlerThread("ApiClientConnector");
        final ValidateServiceConnectionOperation this$0;

        public final void onConnected(Bundle bundle)
        {
            bundle = mGamesService;
            GoogleApiClient googleapiclient = mApiClient;
            ApiClientTracker apiclienttracker = ((com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService) (bundle)).mApiClientTracker;
            bundle.mApiClientTracker = new ApiClientTracker(googleapiclient);
            if (apiclienttracker != null)
            {
                apiclienttracker.decRef();
            }
            bundle = mBroker.getForegroundGamesContext$1ae37e10(mContext, mClientContext, mExternalGameId);
            serviceValidated(bundle, mGamesService, mBroker);
        }

        public final void onConnectionFailed(ConnectionResult connectionresult)
        {
            Bundle bundle = new Bundle();
            if (connectionresult.hasResolution())
            {
                bundle.putParcelable("pendingIntent", connectionresult.mPendingIntent);
            }
            sendCallback(mContext, connectionresult.mStatusCode, mGamesService, null, bundle);
            mProxyThread.quit();
        }

        public final void onConnectionSuspended(int i)
        {
        }

        public ApiClientConnector(Context context, ClientContext clientcontext, com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService gamesservice, DataBroker databroker, String s)
        {
            this$0 = ValidateServiceConnectionOperation.this;
            super();
            mContext = context;
            mClientContext = clientcontext;
            mGamesService = gamesservice;
            mBroker = databroker;
            mExternalGameId = s;
            mProxyThread.start();
        }
    }


    private final IGmsCallbacks mCallbacks;
    private final String mCallingPackageName;
    private final int mCallingUid;
    private final int mClientVersion;
    private final int mConnectingPopupGravity;
    private final Account mDesiredAccount;
    private final String mForceResolveAccountKey;
    private final String mGamePackageName;
    private final boolean mIsHeadless;
    private Account mLogAccount;
    private String mLogExternalGameId;
    private String mLogPackageName;
    private final ArrayList mProxyApis;
    private final boolean mRetryingSignIn;
    private final String mScopes[];
    private final int mSdkVariant;
    private final boolean mShowConnectingPopup;
    private final Bundle mSignInOptionsBundle;

    public ValidateServiceConnectionOperation(IGmsCallbacks igmscallbacks, int i, String s, int j, Account account, String s1, String as[], 
            boolean flag, boolean flag1, int k, boolean flag2, int l, String s2, ArrayList arraylist, 
            Bundle bundle)
    {
        mCallbacks = igmscallbacks;
        mCallingUid = i;
        mCallingPackageName = s;
        mClientVersion = j;
        mDesiredAccount = account;
        mGamePackageName = s1;
        mScopes = as;
        mIsHeadless = flag;
        mShowConnectingPopup = flag1;
        mConnectingPopupGravity = k;
        mRetryingSignIn = flag2;
        mSdkVariant = l;
        mForceResolveAccountKey = s2;
        mProxyApis = arraylist;
        mSignInOptionsBundle = bundle;
        if (!ArrayUtils.contains(mScopes, "https://www.googleapis.com/auth/games"))
        {
            Preconditions.checkState(ArrayUtils.contains(mScopes, "https://www.googleapis.com/auth/games.firstparty"), "Must contain at least one of the Games scopes!");
        }
    }

    private static boolean checkApiClientReady(com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService gamesservice, Map map)
    {
        gamesservice = gamesservice.mApiClientTracker;
        if (gamesservice != null)
        {
            if ((gamesservice = gamesservice.getApiClient()).isConnected())
            {
                for (map = map.keySet().iterator(); map.hasNext();)
                {
                    if (!gamesservice.hasApi((Api)map.next()))
                    {
                        return false;
                    }
                }

                return true;
            }
        }
        return false;
    }

    private boolean completeBestEffortSignIn(DataBroker databroker, Context context, ClientContext clientcontext, String s)
    {
        com.google.android.gms.games.broker.GamesClientContext.Builder builder;
        String s1;
        Object obj;
        builder = new com.google.android.gms.games.broker.GamesClientContext.Builder(context, clientcontext);
        builder.mForceReload = true;
        builder.mExternalOwningGameId = s;
        builder.mExternalTargetGameId = s;
        s = builder.build();
        obj = null;
        builder = null;
        s1 = null;
        s = new PlayerBuffer(databroker.loadSelf(s));
        int i = s.getCount();
        if (i != 0) goto _L2; else goto _L1
_L1:
        s.release();
_L4:
        return false;
_L2:
        s1 = s.get(0).getPlayerId();
        s.release();
        builder = null;
        s = builder;
        if (mSignInOptionsBundle != null)
        {
            s = builder;
            if (mSignInOptionsBundle.containsKey("com.google.android.gms.common.internal.ClientSettings.sessionId"))
            {
                s = Integer.valueOf(mSignInOptionsBundle.getInt("com.google.android.gms.common.internal.ClientSettings.sessionId"));
            }
        }
        return databroker.recordSignIn(context, clientcontext, s1, s) == 0;
        databroker;
        databroker = s1;
_L9:
        if (databroker == null) goto _L4; else goto _L3
_L3:
        databroker.release();
        return false;
        databroker;
        databroker = obj;
_L8:
        if (databroker == null) goto _L4; else goto _L5
_L5:
        databroker.release();
        return false;
        context;
        databroker = builder;
_L7:
        if (databroker != null)
        {
            databroker.release();
        }
        throw context;
        context;
        databroker = s;
        if (true) goto _L7; else goto _L6
_L6:
        databroker;
        databroker = s;
          goto _L8
          goto _L4
        databroker;
        databroker = s;
          goto _L9
    }

    private static Game fetchLocalGame(GamesClientContext gamesclientcontext)
    {
        Object obj;
        obj = com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId);
        obj = new GameBuffer((new com.google.android.gms.games.broker.Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(((android.net.Uri) (obj))).query());
        gamesclientcontext = null;
        if (((GameBuffer) (obj)).getCount() > 0)
        {
            gamesclientcontext = (Game)((GameBuffer) (obj)).get(0).freeze();
        }
        ((GameBuffer) (obj)).release();
        return gamesclientcontext;
        gamesclientcontext;
        ((GameBuffer) (obj)).release();
        throw gamesclientcontext;
    }

    private Account getSignInAccount(Account account)
    {
        if (!TextUtils.isEmpty(mForceResolveAccountKey))
        {
            return account;
        } else
        {
            return mDesiredAccount;
        }
    }

    private Intent getSignInIntent(Context context, String s, Account account)
    {
        Intent intent = new Intent("com.google.android.gms.games.SIGN_IN");
        intent.setPackage("com.google.android.play.games");
        intent.putExtra("com.google.android.gms.games.GAME_ID", s);
        intent.putExtra("com.google.android.gms.games.SCOPES", mScopes);
        intent.putExtra("com.google.android.gms.games.SHOW_CONNECTING_POPUP", mShowConnectingPopup);
        intent.putExtra("com.google.android.gms.games.CONNECTING_POPUP_GRAVITY", mConnectingPopupGravity);
        intent.putExtra("com.google.android.gms.games.RETRYING_SIGN_IN", mRetryingSignIn);
        if (account != null && !AccountUtils.isDefaultAccount(account, "com.google"))
        {
            SignInCache.setDesiredAccount(context, mGamePackageName, account);
            intent.putExtra("com.google.android.gms.games.USE_DESIRED_ACCOUNT_NAME", true);
        } else
        {
            SignInCache.setDesiredAccount(context, mGamePackageName, null);
            intent.putExtra("com.google.android.gms.games.USE_DESIRED_ACCOUNT_NAME", false);
        }
        intent.addFlags(0x4000000);
        intent.putExtra("client_version", mClientVersion);
        if (mSignInOptionsBundle != null)
        {
            intent.putExtra("com.google.android.gms.games.EXTRA_SIGNIN_OPTIONS", mSignInOptionsBundle);
        }
        return intent;
    }

    private void logEvent(Context context, int i)
    {
        String s;
        if (mLogAccount == null)
        {
            s = null;
        } else
        {
            s = mLogAccount.name;
        }
        GamesPlayLogger.logSignInEvent(context, mLogPackageName, mLogExternalGameId, s, mClientVersion, i);
    }

    private void sendCallback(Context context, int i, com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService gamesservice, Intent intent)
    {
        sendCallback(context, i, gamesservice, intent, new Bundle());
    }

    private ClientContext validateServiceSignedIn(Context context, DataBroker databroker, String s, int i)
    {
        boolean flag2 = AccountUtils.isDefaultAccount(mDesiredAccount, "com.google");
        if (TextUtils.isEmpty(mForceResolveAccountKey)) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj = AccountAgent.getAccount(context, mForceResolveAccountKey);
        obj1 = obj;
        if (obj != null) goto _L4; else goto _L3
_L3:
        sendCallback(context, 5, null, null);
        obj = null;
_L10:
        return ((ClientContext) (obj));
_L2:
        obj = AccountUtils.resolveAccount(context, mDesiredAccount, mGamePackageName);
        obj1 = obj;
        if (obj == null)
        {
            obj1 = obj;
            if (!flag2)
            {
                sendCallback(context, 5, null, null);
                return null;
            }
        }
_L4:
        Account account;
        boolean flag;
        obj = null;
        boolean flag1;
        if (flag2 || "com.google.android.play.games".equals(mCallingPackageName))
        {
            obj = SignInCache.getAccount(context, mGamePackageName);
        } else
        if (SignInCache.getAccounts(context, mGamePackageName).contains(mDesiredAccount))
        {
            obj = mDesiredAccount;
        }
        flag1 = false;
        if (obj == null)
        {
            obj = null;
            if ("com.google.android.play.games".equals(mGamePackageName))
            {
                obj = CheckAccountFragment.getSingleAccount$799b55c(context);
            }
            if (obj != null && (((Boolean)G.destAppSkipPlusVerification.get()).booleanValue() || PlusCheckFragment.checkPlusLocal(context, ((Account) (obj)), null)))
            {
                AccountUtils.setSelectedAccount(context, mGamePackageName, ((Account) (obj)));
            } else
            {
                obj = null;
            }
            if (obj == null)
            {
                sendCallback(context, 4, null, getSignInIntent(context, s, getSignInAccount(((Account) (obj1)))));
                return null;
            }
            flag = true;
            account = ((Account) (obj));
        } else
        {
            account = ((Account) (obj));
            flag = flag1;
            if (obj1 != null)
            {
                account = ((Account) (obj));
                flag = flag1;
                if (!((Account) (obj1)).equals(obj))
                {
                    SignInCache.clearAccount(context, mGamePackageName);
                    GamesLog.d("ValidateServiceOp", "Stored account different from desired account");
                    sendCallback(context, 4, null, getSignInIntent(context, s, getSignInAccount(((Account) (obj1)))));
                    return null;
                }
            }
        }
        obj = AccountUtils.getValidSelectedAccountObj(context, mGamePackageName);
        if (flag2 && (obj == null || !account.equals(obj)))
        {
            SignInCache.clearAccount(context, mGamePackageName);
            GamesLog.d("ValidateServiceOp", "Selected account does not match sign-in cache");
            sendCallback(context, 4, null, getSignInIntent(context, s, mDesiredAccount));
            return null;
        }
        obj1 = ClientContext.loadFromSharedPrefs(context, i, account, mGamePackageName);
        obj = obj1;
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        int j = 0;
_L9:
        if (j >= mScopes.length)
        {
            break MISSING_BLOCK_LABEL_1109;
        }
        if (((ClientContext) (obj1)).hasScope(mScopes[j])) goto _L8; else goto _L7
_L7:
        obj = null;
_L11:
        if (flag2 && obj != null && !((ClientContext) (obj)).isResolvedDefaultAccount())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            GamesLog.d("ValidateServiceOp", "Client context backwards compatibility taking place.");
            obj1 = ((ClientContext) (obj)).getGrantedScopes();
            obj = new ClientContext(((ClientContext) (obj)).mCallingUid, mDesiredAccount, ((ClientContext) (obj)).mResolvedAccount, ((ClientContext) (obj)).mCallingPackageName, ((ClientContext) (obj)).mAuthPackageName);
            ((ClientContext) (obj)).setGrantedScopes(((String []) (obj1)));
            obj1 = context.getSharedPreferences(ClientContext.getSharedPrefsFileName(((ClientContext) (obj)).mResolvedAccount, ((ClientContext) (obj)).mAuthPackageName), 0).edit();
            ((android.content.SharedPreferences.Editor) (obj1)).putInt("calling_uid", ((ClientContext) (obj)).mCallingUid);
            ((android.content.SharedPreferences.Editor) (obj1)).putString("resolved_account_name", ((ClientContext) (obj)).mResolvedAccount.name);
            ((android.content.SharedPreferences.Editor) (obj1)).putString("resolved_account_type", ((ClientContext) (obj)).mResolvedAccount.type);
            ((android.content.SharedPreferences.Editor) (obj1)).putString("requested_account_name", ((ClientContext) (obj)).mRequestedAccount.name);
            ((android.content.SharedPreferences.Editor) (obj1)).putString("requested_account_type", ((ClientContext) (obj)).mRequestedAccount.type);
            ((android.content.SharedPreferences.Editor) (obj1)).putString("calling_package_name", ((ClientContext) (obj)).mCallingPackageName);
            ((android.content.SharedPreferences.Editor) (obj1)).putString("auth_package_name", ((ClientContext) (obj)).mAuthPackageName);
            StringBuilder stringbuilder = new StringBuilder();
            int k = ((ClientContext) (obj)).mGrantedScopes.size();
            for (j = 0; j < k; j++)
            {
                if (j > 0)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append((String)((ClientContext) (obj)).mGrantedScopes.get(j));
            }

            ((android.content.SharedPreferences.Editor) (obj1)).putString("granted_scopes", stringbuilder.toString());
            ((android.content.SharedPreferences.Editor) (obj1)).putString("requested_visible_actions", TextUtils.join(",", ((ClientContext) (obj)).mVisibleActions));
            if (((ClientContext) (obj)).mExtras.size() > 0)
            {
                stringbuilder.delete(0, stringbuilder.length());
                String s1;
                for (Iterator iterator = ((ClientContext) (obj)).mExtras.keySet().iterator(); iterator.hasNext(); stringbuilder.append(((ClientContext) (obj)).mExtras.getString(s1)))
                {
                    s1 = (String)iterator.next();
                    if (stringbuilder.length() > 0)
                    {
                        stringbuilder.append(',');
                    }
                    stringbuilder.append(s1);
                    stringbuilder.append(',');
                }

                ((android.content.SharedPreferences.Editor) (obj1)).putString("extras", stringbuilder.toString());
            }
            SharedPreferencesCompat.apply(((android.content.SharedPreferences.Editor) (obj1)));
        }
          goto _L6
_L8:
        j++;
          goto _L9
_L6:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new ClientContext(i, mDesiredAccount, account, mGamePackageName);
            ((ClientContext) (obj1)).setGrantedScopes(mScopes);
        }
        new SignInAuthenticator();
        obj = SignInAuthenticator.authWithSignInService(context, ((ClientContext) (obj1)), mSignInOptionsBundle);
        if (!((ConnectionResult) (obj)).isSuccess())
        {
            if (((ConnectionResult) (obj)).hasResolution())
            {
                sendCallback(context, 4, null, getSignInIntent(context, s, null));
                return null;
            } else
            {
                sendCallback(context, ((ConnectionResult) (obj)).mStatusCode, null, null);
                return null;
            }
        }
        obj = obj1;
        if (flag)
        {
            obj = obj1;
            if (!completeBestEffortSignIn(databroker, context, ((ClientContext) (obj1)), s))
            {
                GamesLog.w("ValidateServiceOp", "Best effort sign-in failed, need the full sign-in flow");
                sendCallback(context, 4, null, getSignInIntent(context, s, mDesiredAccount));
                return null;
            }
        }
          goto _L10
        obj = obj1;
          goto _L11
    }

    public final void execute(Context context, DataBroker databroker)
    {
        String s1;
        s1 = AndroidUtils.getMetadataTagForPackage(context, mGamePackageName, "com.google.android.gms.games.APP_ID");
        if (s1 == null)
        {
            s1 = "";
        } else
        {
            try
            {
                Long.parseLong(s1);
            }
            // Misplaced declaration of an exception variable
            catch (DataBroker databroker)
            {
                GamesLog.e("ValidateServiceOp", (new StringBuilder("Application ID (")).append(s1).append(") must be a numeric value. Please verify that your manifest refers to the correct project ID.").toString());
                sendCallback(context, 10, null, null);
                return;
            }
        }
_L6:
        mLogExternalGameId = s1;
        mLogPackageName = mGamePackageName;
        if (TextUtils.isEmpty(s1) || "593950602418".equals(s1))
        {
            mLogPackageName = mCallingPackageName;
        }
        mLogAccount = mDesiredAccount;
        if (AccountUtils.isDefaultAccount(mDesiredAccount, "com.google"))
        {
            mLogAccount = null;
        } else
        if (!TextUtils.isEmpty(mForceResolveAccountKey))
        {
            mLogAccount = null;
        }
        logEvent(context, 1);
        if (!PackageUtils.isPackageRestricted(context, "com.google.android.play.games")) goto _L2; else goto _L1
_L1:
        databroker = new ErrorDialogIntentBuilder(context, context.getString(0x7f100036), context.getString(0x7f100041));
        ((ErrorDialogIntentBuilder) (databroker)).mIntent.putExtra("com.google.android.gms.common.ui.EXTRA_DIALOG_RESULT_CODE", 0);
        sendCallback(context, 6, null, ((ErrorDialogIntentBuilder) (databroker)).mIntent);
_L4:
        return;
_L2:
        Object obj;
        int i = mCallingUid;
        boolean flag = GooglePlayServicesUtil.isPackageGoogleSigned(context.getPackageManager(), mCallingPackageName);
        if (ArrayUtils.contains(mScopes, "https://www.googleapis.com/auth/games.firstparty") && !flag)
        {
            GamesLog.e("ValidateServiceOp", "External caller attempting to use the 1P scope");
            sendCallback(context, 8, null, null);
            return;
        }
        if (!mCallingPackageName.equals(mGamePackageName))
        {
            if (!flag)
            {
                GamesLog.e("ValidateServiceOp", (new StringBuilder("Caller attempting to connect as another package (calling package: ")).append(mCallingPackageName).append(", attempting to connect as: ").append(mGamePackageName).append(")").toString());
                sendCallback(context, 8, null, null);
                return;
            }
            try
            {
                i = context.getPackageManager().getPackageInfo(mGamePackageName, 0).applicationInfo.uid;
            }
            // Misplaced declaration of an exception variable
            catch (DataBroker databroker)
            {
                GamesLog.e("ValidateServiceOp", (new StringBuilder("Bad package name: ")).append(mGamePackageName).toString(), databroker);
                sendCallback(context, 8, null, null);
                return;
            }
        }
        if (TextUtils.isEmpty(s1) && !flag)
        {
            GamesLog.e("ValidateServiceOp", (new StringBuilder("Using Google Play games services requires a metadata tag with the name \"com.google.android.gms.games.APP_ID\" in the application tag of the manifest for ")).append(mGamePackageName).toString());
            sendCallback(context, 10, null, null);
            return;
        }
        if (mIsHeadless)
        {
            if (!GooglePlayServicesUtil.uidHasPackageName(context, mCallingUid, "com.google.android.play.games"))
            {
                throw new SecurityException("Headless Client must be started from Play Games");
            }
            boolean flag1;
            if (mDesiredAccount == null || !AccountUtils.ensureAccountExists(context, mDesiredAccount))
            {
                GamesLog.e("ValidateServiceOp", (new StringBuilder("Headless Client requires a valid account (account: ")).append(mDesiredAccount).append(")").toString());
                sendCallback(context, 5, null, null);
                obj = null;
            } else
            {
                obj = new ClientContext(i, mDesiredAccount, mDesiredAccount, mGamePackageName);
                ((ClientContext) (obj)).setGrantedScopes(mScopes);
            }
        } else
        {
            obj = validateServiceSignedIn(context, databroker, s1, i);
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        Object obj1;
        Object obj3;
label0:
        {
            mLogAccount = ((ClientContext) (obj)).mResolvedAccount;
            GamesServer.setSdkVariant(((ClientContext) (obj)), mSdkVariant);
            obj3 = databroker.getForegroundGamesContext$1ae37e10(context, ((ClientContext) (obj)), s1);
            try
            {
                flag1 = databroker.checkRevision(context, Agents.buildFirstPartyClientContext(((ClientContext) (obj))));
            }
            // Misplaced declaration of an exception variable
            catch (DataBroker databroker)
            {
                ((ClientContext) (obj)).clearFromSharedPrefs(context);
                if (databroker instanceof UserRecoverableAuthException)
                {
                    if (mIsHeadless)
                    {
                        databroker = ((UserRecoverableAuthException)databroker).getIntent();
                    } else
                    {
                        databroker = getSignInIntent(context, s1, null);
                    }
                    sendCallback(context, 4, null, databroker);
                    return;
                } else
                {
                    sendCallback(context, 8, null, null);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (DataBroker databroker)
            {
                GamesLog.wtf(context, "ValidateServiceOp", (new StringBuilder("Error from revision check: ")).append(((GamesException) (databroker)).mClientStatusCode).append(((GamesException) (databroker)).mLogMessage).toString());
                sendCallback(context, 8, null, null);
                return;
            }
            if (!flag1)
            {
                GamesLog.e("ValidateServiceOp", "The installed version of Google Play services is out-of-date; it must be updated to communicate with the Play Games service.");
                sendCallback(context, 2, null, null);
                return;
            }
            Object obj2 = PlayGamesServiceBroker.getServiceInstance(((ClientContext) (obj)));
            if (obj2 != null && s1.equals(((com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService) (obj2)).mExternalGameId))
            {
                obj1 = obj2;
                if (mIsHeadless == ((com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService) (obj2)).mIsHeadless)
                {
                    break label0;
                }
            }
            boolean flag2 = mIsHeadless;
            obj2 = ((GamesClientContext) (obj3)).mContext;
            ClientContext clientcontext = ((GamesClientContext) (obj3)).mClientContext;
            String s2 = ((GamesClientContext) (obj3)).mExternalTargetGameId;
            obj1 = new com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService(((Context) (obj2)).getApplicationContext(), clientcontext, mClientVersion, s2, flag2);
            if (!TextUtils.isEmpty(s2) && !databroker.registerGame(((Context) (obj2)), clientcontext, mGamePackageName, true))
            {
                obj1 = null;
            } else
            {
                PlayGamesServiceBroker.cacheServiceInstance(clientcontext, ((com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService) (obj1)));
            }
        }
        if (obj1 == null)
        {
            sendCallback(context, 10, null, null);
            return;
        }
        ((com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService) (obj1)).setSessionPending(true);
        ArrayMap arraymap = new ArrayMap();
        String s = Drive.SCOPE_APPFOLDER.mScopeUri;
        if (ArrayUtils.contains(mScopes, s))
        {
            arraymap.put(Drive.INTERNAL_API, (new com.google.android.gms.drive.Drive.DriveOptions.Builder()).setProxyType$24057e15().build());
            arraymap.put(DeviceManager.API, null);
        }
        if (mProxyApis != null && mProxyApis.contains("copresence"))
        {
            arraymap.put(Nearby.MESSAGES_API, null);
        }
        arraymap.putAll(((com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService) (obj1)).mTrackedApis);
        if (arraymap.size() > 0 && !checkApiClientReady(((com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService) (obj1)), arraymap))
        {
            ((com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService) (obj1)).mTrackedApis.putAll(arraymap);
            obj3 = mScopes;
            String as[];
            if (!arraymap.containsKey(Drive.INTERNAL_API))
            {
                as = mScopes;
            } else
            {
                String s3 = Drive.SCOPE_APPFOLDER.mScopeUri;
                as = ((String []) (obj3));
                if (!ArrayUtils.contains(mScopes, s3))
                {
                    as = (String[])ArrayUtils.appendToArray(((Object []) (obj3)), s3);
                }
            }
            databroker = new ApiClientConnector(context, ((ClientContext) (obj)), ((com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService) (obj1)), databroker, s1);
            context = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context, databroker, databroker)).setAccountName(((ClientContext) (obj)).getResolvedAccountName()).addScopeNames(as);
            obj = new Handler(((ApiClientConnector) (databroker)).mProxyThread.getLooper());
            Preconditions.checkNotNull(obj, "Handler must not be null");
            context.mLooper = ((Handler) (obj)).getLooper();
            context.mRealClientPackageName = mGamePackageName;
            for (Iterator iterator = arraymap.entrySet().iterator(); iterator.hasNext();)
            {
                obj1 = (java.util.Map.Entry)iterator.next();
                if (((java.util.Map.Entry) (obj1)).getValue() == null)
                {
                    context.addApi((Api)((java.util.Map.Entry) (obj1)).getKey());
                } else
                {
                    context.addApi((Api)((java.util.Map.Entry) (obj1)).getKey(), (com.google.android.gms.common.api.Api.ApiOptions.HasOptions)((java.util.Map.Entry) (obj1)).getValue());
                }
            }

            context = context.build();
            boolean flag3;
            if (((ApiClientConnector) (databroker)).mApiClient == null)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            Preconditions.checkState(flag3, "Cannot re-use a connector!");
            databroker.mApiClient = context;
            ((ApiClientConnector) (databroker)).mApiClient.connect();
            return;
        }
        serviceValidated(((GamesClientContext) (obj3)), ((com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService) (obj1)), databroker);
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void postExecute()
    {
    }

    final void sendCallback(Context context, int i, com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService gamesservice, Intent intent, Bundle bundle)
    {
        Preconditions.checkNotNull(bundle);
        i;
        JVM INSTR lookupswitch 2: default 32
    //                   0: 99
    //                   4: 90;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_99;
_L4:
        if (intent != null)
        {
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, mGamePackageName.hashCode(), intent, 0x8000000));
        }
        if (i == 0)
        {
            context = gamesservice;
        } else
        {
            context = null;
        }
        try
        {
            mCallbacks.onPostInitComplete(i, context, bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("ValidateServiceOp", "When providing result ", context);
        }
        if (gamesservice != null)
        {
            gamesservice.setSessionPending(false);
        }
        return;
_L3:
        logEvent(context, 2);
          goto _L4
        logEvent(context, 3);
          goto _L4
    }

    final void serviceValidated(GamesClientContext gamesclientcontext, com.google.android.gms.games.service.PlayGamesServiceBroker.GamesService gamesservice, DataBroker databroker)
    {
        Bundle bundle;
        Context context;
        ClientContext clientcontext;
        String s;
        PlayerBuffer playerbuffer;
        Preconditions.checkNotMainThread("Do not validate on the main thread!");
        bundle = new Bundle();
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        s = gamesclientcontext.mExternalTargetGameId;
        if (mIsHeadless)
        {
            break MISSING_BLOCK_LABEL_570;
        }
        android.net.Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Players.getUriForExternalPlayerId(clientcontext, gamesclientcontext.mExternalCurrentPlayerId);
        playerbuffer = new PlayerBuffer((new com.google.android.gms.games.broker.Agents.QueryBuilder(context)).setQuerySpec(uri).query());
        if (playerbuffer.getCount() != 0)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        SignInCache.signOut(context, clientcontext);
        sendCallback(context, 4, gamesservice, getSignInIntent(context, s, null));
        playerbuffer.release();
        return;
        Object obj;
        Player player;
        player = (Player)playerbuffer.get(0).freeze();
        if (!"593950602418".equals(s))
        {
            break MISSING_BLOCK_LABEL_208;
        }
        obj = (Boolean)G.forceGamesAccountInDestApp.get();
_L1:
        boolean flag2 = ((Boolean) (obj)).booleanValue();
        if (!TextUtils.isEmpty(player.getGamerTag()) || !flag2)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        SignInCache.signOut(context, clientcontext);
        sendCallback(context, 4, gamesservice, getSignInIntent(context, s, null));
        playerbuffer.release();
        return;
        obj = (Boolean)G.forceGamesAccountInGames.get();
          goto _L1
        obj = PlayerRef.toContentValues(player);
        playerbuffer.release();
        gamesservice.mCurrentPlayerValues = (ContentValues)Preconditions.checkNotNull(obj);
        if (player != null && GmsVersion.isAtLeastOlivet(mClientVersion))
        {
            obj = player;
            if (!GamesClientContext.isPlayerIdGPlusEnabled(player.getPlayerId()))
            {
                obj = new PlayerEntity(player, false);
            }
            bundle.putParcelable("com.google.android.gms.games.current_player", ((Parcelable) (obj)));
        }
        if (TextUtils.isEmpty(s) || "593950602418".equals(s))
        {
            break MISSING_BLOCK_LABEL_400;
        }
        obj = fetchLocalGame(gamesclientcontext);
        if (obj == null)
        {
            SignInCache.signOut(context, clientcontext);
            sendCallback(context, 4, gamesservice, getSignInIntent(context, s, null));
            return;
        }
        break MISSING_BLOCK_LABEL_363;
        gamesclientcontext;
        playerbuffer.release();
        throw gamesclientcontext;
        if (GmsVersion.isAtLeastOlivet(mClientVersion))
        {
            bundle.putParcelable("com.google.android.gms.games.current_game", (Parcelable)((Game) (obj)).freeze());
        }
        gamesservice.mCurrentGameValues = GameRef.toContentValues(((Game) (obj)));
        if (!TextUtils.isEmpty(s))
        {
            boolean flag;
            boolean flag1;
            long l;
            if (!SignInCache.getBoolean(context, SignInCache.getGreetedPrefKey(clientcontext.mCallingPackageName, clientcontext.getResolvedAccountName())))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = databroker.updateConnectionTime(gamesclientcontext);
            flag1 = flag;
            if (l != -1L)
            {
                if (System.currentTimeMillis() - l >= 0xdbba00L)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                flag1 = flag | flag1;
            }
            if (flag1 && !"593950602418".equals(s))
            {
                bundle.putBoolean("show_welcome_popup", true);
                SignInCache.markAsGreeted(context, clientcontext);
            }
            gamesclientcontext = gamesservice.mSessionRecorder;
            if (gamesclientcontext.shouldStartSession())
            {
                gamesclientcontext.mSessionStartTimeMillis = ((GamesSessionRecorder) (gamesclientcontext)).mClock.elapsedRealtime();
                gamesclientcontext.mSessionId = UUID.randomUUID().toString();
                PlayGamesAsyncService.updatePlayed(((GamesSessionRecorder) (gamesclientcontext)).mContext, ((GamesSessionRecorder) (gamesclientcontext)).mClientContext);
                gamesclientcontext.mAdInfo = ((GamesSessionRecorder) (gamesclientcontext)).mOperationWrapper.getAdInfo(((GamesSessionRecorder) (gamesclientcontext)).mContext);
            }
        }
        if (gamesservice.usesApi(Drive.API))
        {
            gamesservice.mApiClientTracker.incRef();
            PlayGamesAsyncService.verifySnapshotFolder(gamesservice.getDefaultGamesContext(false), gamesservice.mApiClientTracker);
        }
        sendCallback(context, 0, gamesservice, null, bundle);
        return;
    }
}
