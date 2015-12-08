// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import aG;
import aJ;
import aY;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import bk;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

final class c extends aG
{

    private final Rect b = new Rect();
    private DrawerLayout c;

    public final void a(View view, bk bk1)
    {
        if (DrawerLayout.b())
        {
            super.a(view, bk1);
        } else
        {
            bk bk2 = bk.a(bk1);
            super.a(view, bk2);
            bk1.a(view);
            Object obj = aY.i(view);
            if (obj instanceof View)
            {
                bk1.c((View)obj);
            }
            obj = b;
            bk2.a(((Rect) (obj)));
            bk1.b(((Rect) (obj)));
            bk2.c(((Rect) (obj)));
            bk1.d(((Rect) (obj)));
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
            bk2.m();
            view = (ViewGroup)view;
            int j = view.getChildCount();
            int i = 0;
            while (i < j) 
            {
                View view1 = view.getChildAt(i);
                if (DrawerLayout.g(view1))
                {
                    bk1.b(view1);
                }
                i++;
            }
        }
        bk1.b(android/support/v4/widget/DrawerLayout.getName());
        bk1.a(false);
        bk1.b(false);
    }

    public final boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (DrawerLayout.b() || DrawerLayout.g(view))
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
            view = DrawerLayout.a(c);
            if (view != null)
            {
                int i = c.c(view);
                view = c;
                i = aJ.a(i, aY.h(view));
                if (i == 3)
                {
                    view = ((DrawerLayout) (view)).e;
                } else
                if (i == 5)
                {
                    view = ((DrawerLayout) (view)).f;
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

    vent(DrawerLayout drawerlayout)
    {
        c = drawerlayout;
        super();
    }
}
