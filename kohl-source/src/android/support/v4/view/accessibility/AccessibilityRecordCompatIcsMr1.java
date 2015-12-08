// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityRecord;

class AccessibilityRecordCompatIcsMr1
{

    AccessibilityRecordCompatIcsMr1()
    {
    }

    public static int getMaxScrollX(Object obj)
    {
        return ((AccessibilityRecord)obj).getMaxScrollX();
    }

    public static int getMaxScrollY(Object obj)
    {
        return ((AccessibilityRecord)obj).getMaxScrollY();
    }

    public static void setMaxScrollX(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setMaxScrollX(i);
    }

    public static void setMaxScrollY(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setMaxScrollY(i);
    }
}
