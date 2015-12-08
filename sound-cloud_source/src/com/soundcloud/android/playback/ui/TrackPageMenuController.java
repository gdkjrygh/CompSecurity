// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.MenuItem;
import android.view.View;
import com.soundcloud.android.analytics.ScreenElement;
import com.soundcloud.android.associations.RepostOperations;
import com.soundcloud.android.comments.AddCommentDialogFragment;
import com.soundcloud.android.events.EntityMetadata;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaybackProgress;
import com.soundcloud.android.playback.ui.progress.ProgressAware;
import com.soundcloud.android.playlists.AddToPlaylistDialogFragment;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.share.ShareOperations;
import com.soundcloud.android.stations.StartStationPresenter;
import com.soundcloud.android.tracks.TrackInfoFragment;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.android.view.menu.PopupMenuWrapper;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerTrackState

public class TrackPageMenuController
    implements ProgressAware, com.soundcloud.android.playback.ui.progress.ScrubController.OnScrubListener, com.soundcloud.android.view.menu.PopupMenuWrapper.PopupMenuWrapperListener
{
    static class Factory
    {

        private final EventBus eventBus;
        private final FeatureFlags featureFlags;
        private final PlayQueueManager playQueueManager;
        private final com.soundcloud.android.view.menu.PopupMenuWrapper.Factory popupMenuWrapperFactory;
        private final RepostOperations repostOperations;
        private final ShareOperations shareOperations;
        private final StartStationPresenter startStationPresenter;

        TrackPageMenuController create(View view)
        {
            FragmentActivity fragmentactivity = (FragmentActivity)view.getContext();
            return new TrackPageMenuController(featureFlags, playQueueManager, repostOperations, fragmentactivity, popupMenuWrapperFactory.build(fragmentactivity, view), startStationPresenter, eventBus, shareOperations, null);
        }

        Factory(FeatureFlags featureflags, PlayQueueManager playqueuemanager, RepostOperations repostoperations, com.soundcloud.android.view.menu.PopupMenuWrapper.Factory factory, StartStationPresenter startstationpresenter, EventBus eventbus, ShareOperations shareoperations)
        {
            featureFlags = featureflags;
            playQueueManager = playqueuemanager;
            repostOperations = repostoperations;
            popupMenuWrapperFactory = factory;
            startStationPresenter = startstationpresenter;
            eventBus = eventbus;
            shareOperations = shareoperations;
        }
    }


    public static final String ADD_COMMENT_DIALOG_TAG = "add_comment_dialog";
    public static final String INFO_DIALOG_TAG = "info_dialog";
    private final FragmentActivity activity;
    private final String commentAtUnformatted;
    private long commentPosition;
    private final EventBus eventBus;
    private final FeatureFlags featureFlags;
    private PlaybackProgress lastProgress;
    private final PlayQueueManager playQueueManager;
    private final PopupMenuWrapper popupMenuWrapper;
    private final RepostOperations repostOperations;
    private final ShareOperations shareOperations;
    private final StartStationPresenter startStationPresenter;
    private PlayerTrackState track;

    private TrackPageMenuController(FeatureFlags featureflags, PlayQueueManager playqueuemanager, RepostOperations repostoperations, FragmentActivity fragmentactivity, PopupMenuWrapper popupmenuwrapper, StartStationPresenter startstationpresenter, EventBus eventbus, 
            ShareOperations shareoperations)
    {
        track = PlayerTrackState.EMPTY;
        lastProgress = PlaybackProgress.empty();
        featureFlags = featureflags;
        playQueueManager = playqueuemanager;
        repostOperations = repostoperations;
        activity = fragmentactivity;
        popupMenuWrapper = popupmenuwrapper;
        startStationPresenter = startstationpresenter;
        eventBus = eventbus;
        shareOperations = shareoperations;
        commentAtUnformatted = activity.getString(0x7f0700f2);
        setupMenu();
    }

    TrackPageMenuController(FeatureFlags featureflags, PlayQueueManager playqueuemanager, RepostOperations repostoperations, FragmentActivity fragmentactivity, PopupMenuWrapper popupmenuwrapper, StartStationPresenter startstationpresenter, EventBus eventbus, 
            ShareOperations shareoperations, _cls1 _pcls1)
    {
        this(featureflags, playqueuemanager, repostoperations, fragmentactivity, popupmenuwrapper, startstationpresenter, eventbus, shareoperations);
    }

    private void handleComment()
    {
        AddCommentDialogFragment.create(track.getSource(), commentPosition, playQueueManager.getScreenTag()).show(activity.getFragmentManager(), "add_comment_dialog");
    }

    private void handleRepostToggle(boolean flag, Urn urn)
    {
        DefaultSubscriber.fireAndForget(repostOperations.toggleRepost(urn, flag));
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromToggleRepost(flag, playQueueManager.getScreenTag(), Screen.PLAYER_MAIN.get(), urn, urn, playQueueManager.getCurrentPromotedSourceInfo(urn), EntityMetadata.from(track)));
    }

    private void initStationsOption()
    {
        popupMenuWrapper.setItemVisible(0x7f0f02c3, featureFlags.isEnabled(Flag.STATIONS_SOFT_LAUNCH));
        popupMenuWrapper.setItemEnabled(0x7f0f02c3, IOUtils.isConnected(activity));
    }

    private void setMenuPrivacy(boolean flag)
    {
        boolean flag2 = true;
        PopupMenuWrapper popupmenuwrapper = popupMenuWrapper;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        popupmenuwrapper.setItemEnabled(0x7f0f02c1, flag1);
        popupmenuwrapper = popupMenuWrapper;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        popupmenuwrapper.setItemEnabled(0x7f0f02c0, flag1);
        popupmenuwrapper = popupMenuWrapper;
        if (!flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        popupmenuwrapper.setItemEnabled(0x7f0f02bf, flag);
    }

    private void setupMenu()
    {
        popupMenuWrapper.inflate(0x7f100004);
        popupMenuWrapper.setOnMenuItemClickListener(this);
    }

    private void showAddToPlaylistDialog(PlayerTrackState playertrackstate)
    {
        AddToPlaylistDialogFragment.from(playertrackstate.getUrn(), playertrackstate.getTitle(), ScreenElement.PLAYER.get(), playQueueManager.getScreenTag()).show(activity.getFragmentManager());
    }

    private void updateCommentPosition(long l)
    {
        commentPosition = l;
        String s = ScTextUtils.formatTimestamp(l, TimeUnit.MILLISECONDS);
        popupMenuWrapper.setItemText(0x7f0f02c2, String.format(commentAtUnformatted, new Object[] {
            s
        }));
    }

    public void dismiss()
    {
        popupMenuWrapper.dismiss();
    }

    public void displayScrubPosition(float f)
    {
        if (lastProgress.isEmpty())
        {
            updateCommentPosition((long)((float)track.getDuration() * f));
            return;
        } else
        {
            updateCommentPosition((long)((float)lastProgress.getDuration() * f));
            return;
        }
    }

    public void handleShare(Context context)
    {
        Urn urn = track.getUrn();
        shareOperations.share(context, track.getSource(), playQueueManager.getScreenTag(), Screen.PLAYER_MAIN.get(), urn, playQueueManager.getCurrentPromotedSourceInfo(urn));
    }

    public void onDismiss()
    {
    }

    public boolean onMenuItemClick(MenuItem menuitem, Context context)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131690175: 
            handleShare(context);
            return true;

        case 2131690176: 
            handleRepostToggle(true, track.getUrn());
            return true;

        case 2131690177: 
            handleRepostToggle(false, track.getUrn());
            return true;

        case 2131689901: 
            TrackInfoFragment.create(track.getUrn()).show(activity.getSupportFragmentManager(), "info_dialog");
            return true;

        case 2131690178: 
            handleComment();
            return true;

        case 2131690174: 
            showAddToPlaylistDialog(track);
            return true;

        case 2131690179: 
            startStationPresenter.startStationForTrack(context, track.getUrn());
            break;
        }
        return true;
    }

    public void scrubStateChanged(int i)
    {
    }

    public void setIsUserRepost(boolean flag)
    {
        popupMenuWrapper.setItemVisible(0x7f0f02c1, flag);
        PopupMenuWrapper popupmenuwrapper = popupMenuWrapper;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        popupmenuwrapper.setItemVisible(0x7f0f02c0, flag);
    }

    public void setProgress(PlaybackProgress playbackprogress)
    {
        lastProgress = playbackprogress;
        updateCommentPosition(lastProgress.getPosition());
    }

    public void setTrack(PlayerTrackState playertrackstate)
    {
        track = playertrackstate;
        setIsUserRepost(playertrackstate.isUserRepost());
        setMenuPrivacy(playertrackstate.isPrivate());
        updateCommentPosition(lastProgress.getPosition());
    }

    public void show()
    {
        if (track != PlayerTrackState.EMPTY)
        {
            initStationsOption();
            popupMenuWrapper.show();
        }
    }
}
