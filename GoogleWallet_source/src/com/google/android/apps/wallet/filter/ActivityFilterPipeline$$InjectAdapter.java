// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.filter;

import com.google.common.collect.ListMultimap;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.filter:
//            ActivityFilterPipeline

public final class Q extends Binding
    implements Provider
{

    private Binding activityFilters;

    public final void attach(Linker linker)
    {
        activityFilters = linker.requestBinding("com.google.common.collect.ListMultimap<java.lang.String, com.google.android.apps.wallet.filter.ActivityFilter>", com/google/android/apps/wallet/filter/ActivityFilterPipeline, getClass().getClassLoader());
    }

    public final ActivityFilterPipeline get()
    {
        return new ActivityFilterPipeline((ListMultimap)activityFilters.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activityFilters);
    }

    public Q()
    {
        super("com.google.android.apps.wallet.filter.ActivityFilterPipeline", "members/com.google.android.apps.wallet.filter.ActivityFilterPipeline", false, com/google/android/apps/wallet/filter/ActivityFilterPipeline);
    }
}
