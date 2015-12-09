// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.signin;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IGamesSignInService;
import com.google.android.gms.games.signin.SignInClient;

// Referenced classes of package com.google.android.gms.games.ui.signin:
//            GamesSignInFragment, SignInActivity

public final class LoadSelfFragment extends GamesSignInFragment
    implements ResultCallback
{

    public LoadSelfFragment()
    {
    }

    public final int getAssociatedSignInState()
    {
        return 7;
    }

    public final int getLoggingEvent()
    {
        return 11;
    }

    public final volatile void onResult(Result result)
    {
        PlayerBuffer playerbuffer;
        int i;
label0:
        {
            result = (com.google.android.gms.games.Players.LoadPlayersResult)result;
            if (inAssociatedSignInState())
            {
                i = result.getStatus().mStatusCode;
                playerbuffer = result.getPlayers();
                if (i != 4)
                {
                    break label0;
                }
                failSignIn(10002, i);
            }
            return;
        }
        if (i == 1003)
        {
            failSignIn(20000);
            return;
        }
        if (i == 1001)
        {
            transitionTo(5);
            return;
        }
        if (i == 1000)
        {
            failSignIn(10002);
            return;
        }
        if (i == 1500)
        {
            if (canContinueAfterOobException())
            {
                transitionTo(4);
                return;
            } else
            {
                GamesLog.w("LoadSelfFragment", "Too many out-of-box exceptions - bailing out of sign-in.");
                failSignIn(10002);
                return;
            }
        }
        if (i == 2)
        {
            transitionTo(1);
            return;
        }
        if (i == 7)
        {
            failSignIn(10003, i);
            return;
        }
        if (i == 1002)
        {
            GamesLog.e("LoadSelfFragment", "Unable to sign in - application does not have a registered client ID");
            failSignIn(10004);
            return;
        }
        result = null;
        if (playerbuffer.getCount() > 0)
        {
            result = playerbuffer.get(0).getPlayerId();
        }
        playerbuffer.release();
        if (result != null)
        {
            if (super.isActivityOk())
            {
                super.getParent().mPlayerId = result;
            }
            transitionTo(8);
            return;
        }
        break MISSING_BLOCK_LABEL_226;
        result;
        playerbuffer.release();
        throw result;
        if (isPlayGamesApp() && ((Boolean)G.destAppSkipPlusVerification.get()).booleanValue())
        {
            transitionTo(8);
            return;
        } else
        {
            GamesLog.e("LoadSelfFragment", "No player found when signing in");
            failSignIn(10002);
            return;
        }
    }

    public final void onTransition(SignInClient signinclient)
    {
        android.accounts.Account account = getRequestedAccount();
        android.accounts.Account account1 = getParent().mAccount;
        String s = getParent().mGameId;
        signinclient.checkConnected();
        try
        {
            signinclient.mService.loadSelf(new com.google.android.gms.games.signin.SignInClient.PlayersLoadedBinderCallback(signinclient, this), account, account1, s, signinclient.mCallingPackageName, signinclient.mScopes);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SignInClient signinclient)
        {
            GamesLog.w("SignInClient", "service died");
        }
    }
}
