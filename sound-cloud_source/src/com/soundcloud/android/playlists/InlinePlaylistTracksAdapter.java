// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.presentation.CellRendererBinding;
import com.soundcloud.android.presentation.ListItemAdapter;
import com.soundcloud.android.rx.observers.EmptyViewAware;
import com.soundcloud.android.tracks.PlaylistTrackItemRenderer;
import java.util.List;

// Referenced classes of package com.soundcloud.android.playlists:
//            EmptyPlaylistTracksRenderer

class InlinePlaylistTracksAdapter extends ListItemAdapter
    implements EmptyViewAware
{

    private final EmptyViewAware emptyViewRenderer;
    private final PlaylistTrackItemRenderer playlistItemRenderer;

    InlinePlaylistTracksAdapter(PlaylistTrackItemRenderer playlisttrackitemrenderer, EmptyPlaylistTracksRenderer emptyplaylisttracksrenderer)
    {
        super(new CellRendererBinding[] {
            new CellRendererBinding(0, playlisttrackitemrenderer), new CellRendererBinding(-1, emptyplaylisttracksrenderer)
        });
        emptyViewRenderer = emptyplaylisttracksrenderer;
        playlistItemRenderer = playlisttrackitemrenderer;
    }

    public int getItemCount()
    {
        return Math.max(1, items.size());
    }

    public int getItemViewType(int i)
    {
        if (items.isEmpty())
        {
            return -1;
        } else
        {
            return super.getItemViewType(i);
        }
    }

    PlaylistTrackItemRenderer getPlaylistItemRenderer()
    {
        return playlistItemRenderer;
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    protected boolean hasContentItems()
    {
        return !items.isEmpty();
    }

    public boolean isEnabled(int i)
    {
        return getItemViewType(i) != -1;
    }

    public void setEmptyViewStatus(com.soundcloud.android.view.EmptyView.Status status)
    {
        emptyViewRenderer.setEmptyViewStatus(status);
    }
}
