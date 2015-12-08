// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.loadable;


// Referenced classes of package com.fitbit.ui.loadable:
//            LoadablePicassoImageView

public static final class A extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/fitbit/ui/loadable/LoadablePicassoImageView$MeasureMode, s);
    }

    public static A[] values()
    {
        return (A[])c.clone();
    }

    static 
    {
        a = new <init>("MEASURE_TO_VIEW_WIDTH", 0);
        b = new <init>("MEASURE_TO_SQUARE", 1);
        c = (new c[] {
            a, b
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
