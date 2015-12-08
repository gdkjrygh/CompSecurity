// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatKitKat
{

    AccessibilityNodeInfoCompatKitKat()
    {
    }

    public static boolean canOpenPopup(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).canOpenPopup();
    }

    static Object getCollectionInfo(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getCollectionInfo();
    }

    static Object getCollectionItemInfo(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getCollectionItemInfo();
    }

    public static Bundle getExtras(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getExtras();
    }

    public static int getInputType(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getInputType();
    }

    static int getLiveRegion(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getLiveRegion();
    }

    static Object getRangeInfo(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getRangeInfo();
    }

    public static boolean isContentInvalid(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isContentInvalid();
    }

    public static boolean isDismissable(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isDismissable();
    }

    public static boolean isMultiLine(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isMultiLine();
    }

    public static Object obtainCollectionInfo(int i, int j, boolean flag, int k)
    {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag);
    }

    public static Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag)
    {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag);
    }

    public static void setCanOpenPopup(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setCanOpenPopup(flag);
    }

    public static void setCollectionInfo(Object obj, Object obj1)
    {
        ((AccessibilityNodeInfo)obj).setCollectionInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj1);
    }

    public static void setCollectionItemInfo(Object obj, Object obj1)
    {
        ((AccessibilityNodeInfo)obj).setCollectionItemInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj1);
    }

    public static void setContentInvalid(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setContentInvalid(flag);
    }

    public static void setDismissable(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setDismissable(flag);
    }

    public static void setInputType(Object obj, int i)
    {
        ((AccessibilityNodeInfo)obj).setInputType(i);
    }

    static void setLiveRegion(Object obj, int i)
    {
        ((AccessibilityNodeInfo)obj).setLiveRegion(i);
    }

    public static void setMultiLine(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setMultiLine(flag);
    }

    public static void setRangeInfo(Object obj, Object obj1)
    {
        ((AccessibilityNodeInfo)obj).setRangeInfo((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)obj1);
    }
}
