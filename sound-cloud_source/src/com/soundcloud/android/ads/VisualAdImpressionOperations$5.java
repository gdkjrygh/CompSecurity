// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.events.ActivityLifeCycleEvent;
import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.events.PlayerUIEvent;
import com.soundcloud.android.playback.PlayQueueItem;
import rx.b.h;

// Referenced classes of package com.soundcloud.android.ads:
//            VisualAdImpressionOperations, AdsOperations

class this._cls0
    implements h
{

    final VisualAdImpressionOperations this$0;

    public ate call(ActivityLifeCycleEvent activitylifecycleevent, CurrentPlayQueueItemEvent currentplayqueueitemevent, PlayerUIEvent playeruievent)
    {
        boolean flag1 = true;
        currentplayqueueitemevent = currentplayqueueitemevent.getCurrentPlayQueueItem().getUrn();
        boolean flag;
        boolean flag2;
        if (activitylifecycleevent.getKind() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = VisualAdImpressionOperations.access$700(VisualAdImpressionOperations.this).isCurrentItemAudioAd();
        if (playeruievent.getKind() != 0)
        {
            flag1 = false;
        }
        return new ate(currentplayqueueitemevent, flag, flag2, flag1);
    }

    public volatile Object call(Object obj, Object obj1, Object obj2)
    {
        return call((ActivityLifeCycleEvent)obj, (CurrentPlayQueueItemEvent)obj1, (PlayerUIEvent)obj2);
    }

    ate()
    {
        this$0 = VisualAdImpressionOperations.this;
        super();
    }
}
