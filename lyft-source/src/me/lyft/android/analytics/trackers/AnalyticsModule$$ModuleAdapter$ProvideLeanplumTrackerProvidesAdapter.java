// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsModule, LeanplumTracker

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final AnalyticsModule module;

    public volatile Object get()
    {
        return get();
    }

    public LeanplumTracker get()
    {
        return module.provideLeanplumTracker();
    }

    public (AnalyticsModule analyticsmodule)
    {
        super("me.lyft.android.analytics.trackers.LeanplumTracker", false, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideLeanplumTracker");
        module = analyticsmodule;
        setLibrary(true);
    }
}
