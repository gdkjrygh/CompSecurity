// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.view.accessibility.AccessibilityNodeInfo;

class f
{

    f()
    {
    }

    public static void a(Object obj, int i)
    {
        ((AccessibilityNodeInfo)obj).addAction(i);
    }

    public static void a(Object obj, CharSequence charsequence)
    {
        ((AccessibilityNodeInfo)obj).setClassName(charsequence);
    }

    public static void a(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setScrollable(flag);
    }
}
