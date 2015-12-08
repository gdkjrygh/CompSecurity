// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.commands.StoreTracksCommand;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.explore:
//            ExploreTracksOperations

public final class  extends b
    implements Provider
{

    private b apiClientRx;
    private b scheduler;
    private b storeTracksCommand;

    public final void attach(l l1)
    {
        storeTracksCommand = l1.a("com.soundcloud.android.commands.StoreTracksCommand", com/soundcloud/android/explore/ExploreTracksOperations, getClass().getClassLoader());
        apiClientRx = l1.a("com.soundcloud.android.api.ApiClientRx", com/soundcloud/android/explore/ExploreTracksOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/explore/ExploreTracksOperations, getClass().getClassLoader());
    }

    public final ExploreTracksOperations get()
    {
        return new ExploreTracksOperations((StoreTracksCommand)storeTracksCommand.get(), (ApiClientRx)apiClientRx.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(storeTracksCommand);
        set.add(apiClientRx);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.explore.ExploreTracksOperations", "members/com.soundcloud.android.explore.ExploreTracksOperations", false, com/soundcloud/android/explore/ExploreTracksOperations);
    }
}
