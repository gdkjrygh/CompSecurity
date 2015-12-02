// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.appstatelogger;


class ActivityState
{

    private ActivityState()
    {
    }

    public static String a(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException(String.format("%d is not a valid ActivityState", new Object[] {
                Integer.valueOf(i)
            }));

        case 1: // '\001'
            return "Created";

        case 2: // '\002'
            return "Destroyed";

        case 3: // '\003'
            return "Started";

        case 4: // '\004'
            return "Stopped";

        case 5: // '\005'
            return "Resumed";

        case 6: // '\006'
            return "Paused";
        }
    }
}
