// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import android.app.Application;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.app.migration:
//            WalletDatabaseChecker

public final class  extends Binding
    implements Provider
{

    private Binding application;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/app/migration/WalletDatabaseChecker, getClass().getClassLoader());
    }

    public final WalletDatabaseChecker get()
    {
        return new WalletDatabaseChecker((Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public ()
    {
        super("com.google.android.apps.wallet.app.migration.WalletDatabaseChecker", "members/com.google.android.apps.wallet.app.migration.WalletDatabaseChecker", false, com/google/android/apps/wallet/app/migration/WalletDatabaseChecker);
    }
}
