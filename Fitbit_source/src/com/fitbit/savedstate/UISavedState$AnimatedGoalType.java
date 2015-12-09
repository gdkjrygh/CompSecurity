// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;


// Referenced classes of package com.fitbit.savedstate:
//            UISavedState

public static final class _cls9 extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/fitbit/savedstate/UISavedState$AnimatedGoalType, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])h.clone();
    }

    static 
    {
        a = new <init>("CALORIES", 0);
        b = new <init>("DISTANCE", 1);
        c = new <init>("FLOORS", 2);
        d = new <init>("STEPS", 3);
        e = new <init>("MINUTES_VERY_ACTIVE", 4);
        f = new <init>("WATER", 5);
        g = new <init>("SLEEP", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
