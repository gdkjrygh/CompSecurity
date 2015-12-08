// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.app.Activity;
import com.google.android.apps.wallet.util.date.DateAndTimeHelper;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordListItemBinder

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding dateAndTimeHelper;
    private Binding layoutMatcher;
    private Binding woblHolderProvider;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/purchaserecord/PurchaseRecordListItemBinder, getClass().getClassLoader());
        woblHolderProvider = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.wobs.wobl.WoblHolder>", com/google/android/apps/wallet/purchaserecord/PurchaseRecordListItemBinder, getClass().getClassLoader());
        layoutMatcher = linker.requestBinding("com.google.android.apps.wallet.wobs.list.LayoutMatcher", com/google/android/apps/wallet/purchaserecord/PurchaseRecordListItemBinder, getClass().getClassLoader());
        dateAndTimeHelper = linker.requestBinding("com.google.android.apps.wallet.util.date.DateAndTimeHelper", com/google/android/apps/wallet/purchaserecord/PurchaseRecordListItemBinder, getClass().getClassLoader());
    }

    public final PurchaseRecordListItemBinder get()
    {
        return new PurchaseRecordListItemBinder((Activity)activity.get(), (Provider)woblHolderProvider.get(), (LayoutMatcher)layoutMatcher.get(), (DateAndTimeHelper)dateAndTimeHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(woblHolderProvider);
        set.add(layoutMatcher);
        set.add(dateAndTimeHelper);
    }

    public ()
    {
        super("com.google.android.apps.wallet.purchaserecord.PurchaseRecordListItemBinder", "members/com.google.android.apps.wallet.purchaserecord.PurchaseRecordListItemBinder", false, com/google/android/apps/wallet/purchaserecord/PurchaseRecordListItemBinder);
    }
}
