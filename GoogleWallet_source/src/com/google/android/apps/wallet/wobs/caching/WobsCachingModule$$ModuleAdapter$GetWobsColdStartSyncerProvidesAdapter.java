// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import com.google.android.apps.wallet.wobs.api.WobsColdStartSyncer;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobsCachingModule, WobsManager

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final WobsCachingModule module;
    private Binding wobsManager;

    public final void attach(Linker linker)
    {
        wobsManager = linker.requestBinding("com.google.android.apps.wallet.wobs.caching.WobsManager", com/google/android/apps/wallet/wobs/caching/WobsCachingModule, getClass().getClassLoader());
    }

    public final WobsColdStartSyncer get()
    {
        WobsCachingModule wobscachingmodule = module;
        return WobsCachingModule.getWobsColdStartSyncer((WobsManager)wobsManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(wobsManager);
    }

    public (WobsCachingModule wobscachingmodule)
    {
        super("com.google.android.apps.wallet.wobs.api.WobsColdStartSyncer", false, "com.google.android.apps.wallet.wobs.caching.WobsCachingModule", "getWobsColdStartSyncer");
        module = wobscachingmodule;
        setLibrary(true);
    }
}
