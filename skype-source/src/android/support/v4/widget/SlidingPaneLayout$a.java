// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.accessibility.c;
import android.support.v4.view.x;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

final class a extends a
{

    final SlidingPaneLayout a;
    private final Rect c = new Rect();

    private boolean b(View view)
    {
        return a.b(view);
    }

    public final void a(View view, c c1)
    {
        c c2 = android.support.v4.view.accessibility.c.a(c1);
        super.a(view, c2);
        Rect rect = c;
        c2.a(rect);
        c1.b(rect);
        c2.c(rect);
        c1.d(rect);
        c1.c(c2.f());
        c1.a(c2.l());
        c1.b(c2.m());
        c1.d(c2.n());
        c1.h(c2.k());
        c1.f(c2.i());
        c1.a(c2.d());
        c1.b(c2.e());
        c1.d(c2.g());
        c1.e(c2.h());
        c1.g(c2.j());
        c1.a(c2.b());
        c1.b(c2.c());
        c2.o();
        c1.b(android/support/v4/widget/SlidingPaneLayout.getName());
        c1.a(view);
        view = x.i(view);
        if (view instanceof View)
        {
            c1.c((View)view);
        }
        int j = a.getChildCount();
        for (int i = 0; i < j; i++)
        {
            view = a.getChildAt(i);
            if (!b(view) && view.getVisibility() == 0)
            {
                x.c(view, 1);
                c1.b(view);
            }
        }

    }

    public final void a(View view, AccessibilityEvent accessibilityevent)
    {
        super.a(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/SlidingPaneLayout.getName());
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

    (SlidingPaneLayout slidingpanelayout)
    {
        a = slidingpanelayout;
        super();
    }
}
