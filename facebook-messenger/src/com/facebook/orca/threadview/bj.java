// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.analytics.cb;
import com.facebook.contacts.contactcard.ContactCardFragment;
import com.facebook.contacts.contactcard.ai;
import com.facebook.user.UserKey;
import com.facebook.zero.a.c;
import com.facebook.zero.ui.l;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewFragment, ca

class bj
    implements ai
{

    final ThreadViewFragment a;

    bj(ThreadViewFragment threadviewfragment)
    {
        a = threadviewfragment;
        super();
    }

    public void a()
    {
        com.facebook.orca.threadview.ThreadViewFragment.l(a).a(c.h, a.p());
    }

    public void a(UserKey userkey)
    {
        ThreadViewFragment.a(a, (new cb("click")).f("contact").g(userkey.b()));
        ThreadViewFragment.o(a);
        ThreadViewFragment.d(a).U();
        ThreadViewFragment.d(a).a(userkey, false);
        ThreadViewFragment.a(a, ca.CONTACTCARD);
    }

    public void b()
    {
        ThreadViewFragment.a(a, (new cb("click")).f("map"));
        ThreadViewFragment.a(a, ca.MAP);
    }

    public void c()
    {
        a.T();
    }

    public void d()
    {
    }

    public void e()
    {
    }

    public void f()
    {
        ThreadViewFragment.a(a, (new cb("click")).f("button").g("leave_conversation"));
        ThreadViewFragment.p(a);
    }
}
