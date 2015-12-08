// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.peripherals;

import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.strings.Strings;
import com.soundcloud.rx.eventbus.EventBus;
import rx.b;
import rx.g.m;

public class PeripheralsController
{
    private class CurrentTrackSubscriber extends DefaultSubscriber
    {

        final PeripheralsController this$0;

        public void onNext(PropertySet propertyset)
        {
            notifyPlayQueueChanged(propertyset);
        }

        public volatile void onNext(Object obj)
        {
            onNext((PropertySet)obj);
        }

        private CurrentTrackSubscriber()
        {
            this$0 = PeripheralsController.this;
            super();
        }

        CurrentTrackSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class CurrentUserChangedSubscriber extends DefaultSubscriber
    {

        final PeripheralsController this$0;

        public void onNext(CurrentUserChangedEvent currentuserchangedevent)
        {
            resetTrackInformation();
        }

        public volatile void onNext(Object obj)
        {
            onNext((CurrentUserChangedEvent)obj);
        }

        private CurrentUserChangedSubscriber()
        {
            this$0 = PeripheralsController.this;
            super();
        }

        CurrentUserChangedSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class PlayQueueChangedSubscriber extends DefaultSubscriber
    {

        final PeripheralsController this$0;

        public void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            currentplayqueueitemevent = currentplayqueueitemevent.getCurrentPlayQueueItem();
            if (currentplayqueueitemevent.isTrack())
            {
                trackRepository.track(currentplayqueueitemevent.getUrn()).subscribe(new CurrentTrackSubscriber(null));
                return;
            } else
            {
                resetTrackInformation();
                return;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((CurrentPlayQueueItemEvent)obj);
        }

        private PlayQueueChangedSubscriber()
        {
            this$0 = PeripheralsController.this;
            super();
        }

        PlayQueueChangedSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class PlayStateChangedSubscriber extends DefaultSubscriber
    {

        final PeripheralsController this$0;

        public void onNext(com.soundcloud.android.playback.Player.StateTransition statetransition)
        {
            notifyPlayStateChanged(statetransition.playSessionIsActive());
        }

        public volatile void onNext(Object obj)
        {
            onNext((com.soundcloud.android.playback.Player.StateTransition)obj);
        }

        private PlayStateChangedSubscriber()
        {
            this$0 = PeripheralsController.this;
            super();
        }

        PlayStateChangedSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final String AVRCP_META_CHANGED = "com.android.music.metachanged";
    private static final String AVRCP_PLAYSTATE_CHANGED = "com.android.music.playstatechanged";
    private final Context context;
    private final EventBus eventBus;
    private final TrackRepository trackRepository;

    public PeripheralsController(Context context1, EventBus eventbus, TrackRepository trackrepository)
    {
        context = context1;
        eventBus = eventbus;
        trackRepository = trackrepository;
    }

    private String getSafeClippedString(String s, int i)
    {
        if (Strings.isBlank(s))
        {
            return "";
        } else
        {
            return ScTextUtils.getClippedString(s, i);
        }
    }

    private void notifyPlayQueueChanged(PropertySet propertyset)
    {
        Intent intent = new Intent("com.android.music.metachanged");
        intent.putExtra("id", ((Urn)propertyset.get(TrackProperty.URN)).getNumericId());
        intent.putExtra("track", ScTextUtils.getClippedString((String)propertyset.get(PlayableProperty.TITLE), 40));
        intent.putExtra("duration", ((Long)propertyset.get(PlayableProperty.DURATION)).longValue());
        intent.putExtra("artist", getSafeClippedString((String)propertyset.get(PlayableProperty.CREATOR_NAME), 30));
        context.sendBroadcast(intent);
    }

    private void notifyPlayStateChanged(boolean flag)
    {
        Intent intent = new Intent("com.android.music.playstatechanged");
        intent.putExtra("playing", flag);
        context.sendBroadcast(intent);
    }

    private void resetTrackInformation()
    {
        Intent intent = new Intent("com.android.music.metachanged");
        intent.putExtra("id", "");
        intent.putExtra("track", "");
        intent.putExtra("duration", 0);
        intent.putExtra("artist", "");
        context.sendBroadcast(intent);
    }

    public void subscribe()
    {
        eventBus.subscribe(EventQueue.CURRENT_USER_CHANGED, new CurrentUserChangedSubscriber(null));
        eventBus.subscribe(EventQueue.PLAYBACK_STATE_CHANGED, new PlayStateChangedSubscriber(null));
        eventBus.queue(EventQueue.CURRENT_PLAY_QUEUE_ITEM).subscribe(new PlayQueueChangedSubscriber(null));
    }




}
