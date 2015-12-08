// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WobListAdapter

public final class  extends Binding
    implements Provider
{

    private Binding context;
    private Binding layoutMatcher;
    private Binding woblHolderProvider;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.support.v4.app.FragmentActivity", com/google/android/apps/wallet/wobs/WobListAdapter, getClass().getClassLoader());
        woblHolderProvider = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.wobs.wobl.WoblHolder>", com/google/android/apps/wallet/wobs/WobListAdapter, getClass().getClassLoader());
        layoutMatcher = linker.requestBinding("com.google.android.apps.wallet.wobs.list.LayoutMatcher", com/google/android/apps/wallet/wobs/WobListAdapter, getClass().getClassLoader());
    }

    public final WobListAdapter get()
    {
        return new WobListAdapter((FragmentActivity)context.get(), (Provider)woblHolderProvider.get(), (LayoutMatcher)layoutMatcher.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(woblHolderProvider);
        set.add(layoutMatcher);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.WobListAdapter", "members/com.google.android.apps.wallet.wobs.WobListAdapter", false, com/google/android/apps/wallet/wobs/WobListAdapter);
    }
}
