// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import android.content.SharedPreferences;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.app.migration:
//            MigrationModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final MigrationModule module;
    private Binding sharedPreferences;

    public final void attach(Linker linker)
    {
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/app/migration/MigrationModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final List get()
    {
        MigrationModule migrationmodule = module;
        return MigrationModule.getSchemaMigrations((SharedPreferences)sharedPreferences.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(sharedPreferences);
    }

    public (MigrationModule migrationmodule)
    {
        super("java.util.List<com.google.android.apps.wallet.datastore.SchemaMigration>", false, "com.google.android.apps.wallet.app.migration.MigrationModule", "getSchemaMigrations");
        module = migrationmodule;
        setLibrary(true);
    }
}
