// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityRecord;

class AccessibilityRecordCompatIcs
{

    public static Object obtain()
    {
        return AccessibilityRecord.obtain();
    }

    public static void setFromIndex(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setFromIndex(i);
    }

    public static void setItemCount(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setItemCount(i);
    }

    public static void setScrollX(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setScrollX(i);
    }

    public static void setScrollY(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setScrollY(i);
    }

    public static void setScrollable(Object obj, boolean flag)
    {
        ((AccessibilityRecord)obj).setScrollable(flag);
    }

    public static void setToIndex(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setToIndex(i);
    }
}
