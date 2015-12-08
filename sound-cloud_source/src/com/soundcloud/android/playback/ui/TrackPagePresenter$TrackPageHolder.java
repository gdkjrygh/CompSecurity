// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.support.v7.app.MediaRouteButton;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.soundcloud.android.ads.AdOverlayController;
import com.soundcloud.android.playback.ui.progress.ProgressAware;
import com.soundcloud.android.playback.ui.view.PlayerTrackArtworkView;
import com.soundcloud.android.playback.ui.view.TimestampView;
import com.soundcloud.android.playback.ui.view.WaveformViewController;
import com.soundcloud.android.view.JaggedTextView;
import com.soundcloud.java.collections.Iterables;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.java.functions.Predicate;
import java.util.Arrays;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            TrackPagePresenter, PlayerArtworkController, ErrorViewController, TrackPageMenuController, 
//            PlayerOverlayController

static class _cls1
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




    _cls1()
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
