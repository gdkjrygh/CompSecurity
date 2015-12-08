// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.content.SharedPreferences;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics:
//            AnalyticsEngine, AnalyticsProviderFactory

public final class  extends b
    implements Provider
{

    private b analyticsProviderFactory;
    private b eventBus;
    private b sharedPreferences;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/analytics/AnalyticsEngine, getClass().getClassLoader());
        sharedPreferences = l1.a("android.content.SharedPreferences", com/soundcloud/android/analytics/AnalyticsEngine, getClass().getClassLoader());
        analyticsProviderFactory = l1.a("com.soundcloud.android.analytics.AnalyticsProviderFactory", com/soundcloud/android/analytics/AnalyticsEngine, getClass().getClassLoader());
    }

    public final AnalyticsEngine get()
    {
        return new AnalyticsEngine((EventBus)eventBus.get(), (SharedPreferences)sharedPreferences.get(), (AnalyticsProviderFactory)analyticsProviderFactory.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(sharedPreferences);
        set.add(analyticsProviderFactory);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.AnalyticsEngine", "members/com.soundcloud.android.analytics.AnalyticsEngine", true, com/soundcloud/android/analytics/AnalyticsEngine);
    }
}
