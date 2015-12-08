// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompatIcs, AccessibilityNodeInfoCompatJellyBean, AccessibilityNodeInfoCompatJellybeanMr2

public class AccessibilityNodeInfoCompat
{
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

        public abstract void addChild(Object obj, View view);

        public abstract void addChild(Object obj, View view, int i);

        public abstract List findAccessibilityNodeInfosByText(Object obj, String s);

        public abstract Object findFocus(Object obj, int i);

        public abstract Object focusSearch(Object obj, int i);

        public abstract int getActions(Object obj);

        public abstract void getBoundsInParent(Object obj, Rect rect);

        public abstract void getBoundsInScreen(Object obj, Rect rect);

        public abstract Object getChild(Object obj, int i);

        public abstract int getChildCount(Object obj);

        public abstract CharSequence getClassName(Object obj);

        public abstract CharSequence getContentDescription(Object obj);

        public abstract int getMovementGranularities(Object obj);

        public abstract CharSequence getPackageName(Object obj);

        public abstract Object getParent(Object obj);

        public abstract CharSequence getText(Object obj);

        public abstract String getViewIdResourceName(Object obj);

        public abstract int getWindowId(Object obj);

        public abstract boolean isAccessibilityFocused(Object obj);

        public abstract boolean isCheckable(Object obj);

        public abstract boolean isChecked(Object obj);

        public abstract boolean isClickable(Object obj);

        public abstract boolean isEnabled(Object obj);

        public abstract boolean isFocusable(Object obj);

        public abstract boolean isFocused(Object obj);

        public abstract boolean isLongClickable(Object obj);

        public abstract boolean isPassword(Object obj);

        public abstract boolean isScrollable(Object obj);

        public abstract boolean isSelected(Object obj);

        public abstract boolean isVisibleToUser(Object obj);

        public abstract Object obtain();

        public abstract Object obtain(View view);

        public abstract Object obtain(View view, int i);

        public abstract Object obtain(Object obj);

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

        public abstract void setContentDescription(Object obj, CharSequence charsequence);

        public abstract void setEnabled(Object obj, boolean flag);

        public abstract void setFocusable(Object obj, boolean flag);

        public abstract void setFocused(Object obj, boolean flag);

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

    static class AccessibilityNodeInfoJellybeanMr2Impl extends AccessibilityNodeInfoJellybeanImpl
    {

        public String getViewIdResourceName(Object obj)
        {
            return AccessibilityNodeInfoCompatJellybeanMr2.getViewIdResourceName(obj);
        }

        public void setViewIdResourceName(Object obj, String s)
        {
            AccessibilityNodeInfoCompatJellybeanMr2.setViewIdResourceName(obj, s);
        }

        AccessibilityNodeInfoJellybeanMr2Impl()
        {
        }
    }

    static class AccessibilityNodeInfoStubImpl
        implements AccessibilityNodeInfoImpl
    {

        public void addAction(Object obj, int i)
        {
        }

        public void addChild(Object obj, View view)
        {
        }

        public void addChild(Object obj, View view, int i)
        {
        }

        public List findAccessibilityNodeInfosByText(Object obj, String s)
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

        public CharSequence getContentDescription(Object obj)
        {
            return null;
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

        public CharSequence getText(Object obj)
        {
            return null;
        }

        public String getViewIdResourceName(Object obj)
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

        public void setAccessibilityFocused(Object obj, boolean flag)
        {
        }

        public void setBoundsInParent(Object obj, Rect rect)
        {
        }

        public void setBoundsInScreen(Object obj, Rect rect)
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

        public void setContentDescription(Object obj, CharSequence charsequence)
        {
        }

        public void setEnabled(Object obj, boolean flag)
        {
        }

        public void setFocusable(Object obj, boolean flag)
        {
        }

        public void setFocused(Object obj, boolean flag)
        {
        }

        public void setLongClickable(Object obj, boolean flag)
        {
        }

        public void setMovementGranularities(Object obj, int i)
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


    public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
    public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_COPY = 16384;
    public static final int ACTION_CUT = 0x10000;
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

    public void addChild(View view)
    {
        IMPL.addChild(mInfo, view);
    }

    public void addChild(View view, int i)
    {
        IMPL.addChild(mInfo, view, i);
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

    public AccessibilityNodeInfoCompat findFocus(int i)
    {
        return wrapNonNullInstance(IMPL.findFocus(mInfo, i));
    }

    public AccessibilityNodeInfoCompat focusSearch(int i)
    {
        return wrapNonNullInstance(IMPL.focusSearch(mInfo, i));
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

    public CharSequence getContentDescription()
    {
        return IMPL.getContentDescription(mInfo);
    }

    public Object getInfo()
    {
        return mInfo;
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

    public CharSequence getText()
    {
        return IMPL.getText(mInfo);
    }

    public String getViewIdResourceName()
    {
        return IMPL.getViewIdResourceName(mInfo);
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

    public void setContentDescription(CharSequence charsequence)
    {
        IMPL.setContentDescription(mInfo, charsequence);
    }

    public void setEnabled(boolean flag)
    {
        IMPL.setEnabled(mInfo, flag);
    }

    public void setFocusable(boolean flag)
    {
        IMPL.setFocusable(mInfo, flag);
    }

    public void setFocused(boolean flag)
    {
        IMPL.setFocused(mInfo, flag);
    }

    public void setLongClickable(boolean flag)
    {
        IMPL.setLongClickable(mInfo, flag);
    }

    public void setMovementGranularities(int i)
    {
        IMPL.setMovementGranularities(mInfo, i);
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
        if ("JellyBeanMR2".equals(android.os.Build.VERSION.CODENAME))
        {
            IMPL = new AccessibilityNodeInfoJellybeanMr2Impl();
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
