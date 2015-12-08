// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;

import com.google.android.apps.wallet.datastore.WalletDatabaseHelper;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.provider:
//            WobInstanceProtoEntityManager

public final class  extends Binding
    implements Provider
{

    private Binding dbHelper;

    public final void attach(Linker linker)
    {
        dbHelper = linker.requestBinding("com.google.android.apps.wallet.datastore.WalletDatabaseHelper", com/google/android/apps/wallet/wobs/provider/WobInstanceProtoEntityManager, getClass().getClassLoader());
    }

    public final WobInstanceProtoEntityManager get()
    {
        return new WobInstanceProtoEntityManager((WalletDatabaseHelper)dbHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(dbHelper);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.provider.WobInstanceProtoEntityManager", "members/com.google.android.apps.wallet.wobs.provider.WobInstanceProtoEntityManager", false, com/google/android/apps/wallet/wobs/provider/WobInstanceProtoEntityManager);
    }
}
