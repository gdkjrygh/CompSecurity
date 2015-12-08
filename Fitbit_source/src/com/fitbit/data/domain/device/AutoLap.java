// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import com.fitbit.d.b;
import org.json.JSONException;
import org.json.JSONObject;

public class AutoLap
    implements b
{
    public static final class AutoLapType extends Enum
    {

        private static final AutoLapType $VALUES[];
        public static final AutoLapType DISTANCE_KM;
        public static final AutoLapType DISTANCE_MILE;
        public static final AutoLapType TIME;

        public static AutoLapType valueOf(String s)
        {
            return (AutoLapType)Enum.valueOf(com/fitbit/data/domain/device/AutoLap$AutoLapType, s);
        }

        public static AutoLapType[] values()
        {
            return (AutoLapType[])$VALUES.clone();
        }

        static 
        {
            TIME = new AutoLapType("TIME", 0);
            DISTANCE_KM = new AutoLapType("DISTANCE_KM", 1);
            DISTANCE_MILE = new AutoLapType("DISTANCE_MILE", 2);
            $VALUES = (new AutoLapType[] {
                TIME, DISTANCE_KM, DISTANCE_MILE
            });
        }

        private AutoLapType(String s, int i)
        {
            super(s, i);
        }
    }


    private String a;
    private String b;
    private AutoLapType c;

    public AutoLap(AutoLapType autolaptype)
    {
        c = autolaptype;
    }

    public AutoLap(String s, String s1, AutoLapType autolaptype)
    {
        a = s;
        b = s1;
        c = autolaptype;
    }

    public String a()
    {
        return a;
    }

    public void a(String s)
    {
        b = s;
    }

    public String b()
    {
        return b;
    }

    public AutoLapType c()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && obj.getClass().equals(com/fitbit/data/domain/device/AutoLap))
        {
            return a.equals(((AutoLap)obj).a) && c.equals(((AutoLap)obj).c);
        } else
        {
            return false;
        }
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        a = jsonobject.optString("autoLapInterval");
        b = jsonobject.optString("value");
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
