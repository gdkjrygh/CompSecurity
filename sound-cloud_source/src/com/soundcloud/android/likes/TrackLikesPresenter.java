// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.MidTierTrackEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.offline.OfflinePlaybackOperations;
import com.soundcloud.android.paywall.PaywallImpressionController;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.rx.observers.RefreshRecyclerViewAdapterSubscriber;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.android.tracks.UpdatePlayingTrackSubscriber;
import com.soundcloud.android.utils.CollapsingScrollHelper;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.android.view.adapters.PagedTracksRecyclerItemAdapter;
import com.soundcloud.android.view.adapters.PrependItemToListSubscriber;
import com.soundcloud.android.view.adapters.RemoveEntityListSubscriber;
import com.soundcloud.android.view.adapters.UpdateCurrentDownloadSubscriber;
import com.soundcloud.android.view.adapters.UpdateEntityListSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.List;
import javax.inject.Provider;
import rx.X;
import rx.Y;
import rx.a.b.a;
import rx.g.m;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.likes:
//            TrackLikeOperations, TrackLikesHeaderPresenter

class TrackLikesPresenter extends RecyclerViewPresenter
{
    private class AllLikedTracksSubscriber extends DefaultSubscriber
    {

        final TrackLikesPresenter this$0;

        public volatile void onNext(Object obj)
        {
            onNext((List)obj);
        }

        public void onNext(List list)
        {
            headerPresenter.updateTrackCount(list.size());
            Fragment fragment1 = fragment;
            boolean flag;
            if (!list.isEmpty() && featureOperations.isOfflineContentOrUpsellEnabled())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            fragment1.setMenuVisibility(flag);
        }

        private AllLikedTracksSubscriber()
        {
            this$0 = TrackLikesPresenter.this;
            super();
        }

        AllLikedTracksSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private final PagedTracksRecyclerItemAdapter adapter;
    private Y collectionSubscription;
    private Y entityStateChangedSubscription;
    private final EventBus eventBus;
    private final Provider expandPlayerSubscriberProvider;
    private final FeatureOperations featureOperations;
    private Fragment fragment;
    final TrackLikesHeaderPresenter headerPresenter;
    private final TrackLikeOperations likeOperations;
    private final Navigator navigator;
    private final OfflineContentOperations offlineContentOperations;
    private final PaywallImpressionController paywallImpressionController;
    private final OfflinePlaybackOperations playbackOperations;
    final CollapsingScrollHelper scrollHelper;
    private b viewLifeCycle;

    TrackLikesPresenter(TrackLikeOperations tracklikeoperations, OfflinePlaybackOperations offlineplaybackoperations, OfflineContentOperations offlinecontentoperations, PagedTracksRecyclerItemAdapter pagedtracksrecycleritemadapter, TrackLikesHeaderPresenter tracklikesheaderpresenter, Provider provider, EventBus eventbus, 
            SwipeRefreshAttacher swiperefreshattacher, FeatureOperations featureoperations, Navigator navigator1, CollapsingScrollHelper collapsingscrollhelper, PaywallImpressionController paywallimpressioncontroller)
    {
        super(swiperefreshattacher);
        collectionSubscription = RxUtils.invalidSubscription();
        entityStateChangedSubscription = RxUtils.invalidSubscription();
        likeOperations = tracklikeoperations;
        playbackOperations = offlineplaybackoperations;
        offlineContentOperations = offlinecontentoperations;
        adapter = pagedtracksrecycleritemadapter;
        headerPresenter = tracklikesheaderpresenter;
        expandPlayerSubscriberProvider = provider;
        eventBus = eventbus;
        featureOperations = featureoperations;
        navigator = navigator1;
        scrollHelper = collapsingscrollhelper;
        paywallImpressionController = paywallimpressioncontroller;
    }

    private boolean shouldShowUpsell(TrackItem trackitem)
    {
        return trackitem.isMidTier() && featureOperations.upsellMidTier();
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        return CollectionBinding.from(likeOperations.likedTracks(), TrackItem.fromPropertySets()).withAdapter(adapter).withPager(likeOperations.pagingFunction()).build();
    }

