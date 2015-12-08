// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.graphics.Rect;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package com.roidapp.baselib.view:
//            FixedDrawerLayout

final class h extends AccessibilityDelegateCompat
{

    final FixedDrawerLayout a;
    private final Rect b = new Rect();

    h(FixedDrawerLayout fixeddrawerlayout)
    {
        a = fixeddrawerlayout;
        super();
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 32)
        {
            view = accessibilityevent.getText();
            accessibilityevent = FixedDrawerLayout.a(a);
            if (accessibilityevent != null)
            {
                int i = a.c(accessibilityevent);
                accessibilityevent = a.a(i);
                if (accessibilityevent != null)
                {
                    view.add(accessibilityevent);
                }
            }
            return true;
        } else
        {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
        }
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(view, accessibilityevent);
        accessibilityevent.setClassName(com/roidapp/baselib/view/FixedDrawerLayout.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain(accessibilitynodeinfocompat);
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat1);
        accessibilitynodeinfocompat.setClassName(com/roidapp/baselib/view/FixedDrawerLayout.getName());
        accessibilitynodeinfocompat.setSource(view);
        Object obj = ViewCompat.getParentForAccessibility(view);
        if (obj instanceof View)
        {
            accessibilitynodeinfocompat.setParent((View)obj);
        }
        obj = b;
        accessibilitynodeinfocompat1.getBoundsInParent(((Rect) (obj)));
        accessibilitynodeinfocompat.setBoundsInParent(((Rect) (obj)));
        accessibilitynodeinfocompat1.getBoundsInScreen(((Rect) (obj)));
        accessibilitynodeinfocompat.setBoundsInScreen(((Rect) (obj)));
        accessibilitynodeinfocompat.setVisibleToUser(accessibilitynodeinfocompat1.isVisibleToUser());
        accessibilitynodeinfocompat.setPackageName(accessibilitynodeinfocompat1.getPackageName());
        accessibilitynodeinfocompat.setClassName(accessibilitynodeinfocompat1.getClassName());
        accessibilitynodeinfocompat.setContentDescription(accessibilitynodeinfocompat1.getContentDescription());
        accessibilitynodeinfocompat.setEnabled(accessibilitynodeinfocompat1.isEnabled());
        accessibilitynodeinfocompat.setClickable(accessibilitynodeinfocompat1.isClickable());
        accessibilitynodeinfocompat.setFocusable(accessibilitynodeinfocompat1.isFocusable());
        accessibilitynodeinfocompat.setFocused(accessibilitynodeinfocompat1.isFocused());
        accessibilitynodeinfocompat.setAccessibilityFocused(accessibilitynodeinfocompat1.isAccessibilityFocused());
        accessibilitynodeinfocompat.setSelected(accessibilitynodeinfocompat1.isSelected());
        accessibilitynodeinfocompat.setLongClickable(accessibilitynodeinfocompat1.isLongClickable());
        accessibilitynodeinfocompat.addAction(accessibilitynodeinfocompat1.getActions());
        accessibilitynodeinfocompat1.recycle();
        view = (ViewGroup)view;
        int j = view.getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view1 = view.getChildAt(i);
            if (FixedDrawerLayout.h(view1))
            {
                accessibilitynodeinfocompat.addChild(view1);
            }
        }

    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (FixedDrawerLayout.h(view))
        {
            return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
        } else
        {
            return false;
        }
    }
}
