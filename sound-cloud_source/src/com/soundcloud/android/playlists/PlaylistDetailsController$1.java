// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.presentation.ListItemAdapter;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistDetailsController

class this._cls0
    implements com.soundcloud.android.util.k
{

    final PlaylistDetailsController this$0;

    public void onAnimationComplete(int i)
    {
        PlaylistDetailsController.access$000(PlaylistDetailsController.this).removeItem(i);
        PlaylistDetailsController.access$000(PlaylistDetailsController.this).notifyDataSetChanged();
        PlaylistDetailsController.access$100(PlaylistDetailsController.this).onPlaylistContentChanged();
    }

    stener()
    {
        this$0 = PlaylistDetailsController.this;
        super();
    }
}
