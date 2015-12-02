// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.a.c.a;
import com.facebook.n.b;
import com.facebook.n.c;
import com.google.common.d.a.ab;

// Referenced classes of package com.facebook.orca.chatheads:
//            e, f

class h extends b
{

    final e a;

    private h(e e1)
    {
        a = e1;
        super();
    }

    h(e e1, f f)
    {
        this(e1);
    }

    public void a(c c1)
    {
        a.setViewCachingEnabled(true);
    }

    public void b(c c1)
    {
        float f = (float)c1.c();
        com.a.c.a.e(a, f);
        com.a.c.a.f(a, f);
    }

    public void c(c c1)
    {
        com.facebook.orca.chatheads.e.a(a).a_(null);
        com.facebook.orca.chatheads.e.b(a);
    }
}
