// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.app.Activity;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            DividedPurchaseRecordAdapterWrapper

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding fastWoblListAdapterProvider;
    private Binding headedListAdapterBuilder;
    private Binding layoutMatcher;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/purchaserecord/DividedPurchaseRecordAdapterWrapper, getClass().getClassLoader());
        layoutMatcher = linker.requestBinding("com.google.android.apps.wallet.wobs.list.LayoutMatcher", com/google/android/apps/wallet/purchaserecord/DividedPurchaseRecordAdapterWrapper, getClass().getClassLoader());
        fastWoblListAdapterProvider = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.wobs.list.FastWoblListAdapter>", com/google/android/apps/wallet/purchaserecord/DividedPurchaseRecordAdapterWrapper, getClass().getClassLoader());
        headedListAdapterBuilder = linker.requestBinding("com.google.android.apps.wallet.widgets.list.HeadedListAdapter$Builder", com/google/android/apps/wallet/purchaserecord/DividedPurchaseRecordAdapterWrapper, getClass().getClassLoader());
    }

    public final DividedPurchaseRecordAdapterWrapper get()
    {
        return new DividedPurchaseRecordAdapterWrapper((Activity)activity.get(), (LayoutMatcher)layoutMatcher.get(), (Provider)fastWoblListAdapterProvider.get(), (com.google.android.apps.wallet.widgets.list.r.fastWoblListAdapterProvider)headedListAdapterBuilder.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(layoutMatcher);
        set.add(fastWoblListAdapterProvider);
        set.add(headedListAdapterBuilder);
    }

    public ()
    {
        super("com.google.android.apps.wallet.purchaserecord.DividedPurchaseRecordAdapterWrapper", "members/com.google.android.apps.wallet.purchaserecord.DividedPurchaseRecordAdapterWrapper", false, com/google/android/apps/wallet/purchaserecord/DividedPurchaseRecordAdapterWrapper);
    }
}
