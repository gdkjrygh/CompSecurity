// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.camera;

import android.content.SharedPreferences;

public final class FrontLightMode extends Enum
{

    private static final FrontLightMode $VALUES[];
    public static final FrontLightMode AUTO;
    public static final FrontLightMode OFF;
    public static final FrontLightMode ON;

    private FrontLightMode(String s, int i)
    {
        super(s, i);
    }

    private static FrontLightMode parse(String s)
    {
        if (s == null)
        {
            return OFF;
        } else
        {
            return valueOf(s);
        }
    }

    public static FrontLightMode readPref(SharedPreferences sharedpreferences)
    {
        return parse(sharedpreferences.getString("preferences_front_light_mode", null));
    }

    public static FrontLightMode valueOf(String s)
    {
        return (FrontLightMode)Enum.valueOf(com/google/zxing/client/android/camera/FrontLightMode, s);
    }

    public static FrontLightMode[] values()
    {
        return (FrontLightMode[])$VALUES.clone();
    }

    static 
    {
        ON = new FrontLightMode("ON", 0);
        AUTO = new FrontLightMode("AUTO", 1);
        OFF = new FrontLightMode("OFF", 2);
        $VALUES = (new FrontLightMode[] {
            ON, AUTO, OFF
        });
    }
}
