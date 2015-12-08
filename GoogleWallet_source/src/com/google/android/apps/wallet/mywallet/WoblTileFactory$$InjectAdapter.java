// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import android.app.Activity;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.android.apps.wallet.wobs.wobl.WoblHolder;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            WoblTileFactory

public final class  extends Binding
    implements Provider
{

    private Binding analyticsUtil;
    private Binding context;
    private Binding layoutMatcher;
    private Binding woblHolder;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/mywallet/WoblTileFactory, getClass().getClassLoader());
        woblHolder = linker.requestBinding("com.google.android.apps.wallet.wobs.wobl.WoblHolder", com/google/android/apps/wallet/mywallet/WoblTileFactory, getClass().getClassLoader());
        layoutMatcher = linker.requestBinding("com.google.android.apps.wallet.wobs.list.LayoutMatcher", com/google/android/apps/wallet/mywallet/WoblTileFactory, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/mywallet/WoblTileFactory, getClass().getClassLoader());
    }

    public final WoblTileFactory get()
    {
        return new WoblTileFactory((Activity)context.get(), (WoblHolder)woblHolder.get(), (LayoutMatcher)layoutMatcher.get(), (AnalyticsUtil)analyticsUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(woblHolder);
        set.add(layoutMatcher);
        set.add(analyticsUtil);
    }

    public ()
    {
        super("com.google.android.apps.wallet.mywallet.WoblTileFactory", "members/com.google.android.apps.wallet.mywallet.WoblTileFactory", false, com/google/android/apps/wallet/mywallet/WoblTileFactory);
    }
}
