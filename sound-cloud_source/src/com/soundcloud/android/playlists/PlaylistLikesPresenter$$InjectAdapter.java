// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.likes.PlaylistLikeOperations;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistLikesPresenter, PlaylistItemAdapter

public final class  extends b
    implements a, Provider
{

    private b adapter;
    private b eventBus;
    private b likeOperations;
    private b navigator;
    private b supertype;
    private b swipeRefreshAttacher;

    public final void attach(l l1)
    {
        swipeRefreshAttacher = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/playlists/PlaylistLikesPresenter, getClass().getClassLoader());
        likeOperations = l1.a("com.soundcloud.android.likes.PlaylistLikeOperations", com/soundcloud/android/playlists/PlaylistLikesPresenter, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.playlists.PlaylistItemAdapter", com/soundcloud/android/playlists/PlaylistLikesPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playlists/PlaylistLikesPresenter, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/playlists/PlaylistLikesPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerViewPresenter", com/soundcloud/android/playlists/PlaylistLikesPresenter, getClass().getClassLoader(), false);
    }

    public final PlaylistLikesPresenter get()
    {
        PlaylistLikesPresenter playlistlikespresenter = new PlaylistLikesPresenter((SwipeRefreshAttacher)swipeRefreshAttacher.get(), (PlaylistLikeOperations)likeOperations.get(), (PlaylistItemAdapter)adapter.get(), (EventBus)eventBus.get(), (Navigator)navigator.get());
        injectMembers(playlistlikespresenter);
        return playlistlikespresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(swipeRefreshAttacher);
        set.add(likeOperations);
        set.add(adapter);
        set.add(eventBus);
        set.add(navigator);
        set1.add(supertype);
    }

    public final void injectMembers(PlaylistLikesPresenter playlistlikespresenter)
    {
        supertype.injectMembers(playlistlikespresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlaylistLikesPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.PlaylistLikesPresenter", "members/com.soundcloud.android.playlists.PlaylistLikesPresenter", false, com/soundcloud/android/playlists/PlaylistLikesPresenter);
    }
}
