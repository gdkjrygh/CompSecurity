// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.c;
import android.support.v4.view.accessibility.g;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            a, ViewPager, s

final class a extends a
{

    final ViewPager a;

    private boolean a()
    {
        return ViewPager.b(a) != null && ViewPager.b(a).getCount() > 1;
    }

    public final void a(View view, c c1)
    {
        super.a(view, c1);
        c1.b(android/support/v4/view/ViewPager.getName());
        c1.i(a());
        if (a.canScrollHorizontally(1))
        {
            c1.a(4096);
        }
        if (a.canScrollHorizontally(-1))
        {
            c1.a(8192);
        }
    }

    public final void a(View view, AccessibilityEvent accessibilityevent)
    {
        super.a(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/view/ViewPager.getName());
        view = g.a();
        view.a(a());
        if (accessibilityevent.getEventType() == 4096 && ViewPager.b(a) != null)
        {
            view.a(ViewPager.b(a).getCount());
            view.b(android.support.v4.view.ViewPager.c(a));
            view.c(android.support.v4.view.ViewPager.c(a));
        }
    }

    public final boolean a(View view, int i, Bundle bundle)
    {
        if (super.a(view, i, bundle))
        {
            return true;
        }
        switch (i)
        {
        default:
            return false;

        case 4096: 
            if (a.canScrollHorizontally(1))
            {
                a.setCurrentItem(android.support.v4.view.ViewPager.c(a) + 1);
                return true;
            } else
            {
                return false;
            }

        case 8192: 
            break;
        }
        if (a.canScrollHorizontally(-1))
        {
            a.setCurrentItem(android.support.v4.view.ViewPager.c(a) - 1);
            return true;
        } else
        {
            return false;
        }
    }

    lityEvent(ViewPager viewpager)
    {
        a = viewpager;
        super();
    }
}
