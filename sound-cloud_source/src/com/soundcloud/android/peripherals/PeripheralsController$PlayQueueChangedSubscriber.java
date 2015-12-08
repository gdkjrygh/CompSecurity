// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.peripherals;

import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.tracks.TrackRepository;
import rx.b;

// Referenced classes of package com.soundcloud.android.peripherals:
//            PeripheralsController

private class <init> extends DefaultSubscriber
{

    final PeripheralsController this$0;

    public void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
    {
        currentplayqueueitemevent = currentplayqueueitemevent.getCurrentPlayQueueItem();
        if (currentplayqueueitemevent.isTrack())
        {
            PeripheralsController.access$600(PeripheralsController.this).track(currentplayqueueitemevent.getUrn()).subscribe(new t>(PeripheralsController.this, null));
            return;
        } else
        {
            PeripheralsController.access$300(PeripheralsController.this);
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((CurrentPlayQueueItemEvent)obj);
    }

    private Y()
    {
        this$0 = PeripheralsController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
