// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.signin;

import android.os.RemoteException;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IGamesSignInService;
import com.google.android.gms.games.signin.SignInClient;

// Referenced classes of package com.google.android.gms.games.ui.signin:
//            GamesSignInFragment, SignInActivity

public final class RecordSignInFragment extends GamesSignInFragment
    implements com.google.android.gms.games.signin.SignInClient.OnSignInRecordedCallback
{

    private SignInClient mSignInClient;

    public RecordSignInFragment()
    {
    }

    public final int getAssociatedSignInState()
    {
        return 8;
    }

    public final int getLoggingEvent()
    {
        return 12;
    }

    public final void onSignInRecorded(int i)
    {
        if (!inAssociatedSignInState())
        {
            return;
        }
        if (i != 0)
        {
            GamesLog.e("RecordSignInFragment", (new StringBuilder("Error found when recording sign in attempt: ")).append(i).toString());
            failSignIn(getActivityResultForStatus(i), i);
            return;
        }
        String s = getParent().mGameId;
        if (mSignInClient.isConnected() && !isPlayGamesApp())
        {
            SignInClient signinclient = mSignInClient;
            android.accounts.Account account = getParent().mAccount;
            signinclient.checkConnected();
            try
            {
                signinclient.mService.refreshGameplayAclStatus(account, s);
            }
            catch (RemoteException remoteexception)
            {
                GamesLog.w("SignInClient", "service died");
            }
        }
        transitionTo(9);
    }

    public final void onTransition(SignInClient signinclient)
    {
        mSignInClient = signinclient;
        signinclient = mSignInClient;
        android.accounts.Account account = getRequestedAccount();
        android.accounts.Account account1 = getParent().mAccount;
        String s = super.getParent().mPlayerId;
        signinclient.checkConnected();
        try
        {
            signinclient.mService.recordSignIn(new com.google.android.gms.games.signin.SignInClient.SignInRecordedBinderCallback(signinclient, this), account, account1, signinclient.mCallingPackageName, signinclient.mScopes, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SignInClient signinclient)
        {
            GamesLog.w("SignInClient", "service died");
        }
    }
}
