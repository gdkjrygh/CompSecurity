// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import android.support.v4.app.FragmentActivity;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            EmptyNavDrawerFilter, NavDrawerFragment

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding navDrawerFragment;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.support.v4.app.FragmentActivity", com/google/android/apps/wallet/navdrawer/EmptyNavDrawerFilter, getClass().getClassLoader());
        navDrawerFragment = linker.requestBinding("com.google.android.apps.wallet.navdrawer.NavDrawerFragment", com/google/android/apps/wallet/navdrawer/EmptyNavDrawerFilter, getClass().getClassLoader());
    }

    public final EmptyNavDrawerFilter get()
    {
        return new EmptyNavDrawerFilter((FragmentActivity)activity.get(), (NavDrawerFragment)navDrawerFragment.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(navDrawerFragment);
    }

    public ()
    {
        super("com.google.android.apps.wallet.navdrawer.EmptyNavDrawerFilter", "members/com.google.android.apps.wallet.navdrawer.EmptyNavDrawerFilter", false, com/google/android/apps/wallet/navdrawer/EmptyNavDrawerFilter);
    }
}
