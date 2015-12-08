// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PromotedTrackingEvent;
import com.soundcloud.android.events.StreamNotificationEvent;
import com.soundcloud.android.facebookinvites.FacebookInvitesDialogPresenter;
import com.soundcloud.android.facebookinvites.FacebookInvitesItem;
import com.soundcloud.android.image.ImagePauseOnScrollListener;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.playlists.PromotedPlaylistItem;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.android.presentation.PromotedListItem;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.stations.StationsOperations;
import com.soundcloud.android.tracks.PromotedTrackItem;
import com.soundcloud.android.tracks.UpdatePlayingTrackSubscriber;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.android.view.adapters.MixedItemClickListener;
import com.soundcloud.android.view.adapters.RecyclerViewParallaxer;
import com.soundcloud.android.view.adapters.UpdateEntityListSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamAdapter, StreamItem, SoundStreamOperations

public class SoundStreamPresenter extends RecyclerViewPresenter
    implements com.soundcloud.android.facebookinvites.FacebookInvitesItemRenderer.OnFacebookInvitesClickListener, com.soundcloud.android.stations.StationsOnboardingStreamItemRenderer.Listener
{

    private final SoundStreamAdapter adapter;
    private final EventBus eventBus;
    private final FacebookInvitesDialogPresenter facebookInvitesDialogPresenter;
    private final FeatureFlags featureFlags;
    private Fragment fragment;
    private final ImagePauseOnScrollListener imagePauseOnScrollListener;
    private final MixedItemClickListener itemClickListener;
    private final RecyclerViewParallaxer recyclerViewParallaxer;
    private final StationsOperations stationsOperations;
    private final SoundStreamOperations streamOperations;
    private b viewLifeCycle;

    SoundStreamPresenter(SoundStreamOperations soundstreamoperations, SoundStreamAdapter soundstreamadapter, StationsOperations stationsoperations, ImagePauseOnScrollListener imagepauseonscrolllistener, SwipeRefreshAttacher swiperefreshattacher, EventBus eventbus, com.soundcloud.android.view.adapters.MixedItemClickListener.Factory factory, 
            RecyclerViewParallaxer recyclerviewparallaxer, FacebookInvitesDialogPresenter facebookinvitesdialogpresenter, FeatureFlags featureflags)
    {
        super(swiperefreshattacher, getRecyclerOptions(featureflags));
        streamOperations = soundstreamoperations;
        adapter = soundstreamadapter;
        stationsOperations = stationsoperations;
        imagePauseOnScrollListener = imagepauseonscrolllistener;
        eventBus = eventbus;
        recyclerViewParallaxer = recyclerviewparallaxer;
        facebookInvitesDialogPresenter = facebookinvitesdialogpresenter;
        featureFlags = featureflags;
        itemClickListener = factory.create(Screen.STREAM, null);
        soundstreamadapter.setOnFacebookInvitesClickListener(this);
        soundstreamadapter.setOnStationsOnboardingStreamClickListener(this);
    }

    private void addScrollListeners()
    {
        getRecyclerView().addOnScrollListener(imagePauseOnScrollListener);
        if (featureFlags.isEnabled(Flag.NEW_STREAM))
        {
            getRecyclerView().addOnScrollListener(recyclerViewParallaxer);
        }
    }

    private void configureEmptyView()
    {
        EmptyView emptyview = getEmptyView();
        emptyview.setImage(0x7f020106);
        emptyview.setMessageText(0x7f070157);
        emptyview.setActionText(0x7f070156);
        emptyview.setButtonActions(new Intent("com.soundcloud.android.action.SEARCH"));
    }

    private FacebookInvitesItem getFacebookInvitesItemAtPosition(int i)
    {
        StreamItem streamitem = (StreamItem)adapter.getItem(i);
        if (streamitem instanceof FacebookInvitesItem)
        {
            return (FacebookInvitesItem)streamitem;
        } else
        {
            return null;
        }
    }

    private static com.soundcloud.android.presentation.RecyclerViewPresenter.Options getRecyclerOptions(FeatureFlags featureflags)
    {
        if (featureflags.isEnabled(Flag.NEW_STREAM))
        {
            return com.soundcloud.android.presentation.RecyclerViewPresenter.Options.custom().useItemClickListener().build();
        } else
        {
            return com.soundcloud.android.presentation.RecyclerViewPresenter.Options.list().build();
        }
    }

    private void handleListItemClick(View view, int i, ListItem listitem)
    {
        itemClickListener.onPostClick(streamOperations.trackUrnsForPlayback(), view, i, listitem);
    }

    private void publishFacebookInviteClicked(FacebookInvitesItem facebookinvitesitem)
    {
        eventBus.publish(EventQueue.TRACKING, StreamNotificationEvent.forFacebookInviteClick(facebookinvitesitem));
    }

    private void publishFacebookInviteDismissed(FacebookInvitesItem facebookinvitesitem)
    {
        eventBus.publish(EventQueue.TRACKING, StreamNotificationEvent.forFacebookInviteDismissed(facebookinvitesitem));
    }

    private void publishPromotedItemClickEvent(PromotedListItem promotedlistitem)
    {
        eventBus.publish(EventQueue.TRACKING, PromotedTrackingEvent.forItemClick(promotedlistitem, Screen.STREAM.get()));
    }

    private void removeItem(int i)
    {
        adapter.removeItem(i);
        adapter.notifyItemRemoved(i);
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        return CollectionBinding.from(streamOperations.initialStreamItems()).withAdapter(adapter).withPager(streamOperations.pagingFunction()).build();
    }

    public void onCreate(Fragment fragment1, Bundle bundle)
    {
        super.onCreate(fragment1, bundle);
        fragment = fragment1;
        getBinding().connect();
    }

    public void onDestroyView(Fragment fragment1)
    {
        viewLifeCycle.unsubscribe();
        super.onDestroyView(fragment1);
    }

    public void onFacebookInvitesCloseButtonClicked(int i)
    {
        FacebookInvitesItem facebookinvitesitem = getFacebookInvitesItemAtPosition(i);
        if (facebookinvitesitem != null)
        {
            publishFacebookInviteDismissed(facebookinvitesitem);
            removeItem(i);
        }
    }

    public void onFacebookInvitesInviteButtonClicked(int i)
    {
        FacebookInvitesItem facebookinvitesitem = getFacebookInvitesItemAtPosition(i);
        if (facebookinvitesitem != null)
        {
            publishFacebookInviteClicked(facebookinvitesitem);
            facebookInvitesDialogPresenter.show(fragment.getActivity());
            removeItem(i);
        }
    }

    protected void onItemClicked(View view, int i)
    {
        ListItem listitem = (ListItem)adapter.getItem(i);
        if (!(listitem instanceof PromotedTrackItem)) goto _L2; else goto _L1
_L1:
        publishPromotedItemClickEvent((PromotedTrackItem)listitem);
_L4:
        handleListItemClick(view, i, listitem);
        return;
_L2:
        if (listitem instanceof PromotedPlaylistItem)
        {
            publishPromotedItemClickEvent((PromotedPlaylistItem)listitem);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected CollectionBinding onRefreshBinding()
    {
        return CollectionBinding.from(streamOperations.updatedStreamItems()).withAdapter(adapter).withPager(streamOperations.pagingFunction()).build();
    }

    public void onStationOnboardingItemClosed(int i)
    {
        stationsOperations.disableOnboarding();
        removeItem(i);
    }

    public void onViewCreated(Fragment fragment1, View view, Bundle bundle)
    {
        super.onViewCreated(fragment1, view, bundle);
        configureEmptyView();
        addScrollListeners();
        viewLifeCycle = new b(new Y[] {
            eventBus.subscribe(EventQueue.CURRENT_PLAY_QUEUE_ITEM, new UpdatePlayingTrackSubscriber(adapter)), eventBus.subscribe(EventQueue.ENTITY_STATE_CHANGED, new UpdateEntityListSubscriber(adapter))
        });
    }
}
