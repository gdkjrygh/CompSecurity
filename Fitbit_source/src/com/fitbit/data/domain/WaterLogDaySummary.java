// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import com.fitbit.water.Water;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            TimeSeriesObject

public class WaterLogDaySummary extends TimeSeriesObject
{

    private static final long serialVersionUID = 0x4d22b00e0c2719e2L;
    private Water value;

    public WaterLogDaySummary()
    {
    }

    public void a(double d1)
    {
        value = new Water(d1, WaterLogEntry.WaterUnits.ML);
    }

    public void a(Water water)
    {
        value = water;
    }

    public double b()
    {
        return value.a(WaterLogEntry.WaterUnits.ML).b();
    }

    public Water c()
    {
        return value;
    }

    public TimeSeriesObject.TimeSeriesResourceType d()
    {
        return TimeSeriesObject.TimeSeriesResourceType.WATER;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        super.initFromPublicApiJsonObject(jsonobject);
        a(new Water(com.fitbit.d.a.a(jsonobject, "value", 0.0D), WaterLogEntry.WaterUnits.ML));
    }
}
