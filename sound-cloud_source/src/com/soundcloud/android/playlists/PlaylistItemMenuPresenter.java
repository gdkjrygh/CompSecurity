// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.analytics.ScreenElement;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.associations.RepostOperations;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.EntityMetadata;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.events.UpgradeTrackingEvent;
import com.soundcloud.android.likes.LikeOperations;
import com.soundcloud.android.likes.LikeToggleSubscriber;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.share.ShareOperations;
import com.soundcloud.android.tracks.OverflowMenuOptions;
import com.soundcloud.android.view.menu.PopupMenuWrapper;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;
import rx.a.b.a;
import rx.b;
import rx.h.f;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistItem, PromotedPlaylistItem, RepostResultSubscriber, PlaylistOperations, 
//            PlaylistWithTracks

public class PlaylistItemMenuPresenter
    implements com.soundcloud.android.view.menu.PopupMenuWrapper.PopupMenuWrapperListener
{
    private final class PlaylistSubscriber extends DefaultSubscriber
    {

        private final PopupMenuWrapper menu;
        private final PlaylistItem playlist;
        final PlaylistItemMenuPresenter this$0;

        public final void onNext(PlaylistWithTracks playlistwithtracks)
        {
            playlist.update(playlistwithtracks.getSourceSet());
            updateLikeActionTitle(menu, playlist.isLiked());
            updateRepostActionTitle(menu, playlist.isReposted());
            configureOfflineOptions(menu, playlist.isMarkedForOffline());
        }

        public final volatile void onNext(Object obj)
        {
            onNext((PlaylistWithTracks)obj);
        }

        public PlaylistSubscriber(PlaylistItem playlistitem, PopupMenuWrapper popupmenuwrapper)
        {
            this$0 = PlaylistItemMenuPresenter.this;
            super();
            playlist = playlistitem;
            menu = popupmenuwrapper;
        }
    }


    private final AccountOperations accountOperations;
    private final Context appContext;
    private final EventBus eventBus;
    private final FeatureFlags featureFlags;
    private final FeatureOperations featureOperations;
    private final LikeOperations likeOperations;
    private OverflowMenuOptions menuOptions;
    private final Navigator navigator;
    private final OfflineContentOperations offlineContentOperations;
    private PlaylistItem playlist;
    private final PlaylistOperations playlistOperations;
    private Y playlistSubscription;
    private final com.soundcloud.android.view.menu.PopupMenuWrapper.Factory popupMenuWrapperFactory;
    private final RepostOperations repostOperations;
    private final ScreenProvider screenProvider;
    private final ShareOperations shareOperations;

    public PlaylistItemMenuPresenter(Context context, EventBus eventbus, com.soundcloud.android.view.menu.PopupMenuWrapper.Factory factory, AccountOperations accountoperations, PlaylistOperations playlistoperations, LikeOperations likeoperations, RepostOperations repostoperations, 
            ShareOperations shareoperations, ScreenProvider screenprovider, FeatureOperations featureoperations, FeatureFlags featureflags, OfflineContentOperations offlinecontentoperations, Navigator navigator1)
    {
        playlistSubscription = RxUtils.invalidSubscription();
        appContext = context;
        eventBus = eventbus;
        popupMenuWrapperFactory = factory;
        accountOperations = accountoperations;
        playlistOperations = playlistoperations;
        likeOperations = likeoperations;
        repostOperations = repostoperations;
        shareOperations = shareoperations;
        screenProvider = screenprovider;
        featureOperations = featureoperations;
        featureFlags = featureflags;
        offlineContentOperations = offlinecontentoperations;
        navigator = navigator1;
    }

    private boolean canRepost(PlaylistItem playlistitem)
    {
        return !accountOperations.isLoggedInUser(playlistitem.getCreatorUrn()) && !playlistitem.isPrivate();
    }

    private void configureAdditionalEngagementsOptions(PopupMenuWrapper popupmenuwrapper)
    {
        if (featureFlags.isEnabled(Flag.NEW_STREAM) && menuOptions.showAllEngagements())
        {
            popupmenuwrapper.setItemVisible(0x7f0f0254, canRepost(playlist));
            boolean flag;
            if (!playlist.isPrivate())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            popupmenuwrapper.setItemVisible(0x7f0f02bf, flag);
            updateRepostActionTitle(popupmenuwrapper, playlist.isReposted());
        }
    }

    private void configureInitialOfflineOptions(PopupMenuWrapper popupmenuwrapper)
    {
        Optional optional = playlist.isMarkedForOffline();
        if (optional.isPresent() && menuOptions.showOffline())
        {
            configureOfflineOptions(popupmenuwrapper, optional);
        } else
        {
            hideAllOfflineContentOptions(popupmenuwrapper);
        }
        if (popupmenuwrapper.findItem(0x7f0f02c5).isVisible())
        {
            eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forPlaylistItemImpression());
        }
    }

    private void configureOfflineOptions(PopupMenuWrapper popupmenuwrapper, Optional optional)
    {
        if (featureOperations.isOfflineContentEnabled() && menuOptions.showOffline() && optional.isPresent())
        {
            showOfflineContentOption(popupmenuwrapper, ((Boolean)optional.get()).booleanValue());
            return;
        }
        if (featureOperations.upsellOfflineContent() && menuOptions.showOffline())
        {
            showUpsellOption(popupmenuwrapper);
            return;
        } else
        {
            hideAllOfflineContentOptions(popupmenuwrapper);
            return;
        }
    }

    private PromotedSourceInfo getPromotedSourceIfExists()
    {
        if (playlist instanceof PromotedPlaylistItem)
        {
            return PromotedSourceInfo.fromItem((PromotedPlaylistItem)playlist);
        } else
        {
            return null;
        }
    }

    private void handleLike()
    {
        Urn urn = playlist.getEntityUrn();
        boolean flag;
        if (!playlist.isLiked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        likeOperations.toggleLike(urn, flag).observeOn(a.a()).subscribe(new LikeToggleSubscriber(appContext, flag));
        playlistLike(flag);
        if (isUnlikingNotOwnedPlaylistInOfflineMode(flag))
        {
            DefaultSubscriber.fireAndForget(offlineContentOperations.makePlaylistUnavailableOffline(urn));
        }
    }

    private void handleRepost()
    {
        Urn urn = playlist.getEntityUrn();
        boolean flag;
        if (!playlist.isReposted())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        repostOperations.toggleRepost(urn, flag).observeOn(a.a()).subscribe(new RepostResultSubscriber(appContext, flag));
    }

    private void handleShare(Context context)
    {
        shareOperations.share(context, playlist.getSource(), ScreenElement.LIST.get(), screenProvider.getLastScreenTag(), Urn.NOT_SET, getPromotedSourceIfExists());
    }

    private void hideAllOfflineContentOptions(PopupMenuWrapper popupmenuwrapper)
    {
        popupmenuwrapper.setItemVisible(0x7f0f02c6, false);
        popupmenuwrapper.setItemVisible(0x7f0f02c7, false);
        popupmenuwrapper.setItemVisible(0x7f0f02c5, false);
    }

    private boolean isUnlikingNotOwnedPlaylistInOfflineMode(boolean flag)
    {
        boolean flag1;
        if (featureOperations.isOfflineContentEnabled() && menuOptions.showOffline())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag1 && !flag && !playlist.isPosted();
    }

    private void loadPlaylist(PopupMenuWrapper popupmenuwrapper)
    {
        playlistSubscription.unsubscribe();
        playlistSubscription = playlistOperations.playlist(playlist.getEntityUrn()).observeOn(a.a()).subscribe(new PlaylistSubscriber(playlist, popupmenuwrapper));
    }

    private void playlistLike(boolean flag)
    {
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromToggleLike(flag, ScreenElement.LIST.get(), screenProvider.getLastScreenTag(), screenProvider.getLastScreenTag(), playlist.getEntityUrn(), Urn.NOT_SET, getPromotedSourceIfExists(), EntityMetadata.from(playlist)));
    }

    private PopupMenuWrapper setupMenu(View view)
    {
        view = popupMenuWrapperFactory.build(view.getContext(), view);
        view.inflate(0x7f100006);
        view.setOnMenuItemClickListener(this);
        view.setOnDismissListener(this);
        updateLikeActionTitle(view, playlist.isLiked());
        configureAdditionalEngagementsOptions(view);
        configureInitialOfflineOptions(view);
        view.show();
        return view;
    }

    private void showOfflineContentOption(PopupMenuWrapper popupmenuwrapper, boolean flag)
    {
        if (flag)
        {
            showOfflineRemovalOption(popupmenuwrapper);
            return;
        } else
        {
            showOfflineDownloadOption(popupmenuwrapper);
            return;
        }
    }

    private void showOfflineDownloadOption(PopupMenuWrapper popupmenuwrapper)
    {
        popupmenuwrapper.setItemVisible(0x7f0f02c6, true);
        popupmenuwrapper.setItemVisible(0x7f0f02c7, false);
        popupmenuwrapper.setItemVisible(0x7f0f02c5, false);
    }

    private void showOfflineRemovalOption(PopupMenuWrapper popupmenuwrapper)
    {
        popupmenuwrapper.setItemVisible(0x7f0f02c6, false);
        popupmenuwrapper.setItemVisible(0x7f0f02c7, true);
        popupmenuwrapper.setItemVisible(0x7f0f02c5, false);
    }

    private void showUpsellOption(PopupMenuWrapper popupmenuwrapper)
    {
        popupmenuwrapper.setItemVisible(0x7f0f02c6, false);
        popupmenuwrapper.setItemVisible(0x7f0f02c7, false);
        popupmenuwrapper.setItemVisible(0x7f0f02c5, true);
    }

    private void updateLikeActionTitle(PopupMenuWrapper popupmenuwrapper, boolean flag)
    {
        popupmenuwrapper = popupmenuwrapper.findItem(0x7f0f02c8);
        if (flag)
        {
            popupmenuwrapper.setTitle(0x7f0700b3);
            return;
        } else
        {
            popupmenuwrapper.setTitle(0x7f0700ac);
            return;
        }
    }

    private void updateRepostActionTitle(PopupMenuWrapper popupmenuwrapper, boolean flag)
    {
        popupmenuwrapper = popupmenuwrapper.findItem(0x7f0f0254);
        if (flag)
        {
            popupmenuwrapper.setTitle(0x7f070217);
            return;
        } else
        {
            popupmenuwrapper.setTitle(0x7f0701ce);
            return;
        }
    }

    public void onDismiss()
    {
        playlistSubscription.unsubscribe();
        playlistSubscription = f.a();
        playlist = null;
    }

    public boolean onMenuItemClick(MenuItem menuitem, Context context)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131690184: 
            handleLike();
            return true;

        case 2131690068: 
            handleRepost();
            return true;

        case 2131690175: 
            handleShare(context);
            return true;

        case 2131690181: 
            navigator.openUpgrade(context);
            eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forPlaylistItemClick());
            return true;

        case 2131690182: 
            DefaultSubscriber.fireAndForget(offlineContentOperations.makePlaylistAvailableOffline(playlist.getEntityUrn()));
            eventBus.publish(EventQueue.TRACKING, UIEvent.fromAddOfflinePlaylist(screenProvider.getLastScreenTag(), playlist.getEntityUrn(), getPromotedSourceIfExists()));
            return true;

        case 2131690183: 
            DefaultSubscriber.fireAndForget(offlineContentOperations.makePlaylistUnavailableOffline(playlist.getEntityUrn()));
            eventBus.publish(EventQueue.TRACKING, UIEvent.fromRemoveOfflinePlaylist(screenProvider.getLastScreenTag(), playlist.getEntityUrn(), getPromotedSourceIfExists()));
            return true;
        }
    }

    public void show(View view, PlaylistItem playlistitem)
    {
        show(view, playlistitem, OverflowMenuOptions.builder().build());
    }

    public void show(View view, PlaylistItem playlistitem, OverflowMenuOptions overflowmenuoptions)
    {
        playlist = playlistitem;
        menuOptions = overflowmenuoptions;
        loadPlaylist(setupMenu(view));
    }



}
