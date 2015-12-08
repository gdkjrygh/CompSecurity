// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.AbsListView;
import com.appboy.ui.b.a;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedFragment

final class c
    implements android.widget.AbsListView.OnScrollListener
{

    final AppboyFeedFragment a;

    c(AppboyFeedFragment appboyfeedfragment)
    {
        a = appboyfeedfragment;
        super();
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        abslistview = AppboyFeedFragment.d(a);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        abslistview.setEnabled(flag);
        if (j == 0)
        {
            return;
        }
        k = i - 1;
        if (k > AppboyFeedFragment.e(a))
        {
            AppboyFeedFragment.f(a).a(AppboyFeedFragment.e(a), k);
        }
        com.appboy.ui.AppboyFeedFragment.a(a, k);
        AppboyFeedFragment.b(a, i + j);
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }
}
