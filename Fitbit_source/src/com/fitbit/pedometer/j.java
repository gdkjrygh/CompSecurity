// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class j
{

    private static final String e = "TIMESTAMP_KEY";
    private static final String f = "METS_KEY";
    private static final String g = "METS_PERIOD_KEY";
    private static final String h = "IS_RUNNING_KEY";
    private long a;
    private double b;
    private long c;
    private boolean d;

    public j(long l)
    {
        a(l);
    }

    public j(SensorEvent sensorevent)
    {
        if (sensorevent.sensor.getType() == 18)
        {
            a(sensorevent.timestamp / 0xf4240L);
        }
    }

    public static j a(JSONObject jsonobject)
        throws JSONException
    {
        long l = jsonobject.getLong("TIMESTAMP_KEY");
        double d1 = jsonobject.getDouble("METS_KEY");
        long l1 = jsonobject.getLong("METS_PERIOD_KEY");
        boolean flag = jsonobject.getBoolean("IS_RUNNING_KEY");
        jsonobject = new j(l);
        jsonobject.a(d1);
        jsonobject.b(l1);
        jsonobject.a(flag);
        return jsonobject;
    }

    public long a()
    {
        return a;
    }

    public void a(double d1)
    {
        b = d1;
    }

    public void a(long l)
    {
        a = l;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public double b()
    {
        return b;
    }

    public void b(long l)
    {
        c = l;
    }

    public long c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }

    public JSONObject e()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("TIMESTAMP_KEY", a());
        jsonobject.put("METS_KEY", b());
        jsonobject.put("METS_PERIOD_KEY", c());
        jsonobject.put("IS_RUNNING_KEY", d());
        return jsonobject;
    }

    public boolean equals(Object obj)
    {
        if (super.equals(obj) && obj != null && (obj instanceof j))
        {
            obj = (j)obj;
            if (a == ((j) (obj)).a())
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return (int)(a % 0x5265c00L);
    }
}
