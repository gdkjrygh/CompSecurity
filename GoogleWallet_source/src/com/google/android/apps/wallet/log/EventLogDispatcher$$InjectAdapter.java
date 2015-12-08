// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.rpc.RpcCaller;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.log:
//            EventLogDispatcher, EventLogDataStore

public final class  extends Binding
    implements Provider
{

    private Binding eventLogDataStore;
    private Binding isUploadPending;
    private Binding rpcCaller;
    private Binding system;

    public final void attach(Linker linker)
    {
        eventLogDataStore = linker.requestBinding("com.google.android.apps.wallet.log.EventLogDataStore", com/google/android/apps/wallet/log/EventLogDispatcher, getClass().getClassLoader());
        rpcCaller = linker.requestBinding("com.google.android.apps.wallet.rpc.RpcCaller", com/google/android/apps/wallet/log/EventLogDispatcher, getClass().getClassLoader());
        system = linker.requestBinding("com.google.android.apps.wallet.base.java.System", com/google/android/apps/wallet/log/EventLogDispatcher, getClass().getClassLoader());
        isUploadPending = linker.requestBinding("@com.google.android.apps.wallet.log.api.BindingAnnotations$IsEventLogUploadPending()/java.util.concurrent.atomic.AtomicBoolean", com/google/android/apps/wallet/log/EventLogDispatcher, getClass().getClassLoader());
    }

    public final EventLogDispatcher get()
    {
        return new EventLogDispatcher((EventLogDataStore)eventLogDataStore.get(), (RpcCaller)rpcCaller.get(), (System)system.get(), (AtomicBoolean)isUploadPending.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventLogDataStore);
        set.add(rpcCaller);
        set.add(system);
        set.add(isUploadPending);
    }

    public ()
    {
        super("com.google.android.apps.wallet.log.EventLogDispatcher", "members/com.google.android.apps.wallet.log.EventLogDispatcher", true, com/google/android/apps/wallet/log/EventLogDispatcher);
    }
}
