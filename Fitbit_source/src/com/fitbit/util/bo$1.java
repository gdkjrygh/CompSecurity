// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.data.domain.device.TrackerScreen;

// Referenced classes of package com.fitbit.util:
//            bo

static class Error
{

    static final int a[];

    static 
    {
        a = new int[TrackerScreen.values().length];
        try
        {
            a[TrackerScreen.STEPS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[TrackerScreen.ACTIVE_MINUTES.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[TrackerScreen.TIME.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[TrackerScreen.FLOORS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[TrackerScreen.CALORIES.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[TrackerScreen.DISTANCE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[TrackerScreen.HEART_RATE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
