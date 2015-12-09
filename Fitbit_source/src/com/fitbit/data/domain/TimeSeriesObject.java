// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.activity.ui.charts.views.d;
import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.util.o;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity, a

public abstract class TimeSeriesObject extends Entity
    implements d, b, Serializable
{
    public static final class TimeSeriesResourceType extends Enum
        implements com.fitbit.data.domain.a
    {

        private static final TimeSeriesResourceType $VALUES[];
        public static final TimeSeriesResourceType AWAKENINGS_COUNT;
        public static final TimeSeriesResourceType BODY_FAT;
        public static final TimeSeriesResourceType BODY_WEIGHT;
        public static final TimeSeriesResourceType CALORIES;
        public static final TimeSeriesResourceType CALORIES_IN;
        public static final TimeSeriesResourceType CALORIES_INTRADAY;
        public static final TimeSeriesResourceType DISTANCE;
        public static final TimeSeriesResourceType DISTANCE_INTRADAY;
        public static final TimeSeriesResourceType FLOORS;
        public static final TimeSeriesResourceType FLOORS_INTRADAY;
        public static final TimeSeriesResourceType HEART_RATE_INTRADAY;
        public static final TimeSeriesResourceType MINUTES_ASLEEP;
        public static final TimeSeriesResourceType MINUTES_ASLEEP_INTRADAY;
        public static final TimeSeriesResourceType MINUTES_FAIRLY_ACTIVE;
        public static final TimeSeriesResourceType MINUTES_FAIRLY_ACTIVE_INTRADAY;
        public static final TimeSeriesResourceType MINUTES_VERY_ACTIVE;
        public static final TimeSeriesResourceType MINUTES_VERY_ACTIVE_INTRADAY;
        public static final TimeSeriesResourceType RESTING_HEART_RATE;
        public static final TimeSeriesResourceType STEPS;
        public static final TimeSeriesResourceType STEPS_INTRADAY;
        public static final TimeSeriesResourceType UKNOWN;
        public static final TimeSeriesResourceType WATER;
        public static final TimeSeriesResourceType WATER_INTRADAY;
        private final int code;
        private boolean intraday;

        public static TimeSeriesResourceType valueOf(String s)
        {
            return (TimeSeriesResourceType)Enum.valueOf(com/fitbit/data/domain/TimeSeriesObject$TimeSeriesResourceType, s);
        }

        public static TimeSeriesResourceType[] values()
        {
            return (TimeSeriesResourceType[])$VALUES.clone();
        }

        public int getCode()
        {
            return code;
        }

        public boolean isIntraday()
        {
            return intraday;
        }

        static 
        {
            UKNOWN = new TimeSeriesResourceType("UKNOWN", 0, 0);
            BODY_WEIGHT = new TimeSeriesResourceType("BODY_WEIGHT", 1, 1);
            WATER = new TimeSeriesResourceType("WATER", 2, 2);
            BODY_FAT = new TimeSeriesResourceType("BODY_FAT", 3, 3);
            STEPS = new TimeSeriesResourceType("STEPS", 4, 4);
            CALORIES = new TimeSeriesResourceType("CALORIES", 5, 5);
            FLOORS = new TimeSeriesResourceType("FLOORS", 6, 6);
            CALORIES_IN = new TimeSeriesResourceType("CALORIES_IN", 7, 7);
            DISTANCE = new TimeSeriesResourceType("DISTANCE", 8, 8);
            MINUTES_ASLEEP = new TimeSeriesResourceType("MINUTES_ASLEEP", 9, 9);
            AWAKENINGS_COUNT = new TimeSeriesResourceType("AWAKENINGS_COUNT", 10, 10);
            STEPS_INTRADAY = new TimeSeriesResourceType("STEPS_INTRADAY", 11, 11, true);
            CALORIES_INTRADAY = new TimeSeriesResourceType("CALORIES_INTRADAY", 12, 12, true);
            FLOORS_INTRADAY = new TimeSeriesResourceType("FLOORS_INTRADAY", 13, 13, true);
            MINUTES_ASLEEP_INTRADAY = new TimeSeriesResourceType("MINUTES_ASLEEP_INTRADAY", 14, 14, true);
            DISTANCE_INTRADAY = new TimeSeriesResourceType("DISTANCE_INTRADAY", 15, 15, true);
            MINUTES_VERY_ACTIVE = new TimeSeriesResourceType("MINUTES_VERY_ACTIVE", 16, 16);
            MINUTES_VERY_ACTIVE_INTRADAY = new TimeSeriesResourceType("MINUTES_VERY_ACTIVE_INTRADAY", 17, 17, true);
            HEART_RATE_INTRADAY = new TimeSeriesResourceType("HEART_RATE_INTRADAY", 18, 18, true);
            RESTING_HEART_RATE = new TimeSeriesResourceType("RESTING_HEART_RATE", 19, 19);
            MINUTES_FAIRLY_ACTIVE = new TimeSeriesResourceType("MINUTES_FAIRLY_ACTIVE", 20, 20);
            MINUTES_FAIRLY_ACTIVE_INTRADAY = new TimeSeriesResourceType("MINUTES_FAIRLY_ACTIVE_INTRADAY", 21, 21, true);
            WATER_INTRADAY = new TimeSeriesResourceType("WATER_INTRADAY", 22, 22, true);
            $VALUES = (new TimeSeriesResourceType[] {
                UKNOWN, BODY_WEIGHT, WATER, BODY_FAT, STEPS, CALORIES, FLOORS, CALORIES_IN, DISTANCE, MINUTES_ASLEEP, 
                AWAKENINGS_COUNT, STEPS_INTRADAY, CALORIES_INTRADAY, FLOORS_INTRADAY, MINUTES_ASLEEP_INTRADAY, DISTANCE_INTRADAY, MINUTES_VERY_ACTIVE, MINUTES_VERY_ACTIVE_INTRADAY, HEART_RATE_INTRADAY, RESTING_HEART_RATE, 
                MINUTES_FAIRLY_ACTIVE, MINUTES_FAIRLY_ACTIVE_INTRADAY, WATER_INTRADAY
            });
        }

        private TimeSeriesResourceType(String s, int i, int j)
        {
            super(s, i);
            intraday = false;
            code = j;
        }

        private TimeSeriesResourceType(String s, int i, int j, boolean flag)
        {
            super(s, i);
            intraday = false;
            code = j;
            intraday = flag;
        }
    }


    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    private Date dateTime;
    private long foreignId;
    private int level;

    public TimeSeriesObject()
    {
    }

    public Date a()
    {
        return dateTime;
    }

    public abstract void a(double d1);

    public void a(int i)
    {
        level = i;
    }

    public void a(long l)
    {
        foreignId = l;
    }

    public void a(Date date)
    {
        dateTime = date;
    }

    public abstract double b();

    public abstract TimeSeriesResourceType d();

    public int e()
    {
        return level;
    }

    public boolean equals(Object obj)
    {
        while (obj == null || !obj.getClass().equals(getClass()) || Math.abs(a().getTime() - ((TimeSeriesObject)obj).a().getTime()) >= 0x2932e00L) 
        {
            return false;
        }
        return true;
    }

    public long f()
    {
        return foreignId;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        Date date = com.fitbit.d.a.e(jsonobject, "dateTime");
        if (date == null)
        {
            throw new JSONException((new StringBuilder()).append("DateTime value of TimeSeriesObject cannot be null. Received json: ").append(jsonobject).toString());
        }
        jsonobject = date;
        if (!d().isIntraday())
        {
            jsonobject = o.c();
            jsonobject.setTime(date);
            o.b(jsonobject);
            jsonobject = jsonobject.getTime();
        }
        a(jsonobject);
        setEntityStatus(Entity.EntityStatus.SYNCED);
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" value: ").append(b());
        stringbuilder.append(" dateTime: ").append(a());
        stringbuilder.append(" level: ").append(e());
        stringbuilder.append(" foreignId: ").append(f());
        return stringbuilder.toString();
    }
}
