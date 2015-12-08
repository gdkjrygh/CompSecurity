// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.promoted;

import com.soundcloud.android.analytics.EventTracker;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics.promoted:
//            PromotedAnalyticsProvider

public final class  extends b
    implements Provider
{

    private b eventTracker;

    public final void attach(l l1)
    {
        eventTracker = l1.a("com.soundcloud.android.analytics.EventTracker", com/soundcloud/android/analytics/promoted/PromotedAnalyticsProvider, getClass().getClassLoader());
    }

    public final PromotedAnalyticsProvider get()
    {
        return new PromotedAnalyticsProvider((EventTracker)eventTracker.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventTracker);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.promoted.PromotedAnalyticsProvider", "members/com.soundcloud.android.analytics.promoted.PromotedAnalyticsProvider", false, com/soundcloud/android/analytics/promoted/PromotedAnalyticsProvider);
    }
}
