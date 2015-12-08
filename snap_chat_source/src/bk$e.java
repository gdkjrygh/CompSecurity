// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.accessibility.AccessibilityNodeInfo;

static class > extends >
{

    public final void b(Object obj, int j)
    {
        ((AccessibilityNodeInfo)obj).setMovementGranularities(j);
    }

    public final void h(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setVisibleToUser(flag);
    }

    public final void i(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setAccessibilityFocused(flag);
    }

    public final int r(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getMovementGranularities();
    }

    public final boolean s(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isVisibleToUser();
    }

    public final boolean t(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isAccessibilityFocused();
    }

    >()
    {
    }
}
