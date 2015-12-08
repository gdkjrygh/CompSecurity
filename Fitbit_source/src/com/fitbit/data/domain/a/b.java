// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.a;

import org.json.JSONException;
import org.json.JSONObject;

public class b
    implements com.fitbit.d.b
{

    private Double a;
    private Double b;
    private Double c;
    private Double d;
    private Double e;
    private Double f;

    public b()
    {
    }

    public Double a()
    {
        return a;
    }

    public Double b()
    {
        return b;
    }

    public Double c()
    {
        return c;
    }

    public Double d()
    {
        return d;
    }

    public Double e()
    {
        return e;
    }

    public Double f()
    {
        return f;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONObject("goals");
        if (jsonobject != null)
        {
            if (jsonobject.has("activeScore"))
            {
                a = Double.valueOf(jsonobject.optDouble("activeScore"));
            }
            if (jsonobject.has("calories"))
            {
                b = Double.valueOf(jsonobject.optDouble("calories"));
            }
            if (jsonobject.has("distance"))
            {
                c = Double.valueOf(jsonobject.optDouble("distance"));
            }
            if (jsonobject.has("floors"))
            {
                d = Double.valueOf(jsonobject.optDouble("floors"));
            }
            if (jsonobject.has("steps"))
            {
                e = Double.valueOf(jsonobject.optDouble("steps"));
            }
            if (jsonobject.has("activeMinutes"))
            {
                f = Double.valueOf(jsonobject.optDouble("activeMinutes"));
            }
        }
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
