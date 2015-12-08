// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.a.f;
import android.support.v4.view.a.g;
import android.support.v4.view.bt;
import android.support.v4.view.q;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

final class r extends a
{

    final DrawerLayout b;
    private final Rect c = new Rect();

    r(DrawerLayout drawerlayout)
    {
        b = drawerlayout;
        super();
    }

    public final void a(View view, f f1)
    {
        if (DrawerLayout.b())
        {
            super.a(view, f1);
        } else
        {
            f f2 = f.a(f1);
            super.a(view, f2);
            f1.a(view);
            Object obj = bt.f(view);
            if (obj instanceof View)
            {
                f1.c((View)obj);
            }
            obj = c;
            f2.a(((Rect) (obj)));
            f1.b(((Rect) (obj)));
            f2.c(((Rect) (obj)));
            f1.d(((Rect) (obj)));
            f1.c(f2.d());
            f1.a(f2.j());
            f1.b(f2.k());
            f1.c(f2.l());
            f1.h(f2.i());
            f1.f(f2.g());
            f1.a(f2.b());
            f1.b(f2.c());
            f1.d(f2.e());
            f1.e(f2.f());
            f1.g(f2.h());
            f1.a(f2.a());
            f2.m();
            view = (ViewGroup)view;
            int j = view.getChildCount();
            int i = 0;
            while (i < j) 
            {
                View view1 = view.getChildAt(i);
                if (DrawerLayout.h(view1))
                {
                    f1.b(view1);
                }
                i++;
            }
        }
        f1.b(android/support/v4/widget/DrawerLayout.getName());
        f1.a(false);
        f1.b(false);
        f1.a(g.a);
        f1.a(g.b);
    }

    public final boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (DrawerLayout.b() || DrawerLayout.h(view))
        {
            return super.a(viewgroup, view, accessibilityevent);
        } else
        {
            return false;
        }
    }

    public final boolean b(View view, AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 32)
        {
            accessibilityevent = accessibilityevent.getText();
            view = android.support.v4.widget.DrawerLayout.a(b);
            if (view != null)
            {
                int i = b.c(view);
                view = b;
                i = q.a(i, bt.e(view));
                if (i == 3)
                {
                    view = ((DrawerLayout) (view)).f;
                } else
                if (i == 5)
                {
                    view = ((DrawerLayout) (view)).g;
                } else
                {
                    view = null;
                }
                if (view != null)
                {
                    accessibilityevent.add(view);
                }
            }
            return true;
        } else
        {
            return super.b(view, accessibilityevent);
        }
    }

    public final void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
    }
}
