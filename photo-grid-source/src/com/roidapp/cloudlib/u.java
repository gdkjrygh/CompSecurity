// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.widget.AbsListView;

// Referenced classes of package com.roidapp.cloudlib:
//            t

final class u
    implements android.widget.AbsListView.OnScrollListener
{

    final t a;

    u(t t1)
    {
        a = t1;
        super();
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 0 && abslistview.getLastVisiblePosition() == abslistview.getCount() - 1)
        {
            a.d();
        }
    }
}
