// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.t;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

class b extends a
{

    final DrawerLayout b;
    private final Rect c = new Rect();

    private void a(p.f.a a1, ViewGroup viewgroup)
    {
        int j = viewgroup.getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = viewgroup.getChildAt(i);
            if (DrawerLayout.k(view))
            {
                a1.b(view);
            }
        }

    }

    private void a(p.f.a a1, p.f.a a2)
    {
        Rect rect = c;
        a2.a(rect);
        a1.b(rect);
        a2.c(rect);
        a1.d(rect);
        a1.c(a2.h());
        a1.a(a2.p());
        a1.b(a2.q());
        a1.c(a2.s());
        a1.h(a2.m());
        a1.f(a2.k());
        a1.a(a2.f());
        a1.b(a2.g());
        a1.d(a2.i());
        a1.e(a2.j());
        a1.g(a2.l());
        a1.a(a2.b());
    }

    public void a(View view, p.f.a a1)
    {
        if (DrawerLayout.e())
        {
            super.a(view, a1);
        } else
        {
            p.f.a a2 = p.f.a.a(a1);
            super.a(view, a2);
            a1.a(view);
            android.view.ViewParent viewparent = t.f(view);
            if (viewparent instanceof View)
            {
                a1.c((View)viewparent);
            }
            a(a1, a2);
            a2.t();
            a(a1, (ViewGroup)view);
        }
        a1.b(android/support/v4/widget/DrawerLayout.getName());
        a1.a(false);
        a1.b(false);
    }

    public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (DrawerLayout.e() || DrawerLayout.k(view))
        {
            return super.a(viewgroup, view, accessibilityevent);
        } else
        {
            return false;
        }
    }

    public boolean b(View view, AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 32)
        {
            view = accessibilityevent.getText();
            accessibilityevent = android.support.v4.widget.DrawerLayout.a(b);
            if (accessibilityevent != null)
            {
                int i = b.e(accessibilityevent);
                accessibilityevent = b.a(i);
                if (accessibilityevent != null)
                {
                    view.add(accessibilityevent);
                }
            }
            return true;
        } else
        {
            return super.b(view, accessibilityevent);
        }
    }

    public void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
    }

    vent(DrawerLayout drawerlayout)
    {
        b = drawerlayout;
        super();
    }
}
