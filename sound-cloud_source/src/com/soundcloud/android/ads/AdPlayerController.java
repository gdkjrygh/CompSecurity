// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayerUICommand;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueFunctions;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;
import rx.b;
import rx.b.f;
import rx.b.g;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsOperations

public class AdPlayerController extends DefaultActivityLightCycle
{
    private final class PlayQueueSubscriber extends DefaultSubscriber
    {

        final AdPlayerController this$0;

        public final void onNext(State state)
        {
            eventBus.publish(EventQueue.PLAYER_COMMAND, PlayerUICommand.expandPlayer());
            eventBus.publish(EventQueue.TRACKING, UIEvent.fromPlayerOpen("ad_play"));
            lastSeenAdTrack = state.trackUrn;
        }

        public final volatile void onNext(Object obj)
        {
            onNext((State)obj);
        }

        private PlayQueueSubscriber()
        {
            this$0 = AdPlayerController.this;
            super();
        }

        PlayQueueSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private static class State
    {

        private final boolean isAudioAd;
        private final int playerUIEventKind;
        private final Urn trackUrn;




        public State(boolean flag, Urn urn, int i)
        {
            isAudioAd = flag;
            trackUrn = urn;
            playerUIEventKind = i;
        }
    }


    private final AdsOperations adsOperations;
    private final g combine = new _cls3();
    private final EventBus eventBus;
    private final f isNewAudioAd = new _cls1();
    private Urn lastSeenAdTrack;
    private final rx.b.b setAdHasBeenSeen = new _cls2();
    private Y subscription;

    public AdPlayerController(EventBus eventbus, AdsOperations adsoperations)
    {
        subscription = RxUtils.invalidSubscription();
        lastSeenAdTrack = Urn.NOT_SET;
        eventBus = eventbus;
        adsOperations = adsoperations;
    }

    public volatile void onPause(Activity activity)
    {
        onPause((AppCompatActivity)activity);
    }

    public void onPause(AppCompatActivity appcompatactivity)
    {
        subscription.unsubscribe();
    }

    public volatile void onResume(Activity activity)
    {
        onResume((AppCompatActivity)activity);
    }

    public void onResume(AppCompatActivity appcompatactivity)
    {
        subscription = b.combineLatest(eventBus.queue(EventQueue.CURRENT_PLAY_QUEUE_ITEM).filter(PlayQueueFunctions.IS_TRACK_QUEUE_ITEM), eventBus.queue(EventQueue.PLAYER_UI), combine).doOnNext(setAdHasBeenSeen).filter(isNewAudioAd).subscribe(new PlayQueueSubscriber(null));
    }



/*
    static Urn access$202(AdPlayerController adplayercontroller, Urn urn)
    {
        adplayercontroller.lastSeenAdTrack = urn;
        return urn;
    }

*/



    private class _cls1
        implements f
    {

        final AdPlayerController this$0;

        public Boolean call(State state)
        {
            boolean flag;
            if (state.isAudioAd && !lastSeenAdTrack.equals(state.trackUrn))
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

        _cls1()
        {
            this$0 = AdPlayerController.this;
            super();
        }
    }


    private class _cls2
        implements rx.b.b
    {

        final AdPlayerController this$0;

        private boolean isDifferentTrack(State state)
        {
            return lastSeenAdTrack.equals(state.trackUrn);
        }

        private boolean isPlayerExpandedWithAd(State state)
        {
            return state.playerUIEventKind == 0 && state.isAudioAd;
        }

        public void call(State state)
        {
            if (isPlayerExpandedWithAd(state))
            {
                lastSeenAdTrack = state.trackUrn;
            } else
            if (!isDifferentTrack(state))
            {
                lastSeenAdTrack = Urn.NOT_SET;
                return;
            }
        }

        public volatile void call(Object obj)
        {
            call((State)obj);
        }

        _cls2()
        {
            this$0 = AdPlayerController.this;
            super();
        }
    }


    private class _cls3
        implements g
    {

        final AdPlayerController this$0;

        public State call(CurrentPlayQueueItemEvent currentplayqueueitemevent, PlayerUIEvent playeruievent)
        {
            return new State(adsOperations.isCurrentItemAudioAd(), currentplayqueueitemevent.getCurrentPlayQueueItem().getUrn(), playeruievent.getKind());
        }

        public volatile Object call(Object obj, Object obj1)
        {
            return call((CurrentPlayQueueItemEvent)obj, (PlayerUIEvent)obj1);
        }

        _cls3()
        {
            this$0 = AdPlayerController.this;
            super();
        }
    }

}
