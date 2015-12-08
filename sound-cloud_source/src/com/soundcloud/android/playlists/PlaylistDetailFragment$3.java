// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.widget.ToggleButton;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistDetailFragment

class t> extends DefaultSubscriber
{

    final PlaylistDetailFragment this$0;

    public void onNext(com.soundcloud.android.playback. )
    {
        ToggleButton togglebutton = PlaylistDetailFragment.access$000(PlaylistDetailFragment.this);
        boolean flag;
        if (playQueueManager.isCurrentCollection(PlaylistDetailFragment.access$300(PlaylistDetailFragment.this)) && .aySessionIsActive())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        togglebutton.setChecked(flag);
    }

    public volatile void onNext(Object obj)
    {
        onNext((com.soundcloud.android.playback..onNext)obj);
    }

    ()
    {
        this$0 = PlaylistDetailFragment.this;
        super();
    }
}
