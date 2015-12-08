// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.api:
//            ApiClientRx, ApiClient

public final class  extends b
    implements Provider
{

    private b apiClient;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/api/ApiClientRx, getClass().getClassLoader());
    }

    public final ApiClientRx get()
    {
        return new ApiClientRx((ApiClient)apiClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClient);
    }

    public ()
    {
        super("com.soundcloud.android.api.ApiClientRx", "members/com.soundcloud.android.api.ApiClientRx", false, com/soundcloud/android/api/ApiClientRx);
    }
}
