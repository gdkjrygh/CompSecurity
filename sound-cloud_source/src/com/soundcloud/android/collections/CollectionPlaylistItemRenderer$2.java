// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.playlists.PlaylistItem;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionPlaylistItemRenderer

class val.playlistItem
    implements android.view.laylistItemRenderer._cls2
{

    final CollectionPlaylistItemRenderer this$0;
    final PlaylistItem val$playlistItem;

    public void onClick(View view)
    {
        CollectionPlaylistItemRenderer.access$100(CollectionPlaylistItemRenderer.this).openPlaylist(view.getContext(), val$playlistItem.getEntityUrn(), Screen.COLLECTIONS);
    }

    I()
    {
        this$0 = final_collectionplaylistitemrenderer;
        val$playlistItem = PlaylistItem.this;
        super();
    }
}
