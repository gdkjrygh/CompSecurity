// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.view.View;
import com.soundcloud.android.presentation.CellRendererBinding;
import com.soundcloud.android.presentation.RecyclerItemAdapter;

// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoveryItem, RecommendationItemRenderer, PlaylistTagRenderer, SearchItemRenderer

class DiscoveryAdapter extends RecyclerItemAdapter
{
    static interface DiscoveryItemListener
        extends RecommendationItemRenderer.OnRecommendationClickListener, SearchItemRenderer.SearchListener, com.soundcloud.android.search.PlaylistTagsPresenter.Listener
    {
    }

    static class DiscoveryViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public DiscoveryViewHolder(View view)
        {
            super(view);
        }
    }


    static final int PLAYLIST_TAGS_TYPE = 1;
    static final int RECOMMENDATION_SEED_TYPE = 0;
    static final int SEARCH_TYPE = 2;
    private final PlaylistTagRenderer playlistTagRenderer;
    private final SearchItemRenderer searchItemRenderer;
    private final RecommendationItemRenderer trackRecommendationRenderer;

    DiscoveryAdapter(RecommendationItemRenderer recommendationitemrenderer, PlaylistTagRenderer playlisttagrenderer, SearchItemRenderer searchitemrenderer)
    {
        super(new CellRendererBinding[] {
            new CellRendererBinding(0, recommendationitemrenderer), new CellRendererBinding(1, playlisttagrenderer), new CellRendererBinding(2, searchitemrenderer)
        });
        trackRecommendationRenderer = recommendationitemrenderer;
        playlistTagRenderer = playlisttagrenderer;
        searchItemRenderer = searchitemrenderer;
    }

    protected volatile android.support.v7.widget.RecyclerView.ViewHolder createViewHolder(View view)
    {
        return createViewHolder(view);
    }

    protected DiscoveryViewHolder createViewHolder(View view)
    {
        return new DiscoveryViewHolder(view);
    }

    public int getBasicItemViewType(int i)
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.discovery.DiscoveryItem.Kind[((DiscoveryItem)getItem(i)).getKind().ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unhandled discovery item kind ")).append(((DiscoveryItem)getItem(i)).getKind()).toString());

        case 1: // '\001'
            return 0;

        case 2: // '\002'
            return 1;

        case 3: // '\003'
            return 2;
        }
    }

    void setDiscoveryListener(DiscoveryItemListener discoveryitemlistener)
    {
        trackRecommendationRenderer.setOnRecommendationClickListener(discoveryitemlistener);
        playlistTagRenderer.setOnTagClickListener(discoveryitemlistener);
        searchItemRenderer.setSearchListener(discoveryitemlistener);
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$discovery$DiscoveryItem$Kind[];

        static 
        {
            $SwitchMap$com$soundcloud$android$discovery$DiscoveryItem$Kind = new int[DiscoveryItem.Kind.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$discovery$DiscoveryItem$Kind[DiscoveryItem.Kind.TrackRecommendationItem.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$discovery$DiscoveryItem$Kind[DiscoveryItem.Kind.PlaylistTagsItem.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$discovery$DiscoveryItem$Kind[DiscoveryItem.Kind.SearchItem.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
