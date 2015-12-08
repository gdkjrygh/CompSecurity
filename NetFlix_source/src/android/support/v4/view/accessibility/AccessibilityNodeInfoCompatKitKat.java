// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatKitKat
{

    AccessibilityNodeInfoCompatKitKat()
    {
    }

    public static int getLiveRegion(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getLiveRegion();
    }

    public static void setLiveRegion(Object obj, int i)
    {
        ((AccessibilityNodeInfo)obj).setLiveRegion(i);
    }
}
