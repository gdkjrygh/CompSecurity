// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.view.ViewGroup;
import android.widget.AbsListView;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            StickyHeaderView

final class b
    implements android.widget.lListener
{

    private int a[];
    private int b[];
    private StickyHeaderView c;

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        boolean flag1 = true;
        if (!StickyHeaderView.h(c)) goto _L2; else goto _L1
_L1:
        if (i != 0 && j != 0) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (StickyHeaderView.b(c) == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
_L6:
        StickyHeaderView.a(c, flag);
_L2:
        return;
_L4:
        flag = flag1;
        if (StickyHeaderView.b(c) >= i)
        {
            flag = flag1;
            if (StickyHeaderView.b(c) != -1)
            {
                StickyHeaderView.c(c).getLocationInWindow(a);
                StickyHeaderView.i(c).getLocationInWindow(b);
                flag = flag1;
                if (a[1] >= b[1])
                {
                    flag = false;
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    (StickyHeaderView stickyheaderview)
    {
        c = stickyheaderview;
        super();
        a = new int[2];
        b = new int[2];
    }
}
