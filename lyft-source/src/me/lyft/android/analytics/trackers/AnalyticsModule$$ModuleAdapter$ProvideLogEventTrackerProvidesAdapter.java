// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsModule, LogEventTracker

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final AnalyticsModule module;

    public volatile Object get()
    {
        return get();
    }

    public LogEventTracker get()
    {
        return module.provideLogEventTracker();
    }

    public (AnalyticsModule analyticsmodule)
    {
        super("me.lyft.android.analytics.trackers.LogEventTracker", false, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideLogEventTracker");
        module = analyticsmodule;
        setLibrary(true);
    }
}
