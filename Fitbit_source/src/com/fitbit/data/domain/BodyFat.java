// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import com.fitbit.weight.Fat;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            TimeSeriesObject

public class BodyFat extends TimeSeriesObject
{

    private static final long serialVersionUID = 0x2e57538061e42a07L;
    private Fat value;

    public BodyFat()
    {
    }

    public void a(double d1)
    {
        a(new Fat(d1));
    }

    public void a(Fat fat)
    {
        value = fat;
    }

    public double b()
    {
        return value.b();
    }

    public Fat c()
    {
        return value;
    }

    public TimeSeriesObject.TimeSeriesResourceType d()
    {
        return TimeSeriesObject.TimeSeriesResourceType.BODY_FAT;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        super.initFromPublicApiJsonObject(jsonobject);
        a(new Fat(com.fitbit.d.a.a(jsonobject, "value", 0.0D)));
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
