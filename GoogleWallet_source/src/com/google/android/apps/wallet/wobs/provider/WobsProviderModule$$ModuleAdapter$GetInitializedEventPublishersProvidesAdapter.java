// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.provider:
//            WobsProviderModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final WobsProviderModule module;
    private Binding syncWobsStatusPublisher;

    public final void attach(Linker linker)
    {
        syncWobsStatusPublisher = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.wobs.provider.SyncWobsStatusPublisher>", com/google/android/apps/wallet/wobs/provider/WobsProviderModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final Set get()
    {
        WobsProviderModule wobsprovidermodule = module;
        return WobsProviderModule.getInitializedEventPublishers((Provider)syncWobsStatusPublisher.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(syncWobsStatusPublisher);
    }

    public _81_(WobsProviderModule wobsprovidermodule)
    {
        super("java.util.Set<com.google.android.apps.wallet.eventbus.InitializedEventPublisher>", false, "com.google.android.apps.wallet.wobs.provider.WobsProviderModule", "getInitializedEventPublishers");
        module = wobsprovidermodule;
        setLibrary(true);
    }
}
