// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.playlists.LoadPlaylistTrackUrnsCommand;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            MyPlaylistsSyncer, PostsSyncer, LoadLocalPlaylistsCommand, ReplacePlaylistPostCommand

public final class  extends b
    implements Provider
{

    private b apiClient;
    private b eventBus;
    private b loadLocalPlaylists;
    private b loadPlaylistTrackUrnsCommand;
    private b postsSyncer;
    private b replacePlaylist;

    public final void attach(l l1)
    {
        postsSyncer = l1.a("@javax.inject.Named(value=MyPlaylistPostsSyncer)/com.soundcloud.android.sync.posts.PostsSyncer", com/soundcloud/android/sync/posts/MyPlaylistsSyncer, getClass().getClassLoader());
        loadLocalPlaylists = l1.a("com.soundcloud.android.sync.posts.LoadLocalPlaylistsCommand", com/soundcloud/android/sync/posts/MyPlaylistsSyncer, getClass().getClassLoader());
        loadPlaylistTrackUrnsCommand = l1.a("com.soundcloud.android.playlists.LoadPlaylistTrackUrnsCommand", com/soundcloud/android/sync/posts/MyPlaylistsSyncer, getClass().getClassLoader());
        replacePlaylist = l1.a("com.soundcloud.android.sync.posts.ReplacePlaylistPostCommand", com/soundcloud/android/sync/posts/MyPlaylistsSyncer, getClass().getClassLoader());
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/sync/posts/MyPlaylistsSyncer, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/sync/posts/MyPlaylistsSyncer, getClass().getClassLoader());
    }

    public final MyPlaylistsSyncer get()
    {
        return new MyPlaylistsSyncer((PostsSyncer)postsSyncer.get(), (LoadLocalPlaylistsCommand)loadLocalPlaylists.get(), (LoadPlaylistTrackUrnsCommand)loadPlaylistTrackUrnsCommand.get(), (ReplacePlaylistPostCommand)replacePlaylist.get(), (ApiClient)apiClient.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(postsSyncer);
        set.add(loadLocalPlaylists);
        set.add(loadPlaylistTrackUrnsCommand);
        set.add(replacePlaylist);
        set.add(apiClient);
        set.add(eventBus);
    }

    public ()
    {
        super("com.soundcloud.android.sync.posts.MyPlaylistsSyncer", "members/com.soundcloud.android.sync.posts.MyPlaylistsSyncer", false, com/soundcloud/android/sync/posts/MyPlaylistsSyncer);
    }
}
