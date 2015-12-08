// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityWindowInfoCompat, AccessibilityNodeInfoCompatApi21, AccessibilityNodeInfoCompatKitKat, AccessibilityNodeInfoCompatJellybeanMr2, 
//            AccessibilityNodeInfoCompatJellybeanMr1, AccessibilityNodeInfoCompatJellyBean, AccessibilityNodeInfoCompatIcs, AccessibilityNodeInfoCompatApi22

public class AccessibilityNodeInfoCompat
{
    public static class AccessibilityActionCompat
    {

        public static final AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(64, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(128, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_CLEAR_FOCUS = new AccessibilityActionCompat(2, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_CLEAR_SELECTION = new AccessibilityActionCompat(8, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_CLICK = new AccessibilityActionCompat(16, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_COLLAPSE = new AccessibilityActionCompat(0x80000, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_COPY = new AccessibilityActionCompat(16384, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_CUT = new AccessibilityActionCompat(0x10000, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_DISMISS = new AccessibilityActionCompat(0x100000, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_EXPAND = new AccessibilityActionCompat(0x40000, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_FOCUS = new AccessibilityActionCompat(1, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_LONG_CLICK = new AccessibilityActionCompat(32, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(256, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT = new AccessibilityActionCompat(1024, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_PASTE = new AccessibilityActionCompat(32768, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(512, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT = new AccessibilityActionCompat(2048, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_SCROLL_BACKWARD = new AccessibilityActionCompat(8192, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_SCROLL_FORWARD = new AccessibilityActionCompat(4096, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_SELECT = new AccessibilityActionCompat(4, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_SET_SELECTION = new AccessibilityActionCompat(0x20000, ((CharSequence) (null)));
        public static final AccessibilityActionCompat ACTION_SET_TEXT = new AccessibilityActionCompat(0x200000, ((CharSequence) (null)));
        private final Object mAction;

        public int getId()
        {
            return AccessibilityNodeInfoCompat.IMPL.getAccessibilityActionId(mAction);
        }

        public CharSequence getLabel()
        {
            return AccessibilityNodeInfoCompat.IMPL.getAccessibilityActionLabel(mAction);
        }



        public AccessibilityActionCompat(int i, CharSequence charsequence)
        {
            this(AccessibilityNodeInfoCompat.IMPL.newAccessibilityAction(i, charsequence));
        }

        private AccessibilityActionCompat(Object obj)
        {
            mAction = obj;
        }

    }

    static class AccessibilityNodeInfoApi21Impl extends AccessibilityNodeInfoKitKatImpl
    {

        public void addAction(Object obj, Object obj1)
        {
            AccessibilityNodeInfoCompatApi21.addAction(obj, obj1);
        }

        public int getAccessibilityActionId(Object obj)
        {
            return AccessibilityNodeInfoCompatApi21.getAccessibilityActionId(obj);
        }

        public CharSequence getAccessibilityActionLabel(Object obj)
        {
            return AccessibilityNodeInfoCompatApi21.getAccessibilityActionLabel(obj);
        }

        public List getActionList(Object obj)
        {
            return AccessibilityNodeInfoCompatApi21.getActionList(obj);
        }

        public CharSequence getError(Object obj)
        {
            return AccessibilityNodeInfoCompatApi21.getError(obj);
        }

        public int getMaxTextLength(Object obj)
        {
            return AccessibilityNodeInfoCompatApi21.getMaxTextLength(obj);
        }

        public Object getWindow(Object obj)
        {
            return AccessibilityNodeInfoCompatApi21.getWindow(obj);
        }

        public boolean isCollectionItemSelected(Object obj)
        {
            return AccessibilityNodeInfoCompatApi21.CollectionItemInfo.isSelected(obj);
        }

        public Object newAccessibilityAction(int i, CharSequence charsequence)
        {
            return AccessibilityNodeInfoCompatApi21.newAccessibilityAction(i, charsequence);
        }

        public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
        {
            return AccessibilityNodeInfoCompatApi21.obtainCollectionInfo(i, j, flag, k);
        }

        public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
        {
            return AccessibilityNodeInfoCompatApi21.obtainCollectionItemInfo(i, j, k, l, flag, flag1);
        }

        public boolean removeAction(Object obj, Object obj1)
        {
            return AccessibilityNodeInfoCompatApi21.removeAction(obj, obj1);
        }

        public boolean removeChild(Object obj, View view)
        {
            return AccessibilityNodeInfoCompatApi21.removeChild(obj, view);
        }

        public boolean removeChild(Object obj, View view, int i)
        {
            return AccessibilityNodeInfoCompatApi21.removeChild(obj, view, i);
        }

        public void setError(Object obj, CharSequence charsequence)
        {
            AccessibilityNodeInfoCompatApi21.setError(obj, charsequence);
        }

        public void setMaxTextLength(Object obj, int i)
        {
            AccessibilityNodeInfoCompatApi21.setMaxTextLength(obj, i);
        }

        AccessibilityNodeInfoApi21Impl()
        {
        }
    }

    static class AccessibilityNodeInfoApi22Impl extends AccessibilityNodeInfoApi21Impl
    {

        public Object getTraversalAfter(Object obj)
        {
            return AccessibilityNodeInfoCompatApi22.getTraversalAfter(obj);
        }

        public Object getTraversalBefore(Object obj)
        {
            return AccessibilityNodeInfoCompatApi22.getTraversalBefore(obj);
        }

        public void setTraversalAfter(Object obj, View view)
        {
            AccessibilityNodeInfoCompatApi22.setTraversalAfter(obj, view);
        }

        public void setTraversalAfter(Object obj, View view, int i)
        {
            AccessibilityNodeInfoCompatApi22.setTraversalAfter(obj, view, i);
        }

        public void setTraversalBefore(Object obj, View view)
        {
            AccessibilityNodeInfoCompatApi22.setTraversalBefore(obj, view);
        }

        public void setTraversalBefore(Object obj, View view, int i)
        {
            AccessibilityNodeInfoCompatApi22.setTraversalBefore(obj, view, i);
        }

        AccessibilityNodeInfoApi22Impl()
        {
        }
    }

    static class AccessibilityNodeInfoIcsImpl extends AccessibilityNodeInfoStubImpl
    {

        public void addAction(Object obj, int i)
        {
            AccessibilityNodeInfoCompatIcs.addAction(obj, i);
        }

        public void addChild(Object obj, View view)
        {
            AccessibilityNodeInfoCompatIcs.addChild(obj, view);
        }

        public List findAccessibilityNodeInfosByText(Object obj, String s)
        {
            return AccessibilityNodeInfoCompatIcs.findAccessibilityNodeInfosByText(obj, s);
        }

        public int getActions(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.getActions(obj);
        }

        public void getBoundsInParent(Object obj, Rect rect)
        {
            AccessibilityNodeInfoCompatIcs.getBoundsInParent(obj, rect);
        }

        public void getBoundsInScreen(Object obj, Rect rect)
        {
            AccessibilityNodeInfoCompatIcs.getBoundsInScreen(obj, rect);
        }

        public Object getChild(Object obj, int i)
        {
            return AccessibilityNodeInfoCompatIcs.getChild(obj, i);
        }

        public int getChildCount(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.getChildCount(obj);
        }

        public CharSequence getClassName(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.getClassName(obj);
        }

        public CharSequence getContentDescription(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.getContentDescription(obj);
        }

        public CharSequence getPackageName(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.getPackageName(obj);
        }

        public Object getParent(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.getParent(obj);
        }

        public CharSequence getText(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.getText(obj);
        }

        public int getWindowId(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.getWindowId(obj);
        }

        public boolean isCheckable(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.isCheckable(obj);
        }

        public boolean isChecked(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.isChecked(obj);
        }

        public boolean isClickable(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.isClickable(obj);
        }

        public boolean isEnabled(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.isEnabled(obj);
        }

        public boolean isFocusable(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.isFocusable(obj);
        }

        public boolean isFocused(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.isFocused(obj);
        }

        public boolean isLongClickable(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.isLongClickable(obj);
        }

        public boolean isPassword(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.isPassword(obj);
        }

        public boolean isScrollable(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.isScrollable(obj);
        }

        public boolean isSelected(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.isSelected(obj);
        }

        public Object obtain()
        {
            return AccessibilityNodeInfoCompatIcs.obtain();
        }

        public Object obtain(View view)
        {
            return AccessibilityNodeInfoCompatIcs.obtain(view);
        }

        public Object obtain(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.obtain(obj);
        }

        public boolean performAction(Object obj, int i)
        {
            return AccessibilityNodeInfoCompatIcs.performAction(obj, i);
        }

        public void recycle(Object obj)
        {
            AccessibilityNodeInfoCompatIcs.recycle(obj);
        }

        public void setBoundsInParent(Object obj, Rect rect)
        {
            AccessibilityNodeInfoCompatIcs.setBoundsInParent(obj, rect);
        }

        public void setBoundsInScreen(Object obj, Rect rect)
        {
            AccessibilityNodeInfoCompatIcs.setBoundsInScreen(obj, rect);
        }

        public void setCheckable(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatIcs.setCheckable(obj, flag);
        }

        public void setChecked(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatIcs.setChecked(obj, flag);
        }

        public void setClassName(Object obj, CharSequence charsequence)
        {
            AccessibilityNodeInfoCompatIcs.setClassName(obj, charsequence);
        }

        public void setClickable(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatIcs.setClickable(obj, flag);
        }

        public void setContentDescription(Object obj, CharSequence charsequence)
        {
            AccessibilityNodeInfoCompatIcs.setContentDescription(obj, charsequence);
        }

        public void setEnabled(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatIcs.setEnabled(obj, flag);
        }

        public void setFocusable(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatIcs.setFocusable(obj, flag);
        }

        public void setFocused(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatIcs.setFocused(obj, flag);
        }

        public void setLongClickable(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatIcs.setLongClickable(obj, flag);
        }

        public void setPackageName(Object obj, CharSequence charsequence)
        {
            AccessibilityNodeInfoCompatIcs.setPackageName(obj, charsequence);
        }

        public void setParent(Object obj, View view)
        {
            AccessibilityNodeInfoCompatIcs.setParent(obj, view);
        }

        public void setPassword(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatIcs.setPassword(obj, flag);
        }

        public void setScrollable(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatIcs.setScrollable(obj, flag);
        }

        public void setSelected(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatIcs.setSelected(obj, flag);
        }

        public void setSource(Object obj, View view)
        {
            AccessibilityNodeInfoCompatIcs.setSource(obj, view);
        }

        public void setText(Object obj, CharSequence charsequence)
        {
            AccessibilityNodeInfoCompatIcs.setText(obj, charsequence);
        }

        AccessibilityNodeInfoIcsImpl()
        {
        }
    }

    static interface AccessibilityNodeInfoImpl
    {

        public abstract void addAction(Object obj, int i);

        public abstract void addAction(Object obj, Object obj1);

        public abstract void addChild(Object obj, View view);

        public abstract void addChild(Object obj, View view, int i);

        public abstract boolean canOpenPopup(Object obj);

        public abstract List findAccessibilityNodeInfosByText(Object obj, String s);

        public abstract List findAccessibilityNodeInfosByViewId(Object obj, String s);

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

        public abstract Bundle getExtras(Object obj);

        public abstract int getInputType(Object obj);

        public abstract Object getLabelFor(Object obj);

        public abstract Object getLabeledBy(Object obj);

        public abstract int getLiveRegion(Object obj);

        public abstract int getMaxTextLength(Object obj);

        public abstract int getMovementGranularities(Object obj);

        public abstract CharSequence getPackageName(Object obj);

        public abstract Object getParent(Object obj);

        public abstract Object getRangeInfo(Object obj);

        public abstract CharSequence getText(Object obj);

        public abstract int getTextSelectionEnd(Object obj);

        public abstract int getTextSelectionStart(Object obj);

        public abstract Object getTraversalAfter(Object obj);

        public abstract Object getTraversalBefore(Object obj);

        public abstract String getViewIdResourceName(Object obj);

        public abstract Object getWindow(Object obj);

        public abstract int getWindowId(Object obj);

        public abstract boolean isAccessibilityFocused(Object obj);

        public abstract boolean isCheckable(Object obj);

        public abstract boolean isChecked(Object obj);

        public abstract boolean isClickable(Object obj);

        public abstract boolean isCollectionInfoHierarchical(Object obj);

        public abstract boolean isCollectionItemHeading(Object obj);

        public abstract boolean isCollectionItemSelected(Object obj);

        public abstract boolean isContentInvalid(Object obj);

        public abstract boolean isDismissable(Object obj);

        public abstract boolean isEditable(Object obj);

        public abstract boolean isEnabled(Object obj);

        public abstract boolean isFocusable(Object obj);

        public abstract boolean isFocused(Object obj);

        public abstract boolean isLongClickable(Object obj);

        public abstract boolean isMultiLine(Object obj);

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

        public abstract boolean refresh(Object obj);

        public abstract boolean removeAction(Object obj, Object obj1);

        public abstract boolean removeChild(Object obj, View view);

        public abstract boolean removeChild(Object obj, View view, int i);

        public abstract void setAccessibilityFocused(Object obj, boolean flag);

        public abstract void setBoundsInParent(Object obj, Rect rect);

        public abstract void setBoundsInScreen(Object obj, Rect rect);

        public abstract void setCanOpenPopup(Object obj, boolean flag);

        public abstract void setCheckable(Object obj, boolean flag);

        public abstract void setChecked(Object obj, boolean flag);

        public abstract void setClassName(Object obj, CharSequence charsequence);

        public abstract void setClickable(Object obj, boolean flag);

        public abstract void setCollectionInfo(Object obj, Object obj1);

        public abstract void setCollectionItemInfo(Object obj, Object obj1);

        public abstract void setContentDescription(Object obj, CharSequence charsequence);

        public abstract void setContentInvalid(Object obj, boolean flag);

        public abstract void setDismissable(Object obj, boolean flag);

        public abstract void setEditable(Object obj, boolean flag);

        public abstract void setEnabled(Object obj, boolean flag);

        public abstract void setError(Object obj, CharSequence charsequence);

        public abstract void setFocusable(Object obj, boolean flag);

        public abstract void setFocused(Object obj, boolean flag);

        public abstract void setInputType(Object obj, int i);

        public abstract void setLabelFor(Object obj, View view);

        public abstract void setLabelFor(Object obj, View view, int i);

        public abstract void setLabeledBy(Object obj, View view);

        public abstract void setLabeledBy(Object obj, View view, int i);

        public abstract void setLiveRegion(Object obj, int i);

        public abstract void setLongClickable(Object obj, boolean flag);

        public abstract void setMaxTextLength(Object obj, int i);

        public abstract void setMovementGranularities(Object obj, int i);

        public abstract void setMultiLine(Object obj, boolean flag);

        public abstract void setPackageName(Object obj, CharSequence charsequence);

        public abstract void setParent(Object obj, View view);

        public abstract void setParent(Object obj, View view, int i);

        public abstract void setPassword(Object obj, boolean flag);

        public abstract void setRangeInfo(Object obj, Object obj1);

        public abstract void setScrollable(Object obj, boolean flag);

        public abstract void setSelected(Object obj, boolean flag);

        public abstract void setSource(Object obj, View view);

        public abstract void setSource(Object obj, View view, int i);

        public abstract void setText(Object obj, CharSequence charsequence);

        public abstract void setTextSelection(Object obj, int i, int j);

        public abstract void setTraversalAfter(Object obj, View view);

        public abstract void setTraversalAfter(Object obj, View view, int i);

        public abstract void setTraversalBefore(Object obj, View view);

        public abstract void setTraversalBefore(Object obj, View view, int i);

        public abstract void setViewIdResourceName(Object obj, String s);

        public abstract void setVisibleToUser(Object obj, boolean flag);
    }

    static class AccessibilityNodeInfoJellybeanImpl extends AccessibilityNodeInfoIcsImpl
    {

        public void addChild(Object obj, View view, int i)
        {
            AccessibilityNodeInfoCompatJellyBean.addChild(obj, view, i);
        }

        public Object findFocus(Object obj, int i)
        {
            return AccessibilityNodeInfoCompatJellyBean.findFocus(obj, i);
        }

        public Object focusSearch(Object obj, int i)
        {
            return AccessibilityNodeInfoCompatJellyBean.focusSearch(obj, i);
        }

        public int getMovementGranularities(Object obj)
        {
            return AccessibilityNodeInfoCompatJellyBean.getMovementGranularities(obj);
        }

        public boolean isAccessibilityFocused(Object obj)
        {
            return AccessibilityNodeInfoCompatJellyBean.isAccessibilityFocused(obj);
        }

        public boolean isVisibleToUser(Object obj)
        {
            return AccessibilityNodeInfoCompatJellyBean.isVisibleToUser(obj);
        }

        public Object obtain(View view, int i)
        {
            return AccessibilityNodeInfoCompatJellyBean.obtain(view, i);
        }

        public boolean performAction(Object obj, int i, Bundle bundle)
        {
            return AccessibilityNodeInfoCompatJellyBean.performAction(obj, i, bundle);
        }

        public void setAccessibilityFocused(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatJellyBean.setAccesibilityFocused(obj, flag);
        }

        public void setMovementGranularities(Object obj, int i)
        {
            AccessibilityNodeInfoCompatJellyBean.setMovementGranularities(obj, i);
        }

        public void setParent(Object obj, View view, int i)
        {
            AccessibilityNodeInfoCompatJellyBean.setParent(obj, view, i);
        }

        public void setSource(Object obj, View view, int i)
        {
            AccessibilityNodeInfoCompatJellyBean.setSource(obj, view, i);
        }

        public void setVisibleToUser(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatJellyBean.setVisibleToUser(obj, flag);
        }

        AccessibilityNodeInfoJellybeanImpl()
        {
        }
    }

    static class AccessibilityNodeInfoJellybeanMr1Impl extends AccessibilityNodeInfoJellybeanImpl
    {

        public Object getLabelFor(Object obj)
        {
            return AccessibilityNodeInfoCompatJellybeanMr1.getLabelFor(obj);
        }

        public Object getLabeledBy(Object obj)
        {
            return AccessibilityNodeInfoCompatJellybeanMr1.getLabeledBy(obj);
        }

        public void setLabelFor(Object obj, View view)
        {
            AccessibilityNodeInfoCompatJellybeanMr1.setLabelFor(obj, view);
        }

        public void setLabelFor(Object obj, View view, int i)
        {
            AccessibilityNodeInfoCompatJellybeanMr1.setLabelFor(obj, view, i);
        }

        public void setLabeledBy(Object obj, View view)
        {
            AccessibilityNodeInfoCompatJellybeanMr1.setLabeledBy(obj, view);
        }

        public void setLabeledBy(Object obj, View view, int i)
        {
            AccessibilityNodeInfoCompatJellybeanMr1.setLabeledBy(obj, view, i);
        }

        AccessibilityNodeInfoJellybeanMr1Impl()
        {
        }
    }

    static class AccessibilityNodeInfoJellybeanMr2Impl extends AccessibilityNodeInfoJellybeanMr1Impl
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

        AccessibilityNodeInfoJellybeanMr2Impl()
        {
        }
    }

    static class AccessibilityNodeInfoKitKatImpl extends AccessibilityNodeInfoJellybeanMr2Impl
    {

        public boolean canOpenPopup(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.canOpenPopup(obj);
        }

        public Object getCollectionInfo(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.getCollectionInfo(obj);
        }

        public int getCollectionInfoColumnCount(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.CollectionInfo.getColumnCount(obj);
        }

        public int getCollectionInfoRowCount(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.CollectionInfo.getRowCount(obj);
        }

        public int getCollectionItemColumnIndex(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.getColumnIndex(obj);
        }

        public int getCollectionItemColumnSpan(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.getColumnSpan(obj);
        }

        public Object getCollectionItemInfo(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.getCollectionItemInfo(obj);
        }

        public int getCollectionItemRowIndex(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.getRowIndex(obj);
        }

        public int getCollectionItemRowSpan(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.getRowSpan(obj);
        }

        public Bundle getExtras(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.getExtras(obj);
        }

        public int getInputType(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.getInputType(obj);
        }

        public int getLiveRegion(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.getLiveRegion(obj);
        }

        public Object getRangeInfo(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.getRangeInfo(obj);
        }

        public boolean isCollectionInfoHierarchical(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.CollectionInfo.isHierarchical(obj);
        }

        public boolean isCollectionItemHeading(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.isHeading(obj);
        }

        public boolean isContentInvalid(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.isContentInvalid(obj);
        }

        public boolean isDismissable(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.isDismissable(obj);
        }

        public boolean isMultiLine(Object obj)
        {
            return AccessibilityNodeInfoCompatKitKat.isMultiLine(obj);
        }

        public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
        {
            return AccessibilityNodeInfoCompatKitKat.obtainCollectionInfo(i, j, flag, k);
        }

        public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
        {
            return AccessibilityNodeInfoCompatKitKat.obtainCollectionItemInfo(i, j, k, l, flag);
        }

        public void setCanOpenPopup(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatKitKat.setCanOpenPopup(obj, flag);
        }

        public void setCollectionInfo(Object obj, Object obj1)
        {
            AccessibilityNodeInfoCompatKitKat.setCollectionInfo(obj, obj1);
        }

        public void setCollectionItemInfo(Object obj, Object obj1)
        {
            AccessibilityNodeInfoCompatKitKat.setCollectionItemInfo(obj, obj1);
        }

        public void setContentInvalid(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatKitKat.setContentInvalid(obj, flag);
        }

        public void setDismissable(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatKitKat.setDismissable(obj, flag);
        }

        public void setInputType(Object obj, int i)
        {
            AccessibilityNodeInfoCompatKitKat.setInputType(obj, i);
        }

        public void setLiveRegion(Object obj, int i)
        {
            AccessibilityNodeInfoCompatKitKat.setLiveRegion(obj, i);
        }

        public void setMultiLine(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatKitKat.setMultiLine(obj, flag);
        }

        public void setRangeInfo(Object obj, Object obj1)
        {
            AccessibilityNodeInfoCompatKitKat.setRangeInfo(obj, obj1);
        }

        AccessibilityNodeInfoKitKatImpl()
        {
        }
    }

    static class AccessibilityNodeInfoStubImpl
        implements AccessibilityNodeInfoImpl
    {

        public void addAction(Object obj, int i)
        {
        }

        public void addAction(Object obj, Object obj1)
        {
        }

        public void addChild(Object obj, View view)
        {
        }

        public void addChild(Object obj, View view, int i)
        {
        }

        public boolean canOpenPopup(Object obj)
        {
            return false;
        }

        public List findAccessibilityNodeInfosByText(Object obj, String s)
        {
            return Collections.emptyList();
        }

        public List findAccessibilityNodeInfosByViewId(Object obj, String s)
        {
            return Collections.emptyList();
        }

        public Object findFocus(Object obj, int i)
        {
            return null;
        }

        public Object focusSearch(Object obj, int i)
        {
            return null;
        }

        public int getAccessibilityActionId(Object obj)
        {
            return 0;
        }

        public CharSequence getAccessibilityActionLabel(Object obj)
        {
            return null;
        }

        public List getActionList(Object obj)
        {
            return null;
        }

        public int getActions(Object obj)
        {
            return 0;
        }

        public void getBoundsInParent(Object obj, Rect rect)
        {
        }

        public void getBoundsInScreen(Object obj, Rect rect)
        {
        }

        public Object getChild(Object obj, int i)
        {
            return null;
        }

        public int getChildCount(Object obj)
        {
            return 0;
        }

        public CharSequence getClassName(Object obj)
        {
            return null;
        }

        public Object getCollectionInfo(Object obj)
        {
            return null;
        }

        public int getCollectionInfoColumnCount(Object obj)
        {
            return 0;
        }

        public int getCollectionInfoRowCount(Object obj)
        {
            return 0;
        }

        public int getCollectionItemColumnIndex(Object obj)
        {
            return 0;
        }

        public int getCollectionItemColumnSpan(Object obj)
        {
            return 0;
        }

        public Object getCollectionItemInfo(Object obj)
        {
            return null;
        }

        public int getCollectionItemRowIndex(Object obj)
        {
            return 0;
        }

        public int getCollectionItemRowSpan(Object obj)
        {
            return 0;
        }

        public CharSequence getContentDescription(Object obj)
        {
            return null;
        }

        public CharSequence getError(Object obj)
        {
            return null;
        }

        public Bundle getExtras(Object obj)
        {
            return new Bundle();
        }

        public int getInputType(Object obj)
        {
            return 0;
        }

        public Object getLabelFor(Object obj)
        {
            return null;
        }

        public Object getLabeledBy(Object obj)
        {
            return null;
        }

        public int getLiveRegion(Object obj)
        {
            return 0;
        }

        public int getMaxTextLength(Object obj)
        {
            return -1;
        }

        public int getMovementGranularities(Object obj)
        {
            return 0;
        }

        public CharSequence getPackageName(Object obj)
        {
            return null;
        }

        public Object getParent(Object obj)
        {
            return null;
        }

        public Object getRangeInfo(Object obj)
        {
            return null;
        }

        public CharSequence getText(Object obj)
        {
            return null;
        }

        public int getTextSelectionEnd(Object obj)
        {
            return -1;
        }

        public int getTextSelectionStart(Object obj)
        {
            return -1;
        }

        public Object getTraversalAfter(Object obj)
        {
            return null;
        }

        public Object getTraversalBefore(Object obj)
        {
            return null;
        }

        public String getViewIdResourceName(Object obj)
        {
            return null;
        }

        public Object getWindow(Object obj)
        {
            return null;
        }

        public int getWindowId(Object obj)
        {
            return 0;
        }

        public boolean isAccessibilityFocused(Object obj)
        {
            return false;
        }

        public boolean isCheckable(Object obj)
        {
            return false;
        }

        public boolean isChecked(Object obj)
        {
            return false;
        }

        public boolean isClickable(Object obj)
        {
            return false;
        }

        public boolean isCollectionInfoHierarchical(Object obj)
        {
            return false;
        }

        public boolean isCollectionItemHeading(Object obj)
        {
            return false;
        }

        public boolean isCollectionItemSelected(Object obj)
        {
            return false;
        }

        public boolean isContentInvalid(Object obj)
        {
            return false;
        }

        public boolean isDismissable(Object obj)
        {
            return false;
        }

        public boolean isEditable(Object obj)
        {
            return false;
        }

        public boolean isEnabled(Object obj)
        {
            return false;
        }

        public boolean isFocusable(Object obj)
        {
            return false;
        }

        public boolean isFocused(Object obj)
        {
            return false;
        }

        public boolean isLongClickable(Object obj)
        {
            return false;
        }

        public boolean isMultiLine(Object obj)
        {
            return false;
        }

        public boolean isPassword(Object obj)
        {
            return false;
        }

        public boolean isScrollable(Object obj)
        {
            return false;
        }

        public boolean isSelected(Object obj)
        {
            return false;
        }

        public boolean isVisibleToUser(Object obj)
        {
            return false;
        }

        public Object newAccessibilityAction(int i, CharSequence charsequence)
        {
            return null;
        }

        public Object obtain()
        {
            return null;
        }

        public Object obtain(View view)
        {
            return null;
        }

        public Object obtain(View view, int i)
        {
            return null;
        }

        public Object obtain(Object obj)
        {
            return null;
        }

        public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
        {
            return null;
        }

        public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
        {
            return null;
        }

        public boolean performAction(Object obj, int i)
        {
            return false;
        }

        public boolean performAction(Object obj, int i, Bundle bundle)
        {
            return false;
        }

        public void recycle(Object obj)
        {
        }

        public boolean refresh(Object obj)
        {
            return false;
        }

        public boolean removeAction(Object obj, Object obj1)
        {
            return false;
        }

        public boolean removeChild(Object obj, View view)
        {
            return false;
        }

        public boolean removeChild(Object obj, View view, int i)
        {
            return false;
        }

        public void setAccessibilityFocused(Object obj, boolean flag)
        {
        }

        public void setBoundsInParent(Object obj, Rect rect)
        {
        }

        public void setBoundsInScreen(Object obj, Rect rect)
        {
        }

        public void setCanOpenPopup(Object obj, boolean flag)
        {
        }

        public void setCheckable(Object obj, boolean flag)
        {
        }

        public void setChecked(Object obj, boolean flag)
        {
        }

        public void setClassName(Object obj, CharSequence charsequence)
        {
        }

        public void setClickable(Object obj, boolean flag)
        {
        }

        public void setCollectionInfo(Object obj, Object obj1)
        {
        }

        public void setCollectionItemInfo(Object obj, Object obj1)
        {
        }

        public void setContentDescription(Object obj, CharSequence charsequence)
        {
        }

        public void setContentInvalid(Object obj, boolean flag)
        {
        }

        public void setDismissable(Object obj, boolean flag)
        {
        }

        public void setEditable(Object obj, boolean flag)
        {
        }

        public void setEnabled(Object obj, boolean flag)
        {
        }

        public void setError(Object obj, CharSequence charsequence)
        {
        }

        public void setFocusable(Object obj, boolean flag)
        {
        }

        public void setFocused(Object obj, boolean flag)
        {
        }

        public void setInputType(Object obj, int i)
        {
        }

        public void setLabelFor(Object obj, View view)
        {
        }

        public void setLabelFor(Object obj, View view, int i)
        {
        }

        public void setLabeledBy(Object obj, View view)
        {
        }

        public void setLabeledBy(Object obj, View view, int i)
        {
        }

        public void setLiveRegion(Object obj, int i)
        {
        }

        public void setLongClickable(Object obj, boolean flag)
        {
        }

        public void setMaxTextLength(Object obj, int i)
        {
        }

        public void setMovementGranularities(Object obj, int i)
        {
        }

        public void setMultiLine(Object obj, boolean flag)
        {
        }

        public void setPackageName(Object obj, CharSequence charsequence)
        {
        }

        public void setParent(Object obj, View view)
        {
        }

        public void setParent(Object obj, View view, int i)
        {
        }

        public void setPassword(Object obj, boolean flag)
        {
        }

        public void setRangeInfo(Object obj, Object obj1)
        {
        }

        public void setScrollable(Object obj, boolean flag)
        {
        }

        public void setSelected(Object obj, boolean flag)
        {
        }

        public void setSource(Object obj, View view)
        {
        }

        public void setSource(Object obj, View view, int i)
        {
        }

        public void setText(Object obj, CharSequence charsequence)
        {
        }

        public void setTextSelection(Object obj, int i, int j)
        {
        }

        public void setTraversalAfter(Object obj, View view)
        {
        }

        public void setTraversalAfter(Object obj, View view, int i)
        {
        }

        public void setTraversalBefore(Object obj, View view)
        {
        }

        public void setTraversalBefore(Object obj, View view, int i)
        {
        }

        public void setViewIdResourceName(Object obj, String s)
        {
        }

        public void setVisibleToUser(Object obj, boolean flag)
        {
        }

        AccessibilityNodeInfoStubImpl()
        {
        }
    }

    public static class CollectionInfoCompat
    {

        public static final int SELECTION_MODE_MULTIPLE = 2;
        public static final int SELECTION_MODE_NONE = 0;
        public static final int SELECTION_MODE_SINGLE = 1;
        final Object mInfo;

        public static CollectionInfoCompat obtain(int i, int j, boolean flag, int k)
        {
            return new CollectionInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainCollectionInfo(i, j, flag, k));
        }

        public int getColumnCount()
        {
            return AccessibilityNodeInfoCompat.IMPL.getCollectionInfoColumnCount(mInfo);
        }

        public int getRowCount()
        {
            return AccessibilityNodeInfoCompat.IMPL.getCollectionInfoRowCount(mInfo);
        }

        public boolean isHierarchical()
        {
            return AccessibilityNodeInfoCompat.IMPL.isCollectionInfoHierarchical(mInfo);
        }

        private CollectionInfoCompat(Object obj)
        {
            mInfo = obj;
        }

    }

    public static class CollectionItemInfoCompat
    {

        private final Object mInfo;

        public static CollectionItemInfoCompat obtain(int i, int j, int k, int l, boolean flag, boolean flag1)
        {
            return new CollectionItemInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainCollectionItemInfo(i, j, k, l, flag, flag1));
        }

        public int getColumnIndex()
        {
            return AccessibilityNodeInfoCompat.IMPL.getCollectionItemColumnIndex(mInfo);
        }

        public int getColumnSpan()
        {
            return AccessibilityNodeInfoCompat.IMPL.getCollectionItemColumnSpan(mInfo);
        }

        public int getRowIndex()
        {
            return AccessibilityNodeInfoCompat.IMPL.getCollectionItemRowIndex(mInfo);
        }

        public int getRowSpan()
        {
            return AccessibilityNodeInfoCompat.IMPL.getCollectionItemRowSpan(mInfo);
        }

        public boolean isHeading()
        {
            return AccessibilityNodeInfoCompat.IMPL.isCollectionItemHeading(mInfo);
        }

        public boolean isSelected()
        {
            return AccessibilityNodeInfoCompat.IMPL.isCollectionItemSelected(mInfo);
        }


        private CollectionItemInfoCompat(Object obj)
        {
            mInfo = obj;
        }

    }

    public static class RangeInfoCompat
    {

        public static final int RANGE_TYPE_FLOAT = 1;
        public static final int RANGE_TYPE_INT = 0;
        public static final int RANGE_TYPE_PERCENT = 2;
        private final Object mInfo;

        public float getCurrent()
        {
            return AccessibilityNodeInfoCompatKitKat.RangeInfo.getCurrent(mInfo);
        }

        public float getMax()
        {
            return AccessibilityNodeInfoCompatKitKat.RangeInfo.getMax(mInfo);
        }

        public float getMin()
        {
            return AccessibilityNodeInfoCompatKitKat.RangeInfo.getMin(mInfo);
        }

        public int getType()
        {
            return AccessibilityNodeInfoCompatKitKat.RangeInfo.getType(mInfo);
        }


        private RangeInfoCompat(Object obj)
        {
            mInfo = obj;
        }

    }


    public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
    public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_COLLAPSE = 0x80000;
    public static final int ACTION_COPY = 16384;
    public static final int ACTION_CUT = 0x10000;
    public static final int ACTION_DISMISS = 0x100000;
    public static final int ACTION_EXPAND = 0x40000;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_LONG_CLICK = 32;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
    public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
    public static final int ACTION_PASTE = 32768;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
    public static final int ACTION_SCROLL_BACKWARD = 8192;
    public static final int ACTION_SCROLL_FORWARD = 4096;
    public static final int ACTION_SELECT = 4;
    public static final int ACTION_SET_SELECTION = 0x20000;
    public static final int ACTION_SET_TEXT = 0x200000;
    public static final int FOCUS_ACCESSIBILITY = 2;
    public static final int FOCUS_INPUT = 1;
    private static final AccessibilityNodeInfoImpl IMPL;
    public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
    public static final int MOVEMENT_GRANULARITY_LINE = 4;
    public static final int MOVEMENT_GRANULARITY_PAGE = 16;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
    public static final int MOVEMENT_GRANULARITY_WORD = 2;
    private final Object mInfo;

    public AccessibilityNodeInfoCompat(Object obj)
    {
        mInfo = obj;
    }

    private static String getActionSymbolicName(int i)
    {
        switch (i)
        {
        default:
            return "ACTION_UNKNOWN";

        case 1: // '\001'
            return "ACTION_FOCUS";

        case 2: // '\002'
            return "ACTION_CLEAR_FOCUS";

        case 4: // '\004'
            return "ACTION_SELECT";

        case 8: // '\b'
            return "ACTION_CLEAR_SELECTION";

        case 16: // '\020'
            return "ACTION_CLICK";

        case 32: // ' '
            return "ACTION_LONG_CLICK";

        case 64: // '@'
            return "ACTION_ACCESSIBILITY_FOCUS";

        case 128: 
            return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";

        case 256: 
            return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";

        case 512: 
            return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";

        case 1024: 
            return "ACTION_NEXT_HTML_ELEMENT";

        case 2048: 
            return "ACTION_PREVIOUS_HTML_ELEMENT";

        case 4096: 
            return "ACTION_SCROLL_FORWARD";

        case 8192: 
            return "ACTION_SCROLL_BACKWARD";

        case 65536: 
            return "ACTION_CUT";

        case 16384: 
            return "ACTION_COPY";

        case 32768: 
            return "ACTION_PASTE";

        case 131072: 
            return "ACTION_SET_SELECTION";
        }
    }

    public static AccessibilityNodeInfoCompat obtain()
    {
        return wrapNonNullInstance(IMPL.obtain());
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        return wrapNonNullInstance(IMPL.obtain(accessibilitynodeinfocompat.mInfo));
    }

    public static AccessibilityNodeInfoCompat obtain(View view)
    {
        return wrapNonNullInstance(IMPL.obtain(view));
    }

    public static AccessibilityNodeInfoCompat obtain(View view, int i)
    {
        return wrapNonNullInstance(IMPL.obtain(view, i));
    }

    static AccessibilityNodeInfoCompat wrapNonNullInstance(Object obj)
    {
        if (obj != null)
        {
            return new AccessibilityNodeInfoCompat(obj);
        } else
        {
            return null;
        }
    }

    public void addAction(int i)
    {
        IMPL.addAction(mInfo, i);
    }

    public void addAction(AccessibilityActionCompat accessibilityactioncompat)
    {
        IMPL.addAction(mInfo, accessibilityactioncompat.mAction);
    }

    public void addChild(View view)
    {
        IMPL.addChild(mInfo, view);
    }

    public void addChild(View view, int i)
    {
        IMPL.addChild(mInfo, view, i);
    }

    public boolean canOpenPopup()
    {
        return IMPL.canOpenPopup(mInfo);
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (AccessibilityNodeInfoCompat)obj;
        if (mInfo != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((AccessibilityNodeInfoCompat) (obj)).mInfo == null) goto _L1; else goto _L3
_L3:
        return false;
        if (mInfo.equals(((AccessibilityNodeInfoCompat) (obj)).mInfo)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public List findAccessibilityNodeInfosByText(String s)
    {
        ArrayList arraylist = new ArrayList();
        s = IMPL.findAccessibilityNodeInfosByText(mInfo, s);
        int j = s.size();
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new AccessibilityNodeInfoCompat(s.get(i)));
        }

        return arraylist;
    }

    public List findAccessibilityNodeInfosByViewId(String s)
    {
        s = IMPL.findAccessibilityNodeInfosByViewId(mInfo, s);
        if (s != null)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = s.iterator();
            do
            {
                s = arraylist;
                if (!iterator.hasNext())
                {
                    break;
                }
                arraylist.add(new AccessibilityNodeInfoCompat(iterator.next()));
            } while (true);
        } else
        {
            s = Collections.emptyList();
        }
        return s;
    }

    public AccessibilityNodeInfoCompat findFocus(int i)
    {
        return wrapNonNullInstance(IMPL.findFocus(mInfo, i));
    }

    public AccessibilityNodeInfoCompat focusSearch(int i)
    {
        return wrapNonNullInstance(IMPL.focusSearch(mInfo, i));
    }

    public List getActionList()
    {
        List list = IMPL.getActionList(mInfo);
        Object obj;
        if (list != null)
        {
            ArrayList arraylist = new ArrayList();
            int j = list.size();
            int i = 0;
            do
            {
                obj = arraylist;
                if (i >= j)
                {
                    break;
                }
                arraylist.add(new AccessibilityActionCompat(list.get(i)));
                i++;
            } while (true);
        } else
        {
            obj = Collections.emptyList();
        }
        return ((List) (obj));
    }

    public int getActions()
    {
        return IMPL.getActions(mInfo);
    }

    public void getBoundsInParent(Rect rect)
    {
        IMPL.getBoundsInParent(mInfo, rect);
    }

    public void getBoundsInScreen(Rect rect)
    {
        IMPL.getBoundsInScreen(mInfo, rect);
    }

    public AccessibilityNodeInfoCompat getChild(int i)
    {
        return wrapNonNullInstance(IMPL.getChild(mInfo, i));
    }

    public int getChildCount()
    {
        return IMPL.getChildCount(mInfo);
    }

    public CharSequence getClassName()
    {
        return IMPL.getClassName(mInfo);
    }

    public CollectionInfoCompat getCollectionInfo()
    {
        Object obj = IMPL.getCollectionInfo(mInfo);
        if (obj == null)
        {
            return null;
        } else
        {
            return new CollectionInfoCompat(obj);
        }
    }

    public CollectionItemInfoCompat getCollectionItemInfo()
    {
        Object obj = IMPL.getCollectionItemInfo(mInfo);
        if (obj == null)
        {
            return null;
        } else
        {
            return new CollectionItemInfoCompat(obj);
        }
    }

    public CharSequence getContentDescription()
    {
        return IMPL.getContentDescription(mInfo);
    }

    public CharSequence getError()
    {
        return IMPL.getError(mInfo);
    }

    public Bundle getExtras()
    {
        return IMPL.getExtras(mInfo);
    }

    public Object getInfo()
    {
        return mInfo;
    }

    public int getInputType()
    {
        return IMPL.getInputType(mInfo);
    }

    public AccessibilityNodeInfoCompat getLabelFor()
    {
        return wrapNonNullInstance(IMPL.getLabelFor(mInfo));
    }

    public AccessibilityNodeInfoCompat getLabeledBy()
    {
        return wrapNonNullInstance(IMPL.getLabeledBy(mInfo));
    }

    public int getLiveRegion()
    {
        return IMPL.getLiveRegion(mInfo);
    }

    public int getMaxTextLength()
    {
        return IMPL.getMaxTextLength(mInfo);
    }

    public int getMovementGranularities()
    {
        return IMPL.getMovementGranularities(mInfo);
    }

    public CharSequence getPackageName()
    {
        return IMPL.getPackageName(mInfo);
    }

    public AccessibilityNodeInfoCompat getParent()
    {
        return wrapNonNullInstance(IMPL.getParent(mInfo));
    }

    public RangeInfoCompat getRangeInfo()
    {
        Object obj = IMPL.getRangeInfo(mInfo);
        if (obj == null)
        {
            return null;
        } else
        {
            return new RangeInfoCompat(obj);
        }
    }

    public CharSequence getText()
    {
        return IMPL.getText(mInfo);
    }

    public int getTextSelectionEnd()
    {
        return IMPL.getTextSelectionEnd(mInfo);
    }

    public int getTextSelectionStart()
    {
        return IMPL.getTextSelectionStart(mInfo);
    }

    public AccessibilityNodeInfoCompat getTraversalAfter()
    {
        return wrapNonNullInstance(IMPL.getTraversalAfter(mInfo));
    }

    public AccessibilityNodeInfoCompat getTraversalBefore()
    {
        return wrapNonNullInstance(IMPL.getTraversalBefore(mInfo));
    }

    public String getViewIdResourceName()
    {
        return IMPL.getViewIdResourceName(mInfo);
    }

    public AccessibilityWindowInfoCompat getWindow()
    {
        return AccessibilityWindowInfoCompat.wrapNonNullInstance(IMPL.getWindow(mInfo));
    }

    public int getWindowId()
    {
        return IMPL.getWindowId(mInfo);
    }

    public int hashCode()
    {
        if (mInfo == null)
        {
            return 0;
        } else
        {
            return mInfo.hashCode();
        }
    }

    public boolean isAccessibilityFocused()
    {
        return IMPL.isAccessibilityFocused(mInfo);
    }

    public boolean isCheckable()
    {
        return IMPL.isCheckable(mInfo);
    }

    public boolean isChecked()
    {
        return IMPL.isChecked(mInfo);
    }

    public boolean isClickable()
    {
        return IMPL.isClickable(mInfo);
    }

    public boolean isContentInvalid()
    {
        return IMPL.isContentInvalid(mInfo);
    }

    public boolean isDismissable()
    {
        return IMPL.isDismissable(mInfo);
    }

    public boolean isEditable()
    {
        return IMPL.isEditable(mInfo);
    }

    public boolean isEnabled()
    {
        return IMPL.isEnabled(mInfo);
    }

    public boolean isFocusable()
    {
        return IMPL.isFocusable(mInfo);
    }

    public boolean isFocused()
    {
        return IMPL.isFocused(mInfo);
    }

    public boolean isLongClickable()
    {
        return IMPL.isLongClickable(mInfo);
    }

    public boolean isMultiLine()
    {
        return IMPL.isMultiLine(mInfo);
    }

    public boolean isPassword()
    {
        return IMPL.isPassword(mInfo);
    }

    public boolean isScrollable()
    {
        return IMPL.isScrollable(mInfo);
    }

    public boolean isSelected()
    {
        return IMPL.isSelected(mInfo);
    }

    public boolean isVisibleToUser()
    {
        return IMPL.isVisibleToUser(mInfo);
    }

    public boolean performAction(int i)
    {
        return IMPL.performAction(mInfo, i);
    }

    public boolean performAction(int i, Bundle bundle)
    {
        return IMPL.performAction(mInfo, i, bundle);
    }

    public void recycle()
    {
        IMPL.recycle(mInfo);
    }

    public boolean refresh()
    {
        return IMPL.refresh(mInfo);
    }

    public boolean removeAction(AccessibilityActionCompat accessibilityactioncompat)
    {
        return IMPL.removeAction(mInfo, accessibilityactioncompat.mAction);
    }

    public boolean removeChild(View view)
    {
        return IMPL.removeChild(mInfo, view);
    }

    public boolean removeChild(View view, int i)
    {
        return IMPL.removeChild(mInfo, view, i);
    }

    public void setAccessibilityFocused(boolean flag)
    {
        IMPL.setAccessibilityFocused(mInfo, flag);
    }

    public void setBoundsInParent(Rect rect)
    {
        IMPL.setBoundsInParent(mInfo, rect);
    }

    public void setBoundsInScreen(Rect rect)
    {
        IMPL.setBoundsInScreen(mInfo, rect);
    }

    public void setCanOpenPopup(boolean flag)
    {
        IMPL.setCanOpenPopup(mInfo, flag);
    }

    public void setCheckable(boolean flag)
    {
        IMPL.setCheckable(mInfo, flag);
    }

    public void setChecked(boolean flag)
    {
        IMPL.setChecked(mInfo, flag);
    }

    public void setClassName(CharSequence charsequence)
    {
        IMPL.setClassName(mInfo, charsequence);
    }

    public void setClickable(boolean flag)
    {
        IMPL.setClickable(mInfo, flag);
    }

    public void setCollectionInfo(Object obj)
    {
        IMPL.setCollectionInfo(mInfo, ((CollectionInfoCompat)obj).mInfo);
    }

    public void setCollectionItemInfo(Object obj)
    {
        IMPL.setCollectionItemInfo(mInfo, ((CollectionItemInfoCompat)obj).mInfo);
    }

    public void setContentDescription(CharSequence charsequence)
    {
        IMPL.setContentDescription(mInfo, charsequence);
    }

    public void setContentInvalid(boolean flag)
    {
        IMPL.setContentInvalid(mInfo, flag);
    }

    public void setDismissable(boolean flag)
    {
        IMPL.setDismissable(mInfo, flag);
    }

    public void setEditable(boolean flag)
    {
        IMPL.setEditable(mInfo, flag);
    }

    public void setEnabled(boolean flag)
    {
        IMPL.setEnabled(mInfo, flag);
    }

    public void setError(CharSequence charsequence)
    {
        IMPL.setError(mInfo, charsequence);
    }

    public void setFocusable(boolean flag)
    {
        IMPL.setFocusable(mInfo, flag);
    }

    public void setFocused(boolean flag)
    {
        IMPL.setFocused(mInfo, flag);
    }

    public void setInputType(int i)
    {
        IMPL.setInputType(mInfo, i);
    }

    public void setLabelFor(View view)
    {
        IMPL.setLabelFor(mInfo, view);
    }

    public void setLabelFor(View view, int i)
    {
        IMPL.setLabelFor(mInfo, view, i);
    }

    public void setLabeledBy(View view)
    {
        IMPL.setLabeledBy(mInfo, view);
    }

    public void setLabeledBy(View view, int i)
    {
        IMPL.setLabeledBy(mInfo, view, i);
    }

    public void setLiveRegion(int i)
    {
        IMPL.setLiveRegion(mInfo, i);
    }

    public void setLongClickable(boolean flag)
    {
        IMPL.setLongClickable(mInfo, flag);
    }

    public void setMaxTextLength(int i)
    {
        IMPL.setMaxTextLength(mInfo, i);
    }

    public void setMovementGranularities(int i)
    {
        IMPL.setMovementGranularities(mInfo, i);
    }

    public void setMultiLine(boolean flag)
    {
        IMPL.setMultiLine(mInfo, flag);
    }

    public void setPackageName(CharSequence charsequence)
    {
        IMPL.setPackageName(mInfo, charsequence);
    }

    public void setParent(View view)
    {
        IMPL.setParent(mInfo, view);
    }

    public void setParent(View view, int i)
    {
        IMPL.setParent(mInfo, view, i);
    }

    public void setPassword(boolean flag)
    {
        IMPL.setPassword(mInfo, flag);
    }

    public void setRangeInfo(RangeInfoCompat rangeinfocompat)
    {
        IMPL.setRangeInfo(mInfo, rangeinfocompat.mInfo);
    }

    public void setScrollable(boolean flag)
    {
        IMPL.setScrollable(mInfo, flag);
    }

    public void setSelected(boolean flag)
    {
        IMPL.setSelected(mInfo, flag);
    }

    public void setSource(View view)
    {
        IMPL.setSource(mInfo, view);
    }

    public void setSource(View view, int i)
    {
        IMPL.setSource(mInfo, view, i);
    }

    public void setText(CharSequence charsequence)
    {
        IMPL.setText(mInfo, charsequence);
    }

    public void setTextSelection(int i, int j)
    {
        IMPL.setTextSelection(mInfo, i, j);
    }

    public void setTraversalAfter(View view)
    {
        IMPL.setTraversalAfter(mInfo, view);
    }

    public void setTraversalAfter(View view, int i)
    {
        IMPL.setTraversalAfter(mInfo, view, i);
    }

    public void setTraversalBefore(View view)
    {
        IMPL.setTraversalBefore(mInfo, view);
    }

    public void setTraversalBefore(View view, int i)
    {
        IMPL.setTraversalBefore(mInfo, view, i);
    }

    public void setViewIdResourceName(String s)
    {
        IMPL.setViewIdResourceName(mInfo, s);
    }

    public void setVisibleToUser(boolean flag)
    {
        IMPL.setVisibleToUser(mInfo, flag);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        stringbuilder.append((new StringBuilder()).append("; boundsInParent: ").append(rect).toString());
        getBoundsInScreen(rect);
        stringbuilder.append((new StringBuilder()).append("; boundsInScreen: ").append(rect).toString());
        stringbuilder.append("; packageName: ").append(getPackageName());
        stringbuilder.append("; className: ").append(getClassName());
        stringbuilder.append("; text: ").append(getText());
        stringbuilder.append("; contentDescription: ").append(getContentDescription());
        stringbuilder.append("; viewId: ").append(getViewIdResourceName());
        stringbuilder.append("; checkable: ").append(isCheckable());
        stringbuilder.append("; checked: ").append(isChecked());
        stringbuilder.append("; focusable: ").append(isFocusable());
        stringbuilder.append("; focused: ").append(isFocused());
        stringbuilder.append("; selected: ").append(isSelected());
        stringbuilder.append("; clickable: ").append(isClickable());
        stringbuilder.append("; longClickable: ").append(isLongClickable());
        stringbuilder.append("; enabled: ").append(isEnabled());
        stringbuilder.append("; password: ").append(isPassword());
        stringbuilder.append((new StringBuilder()).append("; scrollable: ").append(isScrollable()).toString());
        stringbuilder.append("; [");
        int i = getActions();
        do
        {
            if (i == 0)
            {
                break;
            }
            int k = 1 << Integer.numberOfTrailingZeros(i);
            int j = i & ~k;
            stringbuilder.append(getActionSymbolicName(k));
            i = j;
            if (j != 0)
            {
                stringbuilder.append(", ");
                i = j;
            }
        } while (true);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            IMPL = new AccessibilityNodeInfoApi22Impl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            IMPL = new AccessibilityNodeInfoApi21Impl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            IMPL = new AccessibilityNodeInfoKitKatImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            IMPL = new AccessibilityNodeInfoJellybeanMr2Impl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            IMPL = new AccessibilityNodeInfoJellybeanMr1Impl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new AccessibilityNodeInfoJellybeanImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new AccessibilityNodeInfoIcsImpl();
        } else
        {
            IMPL = new AccessibilityNodeInfoStubImpl();
        }
    }

}
