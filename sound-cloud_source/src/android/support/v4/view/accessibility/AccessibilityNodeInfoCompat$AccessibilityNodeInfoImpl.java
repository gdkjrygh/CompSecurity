// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat

static interface a
{

    public abstract void addAction(Object obj, int i);

    public abstract void addAction(Object obj, Object obj1);

    public abstract void addChild(Object obj, View view);

    public abstract void addChild(Object obj, View view, int i);

    public abstract List findAccessibilityNodeInfosByText(Object obj, String s);

    public abstract Object findFocus(Object obj, int i);

    public abstract Object focusSearch(Object obj, int i);

    public abstract int getAccessibilityActionId(Object obj);

    public abstract CharSequence getAccessibilityActionLabel(Object obj);

    public abstract List getActionList(Object obj);

    public abstract int getActions(Object obj);

    public abstract void getBoundsInParent(Object obj, Rect rect);

    public abstract void getBoundsInScreen(Object obj, Rect rect);

    public abstract Object getChild(Object obj, int i);

    public abstract int getChildCount(Object obj);

    public abstract CharSequence getClassName(Object obj);

    public abstract Object getCollectionInfo(Object obj);

    public abstract int getCollectionInfoColumnCount(Object obj);

    public abstract int getCollectionInfoRowCount(Object obj);

    public abstract int getCollectionItemColumnIndex(Object obj);

    public abstract int getCollectionItemColumnSpan(Object obj);

    public abstract Object getCollectionItemInfo(Object obj);

    public abstract int getCollectionItemRowIndex(Object obj);

    public abstract int getCollectionItemRowSpan(Object obj);

    public abstract CharSequence getContentDescription(Object obj);

    public abstract CharSequence getError(Object obj);

    public abstract int getLiveRegion(Object obj);

    public abstract int getMovementGranularities(Object obj);

    public abstract CharSequence getPackageName(Object obj);

    public abstract Object getParent(Object obj);

    public abstract Object getRangeInfo(Object obj);

    public abstract CharSequence getText(Object obj);

    public abstract AccessibilityNodeInfoCompat getTraversalAfter(Object obj);

    public abstract AccessibilityNodeInfoCompat getTraversalBefore(Object obj);

    public abstract String getViewIdResourceName(Object obj);

    public abstract int getWindowId(Object obj);

    public abstract boolean isAccessibilityFocused(Object obj);

    public abstract boolean isCheckable(Object obj);

    public abstract boolean isChecked(Object obj);

    public abstract boolean isClickable(Object obj);

    public abstract boolean isCollectionInfoHierarchical(Object obj);

    public abstract boolean isCollectionItemHeading(Object obj);

    public abstract boolean isCollectionItemSelected(Object obj);

    public abstract boolean isContentInvalid(Object obj);

    public abstract boolean isEnabled(Object obj);

    public abstract boolean isFocusable(Object obj);

    public abstract boolean isFocused(Object obj);

    public abstract boolean isLongClickable(Object obj);

    public abstract boolean isPassword(Object obj);

    public abstract boolean isScrollable(Object obj);

    public abstract boolean isSelected(Object obj);

    public abstract boolean isVisibleToUser(Object obj);

    public abstract Object newAccessibilityAction(int i, CharSequence charsequence);

    public abstract Object obtain();

    public abstract Object obtain(View view);

    public abstract Object obtain(View view, int i);

    public abstract Object obtain(Object obj);

    public abstract Object obtainCollectionInfo(int i, int j, boolean flag, int k);

    public abstract Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1);

    public abstract boolean performAction(Object obj, int i);

    public abstract boolean performAction(Object obj, int i, Bundle bundle);

    public abstract void recycle(Object obj);

    public abstract void setAccessibilityFocused(Object obj, boolean flag);

    public abstract void setBoundsInParent(Object obj, Rect rect);

    public abstract void setBoundsInScreen(Object obj, Rect rect);

    public abstract void setCheckable(Object obj, boolean flag);

    public abstract void setChecked(Object obj, boolean flag);

    public abstract void setClassName(Object obj, CharSequence charsequence);

    public abstract void setClickable(Object obj, boolean flag);

    public abstract void setCollectionInfo(Object obj, Object obj1);

    public abstract void setCollectionItemInfo(Object obj, Object obj1);

    public abstract void setContentDescription(Object obj, CharSequence charsequence);

    public abstract void setContentInvalid(Object obj, boolean flag);

    public abstract void setEnabled(Object obj, boolean flag);

    public abstract void setError(Object obj, CharSequence charsequence);

    public abstract void setFocusable(Object obj, boolean flag);

    public abstract void setFocused(Object obj, boolean flag);

    public abstract void setLabelFor(Object obj, View view);

    public abstract void setLabelFor(Object obj, View view, int i);

    public abstract void setLiveRegion(Object obj, int i);

    public abstract void setLongClickable(Object obj, boolean flag);

    public abstract void setMovementGranularities(Object obj, int i);

    public abstract void setPackageName(Object obj, CharSequence charsequence);

    public abstract void setParent(Object obj, View view);

    public abstract void setParent(Object obj, View view, int i);

    public abstract void setPassword(Object obj, boolean flag);

    public abstract void setScrollable(Object obj, boolean flag);

    public abstract void setSelected(Object obj, boolean flag);

    public abstract void setSource(Object obj, View view);

    public abstract void setSource(Object obj, View view, int i);

    public abstract void setText(Object obj, CharSequence charsequence);

    public abstract void setTraversalAfter(Object obj, View view);

    public abstract void setTraversalAfter(Object obj, View view, int i);

    public abstract void setTraversalBefore(Object obj, View view);

    public abstract void setTraversalBefore(Object obj, View view, int i);

    public abstract void setViewIdResourceName(Object obj, String s);

    public abstract void setVisibleToUser(Object obj, boolean flag);
}
