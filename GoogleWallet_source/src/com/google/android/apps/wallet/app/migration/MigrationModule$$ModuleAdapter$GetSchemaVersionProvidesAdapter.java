// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.app.migration:
//            MigrationModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final MigrationModule module;

    public final Integer get()
    {
        MigrationModule migrationmodule = module;
        return Integer.valueOf(MigrationModule.getSchemaVersion());
    }

    public final volatile Object get()
    {
        return get();
    }

    public q(MigrationModule migrationmodule)
    {
        super("@com.google.android.apps.wallet.datastore.BindingAnnotations$DatabaseVersion()/java.lang.Integer", false, "com.google.android.apps.wallet.app.migration.MigrationModule", "getSchemaVersion");
        module = migrationmodule;
        setLibrary(true);
    }
}
