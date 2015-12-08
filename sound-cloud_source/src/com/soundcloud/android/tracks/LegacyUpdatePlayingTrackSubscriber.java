// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.presentation.ItemAdapter;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItemRenderer

public final class LegacyUpdatePlayingTrackSubscriber extends DefaultSubscriber
{

    private final ItemAdapter adapter;
    private final TrackItemRenderer trackRenderer;

    public LegacyUpdatePlayingTrackSubscriber(ItemAdapter itemadapter, TrackItemRenderer trackitemrenderer)
    {
        adapter = itemadapter;
        trackRenderer = trackitemrenderer;
    }

    public final void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
    {
        currentplayqueueitemevent = currentplayqueueitemevent.getCurrentPlayQueueItem();
        trackRenderer.setPlayingTrack(currentplayqueueitemevent.getUrnOrNotSet());
        adapter.notifyDataSetChanged();
    }

    public final volatile void onNext(Object obj)
    {
        onNext((CurrentPlayQueueItemEvent)obj);
    }
}
