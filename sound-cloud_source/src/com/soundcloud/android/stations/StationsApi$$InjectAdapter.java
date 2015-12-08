// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiClientRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsApi

public final class  extends b
    implements Provider
{

    private b apiClient;
    private b apiClientRx;

    public final void attach(l l1)
    {
        apiClientRx = l1.a("com.soundcloud.android.api.ApiClientRx", com/soundcloud/android/stations/StationsApi, getClass().getClassLoader());
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/stations/StationsApi, getClass().getClassLoader());
    }

    public final StationsApi get()
    {
        return new StationsApi((ApiClientRx)apiClientRx.get(), (ApiClient)apiClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClientRx);
        set.add(apiClient);
    }

    public ()
    {
        super("com.soundcloud.android.stations.StationsApi", "members/com.soundcloud.android.stations.StationsApi", false, com/soundcloud/android/stations/StationsApi);
    }
}
