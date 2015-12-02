// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.refreshablelistview;

import android.widget.AbsListView;

// Referenced classes of package com.facebook.widget.refreshablelistview:
//            RefreshableListViewContainer

class a
    implements android.widget.AbsListView.OnScrollListener
{

    final RefreshableListViewContainer a;

    a(RefreshableListViewContainer refreshablelistviewcontainer)
    {
        a = refreshablelistviewcontainer;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        a.a(abslistview, i);
    }
}
