// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.a:
//            n

class i extends n
{

    i()
    {
    }

    public final int a(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getActions();
    }

    public final void a(Object obj, int i1)
    {
        ((AccessibilityNodeInfo)obj).addAction(i1);
    }

    public final void a(Object obj, Rect rect)
    {
        ((AccessibilityNodeInfo)obj).getBoundsInParent(rect);
    }

    public final void a(Object obj, CharSequence charsequence)
    {
        ((AccessibilityNodeInfo)obj).setClassName(charsequence);
    }

    public final CharSequence b(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getClassName();
    }

    public final void b(Object obj, Rect rect)
    {
        ((AccessibilityNodeInfo)obj).getBoundsInScreen(rect);
    }

    public final CharSequence c(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getContentDescription();
    }

    public final CharSequence d(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getPackageName();
    }

    public final CharSequence e(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getText();
    }

    public final boolean f(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isCheckable();
    }

    public final boolean g(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isChecked();
    }

    public final boolean h(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isClickable();
    }

    public final boolean i(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isEnabled();
    }

    public final boolean j(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isFocusable();
    }

    public final boolean k(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isFocused();
    }

    public final boolean l(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isLongClickable();
    }

    public final boolean m(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isPassword();
    }

    public final boolean n(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isScrollable();
    }

    public final boolean o(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isSelected();
    }

    public final void p(Object obj)
    {
        ((AccessibilityNodeInfo)obj).setParent(null);
    }

    public final void q(Object obj)
    {
        ((AccessibilityNodeInfo)obj).setScrollable(true);
    }
}
