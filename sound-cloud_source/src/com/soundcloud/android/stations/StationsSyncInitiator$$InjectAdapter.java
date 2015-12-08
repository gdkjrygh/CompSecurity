// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.Context;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.sync.SyncStateManager;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsSyncInitiator

public final class  extends b
    implements a, Provider
{

    private b accountOperations;
    private b context;
    private b supertype;
    private b syncStateManager;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/stations/StationsSyncInitiator, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/stations/StationsSyncInitiator, getClass().getClassLoader());
        syncStateManager = l1.a("com.soundcloud.android.sync.SyncStateManager", com/soundcloud/android/stations/StationsSyncInitiator, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.sync.SyncInitiator", com/soundcloud/android/stations/StationsSyncInitiator, getClass().getClassLoader(), false);
    }

    public final StationsSyncInitiator get()
    {
        StationsSyncInitiator stationssyncinitiator = new StationsSyncInitiator((Context)context.get(), (AccountOperations)accountOperations.get(), (SyncStateManager)syncStateManager.get());
        injectMembers(stationssyncinitiator);
        return stationssyncinitiator;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(accountOperations);
        set.add(syncStateManager);
        set1.add(supertype);
    }

    public final void injectMembers(StationsSyncInitiator stationssyncinitiator)
    {
        supertype.injectMembers(stationssyncinitiator);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((StationsSyncInitiator)obj);
    }

    public ()
    {
        super("com.soundcloud.android.stations.StationsSyncInitiator", "members/com.soundcloud.android.stations.StationsSyncInitiator", false, com/soundcloud/android/stations/StationsSyncInitiator);
    }
}
