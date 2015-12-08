// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


// Referenced classes of package com.adobe.ave:
//            ABRParameters

public static final class value extends Enum
{

    private static final ABR_AUTO_OFF $VALUES[];
    public static final ABR_AUTO_OFF ABR_AGGRESSIVE;
    public static final ABR_AUTO_OFF ABR_AUTO_OFF;
    public static final ABR_AUTO_OFF ABR_CONSERVATIVE;
    public static final ABR_AUTO_OFF ABR_MODERATE;
    private final int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/adobe/ave/ABRParameters$ABRPolicy, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    public int getValue()
    {
        return value;
    }

    static 
    {
        ABR_AGGRESSIVE = new <init>("ABR_AGGRESSIVE", 0, 0);
        ABR_MODERATE = new <init>("ABR_MODERATE", 1, 1);
        ABR_CONSERVATIVE = new <init>("ABR_CONSERVATIVE", 2, 2);
        ABR_AUTO_OFF = new <init>("ABR_AUTO_OFF", 3, 3);
        $VALUES = (new .VALUES[] {
            ABR_AGGRESSIVE, ABR_MODERATE, ABR_CONSERVATIVE, ABR_AUTO_OFF
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
