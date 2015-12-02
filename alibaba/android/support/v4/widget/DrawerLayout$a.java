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
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

class a extends cm
{

    final DrawerLayout a;
    private final Rect b = new Rect();

    private void a(es es1, ViewGroup viewgroup)
    {
        int j = viewgroup.getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = viewgroup.getChildAt(i);
            if (DrawerLayout.l(view))
            {
                es1.b(view);
            }
        }

    }

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
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 32)
        {
            view = accessibilityevent.getText();
            accessibilityevent = DrawerLayout.a(a);
            if (accessibilityevent != null)
            {
                int i = a.e(accessibilityevent);
                accessibilityevent = a.a(i);
                if (accessibilityevent != null)
                {
                    view.add(accessibilityevent);
                }
            }
            return true;
        } else
        {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
        }
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
    }

    public void onInitializeAccessibilityNodeInfo(View view, es es1)
    {
        if (DrawerLayout.e())
        {
            super.onInitializeAccessibilityNodeInfo(view, es1);
        } else
        {
            es es2 = es.a(es1);
            super.onInitializeAccessibilityNodeInfo(view, es2);
            es1.a(view);
            android.view.ViewParent viewparent = ds.i(view);
            if (viewparent instanceof View)
            {
                es1.c((View)viewparent);
            }
            a(es1, es2);
            es2.t();
            a(es1, (ViewGroup)view);
        }
        es1.b(android/support/v4/widget/DrawerLayout.getName());
        es1.a(false);
        es1.b(false);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (DrawerLayout.e() || DrawerLayout.l(view))
        {
            return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
        } else
        {
            return false;
        }
    }

    vent(DrawerLayout drawerlayout)
    {
        a = drawerlayout;
        super();
    }
}
