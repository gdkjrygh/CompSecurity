// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.actionbar.PullToRefreshController;
import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.offline.OfflinePlaybackOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.playback.ShowPlayerSubscriber;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.android.presentation.ListItemAdapter;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.android.util.AnimUtils;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.List;
import javax.inject.Provider;
import rx.X;
import rx.Y;
import rx.a.b.a;
import rx.g.m;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistOperations, PlaylistWithTracks, PlaylistDetailsController, PlaylistPresenter, 
//            PlaylistEngagementsPresenter

public class PlaylistDetailFragment extends LightCycleSupportFragment
    implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener, android.widget.AdapterView.OnItemClickListener, PlaylistDetailsController.Listener
{
    private class PlaylistSubscriber extends DefaultSubscriber
    {

        final PlaylistDetailFragment this$0;

        public void onCompleted()
        {
            controller.setEmptyViewStatus(com.soundcloud.android.view.EmptyView.Status.OK);
            pullToRefreshController.stopRefreshing();
        }

        public void onError(Throwable throwable)
        {
            super.onError(throwable);
            if (throwable instanceof PlaylistOperations.PlaylistMissingException)
            {
                Toast.makeText(getActivity(), 0x7f070182, 0).show();
                getActivity().finish();
                return;
            } else
            {
                controller.setEmptyViewStatus(ErrorUtils.emptyViewStatusFromError(throwable));
                showContent(true);
                pullToRefreshController.stopRefreshing();
                return;
            }
        }

