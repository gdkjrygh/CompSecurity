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
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

final class a extends a
{

    final DrawerLayout a;
    private final Rect c = new Rect();

    public final void a(View view, c c1)
    {
        if (DrawerLayout.g())
        {
            super.a(view, c1);
        } else
        {
            c c2 = android.support.v4.view.accessibility.c.a(c1);
            super.a(view, c2);
            c1.a(view);
            Object obj = x.i(view);
            if (obj instanceof View)
            {
                c1.c((View)obj);
            }
            obj = c;
            c2.a(((Rect) (obj)));
            c1.b(((Rect) (obj)));
            c2.c(((Rect) (obj)));
            c1.d(((Rect) (obj)));
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
            c2.o();
            view = (ViewGroup)view;
            int j = view.getChildCount();
            int i = 0;
            while (i < j) 
            {
                View view1 = view.getChildAt(i);
                if (DrawerLayout.f(view1))
                {
                    c1.b(view1);
                }
                i++;
            }
        }
        c1.b(android/support/v4/widget/DrawerLayout.getName());
        c1.a(false);
        c1.b(false);
        c1.a(android.support.v4.view.accessibility.);
        c1.a(android.support.v4.view.accessibility.);
    }

    public final void a(View view, AccessibilityEvent accessibilityevent)
    {
        super.a(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
    }

    public final boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (DrawerLayout.g() || DrawerLayout.f(view))
        {
            return super.a(viewgroup, view, accessibilityevent);
        } else
        {
            return false;
        }
    }

    public final boolean d(View view, AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 32)
        {
            view = accessibilityevent.getText();
            accessibilityevent = android.support.v4.widget.DrawerLayout.a(a);
            if (accessibilityevent != null)
            {
                int i = a.c(accessibilityevent);
                accessibilityevent = a.a(i);
                if (accessibilityevent != null)
                {
                    view.add(accessibilityevent);
                }
            }
            return true;
        } else
        {
            return super.d(view, accessibilityevent);
        }
    }

    vent(DrawerLayout drawerlayout)
    {
        a = drawerlayout;
        super();
    }
}