    public void onCreate(Fragment fragment1, Bundle bundle)
    {
        super.onCreate(fragment1, bundle);
        fragment = fragment1;
        getBinding().connect();
    }

    public void onDestroyView(Fragment fragment1)
    {
        paywallImpressionController.detachRecyclerView(getRecyclerView());
        entityStateChangedSubscription.unsubscribe();
        collectionSubscription.unsubscribe();
        viewLifeCycle.unsubscribe();
        super.onDestroyView(fragment1);
    }

    public void onItemClicked(View view, int i)
    {
        Object obj = (TrackItem)adapter.getItem(i);
        if (obj == null)
        {
            ErrorUtils.handleSilentException(new IllegalStateException((new StringBuilder("Adapter item is null on item click, with adapter: ")).append(adapter).append(", on position ").append(i).toString()));
            return;
        }
        if (shouldShowUpsell(((TrackItem) (obj))))
        {
            eventBus.publish(EventQueue.TRACKING, MidTierTrackEvent.forClick(((TrackItem) (obj)).getEntityUrn(), Screen.LIKES.name()));
            navigator.openUpgrade(view.getContext());
            return;
        } else
        {
            view = ((TrackItem) (obj)).getEntityUrn();
            obj = new PlaySessionSource(Screen.LIKES);
            playbackOperations.playLikes(view, i, ((PlaySessionSource) (obj))).subscribe((X)expandPlayerSubscriberProvider.get());
            return;
        }
    }

    protected CollectionBinding onRefreshBinding()
    {
        return CollectionBinding.from(likeOperations.updatedLikedTracks(), TrackItem.fromPropertySets()).withAdapter(adapter).withPager(likeOperations.pagingFunction()).build();
    }

    public void onResume(Fragment fragment1)
    {
        super.onResume(fragment1);
        fragment1.setMenuVisibility(featureOperations.isOfflineContentOrUpsellEnabled());
    }

    protected void onSubscribeBinding(CollectionBinding collectionbinding, b b1)
    {
        collectionSubscription = collectionbinding.items().first().flatMap(RxUtils.continueWith(likeOperations.likedTrackUrns())).observeOn(a.a()).cache().subscribe(new AllLikedTracksSubscriber(null));
    }

    public void onViewCreated(Fragment fragment1, View view, Bundle bundle)
    {
        super.onViewCreated(fragment1, view, bundle);
        getEmptyView().setImage(0x7f020100);
        getEmptyView().setMessageText(0x7f07015c);
        getEmptyView().setBackgroundResource(0x7f0e00a3);
        viewLifeCycle = new b(new Y[] {
            eventBus.subscribe(EventQueue.CURRENT_PLAY_QUEUE_ITEM, new UpdatePlayingTrackSubscriber(adapter)), eventBus.queue(EventQueue.CURRENT_DOWNLOAD).observeOn(a.a()).subscribe(new UpdateCurrentDownloadSubscriber(adapter)), eventBus.subscribe(EventQueue.ENTITY_STATE_CHANGED, new UpdateEntityListSubscriber(adapter)), likeOperations.onTrackLiked().map(TrackItem.fromPropertySet()).observeOn(a.a()).subscribe(new PrependItemToListSubscriber(adapter)), likeOperations.onTrackUnliked().observeOn(a.a()).subscribe(new RemoveEntityListSubscriber(adapter)), offlineContentOperations.getOfflineContentOrOfflineLikesStatusChanges().subscribe(new RefreshRecyclerViewAdapterSubscriber(adapter))
        });
        paywallImpressionController.attachRecyclerView(getRecyclerView());
        entityStateChangedSubscription = eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(EntityStateChangedEvent.IS_TRACK_LIKE_EVENT_FILTER).flatMap(RxUtils.continueWith(likeOperations.likedTrackUrns())).observeOn(a.a()).subscribe(new AllLikedTracksSubscriber(null));
    }


}
