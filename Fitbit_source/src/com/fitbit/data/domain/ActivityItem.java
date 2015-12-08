// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import com.fitbit.d.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity, o, ActivityLevel

public class ActivityItem extends Entity
    implements b, o
{

    private List acceptableActivityLevels;
    private boolean hasSpeed;
    private boolean isPopulated;
    private double mets;
    private String name;

    public ActivityItem()
    {
        isPopulated = false;
        acceptableActivityLevels = Collections.emptyList();
    }

    public static ActivityItem a(ActivityItem activityitem, ActivityItem activityitem1)
    {
        if (activityitem1 != null && !activityitem.e())
        {
            activityitem1.a(activityitem.a());
            return activityitem1;
        }
        if (activityitem1 != null)
        {
            activityitem.setEntityId(activityitem1.getEntityId());
            if (!activityitem.isPopulated)
            {
                activityitem.a(activityitem1.d());
            }
        }
        return activityitem;
    }

    public String a()
    {
        return name;
    }

    public void a(double d1)
    {
        mets = d1;
    }

    public void a(String s)
    {
        name = s;
    }

    public void a(List list)
    {
        acceptableActivityLevels = list;
    }

    public void a(JSONObject jsonobject)
        throws JSONException
    {
        long l = 0L;
        if (jsonobject.has("activityId"))
        {
            l = com.fitbit.d.a.b(jsonobject, "activityId", 0);
        }
        if (jsonobject.has("id"))
        {
            l = com.fitbit.d.a.b(jsonobject, "id", 0);
        }
        setServerId(l);
        a(com.fitbit.d.a.a(jsonobject, "name"));
    }

    public void a(boolean flag)
    {
        hasSpeed = flag;
    }

    public double b()
    {
        return mets;
    }

    public void b(boolean flag)
    {
        isPopulated = flag;
    }

    public boolean c()
    {
        return hasSpeed;
    }

    public List d()
    {
        return acceptableActivityLevels;
    }

    public boolean e()
    {
        return isPopulated;
    }

    public boolean f()
    {
        return c();
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject.has("activity"))
        {
            jsonobject = jsonobject.getJSONObject("activity");
            if (jsonobject.has("activityId"))
            {
                setServerId(com.fitbit.d.a.b(jsonobject, "activityId", -1));
            } else
            {
                setServerId(com.fitbit.d.a.b(jsonobject, "id", -1));
            }
            a(com.fitbit.d.a.a(jsonobject, "name"));
            a(com.fitbit.d.a.a(jsonobject, "hasSpeed", false).booleanValue());
            a(com.fitbit.d.a.b(jsonobject, "activityLevels", com/fitbit/data/domain/ActivityLevel));
            for (Iterator iterator = acceptableActivityLevels.iterator(); iterator.hasNext(); ((ActivityLevel)iterator.next()).a(this)) { }
            a(com.fitbit.d.a.a(jsonobject, "mets", 0.0D));
            return;
        }
        a(com.fitbit.d.a.a(jsonobject, "name"));
        if (jsonobject.has("activityId"))
        {
            setServerId(com.fitbit.d.a.b(jsonobject, "activityId", -1));
            return;
        } else
        {
            setServerId(com.fitbit.d.a.b(jsonobject, "id", -1));
            return;
        }
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("id", getServerId());
        jsonobject1.put("name", a());
        jsonobject1.put("hasSpeed", c());
        com.fitbit.d.a.a(jsonobject1, "activityLevels", d());
        jsonobject.put("activity", jsonobject1);
        return jsonobject;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" name: ").append(a());
        stringbuilder.append(" mets: ").append(b());
        stringbuilder.append(" hasSpeed: ").append(c());
        return stringbuilder.toString();
    }
}
