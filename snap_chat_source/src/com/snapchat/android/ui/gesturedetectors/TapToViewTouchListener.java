// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.gesturedetectors;

import Jo;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.snapchat.android.util.debug.FeatureFlagManager;

public final class TapToViewTouchListener
{
    public static final class SwipeDirection extends Enum
    {

        private static final SwipeDirection $VALUES[];
        public static final SwipeDirection DOWN;
        public static final SwipeDirection LEFT;
        public static final SwipeDirection RIGHT;
        public static final SwipeDirection UP;

        public static SwipeDirection valueOf(String s)
        {
            return (SwipeDirection)Enum.valueOf(com/snapchat/android/ui/gesturedetectors/TapToViewTouchListener$SwipeDirection, s);
        }

        public static SwipeDirection[] values()
        {
            return (SwipeDirection[])$VALUES.clone();
        }

        static 
        {
            UP = new SwipeDirection("UP", 0);
            DOWN = new SwipeDirection("DOWN", 1);
            LEFT = new SwipeDirection("LEFT", 2);
            RIGHT = new SwipeDirection("RIGHT", 3);
            $VALUES = (new SwipeDirection[] {
                UP, DOWN, LEFT, RIGHT
            });
        }

        private SwipeDirection(String s, int j)
        {
            super(s, j);
        }
    }

    public static interface a
    {

        public abstract void a();

        public abstract void a(float f1, float f2);

        public abstract void a(SwipeDirection swipedirection);

        public abstract void b();
    }


    public float a;
    public float b;
    private final a c;
    private final Context d;
    private float e;
    private int f;
    private int g;
    private VelocityTracker h;
    private SwipeDirection i;

    public TapToViewTouchListener(Context context, a a1)
    {
        FeatureFlagManager.a();
        this(context, a1, (byte)0);
    }

    private TapToViewTouchListener(Context context, a a1, byte byte0)
    {
        e = -1F;
        f = -1;
        a = -1F;
        b = -1F;
        i = null;
        d = context;
        c = a1;
        e = (float)Jo.b(d) * 0.125F;
        f = (int)Jo.a(200F, d);
        context = ViewConfiguration.get(d);
        context.getScaledTouchSlop();
        g = context.getScaledMaximumFlingVelocity();
    }

    private SwipeDirection a(float f1, float f2)
    {
        if (a != -1F && b != -1F)
        {
            float f3 = a;
            f2 -= b;
            if (Math.abs(f1 - f3) <= Math.abs(f2) && Math.abs(f2) > e)
            {
                if (f2 > 0.0F)
                {
                    return SwipeDirection.DOWN;
                } else
                {
                    return SwipeDirection.UP;
                }
            }
        }
        return null;
    }

    public final boolean a()
    {
        VelocityTracker velocitytracker = h;
        velocitytracker.computeCurrentVelocity(1000, g);
        int j = (int)velocitytracker.getYVelocity();
        return i == SwipeDirection.UP && j < -f || i == SwipeDirection.DOWN && j > f;
    }

    public final boolean a(MotionEvent motionevent)
    {
        int j;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        j = motionevent.getActionMasked();
        if (j != 0) goto _L2; else goto _L1
_L1:
        a = motionevent.getX();
        b = motionevent.getY();
_L4:
        return flag1;
_L2:
        if (j != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (h == null)
        {
            h = VelocityTracker.obtain();
        }
        h.addMovement(motionevent);
        i = a(motionevent.getX(), motionevent.getY());
        if (i != null)
        {
            flag = true;
        }
        flag1 = flag;
        if (flag)
        {
            a = motionevent.getX();
            b = motionevent.getY();
            c.a();
            return flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (j == 1)
        {
            b();
            return false;
        }
        if (j == 3)
        {
            b();
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void b()
    {
        i = null;
        a = -1F;
        b = -1F;
        if (h != null)
        {
            h.recycle();
            h = null;
        }
    }

    public final boolean b(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            if (i != null)
            {
                if (i == SwipeDirection.DOWN)
                {
                    if (a())
                    {
                        c.a(i);
                    } else
                    {
                        c.b();
                    }
                } else
                if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.REPLY_STORY_TO_CHAT) && i == SwipeDirection.UP && a())
                {
                    c.a(i);
                }
            }
            b();
        } else
        {
            if (h == null)
            {
                h = VelocityTracker.obtain();
            }
            h.addMovement(motionevent);
            if (motionevent.getAction() == 2)
            {
                if (i == null)
                {
                    i = a(motionevent.getX(), motionevent.getY());
                    if (i == SwipeDirection.DOWN)
                    {
                        a = motionevent.getX();
                        b = motionevent.getY();
                        c.a();
                    }
                }
                if (i != null && i == SwipeDirection.DOWN)
                {
                    c.a(motionevent.getX() - a, motionevent.getY() - b);
                }
            } else
            if (motionevent.getAction() == 0)
            {
                a = motionevent.getX();
                b = motionevent.getY();
            }
            if (i == null)
            {
                return false;
            }
        }
        return true;
    }
}
