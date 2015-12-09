// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.internal.widget:
//            ListPopupWindow

private class <init>
    implements android.widget.llListener
{

    final ListPopupWindow a;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && !a.g() && ListPopupWindow.b(a).getContentView() != null)
        {
            ListPopupWindow.d(a).removeCallbacks(ListPopupWindow.c(a));
            ListPopupWindow.c(a).run();
        }
    }

    private (ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    a(ListPopupWindow listpopupwindow, a a1)
    {
        this(listpopupwindow);
    }
}
