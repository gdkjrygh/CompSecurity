// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.android.tracks.UpdatePlayingTrackSubscriber;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.adapters.TracksRecyclerItemAdapter;
import com.soundcloud.android.view.adapters.UpdateEntityListSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import javax.inject.Provider;
import rx.X;
import rx.Y;
import rx.b;

// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoveryOperations

class RecommendedTracksPresenter extends RecyclerViewPresenter
{

    static final String EXTRA_LOCAL_SEED_ID = "localSeedId";
    private final TracksRecyclerItemAdapter adapter;
    private final DiscoveryOperations discoveryOperations;
    private final EventBus eventBus;
    private final Provider expandPlayerSubscriberProvider;
    private final PlaybackInitiator playbackInitiator;
    private rx.h.b viewLifeCycle;

    RecommendedTracksPresenter(SwipeRefreshAttacher swiperefreshattacher, DiscoveryOperations discoveryoperations, TracksRecyclerItemAdapter tracksrecycleritemadapter, Provider provider, PlaybackInitiator playbackinitiator, EventBus eventbus)
    {
        super(swiperefreshattacher, com.soundcloud.android.presentation.RecyclerViewPresenter.Options.defaults());
        discoveryOperations = discoveryoperations;
        adapter = tracksrecycleritemadapter;
        expandPlayerSubscriberProvider = provider;
        playbackInitiator = playbackinitiator;
        eventBus = eventbus;
    }

    private void playRecommendedTracks(Urn urn, b b1)
    {
        playbackInitiator.playTracks(b1, urn, 0, new PlaySessionSource(Screen.RECOMMENDATIONS_MORE)).subscribe((X)expandPlayerSubscriberProvider.get());
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        long l = bundle.getLong("localSeedId");
        return CollectionBinding.from(discoveryOperations.recommendedTracksForSeed(l)).withAdapter(adapter).build();
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        getBinding().connect();
    }

    public void onDestroyView(Fragment fragment)
    {
        viewLifeCycle.unsubscribe();
        super.onDestroyView(fragment);
    }

    protected void onItemClicked(View view, int i)
    {
        playRecommendedTracks(((TrackItem)adapter.getItem(i)).getEntityUrn(), discoveryOperations.recommendedTracks());
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        viewLifeCycle = new rx.h.b(new Y[] {
            eventBus.subscribe(EventQueue.CURRENT_PLAY_QUEUE_ITEM, new UpdatePlayingTrackSubscriber(adapter)), eventBus.subscribe(EventQueue.ENTITY_STATE_CHANGED, new UpdateEntityListSubscriber(adapter))
        });
    }
}
