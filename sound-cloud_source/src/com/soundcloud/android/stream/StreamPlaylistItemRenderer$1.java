// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.view.View;
import com.soundcloud.android.playlists.PlaylistItem;
import com.soundcloud.android.playlists.PlaylistItemMenuPresenter;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamPlaylistItemRenderer

class val.playlistItem
    implements Listener
{

    final StreamPlaylistItemRenderer this$0;
    final PlaylistItem val$playlistItem;

    public void onOverflow(View view)
    {
        StreamPlaylistItemRenderer.access$100(StreamPlaylistItemRenderer.this).show(view, val$playlistItem, StreamPlaylistItemRenderer.access$000(StreamPlaylistItemRenderer.this));
    }

    Listener()
    {
        this$0 = final_streamplaylistitemrenderer;
        val$playlistItem = PlaylistItem.this;
        super();
    }
}
