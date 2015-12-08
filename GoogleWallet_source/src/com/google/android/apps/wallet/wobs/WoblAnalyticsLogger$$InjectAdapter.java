// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WoblAnalyticsLogger

public final class  extends Binding
    implements Provider
{

    private Binding analyticsUtil;

    public final void attach(Linker linker)
    {
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/wobs/WoblAnalyticsLogger, getClass().getClassLoader());
    }

    public final WoblAnalyticsLogger get()
    {
        return new WoblAnalyticsLogger((AnalyticsUtil)analyticsUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(analyticsUtil);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.WoblAnalyticsLogger", "members/com.google.android.apps.wallet.wobs.WoblAnalyticsLogger", false, com/google/android/apps/wallet/wobs/WoblAnalyticsLogger);
    }
}
