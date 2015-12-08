// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.view.LayoutInflater;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            AddLoyaltyProgramHeaderBinder

public final class Y extends Binding
    implements Provider
{

    private Binding layoutInflater;

    public final void attach(Linker linker)
    {
        layoutInflater = linker.requestBinding("android.view.LayoutInflater", com/google/android/apps/wallet/loyalty/AddLoyaltyProgramHeaderBinder, getClass().getClassLoader());
    }

    public final AddLoyaltyProgramHeaderBinder get()
    {
        return new AddLoyaltyProgramHeaderBinder((LayoutInflater)layoutInflater.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(layoutInflater);
    }

    public Y()
    {
        super("com.google.android.apps.wallet.loyalty.AddLoyaltyProgramHeaderBinder", "members/com.google.android.apps.wallet.loyalty.AddLoyaltyProgramHeaderBinder", false, com/google/android/apps/wallet/loyalty/AddLoyaltyProgramHeaderBinder);
    }
}
