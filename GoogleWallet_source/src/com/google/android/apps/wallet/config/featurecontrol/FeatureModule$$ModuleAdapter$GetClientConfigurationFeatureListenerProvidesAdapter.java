// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import com.google.android.apps.wallet.eventbus.EventBus;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            FeatureModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding eventBus;
    private final FeatureModule module;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/config/featurecontrol/FeatureModule, getClass().getClassLoader());
    }

    public final com.google.android.apps.wallet.config.clientconfig.r get()
    {
        FeatureModule featuremodule = module;
        return FeatureModule.getClientConfigurationFeatureListener((EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
    }

    public (FeatureModule featuremodule)
    {
        super("com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager$ClientConfigurationFeatureListener", true, "com.google.android.apps.wallet.config.featurecontrol.FeatureModule", "getClientConfigurationFeatureListener");
        module = featuremodule;
        setLibrary(true);
    }
}
