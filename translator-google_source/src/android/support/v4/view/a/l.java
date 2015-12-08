// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.a:
//            j

class l extends j
{

    l()
    {
    }

    public final void b(Object obj, int k)
    {
        ((AccessibilityNodeInfo)obj).setMovementGranularities(k);
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
}
