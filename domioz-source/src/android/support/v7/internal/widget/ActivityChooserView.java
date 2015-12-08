// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.v4.view.n;
import android.support.v7.a.j;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.ListPopupWindow;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;

// Referenced classes of package android.support.v7.internal.widget:
//            s, m, t

public final class ActivityChooserView extends ViewGroup
{

    n a;
    private final s b;
    private final t c;
    private final LinearLayoutCompat d;
    private final FrameLayout e;
    private final FrameLayout f;
    private final int g;
    private final DataSetObserver h;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener i;
    private ListPopupWindow j;
    private android.widget.PopupWindow.OnDismissListener k;
    private boolean l;
    private int m;
    private boolean n;

    static s a(ActivityChooserView activitychooserview)
    {
        return activitychooserview.b;
    }

    static void a(ActivityChooserView activitychooserview, int i1)
    {
        if (activitychooserview.b.d() == null)
        {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        activitychooserview.getViewTreeObserver().addOnGlobalLayoutListener(activitychooserview.i);
        ListPopupWindow listpopupwindow;
        int j1;
        int k1;
        boolean flag;
        if (activitychooserview.f.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1 = activitychooserview.b.c();
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (i1 != 0x7fffffff && k1 > j1 + i1)
        {
            activitychooserview.b.a(true);
            activitychooserview.b.a(i1 - 1);
        } else
        {
            activitychooserview.b.a(false);
            activitychooserview.b.a(i1);
        }
        listpopupwindow = activitychooserview.b();
        if (!listpopupwindow.b())
        {
            if (activitychooserview.l || !flag)
            {
                activitychooserview.b.a(true, flag);
            } else
            {
                activitychooserview.b.a(false, false);
            }
            listpopupwindow.b(Math.min(activitychooserview.b.a(), activitychooserview.g));
            listpopupwindow.c();
            if (activitychooserview.a != null)
            {
                activitychooserview.a.a(true);
            }
            listpopupwindow.j().setContentDescription(activitychooserview.getContext().getString(j.c));
        }
    }

    static boolean a(ActivityChooserView activitychooserview, boolean flag)
    {
        activitychooserview.l = flag;
        return flag;
    }

    private ListPopupWindow b()
    {
        if (j == null)
        {
            j = new ListPopupWindow(getContext());
            j.a(b);
            j.a(this);
            j.e();
            j.a(c);
            j.a(c);
        }
        return j;
    }

    static boolean b(ActivityChooserView activitychooserview)
    {
        return activitychooserview.l;
    }

    static FrameLayout c(ActivityChooserView activitychooserview)
    {
        return activitychooserview.f;
    }

    static FrameLayout d(ActivityChooserView activitychooserview)
    {
        return activitychooserview.e;
    }

    static int e(ActivityChooserView activitychooserview)
    {
        return activitychooserview.m;
    }

    static android.widget.PopupWindow.OnDismissListener f(ActivityChooserView activitychooserview)
    {
        return activitychooserview.k;
    }

    public final boolean a()
    {
        if (b().b())
        {
            b().a();
            ViewTreeObserver viewtreeobserver = getViewTreeObserver();
            if (viewtreeobserver.isAlive())
            {
                viewtreeobserver.removeGlobalOnLayoutListener(i);
            }
        }
        return true;
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        m m1 = b.d();
        if (m1 != null)
        {
            m1.registerObserver(h);
        }
        n = true;
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Object obj = b.d();
        if (obj != null)
        {
            ((m) (obj)).unregisterObserver(h);
        }
        obj = getViewTreeObserver();
        if (((ViewTreeObserver) (obj)).isAlive())
        {
            ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(i);
        }
        if (b().b())
        {
            a();
        }
        n = false;
    }

    protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        d.layout(0, 0, k1 - i1, l1 - j1);
        if (!b().b())
        {
            a();
        }
    }

    protected final void onMeasure(int i1, int j1)
    {
        LinearLayoutCompat linearlayoutcompat = d;
        int k1 = j1;
        if (f.getVisibility() != 0)
        {
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j1), 0x40000000);
        }
        measureChild(linearlayoutcompat, i1, k1);
        setMeasuredDimension(linearlayoutcompat.getMeasuredWidth(), linearlayoutcompat.getMeasuredHeight());
    }
}
