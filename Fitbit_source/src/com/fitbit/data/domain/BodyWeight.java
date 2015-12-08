// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import com.fitbit.weight.Weight;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            TimeSeriesObject

public class BodyWeight extends TimeSeriesObject
{

    private static final long serialVersionUID = 0x87d17eb9fb094843L;
    private Weight value;

    public BodyWeight()
    {
    }

    public void a(double d1)
    {
        value = new Weight(d1, WeightLogEntry.WeightUnits.KG);
    }

    public void a(Weight weight)
    {
        value = weight;
    }

    public double b()
    {
        return value.a(WeightLogEntry.WeightUnits.KG).b();
    }

    public Weight c()
    {
        return value;
    }

    public TimeSeriesObject.TimeSeriesResourceType d()
    {
        return TimeSeriesObject.TimeSeriesResourceType.BODY_WEIGHT;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        super.initFromPublicApiJsonObject(jsonobject);
        a(new Weight(com.fitbit.d.a.a(jsonobject, "value", 0.0D), WeightLogEntry.WeightUnits.KG));
    }
}
