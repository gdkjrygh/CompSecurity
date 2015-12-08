// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import com.fitbit.data.domain.s;
import com.fitbit.util.w;

public final class DeviceFeature extends Enum
    implements s
{

    private static final DeviceFeature $VALUES[];
    public static final DeviceFeature ACTIVE_MINUTES;
    public static final DeviceFeature ALARMS;
    public static final DeviceFeature AUTO_LAP;
    public static final DeviceFeature BIKE_TRACKING;
    public static final DeviceFeature CLOCK_FACE;
    public static final DeviceFeature EXERCISES;
    public static final DeviceFeature FLOORS;
    public static final DeviceFeature GREETING;
    public static final DeviceFeature HEART_RATE;
    public static final DeviceFeature LIVE_DATA;
    public static final DeviceFeature MUSIC_CONTROL;
    public static final DeviceFeature NFC;
    public static final DeviceFeature NOTIFICATIONS;
    public static final DeviceFeature PRIMARY_GOAL;
    public static final DeviceFeature QUICK_VIEW;
    public static final DeviceFeature SCALE;
    public static final DeviceFeature SLEEP;
    public static final DeviceFeature STATS_ORDERING;
    public static final DeviceFeature STEPS;
    public static final DeviceFeature TAP_GESTURE;
    public static final DeviceFeature UNKNOWN;
    public static final DeviceFeature WIRELESS_SYNC;
    public static final DeviceFeature WRIST_PLACEMENT;

    private DeviceFeature(String s1, int i)
    {
        super(s1, i);
    }

    public static DeviceFeature getSafeChallengeStatusFromString(String s1)
    {
        DeviceFeature devicefeature = UNKNOWN;
        try
        {
            s1 = (DeviceFeature)w.a(s1, com/fitbit/data/domain/device/DeviceFeature);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return devicefeature;
        }
        return s1;
    }

    public static DeviceFeature valueOf(String s1)
    {
        return (DeviceFeature)Enum.valueOf(com/fitbit/data/domain/device/DeviceFeature, s1);
    }

    public static DeviceFeature[] values()
    {
        return (DeviceFeature[])$VALUES.clone();
    }

    public String getSerializableName()
    {
        return name();
    }

    static 
    {
        WIRELESS_SYNC = new DeviceFeature("WIRELESS_SYNC", 0);
        FLOORS = new DeviceFeature("FLOORS", 1);
        SLEEP = new DeviceFeature("SLEEP", 2);
        ALARMS = new DeviceFeature("ALARMS", 3);
        SCALE = new DeviceFeature("SCALE", 4);
        NFC = new DeviceFeature("NFC", 5);
        LIVE_DATA = new DeviceFeature("LIVE_DATA", 6);
        CLOCK_FACE = new DeviceFeature("CLOCK_FACE", 7);
        STATS_ORDERING = new DeviceFeature("STATS_ORDERING", 8);
        PRIMARY_GOAL = new DeviceFeature("PRIMARY_GOAL", 9);
        WRIST_PLACEMENT = new DeviceFeature("WRIST_PLACEMENT", 10);
        GREETING = new DeviceFeature("GREETING", 11);
        NOTIFICATIONS = new DeviceFeature("NOTIFICATIONS", 12);
        STEPS = new DeviceFeature("STEPS", 13);
        HEART_RATE = new DeviceFeature("HEART_RATE", 14);
        ACTIVE_MINUTES = new DeviceFeature("ACTIVE_MINUTES", 15);
        EXERCISES = new DeviceFeature("EXERCISES", 16);
        TAP_GESTURE = new DeviceFeature("TAP_GESTURE", 17);
        MUSIC_CONTROL = new DeviceFeature("MUSIC_CONTROL", 18);
        BIKE_TRACKING = new DeviceFeature("BIKE_TRACKING", 19);
        QUICK_VIEW = new DeviceFeature("QUICK_VIEW", 20);
        AUTO_LAP = new DeviceFeature("AUTO_LAP", 21);
        UNKNOWN = new DeviceFeature("UNKNOWN", 22);
        $VALUES = (new DeviceFeature[] {
            WIRELESS_SYNC, FLOORS, SLEEP, ALARMS, SCALE, NFC, LIVE_DATA, CLOCK_FACE, STATS_ORDERING, PRIMARY_GOAL, 
            WRIST_PLACEMENT, GREETING, NOTIFICATIONS, STEPS, HEART_RATE, ACTIVE_MINUTES, EXERCISES, TAP_GESTURE, MUSIC_CONTROL, BIKE_TRACKING, 
            QUICK_VIEW, AUTO_LAP, UNKNOWN
        });
    }
}
