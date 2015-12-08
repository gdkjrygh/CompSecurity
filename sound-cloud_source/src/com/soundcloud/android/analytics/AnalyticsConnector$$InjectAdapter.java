// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.android.analytics.appboy.AppboyWrapper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics:
//            AnalyticsConnector

public final class  extends b
    implements a, Provider
{

    private b appboy;
    private b supertype;

    public final void attach(l l1)
    {
        appboy = l1.a("com.soundcloud.android.analytics.appboy.AppboyWrapper", com/soundcloud/android/analytics/AnalyticsConnector, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/analytics/AnalyticsConnector, getClass().getClassLoader(), false);
    }

    public final AnalyticsConnector get()
    {
        AnalyticsConnector analyticsconnector = new AnalyticsConnector((AppboyWrapper)appboy.get());
        injectMembers(analyticsconnector);
        return analyticsconnector;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(appboy);
        set1.add(supertype);
    }

    public final void injectMembers(AnalyticsConnector analyticsconnector)
    {
        supertype.injectMembers(analyticsconnector);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AnalyticsConnector)obj);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.AnalyticsConnector", "members/com.soundcloud.android.analytics.AnalyticsConnector", false, com/soundcloud/android/analytics/AnalyticsConnector);
    }
}
