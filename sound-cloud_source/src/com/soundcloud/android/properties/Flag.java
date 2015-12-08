// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.properties;

import java.util.EnumSet;
import java.util.Locale;

public final class Flag extends Enum
{

    private static final Flag $VALUES[];
    public static final Flag ACTIVITIES_REFACTOR;
    public static final Flag APPBOY;
    public static final Flag COLLECTIONS;
    public static final Flag DAILY_POLICY_UPDATES;
    public static final Flag DISCOVERY;
    public static final Flag DISCOVERY_CHARTS;
    public static final Flag DISCOVERY_RECOMMENDATIONS;
    public static final Flag EVENTLOGGER_AUDIO_V1;
    public static final Flag FEATURE_PUBLISH_PLAY_EVENTS_TO_TPUB;
    public static final Flag FOLLOW_USER_SEARCH;
    public static final Flag KILL_CONCURRENT_STREAMING;
    public static final Flag NEW_STREAM;
    public static final Flag OFFLINE_SYNC;
    public static final Flag PAYMENTS_TEST;
    public static final Flag PLAY_RELATED_TRACKS;
    public static final Flag PROFILE_API_MOBILE;
    public static final Flag STATIONS_HOME;
    public static final Flag STATIONS_SOFT_LAUNCH;
    public static final Flag TEST_FEATURE;
    public static final Flag VIDEO_ADS;
    private final boolean value;

    private Flag(String s, int i, boolean flag)
    {
        super(s, i);
        value = flag;
    }

    public static EnumSet realFeatures()
    {
        return EnumSet.complementOf(EnumSet.of(TEST_FEATURE, PAYMENTS_TEST));
    }

    public static Flag valueOf(String s)
    {
        return (Flag)Enum.valueOf(com/soundcloud/android/properties/Flag, s);
    }

    public static Flag[] values()
    {
        return (Flag[])$VALUES.clone();
    }

    public final String getName()
    {
        return name().toLowerCase(Locale.US);
    }

    public final boolean getValue()
    {
        return value;
    }

    static 
    {
        TEST_FEATURE = new Flag("TEST_FEATURE", 0, true);
        PAYMENTS_TEST = new Flag("PAYMENTS_TEST", 1, false);
        OFFLINE_SYNC = new Flag("OFFLINE_SYNC", 2, false);
        FOLLOW_USER_SEARCH = new Flag("FOLLOW_USER_SEARCH", 3, false);
        PLAY_RELATED_TRACKS = new Flag("PLAY_RELATED_TRACKS", 4, true);
        STATIONS_SOFT_LAUNCH = new Flag("STATIONS_SOFT_LAUNCH", 5, false);
        STATIONS_HOME = new Flag("STATIONS_HOME", 6, false);
        EVENTLOGGER_AUDIO_V1 = new Flag("EVENTLOGGER_AUDIO_V1", 7, false);
        KILL_CONCURRENT_STREAMING = new Flag("KILL_CONCURRENT_STREAMING", 8, false);
        FEATURE_PUBLISH_PLAY_EVENTS_TO_TPUB = new Flag("FEATURE_PUBLISH_PLAY_EVENTS_TO_TPUB", 9, false);
        COLLECTIONS = new Flag("COLLECTIONS", 10, false);
        APPBOY = new Flag("APPBOY", 11, true);
        DAILY_POLICY_UPDATES = new Flag("DAILY_POLICY_UPDATES", 12, false);
        DISCOVERY = new Flag("DISCOVERY", 13, false);
        DISCOVERY_RECOMMENDATIONS = new Flag("DISCOVERY_RECOMMENDATIONS", 14, false);
        DISCOVERY_CHARTS = new Flag("DISCOVERY_CHARTS", 15, false);
        PROFILE_API_MOBILE = new Flag("PROFILE_API_MOBILE", 16, true);
        NEW_STREAM = new Flag("NEW_STREAM", 17, false);
        ACTIVITIES_REFACTOR = new Flag("ACTIVITIES_REFACTOR", 18, false);
        VIDEO_ADS = new Flag("VIDEO_ADS", 19, false);
        $VALUES = (new Flag[] {
            TEST_FEATURE, PAYMENTS_TEST, OFFLINE_SYNC, FOLLOW_USER_SEARCH, PLAY_RELATED_TRACKS, STATIONS_SOFT_LAUNCH, STATIONS_HOME, EVENTLOGGER_AUDIO_V1, KILL_CONCURRENT_STREAMING, FEATURE_PUBLISH_PLAY_EVENTS_TO_TPUB, 
            COLLECTIONS, APPBOY, DAILY_POLICY_UPDATES, DISCOVERY, DISCOVERY_RECOMMENDATIONS, DISCOVERY_CHARTS, PROFILE_API_MOBILE, NEW_STREAM, ACTIVITIES_REFACTOR, VIDEO_ADS
        });
    }
}
