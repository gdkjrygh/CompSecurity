// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;


// Referenced classes of package com.facebook.orca.threadlist:
//            bi, ThreadListFragment, bk, bj, 
//            bm

class aw
    implements bi
{

    final ThreadListFragment a;

    aw(ThreadListFragment threadlistfragment)
    {
        a = threadlistfragment;
        super();
    }

    public void a(bk bk)
    {
        ThreadListFragment.a(a, bk);
    }

    public void a(bk bk, bj bj)
    {
        ThreadListFragment.a(a, bk, bj);
    }

    public void a(bk bk, bm bm)
    {
        ThreadListFragment.a(a, bk, bm);
    }

    public void b(bk bk)
    {
        ThreadListFragment.b(a, bk);
    }

    public void b(bk bk, bj bj)
    {
        ThreadListFragment.b(a, bk, bj);
    }
}
