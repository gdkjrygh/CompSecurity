// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.orca.threads.ThreadSummary;
import com.facebook.user.User;

// Referenced classes of package com.facebook.orca.threadview:
//            cl, ThreadViewFragment, cn, cm, 
//            cp

class bs
    implements cl
{

    final ThreadViewFragment a;

    bs(ThreadViewFragment threadviewfragment)
    {
        a = threadviewfragment;
        super();
    }

    public void a(ThreadSummary threadsummary)
    {
        ThreadViewFragment.a(a, threadsummary);
    }

    public void a(cn cn)
    {
        ThreadViewFragment.a(a, cn);
    }

    public void a(cn cn, cm cm)
    {
        ThreadViewFragment.a(a, cn, cm);
    }

    public void a(cn cn, cp cp)
    {
        ThreadViewFragment.a(a, cn, cp);
    }

    public void a(User user)
    {
        ThreadViewFragment.a(a, user);
    }

    public void b(cn cn)
    {
        ThreadViewFragment.b(a, cn);
    }
}
