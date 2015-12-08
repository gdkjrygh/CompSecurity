// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import android.app.Application;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            ApplicationScopedFeatureModule, FeatureSet

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private final ApplicationScopedFeatureModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/config/featurecontrol/ApplicationScopedFeatureModule, getClass().getClassLoader());
    }

    public final FeatureSet get()
    {
        ApplicationScopedFeatureModule applicationscopedfeaturemodule = module;
        return ApplicationScopedFeatureModule.providesFeatureSet((Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public (ApplicationScopedFeatureModule applicationscopedfeaturemodule)
    {
        super("com.google.android.apps.wallet.config.featurecontrol.FeatureSet", true, "com.google.android.apps.wallet.config.featurecontrol.ApplicationScopedFeatureModule", "providesFeatureSet");
        module = applicationscopedfeaturemodule;
        setLibrary(true);
    }
}
