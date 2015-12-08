// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.services;

import java.util.List;

public interface IGeofenceTransitionsService
{

    public static final long FIVE_SECONDS_MILLS = 5000L;
    public static final float LARGE_RANGE_DEFAULT = 2500F;
    public static final float LARGE_RANGE_IN_VEHICLE = 3000F;
    public static final float LARGE_RANGE_ON_BICYCLE = 1500F;
    public static final float LARGE_RANGE_ON_FOOT = 800F;
    public static final long MAX_SERVICE_LIVE_TIME = 60000L;
    public static final float MAX_VELOCITY_IN_VEHICLE_IN_METER = 26.82F;
    public static final float MAX_VELOCITY_ON_BICYCLE_IN_METER = 6.71F;
    public static final float MAX_VELOCITY_ON_FOOT_IN_METER = 1.39F;
    public static final float MEDIUM_RANGE_DEFAULT = 1500F;
    public static final float MEDIUM_RANGE_IN_VEHICLE = 1000F;
    public static final float MEDIUM_RANGE_ON_BICYCLE = 400F;
    public static final float MEDIUM_RANGE_ON_FOOT = 100F;
    public static final int MIN_ACCEPTABLE_CONFIDENCE = 50;
    public static final long ONE_MINUTE_MILLS = 60000L;
    public static final int RADIUS_USE_HIGHER_ACCURACY_DEFAULT = 100;
    public static final int RADIUS_USE_HIGHER_ACCURACY_IN_VEHICLE = 200;
    public static final int RADIUS_USE_HIGHER_ACCURACY_ON_BICYCLE = 50;
    public static final int RADIUS_USE_HIGHER_ACCURACY_ON_FOOT = 50;
    public static final float SMALL_RANGE_DEFAULT = 700F;
    public static final float SMALL_RANGE_IN_VEHICLE = 100F;
    public static final float SMALL_RANGE_ON_BICYCLE = 50F;
    public static final float SMALL_RANGE_ON_FOOT = 20F;
    public static final long TEN_SECONDS_MILLS = 10000L;
    public static final long THIRTY_SECONDS_MILLS = 30000L;
    public static final long THREE_SECONDS_MILLS = 3000L;
    public static final long TWENTY_SECONDS_MILLS = 20000L;
    public static final long TWO_MINUTES_MILLS = 0x1d4c0L;

    public abstract void handleEntry(List list);

    public abstract void handleExit(List list);
}
