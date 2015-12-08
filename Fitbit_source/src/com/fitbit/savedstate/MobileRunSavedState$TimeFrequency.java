// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.savedstate:
//            MobileRunSavedState

public static final class time extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    private static final i j[];
    private final int time;

    public static time valueOf(String s)
    {
        return (time)Enum.valueOf(com/fitbit/savedstate/MobileRunSavedState$TimeFrequency, s);
    }

    public static time[] values()
    {
        return (time[])j.clone();
    }

    public long a(TimeUnit timeunit)
    {
        return timeunit.convert(time, TimeUnit.MINUTES);
    }

    static 
    {
        a = new <init>("Two", 0, 2);
        b = new <init>("Three", 1, 3);
        c = new <init>("Four", 2, 4);
        d = new <init>("Five", 3, 5);
        e = new <init>("Ten", 4, 10);
        f = new <init>("Fifteen", 5, 15);
        g = new <init>("Twenty", 6, 20);
        h = new <init>("TwentyFive", 7, 25);
        i = new <init>("Thirty", 8, 30);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private (String s, int k, int l)
    {
        super(s, k);
        time = l;
    }
}
