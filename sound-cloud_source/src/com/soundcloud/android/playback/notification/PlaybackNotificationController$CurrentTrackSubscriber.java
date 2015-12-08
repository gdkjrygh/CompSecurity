// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.model.EntityProperty;
import com.soundcloud.android.playback.PlaybackService;
import com.soundcloud.android.playback.TrackQueueItem;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            PlaybackNotificationController

private static class playbackService extends DefaultSubscriber
{

    private final PlaybackService playbackService;
    private final onNext strategy;

    public void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
    {
        currentplayqueueitemevent = (TrackQueueItem)currentplayqueueitemevent.getCurrentPlayQueueItem();
        currentplayqueueitemevent = currentplayqueueitemevent.getMetaData().put(EntityProperty.URN, currentplayqueueitemevent.getTrackUrn());
        strategy.strategy(playbackService, currentplayqueueitemevent);
    }

    public volatile void onNext(Object obj)
    {
        onNext((CurrentPlayQueueItemEvent)obj);
    }

    public ( , PlaybackService playbackservice)
    {
        strategy = ;
        playbackService = playbackservice;
    }
}
