// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.associations.LoadFollowingCommand;
import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.commands.StoreUsersCommand;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.search:
//            SearchOperations, CacheUniversalSearchCommand, LoadPlaylistLikedStatuses

public final class  extends b
    implements Provider
{

    private b apiClientRx;
    private b cacheUniversalSearchCommand;
    private b loadFollowingCommand;
    private b loadPlaylistLikedStatuses;
    private b scheduler;
    private b storePlaylistsCommand;
    private b storeTracksCommand;
    private b storeUsersCommand;

    public final void attach(l l1)
    {
        apiClientRx = l1.a("com.soundcloud.android.api.ApiClientRx", com/soundcloud/android/search/SearchOperations, getClass().getClassLoader());
        storeTracksCommand = l1.a("com.soundcloud.android.commands.StoreTracksCommand", com/soundcloud/android/search/SearchOperations, getClass().getClassLoader());
        storePlaylistsCommand = l1.a("com.soundcloud.android.commands.StorePlaylistsCommand", com/soundcloud/android/search/SearchOperations, getClass().getClassLoader());
        storeUsersCommand = l1.a("com.soundcloud.android.commands.StoreUsersCommand", com/soundcloud/android/search/SearchOperations, getClass().getClassLoader());
        cacheUniversalSearchCommand = l1.a("com.soundcloud.android.search.CacheUniversalSearchCommand", com/soundcloud/android/search/SearchOperations, getClass().getClassLoader());
        loadPlaylistLikedStatuses = l1.a("com.soundcloud.android.search.LoadPlaylistLikedStatuses", com/soundcloud/android/search/SearchOperations, getClass().getClassLoader());
        loadFollowingCommand = l1.a("com.soundcloud.android.associations.LoadFollowingCommand", com/soundcloud/android/search/SearchOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/search/SearchOperations, getClass().getClassLoader());
    }

    public final SearchOperations get()
    {
        return new SearchOperations((ApiClientRx)apiClientRx.get(), (StoreTracksCommand)storeTracksCommand.get(), (StorePlaylistsCommand)storePlaylistsCommand.get(), (StoreUsersCommand)storeUsersCommand.get(), (CacheUniversalSearchCommand)cacheUniversalSearchCommand.get(), (LoadPlaylistLikedStatuses)loadPlaylistLikedStatuses.get(), (LoadFollowingCommand)loadFollowingCommand.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClientRx);
        set.add(storeTracksCommand);
        set.add(storePlaylistsCommand);
        set.add(storeUsersCommand);
        set.add(cacheUniversalSearchCommand);
        set.add(loadPlaylistLikedStatuses);
        set.add(loadFollowingCommand);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.search.SearchOperations", "members/com.soundcloud.android.search.SearchOperations", false, com/soundcloud/android/search/SearchOperations);
    }
}
