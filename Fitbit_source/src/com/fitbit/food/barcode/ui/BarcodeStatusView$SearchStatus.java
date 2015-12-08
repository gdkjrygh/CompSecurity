// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;


// Referenced classes of package com.fitbit.food.barcode.ui:
//            BarcodeStatusView

public static final class  extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/food/barcode/ui/BarcodeStatusView$SearchStatus, s);
    }

    public static [] values()
    {
        return ([])e.clone();
    }

    static 
    {
        a = new <init>("NO_CONNECTION", 0);
        b = new <init>("IN_PROGRESS", 1);
        c = new <init>("STILL_IN_PROGRESS", 2);
        d = new <init>("FINDED", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
