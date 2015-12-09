// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init:
//            WalletInitializerTaskManager

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding globalPrefs;
    private Binding userPrefs;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/init/WalletInitializerTaskManager, getClass().getClassLoader());
        globalPrefs = linker.requestBinding("@com.google.android.apps.wallet.config.sharedpreferences.BindingAnnotations$Global()/android.content.SharedPreferences", com/google/android/apps/wallet/init/WalletInitializerTaskManager, getClass().getClassLoader());
        userPrefs = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/init/WalletInitializerTaskManager, getClass().getClassLoader());
    }

    public final WalletInitializerTaskManager get()
    {
        return new WalletInitializerTaskManager((Application)application.get(), (SharedPreferences)globalPrefs.get(), (SharedPreferences)userPrefs.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(globalPrefs);
        set.add(userPrefs);
    }

    public ()
    {
        super("com.google.android.apps.wallet.init.WalletInitializerTaskManager", "members/com.google.android.apps.wallet.init.WalletInitializerTaskManager", true, com/google/android/apps/wallet/init/WalletInitializerTaskManager);
    }
}
