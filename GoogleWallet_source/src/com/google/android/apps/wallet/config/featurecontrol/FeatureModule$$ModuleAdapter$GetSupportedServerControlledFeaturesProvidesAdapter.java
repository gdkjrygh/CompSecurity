// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import android.app.Application;
import com.google.common.collect.ImmutableSet;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            FeatureModule, FeatureStateEvaluator

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private Binding evaluator;
    private final FeatureModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/config/featurecontrol/FeatureModule, getClass().getClassLoader());
        evaluator = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureStateEvaluator", com/google/android/apps/wallet/config/featurecontrol/FeatureModule, getClass().getClassLoader());
    }

    public final ImmutableSet get()
    {
        FeatureModule featuremodule = module;
        return FeatureModule.getSupportedServerControlledFeatures((Application)application.get(), (FeatureStateEvaluator)evaluator.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(evaluator);
    }

    public (FeatureModule featuremodule)
    {
        super("@com.google.android.apps.wallet.config.featurecontrol.BindingAnnotations$SupportedServerControlledFeatures()/com.google.common.collect.ImmutableSet<com.google.android.apps.wallet.config.featurecontrol.Feature>", true, "com.google.android.apps.wallet.config.featurecontrol.FeatureModule", "getSupportedServerControlledFeatures");
        module = featuremodule;
        setLibrary(true);
    }
}
