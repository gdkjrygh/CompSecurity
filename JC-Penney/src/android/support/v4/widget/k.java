// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.bq;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

class k extends a
{

    final DrawerLayout b;
    private final Rect c = new Rect();

    k(DrawerLayout drawerlayout)
    {
        b = drawerlayout;
        super();
    }

    private void a(android.support.v4.view.a.a a1, android.support.v4.view.a.a a2)
    {
        Rect rect = c;
        a2.a(rect);
        a1.b(rect);
        a2.c(rect);
        a1.d(rect);
        a1.c(a2.g());
        a1.a(a2.o());
        a1.b(a2.p());
        a1.c(a2.r());
        a1.h(a2.l());
        a1.f(a2.j());
        a1.a(a2.e());
        a1.b(a2.f());
        a1.d(a2.h());
        a1.e(a2.i());
        a1.g(a2.k());
        a1.a(a2.b());
    }

    private void a(android.support.v4.view.a.a a1, ViewGroup viewgroup)
    {
        int j = viewgroup.getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = viewgroup.getChildAt(i);
            if (DrawerLayout.l(view))
            {
                a1.b(view);
            }
        }

    }

    public void a(View view, android.support.v4.view.a.a a1)
    {
        if (DrawerLayout.e())
        {
            super.a(view, a1);
        } else
        {
            android.support.v4.view.a.a a2 = android.support.v4.view.a.a.a(a1);
            super.a(view, a2);
            a1.a(view);
            android.view.ViewParent viewparent = bq.f(view);
            if (viewparent instanceof View)
            {
                a1.c((View)viewparent);
            }
            a(a1, a2);
            a2.s();
            a(a1, (ViewGroup)view);
        }
        a1.b(android/support/v4/widget/DrawerLayout.getName());
        a1.a(false);
        a1.b(false);
        a1.a(b.a);
        a1.a(b.b);
    }

    public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (DrawerLayout.e() || DrawerLayout.l(view))
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
}
