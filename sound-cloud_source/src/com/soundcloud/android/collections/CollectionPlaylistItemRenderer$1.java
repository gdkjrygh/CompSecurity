// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.view.View;
import com.soundcloud.android.playlists.PlaylistItem;
import com.soundcloud.android.playlists.PlaylistItemMenuPresenter;
import com.soundcloud.android.tracks.OverflowMenuOptions;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionPlaylistItemRenderer

class val.options
    implements android.view.laylistItemRenderer._cls1
{

    final CollectionPlaylistItemRenderer this$0;
    final View val$button;
    final OverflowMenuOptions val$options;
    final PlaylistItem val$playlistItem;

    public void onClick(View view)
    {
        CollectionPlaylistItemRenderer.access$000(CollectionPlaylistItemRenderer.this).show(val$button, val$playlistItem, val$options);
    }

    I()
    {
        this$0 = final_collectionplaylistitemrenderer;
        val$button = view;
        val$playlistItem = playlistitem;
        val$options = OverflowMenuOptions.this;
        super();
    }
}
