// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.sync.SyncResult;
import com.soundcloud.rx.eventbus.Queue;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.events:
//            PlaybackProgressEvent, ActivityLifeCycleEvent, PlayerLifeCycleEvent, CurrentUserChangedEvent, 
//            PlayerUIEvent, PlayerUICommand, PlayQueueEvent, CurrentPlayQueueItemEvent, 
//            AdOverlayEvent, EntityStateChangedEvent, CurrentDownloadEvent, UploadEvent, 
//            PolicyUpdateEvent, TrackingEvent, PlaybackPerformanceEvent, PlaybackErrorEvent, 
//            OnboardingEvent

public final class EventQueue
{

    public static final Queue ACTIVITY_LIFE_CYCLE;
    public static final Queue AD_OVERLAY;
    public static final Queue CURRENT_DOWNLOAD;
    public static final Queue CURRENT_PLAY_QUEUE_ITEM;
    public static final Queue CURRENT_USER_CHANGED;
    public static final Queue ENTITY_STATE_CHANGED;
    public static final Queue ONBOARDING;
    private static final b ON_ERROR;
    public static final Queue PLAYBACK_ERROR;
    public static final Queue PLAYBACK_PERFORMANCE;
    public static final Queue PLAYBACK_PROGRESS;
    public static final Queue PLAYBACK_STATE_CHANGED;
    public static final Queue PLAYER_COMMAND;
    public static final Queue PLAYER_LIFE_CYCLE;
    public static final Queue PLAYER_UI;
    public static final Queue PLAY_QUEUE;
    public static final Queue POLICY_UPDATES;
    public static final Queue SYNC_RESULT;
    public static final Queue TRACKING;
    public static final Queue UPLOAD;

    public EventQueue()
    {
    }

    static 
    {
        ON_ERROR = new _cls1();
        PLAYBACK_STATE_CHANGED = Queue.of(com/soundcloud/android/playback/Player$StateTransition).onError(ON_ERROR).replay(com.soundcloud.android.playback.Player.StateTransition.DEFAULT).get();
        PLAYBACK_PROGRESS = Queue.of(com/soundcloud/android/events/PlaybackProgressEvent).onError(ON_ERROR).get();
        ACTIVITY_LIFE_CYCLE = Queue.of(com/soundcloud/android/events/ActivityLifeCycleEvent).onError(ON_ERROR).get();
        PLAYER_LIFE_CYCLE = Queue.of(com/soundcloud/android/events/PlayerLifeCycleEvent).onError(ON_ERROR).replay(PlayerLifeCycleEvent.forDestroyed()).get();
        CURRENT_USER_CHANGED = Queue.of(com/soundcloud/android/events/CurrentUserChangedEvent).onError(ON_ERROR).get();
        PLAYER_UI = Queue.of(com/soundcloud/android/events/PlayerUIEvent).onError(ON_ERROR).replay().get();
        PLAYER_COMMAND = Queue.of(com/soundcloud/android/events/PlayerUICommand).onError(ON_ERROR).get();
        PLAY_QUEUE = Queue.of(com/soundcloud/android/events/PlayQueueEvent).onError(ON_ERROR).get();
        CURRENT_PLAY_QUEUE_ITEM = Queue.of(com/soundcloud/android/events/CurrentPlayQueueItemEvent).onError(ON_ERROR).replay().get();
        AD_OVERLAY = Queue.of(com/soundcloud/android/events/AdOverlayEvent).onError(ON_ERROR).replay().get();
        SYNC_RESULT = Queue.of(com/soundcloud/android/sync/SyncResult).onError(ON_ERROR).replay().get();
        ENTITY_STATE_CHANGED = Queue.of(com/soundcloud/android/events/EntityStateChangedEvent).onError(ON_ERROR).get();
        CURRENT_DOWNLOAD = Queue.of(com/soundcloud/android/events/CurrentDownloadEvent).onError(ON_ERROR).replay(CurrentDownloadEvent.idle()).get();
        UPLOAD = Queue.of(com/soundcloud/android/events/UploadEvent).onError(ON_ERROR).replay(UploadEvent.idle()).get();
        POLICY_UPDATES = Queue.of(com/soundcloud/android/events/PolicyUpdateEvent).onError(ON_ERROR).get();
        TRACKING = Queue.of(com/soundcloud/android/events/TrackingEvent).onError(ON_ERROR).get();
        PLAYBACK_PERFORMANCE = Queue.of(com/soundcloud/android/events/PlaybackPerformanceEvent).onError(ON_ERROR).get();
        PLAYBACK_ERROR = Queue.of(com/soundcloud/android/events/PlaybackErrorEvent).onError(ON_ERROR).get();
        ONBOARDING = Queue.of(com/soundcloud/android/events/OnboardingEvent).onError(ON_ERROR).get();
    }

    private class _cls1
        implements b
    {

        public final volatile void call(Object obj)
        {
            call((Throwable)obj);
        }

        public final void call(Throwable throwable)
        {
            ErrorUtils.handleThrowable(throwable, getClass());
        }

        _cls1()
        {
        }
    }

}
