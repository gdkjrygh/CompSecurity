// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.e;
import java.util.Hashtable;

public final class bq extends e
{

    public bq()
    {
        super("SubscribeVehicleData");
    }

    public final void a(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            b.put("gps", boolean1);
            return;
        } else
        {
            b.remove("gps");
            return;
        }
    }

    public final void b(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            b.put("speed", boolean1);
            return;
        } else
        {
            b.remove("speed");
            return;
        }
    }

    public final void c(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            b.put("deviceStatus", boolean1);
            return;
        } else
        {
            b.remove("deviceStatus");
            return;
        }
    }

    public final void d(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            b.put("driverBraking", boolean1);
            return;
        } else
        {
            b.remove("driverBraking");
            return;
        }
    }

    public final void e(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            b.put("emergencyEvent", boolean1);
            return;
        } else
        {
            b.remove("emergencyEvent");
            return;
        }
    }
}
