// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import cm;
import ds;
import es;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

class a extends cm
{

    final SlidingPaneLayout a;
    private final Rect b = new Rect();

    private void a(es es1, es es2)
    {
        Rect rect = b;
        es2.a(rect);
        es1.b(rect);
        es2.c(rect);
        es1.d(rect);
        es1.c(es2.h());
        es1.a(es2.p());
        es1.b(es2.q());
        es1.c(es2.s());
        es1.h(es2.m());
        es1.f(es2.k());
        es1.a(es2.f());
        es1.b(es2.g());
        es1.d(es2.i());
        es1.e(es2.j());
        es1.g(es2.l());
        es1.a(es2.b());
        es1.b(es2.c());
    }

    public boolean a(View view)
    {
        return a.e(view);
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/SlidingPaneLayout.getName());
    }

    public void onInitializeAccessibilityNodeInfo(View view, es es1)
    {
        es es2 = es.a(es1);
        super.onInitializeAccessibilityNodeInfo(view, es2);
        a(es1, es2);
        es2.t();
        es1.b(android/support/v4/widget/SlidingPaneLayout.getName());
        es1.a(view);
        view = ds.i(view);
        if (view instanceof View)
        {
            es1.c((View)view);
        }
        int j = a.getChildCount();
        for (int i = 0; i < j; i++)
        {
            view = a.getChildAt(i);
            if (!a(view) && view.getVisibility() == 0)
            {
                ds.c(view, 1);
                es1.b(view);
            }
        }

    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (!a(view))
        {
            return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
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
