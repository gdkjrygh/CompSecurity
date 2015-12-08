// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.core;


// Referenced classes of package com.fitbit.analytics.core:
//            Interaction

public static final class name extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    public final String name;

    public static name valueOf(String s)
    {
        return (name)Enum.valueOf(com/fitbit/analytics/core/Interaction$Type, s);
    }

    public static name[] values()
    {
        return (name[])c.clone();
    }

    static 
    {
        a = new <init>("SCREEN", 0, "screen");
        b = new <init>("EVENT", 1, "event");
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }
}
