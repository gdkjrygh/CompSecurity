// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import android.app.Activity;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            RestrictedFeatureFilter, FeatureManager

public final class a extends Binding
    implements Provider
{

    private Binding activity;
    private Binding featureManager;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/config/featurecontrol/RestrictedFeatureFilter, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/config/featurecontrol/RestrictedFeatureFilter, getClass().getClassLoader());
    }

    public final RestrictedFeatureFilter get()
    {
        return new RestrictedFeatureFilter((Activity)activity.get(), (FeatureManager)featureManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(featureManager);
    }

    public a()
    {
        super("com.google.android.apps.wallet.config.featurecontrol.RestrictedFeatureFilter", "members/com.google.android.apps.wallet.config.featurecontrol.RestrictedFeatureFilter", false, com/google/android/apps/wallet/config/featurecontrol/RestrictedFeatureFilter);
    }
}
