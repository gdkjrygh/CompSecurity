// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;


// Referenced classes of package com.fitbit.savedstate:
//            MobileRunSavedState

public static final class distance extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];
    private final double distance;

    public static distance valueOf(String s)
    {
        return (distance)Enum.valueOf(com/fitbit/savedstate/MobileRunSavedState$DistanceFrequency, s);
    }

    public static distance[] values()
    {
        return (distance[])h.clone();
    }

    public double a()
    {
        return distance;
    }

    static 
    {
        a = new <init>("Half", 0, 0.5D);
        b = new <init>("One", 1, 1.0D);
        c = new <init>("OneHalf", 2, 1.5D);
        d = new <init>("Two", 3, 2D);
        e = new <init>("Three", 4, 3D);
        f = new <init>("Four", 5, 4D);
        g = new <init>("Five", 6, 5D);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private A(String s, int i, double d1)
    {
        super(s, i);
        distance = d1;
    }
}
