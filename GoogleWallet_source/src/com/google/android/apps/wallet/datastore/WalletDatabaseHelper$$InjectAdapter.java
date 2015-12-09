// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.datastore;

import android.app.Application;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.datastore:
//            WalletDatabaseHelper

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding databaseName;
    private Binding databaseVersion;
    private Binding migrations;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/datastore/WalletDatabaseHelper, getClass().getClassLoader());
        databaseName = linker.requestBinding("@com.google.android.apps.wallet.datastore.BindingAnnotations$DatabaseName()/java.lang.String", com/google/android/apps/wallet/datastore/WalletDatabaseHelper, getClass().getClassLoader());
        databaseVersion = linker.requestBinding("@com.google.android.apps.wallet.datastore.BindingAnnotations$DatabaseVersion()/java.lang.Integer", com/google/android/apps/wallet/datastore/WalletDatabaseHelper, getClass().getClassLoader());
        migrations = linker.requestBinding("java.util.List<com.google.android.apps.wallet.datastore.SchemaMigration>", com/google/android/apps/wallet/datastore/WalletDatabaseHelper, getClass().getClassLoader());
    }

    public final WalletDatabaseHelper get()
    {
        return new WalletDatabaseHelper((Application)application.get(), (String)databaseName.get(), ((Integer)databaseVersion.get()).intValue(), (List)migrations.get());
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
        super("com.google.android.apps.wallet.datastore.WalletDatabaseHelper", "members/com.google.android.apps.wallet.datastore.WalletDatabaseHelper", true, com/google/android/apps/wallet/datastore/WalletDatabaseHelper);
    }
}
