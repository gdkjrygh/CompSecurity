// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.View;
import android.view.animation.Animation;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.common.CurrentTimeAnimation;
import com.netflix.mediaclient.util.AndroidUtils;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            CurrentTime, PlayerActivity, PlayScreen, BottomPanel, 
//            LastTime, PlayerWorkflowState

public class CurrentTimeTablet extends CurrentTime
{
    private class AnimationLock
    {

        public boolean animationCanceled;
        final CurrentTimeTablet this$0;

        private AnimationLock()
        {
            this$0 = CurrentTimeTablet.this;
            super();
        }

    }


    private AnimationLock lock;

    CurrentTimeTablet(PlayerActivity playeractivity)
    {
        super(playeractivity);
        lock = new AnimationLock();
    }

    private void startStartAnimation(ByteBuffer bytebuffer)
    {
        context.getScreen().startBif(bytebuffer);
        currentTimeAnimationInProgress = true;
        bytebuffer = new CurrentTimeAnimation(0, 0.0F, 0, 0.0F, 0, 0.0F, 0, -AndroidUtils.dipToPixels(context, 22));
        bytebuffer.setDuration(300L);
        final BottomPanel bp = context.getScreen().getBottomPanel();
        bytebuffer.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final CurrentTimeTablet this$0;
            final BottomPanel val$bp;

            public void onAnimationEnd(Animation animation)
            {
                animation = lock;
                animation;
                JVM INSTR monitorenter ;
                int i;
                currentTimeAnimationInProgress = false;
                i = AndroidUtils.dipToPixels(context, 40);
                android.widget.RelativeLayout.LayoutParams layoutparams1 = (android.widget.RelativeLayout.LayoutParams)currentTime.getLayoutParams();
                layoutparams1.setMargins(bp.getTimeX(currentTime), 0, 0, i);
                currentTime.setLayoutParams(layoutparams1);
                if (!lock.animationCanceled) goto _L2; else goto _L1
_L1:
                Log.d("screen", "Animation was canceled, do nothing!");
_L4:
                lock.animationCanceled = false;
                return;
_L2:
                Log.d("screen", "Animation was NOT canceled, expand!");
                if (!mBifDownloaded.get())
                {
                    break MISSING_BLOCK_LABEL_217;
                }
                Log.w("screen", "Bifs are downloaded, remove current time background");
                currentTime.setBackgroundResource(0);
_L5:
                android.widget.RelativeLayout.LayoutParams layoutparams2 = (android.widget.RelativeLayout.LayoutParams)currentTimeExp.getLayoutParams();
                layoutparams2.setMargins(bp.getTimeX(currentTimeExp), 0, 0, i);
                currentTimeExp.setLayoutParams(layoutparams2);
                currentTimeExp.setVisibility(0);
                if (true) goto _L4; else goto _L3
_L3:
                Exception exception;
                exception;
                animation;
                JVM INSTR monitorexit ;
                throw exception;
                Log.w("screen", "Bifs are not downloaded, do not remove current time background");
                  goto _L5
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
                synchronized (lock)
                {
                    currentTimeAnimationInProgress = true;
                }
                return;
                exception;
                animation;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = CurrentTimeTablet.this;
                bp = bottompanel;
                super();
            }
        });
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)currentTime.getLayoutParams();
        layoutparams.setMargins(bp.getTimeX(currentTime), 0, 0, 18);
        currentTime.setLayoutParams(layoutparams);
        if (currentTime.getVisibility() != 0)
        {
            currentTime.setVisibility(0);
        }
        updateCurrentTime();
        currentTime.startAnimation(bytebuffer);
    }

    private void startStopAnimation(final boolean updateCurrentTimeLabel)
    {
        context.getScreen().stopBif();
        currentTimeAnimationInProgress = true;
        CurrentTimeAnimation currenttimeanimation = new CurrentTimeAnimation(0, 0.0F, 0, 0.0F, 0, 0.0F, 0, AndroidUtils.dipToPixels(context, 22));
        currenttimeanimation.setDuration(300L);
        currenttimeanimation.setFillAfter(true);
        currenttimeanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final CurrentTimeTablet this$0;
            final boolean val$updateCurrentTimeLabel;

            public void onAnimationEnd(Animation animation)
            {
                animation = lock;
                animation;
                JVM INSTR monitorenter ;
                if (!lock.animationCanceled)
                {
                    break MISSING_BLOCK_LABEL_59;
                }
                Log.d("screen", "Animation was canceled, do nothing!");
                context.getState().setTimelineExitOnSnap(false);
_L2:
                lock.animationCanceled = false;
                return;
                currentTimeAnimationInProgress = false;
                if (Log.isLoggable("screen", 3))
                {
                    Log.d("screen", (new StringBuilder()).append("Movie current time from stopCurrentTime#onAnimationEnd, tablet: ").append(updateCurrentTimeLabel).toString());
                }
                restorePlaybackIfSnapOnExit();
                if (true) goto _L2; else goto _L1
_L1:
                Exception exception;
                exception;
                animation;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
                synchronized (lock)
                {
                    currentTimeAnimationInProgress = true;
                    currentTime.setBackgroundResource(0x7f0200a6);
                    currentTimeExp.setVisibility(4);
                }
                return;
                exception;
                animation;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = CurrentTimeTablet.this;
                updateCurrentTimeLabel = flag;
                super();
            }
        });
        if (currentTime.getVisibility() != 0)
        {
            currentTime.setVisibility(0);
        }
        if (updateCurrentTimeLabel)
        {
            updateCurrentTime();
        }
        currentTime.startAnimation(currenttimeanimation);
    }

    public void move(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!currentTimeAnimationInProgress) goto _L2; else goto _L1
