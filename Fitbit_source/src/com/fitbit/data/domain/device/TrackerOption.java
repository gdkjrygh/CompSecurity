// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;


public final class TrackerOption extends Enum
{

    private static final TrackerOption $VALUES[];
    public static final TrackerOption AUTO_LAP;
    public static final TrackerOption BONDED_PEER_ID;
    public static final TrackerOption BONDED_PEER_NAME;
    public static final TrackerOption CLOCK_FACE;
    public static final TrackerOption DISPLAY_ACTIVE_MINUTES;
    public static final TrackerOption DISPLAY_CALORIES;
    public static final TrackerOption DISPLAY_CHATTER;
    public static final TrackerOption DISPLAY_CLOCK;
    public static final TrackerOption DISPLAY_DISTANCE;
    public static final TrackerOption DISPLAY_ELEVATION;
    public static final TrackerOption DISPLAY_EMOTE;
    public static final TrackerOption DISPLAY_GREETING;
    public static final TrackerOption DISPLAY_HEART_RATE;
    public static final TrackerOption DISPLAY_STEPS;
    public static final TrackerOption ENABLE_ANCS;
    public static final TrackerOption ENABLE_SLEEP_ANNOTATIONS;
    public static final TrackerOption EXERCISES;
    public static final TrackerOption GREETING;
    public static final TrackerOption HEART_RATE_TRACKING;
    public static final TrackerOption ON_DOMINANT_HAND;
    public static final TrackerOption PRIMARY_GOAL;
    public static final TrackerOption SCREEN_ORDER;
    public static final TrackerOption TAP_GESTURE;
    public static final TrackerOption WATCH_CHECK;

    private TrackerOption(String s, int i)
    {
        super(s, i);
    }

    public static TrackerOption valueOf(String s)
    {
        return (TrackerOption)Enum.valueOf(com/fitbit/data/domain/device/TrackerOption, s);
    }

    public static TrackerOption[] values()
    {
        return (TrackerOption[])$VALUES.clone();
    }

    static 
    {
        DISPLAY_ACTIVE_MINUTES = new TrackerOption("DISPLAY_ACTIVE_MINUTES", 0);
        DISPLAY_CALORIES = new TrackerOption("DISPLAY_CALORIES", 1);
        DISPLAY_CHATTER = new TrackerOption("DISPLAY_CHATTER", 2);
        DISPLAY_CLOCK = new TrackerOption("DISPLAY_CLOCK", 3);
        DISPLAY_DISTANCE = new TrackerOption("DISPLAY_DISTANCE", 4);
        DISPLAY_ELEVATION = new TrackerOption("DISPLAY_ELEVATION", 5);
        DISPLAY_EMOTE = new TrackerOption("DISPLAY_EMOTE", 6);
        DISPLAY_GREETING = new TrackerOption("DISPLAY_GREETING", 7);
        DISPLAY_STEPS = new TrackerOption("DISPLAY_STEPS", 8);
        DISPLAY_HEART_RATE = new TrackerOption("DISPLAY_HEART_RATE", 9);
        ENABLE_ANCS = new TrackerOption("ENABLE_ANCS", 10);
        ENABLE_SLEEP_ANNOTATIONS = new TrackerOption("ENABLE_SLEEP_ANNOTATIONS", 11);
        GREETING = new TrackerOption("GREETING", 12);
        ON_DOMINANT_HAND = new TrackerOption("ON_DOMINANT_HAND", 13);
        PRIMARY_GOAL = new TrackerOption("PRIMARY_GOAL", 14);
        CLOCK_FACE = new TrackerOption("CLOCK_FACE", 15);
        SCREEN_ORDER = new TrackerOption("SCREEN_ORDER", 16);
        HEART_RATE_TRACKING = new TrackerOption("HEART_RATE_TRACKING", 17);
        EXERCISES = new TrackerOption("EXERCISES", 18);
        TAP_GESTURE = new TrackerOption("TAP_GESTURE", 19);
        BONDED_PEER_NAME = new TrackerOption("BONDED_PEER_NAME", 20);
        BONDED_PEER_ID = new TrackerOption("BONDED_PEER_ID", 21);
        WATCH_CHECK = new TrackerOption("WATCH_CHECK", 22);
        AUTO_LAP = new TrackerOption("AUTO_LAP", 23);
        $VALUES = (new TrackerOption[] {
            DISPLAY_ACTIVE_MINUTES, DISPLAY_CALORIES, DISPLAY_CHATTER, DISPLAY_CLOCK, DISPLAY_DISTANCE, DISPLAY_ELEVATION, DISPLAY_EMOTE, DISPLAY_GREETING, DISPLAY_STEPS, DISPLAY_HEART_RATE, 
            ENABLE_ANCS, ENABLE_SLEEP_ANNOTATIONS, GREETING, ON_DOMINANT_HAND, PRIMARY_GOAL, CLOCK_FACE, SCREEN_ORDER, HEART_RATE_TRACKING, EXERCISES, TAP_GESTURE, 
            BONDED_PEER_NAME, BONDED_PEER_ID, WATCH_CHECK, AUTO_LAP
        });
    }
}
