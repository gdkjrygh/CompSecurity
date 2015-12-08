// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompatJellybeanMr2, AccessibilityNodeInfoCompatJellyBean, AccessibilityNodeInfoCompatIcs

public final class AccessibilityNodeInfoCompat
{
    static final class AccessibilityNodeInfoApi21Impl extends AccessibilityNodeInfoKitKatImpl
    {

        AccessibilityNodeInfoApi21Impl()
        {
        }
    }

    static class AccessibilityNodeInfoIcsImpl extends AccessibilityNodeInfoImpl
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

        AccessibilityNodeInfoIcsImpl()
        {
        }
    }

    static class AccessibilityNodeInfoImpl
    {

        public void addAction(Object obj, int i)
        {
        }

        public void addChild(Object obj, View view)
        {
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

        public CharSequence getText(Object obj)
        {
            return null;
        }

        public String getViewIdResourceName(Object obj)
        {
            return null;
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

        public Object obtain(Object obj)
        {
            return null;
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

        public void setScrollable(Object obj, boolean flag)
        {
        }

        public void setSelected(Object obj, boolean flag)
        {
        }

        public void setSource(Object obj, View view)
        {
        }

        public void setVisibleToUser(Object obj, boolean flag)
        {
        }

        AccessibilityNodeInfoImpl()
        {
        }
    }

    static class AccessibilityNodeInfoJellybeanImpl extends AccessibilityNodeInfoIcsImpl
    {

        public final int getMovementGranularities(Object obj)
        {
            return AccessibilityNodeInfoCompatJellyBean.getMovementGranularities(obj);
        }

        public final boolean isAccessibilityFocused(Object obj)
        {
            return AccessibilityNodeInfoCompatJellyBean.isAccessibilityFocused(obj);
        }

        public final boolean isVisibleToUser(Object obj)
        {
            return AccessibilityNodeInfoCompatJellyBean.isVisibleToUser(obj);
        }

        public final void setAccessibilityFocused(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatJellyBean.setAccesibilityFocused(obj, flag);
        }

        public final void setMovementGranularities(Object obj, int i)
        {
            AccessibilityNodeInfoCompatJellyBean.setMovementGranularities(obj, i);
        }

        public final void setVisibleToUser(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatJellyBean.setVisibleToUser(obj, flag);
        }

        AccessibilityNodeInfoJellybeanImpl()
        {
        }
    }

    static class AccessibilityNodeInfoJellybeanMr2Impl extends AccessibilityNodeInfoJellybeanImpl
    {

        public final String getViewIdResourceName(Object obj)
        {
            return AccessibilityNodeInfoCompatJellybeanMr2.getViewIdResourceName(obj);
        }

        AccessibilityNodeInfoJellybeanMr2Impl()
        {
        }
    }

    static class AccessibilityNodeInfoKitKatImpl extends AccessibilityNodeInfoJellybeanMr2Impl
    {

        AccessibilityNodeInfoKitKatImpl()
        {
        }
    }


    private static final AccessibilityNodeInfoImpl IMPL;
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

    private CharSequence getText()
    {
        return IMPL.getText(mInfo);
    }

    private String getViewIdResourceName()
    {
        return IMPL.getViewIdResourceName(mInfo);
    }

    private boolean isCheckable()
    {
        return IMPL.isCheckable(mInfo);
    }

    private boolean isChecked()
    {
        return IMPL.isChecked(mInfo);
    }

    private boolean isPassword()
    {
        return IMPL.isPassword(mInfo);
    }

    private boolean isScrollable()
    {
        return IMPL.isScrollable(mInfo);
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        return wrapNonNullInstance(IMPL.obtain(accessibilitynodeinfocompat.mInfo));
    }

    private static AccessibilityNodeInfoCompat wrapNonNullInstance(Object obj)
    {
        if (obj != null)
        {
            return new AccessibilityNodeInfoCompat(obj);
        } else
        {
            return null;
        }
    }

    public final void addAction(int i)
    {
        IMPL.addAction(mInfo, i);
    }

    public final void addChild(View view)
    {
        IMPL.addChild(mInfo, view);
    }

    public final boolean equals(Object obj)
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

    public final int getActions()
    {
        return IMPL.getActions(mInfo);
    }

    public final void getBoundsInParent(Rect rect)
    {
        IMPL.getBoundsInParent(mInfo, rect);
    }

    public final void getBoundsInScreen(Rect rect)
    {
        IMPL.getBoundsInScreen(mInfo, rect);
    }

    public final CharSequence getClassName()
    {
        return IMPL.getClassName(mInfo);
    }

    public final CharSequence getContentDescription()
    {
        return IMPL.getContentDescription(mInfo);
    }

    public final Object getInfo()
    {
        return mInfo;
    }

    public final int getMovementGranularities()
    {
        return IMPL.getMovementGranularities(mInfo);
    }

    public final CharSequence getPackageName()
    {
        return IMPL.getPackageName(mInfo);
    }

    public final int hashCode()
    {
        if (mInfo == null)
        {
            return 0;
        } else
        {
            return mInfo.hashCode();
        }
    }

    public final boolean isAccessibilityFocused()
    {
        return IMPL.isAccessibilityFocused(mInfo);
    }

    public final boolean isClickable()
    {
        return IMPL.isClickable(mInfo);
    }

    public final boolean isEnabled()
    {
        return IMPL.isEnabled(mInfo);
    }

    public final boolean isFocusable()
    {
        return IMPL.isFocusable(mInfo);
    }

    public final boolean isFocused()
    {
        return IMPL.isFocused(mInfo);
    }

    public final boolean isLongClickable()
    {
        return IMPL.isLongClickable(mInfo);
    }

    public final boolean isSelected()
    {
        return IMPL.isSelected(mInfo);
    }

    public final boolean isVisibleToUser()
    {
        return IMPL.isVisibleToUser(mInfo);
    }

    public final void recycle()
    {
        IMPL.recycle(mInfo);
    }

    public final void setAccessibilityFocused(boolean flag)
    {
        IMPL.setAccessibilityFocused(mInfo, flag);
    }

    public final void setBoundsInParent(Rect rect)
    {
        IMPL.setBoundsInParent(mInfo, rect);
    }

    public final void setBoundsInScreen(Rect rect)
    {
        IMPL.setBoundsInScreen(mInfo, rect);
    }

    public final void setClassName(CharSequence charsequence)
    {
        IMPL.setClassName(mInfo, charsequence);
    }

    public final void setClickable(boolean flag)
    {
        IMPL.setClickable(mInfo, flag);
    }

    public final void setContentDescription(CharSequence charsequence)
    {
        IMPL.setContentDescription(mInfo, charsequence);
    }

    public final void setEnabled(boolean flag)
    {
        IMPL.setEnabled(mInfo, flag);
    }

    public final void setFocusable(boolean flag)
    {
        IMPL.setFocusable(mInfo, flag);
    }

    public final void setFocused(boolean flag)
    {
        IMPL.setFocused(mInfo, flag);
    }

    public final void setLongClickable(boolean flag)
    {
        IMPL.setLongClickable(mInfo, flag);
    }

    public final void setMovementGranularities(int i)
    {
        IMPL.setMovementGranularities(mInfo, i);
    }

    public final void setPackageName(CharSequence charsequence)
    {
        IMPL.setPackageName(mInfo, charsequence);
    }

    public final void setParent(View view)
    {
        IMPL.setParent(mInfo, view);
    }

    public final void setScrollable(boolean flag)
    {
        IMPL.setScrollable(mInfo, flag);
    }

    public final void setSelected(boolean flag)
    {
        IMPL.setSelected(mInfo, flag);
    }

    public final void setSource(View view)
    {
        IMPL.setSource(mInfo, view);
    }

    public final void setVisibleToUser(boolean flag)
    {
        IMPL.setVisibleToUser(mInfo, flag);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        stringbuilder.append((new StringBuilder("; boundsInParent: ")).append(rect).toString());
        getBoundsInScreen(rect);
        stringbuilder.append((new StringBuilder("; boundsInScreen: ")).append(rect).toString());
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
        stringbuilder.append((new StringBuilder("; scrollable: ")).append(isScrollable()).toString());
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
            IMPL = new AccessibilityNodeInfoImpl();
        }
    }
}
