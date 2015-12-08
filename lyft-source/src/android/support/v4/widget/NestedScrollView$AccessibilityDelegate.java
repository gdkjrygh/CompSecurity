// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

// Referenced classes of package android.support.v4.widget:
//            NestedScrollView

class  extends AccessibilityDelegateCompat
{

    public void a(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        super.a(view, accessibilitynodeinfocompat);
        view = (NestedScrollView)view;
        accessibilitynodeinfocompat.b(android/widget/ScrollView.getName());
        if (view.isEnabled())
        {
            int i = NestedScrollView.a(view);
            if (i > 0)
            {
                accessibilitynodeinfocompat.i(true);
                if (view.getScrollY() > 0)
                {
                    accessibilitynodeinfocompat.a(8192);
                }
                if (view.getScrollY() < i)
                {
                    accessibilitynodeinfocompat.a(4096);
                }
            }
        }
    }

    public boolean a(View view, int i, Bundle bundle)
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
            i = Math.min((view.getHeight() - view.getPaddingBottom() - view.getPaddingTop()) + view.getScrollY(), NestedScrollView.a(view));
            if (i != view.getScrollY())
            {
                view.b(0, i);
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
            view.b(0, i);
            return true;
        } else
        {
            return false;
        }
    }

    public void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        view = (NestedScrollView)view;
        accessibilityevent.setClassName(android/widget/ScrollView.getName());
        accessibilityevent = AccessibilityEventCompat.a(accessibilityevent);
        boolean flag;
        if (NestedScrollView.a(view) > 0)
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
        accessibilityevent.g(NestedScrollView.a(view));
    }

    ()
    {
    }
}
