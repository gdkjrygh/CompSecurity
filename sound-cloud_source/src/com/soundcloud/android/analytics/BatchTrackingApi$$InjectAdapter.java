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
//            BatchTrackingApi

public final class  extends b
    implements Provider
{

    private b batchSize;
    private b batchUrl;
    private b deviceHelper;
    private b httpClient;

    public final void attach(l l1)
    {
        httpClient = l1.a("com.squareup.okhttp.OkHttpClient", com/soundcloud/android/analytics/BatchTrackingApi, getClass().getClassLoader());
        deviceHelper = l1.a("com.soundcloud.android.utils.DeviceHelper", com/soundcloud/android/analytics/BatchTrackingApi, getClass().getClassLoader());
        batchUrl = l1.a("java.lang.String", com/soundcloud/android/analytics/BatchTrackingApi, getClass().getClassLoader());
        batchSize = l1.a("java.lang.Integer", com/soundcloud/android/analytics/BatchTrackingApi, getClass().getClassLoader());
    }

    public final BatchTrackingApi get()
    {
        return new BatchTrackingApi((t)httpClient.get(), (DeviceHelper)deviceHelper.get(), (String)batchUrl.get(), ((Integer)batchSize.get()).intValue());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(httpClient);
        set.add(deviceHelper);
        set.add(batchUrl);
        set.add(batchSize);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.BatchTrackingApi", "members/com.soundcloud.android.analytics.BatchTrackingApi", false, com/soundcloud/android/analytics/BatchTrackingApi);
    }
}
