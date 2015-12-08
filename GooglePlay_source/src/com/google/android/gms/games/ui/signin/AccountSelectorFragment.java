// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.signin;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.signin.SignInClient;

// Referenced classes of package com.google.android.gms.games.ui.signin:
//            GamesSignInFragment

public final class AccountSelectorFragment extends GamesSignInFragment
{

    private static final String INCLUDE_SW_ACCOUNT_TYPES[] = {
        "com.google", "cn.google"
    };
    private static final String ONLY_GOOGLE_ACCOUNT_TYPES[] = {
        "com.google"
    };

    public AccountSelectorFragment()
    {
    }

    public final int getAssociatedSignInState()
    {
        return 2;
    }

    public final int getLoggingEvent()
    {
        return 3;
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 0 && j == -1)
        {
            String s = intent.getStringExtra("authAccount");
            intent = intent.getStringExtra("accountType");
            if (s != null)
            {
                setChosenAccount(new Account(s, intent));
                transitionTo(3);
                return;
            } else
            {
                failSignIn(0);
                return;
            }
        } else
        {
            failSignIn(0);
            return;
        }
    }

    public final void onResume()
    {
        super.onResume();
        doneLoading();
    }

    public final void onTransition(SignInClient signinclient)
    {
        Intent intent;
        if (((Boolean)G.includeSidewinderAccounts.get()).booleanValue())
        {
            signinclient = INCLUDE_SW_ACCOUNT_TYPES;
        } else
        {
            signinclient = ONLY_GOOGLE_ACCOUNT_TYPES;
        }
        intent = new Intent();
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", null);
        intent.putExtra("allowableAccountTypes", signinclient);
        intent.putExtra("addAccountOptions", null);
        intent.putExtra("selectedAccount", null);
        intent.putExtra("alwaysPromptForAccount", true);
        intent.putExtra("descriptionTextOverride", null);
        intent.putExtra("authTokenType", null);
        intent.putExtra("addAccountRequiredFeatures", null);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 1);
        intent.addFlags(0x20000000);
        intent.putExtra("overrideTheme", 1);
        startActivityForResult(intent, 0);
    }

}
