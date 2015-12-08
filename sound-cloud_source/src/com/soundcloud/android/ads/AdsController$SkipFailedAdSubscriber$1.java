// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.events.AudioAdFailedToBufferEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsController

class val.state extends DefaultSubscriber
{

    final onNext this$1;
    final com.soundcloud.android.playback.t val$state;

    public void onNext(Long long1)
    {
        long1 = new AudioAdFailedToBufferEvent(val$state.tate(), val$state.tate(), 6);
        AdsController.access$1500(_fld0).publish(EventQueue.TRACKING, long1);
        AdsController.access$000(_fld0).autoNextItem();
    }

    public volatile void onNext(Object obj)
    {
        onNext((Long)obj);
    }

    ()
    {
        this$1 = final_;
        val$state = com.soundcloud.android.playback.tate.this;
        super();
    }
}
