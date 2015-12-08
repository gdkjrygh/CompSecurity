// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.playlists.PlaylistStorage;
import com.soundcloud.android.sync.likes.MyLikesStateProvider;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncAdapterService

public final class  extends b
    implements a, Provider
{

    private b accountOperations;
    private b myLikesStateProvider;
    private b playlistStorage;
    private b syncServiceResultReceiverFactory;

    public final void attach(l l1)
    {
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/sync/SyncAdapterService, getClass().getClassLoader());
        syncServiceResultReceiverFactory = l1.a("com.soundcloud.android.sync.SyncServiceResultReceiver$Factory", com/soundcloud/android/sync/SyncAdapterService, getClass().getClassLoader());
        myLikesStateProvider = l1.a("com.soundcloud.android.sync.likes.MyLikesStateProvider", com/soundcloud/android/sync/SyncAdapterService, getClass().getClassLoader());
        playlistStorage = l1.a("com.soundcloud.android.playlists.PlaylistStorage", com/soundcloud/android/sync/SyncAdapterService, getClass().getClassLoader());
    }

    public final SyncAdapterService get()
    {
        SyncAdapterService syncadapterservice = new SyncAdapterService();
        injectMembers(syncadapterservice);
        return syncadapterservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(accountOperations);
        set1.add(syncServiceResultReceiverFactory);
        set1.add(myLikesStateProvider);
        set1.add(playlistStorage);
    }

    public final void injectMembers(SyncAdapterService syncadapterservice)
    {
        syncadapterservice.accountOperations = (AccountOperations)accountOperations.get();
        syncadapterservice.syncServiceResultReceiverFactory = (ltReceiverFactory)syncServiceResultReceiverFactory.get();
        syncadapterservice.myLikesStateProvider = (MyLikesStateProvider)myLikesStateProvider.get();
        syncadapterservice.playlistStorage = (PlaylistStorage)playlistStorage.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SyncAdapterService)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.SyncAdapterService", "members/com.soundcloud.android.sync.SyncAdapterService", false, com/soundcloud/android/sync/SyncAdapterService);
    }
}
