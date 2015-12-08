// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            MyWalletModule, MyWalletManager

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding manager;
    private final MyWalletModule module;

    public final void attach(Linker linker)
    {
        manager = linker.requestBinding("com.google.android.apps.wallet.mywallet.MyWalletManager", com/google/android/apps/wallet/mywallet/MyWalletModule, getClass().getClassLoader());
    }

    public final InitializedEventPublisher get()
    {
        MyWalletModule mywalletmodule = module;
        return MyWalletModule.getInitializedEventPublishers((MyWalletManager)manager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(manager);
    }

    public (MyWalletModule mywalletmodule)
    {
        super("com.google.android.apps.wallet.eventbus.InitializedEventPublisher", false, "com.google.android.apps.wallet.mywallet.MyWalletModule", "getInitializedEventPublishers");
        module = mywalletmodule;
        setLibrary(true);
    }
}
