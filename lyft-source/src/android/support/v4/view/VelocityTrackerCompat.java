// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.VelocityTracker;

public class VelocityTrackerCompat
{

    static final VelocityTrackerVersionImpl a;

    public static float a(VelocityTracker velocitytracker, int i)
    {
        return a.a(velocitytracker, i);
    }

    public static float b(VelocityTracker velocitytracker, int i)
    {
        return a.b(velocitytracker, i);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new HoneycombVelocityTrackerVersionImpl();
        } else
        {
            a = new BaseVelocityTrackerVersionImpl();
        }
    }

    private class VelocityTrackerVersionImpl
    {

        public abstract float a(VelocityTracker velocitytracker, int i);

        public abstract float b(VelocityTracker velocitytracker, int i);
    }


    private class HoneycombVelocityTrackerVersionImpl
        implements VelocityTrackerVersionImpl
    {

        public float a(VelocityTracker velocitytracker, int i)
        {
            return VelocityTrackerCompatHoneycomb.a(velocitytracker, i);
        }

        public float b(VelocityTracker velocitytracker, int i)
        {
            return VelocityTrackerCompatHoneycomb.b(velocitytracker, i);
        }

        HoneycombVelocityTrackerVersionImpl()
        {
        }
    }


    private class BaseVelocityTrackerVersionImpl
        implements VelocityTrackerVersionImpl
    {

        public float a(VelocityTracker velocitytracker, int i)
        {
            return velocitytracker.getXVelocity();
        }

        public float b(VelocityTracker velocitytracker, int i)
        {
            return velocitytracker.getYVelocity();
        }

        BaseVelocityTrackerVersionImpl()
        {
        }
    }

}
