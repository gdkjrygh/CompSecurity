// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.a;

import com.fitbit.pedometer.e;
import com.fitbit.pedometer.service.a;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.a:
//            b

class <init>
    implements com.fitbit.pedometer..a
{

    final b a;

    public void a(e e1)
    {
        if (com.fitbit.pedometer.meterAdapterHelper.PedometerManufacturer.b == e1.a() && p.l())
        {
            com.fitbit.pedometer.service.a.b();
            com.fitbit.multipledevice.a.a().b();
        }
    }

    public volatile void a(Object obj)
    {
        a((e)obj);
    }

    ter.e(b b1)
    {
        a = b1;
        super();
    }
}
