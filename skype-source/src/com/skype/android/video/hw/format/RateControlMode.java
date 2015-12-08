// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.format;


public final class RateControlMode extends Enum
{

    private static final RateControlMode $VALUES[];
    public static final RateControlMode AUTO;
    public static final RateControlMode GENERIC;
    public static final RateControlMode INTERNAL;
    public static final RateControlMode SLIQ;

    private RateControlMode(String s, int i)
    {
        super(s, i);
    }

    public static RateControlMode valueOf(String s)
    {
        return (RateControlMode)Enum.valueOf(com/skype/android/video/hw/format/RateControlMode, s);
    }

    public static RateControlMode[] values()
    {
        return (RateControlMode[])$VALUES.clone();
    }

    static 
    {
        AUTO = new RateControlMode("AUTO", 0);
        INTERNAL = new RateControlMode("INTERNAL", 1);
        GENERIC = new RateControlMode("GENERIC", 2);
        SLIQ = new RateControlMode("SLIQ", 3);
        $VALUES = (new RateControlMode[] {
            AUTO, INTERNAL, GENERIC, SLIQ
        });
    }
}
