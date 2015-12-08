// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.heartrate;

import com.fitbit.data.domain.TimeSeriesObject;
import org.json.JSONException;
import org.json.JSONObject;

public class HeartRateIntraday extends TimeSeriesObject
{

    private static final long serialVersionUID = 0x47edf05d1681b4baL;
    private Double value;

    public HeartRateIntraday()
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
        return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.HEART_RATE_INTRADAY;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        super.initFromPublicApiJsonObject(jsonobject);
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
