// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.network;

import android.app.Application;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.network:
//            NetworkConnectivityEventPublisher, NetworkInformationProvider

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding application;
    private Binding eventBus;
    private Binding networkInformationProvider;
    private Binding threadChecker;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/network/NetworkConnectivityEventPublisher, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/network/NetworkConnectivityEventPublisher, getClass().getClassLoader());
        threadChecker = linker.requestBinding("com.google.android.apps.wallet.util.async.ThreadChecker", com/google/android/apps/wallet/network/NetworkConnectivityEventPublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/network/NetworkConnectivityEventPublisher, getClass().getClassLoader());
        networkInformationProvider = linker.requestBinding("com.google.android.apps.wallet.network.NetworkInformationProvider", com/google/android/apps/wallet/network/NetworkConnectivityEventPublisher, getClass().getClassLoader());
    }

    public final NetworkConnectivityEventPublisher get()
    {
        return new NetworkConnectivityEventPublisher((Application)application.get(), (EventBus)eventBus.get(), (ThreadChecker)threadChecker.get(), (ActionExecutor)actionExecutor.get(), (NetworkInformationProvider)networkInformationProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(eventBus);
        set.add(threadChecker);
        set.add(actionExecutor);
        set.add(networkInformationProvider);
    }

    public ()
    {
        super("com.google.android.apps.wallet.network.NetworkConnectivityEventPublisher", "members/com.google.android.apps.wallet.network.NetworkConnectivityEventPublisher", true, com/google/android/apps/wallet/network/NetworkConnectivityEventPublisher);
    }
}
