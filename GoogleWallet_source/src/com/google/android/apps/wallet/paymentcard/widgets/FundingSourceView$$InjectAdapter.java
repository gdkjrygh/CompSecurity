// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.widgets;

import android.content.Context;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.widgets:
//            FundingSourceView, CardDrawable

public final class Y extends Binding
    implements Provider
{

    private Binding cardDrawable;
    private Binding context;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("@com.google.android.apps.common.inject.annotation.ActivityContext()/android.content.Context", com/google/android/apps/wallet/paymentcard/widgets/FundingSourceView, getClass().getClassLoader());
        cardDrawable = linker.requestBinding("com.google.android.apps.wallet.paymentcard.widgets.CardDrawable", com/google/android/apps/wallet/paymentcard/widgets/FundingSourceView, getClass().getClassLoader());
    }

    public final FundingSourceView get()
    {
        return new FundingSourceView((Context)context.get(), (CardDrawable)cardDrawable.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(cardDrawable);
    }

    public Y()
    {
        super("com.google.android.apps.wallet.paymentcard.widgets.FundingSourceView", "members/com.google.android.apps.wallet.paymentcard.widgets.FundingSourceView", false, com/google/android/apps/wallet/paymentcard/widgets/FundingSourceView);
    }
}
