// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.widget.ToggleButton;
import com.soundcloud.android.playback.ShowPlayerSubscriber;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistDetailFragment

private final class this._cls0 extends ShowPlayerSubscriber
{

    final PlaylistDetailFragment this$0;

    public final void onError(Throwable throwable)
    {
        super.onError(throwable);
        if (throwable instanceof IllegalStateException)
        {
            PlaylistDetailFragment.access$000(PlaylistDetailFragment.this).setChecked(false);
        }
    }

    public (EventBus eventbus)
    {
        this$0 = PlaylistDetailFragment.this;
        super(eventbus, playbackToastHelper);
    }
}
