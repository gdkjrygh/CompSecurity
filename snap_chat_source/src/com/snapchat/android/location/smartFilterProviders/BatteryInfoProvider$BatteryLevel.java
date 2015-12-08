// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.location.smartFilterProviders;


// Referenced classes of package com.snapchat.android.location.smartFilterProviders:
//            BatteryInfoProvider

public static final class a extends Enum
{

    private static final FULL_BATTERY $VALUES[];
    public static final FULL_BATTERY FULL_BATTERY;
    public static final FULL_BATTERY LOW_BATTERY;
    public static final FULL_BATTERY NO_BATTERY_FILTER;
    private int a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/snapchat/android/location/smartFilterProviders/BatteryInfoProvider$BatteryLevel, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public final int getStatus()
    {
        return a;
    }

    static 
    {
        NO_BATTERY_FILTER = new <init>("NO_BATTERY_FILTER", 0, 0);
        LOW_BATTERY = new <init>("LOW_BATTERY", 1, 1);
        FULL_BATTERY = new <init>("FULL_BATTERY", 2, 2);
        $VALUES = (new .VALUES[] {
            NO_BATTERY_FILTER, LOW_BATTERY, FULL_BATTERY
        });
    }

    private Y(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }
}
