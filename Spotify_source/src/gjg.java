// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AbsListView;

public abstract class gjg
    implements android.widget.AbsListView.OnScrollListener
{

    public boolean a;
    private int b;
    private int c;
    private int d;
    private int e;

    public gjg()
    {
    }

    public abstract void a(int i);

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (j == 0)
        {
            return;
        }
        int l = (i + j) - 1;
        if (!a)
        {
            b = i;
            c = l;
            d = abslistview.getChildAt(0).getTop();
            e = abslistview.getChildAt(j - 1).getTop();
            a = true;
        }
        if (i <= b && b <= l)
        {
            k = abslistview.getChildAt(b - i).getTop() - d;
        } else
        if (i <= c && c <= l)
        {
            k = abslistview.getChildAt(c - i).getTop() - e;
        } else
        {
            k = ((i - b) * (e - d)) / (c - b);
            k = abslistview.getChildAt(0).getTop() - k - d;
        }
        b = i;
        c = l;
        d = abslistview.getChildAt(0).getTop();
        e = abslistview.getChildAt(j - 1).getTop();
        a(k);
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }
}
