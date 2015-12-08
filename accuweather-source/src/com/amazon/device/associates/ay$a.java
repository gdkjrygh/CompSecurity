// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


// Referenced classes of package com.amazon.device.associates:
//            ay

public static final class  extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/amazon/device/associates/ay$a, s);
    }

    public static [] values()
    {
        return ([])h.clone();
    }

    static 
    {
        a = new <init>("GET_SERVICE_STATUS", 0);
        b = new <init>("GET_RECEIPTS", 1);
        c = new <init>("SEARCH", 2);
        d = new <init>("SEARCH_BY_ID", 3);
        e = new <init>("PURCHASE", 4);
        f = new <init>("GET_PURCHASE_RESULT", 5);
        g = new <init>("NOTIFY_RECEIPT_RECEIVED", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
