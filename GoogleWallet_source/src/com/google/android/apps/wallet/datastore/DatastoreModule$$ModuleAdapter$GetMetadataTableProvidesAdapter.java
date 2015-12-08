// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.datastore;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.datastore:
//            DatastoreModule, WalletDatabaseHelper, KeyValueStore

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding dbHelper;
    private final DatastoreModule module;

    public final void attach(Linker linker)
    {
        dbHelper = linker.requestBinding("com.google.android.apps.wallet.datastore.WalletDatabaseHelper", com/google/android/apps/wallet/datastore/DatastoreModule, getClass().getClassLoader());
    }

    public final KeyValueStore get()
    {
        DatastoreModule datastoremodule = module;
        return DatastoreModule.getMetadataTable((WalletDatabaseHelper)dbHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(dbHelper);
    }

    public (DatastoreModule datastoremodule)
    {
        super("@com.google.android.apps.wallet.datastore.BindingAnnotations$DatabaseTable(value=METADATA)/com.google.android.apps.wallet.datastore.KeyValueStore", false, "com.google.android.apps.wallet.datastore.DatastoreModule", "getMetadataTable");
        module = datastoremodule;
        setLibrary(true);
    }
}
