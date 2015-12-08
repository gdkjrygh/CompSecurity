// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import com.google.android.apps.wallet.base.java.System;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.log:
//            WalletEventLogger, EventLogDataStore

public final class I extends Binding
    implements Provider
{

    private Binding eventLogDataStore;
    private Binding executor;
    private Binding gcmNetworkManager;
    private Binding isUploadPending;
    private Binding queue;
    private Binding system;
    private Binding versionName;

    public final void attach(Linker linker)
    {
        eventLogDataStore = linker.requestBinding("com.google.android.apps.wallet.log.EventLogDataStore", com/google/android/apps/wallet/log/WalletEventLogger, getClass().getClassLoader());
        system = linker.requestBinding("com.google.android.apps.wallet.base.java.System", com/google/android/apps/wallet/log/WalletEventLogger, getClass().getClassLoader());
        executor = linker.requestBinding("@com.google.android.apps.wallet.log.api.BindingAnnotations$WalletEventLogExecutor()/java.util.concurrent.Executor", com/google/android/apps/wallet/log/WalletEventLogger, getClass().getClassLoader());
        queue = linker.requestBinding("java.util.concurrent.BlockingQueue<com.google.wallet.proto.NanoWalletLogging$WalletEventLog>", com/google/android/apps/wallet/log/WalletEventLogger, getClass().getClassLoader());
        isUploadPending = linker.requestBinding("@com.google.android.apps.wallet.log.api.BindingAnnotations$IsEventLogUploadPending()/java.util.concurrent.atomic.AtomicBoolean", com/google/android/apps/wallet/log/WalletEventLogger, getClass().getClassLoader());
        gcmNetworkManager = linker.requestBinding("javax.inject.Provider<com.google.android.gms.gcm.GcmNetworkManager>", com/google/android/apps/wallet/log/WalletEventLogger, getClass().getClassLoader());
        versionName = linker.requestBinding("@com.google.android.apps.wallet.util.version.BindingAnnotations$VersionName()/java.lang.String", com/google/android/apps/wallet/log/WalletEventLogger, getClass().getClassLoader());
    }

    public final WalletEventLogger get()
    {
        return new WalletEventLogger((EventLogDataStore)eventLogDataStore.get(), (System)system.get(), (Executor)executor.get(), (BlockingQueue)queue.get(), (AtomicBoolean)isUploadPending.get(), (Provider)gcmNetworkManager.get(), (String)versionName.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventLogDataStore);
        set.add(system);
        set.add(executor);
        set.add(queue);
        set.add(isUploadPending);
        set.add(gcmNetworkManager);
        set.add(versionName);
    }

    public I()
    {
        super("com.google.android.apps.wallet.log.WalletEventLogger", "members/com.google.android.apps.wallet.log.WalletEventLogger", true, com/google/android/apps/wallet/log/WalletEventLogger);
    }
}
