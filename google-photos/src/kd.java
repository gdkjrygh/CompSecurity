// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

class kd extends kf
{

    kd()
    {
    }

    public final Object a()
    {
        return new android.view.View.AccessibilityDelegate();
    }

    public Object a(kc kc)
    {
        return new ki(new ke(this, kc));
    }

    public final void a(Object obj, View view, int i)
    {
        ((android.view.View.AccessibilityDelegate)obj).sendAccessibilityEvent(view, i);
    }

    public final void a(Object obj, View view, pa pa1)
    {
        pa1 = ((pa) (pa1.b));
        ((android.view.View.AccessibilityDelegate)obj).onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo)pa1);
    }

    public final boolean a(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        return ((android.view.View.AccessibilityDelegate)obj).dispatchPopulateAccessibilityEvent(view, accessibilityevent);
    }

    public final boolean a(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return ((android.view.View.AccessibilityDelegate)obj).onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
    }

    public final void b(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        ((android.view.View.AccessibilityDelegate)obj).onInitializeAccessibilityEvent(view, accessibilityevent);
    }

    public final void c(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        ((android.view.View.AccessibilityDelegate)obj).onPopulateAccessibilityEvent(view, accessibilityevent);
    }

    public final void d(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
        ((android.view.View.AccessibilityDelegate)obj).sendAccessibilityEventUnchecked(view, accessibilityevent);
    }
}
