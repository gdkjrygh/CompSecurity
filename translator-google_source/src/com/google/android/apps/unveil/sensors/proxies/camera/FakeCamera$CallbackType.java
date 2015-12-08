// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;


final class  extends Enum
{

    private static final WITH_BUFFER $VALUES[];
    public static final WITH_BUFFER ONESHOT;
    public static final WITH_BUFFER REPEATING;
    public static final WITH_BUFFER WITH_BUFFER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/unveil/sensors/proxies/camera/FakeCamera$CallbackType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ONESHOT = new <init>("ONESHOT", 0);
        REPEATING = new <init>("REPEATING", 1);
        WITH_BUFFER = new <init>("WITH_BUFFER", 2);
        $VALUES = (new .VALUES[] {
            ONESHOT, REPEATING, WITH_BUFFER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
