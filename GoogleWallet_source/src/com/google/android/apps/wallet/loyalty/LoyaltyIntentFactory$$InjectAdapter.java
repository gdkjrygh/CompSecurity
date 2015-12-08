// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.app.Application;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyIntentFactory, LoyaltyCardsHandler

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding loyaltyCardsHandler;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/loyalty/LoyaltyIntentFactory, getClass().getClassLoader());
        loyaltyCardsHandler = linker.requestBinding("com.google.android.apps.wallet.loyalty.LoyaltyCardsHandler", com/google/android/apps/wallet/loyalty/LoyaltyIntentFactory, getClass().getClassLoader());
    }

    public final LoyaltyIntentFactory get()
    {
        return new LoyaltyIntentFactory((Application)application.get(), (LoyaltyCardsHandler)loyaltyCardsHandler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(loyaltyCardsHandler);
    }

    public ()
    {
        super("com.google.android.apps.wallet.loyalty.LoyaltyIntentFactory", "members/com.google.android.apps.wallet.loyalty.LoyaltyIntentFactory", false, com/google/android/apps/wallet/loyalty/LoyaltyIntentFactory);
    }
}
