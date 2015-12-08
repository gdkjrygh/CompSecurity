// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.ArrayList;

// Referenced classes of package com.taplytics:
//            hu, ci, shelduck, hi, 
//            j, n, gs, em, 
//            z, d

final class e extends hu
{

    final d a;

    e(d d)
    {
        a = d;
        super();
    }

    public final void a()
    {
        ci.b().o = true;
        if (!hi.a(shelduck.a))
        {
            ci.b().d.a("appBackground", null, null);
        }
        ci.b().d.a(null);
        ci.b().d.c.a();
        if (gs.b())
        {
            gs.a("App assumed to be backgrounded");
        }
        if (ci.b().g)
        {
            em.a().b();
        }
        if (z.a() != null && z.a().b.size() > 0)
        {
            z.a().h();
        }
        super.a();
    }
}
