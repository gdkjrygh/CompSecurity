// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.c;
import android.support.v4.view.a.g;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

// Referenced classes of package android.support.v4.widget:
//            NestedScrollView

static final class  extends a
{

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(view, accessibilityevent);
        view = (NestedScrollView)view;
        accessibilityevent.setClassName(android/widget/ScrollView.getName());
        accessibilityevent = android.support.v4.view.a.a.a(accessibilityevent);
        int i;
        boolean flag;
        if (android.support.v4.widget.NestedScrollView.a(view) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        accessibilityevent.a(flag);
        i = view.getScrollX();
        g.a.tScrollX(((g) (accessibilityevent)).b, i);
        i = view.getScrollY();
        g.a.tScrollY(((g) (accessibilityevent)).b, i);
        i = view.getScrollX();
        g.a.tScrollX(((g) (accessibilityevent)).b, i);
        i = android.support.v4.widget.NestedScrollView.a(view);
        g.a.tScrollX(((g) (accessibilityevent)).b, i);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, c c1)
    {
        super.onInitializeAccessibilityNodeInfo(view, c1);
        view = (NestedScrollView)view;
        c1.b(android/widget/ScrollView.getName());
        if (view.isEnabled())
        {
            int i = android.support.v4.widget.NestedScrollView.a(view);
            if (i > 0)
            {
                c1.f(true);
                if (view.getScrollY() > 0)
                {
                    c1.a(8192);
                }
                if (view.getScrollY() < i)
                {
                    c1.a(4096);
                }
            }
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        if (super.performAccessibilityAction(view, i, bundle))
        {
            return true;
        }
        view = (NestedScrollView)view;
        if (!view.isEnabled())
        {
            return false;
        }
        switch (i)
        {
        default:
            return false;

        case 4096: 
            i = Math.min((view.getHeight() - view.getPaddingBottom() - view.getPaddingTop()) + view.getScrollY(), android.support.v4.widget.NestedScrollView.a(view));
            if (i != view.getScrollY())
            {
                view.a(i);
                return true;
            } else
            {
                return false;
            }

        case 8192: 
            i = view.getHeight();
            int j = view.getPaddingBottom();
            int k = view.getPaddingTop();
            i = Math.max(view.getScrollY() - (i - j - k), 0);
            break;
        }
        if (i != view.getScrollY())
        {
            view.a(i);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
    }
}
