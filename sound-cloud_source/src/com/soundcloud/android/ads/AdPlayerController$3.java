// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.events.PlayerUIEvent;
import com.soundcloud.android.playback.PlayQueueItem;
import rx.b.g;

// Referenced classes of package com.soundcloud.android.ads:
//            AdPlayerController, AdsOperations

class this._cls0
    implements g
{

    final AdPlayerController this$0;

    public ate call(CurrentPlayQueueItemEvent currentplayqueueitemevent, PlayerUIEvent playeruievent)
    {
        return new ate(AdPlayerController.access$400(AdPlayerController.this).isCurrentItemAudioAd(), currentplayqueueitemevent.getCurrentPlayQueueItem().getUrn(), playeruievent.getKind());
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call((CurrentPlayQueueItemEvent)obj, (PlayerUIEvent)obj1);
    }

    ate()
    {
        this$0 = AdPlayerController.this;
        super();
    }
}
