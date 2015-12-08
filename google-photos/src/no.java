// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class no extends kc
{

    private ViewPager b;

    public no(ViewPager viewpager)
    {
        b = viewpager;
        super();
    }

    private boolean a()
    {
        return ViewPager.a(b) != null && ViewPager.a(b).b() > 1;
    }

    public final void a(View view, pa pa1)
    {
        super.a(view, pa1);
        pa1.b(android/support/v4/view/ViewPager.getName());
        pa1.f(a());
        if (b.canScrollHorizontally(1))
        {
            pa1.a(4096);
        }
        if (b.canScrollHorizontally(-1))
        {
            pa1.a(8192);
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
            if (b.canScrollHorizontally(1))
            {
                b.a(ViewPager.b(b) + 1);
                return true;
            } else
            {
                return false;
            }

        case 8192: 
            break;
        }
        if (b.canScrollHorizontally(-1))
        {
            b.a(ViewPager.b(b) - 1);
            return true;
        } else
        {
            return false;
        }
    }

    public final void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/view/ViewPager.getName());
        view = pw.a();
        view.a(a());
        if (accessibilityevent.getEventType() == 4096 && ViewPager.a(b) != null)
        {
            view.a(ViewPager.a(b).b());
            view.b(ViewPager.b(b));
            view.c(ViewPager.b(b));
        }
    }
}
