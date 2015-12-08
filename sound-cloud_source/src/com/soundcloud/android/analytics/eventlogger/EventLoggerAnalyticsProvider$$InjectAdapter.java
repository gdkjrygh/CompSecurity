// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.eventlogger;

import android.content.SharedPreferences;
import com.soundcloud.android.analytics.EventTracker;
import com.soundcloud.android.properties.FeatureFlags;
import dagger.Lazy;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics.eventlogger:
//            EventLoggerAnalyticsProvider

public final class  extends b
    implements Provider
{

    private b dataBuilderV0;
    private b dataBuilderV1;
    private b eventTracker;
    private b featureFlags;
    private b sharedPreferences;

    public final void attach(l l1)
    {
        eventTracker = l1.a("com.soundcloud.android.analytics.EventTracker", com/soundcloud/android/analytics/eventlogger/EventLoggerAnalyticsProvider, getClass().getClassLoader());
        dataBuilderV0 = l1.a("dagger.Lazy<com.soundcloud.android.analytics.eventlogger.EventLoggerJsonDataBuilder>", com/soundcloud/android/analytics/eventlogger/EventLoggerAnalyticsProvider, getClass().getClassLoader());
        dataBuilderV1 = l1.a("dagger.Lazy<com.soundcloud.android.analytics.eventlogger.EventLoggerV1JsonDataBuilder>", com/soundcloud/android/analytics/eventlogger/EventLoggerAnalyticsProvider, getClass().getClassLoader());
        sharedPreferences = l1.a("android.content.SharedPreferences", com/soundcloud/android/analytics/eventlogger/EventLoggerAnalyticsProvider, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/analytics/eventlogger/EventLoggerAnalyticsProvider, getClass().getClassLoader());
    }

    public final EventLoggerAnalyticsProvider get()
    {
        return new EventLoggerAnalyticsProvider((EventTracker)eventTracker.get(), (Lazy)dataBuilderV0.get(), (Lazy)dataBuilderV1.get(), (SharedPreferences)sharedPreferences.get(), (FeatureFlags)featureFlags.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventTracker);
        set.add(dataBuilderV0);
        set.add(dataBuilderV1);
        set.add(sharedPreferences);
        set.add(featureFlags);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.eventlogger.EventLoggerAnalyticsProvider", "members/com.soundcloud.android.analytics.eventlogger.EventLoggerAnalyticsProvider", false, com/soundcloud/android/analytics/eventlogger/EventLoggerAnalyticsProvider);
    }
}
