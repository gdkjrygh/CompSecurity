// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.playcounts;

import com.soundcloud.android.analytics.EventTracker;
import com.soundcloud.android.properties.FeatureFlags;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics.playcounts:
//            PlayCountAnalyticsProvider, PlayCountUrlBuilder

public final class  extends b
    implements Provider
{

    private b eventTracker;
    private b featureFlags;
    private b urlBuilder;

    public final void attach(l l1)
    {
        eventTracker = l1.a("com.soundcloud.android.analytics.EventTracker", com/soundcloud/android/analytics/playcounts/PlayCountAnalyticsProvider, getClass().getClassLoader());
        urlBuilder = l1.a("com.soundcloud.android.analytics.playcounts.PlayCountUrlBuilder", com/soundcloud/android/analytics/playcounts/PlayCountAnalyticsProvider, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/analytics/playcounts/PlayCountAnalyticsProvider, getClass().getClassLoader());
    }

    public final PlayCountAnalyticsProvider get()
    {
        return new PlayCountAnalyticsProvider((EventTracker)eventTracker.get(), (PlayCountUrlBuilder)urlBuilder.get(), (FeatureFlags)featureFlags.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventTracker);
        set.add(urlBuilder);
        set.add(featureFlags);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.playcounts.PlayCountAnalyticsProvider", "members/com.soundcloud.android.analytics.playcounts.PlayCountAnalyticsProvider", false, com/soundcloud/android/analytics/playcounts/PlayCountAnalyticsProvider);
    }
}
