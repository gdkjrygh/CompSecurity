// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.c.a.t;
import com.soundcloud.android.utils.DeviceHelper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics:
//            SimpleTrackingApi

public final class  extends b
    implements Provider
{

    private b deviceHelper;
    private b httpClient;

    public final void attach(l l1)
    {
        httpClient = l1.a("com.squareup.okhttp.OkHttpClient", com/soundcloud/android/analytics/SimpleTrackingApi, getClass().getClassLoader());
        deviceHelper = l1.a("com.soundcloud.android.utils.DeviceHelper", com/soundcloud/android/analytics/SimpleTrackingApi, getClass().getClassLoader());
    }

    public final SimpleTrackingApi get()
    {
        return new SimpleTrackingApi((t)httpClient.get(), (DeviceHelper)deviceHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(httpClient);
        set.add(deviceHelper);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.SimpleTrackingApi", "members/com.soundcloud.android.analytics.SimpleTrackingApi", false, com/soundcloud/android/analytics/SimpleTrackingApi);
    }
}
