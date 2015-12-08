// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;


// Referenced classes of package com.fitbit.food.barcode.ui:
//            BarcodeScannerActivity

public static final class  extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/food/barcode/ui/BarcodeScannerActivity$ScanningState, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("NO_CONNECTION", 0);
        b = new <init>("SCAN", 1);
        c = new <init>("SEND_REQUEST", 2);
        d = new <init>("SEARCH_NO_RESULTS", 3);
        e = new <init>("SUBMIT_TO_DB", 4);
        f = new <init>("SUBMITTING_COMPLETED", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
