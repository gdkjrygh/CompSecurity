// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.view.View;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.CellRendererBinding;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.android.presentation.PagingRecyclerItemAdapter;
import com.soundcloud.android.tracks.TrackItemRenderer;
import com.soundcloud.android.view.adapters.FollowableUserItemRenderer;
import com.soundcloud.android.view.adapters.PlaylistItemRenderer;

class SearchResultsAdapter extends PagingRecyclerItemAdapter
{
    static class SearchViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public SearchViewHolder(View view)
        {
            super(view);
        }
    }


    static final int TYPE_PLAYLIST = 2;
    static final int TYPE_TRACK = 1;
    static final int TYPE_USER = 0;
    private final TrackItemRenderer trackRenderer;

    SearchResultsAdapter(FollowableUserItemRenderer followableuseritemrenderer, TrackItemRenderer trackitemrenderer, PlaylistItemRenderer playlistitemrenderer)
    {
        super(new CellRendererBinding[] {
            new CellRendererBinding(0, followableuseritemrenderer), new CellRendererBinding(1, trackitemrenderer), new CellRendererBinding(2, playlistitemrenderer)
        });
        trackRenderer = trackitemrenderer;
    }

    protected volatile android.support.v7.widget.RecyclerView.ViewHolder createViewHolder(View view)
    {
        return createViewHolder(view);
    }

    protected SearchViewHolder createViewHolder(View view)
    {
        return new SearchViewHolder(view);
    }

    public int getBasicItemViewType(int i)
    {
        Urn urn = ((ListItem)getItem(i)).getEntityUrn();
        if (urn.isUser())
        {
            return 0;
        }
        if (urn.isTrack())
        {
            return 1;
        }
        if (urn.isPlaylist())
        {
            return 2;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Unexpected item type in ")).append(com/soundcloud/android/search/SearchResultsAdapter.getSimpleName()).toString());
        }
    }

    public TrackItemRenderer getTrackRenderer()
    {
        return trackRenderer;
    }
}
