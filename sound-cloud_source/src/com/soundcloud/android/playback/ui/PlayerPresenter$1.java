// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPresenter

class this._cls0
    implements f
{

    final PlayerPresenter this$0;

    public Boolean call(CurrentPlayQueueItemEvent currentplayqueueitemevent)
    {
        return Boolean.valueOf(PlayerPresenter.access$000(PlayerPresenter.this).isCurrentItemAudioAd());
    }

    public volatile Object call(Object obj)
    {
        return call((CurrentPlayQueueItemEvent)obj);
    }

    nt()
    {
        this$0 = PlayerPresenter.this;
        super();
    }
}
