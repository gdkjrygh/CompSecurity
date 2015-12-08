// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.settings:
//            UserSettingsPublisher, ActionQueue, UserSettingsStorageManager

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding eventBus;
    private Binding pendingUpdateRequestQueue;
    private Binding rpcCaller;
    private Binding userSettingsStorageManager;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/settings/UserSettingsPublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/settings/UserSettingsPublisher, getClass().getClassLoader());
        rpcCaller = linker.requestBinding("com.google.android.apps.wallet.rpc.RpcCaller", com/google/android/apps/wallet/settings/UserSettingsPublisher, getClass().getClassLoader());
        pendingUpdateRequestQueue = linker.requestBinding("com.google.android.apps.wallet.settings.ActionQueue<com.google.wallet.proto.api.NanoWalletSettings$FetchSettingsResponse>", com/google/android/apps/wallet/settings/UserSettingsPublisher, getClass().getClassLoader());
        userSettingsStorageManager = linker.requestBinding("com.google.android.apps.wallet.settings.UserSettingsStorageManager", com/google/android/apps/wallet/settings/UserSettingsPublisher, getClass().getClassLoader());
    }

    public final UserSettingsPublisher get()
    {
        return new UserSettingsPublisher((EventBus)eventBus.get(), (ActionExecutor)actionExecutor.get(), (RpcCaller)rpcCaller.get(), (ActionQueue)pendingUpdateRequestQueue.get(), (UserSettingsStorageManager)userSettingsStorageManager.get());
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
        set.add(pendingUpdateRequestQueue);
        set.add(userSettingsStorageManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.settings.UserSettingsPublisher", "members/com.google.android.apps.wallet.settings.UserSettingsPublisher", true, com/google/android/apps/wallet/settings/UserSettingsPublisher);
    }
}
