// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import com.google.android.apps.wallet.datastore.KeyValueStore;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            MyWalletStorageManager

public final class  extends Binding
    implements Provider
{

    private Binding keyValueStore;

    public final void attach(Linker linker)
    {
        keyValueStore = linker.requestBinding("@com.google.android.apps.wallet.datastore.BindingAnnotations$DatabaseTable(value=METADATA)/com.google.android.apps.wallet.datastore.KeyValueStore", com/google/android/apps/wallet/mywallet/MyWalletStorageManager, getClass().getClassLoader());
    }

    public final MyWalletStorageManager get()
    {
        return new MyWalletStorageManager((KeyValueStore)keyValueStore.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(keyValueStore);
    }

    public ()
    {
        super("com.google.android.apps.wallet.mywallet.MyWalletStorageManager", "members/com.google.android.apps.wallet.mywallet.MyWalletStorageManager", false, com/google/android/apps/wallet/mywallet/MyWalletStorageManager);
    }
}
