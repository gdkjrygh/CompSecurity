// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.likes.LoadLikedTrackUrnsCommand;
import com.soundcloud.android.likes.PlaylistLikesStorage;
import com.soundcloud.android.playlists.PlaylistPostStorage;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.stations.StationsOperations;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.sync.SyncStateStorage;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionsOperations, CollectionsOptionsStorage

public final class  extends b
    implements Provider
{

    private b collectionsOptionsStorage;
    private b eventBus;
    private b featureFlags;
    private b loadLikedTrackUrnsCommand;
    private b playlistLikesStorage;
    private b playlistPostStorage;
    private b scheduler;
    private b stationsOperations;
    private b syncInitiator;
    private b syncStateStorage;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/collections/CollectionsOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/collections/CollectionsOperations, getClass().getClassLoader());
        syncStateStorage = l1.a("com.soundcloud.android.sync.SyncStateStorage", com/soundcloud/android/collections/CollectionsOperations, getClass().getClassLoader());
        playlistPostStorage = l1.a("com.soundcloud.android.playlists.PlaylistPostStorage", com/soundcloud/android/collections/CollectionsOperations, getClass().getClassLoader());
        playlistLikesStorage = l1.a("com.soundcloud.android.likes.PlaylistLikesStorage", com/soundcloud/android/collections/CollectionsOperations, getClass().getClassLoader());
        loadLikedTrackUrnsCommand = l1.a("com.soundcloud.android.likes.LoadLikedTrackUrnsCommand", com/soundcloud/android/collections/CollectionsOperations, getClass().getClassLoader());
        syncInitiator = l1.a("com.soundcloud.android.sync.SyncInitiator", com/soundcloud/android/collections/CollectionsOperations, getClass().getClassLoader());
        stationsOperations = l1.a("com.soundcloud.android.stations.StationsOperations", com/soundcloud/android/collections/CollectionsOperations, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/collections/CollectionsOperations, getClass().getClassLoader());
        collectionsOptionsStorage = l1.a("com.soundcloud.android.collections.CollectionsOptionsStorage", com/soundcloud/android/collections/CollectionsOperations, getClass().getClassLoader());
    }

    public final CollectionsOperations get()
    {
        return new CollectionsOperations((EventBus)eventBus.get(), (R)scheduler.get(), (SyncStateStorage)syncStateStorage.get(), (PlaylistPostStorage)playlistPostStorage.get(), (PlaylistLikesStorage)playlistLikesStorage.get(), (LoadLikedTrackUrnsCommand)loadLikedTrackUrnsCommand.get(), (SyncInitiator)syncInitiator.get(), (StationsOperations)stationsOperations.get(), (FeatureFlags)featureFlags.get(), (CollectionsOptionsStorage)collectionsOptionsStorage.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(scheduler);
        set.add(syncStateStorage);
        set.add(playlistPostStorage);
        set.add(playlistLikesStorage);
        set.add(loadLikedTrackUrnsCommand);
        set.add(syncInitiator);
        set.add(stationsOperations);
        set.add(featureFlags);
        set.add(collectionsOptionsStorage);
    }

    public ()
    {
        super("com.soundcloud.android.collections.CollectionsOperations", "members/com.soundcloud.android.collections.CollectionsOperations", false, com/soundcloud/android/collections/CollectionsOperations);
    }
}
