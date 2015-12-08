// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.os.Process;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.TappableSurfaceView;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceUtils;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            VideoWindowForPostplayWithScaling, PlayerActivity

public class VideoWindowForPostplayWithAnimation extends VideoWindowForPostplayWithScaling
{
    private class ScaleAnimation
        implements Runnable
    {

        private final int REFRESH_RATE;
        private Runnable mExecuteOnEndOfAnimation;
        private ScaleAnimationParameters mParams;
        private boolean mRunning;
        final VideoWindowForPostplayWithAnimation this$0;

        private float calculateOffset(float f, float f1, float f2)
        {
            return f * f1 * f2;
        }

        public void run()
        {
            Process.setThreadPriority(-1);
            long l1 = System.currentTimeMillis();
            int l = 0;
            int i = mParams.getDurationInMS() / 20;
            float f = (float)Math.abs(mParams.getStartTopMargin() - mParams.getEndTopMargin()) / (float)i;
            float f1 = (float)Math.abs(mParams.getStartLeftMargin() - mParams.getEndLeftMargin()) / (float)i;
            float f2 = Math.abs(mParams.getStartScale() - mParams.getEndScale()) / (float)i;
            i = 1;
            if (mParams.getStartTopMargin() > mParams.getEndTopMargin())
            {
                i = -1;
            }
            int j = 1;
            if (mParams.getStartLeftMargin() > mParams.getEndLeftMargin())
            {
                j = -1;
            }
            int k = 1;
            if (mParams.getStartScale() < mParams.getEndScale())
            {
                k = -1;
            }
            for (mRunning = true; mRunning;)
            {
                Log.d(VideoWindowForPostplayWithScaling.TAG, "in loop");
                if (System.currentTimeMillis() - l1 >= (long)mParams.getDurationInMS())
                {
                    Log.d(VideoWindowForPostplayWithScaling.TAG, "Exit!");
                    mRunning = false;
                } else
                {
                    l++;
                    int i1 = mParams.getStartLeftMargin() + (int)calculateOffset(f1, l, j);
                    int j1 = mParams.getStartTopMargin() + (int)calculateOffset(f, l, i);
                    float f3 = mParams.getStartScale() - (float)l * f2 * (float)k;
                    if (Log.isLoggable(VideoWindowForPostplayWithScaling.TAG, 3))
                    {
                        Log.d(VideoWindowForPostplayWithScaling.TAG, (new StringBuilder()).append("Count # ").append(l).toString());
                        Log.d(VideoWindowForPostplayWithScaling.TAG, (new StringBuilder()).append("left: ").append(i1).toString());
                        Log.d(VideoWindowForPostplayWithScaling.TAG, (new StringBuilder()).append("top: ").append(j1).toString());
                        Log.d(VideoWindowForPostplayWithScaling.TAG, (new StringBuilder()).append("scale: ").append(f3).toString());
                    }
                    resizeVideo(i1, j1, f3);
                    try
                    {
                        Log.d(VideoWindowForPostplayWithScaling.TAG, "Sleep");
                        Thread.sleep(20L);
                    }
                    catch (InterruptedException interruptedexception)
                    {
                        Log.d(VideoWindowForPostplayWithScaling.TAG, "Interupped");
                        mRunning = false;
                    }
                }
            }

            resizeVideo(mParams.getEndLeftMargin(), mParams.getEndTopMargin(), mParams.getEndScale());
            if (mExecuteOnEndOfAnimation != null)
            {
                mContext.runInUiThread(mExecuteOnEndOfAnimation);
            }
        }

        private ScaleAnimation(ScaleAnimationParameters scaleanimationparameters, Runnable runnable)
        {
            this$0 = VideoWindowForPostplayWithAnimation.this;
            super();
            REFRESH_RATE = 20;
            if (scaleanimationparameters == null)
            {
                throw new IllegalArgumentException("Parameters can not be null");
            } else
            {
                mParams = scaleanimationparameters;
                mExecuteOnEndOfAnimation = runnable;
                return;
            }
        }

    }

    protected static class ScaleAnimationParameters
    {

        private int mDurationInMS;
        private int mEndLeftMargin;
        private float mEndScale;
        private int mEndTopMargin;
        private int mStartLeftMargin;
        private float mStartScale;
        private int mStartTopMargin;

        public int getDurationInMS()
        {
            return mDurationInMS;
        }

        public int getEndLeftMargin()
        {
            return mEndLeftMargin;
        }

        public float getEndScale()
        {
            return mEndScale;
        }

        public int getEndTopMargin()
        {
            return mEndTopMargin;
        }

        public int getStartLeftMargin()
        {
            return mStartLeftMargin;
        }

        public float getStartScale()
        {
            return mStartScale;
        }

        public int getStartTopMargin()
        {
            return mStartTopMargin;
        }

        public ScaleAnimationParameters(int i, int j, int k, float f, int l, int i1, float f1)
        {
            mDurationInMS = i;
            mStartLeftMargin = j;
            mStartTopMargin = k;
            mStartScale = f;
            mEndLeftMargin = l;
            mEndTopMargin = i1;
            mEndScale = f1;
        }
    }


    protected static final int ANIMATION_DURATION = 500;
    private final int END_MARGIN_LEFT_DP = 12;
    private final int END_MARGIN_TOP_DP = 12;
    private final int END_WIDTH_DP = 300;
    private Thread mAnimator;

    public VideoWindowForPostplayWithAnimation(PlayerActivity playeractivity)
    {
        super(playeractivity);
        Log.d(TAG, "PostPlayWithAnimation");
        init();
    }

    private void init()
    {
        int i = DeviceUtils.getScreenWidthInPixels(mContext);
        int j = AndroidUtils.dipToPixels(mContext, 12);
        mParams = new ScaleAnimationParameters(500, 0, 0, 1.0F, AndroidUtils.dipToPixels(mContext, 12), j, (float)AndroidUtils.dipToPixels(mContext, 300) / (float)i);
    }

    public void animateIn()
    {
        removeCenterInParent(mSurface);
        removeCenterInParent(mSurface2);
        if (mSurface != null)
        {
            mSurface.setBackgroundResource(0x7f020152);
            mSurface.setPadding(1, 1, 1, 1);
        }
        mOriginalSurfaceState = getCurrentSurfaceState();
        mAnimator = new Thread(new ScaleAnimation(getTransitionToPostPlayAnimationParameters(), null));
        mAnimator.start();
    }

    protected ScaleAnimationParameters getTransitionToPostPlayAnimationParameters()
    {
        return mParams;
    }
}
