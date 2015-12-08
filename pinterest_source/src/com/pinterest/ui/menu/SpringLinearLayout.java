// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.ui.spring.Spring;
import java.lang.reflect.Array;
import java.util.Timer;
import java.util.TimerTask;

public class SpringLinearLayout extends LinearLayout
{

    public static final int ALPHA = 3;
    private static final float DEFAULT_FRICTION = 0.5F;
    private static final float DEFAULT_TENSION = 0.2F;
    private static final int NUM_PROPERTIES = 4;
    public static final int SCALE = 2;
    public static final int TRANSLATE_X = 0;
    public static final int TRANSLATE_Y = 1;
    private AnimListener _listeners[][];
    private Spring _springs[][];
    private Timer _timer;
    private TimerTask _timerTask;
    private boolean isWindowDeatached;
    private Runnable onTickRunnable;

    public SpringLinearLayout(Context context)
    {
        this(context, null);
    }

    public SpringLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _timerTask = new _cls1();
        onTickRunnable = new _cls2();
    }

    private void init()
    {
        if (_springs == null)
        {
            int i = getChildCount();
            _springs = (Spring[][])Array.newInstance(com/pinterest/ui/spring/Spring, new int[] {
                i, 4
            });
            _listeners = (AnimListener[][])Array.newInstance(com/pinterest/ui/menu/SpringLinearLayout$AnimListener, new int[] {
                i, 4
            });
        }
    }

    private void killTimer()
    {
        if (_timer != null)
        {
            _timer.cancel();
            _timer.purge();
            _timerTask.cancel();
            _timer = null;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        isWindowDeatached = true;
        killTimer();
    }

    protected void requestTimer()
    {
        if (_timer == null && !isWindowDeatached)
        {
            _timer = new Timer((new StringBuilder("Timer Thread - ")).append(toString()).toString(), true);
            _timer.scheduleAtFixedRate(_timerTask, 0L, 16L);
        }
    }

    public void setProperty(int i, int j, float f, float f1)
    {
        setProperty(i, j, f, f1, 0.5F, 0.2F, null);
    }

    public void setProperty(int i, int j, float f, float f1, float f2, float f3, AnimListener animlistener)
    {
        Object obj;
        init();
        obj = _springs[i][j];
        if (obj != null) goto _L2; else goto _L1
_L1:
        _springs[i][j] = new Spring(f, f1, f2, f3);
_L4:
        _listeners[i][j] = animlistener;
        requestTimer();
        return;
_L2:
        ((Spring) (obj)).setTo(f1);
        ((Spring) (obj)).setFriction(f2);
        ((Spring) (obj)).setTension(f3);
        obj = _listeners[i][j];
        if (obj != null)
        {
            ((AnimListener) (obj)).onAnimationCancel();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }




    private class _cls1 extends TimerTask
    {

        final SpringLinearLayout this$0;

        public void run()
        {
            post(onTickRunnable);
        }

        _cls1()
        {
            this$0 = SpringLinearLayout.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final SpringLinearLayout this$0;

        public void run()
        {
            int i = 0;
_L11:
            View view;
            int j;
            if (i >= _springs.length)
            {
                break; /* Loop/switch isn't completed */
            }
            view = getChildAt(i);
            j = 0;
_L8:
            Spring spring;
            if (j >= _springs[i].length)
            {
                break MISSING_BLOCK_LABEL_258;
            }
            spring = _springs[i][j];
            if (spring == null || !spring.isStillMoving()) goto _L2; else goto _L1
_L1:
            float f1;
            f1 = spring.getNextFrame();
            setVisibility(0);
            view.setVisibility(0);
            j;
            JVM INSTR tableswitch 0 3: default 124
        //                       0 189
        //                       1 197
        //                       2 205
        //                       3 229;
               goto _L3 _L4 _L5 _L6 _L7
_L3:
            break; /* Loop/switch isn't completed */
_L7:
            break MISSING_BLOCK_LABEL_229;
_L9:
            if (!spring.isStillMoving() && _listeners[i][j] != null)
            {
                _listeners[i][j].onAnimationComplete();
                _listeners[i][j] = null;
            }
_L2:
            j++;
              goto _L8
_L4:
            view.setTranslationX(f1);
              goto _L9
_L5:
            view.setTranslationY(f1);
              goto _L9
_L6:
            view.setScaleX(f1);
            view.setScaleY(f1);
            if (f1 == 0.0F)
            {
                view.setVisibility(4);
            }
              goto _L9
            float f;
            if (f1 > 1.0F)
            {
                f = 1.0F;
            } else
            {
                f = f1;
                if (f1 < 0.0F)
                {
                    f = 0.0F;
                }
            }
            view.setAlpha(f);
              goto _L9
            i++;
            if (true) goto _L11; else goto _L10
_L10:
            if (SpringLinearLayout.this == null)
            {
                break MISSING_BLOCK_LABEL_281;
            }
            ViewCompat.postInvalidateOnAnimation(SpringLinearLayout.this);
            return;
            Exception exception;
            exception;
            CrashReporting.a(exception);
            return;
        }

        _cls2()
        {
            this$0 = SpringLinearLayout.this;
            super();
        }
    }


    private class AnimListener
    {

        public abstract void onAnimationCancel();

        public abstract void onAnimationComplete();
    }

}
