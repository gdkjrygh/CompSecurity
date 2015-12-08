// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.LruCache;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ads.AdProperty;
import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlaybackProgressEvent;
import com.soundcloud.android.events.PlayerUIEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.android.playback.ui.view.PlayerTrackPager;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.stations.StationsOperations;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rx.a.b.a;
import rx.b.f;
import rx.g.e;
import rx.g.m;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            ViewVisibilityProvider, TrackPageRecycler, PlayerPageData, PlayerPagePresenter, 
//            TrackPageData, PlayerItem, TrackPagePresenter, PlayerFragment, 
//            PlayerViewVisibilityProvider, AdPagePresenter, SkipListener, VideoPagePresenter

public class PlayerPagerPresenter extends DefaultSupportFragmentLightCycle
    implements com.soundcloud.android.cast.CastConnectionHelper.OnConnectionChangeListener
{
    private final class ClearAdOverlaySubscriber extends DefaultSubscriber
    {

        final PlayerPagerPresenter this$0;

        public final void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            currentplayqueueitemevent = pagesInPlayer.entrySet().iterator();
            do
            {
                if (!currentplayqueueitemevent.hasNext())
                {
                    break;
                }
                Object obj1 = (java.util.Map.Entry)currentplayqueueitemevent.next();
                Object obj = (PlayerPageData)((java.util.Map.Entry) (obj1)).getValue();
                PlayerPagePresenter playerpagepresenter = pagePresenter(((PlayerPageData) (obj)));
                obj1 = (View)((java.util.Map.Entry) (obj1)).getKey();
                if (((PlayerPageData) (obj)).isTrackPage())
                {
                    obj = (TrackPageData)obj;
                    if (!playQueueManager.isCurrentTrack(((TrackPageData) (obj)).getTrackUrn()))
                    {
                        playerpagepresenter.clearAdOverlay(((View) (obj1)));
                    }
                }
            } while (true);
        }

        public final volatile void onNext(Object obj)
        {
            onNext((CurrentPlayQueueItemEvent)obj);
        }

        private ClearAdOverlaySubscriber()
        {
            this$0 = PlayerPagerPresenter.this;
            super();
        }

        ClearAdOverlaySubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class PlaybackProgressSubscriber extends DefaultSubscriber
    {

        final PlayerPagerPresenter this$0;

        public final void onNext(PlaybackProgressEvent playbackprogressevent)
        {
            Iterator iterator = pagesInPlayer.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (java.util.Map.Entry)iterator.next();
                PlayerPagePresenter playerpagepresenter = pagePresenter((PlayerPageData)((java.util.Map.Entry) (obj)).getValue());
                obj = (View)((java.util.Map.Entry) (obj)).getKey();
                if (isTrackViewRelatedToUrn(((View) (obj)), playbackprogressevent.getTrackUrn()))
                {
                    playerpagepresenter.setProgress(((View) (obj)), playbackprogressevent.getPlaybackProgress());
                }
            } while (true);
        }

        public final volatile void onNext(Object obj)
        {
            onNext((PlaybackProgressEvent)obj);
        }

        private PlaybackProgressSubscriber()
        {
            this$0 = PlayerPagerPresenter.this;
            super();
        }

        PlaybackProgressSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class PlaybackStateSubscriber extends DefaultSubscriber
    {

        final PlayerPagerPresenter this$0;

        public final void onNext(com.soundcloud.android.playback.Player.StateTransition statetransition)
        {
            lastStateTransition = statetransition;
            Object obj;
            Object obj1;
            for (Iterator iterator = pagesInPlayer.entrySet().iterator(); iterator.hasNext(); configurePageFromPlayerState(statetransition, ((PlayerPagePresenter) (obj1)), ((View) (obj))))
            {
                obj = (java.util.Map.Entry)iterator.next();
                obj1 = (PlayerPageData)((java.util.Map.Entry) (obj)).getValue();
                obj1 = pagePresenter(((PlayerPageData) (obj1)));
                obj = (View)((java.util.Map.Entry) (obj)).getKey();
            }

        }

        public final volatile void onNext(Object obj)
        {
            onNext((com.soundcloud.android.playback.Player.StateTransition)obj);
        }

        private PlaybackStateSubscriber()
        {
            this$0 = PlayerPagerPresenter.this;
            super();
        }

        PlaybackStateSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private static class PlayerItemSubscriber extends DefaultSubscriber
    {

        private final View pageView;
        private final PlayerPagePresenter presenter;

        public void onNext(PlayerItem playeritem)
        {
            presenter.bindItemView(pageView, playeritem);
        }

        public volatile void onNext(Object obj)
        {
            onNext((PlayerItem)obj);
        }

        public PlayerItemSubscriber(PlayerPagePresenter playerpagepresenter, View view)
        {
            presenter = playerpagepresenter;
            pageView = view;
        }
    }

    private final class PlayerPanelSubscriber extends DefaultSubscriber
    {

        final PlayerPagerPresenter this$0;

        public final void onNext(PlayerUIEvent playeruievent)
        {
            lastPlayerUIEvent = playeruievent;
            PlayerPagePresenter playerpagepresenter;
            Object obj;
            for (Iterator iterator = pagesInPlayer.entrySet().iterator(); iterator.hasNext(); configurePageFromUiEvent(playeruievent, playerpagepresenter, ((View) (obj))))
            {
                obj = (java.util.Map.Entry)iterator.next();
                playerpagepresenter = pagePresenter((PlayerPageData)((java.util.Map.Entry) (obj)).getValue());
                obj = (View)((java.util.Map.Entry) (obj)).getKey();
            }

        }

        public final volatile void onNext(Object obj)
        {
            onNext((PlayerUIEvent)obj);
        }

        private PlayerPanelSubscriber()
        {
            this$0 = PlayerPagerPresenter.this;
            super();
        }

        PlayerPanelSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class TrackMetadataChangedSubscriber extends DefaultSubscriber
    {

        final PlayerPagerPresenter this$0;

        public void onNext(EntityStateChangedEvent entitystatechangedevent)
        {
            trackObservableCache.remove(entitystatechangedevent.getFirstUrn());
            Iterator iterator = pagesInPlayer.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (java.util.Map.Entry)iterator.next();
                PlayerPagePresenter playerpagepresenter = pagePresenter((PlayerPageData)((java.util.Map.Entry) (obj)).getValue());
                obj = (View)((java.util.Map.Entry) (obj)).getKey();
                if (isTrackViewRelatedToUrn(((View) (obj)), entitystatechangedevent.getFirstUrn()))
                {
                    playerpagepresenter.onPlayableUpdated(((View) (obj)), entitystatechangedevent);
                }
            } while (true);
        }

        public volatile void onNext(Object obj)
        {
            onNext((EntityStateChangedEvent)obj);
        }

        private TrackMetadataChangedSubscriber()
        {
            this$0 = PlayerPagerPresenter.this;
            super();
        }

        TrackMetadataChangedSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class TrackPagerAdapter extends PagerAdapter
    {

        final PlayerPagerPresenter this$0;

        private View instantiateAdView(PlayerPagePresenter playerpagepresenter, ViewGroup viewgroup, int i)
        {
            PlayerPageData playerpagedata = (PlayerPageData)currentData.get(i);
            if (playerpagedata.isTrackPage() && audioAdView == null)
            {
                audioAdView = playerpagepresenter.createItemView(viewgroup, skipListener);
            } else
            if (playerpagedata.isVideoPage() && videoAdView == null)
            {
                videoAdView = playerpagepresenter.createItemView(viewgroup, skipListener);
            }
            viewgroup = PlayerPagerPresenter.this;
            if (playerpagedata.isTrackPage())
            {
                playerpagepresenter = audioAdView;
            } else
            {
                playerpagepresenter = videoAdView;
            }
            return viewgroup.bindView(i, playerpagepresenter);
        }

        private View instantiateTrackView(int i)
        {
            Object obj1 = (TrackPageData)currentData.get(i);
            Object obj = ((TrackPageData) (obj1)).getTrackUrn();
            if (trackPageRecycler.hasExistingPage(((Urn) (obj))))
            {
                obj1 = trackPageRecycler.removePageByUrn(((Urn) (obj)));
                obj = obj1;
                if (!isForeground)
                {
                    trackPagePresenter.onBackground(((View) (obj1)));
                    obj = obj1;
                }
            } else
            {
                obj = trackPageRecycler.getRecycledPage();
                pagePresenter(((PlayerPageData) (obj1))).clearItemView(((View) (obj)));
            }
            bindView(i, ((View) (obj)));
            onTrackPageSet(((View) (obj)), i);
            return ((View) (obj));
        }

        public void destroyItem(ViewGroup viewgroup, int i, Object obj)
        {
            obj = (View)obj;
            viewgroup.removeView(((View) (obj)));
            if (isTrackView(obj))
            {
                viewgroup = ((TrackPageData)pagesInPlayer.get(obj)).getTrackUrn();
                trackPageRecycler.recyclePage(viewgroup, ((View) (obj)));
                if (!playQueueManager.isCurrentTrack(viewgroup))
                {
                    trackPagePresenter.onBackground(((View) (obj)));
                }
            }
            pagesInPlayer.remove(obj);
        }

        public int getCount()
        {
            return currentData.size();
        }

        public int getItemPosition(Object obj)
        {
            return -2;
        }

        public final Object instantiateItem(ViewGroup viewgroup, int i)
        {
            getItemViewType(i);
            JVM INSTR tableswitch 1 2: default 32
        //                       1 53
        //                       2 70;
               goto _L1 _L2 _L3
_L1:
            View view = instantiateTrackView(i);
_L5:
            configureInitialPageState(view);
            viewgroup.addView(view);
            return view;
_L2:
            view = instantiateAdView(adPagePresenter, viewgroup, i);
            continue; /* Loop/switch isn't completed */
_L3:
            view = instantiateAdView(videoPagePresenter, viewgroup, i);
            if (true) goto _L5; else goto _L4
_L4:
        }

        public boolean isViewFromObject(View view, Object obj)
        {
            return view.equals(obj);
        }

        private TrackPagerAdapter()
        {
            this$0 = PlayerPagerPresenter.this;
            super();
        }

        TrackPagerAdapter(_cls1 _pcls1)
        {
            this();
        }
    }


    static final int PAGE_VIEW_POOL_SIZE = 6;
    private static final f TO_PLAYER_AD = new _cls2();
    private static final int TRACK_CACHE_SIZE = 10;
    private static final int TYPE_AUDIO_AD_VIEW = 1;
    private static final int TYPE_TRACK_VIEW = 0;
    private static final int TYPE_VIDEO_AD_VIEW = 2;
    private final AdPagePresenter adPagePresenter;
    private View audioAdView;
    private b backgroundSubscription;
    private final CastConnectionHelper castConnectionHelper;
    private List currentData;
    private final f currentTrackFilter = new _cls1();
    private final EventBus eventBus;
    private b foregroundSubscription;
    private boolean isForeground;
    private PlayerUIEvent lastPlayerUIEvent;
    private com.soundcloud.android.playback.Player.StateTransition lastStateTransition;
    private final Map pagesInPlayer = new HashMap(6);
    private final PlayQueueManager playQueueManager;
    private final PlaySessionStateProvider playSessionStateProvider;
    private SkipListener skipListener;
    private final StationsOperations stationsOperations;
    private final f toPlayerTrack = new _cls3();
    private final LruCache trackObservableCache = new LruCache(10);
    private final TrackPagePresenter trackPagePresenter;
    private final TrackPageRecycler trackPageRecycler = new TrackPageRecycler();
    private final TrackPagerAdapter trackPagerAdapter = new TrackPagerAdapter(null);
    private final TrackRepository trackRepository;
    private View videoAdView;
    private final VideoPagePresenter videoPagePresenter;
    private ViewVisibilityProvider viewVisibilityProvider;

    PlayerPagerPresenter(PlayQueueManager playqueuemanager, PlaySessionStateProvider playsessionstateprovider, TrackRepository trackrepository, StationsOperations stationsoperations, TrackPagePresenter trackpagepresenter, AdPagePresenter adpagepresenter, VideoPagePresenter videopagepresenter, 
            CastConnectionHelper castconnectionhelper, EventBus eventbus)
    {
        foregroundSubscription = new b();
        backgroundSubscription = new b();
        currentData = Collections.emptyList();
        viewVisibilityProvider = ViewVisibilityProvider.EMPTY;
        playQueueManager = playqueuemanager;
        trackRepository = trackrepository;
        trackPagePresenter = trackpagepresenter;
        playSessionStateProvider = playsessionstateprovider;
        adPagePresenter = adpagepresenter;
        videoPagePresenter = videopagepresenter;
        castConnectionHelper = castconnectionhelper;
        eventBus = eventbus;
        stationsOperations = stationsoperations;
    }

    private View bindView(int i, View view)
    {
        PlayerPageData playerpagedata = (PlayerPageData)currentData.get(i);
        pagesInPlayer.put(view, playerpagedata);
        PlayerPagePresenter playerpagepresenter = pagePresenter(playerpagedata);
        if (isForeground)
        {
            playerpagepresenter.onForeground(view);
        }
        foregroundSubscription.a(getTrackOrAdObservable(playerpagedata).observeOn(a.a()).filter(isPlayerItemRelatedToView(view)).subscribe(new PlayerItemSubscriber(playerpagepresenter, view)));
        return view;
    }

    private void configureInitialPageState(View view)
    {
        PlayerPagePresenter playerpagepresenter = pagePresenter((PlayerPageData)pagesInPlayer.get(view));
        if (lastPlayerUIEvent != null)
        {
            configurePageFromUiEvent(lastPlayerUIEvent, playerpagepresenter, view);
        }
        if (lastStateTransition != null)
        {
            configurePageFromPlayerState(lastStateTransition, playerpagepresenter, view);
        }
    }

    private void configurePageFromPlayerState(com.soundcloud.android.playback.Player.StateTransition statetransition, PlayerPagePresenter playerpagepresenter, View view)
    {
        boolean flag;
        if (pagesInPlayer.containsKey(view) && ((PlayerPageData)pagesInPlayer.get(view)).isTrackPage() && isTrackViewRelatedToUrn(view, statetransition.getTrackUrn()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        playerpagepresenter.setPlayState(view, statetransition, flag, isForeground);
    }

    private void configurePageFromUiEvent(PlayerUIEvent playeruievent, PlayerPagePresenter playerpagepresenter, View view)
    {
        int i = playeruievent.getKind();
        if (i == 0)
        {
            playerpagepresenter.setExpanded(view);
        } else
        if (i == 1)
        {
            playerpagepresenter.setCollapsed(view);
            return;
        }
    }

    private SkipListener createSkipListener(final PlayerTrackPager trackPager)
    {
        return new _cls4();
    }

    private rx.b getAudioAdObservable(Urn urn, final PropertySet audioAd)
    {
        return rx.b.zip(getTrackObservable(urn), getTrackObservable((Urn)audioAd.get(AdProperty.MONETIZABLE_TRACK_URN)), new _cls8());
    }

    private rx.b getStationObservable(TrackPageData trackpagedata)
    {
        return rx.b.zip(getTrackObservable(trackpagedata.getTrackUrn(), trackpagedata.getProperties()).map(toPlayerTrack), stationsOperations.station(trackpagedata.getCollectionUrn()), new _cls5());
    }

    private rx.b getTrackObservable(Urn urn)
    {
        e e2 = (e)trackObservableCache.get(urn);
        e e1 = e2;
        if (e2 == null)
        {
            e1 = e.a();
            trackRepository.track(urn).observeOn(a.a()).subscribe(e1);
            trackObservableCache.put(urn, e1);
        }
        return e1;
    }

    private rx.b getTrackObservable(Urn urn, final PropertySet adOverlayData)
    {
        return getTrackObservable(urn).doOnNext(new _cls6());
    }

    private rx.b getTrackOrAdObservable(PlayerPageData playerpagedata)
    {
        if (playerpagedata.isVideoPage())
        {
            return getVideoAdObservable(playerpagedata.getProperties()).map(TO_PLAYER_AD);
        }
        playerpagedata = (TrackPageData)playerpagedata;
        if (playerpagedata.isAdPage())
        {
            return getAudioAdObservable(playerpagedata.getTrackUrn(), playerpagedata.getProperties()).map(TO_PLAYER_AD);
        }
        if (playerpagedata.isTrackPage() && playerpagedata.getCollectionUrn().isStation())
        {
            return getStationObservable(playerpagedata);
        } else
        {
            return getTrackObservable(playerpagedata.getTrackUrn(), playerpagedata.getProperties()).map(toPlayerTrack);
        }
    }

    private rx.b getVideoAdObservable(final PropertySet videoAd)
    {
        return getTrackObservable((Urn)videoAd.get(AdProperty.MONETIZABLE_TRACK_URN)).map(new _cls7());
    }

    private Boolean isPlayerItemRelatedToView(View view, PlayerItem playeritem)
    {
        if (playeritem.source.contains(AdProperty.AD_URN))
        {
            boolean flag;
            if (pagesInPlayer.containsKey(view) && ((PlayerPageData)pagesInPlayer.get(view)).isAdPage() && ((String)((PlayerPageData)pagesInPlayer.get(view)).getProperties().get(AdProperty.AD_URN)).equals(playeritem.source.get(AdProperty.AD_URN)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        } else
        {
            return Boolean.valueOf(isTrackViewRelatedToUrn(view, playeritem.getTrackUrn()));
        }
    }

    private f isPlayerItemRelatedToView(final View pageView)
    {
        return new _cls9();
    }

    private boolean isTrackViewRelatedToUrn(View view, Urn urn)
    {
        if (pagesInPlayer.containsKey(view) && ((PlayerPageData)pagesInPlayer.get(view)).isTrackPage())
        {
            return ((TrackPageData)pagesInPlayer.get(view)).getTrackUrn().equals(urn);
        } else
        {
            return trackPageRecycler.isPageForUrn(view, urn);
        }
    }

    private void onTrackPageSet(View view, int i)
    {
        TrackPageData trackpagedata = (TrackPageData)currentData.get(i);
        trackPagePresenter.onPositionSet(view, i, currentData.size());
        trackPagePresenter.setCastDeviceName(view, castConnectionHelper.getDeviceName());
        if (trackpagedata.hasAdOverlay())
        {
            trackPagePresenter.setAdOverlay(view, trackpagedata.getProperties());
            return;
        } else
        {
            trackPagePresenter.clearAdOverlay(view);
            return;
        }
    }

    private PlayerPagePresenter pagePresenter(PlayerPageData playerpagedata)
    {
        if (playerpagedata.isAdPage())
        {
            if (playerpagedata.isTrackPage())
            {
                return adPagePresenter;
            } else
            {
                return videoPagePresenter;
            }
        } else
        {
            return trackPagePresenter;
        }
    }

    private void populateScrapViews(PlayerTrackPager playertrackpager)
    {
        for (int i = 0; i < 6; i++)
        {
            View view = trackPagePresenter.createItemView(playertrackpager, skipListener);
            trackPageRecycler.addScrapView(view);
        }

    }

    private void setupClearAdOverlaySubscriber()
    {
        backgroundSubscription.a(eventBus.queue(EventQueue.CURRENT_PLAY_QUEUE_ITEM).observeOn(a.a()).subscribe(new ClearAdOverlaySubscriber(null)));
    }

    private void setupPlaybackProgressSubscriber()
    {
        foregroundSubscription.a(eventBus.queue(EventQueue.PLAYBACK_PROGRESS).filter(currentTrackFilter).observeOn(a.a()).subscribe(new PlaybackProgressSubscriber(null)));
    }

    private void setupPlaybackStateSubscriber()
    {
        foregroundSubscription.a(eventBus.queue(EventQueue.PLAYBACK_STATE_CHANGED).observeOn(a.a()).subscribe(new PlaybackStateSubscriber(null)));
    }

    private void setupPlayerPanelSubscriber()
    {
        backgroundSubscription.a(eventBus.subscribe(EventQueue.PLAYER_UI, new PlayerPanelSubscriber(null)));
    }

    private void setupTrackMetadataChangedSubscriber()
    {
        backgroundSubscription.a(eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(EntityStateChangedEvent.IS_TRACK_FILTER).observeOn(a.a()).subscribe(new TrackMetadataChangedSubscriber(null)));
    }

    private void updateProgress(PlayerPagePresenter playerpagepresenter, View view, Urn urn)
    {
        playerpagepresenter.setProgress(view, playSessionStateProvider.getLastProgressForTrack(urn));
    }

    public int getItemViewType(int i)
    {
        PlayerPageData playerpagedata = (PlayerPageData)currentData.get(i);
        if (playerpagedata.isAdPage())
        {
            return !playerpagedata.isVideoPage() ? 1 : 2;
        } else
        {
            return 0;
        }
    }

    int getPlayQueuePosition(int i)
    {
        return ((PlayerPageData)currentData.get(i)).getPositionInPlayQueue();
    }

    boolean isAdPageAtPosition(int i)
    {
        return ((PlayerPageData)currentData.get(i)).isAdPage();
    }

    public boolean isTrackView(Object obj)
    {
        return trackPagePresenter.accept((View)obj);
    }

    public void onCastConnectionChange()
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = pagesInPlayer.entrySet().iterator(); iterator.hasNext(); pagePresenter((PlayerPageData)entry.getValue()).setCastDeviceName((View)entry.getKey(), castConnectionHelper.getDeviceName()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    public volatile void onDestroyView(Fragment fragment)
    {
        onDestroyView((PlayerFragment)fragment);
    }

    public void onDestroyView(PlayerFragment playerfragment)
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = pagesInPlayer.entrySet().iterator(); iterator.hasNext(); pagePresenter((PlayerPageData)entry.getValue()).onDestroyView((View)entry.getKey()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        castConnectionHelper.removeOnConnectionChangeListener(this);
        skipListener = null;
        viewVisibilityProvider = ViewVisibilityProvider.EMPTY;
        backgroundSubscription.unsubscribe();
        backgroundSubscription = new b();
        super.onDestroyView(playerfragment);
    }

    public volatile void onPause(Fragment fragment)
    {
        onPause((PlayerFragment)fragment);
    }

    public void onPause(PlayerFragment playerfragment)
    {
        isForeground = false;
        foregroundSubscription.unsubscribe();
        foregroundSubscription = new b();
        java.util.Map.Entry entry;
        for (playerfragment = pagesInPlayer.entrySet().iterator(); playerfragment.hasNext(); pagePresenter((PlayerPageData)entry.getValue()).onBackground((View)entry.getKey()))
        {
            entry = (java.util.Map.Entry)playerfragment.next();
        }

    }

    void onPlayerSlide(float f)
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = pagesInPlayer.entrySet().iterator(); iterator.hasNext(); pagePresenter((PlayerPageData)entry.getValue()).onPlayerSlide((View)entry.getKey(), f))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    public volatile void onResume(Fragment fragment)
    {
        onResume((PlayerFragment)fragment);
    }

    public void onResume(PlayerFragment playerfragment)
    {
        isForeground = true;
        setupPlaybackStateSubscriber();
        setupPlaybackProgressSubscriber();
        java.util.Map.Entry entry;
        for (playerfragment = pagesInPlayer.entrySet().iterator(); playerfragment.hasNext(); pagePresenter((PlayerPageData)entry.getValue()).onForeground((View)entry.getKey()))
        {
            entry = (java.util.Map.Entry)playerfragment.next();
        }

    }

    void onTrackChange()
    {
        Iterator iterator = pagesInPlayer.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            View view = (View)((java.util.Map.Entry) (obj)).getKey();
            if (isTrackView(view))
            {
                obj = ((TrackPageData)((java.util.Map.Entry) (obj)).getValue()).getTrackUrn();
                trackPagePresenter.onPageChange(view);
                updateProgress(trackPagePresenter, view, ((Urn) (obj)));
            }
        } while (true);
    }

    public volatile void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        onViewCreated((PlayerFragment)fragment, view, bundle);
    }

    public void onViewCreated(PlayerFragment playerfragment, View view, Bundle bundle)
    {
        playerfragment = (PlayerTrackPager)view.findViewById(0x7f0f01d8);
        viewVisibilityProvider = new PlayerViewVisibilityProvider(playerfragment);
        playerfragment.setPageMargin(view.getResources().getDimensionPixelSize(0x7f0b00db));
        playerfragment.setPageMarginDrawable(0x7f0e0012);
        playerfragment.setAdapter(trackPagerAdapter);
        skipListener = createSkipListener(playerfragment);
        castConnectionHelper.addOnConnectionChangeListener(this);
        populateScrapViews(playerfragment);
        setupPlayerPanelSubscriber();
        setupTrackMetadataChangedSubscriber();
        setupClearAdOverlaySubscriber();
    }

    public void setCurrentData(List list)
    {
        currentData = list;
        trackPagerAdapter.notifyDataSetChanged();
    }






/*
    static PlayerUIEvent access$1102(PlayerPagerPresenter playerpagerpresenter, PlayerUIEvent playeruievent)
    {
        playerpagerpresenter.lastPlayerUIEvent = playeruievent;
        return playeruievent;
    }

*/





/*
    static com.soundcloud.android.playback.Player.StateTransition access$1502(PlayerPagerPresenter playerpagerpresenter, com.soundcloud.android.playback.Player.StateTransition statetransition)
    {
        playerpagerpresenter.lastStateTransition = statetransition;
        return statetransition;
    }

*/















/*
    static View access$2702(PlayerPagerPresenter playerpagerpresenter, View view)
    {
        playerpagerpresenter.audioAdView = view;
        return view;
    }

*/




/*
    static View access$2902(PlayerPagerPresenter playerpagerpresenter, View view)
    {
        playerpagerpresenter.videoAdView = view;
        return view;
    }

*/


    private class _cls1
        implements f
    {

        final PlayerPagerPresenter this$0;

        public Boolean call(PlaybackProgressEvent playbackprogressevent)
        {
            return Boolean.valueOf(playQueueManager.isCurrentTrack(playbackprogressevent.getTrackUrn()));
        }

        public volatile Object call(Object obj)
        {
            return call((PlaybackProgressEvent)obj);
        }

        _cls1()
        {
            this$0 = PlayerPagerPresenter.this;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final PlayerPagerPresenter this$0;

        public PlayerTrackState call(PropertySet propertyset)
        {
            return new PlayerTrackState(propertyset, playQueueManager.isCurrentTrack((Urn)propertyset.get(TrackProperty.URN)), isForeground, viewVisibilityProvider);
        }

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls3()
        {
            this$0 = PlayerPagerPresenter.this;
            super();
        }
    }


    private class _cls4
        implements SkipListener
    {

        final PlayerPagerPresenter this$0;
        final PlayerTrackPager val$trackPager;

        public void onNext()
        {
            trackPager.setCurrentItem(trackPager.getCurrentItem() + 1);
            eventBus.publish(EventQueue.TRACKING, PlayControlEvent.skip("full_player"));
        }

        public void onPrevious()
        {
            trackPager.setCurrentItem(trackPager.getCurrentItem() - 1);
            eventBus.publish(EventQueue.TRACKING, PlayControlEvent.previous("full_player"));
        }

        _cls4()
        {
            this$0 = PlayerPagerPresenter.this;
            trackPager = playertrackpager;
            super();
        }
    }


    private class _cls8
        implements g
    {

        final PlayerPagerPresenter this$0;
        final PropertySet val$audioAd;

        public PropertySet call(PropertySet propertyset, PropertySet propertyset1)
        {
            return propertyset.merge(audioAd).put(AdProperty.MONETIZABLE_TRACK_TITLE, propertyset1.get(PlayableProperty.TITLE)).put(AdProperty.MONETIZABLE_TRACK_CREATOR, propertyset1.get(PlayableProperty.CREATOR_NAME));
        }

        public volatile Object call(Object obj, Object obj1)
        {
            return call((PropertySet)obj, (PropertySet)obj1);
        }

        _cls8()
        {
            this$0 = PlayerPagerPresenter.this;
            audioAd = propertyset;
            super();
        }
    }


    private class _cls5
        implements g
    {

        final PlayerPagerPresenter this$0;

        public PlayerItem call(PlayerTrackState playertrackstate, StationRecord stationrecord)
        {
            playertrackstate.setStation(stationrecord);
            return playertrackstate;
        }

        public volatile Object call(Object obj, Object obj1)
        {
            return call((PlayerTrackState)obj, (StationRecord)obj1);
        }

        _cls5()
        {
            this$0 = PlayerPagerPresenter.this;
            super();
        }
    }


    private class _cls6
        implements rx.b.b
    {

        final PlayerPagerPresenter this$0;
        final PropertySet val$adOverlayData;

        public void call(PropertySet propertyset)
        {
            adOverlayData.put(TrackProperty.URN, propertyset.get(TrackProperty.URN)).put(TrackProperty.TITLE, propertyset.get(TrackProperty.TITLE)).put(TrackProperty.CREATOR_NAME, propertyset.get(TrackProperty.CREATOR_NAME)).put(TrackProperty.CREATOR_URN, propertyset.get(TrackProperty.CREATOR_URN));
        }

        public volatile void call(Object obj)
        {
            call((PropertySet)obj);
        }

        _cls6()
        {
            this$0 = PlayerPagerPresenter.this;
            adOverlayData = propertyset;
            super();
        }
    }


    private class _cls7
        implements f
    {

        final PlayerPagerPresenter this$0;
        final PropertySet val$videoAd;

        public PropertySet call(PropertySet propertyset)
        {
            return videoAd.put(AdProperty.MONETIZABLE_TRACK_TITLE, propertyset.get(PlayableProperty.TITLE)).put(AdProperty.MONETIZABLE_TRACK_CREATOR, propertyset.get(PlayableProperty.CREATOR_NAME));
        }

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls7()
        {
            this$0 = PlayerPagerPresenter.this;
            videoAd = propertyset;
            super();
        }
    }


    private class _cls9
        implements f
    {

        final PlayerPagerPresenter this$0;
        final View val$pageView;

        public Boolean call(PlayerItem playeritem)
        {
            return isPlayerItemRelatedToView(pageView, playeritem);
        }

        public volatile Object call(Object obj)
        {
            return call((PlayerItem)obj);
        }

        _cls9()
        {
            this$0 = PlayerPagerPresenter.this;
            pageView = view;
            super();
        }
    }


    private class _cls2
        implements f
    {

        public final PlayerItem call(PropertySet propertyset)
        {
            return new PlayerAd(propertyset);
        }

        public final volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls2()
        {
        }
    }

}
