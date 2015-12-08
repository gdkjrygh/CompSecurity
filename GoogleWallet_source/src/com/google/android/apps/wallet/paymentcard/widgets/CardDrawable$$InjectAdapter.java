// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.widgets;

import android.content.res.Resources;
import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.widgets:
//            CardDrawable

public final class  extends Binding
    implements Provider
{

    private Binding picasso;
    private Binding resources;

    public final void attach(Linker linker)
    {
        resources = linker.requestBinding("android.content.res.Resources", com/google/android/apps/wallet/paymentcard/widgets/CardDrawable, getClass().getClassLoader());
        picasso = linker.requestBinding("dagger.Lazy<com.squareup.picasso.Picasso>", com/google/android/apps/wallet/paymentcard/widgets/CardDrawable, getClass().getClassLoader());
    }

    public final CardDrawable get()
    {
        return new CardDrawable((Resources)resources.get(), (Lazy)picasso.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(picasso);
    }

    public ()
    {
        super("com.google.android.apps.wallet.paymentcard.widgets.CardDrawable", "members/com.google.android.apps.wallet.paymentcard.widgets.CardDrawable", false, com/google/android/apps/wallet/paymentcard/widgets/CardDrawable);
    }
}
