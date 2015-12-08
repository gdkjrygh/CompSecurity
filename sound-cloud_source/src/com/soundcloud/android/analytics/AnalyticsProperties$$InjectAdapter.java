// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.content.res.Resources;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics:
//            AnalyticsProperties

public final class I extends b
    implements Provider
{

    private b resources;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/analytics/AnalyticsProperties, getClass().getClassLoader());
    }

    public final AnalyticsProperties get()
    {
        return new AnalyticsProperties((Resources)resources.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
    }

    public I()
    {
        super("com.soundcloud.android.analytics.AnalyticsProperties", "members/com.soundcloud.android.analytics.AnalyticsProperties", false, com/soundcloud/android/analytics/AnalyticsProperties);
    }
}
