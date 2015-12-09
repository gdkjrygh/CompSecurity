// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce;

import android.content.pm.PackageManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce:
//            WalletHceModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final WalletHceModule module;
    private Binding packageManager;

    public final void attach(Linker linker)
    {
        packageManager = linker.requestBinding("android.content.pm.PackageManager", com/google/android/apps/wallet/hce/WalletHceModule, getClass().getClassLoader());
    }

    public final Boolean get()
    {
        WalletHceModule wallethcemodule = module;
        return WalletHceModule.getIsHceSupported((PackageManager)packageManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(packageManager);
    }

    public (WalletHceModule wallethcemodule)
    {
        super("@com.google.android.apps.wallet.config.featurecontrol.FeatureQualifier(value=NFC_HCE_PPMS)/java.lang.Boolean", true, "com.google.android.apps.wallet.hce.WalletHceModule", "getIsHceSupported");
        module = wallethcemodule;
        setLibrary(true);
    }
}
