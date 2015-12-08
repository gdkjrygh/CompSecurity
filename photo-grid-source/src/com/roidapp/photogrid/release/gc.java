// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.AbsListView;

// Referenced classes of package com.roidapp.photogrid.release:
//            ga

final class gc
    implements android.widget.AbsListView.OnScrollListener
{

    final ga a;

    gc(ga ga1)
    {
        a = ga1;
        super();
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (a.isDetached() || k == 0)
        {
            return;
        }
        if (ga.a(a, i))
        {
            j = ga.a(abslistview);
            if (Math.abs(ga.b(a) - j) > ga.c(a))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0 && ga.b(a) > j)
            {
                ga.d(a);
            }
            ga.b(a, j);
            return;
        }
        if (i > ga.e(a))
        {
            ga.d(a);
        }
        ga.b(a, ga.a(abslistview));
        ga.c(a, i);
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }
}
