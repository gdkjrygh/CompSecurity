// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.android.playback.ui.view.PlayerTrackPager;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import rx.b.f;
import rx.g.e;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerPresenter

public class PlayerPagerScrollListener
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    private final AdsOperations adsOperations;
    private final EventBus eventBus;
    private final f noPageChangedScrollOnAd = new _cls5();
    private final PlayQueueManager playQueueManager;
    private final PlaybackToastHelper playbackToastHelper;
    private PlayerPagerPresenter presenter;
    private final e scrollStateSubject = e.b();
    private final f settledOnNewPage = new _cls3();
    private final DefaultSubscriber showBlockedSwipeToast = new _cls2();
    private b subscription;
    private final DefaultSubscriber trackPageChanged = new _cls1();
    private PlayerTrackPager trackPager;
    private final rx.b.b trackPlayerSwipeAction = new _cls4();
    private boolean wasDragging;
    private boolean wasPageChange;

    PlayerPagerScrollListener(PlayQueueManager playqueuemanager, PlaybackToastHelper playbacktoasthelper, EventBus eventbus, AdsOperations adsoperations)
    {
        playQueueManager = playqueuemanager;
        eventBus = eventbus;
        playbackToastHelper = playbacktoasthelper;
        adsOperations = adsoperations;
    }

    private void configureFromScrollState(int i)
    {
        if (i == 1)
        {
            wasDragging = true;
        } else
        if (i == 0)
        {
            wasDragging = false;
            wasPageChange = false;
            return;
        }
    }

    private boolean isSwipeNext()
    {
        return trackPager.getCurrentItem() > playQueueManager.getCurrentPosition();
    }

    private void subscribe()
    {
        subscription = new b();
        subscription.a(scrollStateSubject.filter(noPageChangedScrollOnAd).subscribe(showBlockedSwipeToast));
        subscription.a(getPageChangedObservable().subscribe(trackPageChanged));
    }

    public rx.b getPageChangedObservable()
    {
        return scrollStateSubject.filter(settledOnNewPage);
    }

    public void initialize(PlayerTrackPager playertrackpager, PlayerPagerPresenter playerpagerpresenter)
    {
        trackPager = playertrackpager;
        presenter = playerpagerpresenter;
        trackPager.setOnPageChangeListener(this);
        subscribe();
    }

    public void onPageScrollStateChanged(int i)
    {
        scrollStateSubject.onNext(Integer.valueOf(i));
        configureFromScrollState(i);
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        boolean flag = false;
        int j = presenter.getPlayQueuePosition(i);
        PlayerTrackPager playertrackpager;
        boolean flag1;
        if (!adsOperations.isAdAtPosition(j))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        flag1 = playQueueManager.isCurrentPosition(j);
        playertrackpager = trackPager;
        if (i != 0 || flag1)
        {
            flag = true;
        }
        playertrackpager.setPagingEnabled(flag);
        wasPageChange = true;
    }

    public void unsubscribe()
    {
        subscription.unsubscribe();
    }








    private class _cls1 extends DefaultSubscriber
    {

        final PlayerPagerScrollListener this$0;

        public void onNext(Integer integer)
        {
            if (wasDragging)
            {
                eventBus.queue(EventQueue.PLAYER_UI).first().subscribe(trackPlayerSwipeAction);
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((Integer)obj);
        }

        _cls1()
        {
            this$0 = PlayerPagerScrollListener.this;
            super();
        }
    }


    private class _cls2 extends DefaultSubscriber
    {

        final PlayerPagerScrollListener this$0;

        public void onNext(Integer integer)
        {
            playbackToastHelper.showUnskippableAdToast();
        }

        public volatile void onNext(Object obj)
        {
            onNext((Integer)obj);
        }

        _cls2()
        {
            this$0 = PlayerPagerScrollListener.this;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final PlayerPagerScrollListener this$0;

        public Boolean call(Integer integer)
        {
            boolean flag;
            if (wasPageChange && integer.intValue() == 0)
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
            return call((Integer)obj);
        }

        _cls3()
        {
            this$0 = PlayerPagerScrollListener.this;
            super();
        }
    }


    private class _cls4
        implements rx.b.b
    {

        final PlayerPagerScrollListener this$0;

        public void call(PlayerUIEvent playeruievent)
        {
            boolean flag;
            if (playeruievent.getKind() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (isSwipeNext())
            {
                playeruievent = PlayControlEvent.swipeSkip(flag);
            } else
            {
                playeruievent = PlayControlEvent.swipePrevious(flag);
            }
            eventBus.publish(EventQueue.TRACKING, playeruievent);
        }

        public volatile void call(Object obj)
        {
            call((PlayerUIEvent)obj);
        }

        _cls4()
        {
            this$0 = PlayerPagerScrollListener.this;
            super();
        }
    }


    private class _cls5
        implements f
    {

        final PlayerPagerScrollListener this$0;

        public Boolean call(Integer integer)
        {
            boolean flag;
            if (!wasPageChange && integer.intValue() == 0 && adsOperations.isCurrentItemAudioAd())
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
            return call((Integer)obj);
        }

        _cls5()
        {
            this$0 = PlayerPagerScrollListener.this;
            super();
        }
    }

}
