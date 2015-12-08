// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatJellybeanMr2
{

    AccessibilityNodeInfoCompatJellybeanMr2()
    {
    }

    public static String getViewIdResourceName(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getViewIdResourceName();
    }

    public static void setViewIdResourceName(Object obj, String s)
    {
        ((AccessibilityNodeInfo)obj).setViewIdResourceName(s);
    }
}
