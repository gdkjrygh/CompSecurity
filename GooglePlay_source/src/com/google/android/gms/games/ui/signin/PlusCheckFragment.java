// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.signin;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IGamesSignInService;
import com.google.android.gms.games.signin.SignInClient;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.ui.signin:
//            GamesSignInFragment, SignInActivity

public final class PlusCheckFragment extends GamesSignInFragment
    implements AccountManagerCallback, com.google.android.gms.games.signin.SignInClient.OnTokenRefreshedCallback
{

    private PlusCommonExtras mCommonExtras;

    public PlusCheckFragment()
    {
    }

    private void checkAccountProvisionedForPlus()
    {
        Account account = getParent().mAccount;
        if (account == null)
        {
            GamesLog.e("PlusCheckFragment", "Couldn't locate selected account!");
            failSignIn(10002);
            return;
        }
        if (account.type.equals("cn.google"))
        {
            transitionTo(5);
            return;
        } else
        {
            checkPlusLocal(super.mActivity, account, this);
            return;
        }
    }

    public static boolean checkPlusLocal(Context context, Account account, AccountManagerCallback accountmanagercallback)
    {
        if (account.type.equals("cn.google"))
        {
            return false;
        }
        context = AccountManager.get(context).hasFeatures(account, GmsClient.GOOGLE_PLUS_REQUIRED_FEATURES, accountmanagercallback, null);
        if (accountmanagercallback != null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = ((Boolean)context.getResult()).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return flag;
    }

    public final int getAssociatedSignInState()
    {
        return 4;
    }

    public final int getLoggingEvent()
    {
        return 4;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        mCommonExtras = PlusCommonExtras.extractFromIntent(super.mActivity.getIntent());
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i != 1) goto _L2; else goto _L1
_L1:
        if (j != -1) goto _L4; else goto _L3
_L3:
        logState(6);
        transitionTo(5);
_L6:
        return;
_L4:
        if (j == 10001)
        {
            if (canContinueAfterOobException())
            {
                transitionTo(4);
                return;
            } else
            {
                failSignIn(10002);
                return;
            }
        } else
        {
            logState(7);
            GamesLog.i("PlusCheckFragment", (new StringBuilder("User failed to complete G+ OOB - result code ")).append(j).toString());
            transitionTo(1);
            return;
        }
_L2:
        if (i == 2)
        {
            if (j == -1)
            {
                logState(6);
                transitionTo(5);
                return;
            } else
            {
                failSignIn(10002);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onStop()
    {
        super.onStop();
    }

    public final void onTokenRefreshed(int i)
    {
        if (!inAssociatedSignInState())
        {
            return;
        }
        if (i != 0)
        {
            GamesLog.w("PlusCheckFragment", (new StringBuilder("Failed to refresh token: ")).append(i).toString());
            failSignIn(10002);
            return;
        } else
        {
            checkAccountProvisionedForPlus();
            return;
        }
    }

    public final void onTransition(SignInClient signinclient)
    {
        boolean flag;
        if (super.getParent().mOobExceptionCount > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            signinclient = super.getParent().getSignInClient();
            Account account = getParent().mAccount;
            signinclient.checkConnected();
            try
            {
                signinclient.mService.forceRefreshToken(new com.google.android.gms.games.signin.SignInClient.TokenRefreshedBinderCallback(signinclient, this), account);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (SignInClient signinclient)
            {
                GamesLog.w("SignInClient", "service died");
            }
            return;
        } else
        {
            checkAccountProvisionedForPlus();
            return;
        }
    }

    public final void run(AccountManagerFuture accountmanagerfuture)
    {
        boolean flag;
        flag = ((Boolean)accountmanagerfuture.getResult()).booleanValue();
        if (!inAssociatedSignInState())
        {
            return;
        }
        if (flag)
        {
            try
            {
                transitionTo(5);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AccountManagerFuture accountmanagerfuture)
            {
                GamesLog.e("PlusCheckFragment", "Auth error checking G+ sign-up status", accountmanagerfuture);
                failSignIn(10002);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AccountManagerFuture accountmanagerfuture)
            {
                GamesLog.e("PlusCheckFragment", "Canceled error checking G+ sign-up status", accountmanagerfuture);
                failSignIn(10002);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AccountManagerFuture accountmanagerfuture)
            {
                GamesLog.e("PlusCheckFragment", "Network error checking G+ sign-up status", accountmanagerfuture);
            }
            break MISSING_BLOCK_LABEL_122;
        }
        accountmanagerfuture = super.getParent().getSignInClient().getPlusUpgradeIntent(getParent().mAccount, getParent().mGamePackageName, super.getParent().mScopes, mCommonExtras);
        logState(5);
        startActivityForResult(accountmanagerfuture, 1);
        return;
        failSignIn(10002, 6);
        return;
    }
}
