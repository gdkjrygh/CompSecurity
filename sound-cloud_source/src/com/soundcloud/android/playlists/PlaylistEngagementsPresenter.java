// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.analytics.OriginProvider;
import com.soundcloud.android.associations.RepostOperations;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.CurrentDownloadEvent;
import com.soundcloud.android.events.EntityMetadata;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.TrackingEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.events.UpgradeTrackingEvent;
import com.soundcloud.android.likes.LikeOperations;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.offline.OfflinePlaybackOperations;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.playback.ShowPlayerSubscriber;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.share.ShareOperations;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;
import rx.a.b.a;
import rx.b.f;
import rx.g.m;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistWithTracks, PlaylistEngagementsView, RepostResultSubscriber, PlaylistProperty

public class PlaylistEngagementsPresenter extends DefaultSupportFragmentLightCycle
    implements PlaylistEngagementsView.OnEngagementListener
{
    private class OfflineStateSubscriber extends DefaultSubscriber
    {

        final PlaylistEngagementsPresenter this$0;

        public void onNext(OfflineState offlinestate)
        {
            playlistEngagementsView.showOfflineState(offlinestate);
        }

        public volatile void onNext(Object obj)
        {
            onNext((OfflineState)obj);
        }

        private OfflineStateSubscriber()
        {
            this$0 = PlaylistEngagementsPresenter.this;
            super();
        }

        OfflineStateSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class OfflineStatusSubscriber extends DefaultSubscriber
    {

        final PlaylistEngagementsPresenter this$0;

        public void onNext(PropertySet propertyset)
        {
            if (!((Boolean)propertyset.get(com.soundcloud.android.offline.OfflineProperty.Collection.IS_MARKED_FOR_OFFLINE)).booleanValue())
            {
                playlistEngagementsView.showOfflineState(OfflineState.NO_OFFLINE);
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((PropertySet)obj);
        }

        private OfflineStatusSubscriber()
        {
            this$0 = PlaylistEngagementsPresenter.this;
            super();
        }

        OfflineStatusSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class PlaylistChangedSubscriber extends DefaultSubscriber
    {

        final PlaylistEngagementsPresenter this$0;

        public void onNext(EntityStateChangedEvent entitystatechangedevent)
        {
            if (playlistWithTracks != null && playlistWithTracks.getUrn().equals(entitystatechangedevent.getFirstUrn()))
            {
                entitystatechangedevent = entitystatechangedevent.getNextChangeSet();
                playlistWithTracks.update(entitystatechangedevent);
                if (entitystatechangedevent.contains(PlaylistProperty.IS_LIKED))
                {
                    playlistEngagementsView.updateLikeItem(((Integer)entitystatechangedevent.get(PlayableProperty.LIKES_COUNT)).intValue(), ((Boolean)entitystatechangedevent.get(PlayableProperty.IS_LIKED)).booleanValue());
                }
                if (entitystatechangedevent.contains(PlaylistProperty.IS_REPOSTED))
                {
                    playlistEngagementsView.showPublicOptions(((Boolean)entitystatechangedevent.get(PlayableProperty.IS_REPOSTED)).booleanValue());
                }
                if (entitystatechangedevent.contains(com.soundcloud.android.offline.OfflineProperty.Collection.IS_MARKED_FOR_OFFLINE))
                {
                    updateOfflineAvailability();
                }
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((EntityStateChangedEvent)obj);
        }

        private PlaylistChangedSubscriber()
        {
            this$0 = PlaylistEngagementsPresenter.this;
            super();
        }

        PlaylistChangedSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private final AccountOperations accountOperations;
    private Context context;
    private final EventBus eventBus;
    private final FeatureOperations featureOperations;
    private Y foregroundSubscription;
    private final LikeOperations likeOperations;
    private final Navigator navigator;
    private final OfflineContentOperations offlineOperations;
    private final OfflinePlaybackOperations offlinePlaybackOperations;
    private b offlineStateSubscription;
    private OriginProvider originProvider;
    private PlaySessionSource playSessionSourceInfo;
    private final PlaybackToastHelper playbackToastHelper;
    private final PlaylistEngagementsView playlistEngagementsView;
    private PlaylistWithTracks playlistWithTracks;
    private final RepostOperations repostOperations;
    private final ShareOperations shareOperations;

    public PlaylistEngagementsPresenter(EventBus eventbus, RepostOperations repostoperations, AccountOperations accountoperations, LikeOperations likeoperations, PlaylistEngagementsView playlistengagementsview, FeatureOperations featureoperations, OfflineContentOperations offlinecontentoperations, 
            OfflinePlaybackOperations offlineplaybackoperations, PlaybackToastHelper playbacktoasthelper, Navigator navigator1, ShareOperations shareoperations)
    {
        playSessionSourceInfo = PlaySessionSource.EMPTY;
        foregroundSubscription = RxUtils.invalidSubscription();
        offlineStateSubscription = new b();
        eventBus = eventbus;
        repostOperations = repostoperations;
        accountOperations = accountoperations;
        likeOperations = likeoperations;
        playlistEngagementsView = playlistengagementsview;
        featureOperations = featureoperations;
        offlineOperations = offlinecontentoperations;
        offlinePlaybackOperations = offlineplaybackoperations;
        playbackToastHelper = playbacktoasthelper;
        navigator = navigator1;
        shareOperations = shareoperations;
    }

    private TrackingEvent getOfflinePlaylistTrackingEvent(boolean flag)
    {
        if (flag)
        {
            return UIEvent.fromAddOfflinePlaylist(Screen.PLAYLIST_DETAILS.get(), playlistWithTracks.getUrn(), playSessionSourceInfo.getPromotedSourceInfo());
        } else
        {
            return UIEvent.fromRemoveOfflinePlaylist(Screen.PLAYLIST_DETAILS.get(), playlistWithTracks.getUrn(), playSessionSourceInfo.getPromotedSourceInfo());
        }
    }

    private f isCurrentPlaylist(final PlaylistWithTracks playlistWithTracks)
    {
        return new _cls2();
    }

    private boolean isEligibleForOfflineContent()
    {
        return playlistWithTracks.isPostedByUser() || playlistWithTracks.isLikedByUser();
    }

    private f isPlaylist(final PlaylistWithTracks playlistWithTracks)
    {
        return new _cls3();
    }

    private rx.b.a publishAnalyticsEventForShuffle()
    {
        return new _cls4();
    }

    private void showPublicOptions(PlaylistWithTracks playlistwithtracks)
    {
        if (playlistwithtracks.isPublic())
        {
            boolean flag;
            if (!accountOperations.isLoggedInUser(playlistwithtracks.getCreatorUrn()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                playlistEngagementsView.showPublicOptions(playlistWithTracks.isRepostedByUser());
                return;
            } else
            {
                playlistEngagementsView.showPublicOptionsForYourTrack();
                return;
            }
        } else
        {
            playlistEngagementsView.hidePublicOptions();
            return;
        }
    }

    private void showShuffleOption(PlaylistWithTracks playlistwithtracks)
    {
        if (playlistwithtracks.getTrackCount() > 1)
        {
            playlistEngagementsView.enableShuffle();
            return;
        } else
        {
            playlistEngagementsView.disableShuffle();
            return;
        }
    }

    private void subscribeForOfflineContentUpdates()
    {
        if (featureOperations.isOfflineContentEnabled())
        {
            offlineStateSubscription.unsubscribe();
            offlineStateSubscription = new b();
            offlineStateSubscription.a(eventBus.queue(EventQueue.CURRENT_DOWNLOAD).filter(isPlaylist(playlistWithTracks)).map(CurrentDownloadEvent.TO_OFFLINE_STATE).observeOn(a.a()).startWith(playlistWithTracks.getDownloadState()).subscribe(new OfflineStateSubscriber(null)));
            offlineStateSubscription.a(eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(EntityStateChangedEvent.IS_PLAYLIST_OFFLINE_CONTENT_EVENT_FILTER).map(EntityStateChangedEvent.TO_SINGULAR_CHANGE).filter(isCurrentPlaylist(playlistWithTracks)).observeOn(a.a()).subscribe(new OfflineStatusSubscriber(null)));
        }
    }

    private void updateOfflineAvailability()
    {
        if (featureOperations.isOfflineContentEnabled() && isEligibleForOfflineContent())
        {
            playlistEngagementsView.setOfflineOptionsMenu(playlistWithTracks.isOfflineAvailable());
            return;
        }
        if (featureOperations.upsellOfflineContent())
        {
            playlistEngagementsView.showUpsell();
            return;
        } else
        {
            playlistEngagementsView.hideOfflineContentOptions();
            return;
        }
    }

    void bindView(View view)
    {
        bindView(view, ((OriginProvider) (new _cls1())));
    }

    void bindView(View view, OriginProvider originprovider)
    {
        context = view.getContext();
        originProvider = originprovider;
        playlistEngagementsView.onViewCreated(view);
        playlistEngagementsView.setOnEngagement(this);
    }

    public void onDestroyView(Fragment fragment)
    {
        playlistEngagementsView.onDestroyView();
    }

    public void onMakeOfflineAvailable(boolean flag)
    {
        rx.b b1;
        if (flag)
        {
            b1 = offlineOperations.makePlaylistAvailableOffline(playlistWithTracks.getUrn());
        } else
        {
            b1 = offlineOperations.makePlaylistUnavailableOffline(playlistWithTracks.getUrn());
        }
        DefaultSubscriber.fireAndForget(b1);
        eventBus.publish(EventQueue.TRACKING, getOfflinePlaylistTrackingEvent(flag));
    }

    public void onPause(Fragment fragment)
    {
        foregroundSubscription.unsubscribe();
        offlineStateSubscription.unsubscribe();
    }

    public void onPlayShuffled()
    {
        if (playlistWithTracks != null)
        {
            offlinePlaybackOperations.playPlaylistShuffled(playlistWithTracks.getUrn(), playSessionSourceInfo).doOnCompleted(publishAnalyticsEventForShuffle()).subscribe(new ShowPlayerSubscriber(eventBus, playbackToastHelper));
        }
    }

    public void onResume(Fragment fragment)
    {
        foregroundSubscription = eventBus.subscribe(EventQueue.ENTITY_STATE_CHANGED, new PlaylistChangedSubscriber(null));
    }

    public void onShare()
    {
        if (playlistWithTracks != null)
        {
            shareOperations.share(context, playlistWithTracks.getSourceSet(), originProvider.getScreenTag(), Screen.PLAYLIST_DETAILS.get(), playlistWithTracks.getUrn(), playSessionSourceInfo.getPromotedSourceInfo());
        }
    }

    public void onToggleLike(boolean flag)
    {
        if (playlistWithTracks != null)
        {
            eventBus.publish(EventQueue.TRACKING, UIEvent.fromToggleLike(flag, Screen.PLAYLIST_DETAILS.get(), originProvider.getScreenTag(), Screen.PLAYLIST_DETAILS.get(), playlistWithTracks.getUrn(), playlistWithTracks.getUrn(), playSessionSourceInfo.getPromotedSourceInfo(), EntityMetadata.from(playlistWithTracks)));
            DefaultSubscriber.fireAndForget(likeOperations.toggleLike(playlistWithTracks.getUrn(), flag));
        }
    }

    public void onToggleRepost(boolean flag, boolean flag1)
    {
label0:
        {
            if (playlistWithTracks != null)
            {
                eventBus.publish(EventQueue.TRACKING, UIEvent.fromToggleRepost(flag, originProvider.getScreenTag(), Screen.PLAYLIST_DETAILS.get(), playlistWithTracks.getUrn(), playlistWithTracks.getUrn(), playSessionSourceInfo.getPromotedSourceInfo(), EntityMetadata.from(playlistWithTracks)));
                if (!flag1)
                {
                    break label0;
                }
                repostOperations.toggleRepost(playlistWithTracks.getUrn(), flag).observeOn(a.a()).subscribe(new RepostResultSubscriber(context, flag));
            }
            return;
        }
        DefaultSubscriber.fireAndForget(repostOperations.toggleRepost(playlistWithTracks.getUrn(), flag));
    }

    public void onUpsell(Context context1)
    {
        navigator.openUpgrade(context1);
        eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forPlaylistPageClick());
    }

    public void onUpsellImpression()
    {
        eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forPlaylistPageImpression());
    }

    void setOriginProvider(OriginProvider originprovider)
    {
        originProvider = originprovider;
    }

    void setPlaylistInfo(PlaylistWithTracks playlistwithtracks, PlaySessionSource playsessionsource)
    {
        playlistWithTracks = playlistwithtracks;
        playSessionSourceInfo = playsessionsource;
        playsessionsource = context.getResources().getQuantityString(0x7f09001c, playlistwithtracks.getTrackCount(), new Object[] {
            Integer.valueOf(playlistwithtracks.getTrackCount())
        });
        playlistEngagementsView.setInfoText(context.getString(0x7f070183, new Object[] {
            playsessionsource, playlistwithtracks.getDuration()
        }));
        playlistEngagementsView.updateLikeItem(playlistWithTracks.getLikesCount(), playlistWithTracks.isLikedByUser());
        showPublicOptions(playlistwithtracks);
        showShuffleOption(playlistwithtracks);
        updateOfflineAvailability();
        subscribeForOfflineContentUpdates();
    }






    private class _cls2
        implements f
    {

        final PlaylistEngagementsPresenter this$0;
        final PlaylistWithTracks val$playlistWithTracks;

        public Boolean call(PropertySet propertyset)
        {
            return Boolean.valueOf(((Urn)propertyset.get(EntityProperty.URN)).equals(playlistWithTracks.getUrn()));
        }

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls2()
        {
            this$0 = PlaylistEngagementsPresenter.this;
            playlistWithTracks = playlistwithtracks;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final PlaylistEngagementsPresenter this$0;
        final PlaylistWithTracks val$playlistWithTracks;

        public Boolean call(CurrentDownloadEvent currentdownloadevent)
        {
            return Boolean.valueOf(currentdownloadevent.entities.contains(playlistWithTracks.getUrn()));
        }

        public volatile Object call(Object obj)
        {
            return call((CurrentDownloadEvent)obj);
        }

        _cls3()
        {
            this$0 = PlaylistEngagementsPresenter.this;
            playlistWithTracks = playlistwithtracks;
            super();
        }
    }


    private class _cls4
        implements rx.b.a
    {

        final PlaylistEngagementsPresenter this$0;

        public void call()
        {
            UIEvent uievent = UIEvent.fromShufflePlaylist(originProvider.getScreenTag(), playlistWithTracks.getUrn());
            eventBus.publish(EventQueue.TRACKING, uievent);
        }

        _cls4()
        {
            this$0 = PlaylistEngagementsPresenter.this;
            super();
        }
    }


    private class _cls1
        implements OriginProvider
    {

        final PlaylistEngagementsPresenter this$0;

        public String getScreenTag()
        {
            return Screen.UNKNOWN.get();
        }

        _cls1()
        {
            this$0 = PlaylistEngagementsPresenter.this;
            super();
        }
    }

}
