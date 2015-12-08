// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import android.view.View;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.CellRendererBinding;
import com.soundcloud.android.presentation.PagingRecyclerItemAdapter;
import com.soundcloud.android.presentation.PlayableItem;
import com.soundcloud.android.tracks.TrackItemRenderer;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            PlaylistItemRenderer

public class MixedPlayableRecyclerItemAdapter extends PagingRecyclerItemAdapter
{
    public static class MixedPlayableViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public MixedPlayableViewHolder(View view)
        {
            super(view);
        }
    }


    static final int PLAYLIST_ITEM_TYPE = 1;
    static final int TRACK_ITEM_TYPE = 0;
    private final TrackItemRenderer trackRenderer;

    public MixedPlayableRecyclerItemAdapter(TrackItemRenderer trackitemrenderer, PlaylistItemRenderer playlistitemrenderer)
    {
        super(new CellRendererBinding[] {
            new CellRendererBinding(0, trackitemrenderer), new CellRendererBinding(1, playlistitemrenderer)
        });
        trackRenderer = trackitemrenderer;
    }

    protected volatile android.support.v7.widget.RecyclerView.ViewHolder createViewHolder(View view)
    {
        return createViewHolder(view);
    }

    protected MixedPlayableViewHolder createViewHolder(View view)
    {
        return new MixedPlayableViewHolder(view);
    }

    public int getBasicItemViewType(int i)
    {
        return !((PlayableItem)getItem(i)).getEntityUrn().isTrack() ? 1 : 0;
    }

    public TrackItemRenderer getTrackRenderer()
    {
        return trackRenderer;
    }
}
