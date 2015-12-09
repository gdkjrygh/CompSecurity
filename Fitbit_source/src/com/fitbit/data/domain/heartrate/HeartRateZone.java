// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.heartrate;

import com.fitbit.d.b;
import com.fitbit.data.domain.Entity;
import org.json.JSONException;
import org.json.JSONObject;

public class HeartRateZone extends Entity
    implements b
{
    public static final class HeartRateZoneType extends Enum
    {

        private static final HeartRateZoneType $VALUES[];
        public static final HeartRateZoneType CARDIO;
        public static final HeartRateZoneType CUSTOM_ZONE;
        public static final HeartRateZoneType FAT_BURN;
        public static final HeartRateZoneType OUT_OF_RANGE;
        public static final HeartRateZoneType PEAK;
        public static final HeartRateZoneType UNKNOWN;

        public static HeartRateZoneType valueOf(String s)
        {
            return (HeartRateZoneType)Enum.valueOf(com/fitbit/data/domain/heartrate/HeartRateZone$HeartRateZoneType, s);
        }

        public static HeartRateZoneType[] values()
        {
            return (HeartRateZoneType[])$VALUES.clone();
        }

        static 
        {
            OUT_OF_RANGE = new HeartRateZoneType("OUT_OF_RANGE", 0);
            FAT_BURN = new HeartRateZoneType("FAT_BURN", 1);
            CARDIO = new HeartRateZoneType("CARDIO", 2);
            PEAK = new HeartRateZoneType("PEAK", 3);
            CUSTOM_ZONE = new HeartRateZoneType("CUSTOM_ZONE", 4);
            UNKNOWN = new HeartRateZoneType("UNKNOWN", 5);
            $VALUES = (new HeartRateZoneType[] {
                OUT_OF_RANGE, FAT_BURN, CARDIO, PEAK, CUSTOM_ZONE, UNKNOWN
            });
        }

        private HeartRateZoneType(String s, int i)
        {
            super(s, i);
        }
    }


    private double caloriesOut;
    private int highValue;
    private int lowValue;
    private String name;
    private Long summaryId;
    private int timeInZone;
    private HeartRateZoneType type;

    public HeartRateZone()
    {
    }

    public int a()
    {
        return highValue;
    }

    public void a(double d1)
    {
        caloriesOut = d1;
    }

    public void a(int i)
    {
        highValue = i;
    }

    public void a(HeartRateZoneType heartratezonetype)
    {
        type = heartratezonetype;
    }

    public void a(Long long1)
    {
        summaryId = long1;
    }

    public void a(String s)
    {
        name = s;
    }

    public int b()
    {
        return lowValue;
    }

    public void b(int i)
    {
        lowValue = i;
    }

    public boolean b(double d1)
    {
        return d1 <= (double)highValue && d1 >= (double)lowValue;
    }

    public HeartRateZoneType c()
    {
        return type;
    }

    public void c(int i)
    {
        timeInZone = i;
    }

    public Long d()
    {
        return summaryId;
    }

    public int e()
    {
        return timeInZone;
    }

    public String f()
    {
        return name;
    }

    public double g()
    {
        return caloriesOut;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        a(jsonobject.optInt("max"));
        b(jsonobject.optInt("min"));
        c(jsonobject.optInt("minutes"));
        a(jsonobject.optString("name"));
        a(jsonobject.optDouble("caloriesOut", 0.0D));
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
