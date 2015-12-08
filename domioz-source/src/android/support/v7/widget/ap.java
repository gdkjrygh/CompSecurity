// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow, ar

final class ap
    implements android.widget.AbsListView.OnScrollListener
{

    final ListPopupWindow a;

    private ap(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    ap(ListPopupWindow listpopupwindow, byte byte0)
    {
        this(listpopupwindow);
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && !a.i() && ListPopupWindow.b(a).getContentView() != null)
        {
            ListPopupWindow.d(a).removeCallbacks(ListPopupWindow.c(a));
            ListPopupWindow.c(a).run();
        }
    }
}
