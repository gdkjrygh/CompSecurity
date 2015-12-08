// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public final class SwitchInfo extends Enum
{

    private static final SwitchInfo $VALUES[];
    public static final SwitchInfo ABR;
    public static final SwitchInfo PERIOD;
    private final int value;

    private SwitchInfo(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static SwitchInfo valueOf(String s)
    {
        return (SwitchInfo)Enum.valueOf(com/adobe/ave/SwitchInfo, s);
    }

    public static SwitchInfo[] values()
    {
        return (SwitchInfo[])$VALUES.clone();
    }

    final int getValue()
    {
        return value;
    }

    static 
    {
        ABR = new SwitchInfo("ABR", 0, 0);
        PERIOD = new SwitchInfo("PERIOD", 1, 1);
        $VALUES = (new SwitchInfo[] {
            ABR, PERIOD
        });
    }
}
