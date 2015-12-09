// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init:
//            InitializerModule, WalletInitializerTaskManager, InitializerTaskManager

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final InitializerModule module;
    private Binding walletInitializerTaskManager;

    public final void attach(Linker linker)
    {
        walletInitializerTaskManager = linker.requestBinding("com.google.android.apps.wallet.init.WalletInitializerTaskManager", com/google/android/apps/wallet/init/InitializerModule, getClass().getClassLoader());
    }

    public final InitializerTaskManager get()
    {
        InitializerModule initializermodule = module;
        return InitializerModule.getInitializerTaskManager((WalletInitializerTaskManager)walletInitializerTaskManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(walletInitializerTaskManager);
    }

    public (InitializerModule initializermodule)
    {
        super("com.google.android.apps.wallet.init.InitializerTaskManager", false, "com.google.android.apps.wallet.init.InitializerModule", "getInitializerTaskManager");
        module = initializermodule;
        setLibrary(true);
    }
}
