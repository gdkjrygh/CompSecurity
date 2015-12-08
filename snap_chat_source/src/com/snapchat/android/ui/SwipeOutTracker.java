// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public final class SwipeOutTracker
{
    public static final class SwipeToExitMethod extends Enum
    {

        private static final SwipeToExitMethod $VALUES[];
        public static final SwipeToExitMethod AUTO_ADVANCE;
        public static final SwipeToExitMethod BACK_PRESSED;
        public static final SwipeToExitMethod ENTER_BACKGROUND;
        public static final SwipeToExitMethod SWIPE_BEGINNING;
        public static final SwipeToExitMethod SWIPE_DOWN;
        public static final SwipeToExitMethod SWIPE_END;
        private String a;

        public static SwipeToExitMethod valueOf(String s)
        {
            return (SwipeToExitMethod)Enum.valueOf(com/snapchat/android/ui/SwipeOutTracker$SwipeToExitMethod, s);
        }

        public static SwipeToExitMethod[] values()
        {
            return (SwipeToExitMethod[])$VALUES.clone();
        }

        public final String getName()
        {
            return a;
        }

        static 
        {
            SWIPE_DOWN = new SwipeToExitMethod("SWIPE_DOWN", 0, "swipe_down");
            SWIPE_BEGINNING = new SwipeToExitMethod("SWIPE_BEGINNING", 1, "swipe_beginning");
            SWIPE_END = new SwipeToExitMethod("SWIPE_END", 2, "swipe_end");
            ENTER_BACKGROUND = new SwipeToExitMethod("ENTER_BACKGROUND", 3, "enter_background");
            BACK_PRESSED = new SwipeToExitMethod("BACK_PRESSED", 4, "back_pressed");
            AUTO_ADVANCE = new SwipeToExitMethod("AUTO_ADVANCE", 5, "auto_advance");
            $VALUES = (new SwipeToExitMethod[] {
                SWIPE_DOWN, SWIPE_BEGINNING, SWIPE_END, ENTER_BACKGROUND, BACK_PRESSED, AUTO_ADVANCE
            });
        }

        private SwipeToExitMethod(String s, int l, String s1)
        {
            super(s, l);
            a = s1;
        }
    }

    public static interface a
    {

        public abstract void a(float f1, float f2);

        public abstract void n();

        public abstract void o();

        public abstract void p();
    }

    public static interface b
        extends Annotation
    {
    }


    public final List a = new ArrayList();
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;
    public SwipeToExitMethod i;
    public int j;
    private VelocityTracker k;

    public SwipeOutTracker()
    {
        k = null;
        i = null;
        j = 0;
    }

    public final void a(float f1, float f2)
    {
        b = f1;
        c = f2;
    }

    public final void a(MotionEvent motionevent)
    {
        if (k == null)
        {
            k = VelocityTracker.obtain();
        }
        k.addMovement(motionevent);
    }

    public final void a(MotionEvent motionevent, int l, int i1, boolean flag)
    {
        a(motionevent);
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        if (l == 0 && f1 - b > d)
        {
            j = 3;
            i = SwipeToExitMethod.SWIPE_BEGINNING;
        } else
        if (l == i1 - 1 && b - f1 > d && !flag)
        {
            j = 4;
            i = SwipeToExitMethod.SWIPE_END;
        } else
        if (f2 - c > e)
        {
            j = 2;
            i = SwipeToExitMethod.SWIPE_DOWN;
        }
        if (a())
        {
            for (l = 0; l < a.size(); l++)
            {
                ((a)a.get(l)).n();
            }

            a(f1, f2);
        }
    }

    public final void a(SwipeToExitMethod swipetoexitmethod)
    {
        i = swipetoexitmethod;
        for (int l = 0; l < a.size(); l++)
        {
            ((a)a.get(l)).o();
        }

    }

    public final boolean a()
    {
        return j == 3 || j == 4 || j == 2;
    }

    public final boolean b()
    {
        VelocityTracker velocitytracker = k;
        velocitytracker.computeCurrentVelocity(1000, f);
        int l = (int)velocitytracker.getYVelocity();
        int i1 = (int)velocitytracker.getXVelocity();
        return i1 > g && j == 3 || i1 < -g && j == 4 || l > h && j == 2;
    }

    public final void c()
    {
        j = 0;
        if (k != null)
        {
            k.recycle();
            k = null;
        }
    }
}
