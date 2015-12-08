// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.view.MotionEvent;

public class GestureTracker
{
    public static abstract class PassThroughStrategy extends Enum
    {

        public static final PassThroughStrategy a;
        public static final PassThroughStrategy b;
        public static final PassThroughStrategy c;
        public static final PassThroughStrategy d;
        private static final PassThroughStrategy e[];

        public static PassThroughStrategy valueOf(String s)
        {
            return (PassThroughStrategy)Enum.valueOf(com/skype/android/widget/GestureTracker$PassThroughStrategy, s);
        }

        public static PassThroughStrategy[] values()
        {
            return (PassThroughStrategy[])e.clone();
        }

        abstract boolean a(GestureTracker gesturetracker);

        static 
        {
            a = new PassThroughStrategy("PASS_ALL") {

                final boolean a(GestureTracker gesturetracker)
                {
                    return true;
                }

            };
            b = new PassThroughStrategy("PASS_SINGLE_TAP") {

                final boolean a(GestureTracker gesturetracker)
                {
                    return gesturetracker.a;
                }

            };
            c = new PassThroughStrategy("PASS_UNCONSUMED") {

                final boolean a(GestureTracker gesturetracker)
                {
                    return !gesturetracker.b;
                }

            };
            d = new PassThroughStrategy("PASS_NONE") {

                final boolean a(GestureTracker gesturetracker)
                {
                    return false;
                }

            };
            e = (new PassThroughStrategy[] {
                a, b, c, d
            });
        }

        private PassThroughStrategy(String s, int i)
        {
            super(s, i);
        }

        PassThroughStrategy(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }


    boolean a;
    boolean b;
    private PassThroughStrategy c;

    public GestureTracker()
    {
        c = PassThroughStrategy.d;
        a = false;
        b = false;
    }

    public final void a(MotionEvent motionevent)
    {
        boolean flag;
        if (motionevent.getAction() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (a)
        {
            b = false;
        }
    }

    public final void a(PassThroughStrategy passthroughstrategy)
    {
        c = passthroughstrategy;
    }

    public final boolean b(MotionEvent motionevent)
    {
        boolean flag;
        if (motionevent.getAction() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && c.a(this);
    }
}
