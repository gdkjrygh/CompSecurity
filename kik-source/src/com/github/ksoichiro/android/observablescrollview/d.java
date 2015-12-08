// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.ksoichiro.android.observablescrollview;

import android.widget.AbsListView;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//            ObservableListView

final class d
    implements android.widget.AbsListView.OnScrollListener
{

    final ObservableListView a;

    d(ObservableListView observablelistview)
    {
        a = observablelistview;
        super();
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (ObservableListView.a(a) != null)
        {
            ObservableListView.a(a).onScroll(abslistview, i, j, k);
        }
        ObservableListView.b(a);
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (ObservableListView.a(a) != null)
        {
            ObservableListView.a(a).onScrollStateChanged(abslistview, i);
        }
    }
}
