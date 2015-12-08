// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator.android.osp;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package com.viewpagerindicator.android.osp:
//            ViewPager

class this._cls0 extends AccessibilityDelegateCompat
{

    final ViewPager this$0;

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(view, accessibilityevent);
        accessibilityevent.setClassName(com/viewpagerindicator/android/osp/ViewPager.getName());
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        boolean flag = true;
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
        accessibilitynodeinfocompat.setClassName(com/viewpagerindicator/android/osp/ViewPager.getName());
        if (ViewPager.access$200(ViewPager.this) == null || ViewPager.access$200(ViewPager.this).getCount() <= 1)
        {
            flag = false;
        }
        accessibilitynodeinfocompat.setScrollable(flag);
        if (ViewPager.access$200(ViewPager.this) != null && ViewPager.access$300(ViewPager.this) >= 0 && ViewPager.access$300(ViewPager.this) < ViewPager.access$200(ViewPager.this).getCount() - 1)
        {
            accessibilitynodeinfocompat.addAction(4096);
        }
        if (ViewPager.access$200(ViewPager.this) != null && ViewPager.access$300(ViewPager.this) > 0 && ViewPager.access$300(ViewPager.this) < ViewPager.access$200(ViewPager.this).getCount())
        {
            accessibilitynodeinfocompat.addAction(8192);
        }
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        if (super.performAccessibilityAction(view, i, bundle))
        {
            return true;
        }
        switch (i)
        {
        default:
            return false;

        case 4096: 
            if (ViewPager.access$200(ViewPager.this) != null && ViewPager.access$300(ViewPager.this) >= 0 && ViewPager.access$300(ViewPager.this) < ViewPager.access$200(ViewPager.this).getCount() - 1)
            {
                setCurrentItem(ViewPager.access$300(ViewPager.this) + 1);
                return true;
            } else
            {
                return false;
            }

        case 8192: 
            break;
        }
        if (ViewPager.access$200(ViewPager.this) != null && ViewPager.access$300(ViewPager.this) > 0 && ViewPager.access$300(ViewPager.this) < ViewPager.access$200(ViewPager.this).getCount())
        {
            setCurrentItem(ViewPager.access$300(ViewPager.this) - 1);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = ViewPager.this;
        super();
    }
}
