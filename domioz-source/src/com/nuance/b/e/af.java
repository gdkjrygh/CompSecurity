// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import com.nuance.b.e.a.b;
import com.nuance.b.e.a.h;

// Referenced classes of package com.nuance.b.e:
//            ad, c

final class af
    implements Runnable
{

    final h a;
    final ad b;

    af(ad ad1, h h)
    {
        b = ad1;
        a = h;
        super();
    }

    public final void run()
    {
        b.c.x().reportResult(a);
    }
}
