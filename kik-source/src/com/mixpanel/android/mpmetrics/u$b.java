// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            u

public static final class c extends Enum
{

    public static final b a;
    public static final b b;
    private static final b d[];
    private final String c;

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/mixpanel/android/mpmetrics/u$b, s);
    }

    public static c[] values()
    {
        return (c[])d.clone();
    }

    public final String a()
    {
        return c;
    }

    static 
    {
        a = new <init>("EVENTS", 0, "events");
        b = new <init>("PEOPLE", 1, "people");
        d = (new d[] {
            a, b
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }
}
