// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.features;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.features:
//            FeaturesModule, IFeatureFlagOverrideStorage

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding context;
    private final FeaturesModule module;

    public void attach(Linker linker)
    {
        context = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/features/FeaturesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IFeatureFlagOverrideStorage get()
    {
        return module.provideFeatureFlagManager((LyftApplication)context.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(context);
    }

    public (FeaturesModule featuresmodule)
    {
        super("me.lyft.android.features.IFeatureFlagOverrideStorage", true, "me.lyft.android.features.FeaturesModule", "provideFeatureFlagManager");
        module = featuresmodule;
        setLibrary(true);
    }
}
