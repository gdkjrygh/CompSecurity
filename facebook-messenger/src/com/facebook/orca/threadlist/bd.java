// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.widget.AbsListView;

// Referenced classes of package com.facebook.orca.threadlist:
//            ThreadListFragment, be, ao

class bd
    implements android.widget.AbsListView.OnScrollListener
{

    final ThreadListFragment a;

    private bd(ThreadListFragment threadlistfragment)
    {
        a = threadlistfragment;
        super();
    }

    bd(ThreadListFragment threadlistfragment, ao ao)
    {
        this(threadlistfragment);
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        ThreadListFragment.b(a, (i + j) - 1);
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 0)
        {
            ThreadListFragment.f(a);
            ThreadListFragment.h(a);
        }
        if (ThreadListFragment.i(a) != null)
        {
            ThreadListFragment.i(a).a(abslistview, i);
        }
    }
}
