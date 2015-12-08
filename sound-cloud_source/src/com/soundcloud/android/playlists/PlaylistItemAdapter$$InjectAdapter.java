// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistItemAdapter, DownloadablePlaylistItemRenderer

public final class I extends b
    implements a, Provider
{

    private b playlistRenderer;
    private b supertype;

    public final void attach(l l1)
    {
        playlistRenderer = l1.a("com.soundcloud.android.playlists.DownloadablePlaylistItemRenderer", com/soundcloud/android/playlists/PlaylistItemAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.PagingRecyclerItemAdapter", com/soundcloud/android/playlists/PlaylistItemAdapter, getClass().getClassLoader(), false);
    }

    public final PlaylistItemAdapter get()
    {
        PlaylistItemAdapter playlistitemadapter = new PlaylistItemAdapter((DownloadablePlaylistItemRenderer)playlistRenderer.get());
        injectMembers(playlistitemadapter);
        return playlistitemadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playlistRenderer);
        set1.add(supertype);
    }

    public final void injectMembers(PlaylistItemAdapter playlistitemadapter)
    {
        supertype.injectMembers(playlistitemadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlaylistItemAdapter)obj);
    }

    public I()
    {
        super("com.soundcloud.android.playlists.PlaylistItemAdapter", "members/com.soundcloud.android.playlists.PlaylistItemAdapter", false, com/soundcloud/android/playlists/PlaylistItemAdapter);
    }
}
