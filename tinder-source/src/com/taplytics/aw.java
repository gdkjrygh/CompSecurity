// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.VelocityTracker;

// Referenced classes of package com.taplytics:
//            az

final class aw
    implements az
{

    aw()
    {
    }

    public final float a(VelocityTracker velocitytracker, int i)
    {
        return velocitytracker.getXVelocity();
    }

    public final float b(VelocityTracker velocitytracker, int i)
    {
        return velocitytracker.getYVelocity();
    }
}
