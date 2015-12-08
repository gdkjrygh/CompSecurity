// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import java.util.ArrayList;
import java.util.Arrays;

public final class TrackerHeartRateTrackingType extends Enum
{

    private static final TrackerHeartRateTrackingType $VALUES[];
    public static final TrackerHeartRateTrackingType AUTO;
    public static final TrackerHeartRateTrackingType OFF;
    public static final TrackerHeartRateTrackingType ON;
    private static final String TAG = "TrackerHeartRateTrackingType";
    public static final TrackerHeartRateTrackingType UNKNOWN;
    private final String name;
    private final int nameResId;

    private TrackerHeartRateTrackingType(String s, int i, String s1, int j)
    {
        super(s, i);
        name = s1;
        nameResId = j;
    }

    public static TrackerHeartRateTrackingType[] getAllTypes()
    {
        ArrayList arraylist = new ArrayList(Arrays.asList(values()));
        arraylist.remove(UNKNOWN);
        TrackerHeartRateTrackingType atrackerheartratetrackingtype[] = new TrackerHeartRateTrackingType[arraylist.size()];
        arraylist.toArray(atrackerheartratetrackingtype);
        return atrackerheartratetrackingtype;
    }

    public static TrackerHeartRateTrackingType parse(String s)
    {
        TrackerHeartRateTrackingType atrackerheartratetrackingtype[] = values();
        int j = atrackerheartratetrackingtype.length;
        for (int i = 0; i < j; i++)
        {
            TrackerHeartRateTrackingType trackerheartratetrackingtype = atrackerheartratetrackingtype[i];
            if (trackerheartratetrackingtype.name.equalsIgnoreCase(s))
            {
                return trackerheartratetrackingtype;
            }
        }

        return UNKNOWN;
    }

    public static TrackerHeartRateTrackingType safeRestoreFromString(String s)
    {
        TrackerHeartRateTrackingType trackerheartratetrackingtype = UNKNOWN;
        TrackerHeartRateTrackingType trackerheartratetrackingtype1 = valueOf(s);
        trackerheartratetrackingtype = trackerheartratetrackingtype1;
_L2:
        TrackerHeartRateTrackingType trackerheartratetrackingtype2 = trackerheartratetrackingtype;
        if (UNKNOWN == trackerheartratetrackingtype)
        {
            trackerheartratetrackingtype2 = parse(s);
        }
        return trackerheartratetrackingtype2;
        Exception exception;
        exception;
        a.a("TrackerHeartRateTrackingType", "Probably migration issue: %s", exception, new Object[] {
            String.valueOf(exception)
        });
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static TrackerHeartRateTrackingType valueOf(String s)
    {
        return (TrackerHeartRateTrackingType)Enum.valueOf(com/fitbit/data/domain/device/TrackerHeartRateTrackingType, s);
    }

    public static TrackerHeartRateTrackingType[] values()
    {
        return (TrackerHeartRateTrackingType[])$VALUES.clone();
    }

    public String getLocalizedName()
    {
        if (nameResId > 0)
        {
            return FitBitApplication.a().getString(nameResId);
        } else
        {
            return "";
        }
    }

    public String getName()
    {
        return name;
    }

    static 
    {
        ON = new TrackerHeartRateTrackingType("ON", 0, "ON", 0x7f08054f);
        OFF = new TrackerHeartRateTrackingType("OFF", 1, "OFF", 0x7f08054e);
        AUTO = new TrackerHeartRateTrackingType("AUTO", 2, "AUTO", 0x7f08054d);
        UNKNOWN = new TrackerHeartRateTrackingType("UNKNOWN", 3, "", 0);
        $VALUES = (new TrackerHeartRateTrackingType[] {
            ON, OFF, AUTO, UNKNOWN
        });
    }
}
