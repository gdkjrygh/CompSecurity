// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.soundcloud.android.playback.ui.view.RoundedColorButton;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.java.collections.Iterables;
import com.soundcloud.java.functions.Predicate;
import java.util.Arrays;
import rx.Y;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            AdPagePresenter, PlayerOverlayController

static class populateViewSets
{

    private Y adImageSubscription;
    private final View artworkIdleOverlay;
    private final ImageView centeredAdArtworkView;
    private final View centeredAdOverlay;
    Iterable centeredAdViews;
    private final View close;
    private final View footer;
    private final TextView footerAdTitle;
    private final TextView footerAdvertisement;
    private final ToggleButton footerPlayToggle;
    private final ImageView fullbleedAdArtworkView;
    Iterable fullbleedAdViews;
    private final RoundedColorButton learnMore;
    private final View nextButton;
    Iterable onClickViews;
    private final View playButton;
    private final View playControlsHolder;
    private final PlayerOverlayController playerOverlayController;
    private final Predicate presentInConfig = new _cls1();
    private final ImageView previewArtwork;
    private final View previewArtworkOverlay;
    private final View previewContainer;
    private final TextView previewTitle;
    private final View previousButton;
    private final View skipAd;
    Iterable skipDisableViews;
    private final TextView timeUntilSkip;
    private final View whyAds;

    private void populateViewSets()
    {
        java.util.List list = Arrays.asList(new View[] {
            centeredAdOverlay, centeredAdArtworkView
        });
        java.util.List list1 = Arrays.asList(new View[] {
            fullbleedAdArtworkView, learnMore
        });
        java.util.List list2 = Arrays.asList(new View[] {
            previousButton, nextButton
        });
        java.util.List list3 = Arrays.asList(new View[] {
            centeredAdArtworkView, fullbleedAdArtworkView, centeredAdOverlay, artworkIdleOverlay, playButton, nextButton, previousButton, learnMore, whyAds, skipAd, 
            previewContainer, footerPlayToggle, close, footer
        });
        skipDisableViews = Iterables.filter(list2, presentInConfig);
        onClickViews = Iterables.filter(list3, presentInConfig);
        centeredAdViews = Iterables.filter(list, presentInConfig);
        fullbleedAdViews = Iterables.filter(list1, presentInConfig);
    }






/*
    static Y access$1102( , Y y)
    {
        .adImageSubscription = y;
        return y;
    }

*/














    _cls1.this._cls0(View view, .Factory factory)
    {
        class _cls1
            implements Predicate
        {

            final AdPagePresenter.Holder this$0;

            public boolean apply(View view1)
            {
                return view1 != null;
            }

            public volatile boolean apply(Object obj)
            {
                return apply((View)obj);
            }

            _cls1()
            {
                this$0 = AdPagePresenter.Holder.this;
                super();
            }
        }

        adImageSubscription = RxUtils.invalidSubscription();
        fullbleedAdArtworkView = (ImageView)view.findViewById(0x7f0f01c2);
        centeredAdArtworkView = (ImageView)view.findViewById(0x7f0f01c3);
        centeredAdOverlay = view.findViewById(0x7f0f01c5);
        artworkIdleOverlay = view.findViewById(0x7f0f01c4);
        previewArtworkOverlay = view.findViewById(0x7f0f01d0);
        playButton = view.findViewById(0x7f0f01db);
        nextButton = view.findViewById(0x7f0f01dc);
        previousButton = view.findViewById(0x7f0f01da);
        footerPlayToggle = (ToggleButton)view.findViewById(0x7f0f01d4);
        close = view.findViewById(0x7f0f01c6);
        previewTitle = (TextView)view.findViewById(0x7f0f01d1);
        previewArtwork = (ImageView)view.findViewById(0x7f0f01cf);
        timeUntilSkip = (TextView)view.findViewById(0x7f0f01cb);
        skipAd = view.findViewById(0x7f0f01cc);
        previewContainer = view.findViewById(0x7f0f01cd);
        learnMore = (RoundedColorButton)view.findViewById(0x7f0f01c9);
        whyAds = view.findViewById(0x7f0f01c7);
        playControlsHolder = view.findViewById(0x7f0f01d9);
        footer = view.findViewById(0x7f0f01d3);
        footerAdTitle = (TextView)view.findViewById(0x7f0f01d6);
        footerAdvertisement = (TextView)view.findViewById(0x7f0f01d5);
        playerOverlayController = factory.create(artworkIdleOverlay);
        populateViewSets();
    }
}
