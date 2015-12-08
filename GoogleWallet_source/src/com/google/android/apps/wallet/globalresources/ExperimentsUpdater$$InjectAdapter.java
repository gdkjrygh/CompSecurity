// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.globalresources;

import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.globalresources:
//            ExperimentsUpdater

public final class  extends Binding
    implements Provider
{

    private Binding analyticsUtil;
    private Binding globalResourceManager;

    public final void attach(Linker linker)
    {
        globalResourceManager = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.globalresources.GlobalResourceManager>", com/google/android/apps/wallet/globalresources/ExperimentsUpdater, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/globalresources/ExperimentsUpdater, getClass().getClassLoader());
    }

    public final ExperimentsUpdater get()
    {
        return new ExperimentsUpdater((Lazy)globalResourceManager.get(), (AnalyticsUtil)analyticsUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(globalResourceManager);
        set.add(analyticsUtil);
    }

    public ()
    {
        super("com.google.android.apps.wallet.globalresources.ExperimentsUpdater", "members/com.google.android.apps.wallet.globalresources.ExperimentsUpdater", false, com/google/android/apps/wallet/globalresources/ExperimentsUpdater);
    }
}
