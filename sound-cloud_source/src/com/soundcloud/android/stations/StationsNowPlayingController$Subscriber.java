// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.view.adapters.NowPlayingAdapter;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsNowPlayingController

private class <init> extends DefaultSubscriber
{

    final StationsNowPlayingController this$0;

    public void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
    {
        if (StationsNowPlayingController.access$100(StationsNowPlayingController.this) != null)
        {
            StationsNowPlayingController.access$100(StationsNowPlayingController.this).updateNowPlaying(currentplayqueueitemevent.getCollectionUrn());
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((CurrentPlayQueueItemEvent)obj);
    }

    private ()
    {
        this$0 = StationsNowPlayingController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
