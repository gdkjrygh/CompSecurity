// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsModule, MixpanelWrapper, RedshiftEventTracker

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding mixpanelWrapper;
    private final AnalyticsModule module;

    public void attach(Linker linker)
    {
        mixpanelWrapper = linker.requestBinding("me.lyft.android.analytics.trackers.MixpanelWrapper", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public RedshiftEventTracker get()
    {
        return module.provideRedshiftEventTracker((MixpanelWrapper)mixpanelWrapper.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(mixpanelWrapper);
    }

    public (AnalyticsModule analyticsmodule)
    {
        super("me.lyft.android.analytics.trackers.RedshiftEventTracker", false, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideRedshiftEventTracker");
        module = analyticsmodule;
        setLibrary(true);
    }
}
