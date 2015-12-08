// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatJellybeanMr1
{

    AccessibilityNodeInfoCompatJellybeanMr1()
    {
    }

    public static Object getLabelFor(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getLabelFor();
    }

    public static Object getLabeledBy(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getLabeledBy();
    }

    public static void setLabelFor(Object obj, View view)
    {
        ((AccessibilityNodeInfo)obj).setLabelFor(view);
    }

    public static void setLabelFor(Object obj, View view, int i)
    {
        ((AccessibilityNodeInfo)obj).setLabelFor(view, i);
    }

    public static void setLabeledBy(Object obj, View view)
    {
        ((AccessibilityNodeInfo)obj).setLabeledBy(view);
    }

    public static void setLabeledBy(Object obj, View view, int i)
    {
        ((AccessibilityNodeInfo)obj).setLabeledBy(view, i);
    }
}
