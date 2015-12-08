// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import com.google.android.apps.wallet.datastore.WalletDatabaseHelper;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobDatastore

public final class  extends Binding
    implements Provider
{

    private Binding databaseHelper;

    public final void attach(Linker linker)
    {
        databaseHelper = linker.requestBinding("com.google.android.apps.wallet.datastore.WalletDatabaseHelper", com/google/android/apps/wallet/wobs/caching/WobDatastore, getClass().getClassLoader());
    }

    public final WobDatastore get()
    {
        return new WobDatastore((WalletDatabaseHelper)databaseHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(databaseHelper);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.caching.WobDatastore", "members/com.google.android.apps.wallet.wobs.caching.WobDatastore", false, com/google/android/apps/wallet/wobs/caching/WobDatastore);
    }
}
