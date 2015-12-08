// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.soundcloud.android.presentation.ListItemAdapter;
import com.soundcloud.android.tracks.PlaylistTrackItemRenderer;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistDetailsController

class SplitScreenController extends PlaylistDetailsController
{

    private EmptyView emptyView;
    private View listViewContainer;

    SplitScreenController(PlaylistTrackItemRenderer playlisttrackitemrenderer, EventBus eventbus)
    {
        super(playlisttrackitemrenderer, new ListItemAdapter(playlisttrackitemrenderer), eventbus);
    }

    public boolean hasContent()
    {
        return !getAdapter().isEmpty();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        emptyView = (EmptyView)view.findViewById(0x1020004);
        emptyView.setMessageText(view.getContext().getString(0x7f070120));
        listViewContainer = view.findViewById(0x7f0f00b5);
        listView = (ListView)view.findViewById(0x102000a);
        listView.setEmptyView(emptyView);
    }

    public void setEmptyViewStatus(com.soundcloud.android.view.EmptyView.Status status)
    {
        emptyView.setStatus(status);
    }

    public void setListShown(boolean flag)
    {
        View view = listViewContainer;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }
}
