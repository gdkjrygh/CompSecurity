// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsModule, AnalyticsApi

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding appContext;
    private Binding lyftPreferences;
    private final AnalyticsModule module;

    public void attach(Linker linker)
    {
        appContext = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public AnalyticsApi get()
    {
        return module.provideAnalyticsApi((LyftApplication)appContext.get(), (ILyftPreferences)lyftPreferences.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(appContext);
        set.add(lyftPreferences);
    }

    public (AnalyticsModule analyticsmodule)
    {
        super("me.lyft.android.analytics.trackers.AnalyticsApi", true, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideAnalyticsApi");
        module = analyticsmodule;
        setLibrary(true);
    }
}
