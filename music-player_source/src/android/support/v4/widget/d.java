// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.an;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

final class d extends a
{

    final DrawerLayout b;
    private final Rect c = new Rect();

    d(DrawerLayout drawerlayout)
    {
        b = drawerlayout;
        super();
    }

    private void a(android.support.v4.view.a.a a1, ViewGroup viewgroup)
    {
        int i;
        int j;
        j = viewgroup.getChildCount();
        i = 0;
_L8:
        View view;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        view = viewgroup.getChildAt(i);
        if (b(view)) goto _L2; else goto _L1
_L1:
        an.d(view);
        JVM INSTR tableswitch 0 4: default 68
    //                   0 96
    //                   1 100
    //                   2 77
    //                   3 68
    //                   4 68;
           goto _L3 _L4 _L5 _L6 _L3 _L3
_L5:
        break MISSING_BLOCK_LABEL_100;
_L3:
        break; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L2:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        if (view instanceof ViewGroup)
        {
            a(a1, (ViewGroup)view);
        }
          goto _L2
_L4:
        an.e(view);
        a1.b(view);
          goto _L2
    }

    private boolean b(View view)
    {
        View view1 = b.a();
        return view1 != null && view1 != view;
    }

    public final void a(View view, android.support.v4.view.a.a a1)
    {
        android.support.v4.view.a.a a2 = android.support.v4.view.a.a.a(a1);
        super.a(view, a2);
        a1.b(android/support/v4/widget/DrawerLayout.getName());
        a1.a(view);
        Object obj = an.h(view);
        if (obj instanceof View)
        {
            a1.c((View)obj);
        }
        obj = c;
        a2.a(((Rect) (obj)));
        a1.b(((Rect) (obj)));
        a2.c(((Rect) (obj)));
        a1.d(((Rect) (obj)));
        a1.c(a2.f());
        a1.a(a2.l());
        a1.b(a2.m());
        a1.c(a2.n());
        a1.h(a2.k());
        a1.f(a2.i());
        a1.a(a2.d());
        a1.b(a2.e());
        a1.d(a2.g());
        a1.e(a2.h());
        a1.g(a2.j());
        a1.a(a2.b());
        a2.o();
        a(a1, (ViewGroup)view);
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

    public final boolean b(View view, AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 32)
        {
            view = accessibilityevent.getText();
            accessibilityevent = android.support.v4.widget.DrawerLayout.a(b);
            if (accessibilityevent != null)
            {
                int i = b.c(accessibilityevent);
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

    public final void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
    }
}
