// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.EntityProperty;
import com.soundcloud.android.playback.PlayQueueFunctions;
import com.soundcloud.android.playback.PlaybackService;
import com.soundcloud.android.playback.TrackQueueItem;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;
import rx.g.m;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            BackgroundPlaybackNotificationController, ForegroundPlaybackNotificationController

public class PlaybackNotificationController extends DefaultActivityLightCycle
{
    private static class CurrentTrackSubscriber extends DefaultSubscriber
    {

        private final PlaybackService playbackService;
        private final Strategy strategy;

        public void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            currentplayqueueitemevent = (TrackQueueItem)currentplayqueueitemevent.getCurrentPlayQueueItem();
            currentplayqueueitemevent = currentplayqueueitemevent.getMetaData().put(EntityProperty.URN, currentplayqueueitemevent.getTrackUrn());
            strategy.setTrack(playbackService, currentplayqueueitemevent);
        }

        public volatile void onNext(Object obj)
        {
            onNext((CurrentPlayQueueItemEvent)obj);
        }

        public CurrentTrackSubscriber(Strategy strategy1, PlaybackService playbackservice)
        {
            strategy = strategy1;
            playbackService = playbackservice;
        }
    }

    private static class PlaybackStateSubscriber extends DefaultSubscriber
    {

        private final PlaybackService playbackService;
        private final Strategy strategy;

        public void onNext(com.soundcloud.android.playback.Player.StateTransition statetransition)
        {
            if (statetransition.playSessionIsActive())
            {
                strategy.notifyPlaying(playbackService);
                return;
            } else
            {
                strategy.notifyIdleState(playbackService);
                return;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((com.soundcloud.android.playback.Player.StateTransition)obj);
        }

        public PlaybackStateSubscriber(PlaybackService playbackservice, Strategy strategy1)
        {
            playbackService = playbackservice;
            strategy = strategy1;
        }
    }

    static interface Strategy
    {

        public abstract void clear(PlaybackService playbackservice);

        public abstract void notifyIdleState(PlaybackService playbackservice);

        public abstract void notifyPlaying(PlaybackService playbackservice);

        public abstract void setTrack(PlaybackService playbackservice, PropertySet propertyset);
    }


    private static final int DEFAULT_DELAY_MILLIS = 300;
    private Strategy activeStrategy;
    private final Strategy backgroundStrategy;
    private final int delayMillis;
    private final EventBus eventBus;
    private final Strategy foregroundStrategy;
    private final Handler handler;
    private PlaybackService playbackService;
    private Y subscriptions;

    public PlaybackNotificationController(EventBus eventbus, BackgroundPlaybackNotificationController backgroundplaybacknotificationcontroller, ForegroundPlaybackNotificationController foregroundplaybacknotificationcontroller)
    {
        this(eventbus, backgroundplaybacknotificationcontroller, foregroundplaybacknotificationcontroller, 300);
    }

    public PlaybackNotificationController(EventBus eventbus, BackgroundPlaybackNotificationController backgroundplaybacknotificationcontroller, ForegroundPlaybackNotificationController foregroundplaybacknotificationcontroller, int i)
    {
        subscriptions = RxUtils.invalidSubscription();
        eventBus = eventbus;
        backgroundStrategy = backgroundplaybacknotificationcontroller;
        foregroundStrategy = foregroundplaybacknotificationcontroller;
        activeStrategy = backgroundplaybacknotificationcontroller;
        delayMillis = i;
        handler = new Handler();
    }

    private Runnable createSwitchStrategyToRunnable(final Strategy nextStrategy)
    {
        return new _cls1();
    }

    private void delayedSwitchStrategyTo(Strategy strategy)
    {
        if (delayMillis > 0)
        {
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(createSwitchStrategyToRunnable(strategy), delayMillis);
            return;
        } else
        {
            switchStrategyTo(strategy);
            return;
        }
    }

    private boolean hasRunningPlaybackService()
    {
        return playbackService != null;
    }

    private void startStrategy()
    {
        subscriptions.unsubscribe();
        subscriptions = new b(new Y[] {
            eventBus.queue(EventQueue.CURRENT_PLAY_QUEUE_ITEM).filter(PlayQueueFunctions.IS_TRACK_QUEUE_ITEM).subscribe(new CurrentTrackSubscriber(activeStrategy, playbackService)), eventBus.queue(EventQueue.PLAYBACK_STATE_CHANGED).subscribe(new PlaybackStateSubscriber(playbackService, activeStrategy))
        });
    }

    private void switchStrategyTo(Strategy strategy)
    {
        Strategy strategy1 = activeStrategy;
        activeStrategy = strategy;
        if (hasRunningPlaybackService())
        {
            strategy1.clear(playbackService);
            startStrategy();
        }
    }

    public volatile void onPause(Activity activity)
    {
        onPause((AppCompatActivity)activity);
    }

    public void onPause(AppCompatActivity appcompatactivity)
    {
        delayedSwitchStrategyTo(backgroundStrategy);
    }

    public volatile void onResume(Activity activity)
    {
        onResume((AppCompatActivity)activity);
    }

    public void onResume(AppCompatActivity appcompatactivity)
    {
        delayedSwitchStrategyTo(foregroundStrategy);
    }

    public void subscribe(PlaybackService playbackservice)
    {
        if (!hasRunningPlaybackService())
        {
            playbackService = playbackservice;
            startStrategy();
        }
    }

    public void unsubscribe()
    {
        subscriptions.unsubscribe();
        if (hasRunningPlaybackService())
        {
            activeStrategy.clear(playbackService);
            playbackService = null;
        }
    }


    private class _cls1
        implements Runnable
    {

        final PlaybackNotificationController this$0;
        final Strategy val$nextStrategy;

        public void run()
        {
            switchStrategyTo(nextStrategy);
        }

        _cls1()
        {
            this$0 = PlaybackNotificationController.this;
            nextStrategy = strategy;
            super();
        }
    }

}
