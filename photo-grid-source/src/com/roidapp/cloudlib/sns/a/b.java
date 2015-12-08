// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.a;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ax;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AbsListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.sns.a:
//            c

final class b extends ax
    implements ViewPropertyAnimatorListener, android.widget.AbsListView.OnScrollListener
{

    private static final List l = new ArrayList();
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final SparseIntArray g;
    private final View h;
    private final Object i;
    private android.widget.AbsListView.OnScrollListener j;
    private ax k;

    public b(ax ax1, View view, Object obj)
    {
        c = -1;
        e = -1;
        g = new SparseIntArray();
        k = ax1;
        h = view;
        i = obj;
    }

    public b(android.widget.AbsListView.OnScrollListener onscrolllistener, View view, Object obj)
    {
        c = -1;
        e = -1;
        g = new SparseIntArray();
        j = onscrolllistener;
        h = view;
        i = obj;
    }

    private static void a(int i1)
    {
        for (Iterator iterator = l.iterator(); iterator.hasNext(); ((c)iterator.next()).a(i1)) { }
    }

    public static void a(c c1)
    {
        if (!l.contains(c1))
        {
            l.add(c1);
        }
    }

    private static boolean a(View view, int i1)
    {
        if (view != null)
        {
            int j1 = (int)ViewCompat.getTranslationY(view);
            ViewCompat.setTranslationY(view, i1);
            if ((float)j1 != ViewCompat.getTranslationY(view))
            {
                return true;
            }
        }
        return false;
    }

    public static void b(c c1)
    {
        l.remove(c1);
    }

    public final void a(RecyclerView recyclerview, int i1)
    {
        if (k != null)
        {
            k.a(recyclerview, i1);
        }
    }

    public final void a(RecyclerView recyclerview, int i1, int j1)
    {
        if (i != null && i.equals(h.getTag()))
        {
            if (e == -1 || e == 0)
            {
                e = h.getHeight();
            }
            if (j1 > 0)
            {
                int k1 = (int)ViewCompat.getY(h);
                if (k1 > -e)
                {
                    int i2 = k1 - j1;
                    k1 = i2;
                    if (i2 < -e)
                    {
                        k1 = -e;
                    }
                    if (a(h, k1))
                    {
                        a(k1);
                    }
                }
            } else
            if (j1 < 0)
            {
                int l1 = (int)ViewCompat.getY(h);
                if (l1 < 0)
                {
                    int j2 = l1 - j1;
                    l1 = j2;
                    if (j2 > 0)
                    {
                        l1 = 0;
                    }
                    if (a(h, l1))
                    {
                        a(l1);
                    }
                }
            }
            if (k != null)
            {
                k.a(recyclerview, i1, j1);
                return;
            }
        }
    }

    public final void onAnimationCancel(View view)
    {
    }

    public final void onAnimationEnd(View view)
    {
        if (ViewCompat.getTranslationY(view) == 0.0F)
        {
            f = 0;
        }
    }

    public final void onAnimationStart(View view)
    {
    }

    public final void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        boolean flag = false;
        if (i != null && i.equals(h.getTag())) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (e == -1 || e == 0)
        {
            e = h.getHeight();
        }
        if (abslistview.getChildCount() <= 0) goto _L4; else goto _L3
_L3:
        View view;
        int k4;
        k4 = abslistview.getFirstVisiblePosition();
        int l2 = abslistview.getFirstVisiblePosition();
        for (int l1 = 0; l2 <= abslistview.getLastVisiblePosition(); l1++)
        {
            if (g.indexOfKey(l2) < 0 || abslistview.getChildAt(l1).getHeight() != g.get(l2))
            {
                g.put(l2, abslistview.getChildAt(l1).getHeight());
            }
            l2++;
        }

        view = abslistview.getChildAt(0);
        if (view == null) goto _L4; else goto _L5
_L5:
        int k2;
        int j3;
        if (b < k4)
        {
            int i4;
            if (k4 - b != 1)
            {
                int i3 = k4 - 1;
                int i2 = 0;
                do
                {
                    i4 = i2;
                    if (i3 <= b)
                    {
                        break;
                    }
                    if (g.indexOfKey(i3) > 0)
                    {
                        i2 += g.get(i3);
                    } else
                    {
                        i2 += view.getHeight();
                    }
                    i3--;
                } while (true);
            } else
            {
                i4 = 0;
            }
            int j2 = d;
            d = i4 + c + j2;
            c = view.getHeight();
        } else
        if (k4 < b)
        {
            int j4;
            if (b - k4 != 1)
            {
                int k3 = b - 1;
                k2 = 0;
                do
                {
                    j4 = k2;
                    if (k3 <= k4)
                    {
                        break;
                    }
                    if (g.indexOfKey(k3) > 0)
                    {
                        k2 += g.get(k3);
                    } else
                    {
                        k2 += view.getHeight();
                    }
                    k3--;
                } while (true);
            } else
            {
                j4 = 0;
            }
            d = d - (j4 + view.getHeight());
            c = view.getHeight();
        } else
        if (k4 == 0)
        {
            c = view.getHeight();
        }
        if (c < 0)
        {
            c = 0;
        }
        b = k4;
        j3 = d - view.getTop();
        k2 = j3 - a;
        a = j3;
_L6:
        if (k2 > 0)
        {
            j3 = (int)ViewCompat.getY(h);
            if (j3 > -e)
            {
                j3 -= k2;
                k2 = j3;
                if (j3 < -e)
                {
                    k2 = -e;
                }
                if (a(h, k2))
                {
                    a(k2);
                }
            }
        } else
        if (k2 < 0)
        {
            int l3 = (int)ViewCompat.getY(h);
            if (l3 < 0)
            {
                k2 = l3 - k2;
                if (k2 > 0)
                {
                    k2 = ((flag) ? 1 : 0);
                }
                if (a(h, k2))
                {
                    a(k2);
                }
            }
        }
        if (j != null)
        {
            j.onScroll(abslistview, i1, j1, k1);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        k2 = 0;
          goto _L6
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        if (j != null)
        {
            j.onScrollStateChanged(abslistview, i1);
        }
    }

}
