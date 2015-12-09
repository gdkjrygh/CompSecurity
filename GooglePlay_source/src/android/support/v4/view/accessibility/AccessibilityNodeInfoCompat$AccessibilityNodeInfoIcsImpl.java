// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat

static class  extends 
{

    public final void addAction(Object obj, int i)
    {
        ((AccessibilityNodeInfo)obj).addAction(i);
    }

    public final void addChild(Object obj, View view)
    {
        ((AccessibilityNodeInfo)obj).addChild(view);
    }

    public final int getActions(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getActions();
    }

    public final void getBoundsInParent(Object obj, Rect rect)
    {
        ((AccessibilityNodeInfo)obj).getBoundsInParent(rect);
    }

    public final void getBoundsInScreen(Object obj, Rect rect)
    {
        ((AccessibilityNodeInfo)obj).getBoundsInScreen(rect);
    }

    public final CharSequence getClassName(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getClassName();
    }

    public final CharSequence getContentDescription(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getContentDescription();
    }

    public final CharSequence getPackageName(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getPackageName();
    }

    public final CharSequence getText(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getText();
    }

    public final boolean isCheckable(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isCheckable();
    }

    public final boolean isChecked(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isChecked();
    }

    public final boolean isClickable(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isClickable();
    }

    public final boolean isEnabled(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isEnabled();
    }

    public final boolean isFocusable(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isFocusable();
    }

    public final boolean isFocused(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isFocused();
    }

    public final boolean isLongClickable(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isLongClickable();
    }

    public final boolean isPassword(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isPassword();
    }

    public final boolean isScrollable(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isScrollable();
    }

    public final boolean isSelected(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isSelected();
    }

    public final Object obtain(Object obj)
    {
        return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)obj);
    }

    public final void recycle(Object obj)
    {
        ((AccessibilityNodeInfo)obj).recycle();
    }

    public final void setBoundsInParent(Object obj, Rect rect)
    {
        ((AccessibilityNodeInfo)obj).setBoundsInParent(rect);
    }

    public final void setBoundsInScreen(Object obj, Rect rect)
    {
        ((AccessibilityNodeInfo)obj).setBoundsInScreen(rect);
    }

    public final void setClassName(Object obj, CharSequence charsequence)
    {
        ((AccessibilityNodeInfo)obj).setClassName(charsequence);
    }

    public final void setClickable(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setClickable(flag);
    }

    public final void setContentDescription(Object obj, CharSequence charsequence)
    {
        ((AccessibilityNodeInfo)obj).setContentDescription(charsequence);
    }

    public final void setEnabled(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setEnabled(flag);
    }

    public final void setFocusable(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setFocusable(flag);
    }

    public final void setFocused(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setFocused(flag);
    }

    public final void setLongClickable(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setLongClickable(flag);
    }

    public final void setPackageName(Object obj, CharSequence charsequence)
    {
        ((AccessibilityNodeInfo)obj).setPackageName(charsequence);
    }

    public final void setParent(Object obj, View view)
    {
        ((AccessibilityNodeInfo)obj).setParent(view);
    }

    public final void setScrollable(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setScrollable(flag);
    }

    public final void setSelected(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setSelected(flag);
    }

    public final void setSource(Object obj, View view)
    {
        ((AccessibilityNodeInfo)obj).setSource(view);
    }

    ()
    {
    }
}
