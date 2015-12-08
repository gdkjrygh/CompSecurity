// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.signin;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IGamesSignInService;
import com.google.android.gms.games.signin.SignInClient;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui.signin:
//            GamesSignInFragment, SignInActivity

public final class CheckConsentFragment extends GamesSignInFragment
    implements com.google.android.gms.games.signin.SignInClient.OnCheckOAuthCompleteCallback
{

    public CheckConsentFragment()
    {
    }

    public final int getAssociatedSignInState()
    {
        return 5;
    }

    public final int getLoggingEvent()
    {
        return 8;
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
label0:
        {
            super.onActivityResult(i, j, intent);
            if (i == 0)
            {
                if (j != -1)
                {
                    break label0;
                }
                logState(19);
                transitionTo(5);
            }
            return;
        }
        i = 21;
        if (j == 0)
        {
            i = 20;
        }
        logState(i);
        transitionTo(1);
    }

    public final void onCheckOAuthComplete(int i, PendingIntent pendingintent)
    {
        if (!inAssociatedSignInState())
        {
            return;
        }
        if (i == 0)
        {
            transitionTo(6);
            return;
        }
        if (pendingintent != null)
        {
            logState(17, i);
            try
            {
                int j = super.mActivity.mFragments.getFragments().indexOf(this);
                super.mActivity.startIntentSenderForResult(pendingintent.getIntentSender(), (j + 1 << 16) + 0, null, 0, 0, 0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (PendingIntent pendingintent)
            {
                GamesLog.e("CheckConsent", "Exception showing GMS OAuth Activity.");
            }
        }
        logState(18, i);
        failSignIn(getActivityResultForStatus(i), i);
    }

    public final void onTransition(SignInClient signinclient)
    {
        android.accounts.Account account = getRequestedAccount();
        android.accounts.Account account1 = getParent().mAccount;
        signinclient.checkConnected();
        try
        {
            signinclient.mService.checkOAuthConsent(new com.google.android.gms.games.signin.SignInClient.CheckOAuthCompleteBinderCallback(signinclient, this), account, account1, signinclient.mCallingPackageName, signinclient.mScopes);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SignInClient signinclient)
        {
            GamesLog.w("SignInClient", "service died");
        }
    }
}
