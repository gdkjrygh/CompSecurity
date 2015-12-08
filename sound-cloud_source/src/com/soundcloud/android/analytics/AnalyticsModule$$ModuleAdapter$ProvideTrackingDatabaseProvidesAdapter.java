// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.propeller.PropellerDatabase;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics:
//            AnalyticsModule, TrackingDbHelper

public static final class setLibrary extends t
    implements Provider
{

    private b dbHelper;
    private final AnalyticsModule module;

    public final void attach(l l1)
    {
        dbHelper = l1.a("com.soundcloud.android.analytics.TrackingDbHelper", com/soundcloud/android/analytics/AnalyticsModule, getClass().getClassLoader());
    }

    public final PropellerDatabase get()
    {
        return module.provideTrackingDatabase((TrackingDbHelper)dbHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(dbHelper);
    }

    public (AnalyticsModule analyticsmodule)
    {
        super("@javax.inject.Named(value=TrackingDB)/com.soundcloud.propeller.PropellerDatabase", false, "com.soundcloud.android.analytics.AnalyticsModule", "provideTrackingDatabase");
        module = analyticsmodule;
        setLibrary(false);
    }
}
