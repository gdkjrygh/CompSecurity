// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.view.View;
import com.soundcloud.android.presentation.CellRendererBinding;
import com.soundcloud.android.presentation.PagingRecyclerItemAdapter;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionPlaylistHeaderRenderer, CollectionPlaylistRemoveFilterRenderer, CollectionsItem, OnboardingItemCellRenderer, 
//            CollectionsPreviewRenderer, CollectionEmptyPlaylistsRenderer, CollectionPlaylistItemRenderer

public class CollectionsAdapter extends PagingRecyclerItemAdapter
    implements CollectionPlaylistHeaderRenderer.OnSettingsClickListener, CollectionPlaylistRemoveFilterRenderer.OnRemoveFilterListener
{
    static interface Listener
    {

        public abstract void onPlaylistSettingsClicked(View view);

        public abstract void onRemoveFilterClicked();
    }


    private Listener listener;
    private final OnboardingItemCellRenderer onboardingItemCellRenderer;

    public CollectionsAdapter(OnboardingItemCellRenderer onboardingitemcellrenderer, CollectionsPreviewRenderer collectionspreviewrenderer, CollectionPlaylistHeaderRenderer collectionplaylistheaderrenderer, CollectionPlaylistRemoveFilterRenderer collectionplaylistremovefilterrenderer, CollectionEmptyPlaylistsRenderer collectionemptyplaylistsrenderer, CollectionPlaylistItemRenderer collectionplaylistitemrenderer)
    {
        super(new CellRendererBinding[] {
            new CellRendererBinding(5, onboardingitemcellrenderer), new CellRendererBinding(0, collectionspreviewrenderer), new CellRendererBinding(1, collectionplaylistheaderrenderer), new CellRendererBinding(3, collectionplaylistremovefilterrenderer), new CellRendererBinding(4, collectionemptyplaylistsrenderer), new CellRendererBinding(2, collectionplaylistitemrenderer)
        });
        onboardingItemCellRenderer = onboardingitemcellrenderer;
        collectionplaylistheaderrenderer.setOnSettingsClickListener(this);
        collectionplaylistremovefilterrenderer.setOnRemoveFilterClickListener(this);
    }

    protected volatile android.support.v7.widget.RecyclerView.ViewHolder createViewHolder(View view)
    {
        return createViewHolder(view);
    }

    protected com.soundcloud.android.presentation.RecyclerItemAdapter.ViewHolder createViewHolder(View view)
    {
        return new com.soundcloud.android.presentation.RecyclerItemAdapter.ViewHolder(view);
    }

    public int getBasicItemViewType(int i)
    {
        return ((CollectionsItem)getItem(i)).getType();
    }

    public void onRemoveFilter()
    {
        if (listener != null)
        {
            listener.onRemoveFilterClicked();
        }
    }

    public void onSettingsClicked(View view)
    {
        if (listener != null)
        {
            listener.onPlaylistSettingsClicked(view);
        }
    }

    public void setListener(Listener listener1)
    {
        listener = listener1;
    }

    void setOnboardingListener(OnboardingItemCellRenderer.Listener listener1)
    {
        onboardingItemCellRenderer.setListener(listener1);
    }
}
