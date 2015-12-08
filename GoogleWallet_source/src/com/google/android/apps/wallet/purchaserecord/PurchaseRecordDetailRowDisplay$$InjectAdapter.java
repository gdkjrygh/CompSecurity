// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.app.Activity;
import android.view.LayoutInflater;
import com.google.android.apps.wallet.util.date.DateAndTimeHelper;
import com.squareup.picasso.Picasso;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailRowDisplay

public final class a extends Binding
    implements Provider
{

    private Binding activity;
    private Binding dateAndTimeHelper;
    private Binding layoutInflater;
    private Binding picasso;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/purchaserecord/PurchaseRecordDetailRowDisplay, getClass().getClassLoader());
        layoutInflater = linker.requestBinding("android.view.LayoutInflater", com/google/android/apps/wallet/purchaserecord/PurchaseRecordDetailRowDisplay, getClass().getClassLoader());
        picasso = linker.requestBinding("com.squareup.picasso.Picasso", com/google/android/apps/wallet/purchaserecord/PurchaseRecordDetailRowDisplay, getClass().getClassLoader());
        dateAndTimeHelper = linker.requestBinding("com.google.android.apps.wallet.util.date.DateAndTimeHelper", com/google/android/apps/wallet/purchaserecord/PurchaseRecordDetailRowDisplay, getClass().getClassLoader());
    }

    public final PurchaseRecordDetailRowDisplay get()
    {
        return new PurchaseRecordDetailRowDisplay((Activity)activity.get(), (LayoutInflater)layoutInflater.get(), (Picasso)picasso.get(), (DateAndTimeHelper)dateAndTimeHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(layoutInflater);
        set.add(picasso);
        set.add(dateAndTimeHelper);
    }

    public a()
    {
        super("com.google.android.apps.wallet.purchaserecord.PurchaseRecordDetailRowDisplay", "members/com.google.android.apps.wallet.purchaserecord.PurchaseRecordDetailRowDisplay", false, com/google/android/apps/wallet/purchaserecord/PurchaseRecordDetailRowDisplay);
    }
}
