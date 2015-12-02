// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;


public final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN REBOOT;
    public static final UNKNOWN REINSTALL;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/common/dextricks/CorruptedApplicationStateException$Remedy, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        REINSTALL = new <init>("REINSTALL", 0);
        REBOOT = new <init>("REBOOT", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            REINSTALL, REBOOT, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
