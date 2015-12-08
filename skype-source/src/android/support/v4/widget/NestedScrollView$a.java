// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.accessibility.c;
import android.support.v4.view.accessibility.g;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

// Referenced classes of package android.support.v4.widget:
//            NestedScrollView

static final class  extends a
{

    public final void a(View view, c c1)
    {
        super.a(view, c1);
        view = (NestedScrollView)view;
        c1.b(android/widget/ScrollView.getName());
        if (view.isEnabled())
        {
            int i = android.support.v4.widget.NestedScrollView.a(view);
            if (i > 0)
            {
                c1.i(true);
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

    public final void a(View view, AccessibilityEvent accessibilityevent)
    {
        super.a(view, accessibilityevent);
        view = (NestedScrollView)view;
        accessibilityevent.setClassName(android/widget/ScrollView.getName());
        accessibilityevent = android.support.v4.view.accessibility.a.a(accessibilityevent);
        boolean flag;
        if (android.support.v4.widget.NestedScrollView.a(view) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        accessibilityevent.a(flag);
        accessibilityevent.d(view.getScrollX());
        accessibilityevent.e(view.getScrollY());
        accessibilityevent.f(view.getScrollX());
        accessibilityevent.g(android.support.v4.widget.NestedScrollView.a(view));
    }

    public final boolean a(View view, int i, Bundle bundle)
    {
        if (super.a(view, i, bundle))
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
            i = view.getHeight();
            int j = view.getPaddingBottom();
            int l = view.getPaddingTop();
            i = Math.min(view.getScrollY() + (i - j - l), android.support.v4.widget.NestedScrollView.a(view));
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
            int k = view.getPaddingBottom();
            int i1 = view.getPaddingTop();
            i = Math.max(view.getScrollY() - (i - k - i1), 0);
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
