// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.details;


// Referenced classes of package com.fitbit.heartrate.details:
//            HeartRateDetailsHeaderFragment

private static final class Q extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/fitbit/heartrate/details/HeartRateDetailsHeaderFragment$VisibilityState, s);
    }

    public static Q[] values()
    {
        return (Q[])d.clone();
    }

    static 
    {
        a = new <init>("PROGRESS", 0);
        b = new <init>("CONTENT", 1);
        c = new <init>("PLACEHOLDER", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
