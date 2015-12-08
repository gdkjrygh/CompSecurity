// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            TimeSeriesObject

public class MinutesVeryActive extends TimeSeriesObject
{

    private static final long serialVersionUID = 0x985c3d2069d4de5aL;
    private double value;

    public MinutesVeryActive()
    {
    }

    public void a(double d1)
    {
        value = d1;
    }

    public double b()
    {
        return value;
    }

    public TimeSeriesObject.TimeSeriesResourceType d()
    {
        return TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        super.initFromPublicApiJsonObject(jsonobject);
        a(com.fitbit.d.a.a(jsonobject, "value", 0.0D));
    }
}
