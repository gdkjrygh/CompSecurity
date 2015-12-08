// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.network;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.network:
//            NetworkModule, NetworkConnectivityEventPublisher

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final NetworkModule module;
    private Binding publisher;

    public final void attach(Linker linker)
    {
        publisher = linker.requestBinding("com.google.android.apps.wallet.network.NetworkConnectivityEventPublisher", com/google/android/apps/wallet/network/NetworkModule, getClass().getClassLoader());
    }

    public final InitializedEventPublisher get()
    {
        NetworkModule networkmodule = module;
        return NetworkModule.getInitializedEventPublishers((NetworkConnectivityEventPublisher)publisher.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(publisher);
    }

    public (NetworkModule networkmodule)
    {
        super("com.google.android.apps.wallet.eventbus.InitializedEventPublisher", false, "com.google.android.apps.wallet.network.NetworkModule", "getInitializedEventPublishers");
        module = networkmodule;
        setLibrary(true);
    }
}
