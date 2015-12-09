// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.VelocityTracker;

public final class VelocityTrackerCompat
{
    static final class BaseVelocityTrackerVersionImpl
        implements VelocityTrackerVersionImpl
    {

        public final float getXVelocity(VelocityTracker velocitytracker, int i)
        {
            return velocitytracker.getXVelocity();
        }

        public final float getYVelocity(VelocityTracker velocitytracker, int i)
        {
            return velocitytracker.getYVelocity();
        }

        BaseVelocityTrackerVersionImpl()
        {
        }
    }

    static final class HoneycombVelocityTrackerVersionImpl
        implements VelocityTrackerVersionImpl
    {

        public final float getXVelocity(VelocityTracker velocitytracker, int i)
        {
            return velocitytracker.getXVelocity(i);
        }

        public final float getYVelocity(VelocityTracker velocitytracker, int i)
        {
            return velocitytracker.getYVelocity(i);
        }

        HoneycombVelocityTrackerVersionImpl()
        {
        }
    }

    static interface VelocityTrackerVersionImpl
    {

        public abstract float getXVelocity(VelocityTracker velocitytracker, int i);

        public abstract float getYVelocity(VelocityTracker velocitytracker, int i);
    }


    static final VelocityTrackerVersionImpl IMPL;

    public static float getXVelocity(VelocityTracker velocitytracker, int i)
    {
        return IMPL.getXVelocity(velocitytracker, i);
    }

    public static float getYVelocity(VelocityTracker velocitytracker, int i)
    {
        return IMPL.getYVelocity(velocitytracker, i);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new HoneycombVelocityTrackerVersionImpl();
        } else
        {
            IMPL = new BaseVelocityTrackerVersionImpl();
        }
    }
}
