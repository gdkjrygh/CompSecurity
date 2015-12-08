// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.ads.AdConstants;
import com.soundcloud.android.events.PlaybackProgressEvent;
import com.soundcloud.android.playback.PlaybackProgress;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPresenter

class this._cls0
    implements f
{

    final PlayerPresenter this$0;

    public Boolean call(PlaybackProgressEvent playbackprogressevent)
    {
        boolean flag;
        if (playbackprogressevent.getPlaybackProgress().getPosition() >= AdConstants.UNSKIPPABLE_TIME_MS)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((PlaybackProgressEvent)obj);
    }

    ()
    {
        this$0 = PlayerPresenter.this;
        super();
    }
}
