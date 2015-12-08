// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.heartrate;

import com.fitbit.d.a;
import com.fitbit.data.domain.TimeSeriesObject;
import org.json.JSONException;
import org.json.JSONObject;

public class RestingHeartRate extends TimeSeriesObject
{

    private static final long serialVersionUID = 0xb73833efbd75a533L;
    private Double value;

    public RestingHeartRate()
    {
    }

    public void a(double d1)
    {
        value = Double.valueOf(d1);
    }

    public double b()
    {
        return value.doubleValue();
    }

    public com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType d()
    {
        return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.RESTING_HEART_RATE;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        super.initFromPublicApiJsonObject(jsonobject);
        value = Double.valueOf(com.fitbit.d.a.a(jsonobject, "value", 0.0D));
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
