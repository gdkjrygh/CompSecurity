// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.al;
import android.support.v7.widget.ax;

public final class ac extends ax
{

    private final android.widget.AbsListView.OnScrollListener a;
    private int b;
    private int c;
    private int d;

    public ac(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        b = -1;
        c = -1;
        d = -1;
        a = onscrolllistener;
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 48
    //                   1 43
    //                   2 53;
           goto _L1 _L2 _L3 _L4
_L1:
        i = 0x80000000;
_L6:
        a.onScrollStateChanged(null, i);
        return;
_L3:
        i = 1;
        continue; /* Loop/switch isn't completed */
_L2:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        LinearLayoutManager linearlayoutmanager = (LinearLayoutManager)recyclerview.b();
        i = linearlayoutmanager.l();
        j = Math.abs(i - linearlayoutmanager.m());
        int k = recyclerview.a().a();
        if (i != b || j != c || k != d)
        {
            a.onScroll(null, i, j, k);
            b = i;
            c = j;
            d = k;
        }
    }
}
