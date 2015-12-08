// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding;

import android.support.v4.app.FragmentActivity;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.funding:
//            FundingSourceListItemBinder

public final class  extends Binding
    implements Provider
{

    private Binding context;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.support.v4.app.FragmentActivity", com/google/android/apps/wallet/funding/FundingSourceListItemBinder, getClass().getClassLoader());
    }

    public final FundingSourceListItemBinder get()
    {
        return new FundingSourceListItemBinder((FragmentActivity)context.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
    }

    public ()
    {
        super("com.google.android.apps.wallet.funding.FundingSourceListItemBinder", "members/com.google.android.apps.wallet.funding.FundingSourceListItemBinder", false, com/google/android/apps/wallet/funding/FundingSourceListItemBinder);
    }
}
