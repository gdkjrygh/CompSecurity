// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init:
//            EagerSingletonInitializer

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding globalResourcesSyncManager;
    private Binding picasso;
    private Binding walletEventLogger;

    public final void attach(Linker linker)
    {
        walletEventLogger = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.log.WalletEventLogger>", com/google/android/apps/wallet/init/EagerSingletonInitializer, getClass().getClassLoader());
        globalResourcesSyncManager = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager>", com/google/android/apps/wallet/init/EagerSingletonInitializer, getClass().getClassLoader());
        picasso = linker.requestBinding("javax.inject.Provider<com.squareup.picasso.Picasso>", com/google/android/apps/wallet/init/EagerSingletonInitializer, getClass().getClassLoader());
    }

    public final EagerSingletonInitializer get()
    {
        EagerSingletonInitializer eagersingletoninitializer = new EagerSingletonInitializer();
        injectMembers(eagersingletoninitializer);
        return eagersingletoninitializer;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(walletEventLogger);
        set1.add(globalResourcesSyncManager);
        set1.add(picasso);
    }

    public final void injectMembers(EagerSingletonInitializer eagersingletoninitializer)
    {
        eagersingletoninitializer.walletEventLogger = (Provider)walletEventLogger.get();
        eagersingletoninitializer.globalResourcesSyncManager = (Provider)globalResourcesSyncManager.get();
        eagersingletoninitializer.picasso = (Provider)picasso.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((EagerSingletonInitializer)obj);
    }

    public ()
    {
        super("com.google.android.apps.wallet.init.EagerSingletonInitializer", "members/com.google.android.apps.wallet.init.EagerSingletonInitializer", false, com/google/android/apps/wallet/init/EagerSingletonInitializer);
    }
}
