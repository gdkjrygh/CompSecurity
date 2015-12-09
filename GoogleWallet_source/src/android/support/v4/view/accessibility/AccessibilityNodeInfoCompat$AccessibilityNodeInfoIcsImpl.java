// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompatIcs

static class  extends 
{

    public final void addAction(Object obj, int i)
    {
        AccessibilityNodeInfoCompatIcs.addAction(obj, i);
    }

    public final void addChild(Object obj, View view)
    {
        AccessibilityNodeInfoCompatIcs.addChild(obj, view);
    }

    public final int getActions(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.getActions(obj);
    }

    public final void getBoundsInParent(Object obj, Rect rect)
    {
        AccessibilityNodeInfoCompatIcs.getBoundsInParent(obj, rect);
    }

    public final void getBoundsInScreen(Object obj, Rect rect)
    {
        AccessibilityNodeInfoCompatIcs.getBoundsInScreen(obj, rect);
    }

    public final CharSequence getClassName(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.getClassName(obj);
    }

    public final CharSequence getContentDescription(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.getContentDescription(obj);
    }

    public final CharSequence getPackageName(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.getPackageName(obj);
    }

    public final CharSequence getText(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.getText(obj);
    }

    public final boolean isCheckable(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.isCheckable(obj);
    }

    public final boolean isChecked(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.isChecked(obj);
    }

    public final boolean isClickable(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.isClickable(obj);
    }

    public final boolean isEnabled(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.isEnabled(obj);
    }

    public final boolean isFocusable(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.isFocusable(obj);
    }

    public final boolean isFocused(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.isFocused(obj);
    }

    public final boolean isLongClickable(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.isLongClickable(obj);
    }

    public final boolean isPassword(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.isPassword(obj);
    }

    public final boolean isScrollable(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.isScrollable(obj);
    }

    public final boolean isSelected(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.isSelected(obj);
    }

    public final Object obtain(Object obj)
    {
        return AccessibilityNodeInfoCompatIcs.obtain(obj);
    }

    public final void recycle(Object obj)
    {
        AccessibilityNodeInfoCompatIcs.recycle(obj);
    }

    public final void setBoundsInParent(Object obj, Rect rect)
    {
        AccessibilityNodeInfoCompatIcs.setBoundsInParent(obj, rect);
    }

    public final void setBoundsInScreen(Object obj, Rect rect)
    {
        AccessibilityNodeInfoCompatIcs.setBoundsInScreen(obj, rect);
    }

    public final void setClassName(Object obj, CharSequence charsequence)
    {
        AccessibilityNodeInfoCompatIcs.setClassName(obj, charsequence);
    }

    public final void setClickable(Object obj, boolean flag)
    {
        AccessibilityNodeInfoCompatIcs.setClickable(obj, flag);
    }

    public final void setContentDescription(Object obj, CharSequence charsequence)
    {
        AccessibilityNodeInfoCompatIcs.setContentDescription(obj, charsequence);
    }

    public final void setEnabled(Object obj, boolean flag)
    {
        AccessibilityNodeInfoCompatIcs.setEnabled(obj, flag);
    }

    public final void setFocusable(Object obj, boolean flag)
    {
        AccessibilityNodeInfoCompatIcs.setFocusable(obj, flag);
    }

    public final void setFocused(Object obj, boolean flag)
    {
        AccessibilityNodeInfoCompatIcs.setFocused(obj, flag);
    }

    public final void setLongClickable(Object obj, boolean flag)
    {
        AccessibilityNodeInfoCompatIcs.setLongClickable(obj, flag);
    }

    public final void setPackageName(Object obj, CharSequence charsequence)
    {
        AccessibilityNodeInfoCompatIcs.setPackageName(obj, charsequence);
    }

    public final void setParent(Object obj, View view)
    {
        AccessibilityNodeInfoCompatIcs.setParent(obj, view);
    }

    public final void setScrollable(Object obj, boolean flag)
    {
        AccessibilityNodeInfoCompatIcs.setScrollable(obj, flag);
    }

    public final void setSelected(Object obj, boolean flag)
    {
        AccessibilityNodeInfoCompatIcs.setSelected(obj, flag);
    }

    public final void setSource(Object obj, View view)
    {
        AccessibilityNodeInfoCompatIcs.setSource(obj, view);
    }

    ()
    {
    }
}
