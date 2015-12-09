// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.accounts.Account;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.account:
//            AccountModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding accountName;
    private final AccountModule module;

    public final void attach(Linker linker)
    {
        accountName = linker.requestBinding("@com.google.android.apps.wallet.userscope.api.BindingAnnotations$AccountName()/java.lang.String", com/google/android/apps/wallet/account/AccountModule, getClass().getClassLoader());
    }

    public final Account get()
    {
        AccountModule accountmodule = module;
        return AccountModule.getWalletAccount((String)accountName.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(accountName);
    }

    public i(AccountModule accountmodule)
    {
        super("@com.google.android.apps.wallet.account.api.BindingAnnotations$WalletGaiaAccount()/android.accounts.Account", false, "com.google.android.apps.wallet.account.AccountModule", "getWalletAccount");
        module = accountmodule;
        setLibrary(true);
    }
}
