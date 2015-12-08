// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.actionbar.PullToRefreshController;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.presentation.PagingListItemAdapter;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.android.utils.AbsListViewParallaxer;
import com.soundcloud.android.view.ListViewController;
import com.soundcloud.android.view.RefreshableListComponent;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import dagger.b;
import javax.inject.Provider;
import rx.X;
import rx.Y;
import rx.a.a;

// Referenced classes of package com.soundcloud.android.explore:
//            ExploreTracksOperations, ExploreGenre

public class ExploreTracksFragment extends LightCycleSupportFragment
    implements RefreshableListComponent
{

    static final String SCREEN_TAG_EXTRA = "screen_tag";
    PagingListItemAdapter adapter;
    private Y connectionSubscription;
    ListViewController listViewController;
    private rx.c.b observable;
    ExploreTracksOperations operations;
    PlaybackInitiator playbackInitiator;
    PullToRefreshController pullToRefreshController;
    Provider subscriberProvider;
    private String trackingTag;

    public ExploreTracksFragment()
    {
        connectionSubscription = RxUtils.invalidSubscription();
        SoundCloudApplication.getObjectGraph().a(this);
        init();
    }

    ExploreTracksFragment(PagingListItemAdapter paginglistitemadapter, PlaybackInitiator playbackinitiator, ExploreTracksOperations exploretracksoperations, PullToRefreshController pulltorefreshcontroller, ListViewController listviewcontroller, Provider provider)
    {
        connectionSubscription = RxUtils.invalidSubscription();
        adapter = paginglistitemadapter;
        playbackInitiator = playbackinitiator;
        operations = exploretracksoperations;
        pullToRefreshController = pulltorefreshcontroller;
        listViewController = listviewcontroller;
        subscriberProvider = provider;
        init();
    }

    public static ExploreTracksFragment create(ExploreGenre exploregenre, Screen screen)
    {
        ExploreTracksFragment exploretracksfragment = new ExploreTracksFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("genre", exploregenre);
        bundle.putString("screen_tag", screen.get());
        exploretracksfragment.setArguments(bundle);
        return exploretracksfragment;
    }

    private void init()
    {
        listViewController.setAdapter(adapter, operations.pager(), TrackItem.fromApiTracks());
        listViewController.setScrollListener(new AbsListViewParallaxer(null));
        pullToRefreshController.setRefreshListener(this, adapter);
    }

    public volatile rx.b buildObservable()
    {
        return buildObservable();
    }

    public rx.c.b buildObservable()
    {
        Object obj = (ExploreGenre)getArguments().getParcelable("genre");
        obj = operations.pager().page(operations.getSuggestedTracks(((ExploreGenre) (obj)))).doOnNext(new _cls1()).map(TrackItem.fromApiTracks()).observeOn(rx.a.b.a.a()).replay();
        ((rx.c.b) (obj)).subscribe(adapter);
        return ((rx.c.b) (obj));
    }

    public volatile Y connectObservable(rx.b b1)
    {
        return connectObservable((rx.c.b)b1);
    }

    public Y connectObservable(rx.c.b b1)
    {
        observable = b1;
        connectionSubscription = observable.a();
        return connectionSubscription;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        connectObservable(buildObservable());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300bf, viewgroup, false);
    }

    public void onDestroy()
    {
        connectionSubscription.unsubscribe();
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (TrackItem)adapter.getItem(i);
        view = PlaySessionSource.forExplore(getArguments().getString("screen_tag"), trackingTag);
        playbackInitiator.playTrackWithRecommendationsLegacy(adapterview.getEntityUrn(), view).subscribe((X)subscriberProvider.get());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        listViewController.connect(this, observable);
        pullToRefreshController.connect(observable, adapter);
    }

    public volatile rx.b refreshObservable()
    {
        return refreshObservable();
    }

    public rx.c.b refreshObservable()
    {
        return buildObservable();
    }


/*
    static String access$002(ExploreTracksFragment exploretracksfragment, String s)
    {
        exploretracksfragment.trackingTag = s;
        return s;
    }

*/

    private class _cls1
        implements rx.b.b
    {

        final ExploreTracksFragment this$0;

        public void call(SuggestedTracksCollection suggestedtrackscollection)
        {
            trackingTag = suggestedtrackscollection.getTrackingTag();
        }

        public volatile void call(Object obj)
        {
            call((SuggestedTracksCollection)obj);
        }

        _cls1()
        {
            this$0 = ExploreTracksFragment.this;
            super();
        }
    }

}
