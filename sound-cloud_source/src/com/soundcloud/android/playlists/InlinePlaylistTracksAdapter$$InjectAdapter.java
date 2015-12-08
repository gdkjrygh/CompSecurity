// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.tracks.PlaylistTrackItemRenderer;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            InlinePlaylistTracksAdapter, EmptyPlaylistTracksRenderer

public final class Q extends b
    implements a, Provider
{

    private b emptyViewRenderer;
    private b playlistItemRenderer;
    private b supertype;

    public final void attach(l l1)
    {
        playlistItemRenderer = l1.a("com.soundcloud.android.tracks.PlaylistTrackItemRenderer", com/soundcloud/android/playlists/InlinePlaylistTracksAdapter, getClass().getClassLoader());
        emptyViewRenderer = l1.a("com.soundcloud.android.playlists.EmptyPlaylistTracksRenderer", com/soundcloud/android/playlists/InlinePlaylistTracksAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.ListItemAdapter", com/soundcloud/android/playlists/InlinePlaylistTracksAdapter, getClass().getClassLoader(), false);
    }

    public final InlinePlaylistTracksAdapter get()
    {
        InlinePlaylistTracksAdapter inlineplaylisttracksadapter = new InlinePlaylistTracksAdapter((PlaylistTrackItemRenderer)playlistItemRenderer.get(), (EmptyPlaylistTracksRenderer)emptyViewRenderer.get());
        injectMembers(inlineplaylisttracksadapter);
        return inlineplaylisttracksadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playlistItemRenderer);
        set.add(emptyViewRenderer);
        set1.add(supertype);
    }

    public final void injectMembers(InlinePlaylistTracksAdapter inlineplaylisttracksadapter)
    {
        supertype.injectMembers(inlineplaylisttracksadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((InlinePlaylistTracksAdapter)obj);
    }

    public Q()
    {
        super("com.soundcloud.android.playlists.InlinePlaylistTracksAdapter", "members/com.soundcloud.android.playlists.InlinePlaylistTracksAdapter", false, com/soundcloud/android/playlists/InlinePlaylistTracksAdapter);
    }
}
