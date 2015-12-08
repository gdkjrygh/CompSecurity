// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.signin;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IGamesSignInService;
import com.google.android.gms.games.signin.SignInClient;

// Referenced classes of package com.google.android.gms.games.ui.signin:
//            GamesSignInFragment, SignInActivity

public final class CheckGameplayAclFragment extends GamesSignInFragment
    implements ResultCallback, com.google.android.gms.games.internal.game.Acls.OnGameplayAclLoadedCallback, com.google.android.gms.games.internal.game.Acls.OnGameplayAclUpdatedCallback
{

    private SignInClient mSignInClient;

    public CheckGameplayAclFragment()
    {
    }

    public final int getAssociatedSignInState()
    {
        return 6;
    }

    public final int getLoggingEvent()
    {
        return 9;
    }

    public final void onGameplayAclLoaded(com.google.android.gms.games.internal.game.Acls.LoadAclResult loadaclresult)
    {
        int i;
        i = loadaclresult.getStatus().mStatusCode;
        loadaclresult = loadaclresult.getDataHolder();
        if (!inAssociatedSignInState())
        {
            loadaclresult.close();
            return;
        }
        if (i == 2)
        {
            loadaclresult.close();
            transitionTo(1);
            return;
        }
        boolean flag;
        if (((DataHolder) (loadaclresult)).mRowCount <= 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        flag = loadaclresult.getBoolean("specified_by_user", 0, loadaclresult.getWindowIndex(0));
        loadaclresult.close();
        if (flag)
        {
            transitionTo(7);
            return;
        }
        break MISSING_BLOCK_LABEL_106;
        failSignIn(getActivityResultForStatus(i), i);
        loadaclresult.close();
        return;
        Exception exception;
        exception;
        loadaclresult.close();
        throw exception;
        logState(10);
        if (super.isActivityOk())
        {
            super.getParent().showLoading();
        }
        if (mSignInClient != null && mSignInClient.isConnected())
        {
            loadaclresult = mSignInClient;
            android.accounts.Account account = getParent().mAccount;
            String s = getParent().mGameId;
            loadaclresult.checkConnected();
            try
            {
                ((SignInClient) (loadaclresult)).mService.updateGameplayAcl(new com.google.android.gms.games.signin.SignInClient.GameplayAclUpdatedBinderCallback(loadaclresult, this), account, s, "");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.games.internal.game.Acls.LoadAclResult loadaclresult)
            {
                GamesLog.w("SignInClient", "service died");
            }
            return;
        } else
        {
            transitionTo(6);
            return;
        }
    }

    public final void onGameplayAclUpdated(Status status)
    {
        if (!inAssociatedSignInState())
        {
            return;
        }
        int i = status.mStatusCode;
        if (i == 0)
        {
            transitionTo(7);
            return;
        }
        if (i == 2)
        {
            transitionTo(1);
            return;
        } else
        {
            GamesLog.e("CheckGameplayAcl", (new StringBuilder("Error when updating gameplay ACL; status code ")).append(i).toString());
            failSignIn(getActivityResultForStatus(i), i);
            return;
        }
    }

    public final volatile void onResult(Result result)
    {
        int i;
        result = (com.google.android.gms.games.GamesMetadata.LoadGamesResult)result;
        i = result.getStatus().mStatusCode;
        result = result.getGames();
        if (!inAssociatedSignInState())
        {
            result.release();
            return;
        }
        if (i == 2)
        {
            result.release();
            if (canContinueAfterOobException())
            {
                transitionTo(1);
                return;
            } else
            {
                failSignIn(10002);
                return;
            }
        }
        if (result.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        if (result.get(0).getGameplayAclStatus() != 0) goto _L2; else goto _L1
_L1:
        SignInClient signinclient;
        android.accounts.Account account;
        String s;
        signinclient = mSignInClient;
        account = getParent().mAccount;
        s = getParent().mGameId;
        signinclient.checkConnected();
        signinclient.mService.loadGameplayAcl(new com.google.android.gms.games.signin.SignInClient.GameplayAclLoadedBinderCallback(signinclient, this), account, s);
_L3:
        result.release();
        return;
        Object obj;
        obj;
        GamesLog.w("SignInClient", "service died");
          goto _L3
        obj;
        result.release();
        throw obj;
_L2:
        transitionTo(7);
          goto _L3
        GamesLog.e("CheckGameplayAcl", "Unable to load metadata for game");
        failSignIn(getActivityResultForStatus(i), i);
          goto _L3
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    public final void onTransition(SignInClient signinclient)
    {
        mSignInClient = signinclient;
        if (isPlayGamesApp())
        {
            transitionTo(7);
            return;
        }
        signinclient = mSignInClient;
        android.accounts.Account account = getParent().mAccount;
        String s = getParent().mGameId;
        signinclient.checkConnected();
        try
        {
            signinclient.mService.loadGame(new com.google.android.gms.games.signin.SignInClient.GameLoadedBinderCallback(signinclient, this), account, s, signinclient.mCallingPackageName);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SignInClient signinclient)
        {
            GamesLog.w("SignInClient", "service died");
        }
    }
}
