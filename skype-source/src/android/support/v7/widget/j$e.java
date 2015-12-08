// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            j

private final class <init>
    implements android.widget.istView.OnScrollListener
{

    final j a;

    public final void onScroll(AbsListView abslistview, int i, int k, int l)
    {
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && !a.o() && j.b(a).getContentView() != null)
        {
            j.d(a).removeCallbacks(j.c(a));
            j.c(a).run();
        }
    }

    private crollListener(j j1)
    {
        a = j1;
        super();
    }

    a(j j1, byte byte0)
    {
        this(j1);
    }
}
