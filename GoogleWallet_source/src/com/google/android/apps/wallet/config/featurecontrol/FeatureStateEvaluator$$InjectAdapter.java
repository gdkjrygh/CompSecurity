// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            FeatureStateEvaluator, FeatureSet

public final class  extends Binding
    implements Provider
{

    private Binding featureSet;

    public final void attach(Linker linker)
    {
        featureSet = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureSet", com/google/android/apps/wallet/config/featurecontrol/FeatureStateEvaluator, getClass().getClassLoader());
    }

    public final FeatureStateEvaluator get()
    {
        return new FeatureStateEvaluator((FeatureSet)featureSet.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureSet);
    }

    public ()
    {
        super("com.google.android.apps.wallet.config.featurecontrol.FeatureStateEvaluator", "members/com.google.android.apps.wallet.config.featurecontrol.FeatureStateEvaluator", false, com/google/android/apps/wallet/config/featurecontrol/FeatureStateEvaluator);
    }
}
