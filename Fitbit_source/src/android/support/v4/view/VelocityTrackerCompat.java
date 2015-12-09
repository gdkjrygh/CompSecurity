// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.VelocityTracker;

public class VelocityTrackerCompat
{

    static final VelocityTrackerVersionImpl IMPL;

    public VelocityTrackerCompat()
    {
    }

    public static float getXVelocity(VelocityTracker velocitytracker, int i)
    {
    /* block-local class not found */
    class VelocityTrackerVersionImpl {}

        return IMPL.getXVelocity(velocitytracker, i);
    }

    public static float getYVelocity(VelocityTracker velocitytracker, int i)
    {
        return IMPL.getYVelocity(velocitytracker, i);
    }

    static 
    {
    /* block-local class not found */
    class BaseVelocityTrackerVersionImpl {}

    /* block-local class not found */
    class HoneycombVelocityTrackerVersionImpl {}

        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new HoneycombVelocityTrackerVersionImpl();
        } else
        {
            IMPL = new BaseVelocityTrackerVersionImpl();
        }
    }
}
