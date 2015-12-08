// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import com.mobileapptracker.MobileAppTracker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding lyftApplication;
    private Binding lyftPreferences;
    private final AnalyticsModule module;

    public void attach(Linker linker)
    {
        lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
    }

    public MobileAppTracker get()
    {
        return module.provideMobileAppTracker((LyftApplication)lyftApplication.get(), (ILyftPreferences)lyftPreferences.get());
    }

    public volatile Object get()
    {
        return get();
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApplication);
        set.add(lyftPreferences);
    }

    public (AnalyticsModule analyticsmodule)
    {
        super("com.mobileapptracker.MobileAppTracker", true, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideMobileAppTracker");
        module = analyticsmodule;
        setLibrary(true);
    }
}
