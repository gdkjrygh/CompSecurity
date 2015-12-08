// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init:
//            CombinedSyncTask

public final class I extends Binding
    implements Provider
{

    private Binding executor;
    private Binding globalResourcesSyncManager;
    private Binding wobsColdStartSyncer;

    public final void attach(Linker linker)
    {
        globalResourcesSyncManager = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager>", com/google/android/apps/wallet/init/CombinedSyncTask, getClass().getClassLoader());
        wobsColdStartSyncer = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.wobs.api.WobsColdStartSyncer>", com/google/android/apps/wallet/init/CombinedSyncTask, getClass().getClassLoader());
        executor = linker.requestBinding("@com.google.android.apps.wallet.util.async.BindingAnnotations$Parallel()/java.util.concurrent.Executor", com/google/android/apps/wallet/init/CombinedSyncTask, getClass().getClassLoader());
    }

    public final CombinedSyncTask get()
    {
        return new CombinedSyncTask((Lazy)globalResourcesSyncManager.get(), (Lazy)wobsColdStartSyncer.get(), (Executor)executor.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(globalResourcesSyncManager);
        set.add(wobsColdStartSyncer);
        set.add(executor);
    }

    public I()
    {
        super("com.google.android.apps.wallet.init.CombinedSyncTask", "members/com.google.android.apps.wallet.init.CombinedSyncTask", false, com/google/android/apps/wallet/init/CombinedSyncTask);
    }
}
