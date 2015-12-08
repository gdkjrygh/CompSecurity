// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.content.res.Resources;
import com.c.a.t;
import com.soundcloud.android.utils.DeviceHelper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics:
//            TrackingApiFactory

public final class  extends b
    implements Provider
{

    private b deviceHelper;
    private b httpClient;
    private b resources;

    public final void attach(l l1)
    {
        httpClient = l1.a("com.squareup.okhttp.OkHttpClient", com/soundcloud/android/analytics/TrackingApiFactory, getClass().getClassLoader());
        deviceHelper = l1.a("com.soundcloud.android.utils.DeviceHelper", com/soundcloud/android/analytics/TrackingApiFactory, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/analytics/TrackingApiFactory, getClass().getClassLoader());
    }

    public final TrackingApiFactory get()
    {
        return new TrackingApiFactory((t)httpClient.get(), (DeviceHelper)deviceHelper.get(), (Resources)resources.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(httpClient);
        set.add(deviceHelper);
        set.add(resources);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.TrackingApiFactory", "members/com.soundcloud.android.analytics.TrackingApiFactory", false, com/soundcloud/android/analytics/TrackingApiFactory);
    }
}
