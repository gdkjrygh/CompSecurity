// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.orca.mutators.h;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.user.User;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewFragment

class bk
    implements h
{

    final ThreadSummary a;
    final User b;
    final ThreadViewFragment c;

    bk(ThreadViewFragment threadviewfragment, ThreadSummary threadsummary, User user)
    {
        c = threadviewfragment;
        a = threadsummary;
        b = user;
        super();
    }

    public void a()
    {
        ThreadViewFragment.a(c, a, b);
    }
}
