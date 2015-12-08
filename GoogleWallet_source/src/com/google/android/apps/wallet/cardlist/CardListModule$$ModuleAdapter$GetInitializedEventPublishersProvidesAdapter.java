// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.cardlist:
//            CardListModule, PaymentCardModelPublisher

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final CardListModule module;
    private Binding provider;

    public final void attach(Linker linker)
    {
        provider = linker.requestBinding("com.google.android.apps.wallet.cardlist.PaymentCardModelPublisher", com/google/android/apps/wallet/cardlist/CardListModule, getClass().getClassLoader());
    }

    public final InitializedEventPublisher get()
    {
        CardListModule cardlistmodule = module;
        return CardListModule.getInitializedEventPublishers((PaymentCardModelPublisher)provider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(provider);
    }

    public (CardListModule cardlistmodule)
    {
        super("com.google.android.apps.wallet.eventbus.InitializedEventPublisher", false, "com.google.android.apps.wallet.cardlist.CardListModule", "getInitializedEventPublishers");
        module = cardlistmodule;
        setLibrary(true);
    }
}
