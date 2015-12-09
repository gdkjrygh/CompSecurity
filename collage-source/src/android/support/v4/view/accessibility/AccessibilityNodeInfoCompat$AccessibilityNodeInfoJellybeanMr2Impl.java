// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompatJellybeanMr2

static class  extends 
{

    public List findAccessibilityNodeInfosByViewId(Object obj, String s)
    {
        return AccessibilityNodeInfoCompatJellybeanMr2.findAccessibilityNodeInfosByViewId(obj, s);
    }

    public int getTextSelectionEnd(Object obj)
    {
        return AccessibilityNodeInfoCompatJellybeanMr2.getTextSelectionEnd(obj);
    }

    public int getTextSelectionStart(Object obj)
    {
        return AccessibilityNodeInfoCompatJellybeanMr2.getTextSelectionStart(obj);
    }

    public String getViewIdResourceName(Object obj)
    {
        return AccessibilityNodeInfoCompatJellybeanMr2.getViewIdResourceName(obj);
    }

    public boolean isEditable(Object obj)
    {
        return AccessibilityNodeInfoCompatJellybeanMr2.isEditable(obj);
    }

    public boolean refresh(Object obj)
    {
        return AccessibilityNodeInfoCompatJellybeanMr2.refresh(obj);
    }

    public void setEditable(Object obj, boolean flag)
    {
        AccessibilityNodeInfoCompatJellybeanMr2.setEditable(obj, flag);
    }

    public void setTextSelection(Object obj, int i, int j)
    {
        AccessibilityNodeInfoCompatJellybeanMr2.setTextSelection(obj, i, j);
    }

    public void setViewIdResourceName(Object obj, String s)
    {
        AccessibilityNodeInfoCompatJellybeanMr2.setViewIdResourceName(obj, s);
    }

    ()
    {
    }
}
