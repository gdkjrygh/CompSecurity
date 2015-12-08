// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            ac, ao, ad

class am
    implements android.widget.AbsListView.OnScrollListener
{

    final ac a;

    private am(ac ac1)
    {
        a = ac1;
        super();
    }

    am(ac ac1, ad ad)
    {
        this(ac1);
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && !a.l() && ac.b(a).getContentView() != null)
        {
            ac.d(a).removeCallbacks(ac.c(a));
            ac.c(a).run();
        }
    }
}
