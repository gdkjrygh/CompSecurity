// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import com.facebook.orca.contacts.divebar.DivebarFragment;
import com.facebook.ui.touch.SwipableLinearLayout;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            c, a, m, l

class d
    implements Runnable
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public void run()
    {
        com.facebook.orca.common.ui.titlebar.a.b(a.c);
        if (a.a == m.OPENED)
        {
            com.facebook.orca.common.ui.titlebar.a.a(a.c).bringToFront();
            com.facebook.orca.common.ui.titlebar.a.c(a.c).b();
            com.facebook.orca.common.ui.titlebar.a.d(a.c);
        } else
        {
            com.facebook.orca.common.ui.titlebar.a.e(a.c);
            com.facebook.orca.common.ui.titlebar.a.f(a.c);
        }
        if (a.b != null)
        {
            a.b.run();
        }
        if (com.facebook.orca.common.ui.titlebar.a.g(a.c) != null)
        {
            com.facebook.orca.common.ui.titlebar.a.g(a.c).b(com.facebook.orca.common.ui.titlebar.a.h(a.c));
        }
    }
}
