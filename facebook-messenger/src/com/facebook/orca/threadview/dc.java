// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.widget.AbsListView;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewMessageFragment

class dc
    implements android.widget.AbsListView.OnScrollListener
{

    final ThreadViewMessageFragment a;

    dc(ThreadViewMessageFragment threadviewmessagefragment)
    {
        a = threadviewmessagefragment;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        ThreadViewMessageFragment.a(a, i, j, k);
        if (ThreadViewMessageFragment.b(a) != null)
        {
            ThreadViewMessageFragment.b(a).onScroll(abslistview, i, j, k);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (ThreadViewMessageFragment.b(a) != null)
        {
            ThreadViewMessageFragment.b(a).onScrollStateChanged(abslistview, i);
        }
    }
}
