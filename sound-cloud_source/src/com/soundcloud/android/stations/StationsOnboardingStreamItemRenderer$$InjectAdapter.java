// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.properties.FeatureFlags;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsOnboardingStreamItemRenderer

public final class Y extends b
    implements Provider
{

    private b featureFlags;

    public final void attach(l l1)
    {
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/stations/StationsOnboardingStreamItemRenderer, getClass().getClassLoader());
    }

    public final StationsOnboardingStreamItemRenderer get()
    {
        return new StationsOnboardingStreamItemRenderer((FeatureFlags)featureFlags.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureFlags);
    }

    public Y()
    {
        super("com.soundcloud.android.stations.StationsOnboardingStreamItemRenderer", "members/com.soundcloud.android.stations.StationsOnboardingStreamItemRenderer", false, com/soundcloud/android/stations/StationsOnboardingStreamItemRenderer);
    }
}
