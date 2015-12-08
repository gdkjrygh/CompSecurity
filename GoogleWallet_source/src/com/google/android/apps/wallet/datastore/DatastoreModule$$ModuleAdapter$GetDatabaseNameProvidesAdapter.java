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
//            DatastoreModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding accountName;
    private final DatastoreModule module;

    public final void attach(Linker linker)
    {
        accountName = linker.requestBinding("@com.google.android.apps.wallet.userscope.api.BindingAnnotations$AccountName()/java.lang.String", com/google/android/apps/wallet/datastore/DatastoreModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final String get()
    {
        DatastoreModule datastoremodule = module;
        return DatastoreModule.getDatabaseName((String)accountName.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(accountName);
    }

    public (DatastoreModule datastoremodule)
    {
        super("@com.google.android.apps.wallet.datastore.BindingAnnotations$DatabaseName()/java.lang.String", false, "com.google.android.apps.wallet.datastore.DatastoreModule", "getDatabaseName");
        module = datastoremodule;
        setLibrary(true);
    }
}
