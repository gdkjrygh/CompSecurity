// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.common.base.Strings;
import java.util.Random;

public class InitialAccountSelector
{

    private final AccountManager accountManager;
    private final CloudConfigurationManager cloudConfigurationManager;
    private final SharedPreferences globalPrefs;
    private final Random random;

    InitialAccountSelector(AccountManager accountmanager, CloudConfigurationManager cloudconfigurationmanager, SharedPreferences sharedpreferences)
    {
        this(accountmanager, cloudconfigurationmanager, sharedpreferences, new Random());
    }

    private InitialAccountSelector(AccountManager accountmanager, CloudConfigurationManager cloudconfigurationmanager, SharedPreferences sharedpreferences, Random random1)
    {
        accountManager = accountmanager;
        cloudConfigurationManager = cloudconfigurationmanager;
        globalPrefs = sharedpreferences;
        random = random1;
    }

    private void applySandboxHack(Account aaccount[])
    {
        int j = aaccount.length;
        for (int i = 0; i < j; i++)
        {
            if ("iwantsandbox@gmail.com".equals(aaccount[i].name))
            {
                cloudConfigurationManager.useSandboxCloudConfig();
            }
        }

    }

    private static boolean isAccountPresentOnDevice(String s, Account aaccount[])
    {
        boolean flag1 = false;
        int j = aaccount.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!s.equals(aaccount[i].name))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public final String ensureUser()
    {
        String s;
label0:
        {
            Account aaccount[] = accountManager.getAccountsByType("com.google");
            if (aaccount.length == 0)
            {
                SharedPreference.ACCOUNT_NAME.put(globalPrefs, "[ANONYMOUS_USER]");
                return "[ANONYMOUS_USER]";
            }
            applySandboxHack(aaccount);
            String s1 = Strings.emptyToNull((String)SharedPreference.ACCOUNT_NAME.get(globalPrefs));
            if (s1 != null)
            {
                s = s1;
                if (isAccountPresentOnDevice(s1, aaccount))
                {
                    break label0;
                }
            }
            s = aaccount[random.nextInt(aaccount.length)].name;
            SharedPreference.ACCOUNT_NAME.put(globalPrefs, s);
        }
        return s;
    }
}
