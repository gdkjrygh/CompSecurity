// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.CurrentDownloadEvent;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.offline.OfflinePlaybackOperations;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;
import com.soundcloud.rx.eventbus.EventBus;
import javax.inject.Provider;
import rx.Y;
import rx.a.b.a;
import rx.b;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.likes:
//            TrackLikesHeaderView

public class TrackLikesHeaderPresenter extends DefaultSupportFragmentLightCycle
{
    private class OfflineLikesSettingSubscriber extends DefaultSubscriber
    {

        final TrackLikesHeaderPresenter this$0;

        public void onNext(OfflineState offlinestate)
        {
            if (OfflineState.NO_OFFLINE == offlinestate)
            {
                downloadSubscription.unsubscribe();
            } else
            {
                subscribeToCurrentDownloadQueue();
            }
            updateHeaderViewWithOfflineState(offlinestate);
        }

        public volatile void onNext(Object obj)
        {
            onNext((OfflineState)obj);
        }

        private OfflineLikesSettingSubscriber()
        {
            this$0 = TrackLikesHeaderPresenter.this;
            super();
        }

        OfflineLikesSettingSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class OfflineStateSubscriber extends DefaultSubscriber
    {

        final TrackLikesHeaderPresenter this$0;

        public void onNext(OfflineState offlinestate)
        {
            if (featureOperations.isOfflineContentEnabled())
            {
                headerView.show(offlinestate);
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((OfflineState)obj);
        }

        private OfflineStateSubscriber()
        {
            this$0 = TrackLikesHeaderPresenter.this;
            super();
        }

        OfflineStateSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private Y downloadSubscription;
    private final EventBus eventBus;
    private final Provider expandPlayerSubscriberProvider;
    private final FeatureOperations featureOperations;
    private Y foregroundSubscription;
    private final TrackLikesHeaderView headerView;
    private final OfflineContentOperations offlineContentOperations;
    private final android.view.View.OnClickListener onShuffleButtonClick = new _cls2();
    private final OfflinePlaybackOperations playbackOperations;
    private final rx.b.a sendShuffleLikesAnalytics = new _cls1();

    public TrackLikesHeaderPresenter(TrackLikesHeaderView tracklikesheaderview, OfflineContentOperations offlinecontentoperations, OfflinePlaybackOperations offlineplaybackoperations, Provider provider, FeatureOperations featureoperations, EventBus eventbus)
    {
        downloadSubscription = RxUtils.invalidSubscription();
        foregroundSubscription = RxUtils.invalidSubscription();
        headerView = tracklikesheaderview;
        offlineContentOperations = offlinecontentoperations;
        playbackOperations = offlineplaybackoperations;
        expandPlayerSubscriberProvider = provider;
        featureOperations = featureoperations;
        eventBus = eventbus;
    }

    private b likesDownloadState()
    {
        return eventBus.queue(EventQueue.CURRENT_DOWNLOAD).filter(CurrentDownloadEvent.FOR_LIKED_TRACKS_FILTER).map(CurrentDownloadEvent.TO_OFFLINE_STATE);
    }

    private void subscribeForOfflineContentUpdates()
    {
        foregroundSubscription = eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(EntityStateChangedEvent.IS_OFFLINE_LIKES_EVENT_FILTER).map(OfflineContentOperations.OFFLINE_LIKES_EVENT_TO_OFFLINE_STATE).startWith(offlineContentOperations.getLikedTracksOfflineStateFromStorage()).observeOn(a.a()).subscribe(new OfflineLikesSettingSubscriber(null));
    }

    private void subscribeToCurrentDownloadQueue()
    {
        downloadSubscription.unsubscribe();
        downloadSubscription = likesDownloadState().observeOn(a.a()).subscribe(new OfflineStateSubscriber(null));
    }

    private void updateHeaderViewWithOfflineState(OfflineState offlinestate)
    {
        if (featureOperations.isOfflineContentEnabled())
        {
            headerView.show(offlinestate);
        }
    }

    public void onDestroyView(Fragment fragment)
    {
        headerView.onDestroyView();
    }

    public void onPause(Fragment fragment)
    {
        foregroundSubscription.unsubscribe();
        downloadSubscription.unsubscribe();
    }

    public void onResume(Fragment fragment)
    {
        if (featureOperations.isOfflineContentOrUpsellEnabled())
        {
            if (featureOperations.isOfflineContentEnabled())
            {
                subscribeForOfflineContentUpdates();
            }
            return;
        } else
        {
            headerView.show(OfflineState.NO_OFFLINE);
            return;
        }
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        headerView.onViewCreated(view);
        headerView.setOnShuffleButtonClick(onShuffleButtonClick);
    }

    public void updateTrackCount(int i)
    {
        if (headerView.isViewCreated())
        {
            headerView.updateTrackCount(i);
        }
    }










    private class _cls1
        implements rx.b.a
    {

        final TrackLikesHeaderPresenter this$0;

        public void call()
        {
            eventBus.publish(EventQueue.TRACKING, UIEvent.fromShuffleMyLikes());
        }

        _cls1()
        {
            this$0 = TrackLikesHeaderPresenter.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final TrackLikesHeaderPresenter this$0;

        public void onClick(View view)
        {
            playbackOperations.playLikedTracksShuffled(new PlaySessionSource(Screen.LIKES)).doOnCompleted(sendShuffleLikesAnalytics).subscribe((X)expandPlayerSubscriberProvider.get());
        }

        _cls2()
        {
            this$0 = TrackLikesHeaderPresenter.this;
            super();
        }
    }

}
