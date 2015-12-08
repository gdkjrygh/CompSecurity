// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device;

import com.samsung.multiscreen.b.a;
import com.samsung.multiscreen.b.f;

// Referenced classes of package com.samsung.multiscreen.device:
//            a, g, f

final class b
    implements com.samsung.multiscreen.b.b
{

    final a a;
    final com.samsung.multiscreen.device.a b;

    b(com.samsung.multiscreen.device.a a1, a a2)
    {
        b = a1;
        a = a2;
        super();
    }

    public final void a(f f1)
    {
        b.a.onError(new g(f1.a()));
    }

    public final void a(Object obj)
    {
        if (((Boolean)obj).booleanValue())
        {
            b.a.onResult(a);
            return;
        } else
        {
            b.a.onError(new g("Unknown Channel Connection failure"));
            return;
        }
    }
}
