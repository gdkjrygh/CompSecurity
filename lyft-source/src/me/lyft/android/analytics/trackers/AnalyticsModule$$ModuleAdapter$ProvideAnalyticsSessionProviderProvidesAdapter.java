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
import me.lyft.android.analytics.session.AnalyticsSession;
import me.lyft.android.infrastructure.device.IDevice;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding device;
    private Binding lyftPreferences;
    private final AnalyticsModule module;

    public void attach(Linker linker)
    {
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public AnalyticsSession get()
    {
        return module.provideAnalyticsSessionProvider((ILyftPreferences)lyftPreferences.get(), (IDevice)device.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftPreferences);
        set.add(device);
    }

    public (AnalyticsModule analyticsmodule)
    {
        super("me.lyft.android.analytics.session.AnalyticsSession", true, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideAnalyticsSessionProvider");
        module = analyticsmodule;
        setLibrary(true);
    }
}
