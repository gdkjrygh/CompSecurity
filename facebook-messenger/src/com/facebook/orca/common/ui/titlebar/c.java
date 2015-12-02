// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import com.a.a.a;
import com.a.a.b;
import com.facebook.ui.touch.SwipableLinearLayout;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            a, d, m

class c
    implements b
{

    final m a;
    final Runnable b;
    final com.facebook.orca.common.ui.titlebar.a c;

    c(com.facebook.orca.common.ui.titlebar.a a1, m m, Runnable runnable)
    {
        c = a1;
        a = m;
        b = runnable;
        super();
    }

    public void a(a a1)
    {
    }

    public void b(a a1)
    {
        com.facebook.orca.common.ui.titlebar.a.a(c, null);
        com.facebook.orca.common.ui.titlebar.a.a(c, a);
        if (com.facebook.orca.common.ui.titlebar.a.a(c) != null)
        {
            com.facebook.orca.common.ui.titlebar.a.a(c).post(new d(this));
        }
    }

    public void c(a a1)
    {
    }

    public void d(a a1)
    {
    }
}
