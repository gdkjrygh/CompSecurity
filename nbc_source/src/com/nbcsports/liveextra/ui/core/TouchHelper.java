// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class TouchHelper
{
    public static final class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action BT;
        public static final Action LR;
        public static final Action None;
        public static final Action RL;
        public static final Action TB;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/nbcsports/liveextra/ui/core/TouchHelper$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        static 
        {
            None = new Action("None", 0);
            LR = new Action("LR", 1);
            RL = new Action("RL", 2);
            TB = new Action("TB", 3);
            BT = new Action("BT", 4);
            $VALUES = (new Action[] {
                None, LR, RL, TB, BT
            });
        }

        private Action(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int INVALID_POINTER_ID = -1;
    private Action actionDetected;
    private int activePointerId;
    private float currentX;
    private float currentY;
    private float downX;
    private float downY;
    public final int minFlingVelocity;
    public final int touchSlop;

    public TouchHelper(View view)
    {
        activePointerId = -1;
        view = ViewConfiguration.get(view.getContext());
        touchSlop = view.getScaledTouchSlop();
        minFlingVelocity = view.getScaledMinimumFlingVelocity();
        reset();
    }

    public Action getAction()
    {
        return actionDetected;
    }

    public float getCurrentX()
    {
        return currentX;
    }

    public float getCurrentY()
    {
        return currentY;
    }

    public float getDeltaX()
    {
        return downX - currentX;
    }

    public float getDeltaY()
    {
        return downY - currentY;
    }

    public float getDownX()
    {
        return downX;
    }

    public float getDownY()
    {
        return downY;
    }

    public boolean isHorizontalScroll()
    {
        return actionDetected == Action.LR || actionDetected == Action.RL;
    }

    public boolean isVerticalScroll()
    {
        return actionDetected == Action.TB || actionDetected == Action.BT;
    }

    public void recordTouchEvent(MotionEvent motionevent)
    {
        int i = MotionEventCompat.getActionIndex(motionevent);
        motionevent.getAction();
        JVM INSTR tableswitch 0 6: default 52
    //                   0 53
    //                   1 81
    //                   2 89
    //                   3 81
    //                   4 52
    //                   5 52
    //                   6 199;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L1 _L5
_L1:
        return;
_L2:
        downX = MotionEventCompat.getX(motionevent, i);
        downY = MotionEventCompat.getY(motionevent, i);
        actionDetected = Action.None;
        return;
_L3:
        actionDetected = Action.None;
        return;
_L4:
        float f;
        currentX = MotionEventCompat.getX(motionevent, i);
        currentY = MotionEventCompat.getY(motionevent, i);
        f = getDeltaX();
        float f1 = getDeltaY();
        if (Math.abs(f1) <= (float)touchSlop)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f1 < 0.0F)
        {
            actionDetected = Action.TB;
        }
        if (f1 > 0.0F)
        {
            actionDetected = Action.BT;
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (Math.abs(f) <= (float)touchSlop) goto _L1; else goto _L6
_L6:
        if (f < 0.0F)
        {
            actionDetected = Action.LR;
        }
        if (f > 0.0F)
        {
            actionDetected = Action.RL;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (MotionEventCompat.getPointerId(motionevent, i) == activePointerId)
        {
            if (i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            currentX = MotionEventCompat.getX(motionevent, i);
            activePointerId = MotionEventCompat.getPointerId(motionevent, i);
            actionDetected = Action.None;
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void reset()
    {
        downX = 0.0F;
        downY = 0.0F;
        currentX = 0.0F;
        currentY = 0.0F;
        actionDetected = Action.None;
    }
}
