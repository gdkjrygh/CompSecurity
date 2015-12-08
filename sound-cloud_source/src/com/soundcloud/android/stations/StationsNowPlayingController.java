// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.support.v4.app.Fragment;
import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.view.adapters.NowPlayingAdapter;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;

class StationsNowPlayingController extends DefaultSupportFragmentLightCycle
{
    private class Subscriber extends DefaultSubscriber
    {

        final StationsNowPlayingController this$0;

        public void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            if (adapter != null)
            {
                adapter.updateNowPlaying(currentplayqueueitemevent.getCollectionUrn());
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((CurrentPlayQueueItemEvent)obj);
        }

        private Subscriber()
        {
            this$0 = StationsNowPlayingController.this;
            super();
        }

        Subscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private NowPlayingAdapter adapter;
    private final EventBus eventBus;
    private Y subscription;

    StationsNowPlayingController(EventBus eventbus)
    {
        subscription = RxUtils.invalidSubscription();
        eventBus = eventbus;
    }

    public void onPause(Fragment fragment)
    {
        subscription.unsubscribe();
    }

    public void onResume(Fragment fragment)
    {
        subscription = eventBus.subscribe(EventQueue.CURRENT_PLAY_QUEUE_ITEM, new Subscriber(null));
    }

    void setAdapter(NowPlayingAdapter nowplayingadapter)
    {
        adapter = nowplayingadapter;
    }

}
