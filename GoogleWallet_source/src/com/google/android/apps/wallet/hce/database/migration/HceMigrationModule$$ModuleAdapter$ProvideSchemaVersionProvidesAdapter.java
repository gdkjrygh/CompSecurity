// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.database.migration;

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

    private Binding migrations;
    private final HceMigrationModule module;

    public final void attach(Linker linker)
    {
        migrations = linker.requestBinding("@com.google.android.apps.wallet.hce.database.BindingAnnotations$HceSchemaMigrations()/java.util.List<com.google.android.apps.wallet.datastore.SchemaMigration>", com/google/android/apps/wallet/hce/database/migration/HceMigrationModule, getClass().getClassLoader());
    }

    public final Integer get()
    {
        HceMigrationModule hcemigrationmodule = module;
        return Integer.valueOf(HceMigrationModule.provideSchemaVersion((List)migrations.get()));
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(migrations);
    }

    public _81_(HceMigrationModule hcemigrationmodule)
    {
        super("@com.google.android.apps.wallet.hce.database.BindingAnnotations$HceDatabaseVersion()/java.lang.Integer", false, "com.google.android.apps.wallet.hce.database.migration.HceMigrationModule", "provideSchemaVersion");
        module = hcemigrationmodule;
        setLibrary(true);
    }
}
