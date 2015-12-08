// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.events.PlaybackProgressEvent;
import com.soundcloud.android.playback.PlayQueueManager;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerPresenter

class this._cls0
    implements f
{

    final PlayerPagerPresenter this$0;

    public Boolean call(PlaybackProgressEvent playbackprogressevent)
    {
        return Boolean.valueOf(PlayerPagerPresenter.access$000(PlayerPagerPresenter.this).isCurrentTrack(playbackprogressevent.getTrackUrn()));
    }

    public volatile Object call(Object obj)
    {
        return call((PlaybackProgressEvent)obj);
    }

    ()
    {
        this$0 = PlayerPagerPresenter.this;
        super();
    }
}
