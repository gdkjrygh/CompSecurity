// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.progress;

import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.soundcloud.android.playback.PlaybackProgress;

// Referenced classes of package com.soundcloud.android.playback.ui.progress:
//            EmptyProgressHelper, ProgressAnimator, ProgressHelper

public class ProgressController
{
    public static class Factory
    {

        public ProgressController create(View view)
        {
            return new ProgressController(view);
        }

        public Factory()
        {
        }
    }


    private static final int PROGRESS_SYNC_TOLERANCE = 1;
    private boolean animationRequested;
    private ProgressHelper helper;
    private PlaybackProgress playbackProgress;
    private ProgressAnimator progressAnimator;
    private View progressView;
    private final AnimatorListenerAdapter resetProgressListener;

    public ProgressController(View view)
    {
        this(view, ((ProgressHelper) (new EmptyProgressHelper())));
    }

    public ProgressController(View view, ProgressHelper progresshelper)
    {
        resetProgressListener = new _cls1();
        progressView = view;
        helper = progresshelper;
    }

    private boolean hasRunningAnimation()
    {
        return progressAnimator != null && progressAnimator.isRunning();
    }

    private void startProgressAnimationInternal()
    {
        if (progressAnimator != null)
        {
            progressAnimator.cancel();
        }
        progressAnimator = helper.createAnimator(progressView, playbackProgress.getProgressProportion());
        if (progressAnimator != null)
        {
            progressAnimator.setDuration(playbackProgress.getTimeLeft());
            progressAnimator.start();
            progressAnimator.setCurrentPlayTime(playbackProgress.getTimeSinceCreation());
        }
    }

    public void cancelProgressAnimation()
    {
        animationRequested = false;
        if (progressAnimator != null)
        {
            progressAnimator.cancel();
        }
    }

    public void reset()
    {
        animationRequested = false;
        if (progressAnimator != null && progressAnimator.isRunning())
        {
            progressAnimator.addListener(resetProgressListener);
            progressAnimator.cancel();
            return;
        } else
        {
            setPlaybackProgress(PlaybackProgress.empty());
            return;
        }
    }

    public void setHelper(ProgressHelper progresshelper)
    {
        helper = progresshelper;
        if (hasRunningAnimation() || animationRequested)
        {
            startProgressAnimationInternal();
        }
    }

    public void setPlaybackProgress(PlaybackProgress playbackprogress)
    {
        playbackProgress = playbackprogress;
        float f = playbackprogress.getProgressProportion();
        if (hasRunningAnimation())
        {
            f = helper.getValueFromProportion(f);
            if (progressAnimator.getDifferenceFromCurrentValue(f) > 1.0F)
            {
                startProgressAnimationInternal();
            }
            return;
        } else
        {
            helper.setValueFromProportion(progressView, f);
            return;
        }
    }

    public void startProgressAnimation(PlaybackProgress playbackprogress)
    {
        animationRequested = true;
        playbackProgress = playbackprogress;
        startProgressAnimationInternal();
    }




    private class _cls1 extends AnimatorListenerAdapter
    {

        final ProgressController this$0;

        public void onAnimationEnd(Animator animator)
        {
            progressAnimator.removeListener(this);
            helper.setValueFromProportion(progressView, 0.0F);
        }

        _cls1()
        {
            this$0 = ProgressController.this;
            super();
        }
    }

}
