// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager;
import com.google.common.collect.ImmutableSet;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            FeatureManager, FeatureStateEvaluator

public final class  extends Binding
    implements Provider
{

    private Binding clientConfigurationManager;
    private Binding featureStateEvaluator;
    private Binding supportedServerControlledFeatures;

    public final void attach(Linker linker)
    {
        clientConfigurationManager = linker.requestBinding("com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager", com/google/android/apps/wallet/config/featurecontrol/FeatureManager, getClass().getClassLoader());
        featureStateEvaluator = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureStateEvaluator", com/google/android/apps/wallet/config/featurecontrol/FeatureManager, getClass().getClassLoader());
        supportedServerControlledFeatures = linker.requestBinding("@com.google.android.apps.wallet.config.featurecontrol.BindingAnnotations$SupportedServerControlledFeatures()/com.google.common.collect.ImmutableSet<com.google.android.apps.wallet.config.featurecontrol.Feature>", com/google/android/apps/wallet/config/featurecontrol/FeatureManager, getClass().getClassLoader());
    }

    public final FeatureManager get()
    {
        return new FeatureManager((ClientConfigurationManager)clientConfigurationManager.get(), (FeatureStateEvaluator)featureStateEvaluator.get(), (ImmutableSet)supportedServerControlledFeatures.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(clientConfigurationManager);
        set.add(featureStateEvaluator);
        set.add(supportedServerControlledFeatures);
    }

    public ()
    {
        super("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", "members/com.google.android.apps.wallet.config.featurecontrol.FeatureManager", true, com/google/android/apps/wallet/config/featurecontrol/FeatureManager);
    }
}
