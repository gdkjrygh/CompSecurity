// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            OverlayAnimator

class PlayerOverlayController
    implements com.soundcloud.android.playback.ui.progress.ScrubController.OnScrubListener
{
    public static class Factory
    {

        private final Provider overlayAnimatorProvider;

        public PlayerOverlayController create(View view)
        {
            return new PlayerOverlayController(view, (OverlayAnimator)overlayAnimatorProvider.get());
        }

        Factory(Provider provider)
        {
            overlayAnimatorProvider = provider;
        }
    }


    private boolean adOverlayShown;
    private float alphaFromCollapse;
    private boolean isScrubbing;
    private final View overlay;
    private final OverlayAnimator overlayAnimator;
    private boolean playSessionIsActive;

    public PlayerOverlayController(View view, OverlayAnimator overlayanimator)
    {
        overlay = view;
        overlayAnimator = overlayanimator;
    }

    private void configureOverlay()
    {
        if (notScrubbing() && isExpanded() && playingAndNotShowingAd())
        {
            overlayAnimator.hideOverlay(overlay);
        } else
        if (isExpanded())
        {
            overlayAnimator.showOverlay(overlay);
            return;
        }
    }

    private boolean isExpanded()
    {
        return alphaFromCollapse == 0.0F;
    }

    private boolean notScrubbing()
    {
        return !isScrubbing;
    }

    private boolean playingAndNotShowingAd()
    {
        return playSessionIsActive && !adOverlayShown;
    }

    public void displayScrubPosition(float f)
    {
    }

    public void scrubStateChanged(int i)
    {
        boolean flag = true;
        if (i != 1)
        {
            flag = false;
        }
        isScrubbing = flag;
        if (isScrubbing)
        {
            overlayAnimator.showOverlay(overlay);
        } else
        if (playingAndNotShowingAd() && isExpanded())
        {
            overlayAnimator.hideOverlay(overlay);
            return;
        }
    }

    public void setAdOverlayShown(boolean flag)
    {
        adOverlayShown = flag;
        configureOverlay();
    }

    public void setAlphaFromCollapse(float f)
    {
        alphaFromCollapse = f;
        if (playingAndNotShowingAd())
        {
            overlayAnimator.setAlpha(overlay, alphaFromCollapse);
        }
    }

    public void setPlayState(com.soundcloud.android.playback.Player.StateTransition statetransition)
    {
        playSessionIsActive = statetransition.playSessionIsActive();
        configureOverlay();
    }
}
