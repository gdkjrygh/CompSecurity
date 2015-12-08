// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.common;


// Referenced classes of package com.google.wallet.wobl.common:
//            DisplayUnit

public static final class mString extends Enum
{

    private static final PIXEL $VALUES[];
    public static final PIXEL DP;
    public static final PIXEL IN;
    public static final PIXEL MM;
    public static final PIXEL PIXEL;
    public static final PIXEL PT;
    public static final PIXEL SP;
    public static final PIXEL WEIGHT;
    private String mString;

    public static mString valueOf(String s)
    {
        return (mString)Enum.valueOf(com/google/wallet/wobl/common/DisplayUnit$Unit, s);
    }

    public static mString[] values()
    {
        return (mString[])$VALUES.clone();
    }

    public final String toString()
    {
        return mString;
    }

    static 
    {
        DP = new <init>("DP", 0, "dp");
        IN = new <init>("IN", 1, "in");
        MM = new <init>("MM", 2, "mm");
        PT = new <init>("PT", 3, "pt");
        SP = new <init>("SP", 4, "sp");
        WEIGHT = new <init>("WEIGHT", 5, "wt");
        PIXEL = new <init>("PIXEL", 6, "px");
        $VALUES = (new .VALUES[] {
            DP, IN, MM, PT, SP, WEIGHT, PIXEL
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mString = s1;
    }
}
