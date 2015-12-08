// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            AccessibilityDelegateCompat, ViewPager, PagerAdapter

class  extends AccessibilityDelegateCompat
{

    final ViewPager b;

    private boolean b()
    {
        return ViewPager.access$200(b) != null && ViewPager.access$200(b).getCount() > 1;
    }

    public void a(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        super.a(view, accessibilitynodeinfocompat);
        accessibilitynodeinfocompat.b(android/support/v4/view/ViewPager.getName());
        accessibilitynodeinfocompat.i(b());
        if (b.canScrollHorizontally(1))
        {
            accessibilitynodeinfocompat.a(4096);
        }
        if (b.canScrollHorizontally(-1))
        {
            accessibilitynodeinfocompat.a(8192);
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
            if (b.canScrollHorizontally(1))
            {
                b.setCurrentItem(ViewPager.access$300(b) + 1);
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
            b.setCurrentItem(ViewPager.access$300(b) - 1);
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
        view = AccessibilityRecordCompat.a();
        view.a(b());
        if (accessibilityevent.getEventType() == 4096 && ViewPager.access$200(b) != null)
        {
            view.a(ViewPager.access$200(b).getCount());
            view.b(ViewPager.access$300(b));
            view.c(ViewPager.access$300(b));
        }
    }

    oCompat(ViewPager viewpager)
    {
        b = viewpager;
        super();
    }
}
