// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.core;


// Referenced classes of package com.fitbit.analytics.core:
//            Interaction

public static final class name extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];
    public final String name;

    public static name valueOf(String s)
    {
        return (name)Enum.valueOf(com/fitbit/analytics/core/Interaction$Version, s);
    }

    public static name[] values()
    {
        return (name[])d.clone();
    }

    static 
    {
        a = new <init>("V0", 0, "v0");
        b = new <init>("V1", 1, "v1");
        c = new <init>("V2", 2, "v2");
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }
}
