// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import android.view.View;
import com.soundcloud.android.playlists.PlaylistItem;
import com.soundcloud.android.playlists.PlaylistItemMenuPresenter;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            PlaylistItemRenderer

class val.playlist
    implements android.view..PlaylistItemRenderer._cls1
{

    final PlaylistItemRenderer this$0;
    final View val$button;
    final PlaylistItem val$playlist;

    public void onClick(View view)
    {
        PlaylistItemRenderer.access$100(PlaylistItemRenderer.this).show(val$button, val$playlist, PlaylistItemRenderer.access$000(PlaylistItemRenderer.this));
    }

    A()
    {
        this$0 = final_playlistitemrenderer;
        val$button = view;
        val$playlist = PlaylistItem.this;
        super();
    }
}
