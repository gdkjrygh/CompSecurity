// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            AccessibilityDelegateCompat, ViewPager, ModifiedViewPager, PagerAdapter

class this._cls0 extends AccessibilityDelegateCompat
{

    final ModifiedViewPager this$0;

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/view/ViewPager.getName());
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        boolean flag = true;
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
        accessibilitynodeinfocompat.setClassName(android/support/v4/view/ViewPager.getName());
        if (ModifiedViewPager.access$200(ModifiedViewPager.this) == null || ModifiedViewPager.access$200(ModifiedViewPager.this).getCount() <= 1)
        {
            flag = false;
        }
        accessibilitynodeinfocompat.setScrollable(flag);
        if (ModifiedViewPager.access$200(ModifiedViewPager.this) != null && ModifiedViewPager.access$300(ModifiedViewPager.this) >= 0 && ModifiedViewPager.access$300(ModifiedViewPager.this) < ModifiedViewPager.access$200(ModifiedViewPager.this).getCount() - 1)
        {
            accessibilitynodeinfocompat.addAction(4096);
        }
        if (ModifiedViewPager.access$200(ModifiedViewPager.this) != null && ModifiedViewPager.access$300(ModifiedViewPager.this) > 0 && ModifiedViewPager.access$300(ModifiedViewPager.this) < ModifiedViewPager.access$200(ModifiedViewPager.this).getCount())
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
            if (ModifiedViewPager.access$200(ModifiedViewPager.this) != null && ModifiedViewPager.access$300(ModifiedViewPager.this) >= 0 && ModifiedViewPager.access$300(ModifiedViewPager.this) < ModifiedViewPager.access$200(ModifiedViewPager.this).getCount() - 1)
            {
                setCurrentItem(ModifiedViewPager.access$300(ModifiedViewPager.this) + 1);
                return true;
            } else
            {
                return false;
            }

        case 8192: 
            break;
        }
        if (ModifiedViewPager.access$200(ModifiedViewPager.this) != null && ModifiedViewPager.access$300(ModifiedViewPager.this) > 0 && ModifiedViewPager.access$300(ModifiedViewPager.this) < ModifiedViewPager.access$200(ModifiedViewPager.this).getCount())
        {
            setCurrentItem(ModifiedViewPager.access$300(ModifiedViewPager.this) - 1);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = ModifiedViewPager.this;
        super();
    }
}
