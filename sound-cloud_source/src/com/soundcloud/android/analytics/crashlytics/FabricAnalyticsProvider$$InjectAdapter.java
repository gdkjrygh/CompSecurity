// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.crashlytics;

import com.soundcloud.android.properties.ApplicationProperties;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics.crashlytics:
//            FabricAnalyticsProvider

public final class Y extends b
    implements Provider
{

    private b applicationProperties;

    public final void attach(l l1)
    {
        applicationProperties = l1.a("com.soundcloud.android.properties.ApplicationProperties", com/soundcloud/android/analytics/crashlytics/FabricAnalyticsProvider, getClass().getClassLoader());
    }

    public final FabricAnalyticsProvider get()
    {
        return new FabricAnalyticsProvider((ApplicationProperties)applicationProperties.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(applicationProperties);
    }

    public Y()
    {
        super("com.soundcloud.android.analytics.crashlytics.FabricAnalyticsProvider", "members/com.soundcloud.android.analytics.crashlytics.FabricAnalyticsProvider", false, com/soundcloud/android/analytics/crashlytics/FabricAnalyticsProvider);
    }
}
