// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.wobs.list.WoblListAdapter;
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

    private Binding fastWoblListAdapter;
    private Binding featureManager;
    private final WobsModule module;
    private Binding wobListAdapter;

    public final void attach(Linker linker)
    {
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/wobs/WobsModule, getClass().getClassLoader());
        wobListAdapter = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.wobs.WobListAdapter>", com/google/android/apps/wallet/wobs/WobsModule, getClass().getClassLoader());
        fastWoblListAdapter = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.wobs.list.FastWoblListAdapter>", com/google/android/apps/wallet/wobs/WobsModule, getClass().getClassLoader());
    }

    public final WoblListAdapter get()
    {
        WobsModule wobsmodule = module;
        return WobsModule.getWoblListAdapter((FeatureManager)featureManager.get(), (Lazy)wobListAdapter.get(), (Lazy)fastWoblListAdapter.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureManager);
        set.add(wobListAdapter);
        set.add(fastWoblListAdapter);
    }

    public (WobsModule wobsmodule)
    {
        super("com.google.android.apps.wallet.wobs.list.WoblListAdapter", false, "com.google.android.apps.wallet.wobs.WobsModule", "getWoblListAdapter");
        module = wobsmodule;
        setLibrary(true);
    }
}
