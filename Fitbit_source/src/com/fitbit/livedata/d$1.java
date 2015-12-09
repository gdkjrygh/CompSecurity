// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata;

import com.fitbit.e.a;

// Referenced classes of package com.fitbit.livedata:
//            d

class a
    implements Runnable
{

    final d a;

    public void run()
    {
        com.fitbit.e.a.a("BluetoothLiveDataScheduler", "Timer fired", new Object[0]);
        com.fitbit.multipledevice.a.a().h();
    }

    e.a(d d1)
    {
        a = d1;
        super();
    }
}
