// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.userscope.UserInjector;

// Referenced classes of package com.google.android.apps.wallet.account:
//            AccountChecker

public class LoginAccountsChangedService extends IntentService
{

    AccountChecker updater;

    public LoginAccountsChangedService()
    {
        super("LoginAccountsChangedService");
    }

    public static Intent createIntent(Context context)
    {
        return InternalIntents.forClass(context, com/google/android/apps/wallet/account/LoginAccountsChangedService).setAction("LoginAccountsChangedService");
    }

    protected void onHandleIntent(Intent intent)
    {
        UserInjector.inject(this, this);
        updater.checkAccounts();
    }
}
