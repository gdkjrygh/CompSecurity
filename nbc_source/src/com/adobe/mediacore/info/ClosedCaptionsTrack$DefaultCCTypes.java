// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.info;


// Referenced classes of package com.adobe.mediacore.info:
//            ClosedCaptionsTrack

public static final class value extends Enum
{

    private static final CS6 $VALUES[];
    public static final CS6 CC1;
    public static final CS6 CC2;
    public static final CS6 CC3;
    public static final CS6 CC4;
    public static final CS6 CS1;
    public static final CS6 CS2;
    public static final CS6 CS3;
    public static final CS6 CS4;
    public static final CS6 CS5;
    public static final CS6 CS6;
    private final int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/adobe/mediacore/info/ClosedCaptionsTrack$DefaultCCTypes, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    final int getValue()
    {
        return value;
    }

    static 
    {
        CC1 = new <init>("CC1", 0, 0);
        CC2 = new <init>("CC2", 1, 1);
        CC3 = new <init>("CC3", 2, 2);
        CC4 = new <init>("CC4", 3, 3);
        CS1 = new <init>("CS1", 4, 4);
        CS2 = new <init>("CS2", 5, 5);
        CS3 = new <init>("CS3", 6, 6);
        CS4 = new <init>("CS4", 7, 7);
        CS5 = new <init>("CS5", 8, 8);
        CS6 = new <init>("CS6", 9, 9);
        $VALUES = (new .VALUES[] {
            CC1, CC2, CC3, CC4, CS1, CS2, CS3, CS4, CS5, CS6
        });
    }

    private A(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
