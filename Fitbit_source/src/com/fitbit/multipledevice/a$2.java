// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.multipledevice;

import com.fitbit.bluetooth.e;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.multipledevice:
//            a

class a extends e
{

    final com.fitbit.multipledevice.a a;

    protected void a()
    {
        com.fitbit.e.a.a("MultipleDeviceController", "Bluetooth is turned off", new Object[0]);
        a.b();
    }

    protected void b()
    {
        com.fitbit.e.a.a("MultipleDeviceController", "Bluetooth is turned on", new Object[0]);
        a.b();
    }

    (com.fitbit.multipledevice.a a1)
    {
        a = a1;
        super();
    }
}
