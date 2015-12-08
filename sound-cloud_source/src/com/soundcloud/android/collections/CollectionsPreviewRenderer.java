// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import java.util.List;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionPreviewView, CollectionsItem

class CollectionsPreviewRenderer
    implements CellRenderer
{

    private final FeatureFlags featureFlags;
    private final android.view.View.OnClickListener goToRecentStationsListener = new _cls2();
    private final android.view.View.OnClickListener goToTrackLikesListener = new _cls1();
    private final Navigator navigator;
    private final Resources resources;

    public CollectionsPreviewRenderer(Navigator navigator1, Resources resources1, FeatureFlags featureflags)
    {
        navigator = navigator1;
        resources = resources1;
        featureFlags = featureflags;
    }

    private void bindPreviewView(List list, CollectionPreviewView collectionpreviewview)
    {
        collectionpreviewview.refreshThumbnails(list, resources.getInteger(0x7f0a0002));
    }

    private CollectionPreviewView getLikesPreviewView(View view)
    {
        return (CollectionPreviewView)view.findViewById(0x7f0f00d7);
    }

    private CollectionPreviewView getRecentStationsPreviewView(View view)
    {
        return (CollectionPreviewView)view.findViewById(0x7f0f00d8);
    }

    private void setupRecentStationsView(CollectionPreviewView collectionpreviewview)
    {
        if (featureFlags.isEnabled(Flag.STATIONS_SOFT_LAUNCH))
        {
            collectionpreviewview.setVisibility(0);
            collectionpreviewview.setOnClickListener(goToRecentStationsListener);
        }
    }

    public void bindItemView(int i, View view, List list)
    {
        bindPreviewView(((CollectionsItem)list.get(i)).getLikes(), getLikesPreviewView(view));
        bindPreviewView(((CollectionsItem)list.get(i)).getStations(), getRecentStationsPreviewView(view));
    }

    public View createItemView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030030, viewgroup, false);
        getLikesPreviewView(viewgroup).setOnClickListener(goToTrackLikesListener);
        setupRecentStationsView(getRecentStationsPreviewView(viewgroup));
        return viewgroup;
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CollectionsPreviewRenderer this$0;

        public void onClick(View view)
        {
            navigator.openTrackLikes(view.getContext());
        }

        _cls1()
        {
            this$0 = CollectionsPreviewRenderer.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final CollectionsPreviewRenderer this$0;

        public void onClick(View view)
        {
            navigator.openViewAllStations(view.getContext(), 0);
        }

        _cls2()
        {
            this$0 = CollectionsPreviewRenderer.this;
            super();
        }
    }

}
