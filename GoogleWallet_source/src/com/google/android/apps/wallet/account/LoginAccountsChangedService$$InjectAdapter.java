// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.account:
//            LoginAccountsChangedService, AccountChecker

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding updater;

    public final void attach(Linker linker)
    {
        updater = linker.requestBinding("com.google.android.apps.wallet.account.AccountChecker", com/google/android/apps/wallet/account/LoginAccountsChangedService, getClass().getClassLoader());
    }

    public final LoginAccountsChangedService get()
    {
        LoginAccountsChangedService loginaccountschangedservice = new LoginAccountsChangedService();
        injectMembers(loginaccountschangedservice);
        return loginaccountschangedservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(updater);
    }

    public final void injectMembers(LoginAccountsChangedService loginaccountschangedservice)
    {
        loginaccountschangedservice.updater = (AccountChecker)updater.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LoginAccountsChangedService)obj);
    }

    public ()
    {
        super("com.google.android.apps.wallet.account.LoginAccountsChangedService", "members/com.google.android.apps.wallet.account.LoginAccountsChangedService", false, com/google/android/apps/wallet/account/LoginAccountsChangedService);
    }
}
