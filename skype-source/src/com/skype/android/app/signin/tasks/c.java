// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import android.accounts.AccountManager;
import android.app.Application;
import com.skype.Account;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.service.SyncAccountUtil;
import com.skype.android.util.TimeUtil;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            AccountTask

final class c
    implements AccountTask
{

    private AccountManager accountManager;
    private SyncAccountUtil syncAccountUtil;
    private Provider userPrefsProvider;

    public c(Application application, AccountManager accountmanager, Provider provider, TimeUtil timeutil)
    {
        accountManager = accountmanager;
        userPrefsProvider = provider;
        syncAccountUtil = new SyncAccountUtil(application, timeutil);
    }

    public final void onLogin(Account account)
    {
        String s = account.getSigninNameProp();
        account = account.getSkypenameProp();
        syncAccountUtil.createOrUpdateAccount(s, account, ((UserPreferences)userPrefsProvider.get()).isSyncContactsEnabled());
    }

    public final void onLogout(Account account)
    {
        if (account.getStatusProp() == com.skype.Account.STATUS.LOGGED_OUT)
        {
            account = syncAccountUtil.getCurrentAccount();
            if (account != null)
            {
                accountManager.removeAccount(account, null, null);
            }
        }
    }
}
