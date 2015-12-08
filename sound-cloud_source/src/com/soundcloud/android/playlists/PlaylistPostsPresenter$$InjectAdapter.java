// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistPostsPresenter, PlaylistItemAdapter, PlaylistPostOperations

public final class  extends b
    implements a, Provider
{

    private b adapter;
    private b eventBus;
    private b navigator;
    private b playlistPostOperations;
    private b supertype;
    private b swipeRefreshAttacher;

    public final void attach(l l1)
    {
        adapter = l1.a("com.soundcloud.android.playlists.PlaylistItemAdapter", com/soundcloud/android/playlists/PlaylistPostsPresenter, getClass().getClassLoader());
        playlistPostOperations = l1.a("com.soundcloud.android.playlists.PlaylistPostOperations", com/soundcloud/android/playlists/PlaylistPostsPresenter, getClass().getClassLoader());
        swipeRefreshAttacher = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/playlists/PlaylistPostsPresenter, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/playlists/PlaylistPostsPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playlists/PlaylistPostsPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerViewPresenter", com/soundcloud/android/playlists/PlaylistPostsPresenter, getClass().getClassLoader(), false);
    }

    public final PlaylistPostsPresenter get()
    {
        PlaylistPostsPresenter playlistpostspresenter = new PlaylistPostsPresenter((PlaylistItemAdapter)adapter.get(), (PlaylistPostOperations)playlistPostOperations.get(), (SwipeRefreshAttacher)swipeRefreshAttacher.get(), (Navigator)navigator.get(), (EventBus)eventBus.get());
        injectMembers(playlistpostspresenter);
        return playlistpostspresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(adapter);
        set.add(playlistPostOperations);
        set.add(swipeRefreshAttacher);
        set.add(navigator);
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(PlaylistPostsPresenter playlistpostspresenter)
    {
        supertype.injectMembers(playlistpostspresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlaylistPostsPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.PlaylistPostsPresenter", "members/com.soundcloud.android.playlists.PlaylistPostsPresenter", false, com/soundcloud/android/playlists/PlaylistPostsPresenter);
    }
}
