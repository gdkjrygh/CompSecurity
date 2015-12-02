// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.widget.AbsListView;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.threadlist:
//            ThreadListView, i

class bn
    implements android.widget.AbsListView.OnScrollListener
{

    final ThreadListView a;

    bn(ThreadListView threadlistview)
    {
        a = threadlistview;
        super();
    }

    public void onScroll(AbsListView abslistview, int j, int k, int l)
    {
        Preconditions.checkNotNull(ThreadListView.a(a));
        ThreadListView.a(a).a(abslistview, j, k, l);
    }

    public void onScrollStateChanged(AbsListView abslistview, int j)
    {
        Preconditions.checkNotNull(ThreadListView.a(a));
        ThreadListView.a(a).a(abslistview, j);
    }
}
