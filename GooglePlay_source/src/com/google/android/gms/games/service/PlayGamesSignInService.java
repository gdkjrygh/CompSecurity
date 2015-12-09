// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.chimera.Service;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.oob.SignUp;
import com.google.android.gms.common.ui.UnpackingRedirectActivity;
import com.google.android.gms.common.util.AccountUtils;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.games.broker.Agents;
import com.google.android.gms.games.internal.GamesConstants;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IGamesSignInCallbacks;
import com.google.android.gms.games.signin.SignInCache;
import com.google.android.gms.games.util.PanoUtils;
import com.google.android.gms.plus.internal.PlusCommonExtras;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesSignInIntentService

public final class PlayGamesSignInService extends Service
{
    static final class SignInService extends com.google.android.gms.games.internal.IGamesSignInService.Stub
    {

        private final int mClientVersion;
        private final Context mContext;
        private final Bundle mSignInOptionsBundle;

        private void checkCallerAllowed()
            throws SecurityException
        {
            AndroidUtils.verifyPackageName(mContext, "com.google.android.play.games");
        }

        private ClientContext getClientContext(Account account, Account account1, String s, String as[])
        {
            int i;
            try
            {
                i = mContext.getPackageManager().getPackageInfo(s, 0).applicationInfo.uid;
            }
            // Misplaced declaration of an exception variable
            catch (Account account)
            {
                GamesLog.e("GamesSignInService", (new StringBuilder("Bad package name: ")).append(s).toString(), account);
                return null;
            }
            account = new ClientContext(i, account, account1, s);
            account.setGrantedScopes(as);
            account.setExtra("client_version", mClientVersion);
            return account;
        }

        private ClientContext getFirstPartyClientContext(Account account)
        {
            account = Agents.buildFirstPartyClientContext(mContext, account);
            account.setExtra("client_version", mClientVersion);
            return account;
        }

