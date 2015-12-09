// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device.a;

import com.samsung.multiscreen.device.g;
import com.samsung.multiscreen.net.a;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.device.a:
//            a, f

final class b
    implements a
{

    final com.samsung.multiscreen.device.a.a.a a;
    final com.samsung.multiscreen.device.a.a b;

    b(com.samsung.multiscreen.device.a.a a1, com.samsung.multiscreen.device.a.a.a a2)
    {
        b = a1;
        a = a2;
        super();
    }

    public final void a(Exception exception)
    {
        com.samsung.multiscreen.device.a.a.a().info((new StringBuilder("FindLocalDevicesRequest: got exception: ")).append(exception.getLocalizedMessage()).toString());
        a.onError(new g(exception.getMessage()));
    }

    public final void a(Object obj)
    {
        obj = (com.samsung.multiscreen.device.a.a.b)obj;
        com.samsung.multiscreen.device.a.a.a().info((new StringBuilder("Res: ")).append(((com.samsung.multiscreen.device.a.a.b) (obj)).toString()).append("\n").toString());
        (new f(((com.samsung.multiscreen.device.a.a.b) (obj)), a)).run();
    }
}
