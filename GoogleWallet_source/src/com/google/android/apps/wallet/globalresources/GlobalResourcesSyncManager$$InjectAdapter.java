// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.globalresources;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.eventbus.EventBus;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.globalresources:
//            GlobalResourcesSyncManager, GlobalResourceManager, MultiSyncClient

public final class  extends Binding
    implements Provider
{

    private Binding appControl;
    private Binding eventBus;
    private Binding executor;
    private Binding gcmNetworkManager;
    private Binding globalResourceManager;
    private Binding multiSyncClient;
    private Binding system;
    private Binding userPrefs;

    public final void attach(Linker linker)
    {
        globalResourceManager = linker.requestBinding("com.google.android.apps.wallet.globalresources.GlobalResourceManager", com/google/android/apps/wallet/globalresources/GlobalResourcesSyncManager, getClass().getClassLoader());
        userPrefs = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/globalresources/GlobalResourcesSyncManager, getClass().getClassLoader());
        system = linker.requestBinding("com.google.android.apps.wallet.base.java.System", com/google/android/apps/wallet/globalresources/GlobalResourcesSyncManager, getClass().getClassLoader());
        appControl = linker.requestBinding("com.google.android.apps.wallet.config.appcontrol.AppControl", com/google/android/apps/wallet/globalresources/GlobalResourcesSyncManager, getClass().getClassLoader());
        multiSyncClient = linker.requestBinding("com.google.android.apps.wallet.globalresources.MultiSyncClient", com/google/android/apps/wallet/globalresources/GlobalResourcesSyncManager, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/globalresources/GlobalResourcesSyncManager, getClass().getClassLoader());
        gcmNetworkManager = linker.requestBinding("javax.inject.Provider<com.google.android.gms.gcm.GcmNetworkManager>", com/google/android/apps/wallet/globalresources/GlobalResourcesSyncManager, getClass().getClassLoader());
        executor = linker.requestBinding("@com.google.android.apps.wallet.util.async.BindingAnnotations$Parallel()/java.util.concurrent.Executor", com/google/android/apps/wallet/globalresources/GlobalResourcesSyncManager, getClass().getClassLoader());
    }

    public final GlobalResourcesSyncManager get()
    {
        return new GlobalResourcesSyncManager((GlobalResourceManager)globalResourceManager.get(), (SharedPreferences)userPrefs.get(), (System)system.get(), (AppControl)appControl.get(), (MultiSyncClient)multiSyncClient.get(), (EventBus)eventBus.get(), (Provider)gcmNetworkManager.get(), (Executor)executor.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(globalResourceManager);
        set.add(userPrefs);
        set.add(system);
        set.add(appControl);
        set.add(multiSyncClient);
        set.add(eventBus);
        set.add(gcmNetworkManager);
        set.add(executor);
    }

    public ()
    {
        super("com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager", "members/com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager", true, com/google/android/apps/wallet/globalresources/GlobalResourcesSyncManager);
    }
}
