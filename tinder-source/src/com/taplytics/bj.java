// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import org.json.JSONException;

// Referenced classes of package com.taplytics:
//            ci, hk, cv

public final class bj
    implements android.widget.AbsListView.OnScrollListener
{

    android.widget.AbsListView.OnScrollListener a;
    private int b;
    private int c;
    private int d;
    private int e;

    public bj(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        b = -1;
        c = -1;
        d = -1;
        e = -1;
        a = onscrolllistener;
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        int i1 = 0;
        View view;
        int j1;
        j1 = abslistview.getLastVisiblePosition();
        view = abslistview.getChildAt(0);
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        int l = view.getTop();
_L3:
        int k1;
        k1 = e;
        e = l;
        k1 = Math.abs(l - k1);
        view = abslistview.getChildAt(j - 1);
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        i1 = view.getBottom();
        if (ci.b().l && (i != b || j1 != c || d != k || abslistview.getPaddingTop() - l < k1 || i1 - (abslistview.getHeight() - abslistview.getPaddingBottom()) < k1))
        {
            d = k;
            b = i;
            c = j1;
            hk.c(abslistview);
        }
        if (ci.b().g && ci.b().l && cv.a().j != null && cv.a().j.findViewById(0x17ccbc3b) != null)
        {
            cv.a().j.removeView(cv.a().j.findViewById(0x17ccbc3b));
        }
_L2:
        if (a != null)
        {
            a.onScroll(abslistview, i, j, k);
        }
        return;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
        l = 0;
          goto _L3
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (a != null)
        {
            a.onScrollStateChanged(abslistview, i);
        }
    }
}
