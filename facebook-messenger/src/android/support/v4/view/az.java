// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.a;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            a, ViewPager, x

class az extends android.support.v4.view.a
{

    final ViewPager b;

    az(ViewPager viewpager)
    {
        b = viewpager;
        super();
    }

    public void a(View view, a a1)
    {
        boolean flag = true;
        super.a(view, a1);
        a1.a(android/support/v4/view/ViewPager.getName());
        if (android.support.v4.view.ViewPager.a(b) == null || android.support.v4.view.ViewPager.a(b).a() <= 1)
        {
            flag = false;
        }
        a1.a(flag);
        if (android.support.v4.view.ViewPager.a(b) != null && ViewPager.b(b) >= 0 && ViewPager.b(b) < android.support.v4.view.ViewPager.a(b).a() - 1)
        {
            a1.a(4096);
        }
        if (android.support.v4.view.ViewPager.a(b) != null && ViewPager.b(b) > 0 && ViewPager.b(b) < android.support.v4.view.ViewPager.a(b).a())
        {
            a1.a(8192);
        }
    }

    public boolean a(View view, int i, Bundle bundle)
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
            if (android.support.v4.view.ViewPager.a(b) != null && ViewPager.b(b) >= 0 && ViewPager.b(b) < android.support.v4.view.ViewPager.a(b).a() - 1)
            {
                b.setCurrentItem(ViewPager.b(b) + 1);
                return true;
            } else
            {
                return false;
            }

        case 8192: 
            break;
        }
        if (android.support.v4.view.ViewPager.a(b) != null && ViewPager.b(b) > 0 && ViewPager.b(b) < android.support.v4.view.ViewPager.a(b).a())
        {
            b.setCurrentItem(ViewPager.b(b) - 1);
            return true;
        } else
        {
            return false;
        }
    }

    public void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/view/ViewPager.getName());
    }
}
