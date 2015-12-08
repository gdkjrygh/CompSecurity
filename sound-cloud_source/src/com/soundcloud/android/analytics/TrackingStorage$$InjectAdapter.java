// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.propeller.PropellerDatabase;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics:
//            TrackingStorage

public final class  extends b
    implements Provider
{

    private b networkConnectionHelper;
    private b propeller;

    public final void attach(l l1)
    {
        propeller = l1.a("@javax.inject.Named(value=TrackingDB)/com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/analytics/TrackingStorage, getClass().getClassLoader());
        networkConnectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/analytics/TrackingStorage, getClass().getClassLoader());
    }

    public final TrackingStorage get()
    {
        return new TrackingStorage((PropellerDatabase)propeller.get(), (NetworkConnectionHelper)networkConnectionHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set.add(networkConnectionHelper);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.TrackingStorage", "members/com.soundcloud.android.analytics.TrackingStorage", false, com/soundcloud/android/analytics/TrackingStorage);
    }
}
