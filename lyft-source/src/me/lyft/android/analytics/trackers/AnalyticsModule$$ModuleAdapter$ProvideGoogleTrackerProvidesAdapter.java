// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsModule, GoogleEventTracker

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding lyftApplication;
    private final AnalyticsModule module;

    public void attach(Linker linker)
    {
        lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public GoogleEventTracker get()
    {
        return module.provideGoogleTracker((LyftApplication)lyftApplication.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApplication);
    }

    public (AnalyticsModule analyticsmodule)
    {
        super("me.lyft.android.analytics.trackers.GoogleEventTracker", false, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideGoogleTracker");
        module = analyticsmodule;
        setLibrary(true);
    }
}
