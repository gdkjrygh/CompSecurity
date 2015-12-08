// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import com.soundcloud.android.analytics.AnalyticsConnector;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.main:
//            TrackedActivity, ActivityLifeCyclePublisher

public final class  extends b
    implements a
{

    private b analyticsConnector;
    private b lifeCyclePublisher;
    private b supertype;

    public final void attach(l l1)
    {
        lifeCyclePublisher = l1.a("com.soundcloud.android.main.ActivityLifeCyclePublisher", com/soundcloud/android/main/TrackedActivity, getClass().getClassLoader());
        analyticsConnector = l1.a("com.soundcloud.android.analytics.AnalyticsConnector", com/soundcloud/android/main/TrackedActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleAppCompatActivity", com/soundcloud/android/main/TrackedActivity, getClass().getClassLoader(), false);
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(lifeCyclePublisher);
        set1.add(analyticsConnector);
        set1.add(supertype);
    }

    public final void injectMembers(TrackedActivity trackedactivity)
    {
        trackedactivity.lifeCyclePublisher = (ActivityLifeCyclePublisher)lifeCyclePublisher.get();
        trackedactivity.analyticsConnector = (AnalyticsConnector)analyticsConnector.get();
        supertype.injectMembers(trackedactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((TrackedActivity)obj);
    }

    public ()
    {
        super(null, "members/com.soundcloud.android.main.TrackedActivity", false, com/soundcloud/android/main/TrackedActivity);
    }
}
