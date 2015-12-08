// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.tracks.LegacyUpdatePlayingTrackSubscriber;
import com.soundcloud.android.tracks.TrackItemRenderer;
import com.soundcloud.android.view.adapters.UpdateEntityListSubscriber;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.presentation:
//            ItemAdapter

public class PlayableListUpdater extends DefaultSupportFragmentLightCycle
{
    public static class Factory
    {

        private final EventBus eventBus;

        public PlayableListUpdater create(ItemAdapter itemadapter, TrackItemRenderer trackitemrenderer)
        {
            return new PlayableListUpdater(eventBus, itemadapter, trackitemrenderer);
        }

        public Factory(EventBus eventbus)
        {
            eventBus = eventbus;
        }
    }


    private final ItemAdapter adapter;
    private final EventBus eventBus;
    private b fragmentLifeCycle;
    private final TrackItemRenderer trackItemRenderer;

    public PlayableListUpdater(EventBus eventbus, ItemAdapter itemadapter, TrackItemRenderer trackitemrenderer)
    {
        eventBus = eventbus;
        adapter = itemadapter;
        trackItemRenderer = trackitemrenderer;
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        fragmentLifeCycle = new b(new Y[] {
            eventBus.subscribe(EventQueue.CURRENT_PLAY_QUEUE_ITEM, new LegacyUpdatePlayingTrackSubscriber(adapter, trackItemRenderer)), eventBus.subscribe(EventQueue.ENTITY_STATE_CHANGED, new UpdateEntityListSubscriber(adapter))
        });
    }

    public void onDestroy(Fragment fragment)
    {
        fragmentLifeCycle.unsubscribe();
        super.onDestroy(fragment);
    }
}
