// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.accounts.AccountManager;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.account:
//            InitialAccountSelector

public final class  extends Binding
    implements Provider
{

    private Binding accountManager;
    private Binding cloudConfigurationManager;
    private Binding globalPrefs;

    public final void attach(Linker linker)
    {
        accountManager = linker.requestBinding("android.accounts.AccountManager", com/google/android/apps/wallet/account/InitialAccountSelector, getClass().getClassLoader());
        cloudConfigurationManager = linker.requestBinding("com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager", com/google/android/apps/wallet/account/InitialAccountSelector, getClass().getClassLoader());
        globalPrefs = linker.requestBinding("@com.google.android.apps.wallet.config.sharedpreferences.BindingAnnotations$Global()/android.content.SharedPreferences", com/google/android/apps/wallet/account/InitialAccountSelector, getClass().getClassLoader());
    }

    public final InitialAccountSelector get()
    {
        return new InitialAccountSelector((AccountManager)accountManager.get(), (CloudConfigurationManager)cloudConfigurationManager.get(), (SharedPreferences)globalPrefs.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(accountManager);
        set.add(cloudConfigurationManager);
        set.add(globalPrefs);
    }

    public ()
    {
        super("com.google.android.apps.wallet.account.InitialAccountSelector", "members/com.google.android.apps.wallet.account.InitialAccountSelector", false, com/google/android/apps/wallet/account/InitialAccountSelector);
    }
}
