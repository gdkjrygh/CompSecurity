// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.running.steptracker;

import com.spotify.mobile.android.spotlets.running.auto.MotionState;

// Referenced classes of package com.spotify.mobile.android.spotlets.running.steptracker:
//            StepTrackerService

final class 
{

    static final int a[];

    static 
    {
        a = new int[MotionState.values().length];
        try
        {
            a[MotionState.c.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[MotionState.d.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
