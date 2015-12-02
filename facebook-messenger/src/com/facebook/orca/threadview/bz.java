// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.analytics.cb;
import com.facebook.contacts.contactcard.x;
import com.facebook.zero.a.c;
import com.facebook.zero.ui.l;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewFragment, cw, ca

class bz
    implements x
{

    final ThreadViewFragment a;

    bz(ThreadViewFragment threadviewfragment)
    {
        a = threadviewfragment;
        super();
    }

    public void a()
    {
        com.facebook.orca.threadview.ThreadViewFragment.l(a).a(c.h, a.p());
    }

    public void b()
    {
        ThreadViewFragment.a(a, (new cb("click")).f("map"));
        if (cw.a())
        {
            ThreadViewFragment.a(a, ca.MAP);
        }
    }

    public void c()
    {
        a.T();
    }

    public void d()
    {
        if (!a.w())
        {
            ThreadViewFragment.m(a);
        }
    }

    public void e()
    {
        ThreadViewFragment.n(a);
    }
}
