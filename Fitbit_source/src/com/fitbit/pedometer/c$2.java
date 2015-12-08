// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import com.fitbit.e.a;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.pedometer:
//            c, e

class a
    implements a
{

    final c a;

    public void a(e e1)
    {
        com.fitbit.e.a.a("HtcPedometerCompatibilityController", "onResultDelivered", new Object[0]);
        if (meterAdapterHelper.PedometerManufacturer.b == e1.a())
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityController", "PedometerManufacturer.HTC", new Object[0]);
            if (p.l())
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityController", "isMotionbitLinked", new Object[0]);
                com.fitbit.pedometer.service.a.b();
                com.fitbit.multipledevice.a.a().b();
            }
        }
    }

    public volatile void a(Object obj)
    {
        a((e)obj);
    }

    .a(c c1)
    {
        a = c1;
        super();
    }
}
