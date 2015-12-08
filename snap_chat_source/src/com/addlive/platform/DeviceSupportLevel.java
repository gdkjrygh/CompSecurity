// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.platform;


public final class DeviceSupportLevel extends Enum
{

    private static final DeviceSupportLevel $VALUES[];
    public static final DeviceSupportLevel AUDIO_ONLY;
    public static final DeviceSupportLevel FULLY_SUPPORTED;
    public static final DeviceSupportLevel NOT_FUNCTIONAL;
    public static final DeviceSupportLevel NOT_SUPPORTED;

    private DeviceSupportLevel(String s, int i)
    {
        super(s, i);
    }

    public static DeviceSupportLevel valueOf(String s)
    {
        return (DeviceSupportLevel)Enum.valueOf(com/addlive/platform/DeviceSupportLevel, s);
    }

    public static DeviceSupportLevel[] values()
    {
        return (DeviceSupportLevel[])$VALUES.clone();
    }

    static 
    {
        FULLY_SUPPORTED = new DeviceSupportLevel("FULLY_SUPPORTED", 0);
        AUDIO_ONLY = new DeviceSupportLevel("AUDIO_ONLY", 1);
        NOT_SUPPORTED = new DeviceSupportLevel("NOT_SUPPORTED", 2);
        NOT_FUNCTIONAL = new DeviceSupportLevel("NOT_FUNCTIONAL", 3);
        $VALUES = (new DeviceSupportLevel[] {
            FULLY_SUPPORTED, AUDIO_ONLY, NOT_SUPPORTED, NOT_FUNCTIONAL
        });
    }
}
