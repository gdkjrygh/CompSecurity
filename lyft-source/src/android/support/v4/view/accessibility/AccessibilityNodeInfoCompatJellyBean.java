// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatJellyBean
{

    public static void a(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setVisibleToUser(flag);
    }

    public static boolean a(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isVisibleToUser();
    }

    public static void b(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setAccessibilityFocused(flag);
    }

    public static boolean b(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isAccessibilityFocused();
    }
}
