// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync:
//            ApiSyncService, SyncRequestFactory

public final class  extends b
    implements a, Provider
{

    private b syncIntentSyncRequestFactory;

    public final void attach(l l1)
    {
        syncIntentSyncRequestFactory = l1.a("com.soundcloud.android.sync.SyncRequestFactory", com/soundcloud/android/sync/ApiSyncService, getClass().getClassLoader());
    }

    public final ApiSyncService get()
    {
        ApiSyncService apisyncservice = new ApiSyncService();
        injectMembers(apisyncservice);
        return apisyncservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(syncIntentSyncRequestFactory);
    }

    public final void injectMembers(ApiSyncService apisyncservice)
    {
        apisyncservice.syncIntentSyncRequestFactory = (SyncRequestFactory)syncIntentSyncRequestFactory.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ApiSyncService)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.ApiSyncService", "members/com.soundcloud.android.sync.ApiSyncService", false, com/soundcloud/android/sync/ApiSyncService);
    }
}
