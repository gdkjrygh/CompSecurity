// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.view.adapters.NowPlayingAdapter;

public final class UpdatePlayingTrackSubscriber extends DefaultSubscriber
{

    private final NowPlayingAdapter adapter;

    public UpdatePlayingTrackSubscriber(NowPlayingAdapter nowplayingadapter)
    {
        adapter = nowplayingadapter;
    }

    public final void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
    {
        currentplayqueueitemevent = currentplayqueueitemevent.getCurrentPlayQueueItem();
        adapter.updateNowPlaying(currentplayqueueitemevent.getUrnOrNotSet());
    }

    public final volatile void onNext(Object obj)
    {
        onNext((CurrentPlayQueueItemEvent)obj);
    }
}
