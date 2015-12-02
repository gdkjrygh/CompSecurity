// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.widget.AbsListView;
import com.facebook.orca.threadview.ThreadViewMessageFragment;

// Referenced classes of package com.facebook.orca.chatheads:
//            dh

class dr
    implements android.widget.AbsListView.OnScrollListener
{

    final dh a;

    dr(dh dh1)
    {
        a = dh1;
        super();
    }

    private void a(ThreadViewMessageFragment threadviewmessagefragment, int i)
    {
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = threadviewmessagefragment.W();
        }
        dh.c(a, flag);
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (dh.g(a) || dh.i(a))
        {
            a(dh.f(a), j);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 0)
        {
            dh.a(a, true);
            dh.b(a, false);
            i = abslistview.getLastVisiblePosition();
            int j = abslistview.getFirstVisiblePosition();
            a(dh.f(a), (i - j) + 1);
        } else
        {
            dh.a(a, false);
            if (i == 2)
            {
                dh.b(a, true);
                return;
            }
        }
    }
}
