// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import android.view.View;
import com.a.c.a;
import com.facebook.n.b;
import com.facebook.n.c;
import com.google.common.d.a.ab;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            ac

class ao extends b
{

    final ac a;
    private final View b;

    ao(ac ac1, View view)
    {
        a = ac1;
        super();
        b = view;
    }

    public void a(c c1)
    {
        c1.a(false);
        a.setViewCachingEnabled(true);
    }

    public void b(c c1)
    {
        float f = 0.0F;
        float f1 = (float)c1.c();
        if (f1 < 0.0F)
        {
            c1.a(true);
        } else
        {
            f = f1;
        }
        com.a.c.a.e(b, f);
        com.a.c.a.f(b, f);
    }

    public void c(c c1)
    {
        ac.h(a);
        if (c1 == ac.i(a))
        {
            ac.j(a).a_(null);
        } else
        if (c1 == ac.k(a))
        {
            ac.l(a).a_(null);
            return;
        }
    }
}
