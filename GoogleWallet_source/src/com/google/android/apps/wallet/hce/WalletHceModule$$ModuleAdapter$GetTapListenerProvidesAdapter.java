// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce;

import com.google.android.apps.wallet.hce.tap.TapListener;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce:
//            WalletHceModule, WalletHceTapListener

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding listener;
    private final WalletHceModule module;

    public final void attach(Linker linker)
    {
        listener = linker.requestBinding("com.google.android.apps.wallet.hce.WalletHceTapListener", com/google/android/apps/wallet/hce/WalletHceModule, getClass().getClassLoader());
    }

    public final TapListener get()
    {
        WalletHceModule wallethcemodule = module;
        return WalletHceModule.getTapListener((WalletHceTapListener)listener.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(listener);
    }

    public (WalletHceModule wallethcemodule)
    {
        super("com.google.android.apps.wallet.hce.tap.TapListener", false, "com.google.android.apps.wallet.hce.WalletHceModule", "getTapListener");
        module = wallethcemodule;
        setLibrary(true);
    }
}
