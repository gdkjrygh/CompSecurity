// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue.api;

import com.google.android.apps.wallet.datastore.KeyValueStore;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.storedvalue.api:
//            StoredValueRpcCache, StoredValueClient

public final class  extends Binding
    implements Provider
{

    private Binding keyValueStore;
    private Binding storedValueClient;

    public final void attach(Linker linker)
    {
        storedValueClient = linker.requestBinding("com.google.android.apps.wallet.storedvalue.api.StoredValueClient", com/google/android/apps/wallet/storedvalue/api/StoredValueRpcCache, getClass().getClassLoader());
        keyValueStore = linker.requestBinding("@com.google.android.apps.wallet.datastore.BindingAnnotations$DatabaseTable(value=METADATA)/com.google.android.apps.wallet.datastore.KeyValueStore", com/google/android/apps/wallet/storedvalue/api/StoredValueRpcCache, getClass().getClassLoader());
    }

    public final StoredValueRpcCache get()
    {
        return new StoredValueRpcCache((StoredValueClient)storedValueClient.get(), (KeyValueStore)keyValueStore.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(storedValueClient);
        set.add(keyValueStore);
    }

    public ()
    {
        super("com.google.android.apps.wallet.storedvalue.api.StoredValueRpcCache", "members/com.google.android.apps.wallet.storedvalue.api.StoredValueRpcCache", false, com/google/android/apps/wallet/storedvalue/api/StoredValueRpcCache);
    }
}
