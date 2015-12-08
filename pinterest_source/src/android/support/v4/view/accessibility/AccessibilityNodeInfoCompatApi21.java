// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

class AccessibilityNodeInfoCompatApi21
{

    AccessibilityNodeInfoCompatApi21()
    {
    }

    static void addAction(Object obj, Object obj1)
    {
        ((AccessibilityNodeInfo)obj).addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj1);
    }

    static int getAccessibilityActionId(Object obj)
    {
        return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj).getId();
    }

    static CharSequence getAccessibilityActionLabel(Object obj)
    {
        return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj).getLabel();
    }

    static List getActionList(Object obj)
    {
        return (List)((AccessibilityNodeInfo)obj).getActionList();
    }

    public static CharSequence getError(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getError();
    }

    public static int getMaxTextLength(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getMaxTextLength();
    }

    public static Object getWindow(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getWindow();
    }

    static Object newAccessibilityAction(int i, CharSequence charsequence)
    {
        return new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i, charsequence);
    }

    public static Object obtainCollectionInfo(int i, int j, boolean flag, int k)
    {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag, k);
    }

    public static Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
    {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag, flag1);
    }

    public static boolean removeAction(Object obj, Object obj1)
    {
        return ((AccessibilityNodeInfo)obj).removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj1);
    }

    public static boolean removeChild(Object obj, View view)
    {
        return ((AccessibilityNodeInfo)obj).removeChild(view);
    }

    public static boolean removeChild(Object obj, View view, int i)
    {
        return ((AccessibilityNodeInfo)obj).removeChild(view, i);
    }

    public static void setError(Object obj, CharSequence charsequence)
    {
        ((AccessibilityNodeInfo)obj).setError(charsequence);
    }

    public static void setMaxTextLength(Object obj, int i)
    {
        ((AccessibilityNodeInfo)obj).setMaxTextLength(i);
    }
}
