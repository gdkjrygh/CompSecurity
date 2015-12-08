// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

// Referenced classes of package com.taplytics:
//            ci, hk, cv

public final class bi extends android.support.v7.widget.RecyclerView.OnScrollListener
{

    android.support.v7.widget.RecyclerView.OnScrollListener a;
    private int b;
    private int c;
    private int d;

    public bi(android.support.v7.widget.RecyclerView.OnScrollListener onscrolllistener)
    {
        b = -1;
        c = -1;
        d = -1;
        a = onscrolllistener;
    }

    public final void onScrollStateChanged(RecyclerView recyclerview, int i)
    {
        if (a != null)
        {
            a.onScrollStateChanged(recyclerview, i);
        }
    }

    public final void onScrolled(RecyclerView recyclerview, int i, int j)
    {
        int k = -1;
        android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = recyclerview.getLayoutManager();
        if (!(layoutmanager instanceof LinearLayoutManager)) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        i1 = ((LinearLayoutManager)layoutmanager).findFirstVisibleItemPosition();
        k = ((LinearLayoutManager)layoutmanager).findLastVisibleItemPosition();
        j1 = layoutmanager.getChildCount();
        int l;
        l = k;
        k = j1;
_L4:
        try
        {
            if (ci.b().l && (b != i1 || c != l || k != d))
            {
                b = i1;
                c = l;
                d = k;
                hk.c(recyclerview);
            }
            if (ci.b().g && ci.b().l && cv.a().j != null && cv.a().j.findViewById(0x17ccbc3b) != null)
            {
                cv.a().j.removeView(cv.a().j.findViewById(0x17ccbc3b));
            }
        }
        catch (Exception exception) { }
        if (a != null)
        {
            a.onScrolled(recyclerview, i, j);
        }
        return;
_L2:
        l = -1;
        i1 = -1;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
