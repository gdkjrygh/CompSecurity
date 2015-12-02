// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.a;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

// Referenced classes of package com.actionbarsherlock.internal.a:
//            a, h, b

class f
    implements android.widget.AbsListView.OnScrollListener
{

    final a a;

    private f(a a1)
    {
        a = a1;
        super();
    }

    f(a a1, b b)
    {
        this(a1);
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && !com.actionbarsherlock.internal.a.a.f(a) && com.actionbarsherlock.internal.a.a.c(a).getContentView() != null)
        {
            com.actionbarsherlock.internal.a.a.e(a).removeCallbacks(com.actionbarsherlock.internal.a.a.d(a));
            com.actionbarsherlock.internal.a.a.d(a).run();
        }
    }
}
