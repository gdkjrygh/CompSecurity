// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty.discovery;

import android.view.LayoutInflater;
import com.squareup.picasso.Picasso;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.loyalty.discovery:
//            SimplifiedLoyaltyProgramListItemBinder

public final class  extends Binding
    implements Provider
{

    private Binding layoutInflater;
    private Binding picasso;

    public final void attach(Linker linker)
    {
        layoutInflater = linker.requestBinding("android.view.LayoutInflater", com/google/android/apps/wallet/loyalty/discovery/SimplifiedLoyaltyProgramListItemBinder, getClass().getClassLoader());
        picasso = linker.requestBinding("com.squareup.picasso.Picasso", com/google/android/apps/wallet/loyalty/discovery/SimplifiedLoyaltyProgramListItemBinder, getClass().getClassLoader());
    }

    public final SimplifiedLoyaltyProgramListItemBinder get()
    {
        return new SimplifiedLoyaltyProgramListItemBinder((LayoutInflater)layoutInflater.get(), (Picasso)picasso.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(layoutInflater);
        set.add(picasso);
    }

    public ()
    {
        super("com.google.android.apps.wallet.loyalty.discovery.SimplifiedLoyaltyProgramListItemBinder", "members/com.google.android.apps.wallet.loyalty.discovery.SimplifiedLoyaltyProgramListItemBinder", false, com/google/android/apps/wallet/loyalty/discovery/SimplifiedLoyaltyProgramListItemBinder);
    }
}
