// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import com.fitbit.d.a;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain.device:
//            Device, DeviceType, BatteryLevel, DeviceVersion

public class Scale extends Device
{

    public static com.fitbit.data.domain.WeightLogEntry.WeightUnits a[];
    public static int b[] = {
        0x7f080337, 0x7f080315, 0x7f080357
    };
    private double brightness;
    private com.fitbit.data.domain.WeightLogEntry.WeightUnits defaultUnit;
    private String firmwareVersion;
    private Date lastMeasurementTime;
    private Date lastMeasurementTimeForMe;
    private String name;
    private String network;

    public Scale()
    {
    }

    public Date D()
    {
        return lastMeasurementTime;
    }

    public Date E()
    {
        return lastMeasurementTimeForMe;
    }

    public String F()
    {
        return name;
    }

    public String G()
    {
        return network;
    }

    public double H()
    {
        return brightness;
    }

    public String I()
    {
        return firmwareVersion;
    }

    public com.fitbit.data.domain.WeightLogEntry.WeightUnits J()
    {
        return defaultUnit;
    }

    public void a(double d)
    {
        brightness = d;
    }

    public void a(com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits)
    {
        defaultUnit = weightunits;
    }

    public void b(Date date)
    {
        lastMeasurementTime = date;
    }

    public void c(Date date)
    {
        lastMeasurementTimeForMe = date;
    }

    public void f(String s)
    {
        name = s;
    }

    public void g(String s)
    {
        network = s;
    }

    public void h(String s)
    {
        firmwareVersion = s;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        a(DeviceType.SCALE);
        c(com.fitbit.d.a.a(jsonobject, "id"));
        a(com.fitbit.d.a.c(jsonobject, "lastSyncTime"));
        a(BatteryLevel.parse(com.fitbit.d.a.a(jsonobject, "battery")));
        String s = com.fitbit.d.a.a(jsonobject, "version");
        a(DeviceVersion.parse(s));
        e(s);
        a(com.fitbit.d.a.a(jsonobject, "brightness", 0.0D));
        s = com.fitbit.d.a.a(jsonobject, "defaultUnit");
        if ("METRIC".equals(s))
        {
            a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG);
        } else
        if ("en_GB".equals(s))
        {
            a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.STONE);
        } else
        {
            a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS);
        }
        h(com.fitbit.d.a.a(jsonobject, "firmwareVersion"));
        if (jsonobject.has("lastMeasurementTime"))
        {
            b(com.fitbit.d.a.c(jsonobject, "lastMeasurementTime"));
        }
        if (jsonobject.has("lastMeasurementTimeForMe"))
        {
            c(com.fitbit.d.a.c(jsonobject, "lastMeasurementTimeForMe"));
        }
        f(com.fitbit.d.a.a(jsonobject, "name"));
        g(com.fitbit.d.a.a(jsonobject, "network"));
    }

    static 
    {
        a = (new com.fitbit.data.domain.WeightLogEntry.WeightUnits[] {
            com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS, com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG, com.fitbit.data.domain.WeightLogEntry.WeightUnits.STONE
        });
    }
}
