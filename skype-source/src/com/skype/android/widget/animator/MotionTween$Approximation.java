// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.animator;


// Referenced classes of package com.skype.android.widget.animator:
//            MotionTween

public static final class A extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/skype/android/widget/animator/MotionTween$Approximation, s);
    }

    public static A[] values()
    {
        return (A[])h.clone();
    }

    static 
    {
        a = new <init>("LINEAR", 0);
        b = new <init>("DIRECT_POWER_2", 1);
        c = new <init>("DIRECT_POWER_3", 2);
        d = new <init>("DIRECT_POWER_4", 3);
        e = new <init>("INVERSE_POWER_2", 4);
        f = new <init>("INVERSE_POWER_3", 5);
        g = new <init>("INVERSE_POWER_4", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
