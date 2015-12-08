// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import aG;
import aY;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import bk;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

final class c extends aG
{

    private final Rect b = new Rect();
    private SlidingPaneLayout c;

    private boolean b(View view)
    {
        return c.b(view);
    }

    public final void a(View view, bk bk1)
    {
        bk bk2 = bk.a(bk1);
        super.a(view, bk2);
        Rect rect = b;
        bk2.a(rect);
        bk1.b(rect);
        bk2.c(rect);
        bk1.d(rect);
        bk1.c(bk2.d());
        bk1.a(bk2.j());
        bk1.b(bk2.k());
        bk1.c(bk2.l());
        bk1.h(bk2.i());
        bk1.f(bk2.g());
        bk1.a(bk2.b());
        bk1.b(bk2.c());
        bk1.d(bk2.e());
        bk1.e(bk2.f());
        bk1.g(bk2.h());
        bk1.a(bk2.a());
        int i = bk.a.ce(bk2.b);
        bk.a.ce(bk1.b, i);
        bk2.m();
        bk1.b(android/support/v4/widget/SlidingPaneLayout.getName());
        bk1.a(view);
        view = aY.i(view);
        if (view instanceof View)
        {
            bk1.c((View)view);
        }
        int k = c.getChildCount();
        for (int j = 0; j < k; j++)
        {
            view = c.getChildAt(j);
            if (!b(view) && view.getVisibility() == 0)
            {
                aY.c(view, 1);
                bk1.b(view);
            }
        }

    }

    public final boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (!b(view))
        {
            return super.a(viewgroup, view, accessibilityevent);
        } else
        {
            return false;
        }
    }

    public final void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/SlidingPaneLayout.getName());
    }

    (SlidingPaneLayout slidingpanelayout)
    {
        c = slidingpanelayout;
        super();
    }
}
