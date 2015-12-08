// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompatApi21, AccessibilityNodeInfoCompatKitKat, AccessibilityNodeInfoCompatJellybeanMr2, AccessibilityNodeInfoCompatJellyBean, 
//            AccessibilityNodeInfoCompatIcs

public class AccessibilityNodeInfoCompat
{
    static class AccessibilityNodeInfoApi21Impl extends AccessibilityNodeInfoKitKatImpl
    {

        public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
        {
            return AccessibilityNodeInfoCompatApi21.obtainCollectionInfo(i, j, flag, k);
        }

        public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
        {
            return AccessibilityNodeInfoCompatApi21.obtainCollectionItemInfo(i, j, k, l, flag, flag1);
        }

        public void setError(Object obj, CharSequence charsequence)
        {
            AccessibilityNodeInfoCompatApi21.setError(obj, charsequence);
        }

        public void setLabelFor(Object obj, View view)
        {
            AccessibilityNodeInfoCompatApi21.setLabelFor(obj, view);
        }

        AccessibilityNodeInfoApi21Impl()
        {
        }
    }

    static class AccessibilityNodeInfoApi22Impl extends AccessibilityNodeInfoApi21Impl
    {

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

        public CharSequence getText(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.getText(obj);
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

        public Object obtain(Object obj)
        {
            return AccessibilityNodeInfoCompatIcs.obtain(obj);
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

        public abstract int getActions(Object obj);

        public abstract void getBoundsInParent(Object obj, Rect rect);

        public abstract void getBoundsInScreen(Object obj, Rect rect);

        public abstract CharSequence getClassName(Object obj);

        public abstract CharSequence getContentDescription(Object obj);

        public abstract CharSequence getPackageName(Object obj);

        public abstract CharSequence getText(Object obj);

        public abstract String getViewIdResourceName(Object obj);

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

        public abstract Object obtain(Object obj);

        public abstract Object obtainCollectionInfo(int i, int j, boolean flag, int k);

        public abstract Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1);

        public abstract void recycle(Object obj);

        public abstract void setAccessibilityFocused(Object obj, boolean flag);

        public abstract void setBoundsInParent(Object obj, Rect rect);

        public abstract void setBoundsInScreen(Object obj, Rect rect);

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

        public abstract void setLongClickable(Object obj, boolean flag);

        public abstract void setPackageName(Object obj, CharSequence charsequence);

        public abstract void setParent(Object obj, View view);

        public abstract void setScrollable(Object obj, boolean flag);

        public abstract void setSelected(Object obj, boolean flag);

        public abstract void setSource(Object obj, View view);

        public abstract void setText(Object obj, CharSequence charsequence);

        public abstract void setVisibleToUser(Object obj, boolean flag);
    }

    static class AccessibilityNodeInfoJellybeanImpl extends AccessibilityNodeInfoIcsImpl
    {

        public boolean isAccessibilityFocused(Object obj)
        {
            return AccessibilityNodeInfoCompatJellyBean.isAccessibilityFocused(obj);
        }

        public boolean isVisibleToUser(Object obj)
        {
            return AccessibilityNodeInfoCompatJellyBean.isVisibleToUser(obj);
        }

        public void setAccessibilityFocused(Object obj, boolean flag)
        {
            AccessibilityNodeInfoCompatJellyBean.setAccesibilityFocused(obj, flag);
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

        AccessibilityNodeInfoJellybeanMr2Impl()
        {
        }
    }

    static class AccessibilityNodeInfoKitKatImpl extends AccessibilityNodeInfoJellybeanMr2Impl
    {

        public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
        {
            return AccessibilityNodeInfoCompatKitKat.obtainCollectionInfo(i, j, flag, k);
        }

        public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
        {
            return AccessibilityNodeInfoCompatKitKat.obtainCollectionItemInfo(i, j, k, l, flag);
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

        public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
        {
            return null;
        }

        public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
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

        public void setLabelFor(Object obj, View view)
        {
        }

        public void setLongClickable(Object obj, boolean flag)
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

        public void setText(Object obj, CharSequence charsequence)
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

        final Object mInfo;

        public static CollectionInfoCompat obtain(int i, int j, boolean flag, int k)
        {
            return new CollectionInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainCollectionInfo(i, j, flag, k));
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


        private CollectionItemInfoCompat(Object obj)
        {
            mInfo = obj;
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

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        return wrapNonNullInstance(IMPL.obtain(accessibilitynodeinfocompat.mInfo));
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

    public CharSequence getPackageName()
    {
        return IMPL.getPackageName(mInfo);
    }

    public CharSequence getText()
    {
        return IMPL.getText(mInfo);
    }

    public String getViewIdResourceName()
    {
        return IMPL.getViewIdResourceName(mInfo);
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

    public void setLabelFor(View view)
    {
        IMPL.setLabelFor(mInfo, view);
    }

    public void setLongClickable(boolean flag)
    {
        IMPL.setLongClickable(mInfo, flag);
    }

    public void setPackageName(CharSequence charsequence)
    {
        IMPL.setPackageName(mInfo, charsequence);
    }

    public void setParent(View view)
    {
        IMPL.setParent(mInfo, view);
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

    public void setText(CharSequence charsequence)
    {
        IMPL.setText(mInfo, charsequence);
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
