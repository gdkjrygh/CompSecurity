// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.android.utils.NetworkConnectionHelper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics:
//            TrackingHandlerFactory, TrackingStorage, TrackingApiFactory

public final class  extends b
    implements Provider
{

    private b networkConnectionHelper;
    private b storage;
    private b trackingApiFactory;

    public final void attach(l l1)
    {
        networkConnectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/analytics/TrackingHandlerFactory, getClass().getClassLoader());
        storage = l1.a("com.soundcloud.android.analytics.TrackingStorage", com/soundcloud/android/analytics/TrackingHandlerFactory, getClass().getClassLoader());
        trackingApiFactory = l1.a("com.soundcloud.android.analytics.TrackingApiFactory", com/soundcloud/android/analytics/TrackingHandlerFactory, getClass().getClassLoader());
    }

    public final TrackingHandlerFactory get()
    {
        return new TrackingHandlerFactory((NetworkConnectionHelper)networkConnectionHelper.get(), (TrackingStorage)storage.get(), (TrackingApiFactory)trackingApiFactory.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(networkConnectionHelper);
        set.add(storage);
        set.add(trackingApiFactory);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.TrackingHandlerFactory", "members/com.soundcloud.android.analytics.TrackingHandlerFactory", false, com/soundcloud/android/analytics/TrackingHandlerFactory);
    }
}
