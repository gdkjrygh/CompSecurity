// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.api.json.JsonTransformer;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.sync.playlists.SinglePlaylistSyncerFactory;
import dagger.Lazy;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync:
//            ApiSyncerFactory

public final class ctory extends b
    implements Provider
{

    private b accountOpsProvider;
    private b featureFlags;
    private b jsonTransformer;
    private b lazyActivitiesSyncer;
    private b lazyMyLikesSyncer;
    private b lazyMyPostsSyncer;
    private b lazyPlaylistsSyncer;
    private b lazySoundStreamSyncer;
    private b navigator;
    private b nextFollowingOperationsProvider;
    private b notificationManagerProvider;
    private b singlePlaylistSyncerFactory;

    public final void attach(l l1)
    {
        nextFollowingOperationsProvider = l1.a("javax.inject.Provider<com.soundcloud.android.associations.NextFollowingOperations>", com/soundcloud/android/sync/ApiSyncerFactory, getClass().getClassLoader());
        accountOpsProvider = l1.a("javax.inject.Provider<com.soundcloud.android.accounts.AccountOperations>", com/soundcloud/android/sync/ApiSyncerFactory, getClass().getClassLoader());
        notificationManagerProvider = l1.a("javax.inject.Provider<android.app.NotificationManager>", com/soundcloud/android/sync/ApiSyncerFactory, getClass().getClassLoader());
        lazySoundStreamSyncer = l1.a("dagger.Lazy<com.soundcloud.android.sync.stream.SoundStreamSyncer>", com/soundcloud/android/sync/ApiSyncerFactory, getClass().getClassLoader());
        lazyActivitiesSyncer = l1.a("dagger.Lazy<com.soundcloud.android.sync.activities.ActivitiesSyncer>", com/soundcloud/android/sync/ApiSyncerFactory, getClass().getClassLoader());
        lazyPlaylistsSyncer = l1.a("dagger.Lazy<com.soundcloud.android.sync.posts.MyPlaylistsSyncer>", com/soundcloud/android/sync/ApiSyncerFactory, getClass().getClassLoader());
        lazyMyLikesSyncer = l1.a("dagger.Lazy<com.soundcloud.android.sync.likes.MyLikesSyncer>", com/soundcloud/android/sync/ApiSyncerFactory, getClass().getClassLoader());
        lazyMyPostsSyncer = l1.a("dagger.Lazy<com.soundcloud.android.sync.posts.MyPostsSyncer>", com/soundcloud/android/sync/ApiSyncerFactory, getClass().getClassLoader());
        singlePlaylistSyncerFactory = l1.a("com.soundcloud.android.sync.playlists.SinglePlaylistSyncerFactory", com/soundcloud/android/sync/ApiSyncerFactory, getClass().getClassLoader());
        jsonTransformer = l1.a("com.soundcloud.android.api.json.JsonTransformer", com/soundcloud/android/sync/ApiSyncerFactory, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/sync/ApiSyncerFactory, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/sync/ApiSyncerFactory, getClass().getClassLoader());
    }

    public final ApiSyncerFactory get()
    {
        return new ApiSyncerFactory((Provider)nextFollowingOperationsProvider.get(), (Provider)accountOpsProvider.get(), (Provider)notificationManagerProvider.get(), (Lazy)lazySoundStreamSyncer.get(), (Lazy)lazyActivitiesSyncer.get(), (Lazy)lazyPlaylistsSyncer.get(), (Lazy)lazyMyLikesSyncer.get(), (Lazy)lazyMyPostsSyncer.get(), (SinglePlaylistSyncerFactory)singlePlaylistSyncerFactory.get(), (JsonTransformer)jsonTransformer.get(), (Navigator)navigator.get(), (FeatureFlags)featureFlags.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(nextFollowingOperationsProvider);
        set.add(accountOpsProvider);
        set.add(notificationManagerProvider);
        set.add(lazySoundStreamSyncer);
        set.add(lazyActivitiesSyncer);
        set.add(lazyPlaylistsSyncer);
        set.add(lazyMyLikesSyncer);
        set.add(lazyMyPostsSyncer);
        set.add(singlePlaylistSyncerFactory);
        set.add(jsonTransformer);
        set.add(navigator);
        set.add(featureFlags);
    }

    public ctory()
    {
        super("com.soundcloud.android.sync.ApiSyncerFactory", "members/com.soundcloud.android.sync.ApiSyncerFactory", false, com/soundcloud/android/sync/ApiSyncerFactory);
    }
}
