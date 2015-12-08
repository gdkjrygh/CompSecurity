// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.view.View;
import android.widget.ToggleButton;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionController;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistDetailFragment, PlaylistWithTracks

class this._cls0
    implements android.view.istDetailFragment._cls1
{

    final PlaylistDetailFragment this$0;

    public void onClick(View view)
    {
        if (playSessionController.shouldDisableSkipping())
        {
            PlaylistDetailFragment.access$000(PlaylistDetailFragment.this).setChecked(false);
        }
        if (playQueueManager.isCurrentCollection(PlaylistDetailFragment.access$100(PlaylistDetailFragment.this).getUrn()))
        {
            playSessionController.togglePlayback();
            return;
        } else
        {
            PlaylistDetailFragment.access$200(PlaylistDetailFragment.this);
            return;
        }
    }

    ()
    {
        this$0 = PlaylistDetailFragment.this;
        super();
    }
}
