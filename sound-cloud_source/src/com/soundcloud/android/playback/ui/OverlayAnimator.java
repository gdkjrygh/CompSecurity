// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;

public class OverlayAnimator
{

    private final int fadeDuration;
    private ObjectAnimator objectAnimator;

    public OverlayAnimator(Resources resources)
    {
        fadeDuration = resources.getInteger(0x7f0a000b);
    }

    private void stopOverlayAnimation()
    {
        if (objectAnimator != null && objectAnimator.isRunning())
        {
            objectAnimator.cancel();
        }
    }

    public void hideOverlay(View view)
    {
        stopOverlayAnimation();
        objectAnimator = ObjectAnimator.ofFloat(view, "alpha", new float[] {
            view.getAlpha(), 0.0F
        });
        objectAnimator.setDuration(fadeDuration);
        objectAnimator.start();
    }

    public void setAlpha(View view, float f)
    {
        stopOverlayAnimation();
        view.setAlpha(f);
    }

    public void showOverlay(View view)
    {
        stopOverlayAnimation();
        objectAnimator = ObjectAnimator.ofFloat(view, "alpha", new float[] {
            view.getAlpha(), 1.0F
        });
        objectAnimator.setDuration(fadeDuration);
        objectAnimator.start();
    }
}
