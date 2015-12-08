// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayQueueEvent;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.playback.ui.view.PlayerTrackPager;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.lightcycle.LightCycleBinder;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;
import com.soundcloud.rx.eventbus.EventBus;
import javax.inject.Provider;
import rx.Y;
import rx.b.f;
import rx.g.m;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerPresenter, PlayQueueDataSource, PlayerPagerScrollListener, PlayerFragment

class PlayerPresenter extends SupportFragmentLightCycleDispatcher
{
    private static class ChangeTracksHandler extends Handler
    {

        private final PlayerPresenter playerPresenter;

        public void handleMessage(Message message)
        {
            playerPresenter.setPositionToDisplayedTrack();
        }

        private ChangeTracksHandler(PlayerPresenter playerpresenter)
        {
            playerPresenter = playerpresenter;
        }

        ChangeTracksHandler(PlayerPresenter playerpresenter, _cls1 _pcls1)
        {
            this(playerpresenter);
        }
    }

    private final class ChangeTracksSubscriber extends DefaultSubscriber
    {

        final PlayerPresenter this$0;

        public final void onNext(Integer integer)
        {
            changeTracksHandler.removeMessages(0);
            changeTracksHandler.sendEmptyMessageDelayed(0, 350L);
        }

        public final volatile void onNext(Object obj)
        {
            onNext((Integer)obj);
        }

        private ChangeTracksSubscriber()
        {
            this$0 = PlayerPresenter.this;
            super();
        }

        ChangeTracksSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class PlayQueueSubscriber extends DefaultSubscriber
    {

        final PlayerPresenter this$0;

        public final void onNext(PlayQueueEvent playqueueevent)
        {
            if (playqueueevent.audioAdRemoved() && isLookingAtAdWithFullQueue())
            {
                setPlayQueueAfterScroll = true;
                trackPager.setCurrentItem(trackPager.getCurrentItem() + 1, true);
            } else
            if (!setPlayQueueAfterScroll)
            {
                refreshPlayQueue();
                return;
            }
        }

        public final volatile void onNext(Object obj)
        {
            onNext((PlayQueueEvent)obj);
        }

        private PlayQueueSubscriber()
        {
            this$0 = PlayerPresenter.this;
            super();
        }

        PlayQueueSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class SetQueueOnScrollSubscriber extends DefaultSubscriber
    {

        final PlayerPresenter this$0;

        public final void onNext(Integer integer)
        {
label0:
            {
                if (setPlayQueueAfterScroll)
                {
                    if (!adsOperations.isCurrentItemAudioAd())
                    {
                        break label0;
                    }
                    setAdPlayQueue();
                }
                return;
            }
            refreshPlayQueue();
        }

        public final volatile void onNext(Object obj)
        {
            onNext((Integer)obj);
        }

        private SetQueueOnScrollSubscriber()
        {
            this$0 = PlayerPresenter.this;
            super();
        }

        SetQueueOnScrollSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class ShowAudioAdSubscriber extends DefaultSubscriber
    {

        final PlayerPresenter this$0;

        public final void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            showAudioAd();
        }

        public final volatile void onNext(Object obj)
        {
            onNext((CurrentPlayQueueItemEvent)obj);
        }

        private ShowAudioAdSubscriber()
        {
            this$0 = PlayerPresenter.this;
            super();
        }

        ShowAudioAdSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final int CHANGE_TRACKS_DELAY = 350;
    private static final int CHANGE_TRACKS_MESSAGE = 0;
    private final AdsOperations adsOperations;
    private final rx.b.b allowScrollAfterTimeout = new _cls4();
    private Handler changeTracksHandler;
    private final rx.b checkAdProgress;
    private final EventBus eventBus;
    private final f isCurrentTrackAudioAd = new _cls1();
    private final f isInForeground = new _cls3();
    private boolean isResumed;
    private final f notWaitingForScroll = new _cls6();
    private final rx.b.b onTrackChanged = new _cls5();
    private PlayQueueDataSource playQueueDataSource;
    private final Provider playQueueDataSwitcherProvider;
    private final PlayQueueManager playQueueManager;
    private final PlaySessionController playSessionController;
    private final PlayerPagerScrollListener playerPagerScrollListener;
    final PlayerPagerPresenter presenter;
    private final DefaultSubscriber setPagerPositionFromPlayQueueManager = new _cls7();
    private boolean setPlayQueueAfterScroll;
    private b subscription;
    private PlayerTrackPager trackPager;
    private Y unblockPagerSubscription;
    private final rx.b.b updateAdapter = new _cls2();

    public PlayerPresenter(PlayerPagerPresenter playerpagerpresenter, EventBus eventbus, PlayQueueManager playqueuemanager, PlaySessionController playsessioncontroller, Provider provider, PlayerPagerScrollListener playerpagerscrolllistener, AdsOperations adsoperations)
    {
        subscription = new b();
        unblockPagerSubscription = RxUtils.invalidSubscription();
        presenter = playerpagerpresenter;
        eventBus = eventbus;
        playQueueManager = playqueuemanager;
        playSessionController = playsessioncontroller;
        playQueueDataSwitcherProvider = provider;
        playerPagerScrollListener = playerpagerscrolllistener;
        adsOperations = adsoperations;
        LightCycleBinder.bind(this);
        changeTracksHandler = new ChangeTracksHandler(this, null);
        checkAdProgress = eventbus.queue(EventQueue.PLAYBACK_PROGRESS).first(new _cls8());
    }

    private int getDisplayedPositionInPlayQueue()
    {
        return presenter.getPlayQueuePosition(trackPager.getCurrentItem());
    }

    private DefaultSubscriber getRestoreQueueSubscriber()
    {
        return new _cls9();
    }

    private boolean isLookingAtAdWithFullQueue()
    {
        return presenter.isAdPageAtPosition(trackPager.getCurrentItem()) && isResumed && trackPager.getAdapter().getCount() > 1;
    }

    private boolean isShowingCurrentAudioAd()
    {
        return adsOperations.isCurrentItemAudioAd() && playQueueManager.isCurrentPosition(getDisplayedPositionInPlayQueue());
    }

    private void refreshPlayQueue()
    {
        playQueueDataSource = (PlayQueueDataSource)playQueueDataSwitcherProvider.get();
        setFullQueue();
    }

    private void setAdPlayQueue()
    {
        presenter.setCurrentData(playQueueDataSource.getCurrentItemAsQueue());
        trackPager.setCurrentItem(0, false);
    }

    private void setFullQueue()
    {
        presenter.setCurrentData(playQueueDataSource.getFullQueue());
        trackPager.setCurrentItem(playQueueManager.getCurrentPosition(), false);
        setPlayQueueAfterScroll = false;
    }

    private void setPager(PlayerTrackPager playertrackpager)
    {
        trackPager = playertrackpager;
        refreshPlayQueue();
        playerPagerScrollListener.initialize(playertrackpager, presenter);
    }

    private void setPositionToDisplayedTrack()
    {
        playSessionController.setPlayQueuePosition(getDisplayedPositionInPlayQueue());
    }

    private void setQueuePosition(int i)
    {
        boolean flag = true;
        if (Math.abs(trackPager.getCurrentItem() - i) > 1)
        {
            flag = false;
        }
        trackPager.setCurrentItem(i, flag);
    }

    private void setupScrollingSubscribers()
    {
        rx.b b1 = playerPagerScrollListener.getPageChangedObservable();
        subscription.a(b1.subscribe(new SetQueueOnScrollSubscriber(null)));
        subscription.a(b1.doOnNext(updateAdapter).filter(isInForeground).subscribe(new ChangeTracksSubscriber(null)));
    }

    private void setupTrackChangeSubscribers()
    {
        subscription.a(eventBus.subscribeImmediate(EventQueue.PLAY_QUEUE, new PlayQueueSubscriber(null)));
        subscription.a(eventBus.queue(EventQueue.CURRENT_PLAY_QUEUE_ITEM).doOnNext(onTrackChanged).filter(isCurrentTrackAudioAd).doOnNext(allowScrollAfterTimeout).subscribe(new ShowAudioAdSubscriber(null)));
        subscription.a(eventBus.queue(EventQueue.CURRENT_PLAY_QUEUE_ITEM).filter(notWaitingForScroll).subscribe(setPagerPositionFromPlayQueueManager));
    }

    private void showAudioAd()
    {
        if (isShowingCurrentAudioAd() || !isResumed)
        {
            setAdPlayQueue();
            return;
        } else
        {
            setPlayQueueAfterScroll = true;
            setQueuePosition(playQueueManager.getCurrentPosition());
            return;
        }
    }

    public volatile void onDestroyView(Fragment fragment)
    {
        onDestroyView((PlayerFragment)fragment);
    }

    public void onDestroyView(PlayerFragment playerfragment)
    {
        unblockPagerSubscription.unsubscribe();
        playerPagerScrollListener.unsubscribe();
        changeTracksHandler.removeMessages(0);
        subscription.unsubscribe();
        subscription = new b();
        super.onDestroyView(playerfragment);
    }

    public volatile void onPause(Fragment fragment)
    {
        onPause((PlayerFragment)fragment);
    }

    public void onPause(PlayerFragment playerfragment)
    {
        super.onPause(playerfragment);
        isResumed = false;
    }

    public void onPlayerSlide(float f)
    {
        presenter.onPlayerSlide(f);
    }

    public volatile void onResume(Fragment fragment)
    {
        onResume((PlayerFragment)fragment);
    }

    public void onResume(PlayerFragment playerfragment)
    {
        super.onResume(playerfragment);
        isResumed = true;
    }

    public volatile void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        onViewCreated((PlayerFragment)fragment, view, bundle);
    }

    public void onViewCreated(PlayerFragment playerfragment, View view, Bundle bundle)
    {
        super.onViewCreated(playerfragment, view, bundle);
        setPager((PlayerTrackPager)view.findViewById(0x7f0f01d8));
        setupTrackChangeSubscribers();
        setupScrollingSubscribers();
    }













/*
    static Y access$202(PlayerPresenter playerpresenter, Y y)
    {
        playerpresenter.unblockPagerSubscription = y;
        return y;
    }

*/





/*
    static boolean access$502(PlayerPresenter playerpresenter, boolean flag)
    {
        playerpresenter.setPlayQueueAfterScroll = flag;
        return flag;
    }

*/



    private class _cls1
        implements f
    {

        final PlayerPresenter this$0;

        public Boolean call(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            return Boolean.valueOf(adsOperations.isCurrentItemAudioAd());
        }

        public volatile Object call(Object obj)
        {
            return call((CurrentPlayQueueItemEvent)obj);
        }

        _cls1()
        {
            this$0 = PlayerPresenter.this;
            super();
        }
    }


    private class _cls2
        implements rx.b.b
    {

        final PlayerPresenter this$0;

        public void call(Object obj)
        {
            presenter.onTrackChange();
        }

        _cls2()
        {
            this$0 = PlayerPresenter.this;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final PlayerPresenter this$0;

        public Boolean call(Integer integer)
        {
            return Boolean.valueOf(isResumed);
        }

        public volatile Object call(Object obj)
        {
            return call((Integer)obj);
        }

        _cls3()
        {
            this$0 = PlayerPresenter.this;
            super();
        }
    }


    private class _cls4
        implements rx.b.b
    {

        final PlayerPresenter this$0;

        public void call(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            unblockPagerSubscription = checkAdProgress.observeOn(a.a()).subscribe(getRestoreQueueSubscriber());
        }

        public volatile void call(Object obj)
        {
            call((CurrentPlayQueueItemEvent)obj);
        }

        _cls4()
        {
            this$0 = PlayerPresenter.this;
            super();
        }
    }


    private class _cls5
        implements rx.b.b
    {

        final PlayerPresenter this$0;

        public void call(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            presenter.onTrackChange();
            unblockPagerSubscription.unsubscribe();
        }

        public volatile void call(Object obj)
        {
            call((CurrentPlayQueueItemEvent)obj);
        }

        _cls5()
        {
            this$0 = PlayerPresenter.this;
            super();
        }
    }


    private class _cls6
        implements f
    {

        final PlayerPresenter this$0;

        public Boolean call(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            boolean flag;
            if (!setPlayQueueAfterScroll)
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
            return call((CurrentPlayQueueItemEvent)obj);
        }

        _cls6()
        {
            this$0 = PlayerPresenter.this;
            super();
        }
    }


    private class _cls7 extends DefaultSubscriber
    {

        final PlayerPresenter this$0;

        public void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            setQueuePosition(playQueueManager.getCurrentPosition());
        }

        public volatile void onNext(Object obj)
        {
            onNext((CurrentPlayQueueItemEvent)obj);
        }

        _cls7()
        {
            this$0 = PlayerPresenter.this;
            super();
        }
    }


    private class _cls8
        implements f
    {

        final PlayerPresenter this$0;

        public Boolean call(PlaybackProgressEvent playbackprogressevent)
        {
            boolean flag;
            if (playbackprogressevent.getPlaybackProgress().getPosition() >= AdConstants.UNSKIPPABLE_TIME_MS)
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
            return call((PlaybackProgressEvent)obj);
        }

        _cls8()
        {
            this$0 = PlayerPresenter.this;
            super();
        }
    }


    private class _cls9 extends DefaultSubscriber
    {

        final PlayerPresenter this$0;

        public void onNext(PlaybackProgressEvent playbackprogressevent)
        {
            setFullQueue();
        }

        public volatile void onNext(Object obj)
        {
            onNext((PlaybackProgressEvent)obj);
        }

        _cls9()
        {
            this$0 = PlayerPresenter.this;
            super();
        }
    }

}
