// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.listview;

import android.widget.AbsListView;

// Referenced classes of package com.facebook.widget.listview:
//            BetterListView

class a
    implements android.widget.AbsListView.OnScrollListener
{

    final BetterListView a;

    a(BetterListView betterlistview)
    {
        a = betterlistview;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        a.c(i);
    }
}
