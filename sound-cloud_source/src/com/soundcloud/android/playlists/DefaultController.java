// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistDetailsController, InlinePlaylistTracksAdapter

class DefaultController extends PlaylistDetailsController
{

    private final InlinePlaylistTracksAdapter adapter;

    DefaultController(InlinePlaylistTracksAdapter inlineplaylisttracksadapter, EventBus eventbus)
    {
        super(inlineplaylisttracksadapter.getPlaylistItemRenderer(), inlineplaylisttracksadapter, eventbus);
        adapter = inlineplaylisttracksadapter;
    }

    public boolean hasContent()
    {
        return adapter.hasContentItems();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        listView = (ListView)view.findViewById(0x102000a);
    }

    public void setEmptyViewStatus(com.soundcloud.android.view.EmptyView.Status status)
    {
        adapter.setEmptyViewStatus(status);
        adapter.notifyDataSetChanged();
    }

    public void setListShown(boolean flag)
    {
        ListView listview = listView;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        listview.setVisibility(i);
    }
}