_L1:
        Log.d("screen", "Current time animation in progress. Ignore!");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        PlayerActivity playeractivity = context;
        if (playeractivity == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (currentTime == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        BottomPanel bottompanel;
        Exception exception;
        android.widget.RelativeLayout.LayoutParams layoutparams1;
        int i;
        if (!flag)
        {
            i = 40;
        } else
        {
            i = 18;
        }
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", (new StringBuilder()).append("moveCurrentTimeWithTimeline start by margin: ").append(i).toString());
        }
        bottompanel = context.getScreen().getBottomPanel();
        layoutparams1 = (android.widget.RelativeLayout.LayoutParams)currentTime.getLayoutParams();
        i = AndroidUtils.dipToPixels(playeractivity, i);
        layoutparams1.setMargins(bottompanel.getTimeX(currentTime), 0, 0, i);
        if (currentTime.getVisibility() != 0)
        {
            currentTime.setVisibility(0);
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        updateCurrentTime();
        Log.d("screen", "moveCurrentTimeWithTimeline set layout parameter!");
        currentTime.setLayoutParams(layoutparams1);
        currentTime.clearAnimation();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)currentTimeExp.getLayoutParams();
        layoutparams.setMargins(bottompanel.getTimeX(currentTimeExp), 0, 0, i);
        currentTimeExp.setLayoutParams(layoutparams);
        context.getScreen().getBottomPanel().getLastTime().validateTimeOverlap(currentTimeLabel);
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        throw exception;
    }

    public void setBifDownloaded(boolean flag)
    {
        super.setBifDownloaded(flag);
        if (mBifDownloaded.get())
        {
            currentTime.setBackgroundResource(0);
        }
    }

    public void start(ByteBuffer bytebuffer)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        Object obj = mBifDownloaded;
        if (bytebuffer == null)
        {
            flag = false;
        }
        ((AtomicBoolean) (obj)).set(flag);
        if (context == null) goto _L2; else goto _L1
_L1:
        obj = currentTime;
        if (obj != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (currentTimeAnimationInProgress)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        startStartAnimation(bytebuffer);
          goto _L2
        bytebuffer;
        throw bytebuffer;
        Log.d("screen", "Start animation is not completed yet!");
        currentTime.clearAnimation();
        startStartAnimation(bytebuffer);
        lock.animationCanceled = true;
          goto _L2
    }

    public void stop(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (context == null) goto _L2; else goto _L1
_L1:
        View view = currentTime;
        if (view != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (currentTimeAnimationInProgress)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        startStopAnimation(flag);
          goto _L2
        Exception exception;
        exception;
        throw exception;
        Log.d("screen", "Start animation is not completed yet!");
        currentTime.clearAnimation();
        startStopAnimation(flag);
        lock.animationCanceled = true;
          goto _L2
    }

}
