// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.utils.ErrorUtils;
import javax.inject.Provider;
import rx.X;
import rx.b;

// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoveryOperations, DiscoveryAdapter, RecommendationItem

class DiscoveryPresenter extends RecyclerViewPresenter
    implements DiscoveryAdapter.DiscoveryItemListener
{

    private final DiscoveryAdapter adapter;
    private final DiscoveryOperations discoveryOperations;
    private final Provider expandPlayerSubscriberProvider;
    private final FeatureFlags featureFlags;
    private final Navigator navigator;
    private final PlaybackInitiator playbackInitiator;

    DiscoveryPresenter(SwipeRefreshAttacher swiperefreshattacher, DiscoveryOperations discoveryoperations, DiscoveryAdapter discoveryadapter, Provider provider, PlaybackInitiator playbackinitiator, Navigator navigator1, FeatureFlags featureflags)
    {
        super(swiperefreshattacher, com.soundcloud.android.presentation.RecyclerViewPresenter.Options.defaults());
        discoveryOperations = discoveryoperations;
        adapter = discoveryadapter;
        expandPlayerSubscriberProvider = provider;
        playbackInitiator = playbackinitiator;
        navigator = navigator1;
        featureFlags = featureflags;
    }

    private b buildDiscoveryItemsObservable()
    {
        if (featureFlags.isEnabled(Flag.DISCOVERY_RECOMMENDATIONS))
        {
            return discoveryOperations.discoveryItemsAndRecommendations();
        } else
        {
            return discoveryOperations.discoveryItems();
        }
    }

    private void playRecommendations(Urn urn, b b1)
    {
        playbackInitiator.playTracks(b1, urn, 0, new PlaySessionSource(Screen.RECOMMENDATIONS_MAIN)).subscribe((X)expandPlayerSubscriberProvider.get());
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        adapter.setDiscoveryListener(this);
        return CollectionBinding.from(buildDiscoveryItemsObservable()).withAdapter(adapter).build();
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        getBinding().connect();
    }

    public void onRecommendationArtworkClicked(RecommendationItem recommendationitem)
    {
        playRecommendations(recommendationitem.getRecommendationUrn(), discoveryOperations.recommendedTracks());
    }

    public void onRecommendationReasonClicked(RecommendationItem recommendationitem)
    {
        playRecommendations(recommendationitem.getSeedTrackUrn(), discoveryOperations.recommendedTracksWithSeed(recommendationitem));
    }

    public void onRecommendationViewAllClicked(Context context, RecommendationItem recommendationitem)
    {
        navigator.openRecommendation(context, recommendationitem.getSeedTrackLocalId());
    }

    public void onSearchClicked(Context context)
    {
        navigator.openSearch((Activity)context);
    }

    public void onTagSelected(Context context, String s)
    {
        navigator.openPlaylistDiscoveryTag(context, s);
    }
}
