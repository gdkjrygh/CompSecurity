// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.n.b;
import com.facebook.n.c;
import com.google.common.d.a.ab;

// Referenced classes of package com.facebook.orca.chatheads:
//            v, w

class ad extends b
{

    final v a;

    private ad(v v1)
    {
        a = v1;
        super();
    }

    ad(v v1, w w)
    {
        this(v1);
    }

    public void a(c c1)
    {
        a.setVisibility(0);
    }

    public void b(c c1)
    {
        v.d(a);
    }

    public void c(c c1)
    {
        if (c1.c() == 0.0D)
        {
            a.setVisibility(8);
        }
        if (v.f(a) != null)
        {
            v.f(a).a_(null);
            com.facebook.orca.chatheads.v.b(a, null);
        }
    }
}
