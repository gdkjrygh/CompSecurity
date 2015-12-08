// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.support.v4.view.GestureDetectorCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.studies.DriverAnalytics;
import me.lyft.android.controls.SimpleAnimationListener;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.rx.ReactiveProperty;

// Referenced classes of package me.lyft.android.services:
//            LyftDriverToggleService

class <init>
    implements android.view.uchListener
{

    private ValueAnimator bounceXAnimator;
    private ValueAnimator bounceYAnimator;
    private AnimatorSet bouncingAnimatorSet;
    private float initialTouchX;
    private float initialTouchY;
    private int initialX;
    private int initialY;
    private boolean shouldSwitchUserMode;
    final LyftDriverToggleService this$0;

    private void animateBouncingBack()
    {
        stopAnimations();
        bounceXAnimator = ValueAnimator.ofInt(new int[] {
            LyftDriverToggleService.access$1900(LyftDriverToggleService.this)._fld0, initialX
        });
        bounceYAnimator = ValueAnimator.ofInt(new int[] {
            LyftDriverToggleService.access$1900(LyftDriverToggleService.this)._fld0, initialY
        });
        bounceXAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final LyftDriverToggleService.LyftToggleTouchListener this$1;

            public void onAnimationUpdate(ValueAnimator valueanimator)
            {
                valueanimator = (Integer)valueanimator.getAnimatedValue();
                LyftDriverToggleService.access$1900(this$0).x = valueanimator.intValue();
                LyftDriverToggleService.access$2100(this$0).updateViewLayout(LyftDriverToggleService.access$2000(this$0), LyftDriverToggleService.access$1900(this$0));
            }

            
            {
                this$1 = LyftDriverToggleService.LyftToggleTouchListener.this;
                super();
            }
        });
        bounceYAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final LyftDriverToggleService.LyftToggleTouchListener this$1;

            public void onAnimationUpdate(ValueAnimator valueanimator)
            {
                valueanimator = (Integer)valueanimator.getAnimatedValue();
                LyftDriverToggleService.access$1900(this$0).y = valueanimator.intValue();
                LyftDriverToggleService.access$2100(this$0).updateViewLayout(LyftDriverToggleService.access$2000(this$0), LyftDriverToggleService.access$1900(this$0));
            }

            
            {
                this$1 = LyftDriverToggleService.LyftToggleTouchListener.this;
                super();
            }
        });
        bouncingAnimatorSet = new AnimatorSet();
        bouncingAnimatorSet.playTogether(new Animator[] {
            bounceXAnimator, bounceYAnimator
        });
        bouncingAnimatorSet.setInterpolator(new AnticipateOvershootInterpolator(2.0F, 1.5F));
        bouncingAnimatorSet.addListener(new SimpleAnimationListener() {

            final LyftDriverToggleService.LyftToggleTouchListener this$1;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                LyftDriverToggleService.access$900(this$0).setEnabled(true);
                changeTextVisibility(false);
                changeBackgroundVisibility(false);
                if (shouldSwitchUserMode)
                {
                    shouldSwitchUserMode = false;
                    LyftDriverToggleService.access$2800(this$0);
                }
            }

            public void onAnimationStart(Animator animator)
            {
                super.onAnimationStart(animator);
                LyftDriverToggleService.access$900(this$0).setEnabled(false);
            }

            
            {
                this$1 = LyftDriverToggleService.LyftToggleTouchListener.this;
                super();
            }
        });
        bouncingAnimatorSet.setDuration(500L);
        bouncingAnimatorSet.start();
    }

    private void changeBackgroundVisibility(boolean flag)
    {
        Object obj = LyftDriverToggleService.access$200(LyftDriverToggleService.this);
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((FrameLayout) (obj)).setVisibility(i);
        obj = LyftDriverToggleService.this;
        if (flag)
        {
            i = LyftDriverToggleService.access$600(LyftDriverToggleService.this);
        } else
        {
            i = 128;
        }
        LyftDriverToggleService.access$602(((LyftDriverToggleService) (obj)), i);
    }

    private void changeTextVisibility(boolean flag)
    {
        TextView textview = LyftDriverToggleService.access$500(LyftDriverToggleService.this);
        float f;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
        textview = LyftDriverToggleService.access$500(LyftDriverToggleService.this);
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.0F;
        }
        textview.setAlpha(f);
    }

    private double distance(float f, float f1, float f2, float f3)
    {
        return Math.sqrt(Math.pow(f2 - f, 2D) + Math.pow(f3 - f1, 2D));
    }

    private boolean isToggleTresholdReached(MotionEvent motionevent)
    {
        float f = motionevent.getRawX();
        float f1 = motionevent.getRawY();
        return distance(initialTouchX, initialTouchY, f, f1) > (double)LyftDriverToggleService.access$2300(LyftDriverToggleService.this);
    }

    private boolean shouldDismissChathead(MotionEvent motionevent)
    {
        if (LyftDriverToggleService.access$200(LyftDriverToggleService.this).getVisibility() != 8)
        {
            float f = motionevent.getRawX();
            float f1 = motionevent.getRawY();
            motionevent = LyftDriverToggleService.access$2400(LyftDriverToggleService.this, LyftDriverToggleService.access$400(LyftDriverToggleService.this));
            if (f > (float)((Rect) (motionevent)).left && f1 > (float)(((Rect) (motionevent)).top + motionevent.height() / 2) || f > (float)(((Rect) (motionevent)).left + motionevent.width() / 2) && f1 > (float)((Rect) (motionevent)).top)
            {
                return true;
            }
        }
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (LyftDriverToggleService.access$1800(LyftDriverToggleService.this).a(motionevent))
        {
            return true;
        }
        switch (motionevent.getAction())
        {
        default:
            return false;

        case 0: // '\0'
            initialX = LyftDriverToggleService.access$1900(LyftDriverToggleService.this)._fld0;
            initialTouchX = motionevent.getRawX();
            initialY = LyftDriverToggleService.access$1900(LyftDriverToggleService.this)._fld0;
            initialTouchY = motionevent.getRawY();
            return true;

        case 1: // '\001'
            if (shouldDismissChathead(motionevent))
            {
                DriverAnalytics.trackDriverDefenseDragToDismiss();
                lyftPreferences.setDriverShortcutEnabled(false);
                stopSelf();
                return true;
            }
            LyftDriverToggleService.access$900(LyftDriverToggleService.this).setEnabled(false);
            view = userSession.getRide();
            if (isToggleTresholdReached(motionevent) && (view == null || !LyftDriverToggleService.access$1000().contains(view.getStatus())))
            {
                shouldSwitchUserMode = true;
            }
            animateBouncingBack();
            return true;

        case 2: // '\002'
            LyftDriverToggleService.access$1900(LyftDriverToggleService.this)._fld0 = (int)((float)initialX + (motionevent.getRawX() - initialTouchX));
            LyftDriverToggleService.access$1900(LyftDriverToggleService.this)._fld0 = (int)((float)initialY + (motionevent.getRawY() - initialTouchY));
            LyftDriverToggleService.access$2100(LyftDriverToggleService.this).updateViewLayout(LyftDriverToggleService.access$2000(LyftDriverToggleService.this), LyftDriverToggleService.access$1900(LyftDriverToggleService.this));
            break;
        }
        if (shouldDismissChathead(motionevent))
        {
            LyftDriverToggleService.access$2200(LyftDriverToggleService.this).onNext(OVE);
        } else
        if (isToggleTresholdReached(motionevent))
        {
            LyftDriverToggleService.access$2200(LyftDriverToggleService.this).onNext(TCH);
        } else
        {
            LyftDriverToggleService.access$2200(LyftDriverToggleService.this).onNext(D);
        }
        changeBackgroundVisibility(true);
        return true;
    }

    protected void stopAnimations()
    {
        bouncingAnimatorSet.cancel();
        bounceXAnimator.cancel();
        bounceYAnimator.cancel();
        bounceXAnimator.removeAllUpdateListeners();
        bounceYAnimator.removeAllUpdateListeners();
    }





/*
    static boolean access$2702(_cls3 _pcls3, boolean flag)
    {
        _pcls3.shouldSwitchUserMode = flag;
        return flag;
    }

*/

    private _cls3.this._cls1()
    {
        this$0 = LyftDriverToggleService.this;
        super();
        bouncingAnimatorSet = new AnimatorSet();
        bounceXAnimator = new ValueAnimator();
        bounceYAnimator = new ValueAnimator();
    }

    bounceYAnimator(bounceYAnimator bounceyanimator)
    {
        this();
    }
}
