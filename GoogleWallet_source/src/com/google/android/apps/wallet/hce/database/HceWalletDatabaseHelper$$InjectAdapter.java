// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.database;

import android.app.Application;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.database:
//            HceWalletDatabaseHelper

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding databaseName;
    private Binding databaseVersion;
    private Binding migrations;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/hce/database/HceWalletDatabaseHelper, getClass().getClassLoader());
        databaseName = linker.requestBinding("@com.google.android.apps.wallet.hce.database.BindingAnnotations$HceDatabaseName()/java.lang.String", com/google/android/apps/wallet/hce/database/HceWalletDatabaseHelper, getClass().getClassLoader());
        databaseVersion = linker.requestBinding("@com.google.android.apps.wallet.hce.database.BindingAnnotations$HceDatabaseVersion()/java.lang.Integer", com/google/android/apps/wallet/hce/database/HceWalletDatabaseHelper, getClass().getClassLoader());
        migrations = linker.requestBinding("@com.google.android.apps.wallet.hce.database.BindingAnnotations$HceSchemaMigrations()/java.util.List<com.google.android.apps.wallet.datastore.SchemaMigration>", com/google/android/apps/wallet/hce/database/HceWalletDatabaseHelper, getClass().getClassLoader());
    }

    public final HceWalletDatabaseHelper get()
    {
        return new HceWalletDatabaseHelper((Application)application.get(), (String)databaseName.get(), ((Integer)databaseVersion.get()).intValue(), (List)migrations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(databaseName);
        set.add(databaseVersion);
        set.add(migrations);
    }

    public ()
    {
        super("com.google.android.apps.wallet.hce.database.HceWalletDatabaseHelper", "members/com.google.android.apps.wallet.hce.database.HceWalletDatabaseHelper", true, com/google/android/apps/wallet/hce/database/HceWalletDatabaseHelper);
    }
}
