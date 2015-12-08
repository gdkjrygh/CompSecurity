// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity

public class ActivitySummaryItem extends Entity
    implements b
{

    private static final String a = "sedentary";
    private static final String b = "lightly";
    private static final String c = "moderately";
    private static final String d = "very";
    private int bmr;
    private Double caloriesOut;
    private Double distance;
    private Double floors;
    private Double lightlyActiveMinutes;
    private Double moderatelyActiveMinutes;
    private Double sedentaryMinutes;
    private Double steps;
    private Double veryActiveMinutes;

    public ActivitySummaryItem()
    {
    }

    private void a(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray != null)
        {
            int j = 0;
            while (j < jsonarray.length()) 
            {
                Object obj = jsonarray.getJSONObject(j);
                Double double1 = Double.valueOf(((JSONObject) (obj)).optDouble("minutes"));
                obj = ((JSONObject) (obj)).optString("name");
                if ("sedentary".equals(obj))
                {
                    sedentaryMinutes = double1;
                } else
                if ("lightly".equals(obj))
                {
                    lightlyActiveMinutes = double1;
                } else
                if ("moderately".equals(obj))
                {
                    moderatelyActiveMinutes = double1;
                } else
                if ("very".equals(obj))
                {
                    veryActiveMinutes = double1;
                }
                j++;
            }
        }
    }

    public int a()
    {
        return bmr;
    }

    public Double b()
    {
        return caloriesOut;
    }

    public Double c()
    {
        return moderatelyActiveMinutes;
    }

    public Double d()
    {
        return lightlyActiveMinutes;
    }

    public Double e()
    {
        return sedentaryMinutes;
    }

    public Double f()
    {
        return steps;
    }

    public Double g()
    {
        return veryActiveMinutes;
    }

    public Double h()
    {
        return floors;
    }

    public Double i()
    {
        return distance;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONObject("summary");
        if (jsonobject != null)
        {
            a(jsonobject.optJSONArray("activityLevels"));
            if (jsonobject.has("distance"))
            {
                distance = Double.valueOf(jsonobject.optDouble("distance"));
            }
            if (jsonobject.has("floors"))
            {
                floors = Double.valueOf(jsonobject.optDouble("floors"));
            }
            if (jsonobject.has("steps"))
            {
                steps = Double.valueOf(jsonobject.optDouble("steps"));
            }
        }
        jsonobject = jsonobject.optJSONObject("calories");
        if (jsonobject != null)
        {
            bmr = jsonobject.optInt("bmr");
            if (jsonobject.has("total"))
            {
                caloriesOut = Double.valueOf(jsonobject.optDouble("total"));
            }
        }
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" floors: ").append(h());
        stringbuilder.append(" distance: ").append(i());
        stringbuilder.append(" caloriesOut: ").append(b());
        stringbuilder.append(" moderatelyActiveMinutes: ").append(c());
        stringbuilder.append(" lightlyActiveMinutes: ").append(d());
        stringbuilder.append(" sedentaryMinutes: ").append(e());
        stringbuilder.append(" steps: ").append(f());
        stringbuilder.append(" veryActiveMinutes: ").append(g());
        return stringbuilder.toString();
    }
}
