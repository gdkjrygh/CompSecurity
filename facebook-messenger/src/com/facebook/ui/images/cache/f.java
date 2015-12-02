// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.cache;


public final class f extends Enum
{

    private static final f $VALUES[];
    public static final f MaxScaleNonPowerOfTwo;
    public static final f MemoryUsagePowerOfTwo;
    public static final f MinScaleNonPowerOfTwo;

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/facebook/ui/images/cache/f, s);
    }

    public static f[] values()
    {
        return (f[])$VALUES.clone();
    }

    static 
    {
        MemoryUsagePowerOfTwo = new f("MemoryUsagePowerOfTwo", 0);
        MaxScaleNonPowerOfTwo = new f("MaxScaleNonPowerOfTwo", 1);
        MinScaleNonPowerOfTwo = new f("MinScaleNonPowerOfTwo", 2);
        $VALUES = (new f[] {
            MemoryUsagePowerOfTwo, MaxScaleNonPowerOfTwo, MinScaleNonPowerOfTwo
        });
    }
}
