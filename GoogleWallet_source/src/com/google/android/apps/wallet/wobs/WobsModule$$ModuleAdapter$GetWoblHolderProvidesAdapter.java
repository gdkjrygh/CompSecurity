// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.wobs.wobl.WoblHolder;
import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WobsModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding featureManager;
    private final WobsModule module;
    private Binding protoWoblHolder;
    private Binding woblHolderImpl;

    public final void attach(Linker linker)
    {
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/wobs/WobsModule, getClass().getClassLoader());
        woblHolderImpl = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.wobs.WoblHolderImpl>", com/google/android/apps/wallet/wobs/WobsModule, getClass().getClassLoader());
        protoWoblHolder = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.wobs.ProtoWoblHolder>", com/google/android/apps/wallet/wobs/WobsModule, getClass().getClassLoader());
    }

    public final WoblHolder get()
    {
        WobsModule wobsmodule = module;
        return WobsModule.getWoblHolder((FeatureManager)featureManager.get(), (Lazy)woblHolderImpl.get(), (Lazy)protoWoblHolder.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureManager);
        set.add(woblHolderImpl);
        set.add(protoWoblHolder);
    }

    public (WobsModule wobsmodule)
    {
        super("com.google.android.apps.wallet.wobs.wobl.WoblHolder", false, "com.google.android.apps.wallet.wobs.WobsModule", "getWoblHolder");
        module = wobsmodule;
        setLibrary(true);
    }
}
