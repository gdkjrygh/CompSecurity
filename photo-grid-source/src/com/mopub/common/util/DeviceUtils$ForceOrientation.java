// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;


public final class a extends Enum
{

    public static final UNDEFINED DEVICE_ORIENTATION;
    public static final UNDEFINED FORCE_LANDSCAPE;
    public static final UNDEFINED FORCE_PORTRAIT;
    public static final UNDEFINED UNDEFINED;
    private static final UNDEFINED b[];
    private final String a;

    public static a getForceOrientation(String s)
    {
        a aa[] = values();
        int j = aa.length;
        for (int i = 0; i < j; i++)
        {
            a a1 = aa[i];
            if (a1.a.equalsIgnoreCase(s))
            {
                return a1;
            }
        }

        return UNDEFINED;
    }

    public static UNDEFINED valueOf(String s)
    {
        return (UNDEFINED)Enum.valueOf(com/mopub/common/util/DeviceUtils$ForceOrientation, s);
    }

    public static UNDEFINED[] values()
    {
        return (UNDEFINED[])b.clone();
    }

    static 
    {
        FORCE_PORTRAIT = new <init>("FORCE_PORTRAIT", 0, "portrait");
        FORCE_LANDSCAPE = new <init>("FORCE_LANDSCAPE", 1, "landscape");
        DEVICE_ORIENTATION = new <init>("DEVICE_ORIENTATION", 2, "device");
        UNDEFINED = new <init>("UNDEFINED", 3, "");
        b = (new b[] {
            FORCE_PORTRAIT, FORCE_LANDSCAPE, DEVICE_ORIENTATION, UNDEFINED
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }
}
