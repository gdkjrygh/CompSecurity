// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.account:
//            AccountNameChangeHandler

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding globalPrefs;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/account/AccountNameChangeHandler, getClass().getClassLoader());
        globalPrefs = linker.requestBinding("@com.google.android.apps.wallet.config.sharedpreferences.BindingAnnotations$Global()/android.content.SharedPreferences", com/google/android/apps/wallet/account/AccountNameChangeHandler, getClass().getClassLoader());
    }

    public final AccountNameChangeHandler get()
    {
        return new AccountNameChangeHandler((Application)application.get(), (SharedPreferences)globalPrefs.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(globalPrefs);
    }

    public ()
    {
        super("com.google.android.apps.wallet.account.AccountNameChangeHandler", "members/com.google.android.apps.wallet.account.AccountNameChangeHandler", false, com/google/android/apps/wallet/account/AccountNameChangeHandler);
    }
}
