// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordModule, IncomingMoneyRequestsManager, PurchaseRecordPublisher

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding manager;
    private final PurchaseRecordModule module;
    private Binding publisher;

    public final void attach(Linker linker)
    {
        manager = linker.requestBinding("com.google.android.apps.wallet.purchaserecord.IncomingMoneyRequestsManager", com/google/android/apps/wallet/purchaserecord/PurchaseRecordModule, getClass().getClassLoader());
        publisher = linker.requestBinding("com.google.android.apps.wallet.purchaserecord.PurchaseRecordPublisher", com/google/android/apps/wallet/purchaserecord/PurchaseRecordModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final Set get()
    {
        PurchaseRecordModule purchaserecordmodule = module;
        return PurchaseRecordModule.getInitializedEventPublishers((IncomingMoneyRequestsManager)manager.get(), (PurchaseRecordPublisher)publisher.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(manager);
        set.add(publisher);
    }

    public (PurchaseRecordModule purchaserecordmodule)
    {
        super("java.util.Set<com.google.android.apps.wallet.eventbus.InitializedEventPublisher>", false, "com.google.android.apps.wallet.purchaserecord.PurchaseRecordModule", "getInitializedEventPublishers");
        module = purchaserecordmodule;
        setLibrary(true);
    }
}
