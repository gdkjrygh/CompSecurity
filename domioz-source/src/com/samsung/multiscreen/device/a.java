// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device;

import java.util.Map;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.device:
//            f, Device, b, g

final class a
    implements f
{

    final f a;
    final Map b;
    final Device c;

    a(Device device, f f1, Map map)
    {
        c = device;
        a = f1;
        b = map;
        super();
    }

    public final void onError(g g)
    {
        a.onError(g);
    }

    public final void onResult(Object obj)
    {
        obj = (com.samsung.multiscreen.b.a)obj;
        Device.c().info((new StringBuilder("connectToChannel() getChannel() onResult() channel:\n")).append(obj).toString());
        b b1 = new b(this, ((com.samsung.multiscreen.b.a) (obj)));
        if (b == null)
        {
            ((com.samsung.multiscreen.b.a) (obj)).a(b1);
            return;
        } else
        {
            ((com.samsung.multiscreen.b.a) (obj)).a(b, b1);
            return;
        }
    }
}
