// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device;

import com.samsung.multiscreen.a.d;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.device:
//            Device, d

final class e
    implements d
{

    final com.samsung.multiscreen.device.d a;

    e(com.samsung.multiscreen.device.d d1)
    {
        a = d1;
        super();
    }

    public final void onError(com.samsung.multiscreen.a.e e1)
    {
        Device.c().info((new StringBuilder("test application.launch() error: ")).append(e1).toString());
    }

    public final void onResult(Object obj)
    {
        obj = (Boolean)obj;
        Device.c().info((new StringBuilder("test application.launch() result: ")).append(obj).toString());
    }
}
