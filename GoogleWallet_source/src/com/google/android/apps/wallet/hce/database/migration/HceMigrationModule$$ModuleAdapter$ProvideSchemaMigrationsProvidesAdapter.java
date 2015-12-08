// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.database.migration;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.database.migration:
//            HceMigrationModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding featureManager;
    private final HceMigrationModule module;

    public final void attach(Linker linker)
    {
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/hce/database/migration/HceMigrationModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final List get()
    {
        HceMigrationModule hcemigrationmodule = module;
        return HceMigrationModule.provideSchemaMigrations((FeatureManager)featureManager.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureManager);
    }

    public (HceMigrationModule hcemigrationmodule)
    {
        super("@com.google.android.apps.wallet.hce.database.BindingAnnotations$HceSchemaMigrations()/java.util.List<com.google.android.apps.wallet.datastore.SchemaMigration>", true, "com.google.android.apps.wallet.hce.database.migration.HceMigrationModule", "provideSchemaMigrations");
        module = hcemigrationmodule;
        setLibrary(true);
    }
}
