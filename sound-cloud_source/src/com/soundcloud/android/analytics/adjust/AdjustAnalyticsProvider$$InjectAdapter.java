// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.adjust;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics.adjust:
//            AdjustAnalyticsProvider, AdjustWrapper

public final class  extends b
    implements Provider
{

    private b adjustWrapper;

    public final void attach(l l1)
    {
        adjustWrapper = l1.a("com.soundcloud.android.analytics.adjust.AdjustWrapper", com/soundcloud/android/analytics/adjust/AdjustAnalyticsProvider, getClass().getClassLoader());
    }

    public final AdjustAnalyticsProvider get()
    {
        return new AdjustAnalyticsProvider((AdjustWrapper)adjustWrapper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(adjustWrapper);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.adjust.AdjustAnalyticsProvider", "members/com.soundcloud.android.analytics.adjust.AdjustAnalyticsProvider", false, com/soundcloud/android/analytics/adjust/AdjustAnalyticsProvider);
    }
}
