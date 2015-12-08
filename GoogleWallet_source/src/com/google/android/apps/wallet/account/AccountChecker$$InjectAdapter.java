// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.accounts.AccountManager;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.google.android.apps.wallet.base.java.ProcessKiller;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.account:
//            AccountChecker

public final class  extends Binding
    implements Provider
{

    private Binding accountManager;
    private Binding accountName;
    private Binding authUtil;
    private Binding globalPrefs;
    private Binding killer;
    private Binding threadChecker;

    public final void attach(Linker linker)
    {
        accountManager = linker.requestBinding("android.accounts.AccountManager", com/google/android/apps/wallet/account/AccountChecker, getClass().getClassLoader());
        accountName = linker.requestBinding("@com.google.android.apps.wallet.userscope.api.BindingAnnotations$AccountName()/java.lang.String", com/google/android/apps/wallet/account/AccountChecker, getClass().getClassLoader());
        globalPrefs = linker.requestBinding("@com.google.android.apps.wallet.config.sharedpreferences.BindingAnnotations$Global()/android.content.SharedPreferences", com/google/android/apps/wallet/account/AccountChecker, getClass().getClassLoader());
        authUtil = linker.requestBinding("com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil", com/google/android/apps/wallet/account/AccountChecker, getClass().getClassLoader());
        killer = linker.requestBinding("com.google.android.apps.wallet.base.java.ProcessKiller", com/google/android/apps/wallet/account/AccountChecker, getClass().getClassLoader());
        threadChecker = linker.requestBinding("com.google.android.apps.wallet.util.async.ThreadChecker", com/google/android/apps/wallet/account/AccountChecker, getClass().getClassLoader());
    }

    public final AccountChecker get()
    {
        return new AccountChecker((AccountManager)accountManager.get(), (String)accountName.get(), (SharedPreferences)globalPrefs.get(), (WalletGoogleAuthUtil)authUtil.get(), (ProcessKiller)killer.get(), (ThreadChecker)threadChecker.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(accountManager);
        set.add(accountName);
        set.add(globalPrefs);
        set.add(authUtil);
        set.add(killer);
        set.add(threadChecker);
    }

    public ()
    {
        super("com.google.android.apps.wallet.account.AccountChecker", "members/com.google.android.apps.wallet.account.AccountChecker", false, com/google/android/apps/wallet/account/AccountChecker);
    }
}