        public void onNext(PlaylistWithTracks playlistwithtracks)
        {
            (new StringBuilder("got playlist; track count = ")).append(playlistwithtracks.getTracks().size());
            refreshMetaData(playlistwithtracks);
            controller.setContent(playlistwithtracks, getPromotedSourceInfo());
            showContent(true);
            if (playOnLoad && controller.hasTracks())
            {
                playFromBeginning();
                playOnLoad = false;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((PlaylistWithTracks)obj);
        }

        private PlaylistSubscriber()
        {
            this$0 = PlaylistDetailFragment.this;
            super();
        }

        PlaylistSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class RefreshSubscriber extends PlaylistSubscriber
    {

        final PlaylistDetailFragment this$0;

        public final void onError(Throwable throwable)
        {
            if (controller.hasContent())
            {
                Toast.makeText(getActivity(), 0x7f0700f7, 0).show();
                pullToRefreshController.stopRefreshing();
                return;
            } else
            {
                super.onError(throwable);
                return;
            }
        }

        private RefreshSubscriber()
        {
            this$0 = PlaylistDetailFragment.this;
            super(null);
        }

        RefreshSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class ShowPlayerAfterPlaybackSubscriber extends ShowPlayerSubscriber
    {

        final PlaylistDetailFragment this$0;

        public final void onError(Throwable throwable)
        {
            super.onError(throwable);
            if (throwable instanceof IllegalStateException)
            {
                playToggle.setChecked(false);
            }
        }

        public ShowPlayerAfterPlaybackSubscriber(EventBus eventbus)
        {
            this$0 = PlaylistDetailFragment.this;
            super(eventbus, playbackToastHelper);
        }
    }


    public static final String EXTRA_PROMOTED_SOURCE_INFO = "promoted_source_info";
    public static final String EXTRA_QUERY_SOURCE_INFO = "query_source_info";
    public static final String EXTRA_URN = "urn";
    AccountOperations accountOperations;
    private PlaylistDetailsController controller;
    PlaylistDetailsController.Provider controllerProvider;
    PlaylistEngagementsPresenter engagementsPresenter;
    EventBus eventBus;
    private b eventSubscription;
    Provider expandPlayerSubscriberProvider;
    FeatureOperations featureOperations;
    private View headerUsernameText;
    ImageOperations imageOperations;
    private boolean listShown;
    private ListView listView;
    private rx.b loadPlaylist;
    Navigator navigator;
    OfflinePlaybackOperations offlinePlaybackOperations;
    private final android.view.View.OnClickListener onHeaderTextClick;
    private final android.view.View.OnClickListener onPlayToggleClick;
    private boolean playOnLoad;
    PlayQueueManager playQueueManager;
    PlaySessionController playSessionController;
    private ToggleButton playToggle;
    PlaybackToastHelper playbackToastHelper;
    PlaylistOperations playlistOperations;
    PlaylistPresenter playlistPresenter;
    private Y playlistSubscription;
    private PlaylistWithTracks playlistWithTracks;
    private final DefaultSubscriber playstateTransitionSubscriber;
    private View progressView;
    PullToRefreshController pullToRefreshController;
    private final DefaultSubscriber trackAddedToPlaylist;

    public PlaylistDetailFragment()
    {
        playlistSubscription = RxUtils.invalidSubscription();
        eventSubscription = new b();
        onPlayToggleClick = new _cls1();
        onHeaderTextClick = new _cls2();
        playstateTransitionSubscriber = new _cls3();
        trackAddedToPlaylist = new _cls4();
        SoundCloudApplication.getObjectGraph().a(this);
        addLifeCycleComponents();
    }

    PlaylistDetailFragment(PlaylistDetailsController.Provider provider, PlaySessionController playsessioncontroller, OfflinePlaybackOperations offlineplaybackoperations, PlaylistOperations playlistoperations, EventBus eventbus, ImageOperations imageoperations, PlaylistEngagementsPresenter playlistengagementspresenter, 
            PullToRefreshController pulltorefreshcontroller, PlayQueueManager playqueuemanager, PlaylistPresenter playlistpresenter, Provider provider1, FeatureOperations featureoperations, AccountOperations accountoperations, Navigator navigator1)
    {
        playlistSubscription = RxUtils.invalidSubscription();
        eventSubscription = new b();
        onPlayToggleClick = new _cls1();
        onHeaderTextClick = new _cls2();
        playstateTransitionSubscriber = new _cls3();
        trackAddedToPlaylist = new _cls4();
        controllerProvider = provider;
        playSessionController = playsessioncontroller;
        playlistOperations = playlistoperations;
        offlinePlaybackOperations = offlineplaybackoperations;
        eventBus = eventbus;
        imageOperations = imageoperations;
        engagementsPresenter = playlistengagementspresenter;
        pullToRefreshController = pulltorefreshcontroller;
        playQueueManager = playqueuemanager;
        playlistPresenter = playlistpresenter;
        expandPlayerSubscriberProvider = provider1;
        featureOperations = featureoperations;
        accountOperations = accountoperations;
        navigator = navigator1;
        addLifeCycleComponents();
    }

    private void addLifeCycleComponents()
    {
        pullToRefreshController.setRefreshListener(this);
    }

    private void configureInfoViews(View view)
    {
        View view1 = view.findViewById(0x7f0f0200);
        view = view1;
        if (view1 == null)
        {
            view = createDetailsHeader();
        }
        setupPlaylistDetails(view);
    }

    public static PlaylistDetailFragment create(Urn urn, Screen screen, SearchQuerySourceInfo searchquerysourceinfo, PromotedSourceInfo promotedsourceinfo)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("urn", urn);
        bundle.putParcelable("query_source_info", searchquerysourceinfo);
        bundle.putParcelable("promoted_source_info", promotedsourceinfo);
        screen.addToBundle(bundle);
        urn = new PlaylistDetailFragment();
        urn.setArguments(bundle);
        return urn;
    }

    private View createDetailsHeader()
    {
        View view = View.inflate(getActivity(), 0x7f03009a, null);
        listView.addHeaderView(view, null, false);
        return view;
    }

    private void createLoadPlaylistObservable()
    {
        loadPlaylist = playlistOperations.playlist(getPlaylistUrn()).observeOn(a.a());
    }

    private PlaySessionSource getPlaySessionSource()
    {
        PlaySessionSource playsessionsource = PlaySessionSource.forPlaylist(Screen.fromBundle(getArguments()).get(), playlistWithTracks.getUrn(), playlistWithTracks.getCreatorUrn(), playlistWithTracks.getTrackCount());
        playsessionsource.setPromotedSourceInfo(getPromotedSourceInfo());
        return playsessionsource;
    }

    private Urn getPlaylistUrn()
    {
        if (playlistWithTracks != null)
        {
            return playlistWithTracks.getUrn();
        } else
        {
            return (Urn)getArguments().getParcelable("urn");
        }
    }

    private PromotedSourceInfo getPromotedSourceInfo()
    {
        return (PromotedSourceInfo)getArguments().getParcelable("promoted_source_info");
    }

    private SearchQuerySourceInfo getSearchQuerySourceInfo()
    {
        return (SearchQuerySourceInfo)getArguments().getParcelable("query_source_info");
    }

    private void playFromBeginning()
    {
        playTracksAtPosition(0, new ShowPlayerAfterPlaybackSubscriber(eventBus));
    }

    private void playTracksAtPosition(int i, X x)
    {
        PlaySessionSource playsessionsource = getPlaySessionSource();
        TrackItem trackitem = (TrackItem)controller.getAdapter().getItem(i);
        PromotedSourceInfo promotedsourceinfo = getPromotedSourceInfo();
        SearchQuerySourceInfo searchquerysourceinfo = getSearchQuerySourceInfo();
        if (promotedsourceinfo != null)
        {
            playsessionsource.setPromotedSourceInfo(promotedsourceinfo);
        } else
        if (searchquerysourceinfo != null)
        {
            playsessionsource.setSearchQuerySourceInfo(searchquerysourceinfo);
        }
        if (shouldShowUpsell(trackitem))
        {
            navigator.openUpgrade(getActivity());
            return;
        } else
        {
            offlinePlaybackOperations.playPlaylist(playlistWithTracks.getUrn(), trackitem.getEntityUrn(), i, playsessionsource).subscribe(x);
            return;
        }
    }

    private void setupPlaylistDetails(View view)
    {
        playlistPresenter.setTitleView((TextView)view.findViewById(0x7f0f0073)).setPrivateTitleView((TextView)view.findViewById(0x7f0f01fd)).setUsernameView((TextView)view.findViewById(0x7f0f0151)).setArtwork((ImageView)view.findViewById(0x7f0f00ce), ApiImageSize.getFullImageSize(getActivity().getResources()));
        engagementsPresenter.bindView(view, new _cls5());
        playToggle = (ToggleButton)view.findViewById(0x7f0f01fc);
        playToggle.setOnClickListener(onPlayToggleClick);
        headerUsernameText = view.findViewById(0x7f0f0151);
        headerUsernameText.setOnClickListener(onHeaderTextClick);
    }

    private boolean shouldShowUpsell(TrackItem trackitem)
    {
        return trackitem.isMidTier() && featureOperations.upsellMidTier();
    }

    private void showContent(boolean flag)
    {
        listShown = flag;
        controller.setListShown(flag);
        View view = progressView;
        byte byte0;
        if (listShown)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
    }

    private void subscribeToLoadObservable()
    {
        playlistSubscription.unsubscribe();
        playlistSubscription = loadPlaylist.subscribe(new PlaylistSubscriber(null));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        createLoadPlaylistObservable();
        if (bundle == null)
        {
            playOnLoad = getActivity().getIntent().getBooleanExtra("autoplay", false);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        controller = controllerProvider.create();
        return layoutinflater.inflate(0x7f03009b, viewgroup, false);
    }

    public void onDestroyView()
    {
        playlistSubscription.unsubscribe();
        controller.onDestroyView();
        super.onDestroyView();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        playTracksAtPosition(i - listView.getHeaderViewsCount(), (X)expandPlayerSubscriberProvider.get());
    }

    public void onPause()
    {
        eventSubscription.unsubscribe();
        eventSubscription = new b();
        super.onPause();
    }

    public void onPlaylistContentChanged()
    {
        createLoadPlaylistObservable();
        if (isAdded())
        {
            subscribeToLoadObservable();
        }
    }

    public void onRefresh()
    {
        playlistSubscription = playlistOperations.updatedPlaylistInfo(getPlaylistUrn()).observeOn(a.a()).subscribe(new RefreshSubscriber(null));
    }

    public void onResume()
    {
        super.onResume();
        eventSubscription.a(eventBus.subscribe(EventQueue.PLAYBACK_STATE_CHANGED, playstateTransitionSubscriber));
        eventSubscription.a(eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(EntityStateChangedEvent.IS_TRACK_ADDED_TO_PLAYLIST_FILTER).observeOn(a.a()).subscribe(trackAddedToPlaylist));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        controller.onViewCreated(view, bundle);
        progressView = view.findViewById(0x7f0f0174);
        listView = (ListView)view.findViewById(0x102000a);
        listView.setOnItemClickListener(this);
        listView.setOnScrollListener(imageOperations.createScrollPauseListener(false, true));
        configureInfoViews(view);
        listView.setAdapter(controller.getAdapter());
        showContent(listShown);
        subscribeToLoadObservable();
    }

    protected void refreshMetaData(PlaylistWithTracks playlistwithtracks)
    {
        if (playlistwithtracks.isOwnedBy(accountOperations.getLoggedInUserUrn()))
        {
            controller.showTrackRemovalOptions(playlistwithtracks.getUrn(), this);
        }
        playlistWithTracks = playlistwithtracks;
        playlistPresenter.setPlaylist(playlistwithtracks);
        engagementsPresenter.setPlaylistInfo(playlistwithtracks, getPlaySessionSource());
        if (!playlistwithtracks.getTracks().isEmpty())
        {
            playToggle.setVisibility(0);
            AnimUtils.runFadeInAnimationOn(playToggle);
        } else
        {
            playToggle.setVisibility(8);
        }
        playlistPresenter.setTextVisibility(0);
        headerUsernameText.setEnabled(true);
    }










/*
    static boolean access$902(PlaylistDetailFragment playlistdetailfragment, boolean flag)
    {
        playlistdetailfragment.playOnLoad = flag;
        return flag;
    }

*/

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PlaylistDetailFragment this$0;

        public void onClick(View view)
        {
            if (playSessionController.shouldDisableSkipping())
            {
                playToggle.setChecked(false);
            }
            if (playQueueManager.isCurrentCollection(playlistWithTracks.getUrn()))
            {
                playSessionController.togglePlayback();
                return;
            } else
            {
                playFromBeginning();
                return;
            }
        }

        _cls1()
        {
            this$0 = PlaylistDetailFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PlaylistDetailFragment this$0;

        public void onClick(View view)
        {
            navigator.openProfile(getActivity(), playlistWithTracks.getCreatorUrn());
        }

        _cls2()
        {
            this$0 = PlaylistDetailFragment.this;
            super();
        }
    }


    private class _cls3 extends DefaultSubscriber
    {

        final PlaylistDetailFragment this$0;

        public void onNext(com.soundcloud.android.playback.Player.StateTransition statetransition)
        {
            ToggleButton togglebutton = playToggle;
            boolean flag;
            if (playQueueManager.isCurrentCollection(getPlaylistUrn()) && statetransition.playSessionIsActive())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            togglebutton.setChecked(flag);
        }

        public volatile void onNext(Object obj)
        {
            onNext((com.soundcloud.android.playback.Player.StateTransition)obj);
        }

        _cls3()
        {
            this$0 = PlaylistDetailFragment.this;
            super();
        }
    }


    private class _cls4 extends DefaultSubscriber
    {

        final PlaylistDetailFragment this$0;

        public void onNext(EntityStateChangedEvent entitystatechangedevent)
        {
            if (entitystatechangedevent.getFirstUrn().equals(playlistWithTracks.getUrn()))
            {
                onPlaylistContentChanged();
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((EntityStateChangedEvent)obj);
        }

        _cls4()
        {
            this$0 = PlaylistDetailFragment.this;
            super();
        }
    }


    private class _cls5
        implements OriginProvider
    {

        final PlaylistDetailFragment this$0;

        public String getScreenTag()
        {
            return Screen.fromBundle(getArguments()).get();
        }

        _cls5()
        {
            this$0 = PlaylistDetailFragment.this;
            super();
        }
    }

}
