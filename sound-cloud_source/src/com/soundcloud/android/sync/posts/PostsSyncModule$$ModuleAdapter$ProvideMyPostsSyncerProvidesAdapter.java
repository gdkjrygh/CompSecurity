// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.sync.commands.FetchTracksCommand;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            PostsSyncModule, LoadLocalPostsCommand, FetchPostsCommand, StorePostsCommand, 
//            RemovePostsCommand, PostsSyncer

public static final class setLibrary extends t
    implements Provider
{

    private b eventBus;
    private b fetchRemotePosts;
    private b fetchTracksCommand;
    private b loadLocalPosts;
    private final PostsSyncModule module;
    private b removePostsCommand;
    private b storePostsCommand;
    private b storeTracksCommand;

    public final void attach(l l1)
    {
        loadLocalPosts = l1.a("@javax.inject.Named(value=LoadTrackPosts)/com.soundcloud.android.sync.posts.LoadLocalPostsCommand", com/soundcloud/android/sync/posts/PostsSyncModule, getClass().getClassLoader());
        fetchRemotePosts = l1.a("@javax.inject.Named(value=FetchTrackPosts)/com.soundcloud.android.sync.posts.FetchPostsCommand", com/soundcloud/android/sync/posts/PostsSyncModule, getClass().getClassLoader());
        storePostsCommand = l1.a("com.soundcloud.android.sync.posts.StorePostsCommand", com/soundcloud/android/sync/posts/PostsSyncModule, getClass().getClassLoader());
        removePostsCommand = l1.a("com.soundcloud.android.sync.posts.RemovePostsCommand", com/soundcloud/android/sync/posts/PostsSyncModule, getClass().getClassLoader());
        fetchTracksCommand = l1.a("com.soundcloud.android.sync.commands.FetchTracksCommand", com/soundcloud/android/sync/posts/PostsSyncModule, getClass().getClassLoader());
        storeTracksCommand = l1.a("com.soundcloud.android.commands.StoreTracksCommand", com/soundcloud/android/sync/posts/PostsSyncModule, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/sync/posts/PostsSyncModule, getClass().getClassLoader());
    }

    public final PostsSyncer get()
    {
        return module.provideMyPostsSyncer((LoadLocalPostsCommand)loadLocalPosts.get(), (FetchPostsCommand)fetchRemotePosts.get(), (StorePostsCommand)storePostsCommand.get(), (RemovePostsCommand)removePostsCommand.get(), (FetchTracksCommand)fetchTracksCommand.get(), (StoreTracksCommand)storeTracksCommand.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(loadLocalPosts);
        set.add(fetchRemotePosts);
        set.add(storePostsCommand);
        set.add(removePostsCommand);
        set.add(fetchTracksCommand);
        set.add(storeTracksCommand);
        set.add(eventBus);
    }

    public (PostsSyncModule postssyncmodule)
    {
        super("@javax.inject.Named(value=MyTrackPostsSyncer)/com.soundcloud.android.sync.posts.PostsSyncer", false, "com.soundcloud.android.sync.posts.PostsSyncModule", "provideMyPostsSyncer");
        module = postssyncmodule;
        setLibrary(true);
    }
}
