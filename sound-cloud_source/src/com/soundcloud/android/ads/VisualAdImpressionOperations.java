// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueFunctions;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.rx.eventbus.EventBus;
import rx.b;
import rx.b.f;
import rx.b.h;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsOperations

public class VisualAdImpressionOperations
{
    private static final class State
    {

        private final boolean currentTrackIsAnAudioAd;
        private final Urn currentTrackUrn;
        private final boolean isAppInForeground;
        private final boolean playerIsExpanding;





        public State(Urn urn, boolean flag, boolean flag1, boolean flag2)
        {
            currentTrackUrn = urn;
            isAppInForeground = flag;
            currentTrackIsAnAudioAd = flag1;
            playerIsExpanding = flag2;
        }
    }


    private final AccountOperations accountOperations;
    private final m activityLifeCycleQueue;
    private final AdsOperations adsOperations;
    private final h combineFunction = new _cls5();
    private final b currentTrackQueue;
    private boolean impressionEventEmitted;
    private final f isAdVisible = new _cls4();
    private final rx.b.b lockCurrentImpression = new _cls2();
    private final PlayQueueManager playQueueManager;
    private final m playerUIEventQueue;
    private final f toTrackingEvent = new _cls1();
    private final rx.b.b unlockCurrentImpression = new _cls3();

    public VisualAdImpressionOperations(EventBus eventbus, PlayQueueManager playqueuemanager, AccountOperations accountoperations, AdsOperations adsoperations)
    {
        playQueueManager = playqueuemanager;
        accountOperations = accountoperations;
        adsOperations = adsoperations;
        activityLifeCycleQueue = eventbus.queue(EventQueue.ACTIVITY_LIFE_CYCLE);
        currentTrackQueue = eventbus.queue(EventQueue.CURRENT_PLAY_QUEUE_ITEM).filter(PlayQueueFunctions.IS_TRACK_QUEUE_ITEM);
        playerUIEventQueue = eventbus.queue(EventQueue.PLAYER_UI);
    }

    public b trackImpression()
    {
        return b.combineLatest(activityLifeCycleQueue, currentTrackQueue.doOnNext(unlockCurrentImpression), playerUIEventQueue, combineFunction).filter(isAdVisible).map(toTrackingEvent).doOnNext(lockCurrentImpression);
    }





/*
    static boolean access$302(VisualAdImpressionOperations visualadimpressionoperations, boolean flag)
    {
        visualadimpressionoperations.impressionEventEmitted = flag;
        return flag;
    }

*/


    private class _cls1
        implements f
    {

        final VisualAdImpressionOperations this$0;

        public VisualAdImpressionEvent call(State state)
        {
            return new VisualAdImpressionEvent(playQueueManager.getCurrentPlayQueueItem().getMetaData(), state.currentTrackUrn, accountOperations.getLoggedInUserUrn(), playQueueManager.getCurrentTrackSourceInfo());
        }

        public volatile Object call(Object obj)
        {
            return call((State)obj);
        }

        _cls1()
        {
            this$0 = VisualAdImpressionOperations.this;
            super();
        }
    }


    private class _cls2
        implements rx.b.b
    {

        final VisualAdImpressionOperations this$0;

        public void call(TrackingEvent trackingevent)
        {
            impressionEventEmitted = true;
        }

        public volatile void call(Object obj)
        {
            call((TrackingEvent)obj);
        }

        _cls2()
        {
            this$0 = VisualAdImpressionOperations.this;
            super();
        }
    }


    private class _cls3
        implements rx.b.b
    {

        final VisualAdImpressionOperations this$0;

        public void call(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            impressionEventEmitted = false;
        }

        public volatile void call(Object obj)
        {
            call((CurrentPlayQueueItemEvent)obj);
        }

        _cls3()
        {
            this$0 = VisualAdImpressionOperations.this;
            super();
        }
    }


    private class _cls4
        implements f
    {

        final VisualAdImpressionOperations this$0;

        public Boolean call(State state)
        {
            boolean flag;
            if (!impressionEventEmitted && state.currentTrackIsAnAudioAd && state.playerIsExpanding && state.isAppInForeground)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public volatile Object call(Object obj)
        {
            return call((State)obj);
        }

        _cls4()
        {
            this$0 = VisualAdImpressionOperations.this;
            super();
        }
    }


    private class _cls5
        implements h
    {

        final VisualAdImpressionOperations this$0;

        public State call(ActivityLifeCycleEvent activitylifecycleevent, CurrentPlayQueueItemEvent currentplayqueueitemevent, PlayerUIEvent playeruievent)
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
            flag2 = adsOperations.isCurrentItemAudioAd();
            if (playeruievent.getKind() != 0)
            {
                flag1 = false;
            }
            return new State(currentplayqueueitemevent, flag, flag2, flag1);
        }

        public volatile Object call(Object obj, Object obj1, Object obj2)
        {
            return call((ActivityLifeCycleEvent)obj, (CurrentPlayQueueItemEvent)obj1, (PlayerUIEvent)obj2);
        }

        _cls5()
        {
            this$0 = VisualAdImpressionOperations.this;
            super();
        }
    }

}
