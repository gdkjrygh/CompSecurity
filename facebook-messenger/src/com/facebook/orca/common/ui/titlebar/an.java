// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import com.a.c.a;
import com.facebook.n.b;
import com.facebook.n.c;
import com.google.common.d.a.ab;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            ac, ad

class an extends b
{

    final ac a;

    private an(ac ac1)
    {
        a = ac1;
        super();
    }

    an(ac ac1, ad ad)
    {
        this(ac1);
    }

    public void a(c c1)
    {
        a.setViewCachingEnabled(true);
    }

    public void b(c c1)
    {
        float f = (float)c1.c();
        com.a.c.a.d(a, 90F * f);
        com.a.c.a.g(a, (float)a.getWidth() * f);
        if (f < 0.0F && !ac.m(a))
        {
            com.facebook.orca.common.ui.titlebar.ac.a(a, true);
            ac.n(a);
        }
    }

    public void c(c c1)
    {
        ac.o(a).a_(null);
    }
}
