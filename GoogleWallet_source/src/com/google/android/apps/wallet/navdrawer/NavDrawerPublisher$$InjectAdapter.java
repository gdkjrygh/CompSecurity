// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerPublisher, NavigationStorageManager

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding eventBus;
    private Binding rpcCaller;
    private Binding storageManager;
    private Binding system;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/navdrawer/NavDrawerPublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/navdrawer/NavDrawerPublisher, getClass().getClassLoader());
        rpcCaller = linker.requestBinding("com.google.android.apps.wallet.rpc.RpcCaller", com/google/android/apps/wallet/navdrawer/NavDrawerPublisher, getClass().getClassLoader());
        storageManager = linker.requestBinding("com.google.android.apps.wallet.navdrawer.NavigationStorageManager", com/google/android/apps/wallet/navdrawer/NavDrawerPublisher, getClass().getClassLoader());
        system = linker.requestBinding("com.google.android.apps.wallet.base.java.System", com/google/android/apps/wallet/navdrawer/NavDrawerPublisher, getClass().getClassLoader());
    }

    public final NavDrawerPublisher get()
    {
        return new NavDrawerPublisher((EventBus)eventBus.get(), (ActionExecutor)actionExecutor.get(), (RpcCaller)rpcCaller.get(), (NavigationStorageManager)storageManager.get(), (System)system.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(actionExecutor);
        set.add(rpcCaller);
        set.add(storageManager);
        set.add(system);
    }

    public ()
    {
        super("com.google.android.apps.wallet.navdrawer.NavDrawerPublisher", "members/com.google.android.apps.wallet.navdrawer.NavDrawerPublisher", true, com/google/android/apps/wallet/navdrawer/NavDrawerPublisher);
    }
}
