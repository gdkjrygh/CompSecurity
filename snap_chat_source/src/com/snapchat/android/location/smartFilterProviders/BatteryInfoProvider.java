// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.location.smartFilterProviders;


public interface BatteryInfoProvider
{
    public static final class BatteryLevel extends Enum
    {

        private static final BatteryLevel $VALUES[];
        public static final BatteryLevel FULL_BATTERY;
        public static final BatteryLevel LOW_BATTERY;
        public static final BatteryLevel NO_BATTERY_FILTER;
        private int a;

        public static BatteryLevel valueOf(String s)
        {
            return (BatteryLevel)Enum.valueOf(com/snapchat/android/location/smartFilterProviders/BatteryInfoProvider$BatteryLevel, s);
        }

        public static BatteryLevel[] values()
        {
            return (BatteryLevel[])$VALUES.clone();
        }

        public final int getStatus()
        {
            return a;
        }

        static 
        {
            NO_BATTERY_FILTER = new BatteryLevel("NO_BATTERY_FILTER", 0, 0);
            LOW_BATTERY = new BatteryLevel("LOW_BATTERY", 1, 1);
            FULL_BATTERY = new BatteryLevel("FULL_BATTERY", 2, 2);
            $VALUES = (new BatteryLevel[] {
                NO_BATTERY_FILTER, LOW_BATTERY, FULL_BATTERY
            });
        }

        private BatteryLevel(String s, int i, int j)
        {
            super(s, i);
            a = j;
        }
    }


    public abstract BatteryLevel a();
}
