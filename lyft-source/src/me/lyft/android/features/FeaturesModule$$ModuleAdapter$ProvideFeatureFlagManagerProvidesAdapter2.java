// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.features;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android.features:
//            FeaturesModule, IFeatureFlagOverrideStorage, IFeatureFlagsManager

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final FeaturesModule module;
    private Binding storage;

    public void attach(Linker linker)
    {
        storage = linker.requestBinding("me.lyft.android.features.IFeatureFlagOverrideStorage", me/lyft/android/features/FeaturesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IFeatureFlagsManager get()
    {
        return module.provideFeatureFlagManager((IFeatureFlagOverrideStorage)storage.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(storage);
    }

    public (FeaturesModule featuresmodule)
    {
        super("me.lyft.android.features.IFeatureFlagsManager", true, "me.lyft.android.features.FeaturesModule", "provideFeatureFlagManager");
        module = featuresmodule;
        setLibrary(true);
    }
}
