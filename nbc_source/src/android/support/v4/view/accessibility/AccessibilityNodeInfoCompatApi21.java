// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatApi21
{

    public static Object obtainCollectionInfo(int i, int j, boolean flag, int k)
    {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag, k);
    }

    public static Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
    {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag, flag1);
    }

    public static void setError(Object obj, CharSequence charsequence)
    {
        ((AccessibilityNodeInfo)obj).setError(charsequence);
    }

    public static void setLabelFor(Object obj, View view)
    {
        ((AccessibilityNodeInfo)obj).setLabelFor(view);
    }
}
