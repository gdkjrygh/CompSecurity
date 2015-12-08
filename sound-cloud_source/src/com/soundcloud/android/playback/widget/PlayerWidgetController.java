// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import android.content.Context;
import com.soundcloud.android.analytics.EngagementsTracking;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.likes.LikeOperations;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueFunctions;
import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.android.playback.TrackQueueItem;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.PropertySetFunctions;
import com.soundcloud.rx.eventbus.EventBus;
import rx.a.b.a;
import rx.b;
import rx.b.f;
import rx.g.m;
import rx.internal.util.q;

// Referenced classes of package com.soundcloud.android.playback.widget:
//            PlayerWidgetPresenter

public class PlayerWidgetController
{
    private class CurrentTrackSubscriber extends DefaultSubscriber
    {

        final PlayerWidgetController this$0;

        public void onNext(PropertySet propertyset)
        {
            presenter.updateTrackInformation(context, propertyset);
        }

        public volatile void onNext(Object obj)
        {
            onNext((PropertySet)obj);
        }

        private CurrentTrackSubscriber()
        {
            this$0 = PlayerWidgetController.this;
            super();
        }

        CurrentTrackSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class CurrentUserChangedSubscriber extends DefaultSubscriber
    {

        final PlayerWidgetController this$0;

        public final void onNext(CurrentUserChangedEvent currentuserchangedevent)
        {
            if (currentuserchangedevent.getKind() == 1)
            {
                presenter.reset(context);
            }
        }

        public final volatile void onNext(Object obj)
        {
            onNext((CurrentUserChangedEvent)obj);
        }

        private CurrentUserChangedSubscriber()
        {
            this$0 = PlayerWidgetController.this;
            super();
        }

        CurrentUserChangedSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class PlaybackStateSubscriber extends DefaultSubscriber
    {

        final PlayerWidgetController this$0;

        public void onNext(com.soundcloud.android.playback.Player.StateTransition statetransition)
        {
            presenter.updatePlayState(context, statetransition.playSessionIsActive());
        }

        public volatile void onNext(Object obj)
        {
            onNext((com.soundcloud.android.playback.Player.StateTransition)obj);
        }

        private PlaybackStateSubscriber()
        {
            this$0 = PlayerWidgetController.this;
            super();
        }

        PlaybackStateSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class TrackChangedSubscriber extends DefaultSubscriber
    {

        final PlayerWidgetController this$0;

        public final void onNext(EntityStateChangedEvent entitystatechangedevent)
        {
            if (!playQueueManager.isQueueEmpty() && playQueueManager.isCurrentTrack(entitystatechangedevent.getFirstUrn()))
            {
                updatePlayableInformation(PropertySetFunctions.mergeWith(entitystatechangedevent.getNextChangeSet()));
            }
        }

        public final volatile void onNext(Object obj)
        {
            onNext((EntityStateChangedEvent)obj);
        }

        private TrackChangedSubscriber()
        {
            this$0 = PlayerWidgetController.this;
            super();
        }

        TrackChangedSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    public static final String ACTION_LIKE_CHANGED = "com.soundcloud.android.widgetLike";
    public static final String EXTRA_ADD_LIKE = "isLike";
    private final Context context;
    private final EngagementsTracking engagementsTracking;
    private final EventBus eventBus;
    private final LikeOperations likeOperations;
    private final f onPlayQueueEventFunc = new _cls1();
    private final PlayQueueManager playQueueManager;
    private final PlaySessionStateProvider playSessionsStateProvider;
    private final PlayerWidgetPresenter presenter;
    private final TrackRepository trackRepository;

    public PlayerWidgetController(Context context1, PlayerWidgetPresenter playerwidgetpresenter, PlaySessionStateProvider playsessionstateprovider, PlayQueueManager playqueuemanager, TrackRepository trackrepository, EventBus eventbus, LikeOperations likeoperations, 
            EngagementsTracking engagementstracking)
    {
        context = context1;
        presenter = playerwidgetpresenter;
        playSessionsStateProvider = playsessionstateprovider;
        playQueueManager = playqueuemanager;
        trackRepository = trackrepository;
        eventBus = eventbus;
        likeOperations = likeoperations;
        engagementsTracking = engagementstracking;
    }

    private b loadTrackWithAdMeta(TrackQueueItem trackqueueitem)
    {
        return trackRepository.track(trackqueueitem.getTrackUrn()).map(PropertySetFunctions.mergeWith(trackqueueitem.getMetaData()));
    }

    private void updatePlayState()
    {
        presenter.updatePlayState(context, playSessionsStateProvider.isPlaying());
    }

    private void updatePlayableInformation(f f)
    {
        if (playQueueManager.getCurrentPlayQueueItem().isTrack())
        {
            loadTrackWithAdMeta((TrackQueueItem)playQueueManager.getCurrentPlayQueueItem()).map(f).subscribe(new CurrentTrackSubscriber(null));
            return;
        } else
        {
            presenter.reset(context);
            return;
        }
    }

    public void handleToggleLikeAction(boolean flag)
    {
        Object obj = playQueueManager.getCurrentPlayQueueItem();
        if (((PlayQueueItem) (obj)).isTrack())
        {
            obj = ((PlayQueueItem) (obj)).getUrn();
            DefaultSubscriber.fireAndForget(likeOperations.toggleLike(((Urn) (obj)), flag));
            engagementsTracking.likeTrackUrn(((Urn) (obj)), flag, Screen.WIDGET.get(), playQueueManager.getScreenTag(), Screen.WIDGET.get(), Urn.NOT_SET, playQueueManager.getCurrentPromotedSourceInfo(((Urn) (obj))));
            return;
        } else
        {
            ErrorUtils.handleSilentException(new IllegalStateException("Tried to like a track from widget with invalid playQueue item"));
            return;
        }
    }

    public void subscribe()
    {
        eventBus.subscribe(EventQueue.ENTITY_STATE_CHANGED, new TrackChangedSubscriber(null));
        eventBus.subscribe(EventQueue.CURRENT_USER_CHANGED, new CurrentUserChangedSubscriber(null));
        eventBus.subscribe(EventQueue.PLAYBACK_STATE_CHANGED, new PlaybackStateSubscriber(null));
        eventBus.queue(EventQueue.CURRENT_PLAY_QUEUE_ITEM).filter(PlayQueueFunctions.IS_TRACK_QUEUE_ITEM).map(PlayQueueFunctions.TO_TRACK_QUEUE_ITEM).flatMap(onPlayQueueEventFunc).observeOn(a.a()).subscribe(new CurrentTrackSubscriber(null));
    }

    public void update()
    {
        updatePlayState();
        updatePlayableInformation(q.b());
    }






    private class _cls1
        implements f
    {

        final PlayerWidgetController this$0;

        public volatile Object call(Object obj)
        {
            return call((TrackQueueItem)obj);
        }

        public b call(TrackQueueItem trackqueueitem)
        {
            return loadTrackWithAdMeta(trackqueueitem);
        }

        _cls1()
        {
            this$0 = PlayerWidgetController.this;
            super();
        }
    }

}
