// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

class AccessibilityNodeInfoCompatJellybeanMr2
{

    AccessibilityNodeInfoCompatJellybeanMr2()
    {
    }

    public static List findAccessibilityNodeInfosByViewId(Object obj, String s)
    {
        return (List)((AccessibilityNodeInfo)obj).findAccessibilityNodeInfosByViewId(s);
    }

    public static int getTextSelectionEnd(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getTextSelectionEnd();
    }

    public static int getTextSelectionStart(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getTextSelectionStart();
    }

    public static String getViewIdResourceName(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getViewIdResourceName();
    }

    public static boolean isEditable(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isEditable();
    }

    public static boolean refresh(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).refresh();
    }

    public static void setEditable(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setEditable(flag);
    }

    public static void setTextSelection(Object obj, int i, int j)
    {
        ((AccessibilityNodeInfo)obj).setTextSelection(i, j);
    }

    public static void setViewIdResourceName(Object obj, String s)
    {
        ((AccessibilityNodeInfo)obj).setViewIdResourceName(s);
    }
}
