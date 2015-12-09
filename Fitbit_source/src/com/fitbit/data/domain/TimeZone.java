// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity

public class TimeZone extends Entity
    implements b
{

    private String name;
    private long offset;
    private String timeZoneId;

    public TimeZone()
    {
    }

    public TimeZone(String s, String s1, long l)
    {
        timeZoneId = s;
        name = s1;
        offset = l;
    }

    public String a()
    {
        return name;
    }

    public void a(long l)
    {
        offset = l;
    }

    public void a(String s)
    {
        name = s;
    }

    public long b()
    {
        return offset;
    }

    public void b(String s)
    {
        timeZoneId = s;
    }

    public String c()
    {
        return timeZoneId;
    }

    public java.util.TimeZone d()
    {
        java.util.TimeZone timezone1 = java.util.TimeZone.getTimeZone(timeZoneId);
        java.util.TimeZone timezone = timezone1;
        if (timezone1 == null)
        {
            timezone = java.util.TimeZone.getDefault();
        }
        return timezone;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        timeZoneId = jsonobject.getString("id");
        offset = jsonobject.getLong("offset");
        name = jsonobject.getString("name");
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
