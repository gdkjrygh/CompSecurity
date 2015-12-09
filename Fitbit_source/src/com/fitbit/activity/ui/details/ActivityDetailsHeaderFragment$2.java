// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.details;

import com.fitbit.activity.ui.charts.ActivityType;

// Referenced classes of package com.fitbit.activity.ui.details:
//            ActivityDetailsHeaderFragment

static class 
{

    static final int a[];

    static 
    {
        a = new int[ActivityType.values().length];
        try
        {
            a[ActivityType.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[ActivityType.c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[ActivityType.e.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[ActivityType.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ActivityType.a.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
