// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

class pg extends pe
{

    pg()
    {
    }

    public final void a(Object obj, View view, int j)
    {
        ((AccessibilityNodeInfo)obj).setSource(view, j);
    }

    public final void b(Object obj, View view, int j)
    {
        ((AccessibilityNodeInfo)obj).addChild(view, j);
    }

    public final void h(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setVisibleToUser(flag);
    }

    public final void i(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setAccessibilityFocused(flag);
    }

    public final boolean r(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isVisibleToUser();
    }

    public final boolean s(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isAccessibilityFocused();
    }
}
