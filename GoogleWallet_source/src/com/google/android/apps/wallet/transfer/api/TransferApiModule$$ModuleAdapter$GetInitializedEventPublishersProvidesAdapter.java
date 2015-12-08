// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.api;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.transfer.api:
//            TransferApiModule, FundsTransferInfoPublisher

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final TransferApiModule module;
    private Binding publisher;

    public final void attach(Linker linker)
    {
        publisher = linker.requestBinding("com.google.android.apps.wallet.transfer.api.FundsTransferInfoPublisher", com/google/android/apps/wallet/transfer/api/TransferApiModule, getClass().getClassLoader());
    }

    public final InitializedEventPublisher get()
    {
        TransferApiModule transferapimodule = module;
        return TransferApiModule.getInitializedEventPublishers((FundsTransferInfoPublisher)publisher.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(publisher);
    }

    public (TransferApiModule transferapimodule)
    {
        super("com.google.android.apps.wallet.eventbus.InitializedEventPublisher", false, "com.google.android.apps.wallet.transfer.api.TransferApiModule", "getInitializedEventPublishers");
        module = transferapimodule;
        setLibrary(true);
    }
}
