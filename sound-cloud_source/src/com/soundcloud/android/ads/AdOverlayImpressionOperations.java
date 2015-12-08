// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.TrackSourceInfo;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;
import rx.b;
import rx.b.f;
import rx.b.h;
import rx.g.m;

class AdOverlayImpressionOperations
{
    private static final class VisualImpressionState
    {

        private final PropertySet adMetaData;
        private final boolean adOverlayIsVisible;
        private final Urn currentPlayingUrn;
        private final boolean isAppInForeground;
        private final boolean playerIsExpanding;
        private final TrackSourceInfo trackSourceInfo;







        public VisualImpressionState(boolean flag, boolean flag1, boolean flag2, Urn urn, PropertySet propertyset, TrackSourceInfo tracksourceinfo)
        {
            isAppInForeground = flag1;
            adOverlayIsVisible = flag;
            playerIsExpanding = flag2;
            currentPlayingUrn = urn;
            adMetaData = propertyset;
            trackSourceInfo = tracksourceinfo;
        }
    }


    private final AccountOperations accountOperations;
    private final m activityLifeCycleQueue;
    private final m adOverlayEventQueue;
    private final h combineFunction = new _cls5();
    private boolean impressionEventEmitted;
    private final f isAdOverlayVisible = new _cls4();
    private final rx.b.b lockCurrentImpression = new _cls2();
    private final m playerUIEventQueue;
    private final f toTrackingEvent = new _cls1();
    private final rx.b.b unlockCurrentImpression = new _cls3();

    AdOverlayImpressionOperations(EventBus eventbus, AccountOperations accountoperations)
    {
        impressionEventEmitted = false;
        accountOperations = accountoperations;
        activityLifeCycleQueue = eventbus.queue(EventQueue.ACTIVITY_LIFE_CYCLE);
        playerUIEventQueue = eventbus.queue(EventQueue.PLAYER_UI);
        adOverlayEventQueue = eventbus.queue(EventQueue.AD_OVERLAY);
    }

    public b trackImpression()
    {
        return b.combineLatest(adOverlayEventQueue.doOnNext(unlockCurrentImpression), activityLifeCycleQueue, playerUIEventQueue, combineFunction).filter(isAdOverlayVisible).map(toTrackingEvent).doOnNext(lockCurrentImpression);
    }




/*
    static boolean access$402(AdOverlayImpressionOperations adoverlayimpressionoperations, boolean flag)
    {
        adoverlayimpressionoperations.impressionEventEmitted = flag;
        return flag;
    }

*/

    private class _cls1
        implements f
    {

        final AdOverlayImpressionOperations this$0;

        public AdOverlayTrackingEvent call(VisualImpressionState visualimpressionstate)
        {
            return AdOverlayTrackingEvent.forImpression(visualimpressionstate.adMetaData, visualimpressionstate.currentPlayingUrn, accountOperations.getLoggedInUserUrn(), visualimpressionstate.trackSourceInfo);
        }

        public volatile Object call(Object obj)
        {
            return call((VisualImpressionState)obj);
        }

        _cls1()
        {
            this$0 = AdOverlayImpressionOperations.this;
            super();
        }
    }


    private class _cls2
        implements rx.b.b
    {

        final AdOverlayImpressionOperations this$0;

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
            this$0 = AdOverlayImpressionOperations.this;
            super();
        }
    }


    private class _cls3
        implements rx.b.b
    {

        final AdOverlayImpressionOperations this$0;

        public void call(AdOverlayEvent adoverlayevent)
        {
            if (adoverlayevent.getKind() == 1)
            {
                impressionEventEmitted = false;
            }
        }

        public volatile void call(Object obj)
        {
            call((AdOverlayEvent)obj);
        }

        _cls3()
        {
            this$0 = AdOverlayImpressionOperations.this;
            super();
        }
    }


    private class _cls4
        implements f
    {

        final AdOverlayImpressionOperations this$0;

        public Boolean call(VisualImpressionState visualimpressionstate)
        {
            boolean flag;
            if (!impressionEventEmitted && visualimpressionstate.adOverlayIsVisible && visualimpressionstate.playerIsExpanding && visualimpressionstate.isAppInForeground)
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
            return call((VisualImpressionState)obj);
        }

        _cls4()
        {
            this$0 = AdOverlayImpressionOperations.this;
            super();
        }
    }


    private class _cls5
        implements h
    {

        final AdOverlayImpressionOperations this$0;

        public VisualImpressionState call(AdOverlayEvent adoverlayevent, ActivityLifeCycleEvent activitylifecycleevent, PlayerUIEvent playeruievent)
        {
            boolean flag2 = true;
            boolean flag;
            boolean flag1;
            if (adoverlayevent.getKind() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (activitylifecycleevent.getKind() == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (playeruievent.getKind() != 0)
            {
                flag2 = false;
            }
            return new VisualImpressionState(flag, flag1, flag2, adoverlayevent.getCurrentPlayingUrn(), adoverlayevent.getAdMetaData(), adoverlayevent.getTrackSourceInfo());
        }

        public volatile Object call(Object obj, Object obj1, Object obj2)
        {
            return call((AdOverlayEvent)obj, (ActivityLifeCycleEvent)obj1, (PlayerUIEvent)obj2);
        }

        _cls5()
        {
            this$0 = AdOverlayImpressionOperations.this;
            super();
        }
    }

}
