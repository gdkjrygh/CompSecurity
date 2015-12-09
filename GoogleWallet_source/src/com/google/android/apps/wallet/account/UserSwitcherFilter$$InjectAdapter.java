// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.app.Activity;
import com.google.android.gms.common.api.GoogleApiClient;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.account:
//            UserSwitcherFilter

public final class  extends Binding
    implements Provider
{

    private Binding account;
    private Binding accountChangeHelper;
    private Binding activity;
    private Binding peopleClient;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/account/UserSwitcherFilter, getClass().getClassLoader());
        account = linker.requestBinding("@com.google.android.apps.wallet.account.api.BindingAnnotations$WalletGaiaAccount()/javax.inject.Provider<android.accounts.Account>", com/google/android/apps/wallet/account/UserSwitcherFilter, getClass().getClassLoader());
        peopleClient = linker.requestBinding("@com.google.android.apps.wallet.gms.BindingAnnotations$PeopleClient()/com.google.android.gms.common.api.GoogleApiClient", com/google/android/apps/wallet/account/UserSwitcherFilter, getClass().getClassLoader());
        accountChangeHelper = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.account.AccountChanger>", com/google/android/apps/wallet/account/UserSwitcherFilter, getClass().getClassLoader());
    }

    public final UserSwitcherFilter get()
    {
        return new UserSwitcherFilter((Activity)activity.get(), (Provider)account.get(), (GoogleApiClient)peopleClient.get(), (Provider)accountChangeHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(account);
        set.add(peopleClient);
        set.add(accountChangeHelper);
    }

    public ()
    {
        super("com.google.android.apps.wallet.account.UserSwitcherFilter", "members/com.google.android.apps.wallet.account.UserSwitcherFilter", false, com/google/android/apps/wallet/account/UserSwitcherFilter);
    }
}
