// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

final class adz
    implements android.widget.AbsListView.OnScrollListener
{

    private adq a;

    adz(adq adq1)
    {
        a = adq1;
        super();
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && !a.e() && adq.b(a).getContentView() != null)
        {
            adq.d(a).removeCallbacks(adq.c(a));
            adq.c(a).run();
        }
    }
}
