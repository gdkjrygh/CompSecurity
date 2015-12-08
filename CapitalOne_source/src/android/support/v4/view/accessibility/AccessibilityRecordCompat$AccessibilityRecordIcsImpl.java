// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Parcelable;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityRecordCompat, AccessibilityRecordCompatIcs, AccessibilityNodeInfoCompat

static class  extends 
{

    public int getAddedCount(Object obj)
    {
        return AccessibilityRecordCompatIcs.getAddedCount(obj);
    }

    public CharSequence getBeforeText(Object obj)
    {
        return AccessibilityRecordCompatIcs.getBeforeText(obj);
    }

    public CharSequence getClassName(Object obj)
    {
        return AccessibilityRecordCompatIcs.getClassName(obj);
    }

    public CharSequence getContentDescription(Object obj)
    {
        return AccessibilityRecordCompatIcs.getContentDescription(obj);
    }

    public int getCurrentItemIndex(Object obj)
    {
        return AccessibilityRecordCompatIcs.getCurrentItemIndex(obj);
    }

    public int getFromIndex(Object obj)
    {
        return AccessibilityRecordCompatIcs.getFromIndex(obj);
    }

    public int getItemCount(Object obj)
    {
        return AccessibilityRecordCompatIcs.getItemCount(obj);
    }

    public Parcelable getParcelableData(Object obj)
    {
        return AccessibilityRecordCompatIcs.getParcelableData(obj);
    }

    public int getRemovedCount(Object obj)
    {
        return AccessibilityRecordCompatIcs.getRemovedCount(obj);
    }

    public int getScrollX(Object obj)
    {
        return AccessibilityRecordCompatIcs.getScrollX(obj);
    }

    public int getScrollY(Object obj)
    {
        return AccessibilityRecordCompatIcs.getScrollY(obj);
    }

    public AccessibilityNodeInfoCompat getSource(Object obj)
    {
        return AccessibilityNodeInfoCompat.wrapNonNullInstance(AccessibilityRecordCompatIcs.getSource(obj));
    }

    public List getText(Object obj)
    {
        return AccessibilityRecordCompatIcs.getText(obj);
    }

    public int getToIndex(Object obj)
    {
        return AccessibilityRecordCompatIcs.getToIndex(obj);
    }

    public int getWindowId(Object obj)
    {
        return AccessibilityRecordCompatIcs.getWindowId(obj);
    }

    public boolean isChecked(Object obj)
    {
        return AccessibilityRecordCompatIcs.isChecked(obj);
    }

    public boolean isEnabled(Object obj)
    {
        return AccessibilityRecordCompatIcs.isEnabled(obj);
    }

    public boolean isFullScreen(Object obj)
    {
        return AccessibilityRecordCompatIcs.isFullScreen(obj);
    }

    public boolean isPassword(Object obj)
    {
        return AccessibilityRecordCompatIcs.isPassword(obj);
    }

    public boolean isScrollable(Object obj)
    {
        return AccessibilityRecordCompatIcs.isScrollable(obj);
    }

    public Object obtain()
    {
        return AccessibilityRecordCompatIcs.obtain();
    }

    public Object obtain(Object obj)
    {
        return AccessibilityRecordCompatIcs.obtain(obj);
    }

    public void recycle(Object obj)
    {
        AccessibilityRecordCompatIcs.recycle(obj);
    }

    public void setAddedCount(Object obj, int i)
    {
        AccessibilityRecordCompatIcs.setAddedCount(obj, i);
    }

    public void setBeforeText(Object obj, CharSequence charsequence)
    {
        AccessibilityRecordCompatIcs.setBeforeText(obj, charsequence);
    }

    public void setChecked(Object obj, boolean flag)
    {
        AccessibilityRecordCompatIcs.setChecked(obj, flag);
    }

    public void setClassName(Object obj, CharSequence charsequence)
    {
        AccessibilityRecordCompatIcs.setClassName(obj, charsequence);
    }

    public void setContentDescription(Object obj, CharSequence charsequence)
    {
        AccessibilityRecordCompatIcs.setContentDescription(obj, charsequence);
    }

    public void setCurrentItemIndex(Object obj, int i)
    {
        AccessibilityRecordCompatIcs.setCurrentItemIndex(obj, i);
    }

    public void setEnabled(Object obj, boolean flag)
    {
        AccessibilityRecordCompatIcs.setEnabled(obj, flag);
    }

    public void setFromIndex(Object obj, int i)
    {
        AccessibilityRecordCompatIcs.setFromIndex(obj, i);
    }

    public void setFullScreen(Object obj, boolean flag)
    {
        AccessibilityRecordCompatIcs.setFullScreen(obj, flag);
    }

    public void setItemCount(Object obj, int i)
    {
        AccessibilityRecordCompatIcs.setItemCount(obj, i);
    }

    public void setParcelableData(Object obj, Parcelable parcelable)
    {
        AccessibilityRecordCompatIcs.setParcelableData(obj, parcelable);
    }

    public void setPassword(Object obj, boolean flag)
    {
        AccessibilityRecordCompatIcs.setPassword(obj, flag);
    }

    public void setRemovedCount(Object obj, int i)
    {
        AccessibilityRecordCompatIcs.setRemovedCount(obj, i);
    }

    public void setScrollX(Object obj, int i)
    {
        AccessibilityRecordCompatIcs.setScrollX(obj, i);
    }

    public void setScrollY(Object obj, int i)
    {
        AccessibilityRecordCompatIcs.setScrollY(obj, i);
    }

    public void setScrollable(Object obj, boolean flag)
    {
        AccessibilityRecordCompatIcs.setScrollable(obj, flag);
    }

    public void setSource(Object obj, View view)
    {
        AccessibilityRecordCompatIcs.setSource(obj, view);
    }

    public void setToIndex(Object obj, int i)
    {
        AccessibilityRecordCompatIcs.setToIndex(obj, i);
    }

    ()
    {
    }
}
