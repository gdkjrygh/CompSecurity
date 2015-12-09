// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class AccessibilityNodeInfoCompat
{

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
    /* block-local class not found */
    class AccessibilityNodeInfoImpl {}

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

    public List getActionList()
    {
        ArrayList arraylist = new ArrayList();
        List list = IMPL.getActionList(mInfo);
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
    /* block-local class not found */
    class AccessibilityActionCompat {}

            arraylist.add(new AccessibilityActionCompat(list.get(i), null));
        }

        return arraylist;
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
    /* block-local class not found */
    class CollectionInfoCompat {}

        if (obj == null)
        {
            return null;
        } else
        {
            return new CollectionInfoCompat(obj, null);
        }
    }

    public CollectionItemInfoCompat getCollectionItemInfo()
    {
        Object obj = IMPL.getCollectionItemInfo(mInfo);
    /* block-local class not found */
    class CollectionItemInfoCompat {}

        if (obj == null)
        {
            return null;
        } else
        {
            return new CollectionItemInfoCompat(obj, null);
        }
    }

    public CharSequence getContentDescription()
    {
        return IMPL.getContentDescription(mInfo);
    }

    public Object getInfo()
    {
        return mInfo;
    }

    public int getLiveRegion()
    {
        return IMPL.getLiveRegion(mInfo);
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
    /* block-local class not found */
    class RangeInfoCompat {}

        if (obj == null)
        {
            return null;
        } else
        {
            return new RangeInfoCompat(obj, null);
        }
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

    public void setCollectionInfo(Object obj)
    {
        IMPL.setCollectionInfo(mInfo, ((CollectionInfoCompat)obj).mInfo);
    }

    public void setCollectionItemInfo(Object obj)
    {
        IMPL.setCollectionItemInfo(mInfo, CollectionItemInfoCompat.access._mth200((CollectionItemInfoCompat)obj));
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

    public void setLiveRegion(int i)
    {
        IMPL.setLiveRegion(mInfo, i);
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
    /* block-local class not found */
    class AccessibilityNodeInfoApi21Impl {}

    /* block-local class not found */
    class AccessibilityNodeInfoIcsImpl {}

    /* block-local class not found */
    class AccessibilityNodeInfoJellybeanImpl {}

    /* block-local class not found */
    class AccessibilityNodeInfoJellybeanMr2Impl {}

    /* block-local class not found */
    class AccessibilityNodeInfoKitKatImpl {}

    /* block-local class not found */
    class AccessibilityNodeInfoStubImpl {}

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
