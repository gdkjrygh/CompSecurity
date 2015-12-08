// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.Context;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.EngagementsTracking;
import com.soundcloud.android.analytics.ScreenElement;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayControlEvent;
import com.soundcloud.android.events.PlayerUIEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.likes.LikeOperations;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.rx.eventbus.EventBus;
import rx.X;
import rx.b;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PageListener

class TrackPageListener extends PageListener
{

    private final EngagementsTracking engagementsTracking;
    private final LikeOperations likeOperations;
    private final Navigator navigator;
    private final PlayQueueManager playQueueManager;

    public TrackPageListener(PlaySessionController playsessioncontroller, PlayQueueManager playqueuemanager, PlaySessionStateProvider playsessionstateprovider, EventBus eventbus, LikeOperations likeoperations, Navigator navigator1, EngagementsTracking engagementstracking)
    {
        super(playsessioncontroller, playsessionstateprovider, eventbus);
        playQueueManager = playqueuemanager;
        likeOperations = likeoperations;
        navigator = navigator1;
        engagementsTracking = engagementstracking;
    }

    private X startProfileActivity(final Context activityContext, final Urn userUrn)
    {
        return new _cls1();
    }

    public void onGotoUser(Context context, Urn urn)
    {
        eventBus.queue(EventQueue.PLAYER_UI).first(PlayerUIEvent.PLAYER_IS_COLLAPSED).subscribe(startProfileActivity(context, urn));
        requestPlayerCollapse();
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromPlayerClose("profile_open"));
    }

    public void onScrub(int i)
    {
        if (i == 1)
        {
            eventBus.publish(EventQueue.TRACKING, PlayControlEvent.scrub("full_player"));
        }
    }

    public void onToggleLike(boolean flag, Urn urn)
    {
        Preconditions.checkNotNull(urn);
        DefaultSubscriber.fireAndForget(likeOperations.toggleLike(urn, flag));
        engagementsTracking.likeTrackUrn(urn, flag, ScreenElement.PLAYER.get(), playQueueManager.getScreenTag(), Screen.PLAYER_MAIN.get(), urn, playQueueManager.getCurrentPromotedSourceInfo(urn));
    }


    private class _cls1 extends DefaultSubscriber
    {

        final TrackPageListener this$0;
        final Context val$activityContext;
        final Urn val$userUrn;

        public void onNext(PlayerUIEvent playeruievent)
        {
            navigator.openProfile(activityContext, userUrn);
        }

        public volatile void onNext(Object obj)
        {
            onNext((PlayerUIEvent)obj);
        }

        _cls1()
        {
            this$0 = TrackPageListener.this;
            activityContext = context;
            userUrn = urn;
            super();
        }
    }

}
