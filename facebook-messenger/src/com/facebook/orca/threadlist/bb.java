// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;


// Referenced classes of package com.facebook.orca.threadlist:
//            ThreadListFragment

class bb
    implements Runnable
{

    final ThreadListFragment a;

    bb(ThreadListFragment threadlistfragment)
    {
        a = threadlistfragment;
        super();
    }

    public void run()
    {
        ThreadListFragment.f(a);
    }
}
