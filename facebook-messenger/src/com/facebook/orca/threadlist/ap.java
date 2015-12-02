// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.facebook.b.a.b;
import com.facebook.orca.threads.ThreadSummary;

// Referenced classes of package com.facebook.orca.threadlist:
//            ThreadListFragment

class ap
    implements Runnable
{

    final ThreadSummary a;
    final ThreadListFragment b;

    ap(ThreadListFragment threadlistfragment, ThreadSummary threadsummary)
    {
        b = threadlistfragment;
        a = threadsummary;
        super();
    }

    public void run()
    {
        ThreadListFragment.g(b).a(a.a());
    }
}
