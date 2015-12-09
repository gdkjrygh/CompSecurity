// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.b;
import org.json.JSONException;
import org.json.JSONObject;

public class i
    implements b
{

    private Double a;
    private Double b;

    public i()
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

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("summary");
        if (jsonobject1 != null)
        {
            a = Double.valueOf(jsonobject1.optDouble("calories"));
        }
        jsonobject = jsonobject.optJSONObject("goals");
        if (jsonobject != null)
        {
            b = Double.valueOf(jsonobject.optDouble("calories"));
        }
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