        public final void checkOAuthConsent(IGamesSignInCallbacks igamessignincallbacks, Account account, Account account1, String s, String as[])
        {
            checkCallerAllowed();
            Preconditions.checkNotNull(igamessignincallbacks, "callbacks is missing");
            Preconditions.checkNotNull(account, "desired account is missing");
            Preconditions.checkNotNull(account1, "resolved account is missing");
            Preconditions.checkNotNull(s, "package name is missing");
            Preconditions.checkNotNull(as, "scopes are missing");
            account = getClientContext(account, account1, s, as);
            if (account == null)
            {
                try
                {
                    igamessignincallbacks.onCheckOAuthComplete(1, null);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (IGamesSignInCallbacks igamessignincallbacks)
                {
                    return;
                }
            } else
            {
                PlayGamesSignInIntentService.checkOAuthConsent(mContext, account, mSignInOptionsBundle, igamessignincallbacks);
                return;
            }
        }

        public final void forceRefreshToken(IGamesSignInCallbacks igamessignincallbacks, Account account)
        {
            checkCallerAllowed();
            Preconditions.checkNotNull(igamessignincallbacks, "callbacks is missing");
            Preconditions.checkNotNull(account, "account is missing");
            PlayGamesSignInIntentService.forceRefreshToken(mContext, igamessignincallbacks, account);
        }

        public final String getGmsAccountName(String s)
        {
            checkCallerAllowed();
            s = getResolvedGmsAccount(s, false);
            if (s == null)
            {
                return null;
            } else
            {
                return ((Account) (s)).name;
            }
        }

        public final Intent getPlusUpgradeIntent(Account account, String s, String as[], PlusCommonExtras pluscommonextras)
        {
            checkCallerAllowed();
            s = new ClientContext(Process.myUid(), account, account, s);
            for (int i = 0; i < as.length; i++)
            {
                s.addGrantedScope(as[i]);
            }

            if (PanoUtils.isPano(mContext))
            {
                account = new com.google.android.gms.plus.PlusIntents.SignUpIntentBuilder(mContext, s);
                account.mSignUpState = 2;
                account = account.build();
            } else
            {
                account = SignUp.newSignUpIntent(account.name);
            }
            SafeParcelableSerializer.serializeToIntentExtra(pluscommonextras, account, "android.gms.plus.internal.PlusCommonExtras.extraPlusCommon");
            account = PendingIntent.getActivity(mContext, 0, account, 0x40000000);
            return UnpackingRedirectActivity.createDefaultIntent(mContext, account);
        }

        public final Account getResolvedGmsAccount(String s, boolean flag)
        {
            checkCallerAllowed();
            if (flag)
            {
                return SignInCache.getDesiredAccount(mContext, s);
            } else
            {
                return AccountUtils.getValidSelectedAccountObj(mContext, s);
            }
        }

        public final Account getSignedInAccount(String s)
        {
            checkCallerAllowed();
            return SignInCache.getAccount(mContext, s);
        }

        public final void loadGame(IGamesSignInCallbacks igamessignincallbacks, Account account, String s, String s1)
            throws RemoteException
        {
            checkCallerAllowed();
            Preconditions.checkNotNull(igamessignincallbacks, "callbacks is missing");
            Preconditions.checkNotNull(account, "account is missing");
            Preconditions.checkNotNull(s, "game ID is missing");
            Preconditions.checkNotNull(s1, "game package name is missing");
            account = getFirstPartyClientContext(account);
            PlayGamesSignInIntentService.loadGame(mContext, account, igamessignincallbacks, s, s1);
        }

        public final void loadGameplayAcl(IGamesSignInCallbacks igamessignincallbacks, Account account, String s)
            throws RemoteException
        {
            checkCallerAllowed();
            Preconditions.checkNotNull(igamessignincallbacks, "callbacks is missing");
            Preconditions.checkNotNull(account, "account is missing");
            Preconditions.checkNotNull(s, "game ID is missing");
            account = getFirstPartyClientContext(account);
            PlayGamesSignInIntentService.loadGameplayAcl(mContext, account, igamessignincallbacks, s);
        }

        public final void loadSelf(IGamesSignInCallbacks igamessignincallbacks, Account account, Account account1, String s, String s1, String as[])
        {
            checkCallerAllowed();
            Preconditions.checkNotNull(igamessignincallbacks, "callbacks is missing");
            Preconditions.checkNotNull(account, "desired account is missing");
            Preconditions.checkNotNull(account1, "resolved account is missing");
            Preconditions.checkNotNull(s1, "package name is missing");
            Preconditions.checkNotNull(as, "scopes are missing");
            account = getClientContext(account, account1, s1, as);
            if (account == null)
            {
                try
                {
                    igamessignincallbacks.onPlayersLoaded(DataHolder.empty(1));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (IGamesSignInCallbacks igamessignincallbacks)
                {
                    return;
                }
            } else
            {
                PlayGamesSignInIntentService.loadSelf$66d73af3(mContext, account, s, igamessignincallbacks);
                return;
            }
        }

        public final void recordSignIn(IGamesSignInCallbacks igamessignincallbacks, Account account, Account account1, String s, String as[], String s1)
        {
            checkCallerAllowed();
            Preconditions.checkNotNull(igamessignincallbacks, "callbacks is missing");
            Preconditions.checkNotNull(account, "desired account is missing");
            Preconditions.checkNotNull(account1, "resolved account is missing");
            Preconditions.checkNotNull(s, "package name is missing");
            if (!GamesConstants.isPackagePlayGamesApp(s))
            {
                Preconditions.checkNotNull(s1, "player ID is missing");
            } else
            {
                account = new Account("<<default account>>", "com.google");
            }
            s = getClientContext(account, account1, s, as);
            if (s == null)
            {
                try
                {
                    igamessignincallbacks.onSignInRecorded(1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (IGamesSignInCallbacks igamessignincallbacks)
                {
                    return;
                }
            }
            account1 = null;
            account = account1;
            if (mSignInOptionsBundle != null)
            {
                account = account1;
                if (mSignInOptionsBundle.containsKey("com.google.android.gms.common.internal.ClientSettings.sessionId"))
                {
                    account = Integer.valueOf(mSignInOptionsBundle.getInt("com.google.android.gms.common.internal.ClientSettings.sessionId"));
                }
            }
            PlayGamesSignInIntentService.recordSignIn(mContext, s, igamessignincallbacks, s1, account);
        }

        public final void refreshGameplayAclStatus(Account account, String s)
        {
            checkCallerAllowed();
            Preconditions.checkNotNull(account, "Account is missing");
            Preconditions.checkNotEmpty(s, "Must provide a non-empty game ID");
            account = getFirstPartyClientContext(account);
            PlayGamesSignInIntentService.refreshGameplayAclStatus(mContext, account, s);
        }

        public final void updateGameplayAcl(IGamesSignInCallbacks igamessignincallbacks, Account account, String s, String s1)
            throws RemoteException
        {
            checkCallerAllowed();
            Preconditions.checkNotNull(igamessignincallbacks, "callbacks is missing");
            Preconditions.checkNotNull(account, "account is missing");
            Preconditions.checkNotNull(s, "game ID is missing");
            Preconditions.checkNotNull(s1, "ACL data is missing");
            account = getFirstPartyClientContext(account);
            PlayGamesSignInIntentService.updateGameplayAcl(mContext, account, igamessignincallbacks, s, s1);
        }

        public final void validateAccount(IGamesSignInCallbacks igamessignincallbacks, Account account)
        {
            checkCallerAllowed();
            Preconditions.checkNotNull(igamessignincallbacks, "callbacks is missing");
            Preconditions.checkNotNull(account, "account is missing");
            PlayGamesSignInIntentService.validateAccount(mContext, igamessignincallbacks, account);
        }

        SignInService(Context context, int i, Bundle bundle)
        {
            GservicesValue.init(context.getApplicationContext());
            mContext = context;
            mClientVersion = i;
            mSignInOptionsBundle = bundle;
        }
    }


    public PlayGamesSignInService()
    {
    }

    public final IBinder onBind(Intent intent)
    {
        return new SignInService(getApplicationContext(), intent.getIntExtra("client_version", -1), intent.getBundleExtra("com.google.android.gms.games.EXTRA_SIGNIN_OPTIONS"));
    }
}
