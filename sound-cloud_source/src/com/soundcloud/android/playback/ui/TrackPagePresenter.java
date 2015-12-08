// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.MediaRouteButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.Checkable;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import com.soundcloud.android.ads.AdOverlayController;
import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.configuration.experiments.ShareButtonExperiment;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaybackProgress;
import com.soundcloud.android.playback.ui.progress.ProgressAware;
import com.soundcloud.android.playback.ui.view.PlayerTrackArtworkView;
import com.soundcloud.android.playback.ui.view.TimestampView;
import com.soundcloud.android.playback.ui.view.WaveformView;
import com.soundcloud.android.playback.ui.view.WaveformViewController;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.android.view.JaggedTextView;
import com.soundcloud.android.waveform.WaveformOperations;
import com.soundcloud.java.collections.Iterables;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.functions.Predicate;
import com.soundcloud.java.optional.Optional;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagePresenter, SlideAnimationHelper, PlayerTrackState, ErrorViewController, 
//            PlayerOverlayController, PlayerArtworkController, TrackPageListener, TrackPageMenuController, 
//            SkipListener, PlayerItem

class TrackPagePresenter
    implements android.view.View.OnClickListener, PlayerPagePresenter
{
    static class TrackPageHolder
    {

        private static final Predicate PRESENT_IN_CONFIG = new _cls1();
        AdOverlayController adOverlayController;
        PlayerArtworkController artworkController;
        PlayerTrackArtworkView artworkView;
        View bottomClose;
        TextView castDeviceName;
        View close;
        View closeIndicator;
        ErrorViewController errorViewController;
        View footer;
        ToggleButton footerPlayToggle;
        TextView footerTitle;
        TextView footerUser;
        Iterable fullScreenAdViews;
        Iterable fullScreenErrorViews;
        Iterable fullScreenViews;
        Iterable hideOnAdViews;
        Iterable hideOnErrorViews;
        Iterable hideOnScrubViews;
        View interstitialHolder;
        ToggleButton likeToggle;
        MediaRouteButton mediaRouteButton;
        TrackPageMenuController menuController;
        View more;
        View nextButton;
        Iterable onClickViews;
        View playButton;
        View playControlsHolder;
        PlayerOverlayController playerOverlayControllers[];
        View previousButton;
        View profileLink;
        Iterable progressAwareViews;
        View shareButton;
        TimestampView timestamp;
        JaggedTextView title;
        JaggedTextView trackContext;
        JaggedTextView user;
        WaveformViewController waveformController;

        private boolean hasNextButton()
        {
            return nextButton != null;
        }

        private boolean hasPreviousButton()
        {
            return previousButton != null;
        }

        public void populateViewSets()
        {
            java.util.List list = Arrays.asList(new View[] {
                title, user, trackContext, closeIndicator, nextButton, previousButton, playButton, bottomClose
            });
            java.util.List list1 = Arrays.asList(new View[] {
                playButton, more, likeToggle, timestamp, shareButton
            });
            java.util.List list2 = Arrays.asList(new View[] {
                artworkView, close, bottomClose, playButton, footer, footerPlayToggle, profileLink
            });
            fullScreenViews = Arrays.asList(new View[] {
                title, user, trackContext, close, timestamp, interstitialHolder
            });
            fullScreenAdViews = Arrays.asList(new View[] {
                interstitialHolder
            });
            fullScreenErrorViews = Arrays.asList(new View[] {
                title, user, trackContext, close, interstitialHolder
            });
            hideOnScrubViews = Iterables.filter(list, PRESENT_IN_CONFIG);
            hideOnErrorViews = Iterables.filter(list1, PRESENT_IN_CONFIG);
            onClickViews = Iterables.filter(list2, PRESENT_IN_CONFIG);
            hideOnAdViews = Arrays.asList(new View[] {
                close, more, likeToggle, title, user, timestamp, castDeviceName
            });
            progressAwareViews = Lists.newArrayList(new ProgressAware[] {
                waveformController, artworkController, timestamp, menuController
            });
        }




        TrackPageHolder()
        {
        }

        class _cls1
            implements Predicate
        {

            public final boolean apply(View view)
            {
                return view != null;
            }

            public final volatile boolean apply(Object obj)
            {
                return apply((View)obj);
            }

                _cls1()
                {
                }
        }

    }


    private static final int SCRUB_TRANSITION_ALPHA_DURATION = 100;
    private final com.soundcloud.android.ads.AdOverlayController.Factory adOverlayControllerFactory;
    private final PlayerArtworkController.Factory artworkControllerFactory;
    private final CastConnectionHelper castConnectionHelper;
    private final ErrorViewController.Factory errorControllerFactory;
    private final SlideAnimationHelper helper = new SlideAnimationHelper();
    private final TrackPageListener listener;
    private final CondensedNumberFormatter numberFormatter;
    private final PlayerOverlayController.Factory playerOverlayControllerFactory;
    private final Resources resources;
    private final ShareButtonExperiment shareButtonExperiment;
    private final TrackPageMenuController.Factory trackMenuControllerFactory;
    private final com.soundcloud.android.playback.ui.view.WaveformViewController.Factory waveformControllerFactory;
    private final WaveformOperations waveformOperations;

    public TrackPagePresenter(WaveformOperations waveformoperations, TrackPageListener trackpagelistener, CondensedNumberFormatter condensednumberformatter, com.soundcloud.android.playback.ui.view.WaveformViewController.Factory factory, PlayerArtworkController.Factory factory1, PlayerOverlayController.Factory factory2, TrackPageMenuController.Factory factory3, 
            com.soundcloud.android.ads.AdOverlayController.Factory factory4, ErrorViewController.Factory factory5, CastConnectionHelper castconnectionhelper, Resources resources1, ShareButtonExperiment sharebuttonexperiment)
    {
        waveformOperations = waveformoperations;
        listener = trackpagelistener;
        numberFormatter = condensednumberformatter;
        waveformControllerFactory = factory;
        artworkControllerFactory = factory1;
        playerOverlayControllerFactory = factory2;
        trackMenuControllerFactory = factory3;
        adOverlayControllerFactory = factory4;
        errorControllerFactory = factory5;
        castConnectionHelper = castconnectionhelper;
        resources = resources1;
        shareButtonExperiment = sharebuttonexperiment;
    }

    private void bindStationsContext(PlayerTrackState playertrackstate, TrackPageHolder trackpageholder)
    {
        playertrackstate = playertrackstate.getStation();
        if (playertrackstate.isPresent())
        {
            trackpageholder.trackContext.setVisibility(0);
            trackpageholder.trackContext.setText(((StationRecord)playertrackstate.get()).getTitle());
            return;
        } else
        {
            trackpageholder.trackContext.setVisibility(8);
            return;
        }
    }

    private void clearAdOverlay(TrackPageHolder trackpageholder)
    {
        trackpageholder.adOverlayController.clear();
    }

    private void configureAdOverlay(com.soundcloud.android.playback.Player.StateTransition statetransition, boolean flag, boolean flag1, TrackPageHolder trackpageholder)
    {
        if (flag)
        {
            if (statetransition.isPlayerPlaying() && flag1)
            {
                trackpageholder.adOverlayController.show(true);
            } else
            if (statetransition.isPaused() || statetransition.wasError())
            {
                clearAdOverlay(trackpageholder);
                return;
            }
        }
    }

    private com.soundcloud.android.ads.AdOverlayController.AdOverlayListener createAdOverlayListener(final TrackPageHolder holder)
    {
        return new _cls7();
    }

    private com.soundcloud.android.playback.ui.progress.ScrubController.OnScrubListener createScrubViewAnimations(final TrackPageHolder holder)
    {
        return new _cls3();
    }

    private Iterable getFullScreenViews(TrackPageHolder trackpageholder)
    {
        if (trackpageholder.adOverlayController.isVisibleInFullscreen())
        {
            return trackpageholder.fullScreenAdViews;
        }
        if (trackpageholder.errorViewController.isShowingError())
        {
            return trackpageholder.fullScreenErrorViews;
        } else
        {
            return trackpageholder.fullScreenViews;
        }
    }

    private android.view.View.OnClickListener getOnNextListener(final SkipListener skipListener)
    {
        return new _cls2();
    }

    private android.view.View.OnClickListener getOnPreviousListener(final SkipListener skipListener)
    {
        return new _cls1();
    }

    private TrackPageHolder getViewHolder(View view)
    {
        return (TrackPageHolder)view.getTag();
    }

    private Animation hideAnimation(Context context)
    {
        context = AnimationUtils.loadAnimation(context, 0x7f040001);
        context.setInterpolator(new DecelerateInterpolator(2.0F));
        return context;
    }

    private void hideShareButton(View view, boolean flag)
    {
        Context context = view.getContext();
        flag = shareButtonExperiment.isVisibleOnLoad(flag);
        if (view.isShown() && !flag)
        {
            view.setVisibility(8);
            view.startAnimation(hideAnimation(context));
        }
    }

    private boolean isLiked(View view)
    {
        return ((Checkable)view).isChecked();
    }

    private Animation revealAnimation(Context context)
    {
        context = AnimationUtils.makeInChildBottomAnimation(context);
        context.setInterpolator(new DecelerateInterpolator(2.0F));
        return context;
    }

    private void revealShareButton(View view)
    {
        Context context = view.getContext();
        if (!view.isShown())
        {
            view.setVisibility(0);
            view.startAnimation(revealAnimation(context));
        }
    }

    private void setAdStateOnPlayerOverlay(TrackPageHolder trackpageholder, boolean flag)
    {
        trackpageholder = trackpageholder.playerOverlayControllers;
        int j = trackpageholder.length;
        for (int i = 0; i < j; i++)
        {
            trackpageholder[i].setAdOverlayShown(flag);
        }

    }

    private void setClickListener(android.view.View.OnClickListener onclicklistener, Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); ((View)iterable.next()).setOnClickListener(onclicklistener)) { }
    }

    private void setInitialShareButtonVisibility(View view)
    {
        view = getViewHolder(view);
        setInitialShareButtonVisibility(((TrackPageHolder) (view)).shareButton, isLiked(((TrackPageHolder) (view)).likeToggle));
    }

    private void setInitialShareButtonVisibility(View view, boolean flag)
    {
        int i;
        if (shareButtonExperiment.isVisibleOnLoad(flag))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void setLikeCount(TrackPageHolder trackpageholder, int i)
    {
        ToggleButton togglebutton = trackpageholder.likeToggle;
        if (i > 0)
        {
            trackpageholder = numberFormatter.format(i);
        } else
        {
            trackpageholder = "";
        }
        togglebutton.setText(trackpageholder);
    }

    private void setProgressInternal(View view, PlaybackProgress playbackprogress)
    {
        for (view = getViewHolder(view).progressAwareViews.iterator(); view.hasNext(); ((ProgressAware)view.next()).setProgress(playbackprogress)) { }
    }

    private void setTextBackgrounds(TrackPageHolder trackpageholder, boolean flag)
    {
        trackpageholder.title.showBackground(flag);
        trackpageholder.user.showBackground(flag);
        trackpageholder.timestamp.showBackground(flag);
        trackpageholder.trackContext.showBackground(flag);
    }

    private void setViewPlayState(TrackPageHolder trackpageholder, com.soundcloud.android.playback.Player.StateTransition statetransition, boolean flag)
    {
        updateErrorState(trackpageholder, statetransition, flag);
        PlayerOverlayController aplayeroverlaycontroller[];
        int j;
        if (statetransition.playSessionIsActive() && flag)
        {
            if (statetransition.isPlayerPlaying())
            {
                trackpageholder.artworkController.showPlayingState(statetransition.getProgress());
            } else
            {
                trackpageholder.artworkController.showIdleState(statetransition.getProgress());
            }
        } else
        {
            trackpageholder.artworkController.showIdleState();
        }
        aplayeroverlaycontroller = trackpageholder.playerOverlayControllers;
        j = aplayeroverlaycontroller.length;
        for (int i = 0; i < j; i++)
        {
            aplayeroverlaycontroller[i].setPlayState(statetransition);
        }

        setTextBackgrounds(trackpageholder, statetransition.playSessionIsActive());
    }

    private void setWaveformPlayState(TrackPageHolder trackpageholder, com.soundcloud.android.playback.Player.StateTransition statetransition, boolean flag)
    {
        if (flag && statetransition.playSessionIsActive())
        {
            if (statetransition.isPlayerPlaying())
            {
                trackpageholder.waveformController.showPlayingState(statetransition.getProgress());
                return;
            } else
            {
                trackpageholder.waveformController.showBufferingState();
                return;
            }
        } else
        {
            trackpageholder.waveformController.showIdleState();
            return;
        }
    }

    private void setupHolder(View view)
    {
        final TrackPageHolder holder = new TrackPageHolder();
        holder.title = (JaggedTextView)view.findViewById(0x7f0f01f2);
        holder.user = (JaggedTextView)view.findViewById(0x7f0f01f1);
        holder.trackContext = (JaggedTextView)view.findViewById(0x7f0f01f3);
        holder.castDeviceName = (TextView)view.findViewById(0x7f0f01ec);
        holder.artworkView = (PlayerTrackArtworkView)view.findViewById(0x7f0f01e7);
        holder.timestamp = (TimestampView)view.findViewById(0x7f0f01ea);
        holder.likeToggle = (ToggleButton)view.findViewById(0x7f0f01ee);
        holder.more = view.findViewById(0x7f0f01ef);
        holder.close = view.findViewById(0x7f0f01c6);
        holder.bottomClose = view.findViewById(0x7f0f01e8);
        holder.nextButton = view.findViewById(0x7f0f01dc);
        holder.previousButton = view.findViewById(0x7f0f01da);
        holder.playButton = view.findViewById(0x7f0f01db);
        holder.profileLink = view.findViewById(0x7f0f01f0);
        holder.shareButton = view.findViewById(0x7f0f01ed);
        holder.mediaRouteButton = (MediaRouteButton)view.findViewById(0x7f0f01eb);
        holder.footer = view.findViewById(0x7f0f01d3);
        holder.footerPlayToggle = (ToggleButton)view.findViewById(0x7f0f01d4);
        holder.footerTitle = (TextView)view.findViewById(0x7f0f01d6);
        holder.footerUser = (TextView)view.findViewById(0x7f0f01d5);
        holder.adOverlayController = adOverlayControllerFactory.create(view, createAdOverlayListener(holder));
        WaveformView waveformview = (WaveformView)view.findViewById(0x7f0f01e9);
        holder.waveformController = waveformControllerFactory.create(waveformview);
        holder.playerOverlayControllers = (new PlayerOverlayController[] {
            playerOverlayControllerFactory.create(holder.artworkView.findViewById(0x7f0f01e6)), playerOverlayControllerFactory.create(holder.artworkView.findViewById(0x7f0f01e5))
        });
        holder.artworkController = artworkControllerFactory.create(holder.artworkView);
        holder.waveformController.addScrubListener(holder.artworkController);
        holder.waveformController.addScrubListener(holder.timestamp);
        holder.waveformController.addScrubListener(createScrubViewAnimations(holder));
        holder.menuController = trackMenuControllerFactory.create(holder.more);
        holder.playControlsHolder = view.findViewById(0x7f0f01d9);
        holder.closeIndicator = view.findViewById(0x7f0f01d2);
        holder.interstitialHolder = view.findViewById(0x7f0f01f6);
        PlayerOverlayController aplayeroverlaycontroller[] = holder.playerOverlayControllers;
        int j = aplayeroverlaycontroller.length;
        for (int i = 0; i < j; i++)
        {
            PlayerOverlayController playeroverlaycontroller = aplayeroverlaycontroller[i];
            holder.waveformController.addScrubListener(playeroverlaycontroller);
        }

        holder.waveformController.addScrubListener(holder.menuController);
        holder.more.setOnClickListener(new _cls4());
        holder.shareButton.setOnClickListener(new _cls5());
        holder.likeToggle.setOnClickListener(new _cls6());
        holder.populateViewSets();
        view.setTag(holder);
        holder.errorViewController = errorControllerFactory.create(view);
    }

    private void setupSkipListener(View view, SkipListener skiplistener)
    {
        view = getViewHolder(view);
        android.view.View.OnClickListener onclicklistener = getOnNextListener(skiplistener);
        skiplistener = getOnPreviousListener(skiplistener);
        if (view.hasNextButton())
        {
            ((TrackPageHolder) (view)).nextButton.setOnClickListener(onclicklistener);
        }
        if (view.hasPreviousButton())
        {
            ((TrackPageHolder) (view)).previousButton.setOnClickListener(skiplistener);
        }
    }

    private void showRepostToast(Context context, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0x7f0701d0;
        } else
        {
            i = 0x7f070218;
        }
        Toast.makeText(context, i, 0).show();
    }

    private void updateErrorState(TrackPageHolder trackpageholder, com.soundcloud.android.playback.Player.StateTransition statetransition, boolean flag)
    {
        if (flag && statetransition.wasError())
        {
            trackpageholder.errorViewController.showError(statetransition.getReason());
            return;
        } else
        {
            trackpageholder.errorViewController.hideError();
            return;
        }
    }

    private void updateLikeStatus(View view)
    {
        Urn urn = (Urn)view.getTag();
        if (urn != null)
        {
            listener.onToggleLike(isLiked(view), urn);
        }
    }

    public boolean accept(View view)
    {
        return view.getTag() instanceof TrackPageHolder;
    }

    public volatile void bindItemView(View view, PlayerItem playeritem)
    {
        bindItemView(view, (PlayerTrackState)playeritem);
    }

    public void bindItemView(View view, PlayerTrackState playertrackstate)
    {
        TrackPageHolder trackpageholder = getViewHolder(view);
        trackpageholder.title.setText(playertrackstate.getTitle());
        trackpageholder.user.setText(playertrackstate.getUserName());
        trackpageholder.profileLink.setTag(playertrackstate.getUserUrn());
        setCastDeviceName(view, castConnectionHelper.getDeviceName());
        bindStationsContext(playertrackstate, trackpageholder);
        trackpageholder.artworkController.loadArtwork(playertrackstate.getUrn(), playertrackstate.isCurrentTrack(), playertrackstate.getViewVisibilityProvider());
        trackpageholder.timestamp.setInitialProgress(playertrackstate.getDuration());
        trackpageholder.menuController.setTrack(playertrackstate);
        trackpageholder.waveformController.setWaveform(waveformOperations.waveformDataFor(playertrackstate.getUrn(), playertrackstate.getWaveformUrl()), playertrackstate.isForeground());
        trackpageholder.waveformController.setDuration(playertrackstate.getDuration());
        setLikeCount(trackpageholder, playertrackstate.getLikeCount());
        trackpageholder.likeToggle.setChecked(playertrackstate.isUserLike());
        trackpageholder.likeToggle.setTag(playertrackstate.getUrn());
        setInitialShareButtonVisibility(trackpageholder.shareButton, playertrackstate.isUserLike());
        trackpageholder.shareButton.setTag(playertrackstate.getUrn());
        trackpageholder.footerUser.setText(playertrackstate.getUserName());
        trackpageholder.footerTitle.setText(playertrackstate.getTitle());
        if (!trackpageholder.errorViewController.isShowingError())
        {
            trackpageholder.timestamp.setVisibility(0);
        }
        setClickListener(this, trackpageholder.onClickViews);
    }

    public void clearAdOverlay(View view)
    {
        clearAdOverlay(getViewHolder(view));
    }

    public View clearItemView(View view)
    {
        TrackPageHolder trackpageholder = getViewHolder(view);
        trackpageholder.user.setText("");
        trackpageholder.title.setText("");
        trackpageholder.trackContext.setVisibility(8);
        trackpageholder.shareButton.setVisibility(8);
        trackpageholder.likeToggle.setChecked(false);
        trackpageholder.likeToggle.setEnabled(true);
        trackpageholder.artworkController.reset();
        trackpageholder.waveformController.reset();
        trackpageholder.footerUser.setText("");
        trackpageholder.footerTitle.setText("");
        trackpageholder.timestamp.setVisibility(8);
        trackpageholder.errorViewController.hideError();
        return view;
    }

    public View createItemView(ViewGroup viewgroup, SkipListener skiplistener)
    {
        viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030099, viewgroup, false);
        setupHolder(viewgroup);
        setupSkipListener(viewgroup, skiplistener);
        return viewgroup;
    }

    public void onBackground(View view)
    {
        view = getViewHolder(view);
        ((TrackPageHolder) (view)).waveformController.onBackground();
        castConnectionHelper.removeMediaRouterButton(((TrackPageHolder) (view)).mediaRouteButton);
    }

    public void onClick(View view)
    {
        Context context;
        switch (view.getId())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected view ID: ")).append(resources.getResourceName(view.getId())).toString());

        case 2131689940: 
            listener.onFooterTogglePlay();
            return;

        case 2131689947: 
        case 2131689959: 
            listener.onTogglePlay();
            return;

        case 2131689939: 
            listener.onFooterTap();
            return;

        case 2131689926: 
        case 2131689960: 
            listener.onPlayerClose();
            return;

        case 2131689968: 
            context = view.getContext();
            break;
        }
        view = (Urn)view.getTag();
        listener.onGotoUser(context, view);
    }

    public void onDestroyView(View view)
    {
        view = getViewHolder(view);
        ((TrackPageHolder) (view)).artworkController.cancelProgressAnimations();
        ((TrackPageHolder) (view)).waveformController.cancelProgressAnimations();
    }

    public void onForeground(View view)
    {
        view = getViewHolder(view);
        ((TrackPageHolder) (view)).waveformController.onForeground();
        castConnectionHelper.addMediaRouterButton(((TrackPageHolder) (view)).mediaRouteButton);
    }

    public void onPageChange(View view)
    {
        TrackPageHolder trackpageholder = getViewHolder(view);
        trackpageholder.waveformController.scrubStateChanged(0);
        trackpageholder.menuController.dismiss();
        setInitialShareButtonVisibility(view);
    }

    public void onPlayableUpdated(View view, EntityStateChangedEvent entitystatechangedevent)
    {
        TrackPageHolder trackpageholder = getViewHolder(view);
        PropertySet propertyset = entitystatechangedevent.getNextChangeSet();
        if (propertyset.contains(PlayableProperty.IS_LIKED))
        {
            trackpageholder.likeToggle.setChecked(((Boolean)propertyset.get(PlayableProperty.IS_LIKED)).booleanValue());
        }
        if (propertyset.contains(PlayableProperty.LIKES_COUNT))
        {
            setLikeCount(trackpageholder, ((Integer)propertyset.get(PlayableProperty.LIKES_COUNT)).intValue());
        }
        if (propertyset.contains(PlayableProperty.IS_REPOSTED))
        {
            boolean flag = ((Boolean)propertyset.get(PlayableProperty.IS_REPOSTED)).booleanValue();
            trackpageholder.menuController.setIsUserRepost(flag);
            if (entitystatechangedevent.getKind() == 3)
            {
                showRepostToast(view.getContext(), flag);
            }
        }
    }

    public void onPlayerSlide(View view, float f)
    {
        boolean flag = false;
        Object obj = getViewHolder(view);
        Iterable iterable = getFullScreenViews(((TrackPageHolder) (obj)));
        helper.configureViewsFromSlide(f, ((TrackPageHolder) (obj)).footer, iterable, ((TrackPageHolder) (obj)).playerOverlayControllers);
        ((TrackPageHolder) (obj)).waveformController.onPlayerSlide(f);
        obj = getViewHolder(view).closeIndicator;
        int i;
        if (f > 0.0F)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        view = getViewHolder(view).footer;
        if (f < 1.0F)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void onPositionSet(View view, int i, int j)
    {
        byte byte0 = 4;
        view = getViewHolder(view);
        if (view.hasNextButton())
        {
            View view1 = ((TrackPageHolder) (view)).nextButton;
            if (i == j - 1)
            {
                j = 4;
            } else
            {
                j = 0;
            }
            view1.setVisibility(j);
        }
        if (view.hasPreviousButton())
        {
            view = ((TrackPageHolder) (view)).previousButton;
            if (i == 0)
            {
                i = byte0;
            } else
            {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public void setAdOverlay(View view, PropertySet propertyset)
    {
        getViewHolder(view).adOverlayController.initialize(propertyset);
    }

    public void setCastDeviceName(View view, String s)
    {
        getViewHolder(view).castDeviceName.setText(s);
    }

    public void setCollapsed(View view)
    {
        onPlayerSlide(view, 0.0F);
        getViewHolder(view).waveformController.setCollapsed();
        getViewHolder(view).adOverlayController.setCollapsed();
        setInitialShareButtonVisibility(view);
    }

    public void setExpanded(View view)
    {
        onPlayerSlide(view, 1.0F);
        getViewHolder(view).waveformController.setExpanded();
        getViewHolder(view).adOverlayController.setExpanded();
    }

    public void setPlayState(View view, com.soundcloud.android.playback.Player.StateTransition statetransition, boolean flag, boolean flag1)
    {
        boolean flag3 = false;
        TrackPageHolder trackpageholder = getViewHolder(view);
        boolean flag2 = statetransition.playSessionIsActive();
        Object obj = trackpageholder.playControlsHolder;
        byte byte0;
        if (flag2)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((View) (obj)).setVisibility(byte0);
        trackpageholder.footerPlayToggle.setChecked(flag2);
        setWaveformPlayState(trackpageholder, statetransition, flag);
        setViewPlayState(trackpageholder, statetransition, flag);
        obj = trackpageholder.timestamp;
        flag2 = flag3;
        if (flag)
        {
            flag2 = flag3;
            if (statetransition.isBuffering())
            {
                flag2 = true;
            }
        }
        ((TimestampView) (obj)).setBufferingMode(flag2);
        if (statetransition.playSessionIsActive() && !flag)
        {
            setProgressInternal(view, PlaybackProgress.empty());
        }
        configureAdOverlay(statetransition, flag, flag1, trackpageholder);
    }

    public void setProgress(View view, PlaybackProgress playbackprogress)
    {
        if (!playbackprogress.isEmpty())
        {
            setProgressInternal(view, playbackprogress);
        }
    }










    private class _cls7
        implements com.soundcloud.android.ads.AdOverlayController.AdOverlayListener
    {

        final TrackPagePresenter this$0;
        final TrackPageHolder val$holder;

        public void onAdOverlayHidden(boolean flag)
        {
            setAdStateOnPlayerOverlay(holder, false);
            setTextBackgrounds(holder, true);
            holder.waveformController.show();
            if (flag)
            {
                AnimUtils.showViews(holder.hideOnAdViews);
                hideShareButton(holder.shareButton, isLiked(holder.likeToggle));
                castConnectionHelper.addMediaRouterButton(holder.mediaRouteButton);
            }
        }

        public void onAdOverlayShown(boolean flag)
        {
            setAdStateOnPlayerOverlay(holder, true);
            setTextBackgrounds(holder, false);
            holder.waveformController.hide();
            if (flag)
            {
                AnimUtils.hideViews(holder.hideOnAdViews);
                holder.shareButton.setVisibility(8);
                castConnectionHelper.removeMediaRouterButton(holder.mediaRouteButton);
            }
        }

        _cls7()
        {
            this$0 = TrackPagePresenter.this;
            holder = trackpageholder;
            super();
        }
    }


    private class _cls3
        implements com.soundcloud.android.playback.ui.progress.ScrubController.OnScrubListener
    {

        final TrackPagePresenter this$0;
        final TrackPageHolder val$holder;

        public void displayScrubPosition(float f)
        {
        }

        public void scrubStateChanged(int i)
        {
            listener.onScrub(i);
            Iterator iterator = holder.hideOnScrubViews.iterator();
            while (iterator.hasNext()) 
            {
                Object obj = (View)iterator.next();
                float f1 = ((View) (obj)).getAlpha();
                float f;
                if (i == 1)
                {
                    f = 0.0F;
                } else
                {
                    f = 1.0F;
                }
                obj = ObjectAnimator.ofFloat(obj, "alpha", new float[] {
                    f1, f
                });
                ((ObjectAnimator) (obj)).setDuration(100L);
                ((ObjectAnimator) (obj)).start();
            }
        }

        _cls3()
        {
            this$0 = TrackPagePresenter.this;
            holder = trackpageholder;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final TrackPagePresenter this$0;
        final SkipListener val$skipListener;

        public void onClick(View view)
        {
            skipListener.onNext();
        }

        _cls2()
        {
            this$0 = TrackPagePresenter.this;
            skipListener = skiplistener;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final TrackPagePresenter this$0;
        final SkipListener val$skipListener;

        public void onClick(View view)
        {
            skipListener.onPrevious();
        }

        _cls1()
        {
            this$0 = TrackPagePresenter.this;
            skipListener = skiplistener;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final TrackPagePresenter this$0;
        final TrackPageHolder val$holder;

        public void onClick(View view)
        {
            clearAdOverlay(holder);
            holder.menuController.show();
        }

        _cls4()
        {
            this$0 = TrackPagePresenter.this;
            holder = trackpageholder;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final TrackPagePresenter this$0;
        final TrackPageHolder val$holder;

        public void onClick(View view)
        {
            holder.menuController.handleShare(view.getContext());
        }

        _cls5()
        {
            this$0 = TrackPagePresenter.this;
            holder = trackpageholder;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final TrackPagePresenter this$0;
        final TrackPageHolder val$holder;

        public void onClick(View view)
        {
            updateLikeStatus(view);
            if (isLiked(view))
            {
                revealShareButton(holder.shareButton);
                return;
            } else
            {
                hideShareButton(holder.shareButton, false);
                return;
            }
        }

        _cls6()
        {
            this$0 = TrackPagePresenter.this;
            holder = trackpageholder;
            super();
        }
    }

}
