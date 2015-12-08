// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


public final class SwipeViewState
{
    public static final class MotionState extends Enum
    {

        private static final MotionState $VALUES[];
        public static final MotionState AUTO_SCROLLING;
        public static final MotionState NOT_MOVING;
        public static final MotionState SWIPING;

        public static MotionState valueOf(String s)
        {
            return (MotionState)Enum.valueOf(com/snapchat/android/ui/SwipeViewState$MotionState, s);
        }

        public static MotionState[] values()
        {
            return (MotionState[])$VALUES.clone();
        }

        static 
        {
            NOT_MOVING = new MotionState("NOT_MOVING", 0);
            SWIPING = new MotionState("SWIPING", 1);
            AUTO_SCROLLING = new MotionState("AUTO_SCROLLING", 2);
            $VALUES = (new MotionState[] {
                NOT_MOVING, SWIPING, AUTO_SCROLLING
            });
        }

        private MotionState(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class SwipeDirection extends Enum
    {

        private static final SwipeDirection $VALUES[];
        public static final SwipeDirection LEFT;
        public static final SwipeDirection RIGHT;

        public static SwipeDirection valueOf(String s)
        {
            return (SwipeDirection)Enum.valueOf(com/snapchat/android/ui/SwipeViewState$SwipeDirection, s);
        }

        public static SwipeDirection[] values()
        {
            return (SwipeDirection[])$VALUES.clone();
        }

        static 
        {
            LEFT = new SwipeDirection("LEFT", 0);
            RIGHT = new SwipeDirection("RIGHT", 1);
            $VALUES = (new SwipeDirection[] {
                LEFT, RIGHT
            });
        }

        private SwipeDirection(String s, int i1)
        {
            super(s, i1);
        }
    }


    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    float h;
    public MotionState i;
    SwipeDirection j;
    public SwipeDirection k;
    public boolean l;
    public boolean m;
    public float n;

    public SwipeViewState()
    {
        i = MotionState.NOT_MOVING;
    }

    public final int a(boolean flag)
    {
        SwipeDirection swipedirection = j;
        if (flag)
        {
            if (swipedirection == SwipeDirection.LEFT)
            {
                return c;
            } else
            {
                return d;
            }
        }
        if (swipedirection == SwipeDirection.LEFT)
        {
            return a;
        } else
        {
            return b;
        }
    }

    public final boolean a()
    {
        return g < h;
    }

    public final int b(boolean flag)
    {
        SwipeDirection swipedirection = j;
        if (flag)
        {
            if (swipedirection == SwipeDirection.RIGHT)
            {
                return c;
            } else
            {
                return d;
            }
        }
        if (swipedirection == SwipeDirection.RIGHT)
        {
            return a;
        } else
        {
            return b;
        }
    }

    public final void b()
    {
        f = e;
    }

    public final boolean c()
    {
        return i != MotionState.NOT_MOVING;
    }

    public final boolean d()
    {
        return k != j;
    }

    public final int e()
    {
        return Math.min(f, e);
    }
}
