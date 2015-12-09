// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.google.android.apps.wallet.base.java.ProcessKiller;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.common.base.Strings;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AccountChecker
{

    private static final String TAG = com/google/android/apps/wallet/account/AccountChecker.getSimpleName();
    private final AccountManager accountManager;
    private final String accountName;
    private final WalletGoogleAuthUtil authUtil;
    private final SharedPreferences globalPrefs;
    private final ProcessKiller killer;
    private final ThreadChecker threadChecker;

    protected AccountChecker(AccountManager accountmanager, String s, SharedPreferences sharedpreferences, WalletGoogleAuthUtil walletgoogleauthutil, ProcessKiller processkiller, ThreadChecker threadchecker)
    {
        accountManager = accountmanager;
        accountName = s;
        globalPrefs = sharedpreferences;
        authUtil = walletgoogleauthutil;
        killer = processkiller;
        threadChecker = threadchecker;
    }

    public final void checkAccounts()
    {
        Object obj;
        obj = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        Account aaccount[] = accountManager.getAccountsByType("com.google");
        obj = new HashSet();
        int j = aaccount.length;
        for (int i = 0; i < j; i++)
        {
            ((Set) (obj)).add(aaccount[i].name);
        }

        if (((Set) (obj)).contains(accountName))
        {
            return;
        }
        Object obj2 = authUtil.getAccountChangeEvents(accountName);
        obj2 = ((List) (obj2)).iterator();
        AccountChangeEvent accountchangeevent;
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break MISSING_BLOCK_LABEL_229;
            }
            accountchangeevent = (AccountChangeEvent)((Iterator) (obj2)).next();
        } while (!accountName.equals(accountchangeevent.getAccountName()) || accountchangeevent.getChangeType() != 4);
        obj2 = accountchangeevent.getChangeData();
        if (!Strings.isNullOrEmpty(((String) (obj2))) && ((Set) (obj)).contains(obj2))
        {
            globalPrefs.edit().putString(SharedPreference.ACCOUNT_NAME.getKey(), ((String) (obj2))).putString(SharedPreference.OLD_ACCOUNT_NAME.getKey(), accountName).commit();
        }
        ProcessKiller processkiller = killer;
        ProcessKiller.kill();
        return;
        Object obj1;
        obj1;
        WLog.e(TAG, "Swallowing exception while retrieving account change events", ((Throwable) (obj1)));
        ProcessKiller processkiller1 = killer;
        ProcessKiller.kill();
        return;
        ProcessKiller processkiller2 = killer;
        ProcessKiller.kill();
        return;
        processkiller2;
        ProcessKiller processkiller3 = killer;
        ProcessKiller.kill();
        throw processkiller2;
    }

}
