// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.MenuItem;
import android.view.View;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.analytics.ScreenElement;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.associations.RepostOperations;
import com.soundcloud.android.events.EntityMetadata;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.likes.LikeOperations;
import com.soundcloud.android.likes.LikeToggleSubscriber;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.ExpandPlayerSubscriber;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.playback.PlaybackResult;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.android.playlists.AddToPlaylistDialogFragment;
import com.soundcloud.android.playlists.PlaylistOperations;
import com.soundcloud.android.playlists.RepostResultSubscriber;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.share.ShareOperations;
import com.soundcloud.android.stations.StartStationPresenter;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.android.view.menu.PopupMenuWrapper;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;
import rx.a.b.a;
import rx.b;
import rx.h.f;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItem, OverflowMenuOptions, TrackRepository, DelayedLoadingDialogPresenter, 
//            PromotedTrackItem

public final class TrackItemMenuPresenter
    implements com.soundcloud.android.view.menu.PopupMenuWrapper.PopupMenuWrapperListener
{
    private static class ExpandAndDismissDialogSubscriber extends ExpandPlayerSubscriber
    {

        private final Context context;
        private final DelayedLoadingDialogPresenter delayedLoadingDialogPresenter;

        public void onError(Throwable throwable)
        {
            delayedLoadingDialogPresenter.onError(context);
            super.onError(throwable);
        }

        public void onNext(PlaybackResult playbackresult)
        {
            if (playbackresult.isSuccess())
            {
                expandPlayer();
                delayedLoadingDialogPresenter.onSuccess();
                return;
            } else
            {
                delayedLoadingDialogPresenter.onError(context);
                return;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((PlaybackResult)obj);
        }

        public ExpandAndDismissDialogSubscriber(Context context1, EventBus eventbus, PlaybackToastHelper playbacktoasthelper, DelayedLoadingDialogPresenter delayedloadingdialogpresenter)
        {
            super(eventbus, playbacktoasthelper);
            context = context1;
            delayedLoadingDialogPresenter = delayedloadingdialogpresenter;
        }
    }

    public static interface RemoveTrackListener
    {

        public abstract Urn getPlaylistUrn();

        public abstract void onPlaylistTrackRemoved(int i);
    }

    private static class TrackSubscriber extends DefaultSubscriber
    {

        private final PopupMenuWrapper menu;
        private final TrackItem track;

        private void updateLikeActionTitle(boolean flag)
        {
            MenuItem menuitem = menu.findItem(0x7f0f02c8);
            if (flag)
            {
                menuitem.setTitle(0x7f0700b3);
            } else
            {
                menuitem.setTitle(0x7f0700ac);
            }
            menu.setItemEnabled(0x7f0f02c8, true);
        }

        private void updateRepostActionTitle(boolean flag)
        {
            MenuItem menuitem = menu.findItem(0x7f0f0254);
            if (flag)
            {
                menuitem.setTitle(0x7f070217);
                return;
            } else
            {
                menuitem.setTitle(0x7f0701ce);
                return;
            }
        }

        public void onNext(PropertySet propertyset)
        {
            track.update(propertyset);
            updateLikeActionTitle(track.isLiked());
            updateRepostActionTitle(track.isReposted());
        }

        public volatile void onNext(Object obj)
        {
            onNext((PropertySet)obj);
        }

        public TrackSubscriber(TrackItem trackitem, PopupMenuWrapper popupmenuwrapper)
        {
            track = trackitem;
            menu = popupmenuwrapper;
        }
    }


    private final AccountOperations accountOperations;
    private FragmentActivity activity;
    private final Context context;
    private final DelayedLoadingDialogPresenter.Builder dialogBuilder;
    private final EventBus eventBus;
    private final FeatureFlags featureFlags;
    private final LikeOperations likeOperations;
    private OverflowMenuOptions menuOptions;
    private Urn pageUrn;
    private final PlaybackInitiator playbackInitiator;
    private final PlaybackToastHelper playbackToastHelper;
    private final PlaylistOperations playlistOperations;
    private final com.soundcloud.android.view.menu.PopupMenuWrapper.Factory popupMenuWrapperFactory;
    private int positionInAdapter;
    private PromotedSourceInfo promotedSourceInfo;
    private Y relatedTracksPlaybackSubscription;
    private RemoveTrackListener removeTrackListener;
    private final RepostOperations repostOperations;
    private final ScreenProvider screenProvider;
    private final ShareOperations shareOperations;
    private final StartStationPresenter startStationPresenter;
    private TrackItem track;
    private final TrackRepository trackRepository;
    private Y trackSubscription;

    TrackItemMenuPresenter(com.soundcloud.android.view.menu.PopupMenuWrapper.Factory factory, TrackRepository trackrepository, EventBus eventbus, Context context1, LikeOperations likeoperations, RepostOperations repostoperations, PlaylistOperations playlistoperations, 
            ScreenProvider screenprovider, PlaybackInitiator playbackinitiator, PlaybackToastHelper playbacktoasthelper, FeatureFlags featureflags, ShareOperations shareoperations, DelayedLoadingDialogPresenter.Builder builder, StartStationPresenter startstationpresenter, 
            AccountOperations accountoperations)
    {
        trackSubscription = RxUtils.invalidSubscription();
        relatedTracksPlaybackSubscription = RxUtils.invalidSubscription();
        popupMenuWrapperFactory = factory;
        trackRepository = trackrepository;
        eventBus = eventbus;
        context = context1;
        likeOperations = likeoperations;
        repostOperations = repostoperations;
        playlistOperations = playlistoperations;
        screenProvider = screenprovider;
        playbackInitiator = playbackinitiator;
        playbackToastHelper = playbacktoasthelper;
        featureFlags = featureflags;
        dialogBuilder = builder;
        startStationPresenter = startstationpresenter;
        shareOperations = shareoperations;
        accountOperations = accountoperations;
    }

    private boolean canRepost(TrackItem trackitem)
    {
        return !accountOperations.isLoggedInUser(trackitem.getCreatorUrn()) && !trackitem.isPrivate();
    }

    private void configureAdditionalEngagementsOptions(PopupMenuWrapper popupmenuwrapper)
    {
        if (featureFlags.isEnabled(Flag.NEW_STREAM) && menuOptions.showAllEngagements())
        {
            popupmenuwrapper.setItemVisible(0x7f0f0254, canRepost(track));
            boolean flag;
            if (!track.isPrivate())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            popupmenuwrapper.setItemVisible(0x7f0f02bf, flag);
        }
    }

    private PromotedSourceInfo getPromotedSource()
    {
        return promotedSourceInfo;
    }

    private void handleLike()
    {
        Urn urn = track.getEntityUrn();
        boolean flag;
        if (!track.isLiked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        likeOperations.toggleLike(urn, flag).observeOn(a.a()).subscribe(new LikeToggleSubscriber(context, flag));
        trackLike(flag);
    }

    private void handleRepost()
    {
        Urn urn = track.getEntityUrn();
        boolean flag;
        if (!track.isReposted())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        repostOperations.toggleRepost(urn, flag).observeOn(a.a()).subscribe(new RepostResultSubscriber(context, flag));
    }

    private void handleShare(Context context1)
    {
        shareOperations.share(context1, track.getSource(), ScreenElement.LIST.get(), screenProvider.getLastScreenTag(), pageUrn, getPromotedSource());
    }

    private boolean isOwnedPlaylist()
    {
        return removeTrackListener != null && !removeTrackListener.getPlaylistUrn().equals(Urn.NOT_SET);
    }

    private boolean isTrackFromPromotedPlaylist()
    {
        return promotedSourceInfo != null && promotedSourceInfo.getPromotedItemUrn().isPlaylist();
    }

    private void loadTrack(PopupMenuWrapper popupmenuwrapper)
    {
        trackSubscription.unsubscribe();
        trackSubscription = trackRepository.track(track.getEntityUrn()).observeOn(a.a()).subscribe(new TrackSubscriber(track, popupmenuwrapper));
    }

    private void playRelatedTracksWithDelayedLoadingDialog(Context context1, String s, String s1, int i)
    {
        s = dialogBuilder.setLoadingMessage(s).setOnErrorToastText(s1).setOnCancelListener(new _cls2()).create().show(context1);
        relatedTracksPlaybackSubscription = playbackInitiator.playTrackWithRecommendations(track.getEntityUrn(), new PlaySessionSource(screenProvider.getLastScreenTag()), i).observeOn(a.a()).subscribe(new ExpandAndDismissDialogSubscriber(context1, eventBus, playbackToastHelper, s));
    }

    private PopupMenuWrapper setupMenu(View view)
    {
        boolean flag = false;
        PopupMenuWrapper popupmenuwrapper = popupMenuWrapperFactory.build(view.getContext(), view);
        popupmenuwrapper.inflate(0x7f100008);
        popupmenuwrapper.setOnMenuItemClickListener(this);
        popupmenuwrapper.setOnDismissListener(this);
        popupmenuwrapper.setItemEnabled(0x7f0f02c8, false);
        if (!isOwnedPlaylist())
        {
            flag = true;
        }
        popupmenuwrapper.setItemVisible(0x7f0f02be, flag);
        popupmenuwrapper.setItemVisible(0x7f0f02ca, isOwnedPlaylist());
        popupmenuwrapper.setItemVisible(0x7f0f02c9, featureFlags.isEnabled(Flag.PLAY_RELATED_TRACKS));
        popupmenuwrapper.setItemEnabled(0x7f0f02c9, IOUtils.isConnected(view.getContext()));
        popupmenuwrapper.setItemVisible(0x7f0f02c3, featureFlags.isEnabled(Flag.STATIONS_SOFT_LAUNCH));
        popupmenuwrapper.setItemEnabled(0x7f0f02c3, IOUtils.isConnected(view.getContext()));
        configureAdditionalEngagementsOptions(popupmenuwrapper);
        popupmenuwrapper.show();
        return popupmenuwrapper;
    }

    private void showAddToPlaylistDialog()
    {
        AddToPlaylistDialogFragment.from(track.getEntityUrn(), track.getTitle(), ScreenElement.LIST.get(), screenProvider.getLastScreenTag()).show(activity.getFragmentManager());
    }

    private void trackLike(boolean flag)
    {
        Urn urn = track.getEntityUrn();
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromToggleLike(flag, ScreenElement.LIST.get(), screenProvider.getLastScreenTag(), screenProvider.getLastScreenTag(), urn, pageUrn, getPromotedSource(), EntityMetadata.from(track)));
    }

    public final void onDismiss()
    {
        trackSubscription.unsubscribe();
        trackSubscription = f.a();
        activity = null;
        track = null;
    }

    public final boolean onMenuItemClick(MenuItem menuitem, Context context1)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131690184: 
            handleLike();
            return true;

        case 2131690175: 
            handleShare(context1);
            return true;

        case 2131690068: 
            handleRepost();
            return true;

        case 2131690174: 
            showAddToPlaylistDialog();
            return true;

        case 2131690186: 
            Preconditions.checkState(isOwnedPlaylist());
            playlistOperations.removeTrackFromPlaylist(removeTrackListener.getPlaylistUrn(), track.getEntityUrn()).observeOn(a.a()).subscribe(new _cls1());
            return true;

        case 2131690185: 
            playRelatedTracksWithDelayedLoadingDialog(context1, context1.getString(0x7f07015f), context1.getString(0x7f070214), 1);
            return true;

        case 2131690179: 
            startStationPresenter.startStationForTrack(context1, track.getEntityUrn());
            return true;
        }
    }

    public final void show(FragmentActivity fragmentactivity, View view, TrackItem trackitem, int i)
    {
        show(fragmentactivity, view, trackitem, i, OverflowMenuOptions.builder().build());
    }

    public final void show(FragmentActivity fragmentactivity, View view, TrackItem trackitem, int i, Urn urn, RemoveTrackListener removetracklistener, PromotedSourceInfo promotedsourceinfo, 
            OverflowMenuOptions overflowmenuoptions)
    {
        activity = fragmentactivity;
        track = trackitem;
        positionInAdapter = i;
        removeTrackListener = removetracklistener;
        promotedSourceInfo = promotedsourceinfo;
        pageUrn = urn;
        menuOptions = overflowmenuoptions;
        loadTrack(setupMenu(view));
    }

    public final void show(FragmentActivity fragmentactivity, View view, TrackItem trackitem, int i, OverflowMenuOptions overflowmenuoptions)
    {
        if (trackitem instanceof PromotedTrackItem)
        {
            show(fragmentactivity, view, trackitem, i, Urn.NOT_SET, null, PromotedSourceInfo.fromItem((PromotedTrackItem)trackitem), overflowmenuoptions);
            return;
        } else
        {
            show(fragmentactivity, view, trackitem, i, Urn.NOT_SET, null, null, overflowmenuoptions);
            return;
        }
    }




    private class _cls2
        implements android.content.DialogInterface.OnCancelListener
    {

        final TrackItemMenuPresenter this$0;

        public void onCancel(DialogInterface dialoginterface)
        {
            relatedTracksPlaybackSubscription.unsubscribe();
        }

        _cls2()
        {
            this$0 = TrackItemMenuPresenter.this;
            super();
        }
    }


    private class _cls1 extends DefaultSubscriber
    {

        final TrackItemMenuPresenter this$0;

        public void onNext(PropertySet propertyset)
        {
            removeTrackListener.onPlaylistTrackRemoved(positionInAdapter);
        }

        public volatile void onNext(Object obj)
        {
            onNext((PropertySet)obj);
        }

        _cls1()
        {
            this$0 = TrackItemMenuPresenter.this;
            super();
        }
    }

}
