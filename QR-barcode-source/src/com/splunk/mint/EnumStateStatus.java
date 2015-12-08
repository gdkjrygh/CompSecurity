// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;


final class EnumStateStatus extends Enum
{

    private static final EnumStateStatus $VALUES[];
    public static final EnumStateStatus NA;
    public static final EnumStateStatus OFF;
    public static final EnumStateStatus ON;

    private EnumStateStatus(String s, int i)
    {
        super(s, i);
    }

    public static EnumStateStatus valueOf(String s)
    {
        return (EnumStateStatus)Enum.valueOf(com/splunk/mint/EnumStateStatus, s);
    }

    public static EnumStateStatus[] values()
    {
        return (EnumStateStatus[])$VALUES.clone();
    }

    static 
    {
        ON = new EnumStateStatus("ON", 0);
        OFF = new EnumStateStatus("OFF", 1);
        NA = new EnumStateStatus("NA", 2);
        $VALUES = (new EnumStateStatus[] {
            ON, OFF, NA
        });
    }
}
