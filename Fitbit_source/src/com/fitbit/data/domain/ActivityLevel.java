// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import com.fitbit.d.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity, ActivityItem

public class ActivityLevel extends Entity
    implements b
{

    private ActivityItem activity;
    private String displayName;
    private String levelDescription;
    private Double maxSpeedMPH;
    private String metadata;
    private double mets;
    private Double minSpeedMPH;

    public ActivityLevel()
    {
    }

    public static boolean a(Double double1)
    {
        return double1 != null && double1.doubleValue() > 0.0D;
    }

    public ActivityItem a()
    {
        return activity;
    }

    public void a(double d1)
    {
        mets = d1;
    }

    public void a(ActivityItem activityitem)
    {
        activity = activityitem;
    }

    public void a(String s)
    {
        levelDescription = s;
    }

    public void b(Double double1)
    {
        minSpeedMPH = double1;
    }

    public void b(String s)
    {
        displayName = s;
    }

    public boolean b()
    {
        return activity.c() && (a(minSpeedMPH) || a(maxSpeedMPH));
    }

    public String c()
    {
        return levelDescription;
    }

    public void c(Double double1)
    {
        maxSpeedMPH = double1;
    }

    public void c(String s)
    {
        metadata = s;
    }

    public String d()
    {
        return displayName;
    }

    public String e()
    {
        return metadata;
    }

    public Double f()
    {
        return minSpeedMPH;
    }

    public Double g()
    {
        return maxSpeedMPH;
    }

    public double h()
    {
        return mets;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        setServerId(com.fitbit.d.a.a(jsonobject, "id", -1));
        c(Double.valueOf(com.fitbit.d.a.a(jsonobject, "maxSpeedMPH", 0.0D)));
        b(Double.valueOf(com.fitbit.d.a.a(jsonobject, "minSpeedMPH", 0.0D)));
        b(com.fitbit.d.a.a(jsonobject, "name"));
        a(com.fitbit.d.a.a(jsonobject, "mets", 0.0D));
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        com.fitbit.d.a.a(jsonobject, "id", Long.valueOf(getServerId()));
        com.fitbit.d.a.a(jsonobject, "maxSpeedMPH", g());
        com.fitbit.d.a.a(jsonobject, "minSpeedMPH", f());
        com.fitbit.d.a.a(jsonobject, "name", d());
        return jsonobject;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" displayName: ").append(d());
        stringbuilder.append(" mets: ").append(h());
        return stringbuilder.toString();
    }
}
