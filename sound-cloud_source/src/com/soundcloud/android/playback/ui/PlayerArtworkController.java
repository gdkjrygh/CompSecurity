// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;
import android.widget.ImageView;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaybackProgress;
import com.soundcloud.android.playback.ui.progress.ProgressAware;
import com.soundcloud.android.playback.ui.progress.ProgressController;
import com.soundcloud.android.playback.ui.progress.TranslateXHelper;
import com.soundcloud.android.playback.ui.view.PlayerTrackArtworkView;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerArtworkLoader, ViewVisibilityProvider

public class PlayerArtworkController
    implements ProgressAware, com.soundcloud.android.playback.ui.progress.ScrubController.OnScrubListener, com.soundcloud.android.playback.ui.view.PlayerTrackArtworkView.OnWidthChangedListener
{
    public static class Factory
    {

        private final com.soundcloud.android.playback.ui.progress.ProgressController.Factory animationControllerFactory;
        private final Provider playerArtworkLoaderProvider;

        public PlayerArtworkController create(PlayerTrackArtworkView playertrackartworkview)
        {
            return new PlayerArtworkController(playertrackartworkview, animationControllerFactory, (PlayerArtworkLoader)playerArtworkLoaderProvider.get());
        }

        Factory(com.soundcloud.android.playback.ui.progress.ProgressController.Factory factory, Provider provider)
        {
            animationControllerFactory = factory;
            playerArtworkLoaderProvider = provider;
        }
    }


    private final PlayerTrackArtworkView artworkView;
    private TranslateXHelper helper;
    private final View imageHolder;
    private final ImageView imageOverlay;
    private boolean isPlaying;
    private PlaybackProgress latestProgress;
    private final PlayerArtworkLoader playerArtworkLoader;
    private final ProgressController progressController;
    private boolean suppressProgress;
    private final ImageView wrappedImageView;

    public PlayerArtworkController(PlayerTrackArtworkView playertrackartworkview, com.soundcloud.android.playback.ui.progress.ProgressController.Factory factory, PlayerArtworkLoader playerartworkloader)
    {
        latestProgress = PlaybackProgress.empty();
        artworkView = playertrackartworkview;
        playerArtworkLoader = playerartworkloader;
        wrappedImageView = (ImageView)playertrackartworkview.findViewById(0x7f0f01e4);
        imageOverlay = (ImageView)playertrackartworkview.findViewById(0x7f0f01e5);
        imageHolder = playertrackartworkview.findViewById(0x7f0f01e3);
        progressController = factory.create(imageHolder);
        playertrackartworkview.setOnWidthChangedListener(this);
    }

    public void cancelProgressAnimations()
    {
        progressController.cancelProgressAnimation();
    }

    public void clear()
    {
        wrappedImageView.setImageDrawable(null);
        imageOverlay.setImageDrawable(null);
    }

    public void displayScrubPosition(float f)
    {
        if (helper != null)
        {
            helper.setValueFromProportion(imageHolder, f);
        }
    }

    public void loadArtwork(Urn urn, boolean flag, ViewVisibilityProvider viewvisibilityprovider)
    {
        playerArtworkLoader.loadArtwork(urn, wrappedImageView, imageOverlay, flag, viewvisibilityprovider);
    }

    public void onArtworkSizeChanged()
    {
        int i = artworkView.getWidth();
        int j = wrappedImageView.getMeasuredWidth();
        if (i > 0 && j > 0)
        {
            helper = new TranslateXHelper(0, Math.min(0, -(j - i)));
            progressController.setHelper(helper);
        }
    }

    public void reset()
    {
        progressController.reset();
        clear();
    }

    public void scrubStateChanged(int i)
    {
        boolean flag = true;
        if (i != 1)
        {
            flag = false;
        }
        suppressProgress = flag;
        if (suppressProgress)
        {
            progressController.cancelProgressAnimation();
        }
        if (i == 2 && isPlaying)
        {
            progressController.startProgressAnimation(latestProgress);
        }
    }

    public void setProgress(PlaybackProgress playbackprogress)
    {
        latestProgress = playbackprogress;
        if (!suppressProgress)
        {
            progressController.setPlaybackProgress(playbackprogress);
        }
    }

    public void showIdleState()
    {
        isPlaying = false;
        progressController.cancelProgressAnimation();
    }

    public void showIdleState(PlaybackProgress playbackprogress)
    {
        showIdleState();
        if (!playbackprogress.isEmpty())
        {
            setProgress(playbackprogress);
        }
    }

    public void showPlayingState(PlaybackProgress playbackprogress)
    {
        isPlaying = true;
        if (playbackprogress != null && !suppressProgress)
        {
            progressController.startProgressAnimation(playbackprogress);
        }
    }
}
