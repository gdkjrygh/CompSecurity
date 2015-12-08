// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.search.PlaylistTagsPresenter;
import java.util.List;

// Referenced classes of package com.soundcloud.android.discovery:
//            PlaylistDiscoveryItem

class PlaylistTagRenderer
    implements CellRenderer
{

    private final PlaylistTagsPresenter playlistTagsPresenter;

    PlaylistTagRenderer(PlaylistTagsPresenter playlisttagspresenter)
    {
        playlistTagsPresenter = playlisttagspresenter;
    }

    public void bindItemView(int i, View view, List list)
    {
        List list1 = ((PlaylistDiscoveryItem)list.get(i)).getRecentTags();
        if (!list1.isEmpty())
        {
            playlistTagsPresenter.displayRecentTags(view, list1);
        }
        playlistTagsPresenter.displayPopularTags(view, ((PlaylistDiscoveryItem)list.get(i)).getPopularTags());
    }

    public View createItemView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03009d, viewgroup, false);
        viewgroup.findViewById(0x1020004).setVisibility(8);
        return viewgroup;
    }

    void setOnTagClickListener(com.soundcloud.android.search.PlaylistTagsPresenter.Listener listener)
    {
        playlistTagsPresenter.setListener(listener);
    }
}
