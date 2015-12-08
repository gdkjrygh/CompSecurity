// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.multipledevice;


public final class MultipleDeviceMode extends Enum
{

    public static final MultipleDeviceMode a;
    public static final MultipleDeviceMode b;
    public static final MultipleDeviceMode c;
    public static final MultipleDeviceMode d;
    private static final MultipleDeviceMode e[];

    private MultipleDeviceMode(String s, int i)
    {
        super(s, i);
    }

    public static MultipleDeviceMode valueOf(String s)
    {
        return (MultipleDeviceMode)Enum.valueOf(com/fitbit/multipledevice/MultipleDeviceMode, s);
    }

    public static MultipleDeviceMode[] values()
    {
        return (MultipleDeviceMode[])e.clone();
    }

    public boolean a()
    {
        return this == b || this == c;
    }

    public boolean b()
    {
        return this == b || this == d;
    }

    static 
    {
        a = new MultipleDeviceMode("NONE", 0);
        b = new MultipleDeviceMode("MIXED", 1);
        c = new MultipleDeviceMode("BLUETOOTH_ONLY", 2);
        d = new MultipleDeviceMode("PEDOMETER_ONLY", 3);
        e = (new MultipleDeviceMode[] {
            a, b, c, d
        });
    }
}
