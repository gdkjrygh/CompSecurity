// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            TimeSeriesObject

public class CaloriesBurned extends TimeSeriesObject
{

    private static final long serialVersionUID = 0xe7ea2ec46c8f8976L;
    private Double value;

    public CaloriesBurned()
    {
    }

    public void a(double d1)
    {
        a(Double.valueOf(d1));
    }

    public void a(Double double1)
    {
        value = double1;
    }

    public double b()
    {
        return value.doubleValue();
    }

    public Double c()
    {
        return value;
    }

    public TimeSeriesObject.TimeSeriesResourceType d()
    {
        return TimeSeriesObject.TimeSeriesResourceType.CALORIES;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        super.initFromPublicApiJsonObject(jsonobject);
        a(Double.valueOf(com.fitbit.d.a.a(jsonobject, "value", 0.0D)));
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
