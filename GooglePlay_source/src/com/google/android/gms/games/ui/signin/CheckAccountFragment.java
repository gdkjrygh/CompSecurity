// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.signin;

import android.accounts.Account;
import android.content.Context;
import android.support.v4.app.Fragment;
import com.google.android.gms.games.signin.SignInClient;
import com.google.android.gms.games.util.AccountUtils;
import com.google.android.gms.games.util.PanoUtils;

// Referenced classes of package com.google.android.gms.games.ui.signin:
//            GamesSignInFragment, SignInActivity

public final class CheckAccountFragment extends GamesSignInFragment
{

    public CheckAccountFragment()
    {
    }

    public static Account getSingleAccount$799b55c(Context context)
    {
        context = AccountUtils.getAvailableAccounts(context);
        if (context.length == 1)
        {
            return context[0];
        } else
        {
            return null;
        }
    }

    public final int getAssociatedSignInState()
    {
        return 1;
    }

    public final int getLoggingEvent()
    {
        return 2;
    }

    public final void onTransition(SignInClient signinclient)
    {
        signinclient = signinclient.getResolvedGmsAccount(super.getParent().mUseDesiredAccount);
        if (signinclient != null)
        {
            setChosenAccount(signinclient);
            transitionTo(4);
            return;
        }
        signinclient = super.mActivity;
        String s = getParent().mGamePackageName;
        signinclient = getSingleAccount$799b55c(signinclient);
        if (signinclient != null)
        {
            setChosenAccount(signinclient);
            if (PanoUtils.isPano(super.mActivity))
            {
                super.getParent().mSuppressAccountSelector = true;
            }
            transitionTo(4);
            return;
        } else
        {
            transitionTo(2);
            return;
        }
    }
}
