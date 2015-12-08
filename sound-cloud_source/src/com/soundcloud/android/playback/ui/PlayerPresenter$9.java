// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.events.PlaybackProgressEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPresenter

class  extends DefaultSubscriber
{

    final PlayerPresenter this$0;

    public void onNext(PlaybackProgressEvent playbackprogressevent)
    {
        PlayerPresenter.access$1900(PlayerPresenter.this);
    }

    public volatile void onNext(Object obj)
    {
        onNext((PlaybackProgressEvent)obj);
    }

    ()
    {
        this$0 = PlayerPresenter.this;
        super();
    }
}
