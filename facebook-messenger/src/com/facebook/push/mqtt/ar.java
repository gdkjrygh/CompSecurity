// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


public final class ar extends Enum
{

    private static final ar $VALUES[];
    public static final ar ALWAYS;
    public static final ar APP_USE;
    public static final ar DEVICE_USE;

    private ar(String s, int i)
    {
        super(s, i);
    }

    public static ar valueOf(String s)
    {
        return (ar)Enum.valueOf(com/facebook/push/mqtt/ar, s);
    }

    public static ar[] values()
    {
        return (ar[])$VALUES.clone();
    }

    static 
    {
        APP_USE = new ar("APP_USE", 0);
        DEVICE_USE = new ar("DEVICE_USE", 1);
        ALWAYS = new ar("ALWAYS", 2);
        $VALUES = (new ar[] {
            APP_USE, DEVICE_USE, ALWAYS
        });
    }
}
