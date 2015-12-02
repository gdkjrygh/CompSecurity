// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.a.c.a;
import com.facebook.n.b;
import com.facebook.n.c;
import com.google.common.d.a.ab;

// Referenced classes of package com.facebook.orca.chatheads:
//            dh, ek, di

class du extends b
{

    final dh a;

    private du(dh dh1)
    {
        a = dh1;
        super();
    }

    du(dh dh1, di di)
    {
        this(dh1);
    }

    public void a(c c1)
    {
        com.facebook.orca.chatheads.dh.a(a, true);
        dh.d(a).a(false);
    }

    public void b(c c1)
    {
        float f = (float)c1.c();
        com.a.c.a.e(a, f);
        com.a.c.a.f(a, f);
        com.a.c.a.a(a, Math.max(0.0F, Math.min(f, 1.0F)));
    }

    public void c(c c1)
    {
        boolean flag = false;
        com.facebook.orca.chatheads.dh.a(a, false);
        if (com.facebook.orca.chatheads.dh.a(a))
        {
            com.facebook.orca.chatheads.dh.b(a);
        }
        ek ek1 = dh.d(a);
        if (c1.d() == 1.0D)
        {
            flag = true;
        }
        ek1.a(flag);
        if (dh.n(a) != null)
        {
            dh.n(a).a_(null);
            com.facebook.orca.chatheads.dh.a(a, null);
        }
    }
}
