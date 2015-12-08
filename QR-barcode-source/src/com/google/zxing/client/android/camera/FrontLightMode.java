// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.camera;

import android.content.SharedPreferences;

public final class FrontLightMode extends Enum
{

    public static final FrontLightMode AUTO;
    private static final FrontLightMode ENUM$VALUES[];
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
        FrontLightMode afrontlightmode[] = ENUM$VALUES;
        int i = afrontlightmode.length;
        FrontLightMode afrontlightmode1[] = new FrontLightMode[i];
        System.arraycopy(afrontlightmode, 0, afrontlightmode1, 0, i);
        return afrontlightmode1;
    }

    static 
    {
        ON = new FrontLightMode("ON", 0);
        AUTO = new FrontLightMode("AUTO", 1);
        OFF = new FrontLightMode("OFF", 2);
        ENUM$VALUES = (new FrontLightMode[] {
            ON, AUTO, OFF
        });
    }
}
