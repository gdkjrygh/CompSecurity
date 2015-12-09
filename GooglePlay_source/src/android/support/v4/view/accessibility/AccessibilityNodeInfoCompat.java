// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public final class AccessibilityNodeInfoCompat
{
    static class AccessibilityNodeInfoApi21Impl extends AccessibilityNodeInfoKitKatImpl
    {

        public final Object obtainCollectionInfo(int i, int j, boolean flag, int k)
        {
            return android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, false, 0);
        }

        public final Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
        {
            return android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag, false);
        }

        AccessibilityNodeInfoApi21Impl()
        {
        }
    }

    static final class AccessibilityNodeInfoApi22Impl extends AccessibilityNodeInfoApi21Impl
    {

        AccessibilityNodeInfoApi22Impl()
        {
        }
    }

    static class AccessibilityNodeInfoIcsImpl extends AccessibilityNodeInfoStubImpl
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

        AccessibilityNodeInfoIcsImpl()
        {
        }
    }

    public static interface AccessibilityNodeInfoImpl
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

        public abstract void setEnabled(Object obj, boolean flag);

        public abstract void setFocusable(Object obj, boolean flag);

        public abstract void setFocused(Object obj, boolean flag);

        public abstract void setLongClickable(Object obj, boolean flag);

        public abstract void setPackageName(Object obj, CharSequence charsequence);

        public abstract void setParent(Object obj, View view);

        public abstract void setScrollable(Object obj, boolean flag);

        public abstract void setSelected(Object obj, boolean flag);

        public abstract void setSource(Object obj, View view);

        public abstract void setVisibleToUser(Object obj, boolean flag);
    }

    static class AccessibilityNodeInfoJellybeanImpl extends AccessibilityNodeInfoIcsImpl
    {

        public final boolean isAccessibilityFocused(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).isAccessibilityFocused();
        }

        public final boolean isVisibleToUser(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).isVisibleToUser();
        }

        public final void setAccessibilityFocused(Object obj, boolean flag)
        {
            ((AccessibilityNodeInfo)obj).setAccessibilityFocused(flag);
        }

        public final void setVisibleToUser(Object obj, boolean flag)
        {
            ((AccessibilityNodeInfo)obj).setVisibleToUser(flag);
        }

        AccessibilityNodeInfoJellybeanImpl()
        {
        }
    }

    static class AccessibilityNodeInfoJellybeanMr2Impl extends AccessibilityNodeInfoJellybeanImpl
    {

        public final String getViewIdResourceName(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).getViewIdResourceName();
        }

        AccessibilityNodeInfoJellybeanMr2Impl()
        {
        }
    }

    static class AccessibilityNodeInfoKitKatImpl extends AccessibilityNodeInfoJellybeanMr2Impl
    {

        public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
        {
            return android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, false);
        }

        public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
        {
            return android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag);
        }

        public final void setCollectionInfo(Object obj, Object obj1)
        {
            ((AccessibilityNodeInfo)obj).setCollectionInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj1);
        }

        public final void setCollectionItemInfo(Object obj, Object obj1)
        {
            ((AccessibilityNodeInfo)obj).setCollectionItemInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj1);
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

        AccessibilityNodeInfoStubImpl()
        {
        }
    }

    public static final class CollectionInfoCompat
    {

        public final Object mInfo;

        public CollectionInfoCompat(Object obj)
        {
            mInfo = obj;
        }
    }

    public static final class CollectionItemInfoCompat
    {

        final Object mInfo;

        public static CollectionItemInfoCompat obtain$430787b1(int i, int j, int k, int l, boolean flag)
        {
            return new CollectionItemInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainCollectionItemInfo(i, j, k, l, flag, false));
        }

        private CollectionItemInfoCompat(Object obj)
        {
            mInfo = obj;
        }
    }


    public static final AccessibilityNodeInfoImpl IMPL;
    public final Object mInfo;

    public AccessibilityNodeInfoCompat(Object obj)
    {
        mInfo = obj;
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        accessibilitynodeinfocompat = ((AccessibilityNodeInfoCompat) (IMPL.obtain(accessibilitynodeinfocompat.mInfo)));
        if (accessibilitynodeinfocompat != null)
        {
            return new AccessibilityNodeInfoCompat(accessibilitynodeinfocompat);
        } else
        {
            return null;
        }
    }

    public final void addAction(int i)
    {
        IMPL.addAction(mInfo, i);
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

    public final void setClassName(CharSequence charsequence)
    {
        IMPL.setClassName(mInfo, charsequence);
    }

    public final void setCollectionItemInfo(Object obj)
    {
        IMPL.setCollectionItemInfo(mInfo, ((CollectionItemInfoCompat)obj).mInfo);
    }

    public final void setFocusable(boolean flag)
    {
        IMPL.setFocusable(mInfo, flag);
    }

    public final void setFocused(boolean flag)
    {
        IMPL.setFocused(mInfo, flag);
    }

    public final void setParent(View view)
    {
        IMPL.setParent(mInfo, view);
    }

    public final void setScrollable(boolean flag)
    {
        IMPL.setScrollable(mInfo, flag);
    }

    public final String toString()
    {
        StringBuilder stringbuilder;
        int i;
        stringbuilder = new StringBuilder();
        stringbuilder.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        stringbuilder.append((new StringBuilder("; boundsInParent: ")).append(rect).toString());
        getBoundsInScreen(rect);
        stringbuilder.append((new StringBuilder("; boundsInScreen: ")).append(rect).toString());
        stringbuilder.append("; packageName: ").append(getPackageName());
        stringbuilder.append("; className: ").append(getClassName());
        stringbuilder.append("; text: ").append(IMPL.getText(mInfo));
        stringbuilder.append("; contentDescription: ").append(getContentDescription());
        stringbuilder.append("; viewId: ").append(IMPL.getViewIdResourceName(mInfo));
        stringbuilder.append("; checkable: ").append(IMPL.isCheckable(mInfo));
        stringbuilder.append("; checked: ").append(IMPL.isChecked(mInfo));
        stringbuilder.append("; focusable: ").append(isFocusable());
        stringbuilder.append("; focused: ").append(isFocused());
        stringbuilder.append("; selected: ").append(isSelected());
        stringbuilder.append("; clickable: ").append(isClickable());
        stringbuilder.append("; longClickable: ").append(isLongClickable());
        stringbuilder.append("; enabled: ").append(isEnabled());
        stringbuilder.append("; password: ").append(IMPL.isPassword(mInfo));
        stringbuilder.append((new StringBuilder("; scrollable: ")).append(IMPL.isScrollable(mInfo)).toString());
        stringbuilder.append("; [");
        i = getActions();
_L24:
        if (i == 0) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        k = 1 << Integer.numberOfTrailingZeros(i);
        j = i & ~k;
        k;
        JVM INSTR lookupswitch 18: default 536
    //                   1: 568
    //                   2: 575
    //                   4: 582
    //                   8: 589
    //                   16: 596
    //                   32: 603
    //                   64: 610
    //                   128: 617
    //                   256: 624
    //                   512: 631
    //                   1024: 638
    //                   2048: 645
    //                   4096: 652
    //                   8192: 659
    //                   16384: 673
    //                   32768: 680
    //                   65536: 666
    //                   131072: 687;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L3:
        String s = "ACTION_UNKNOWN";
_L22:
        stringbuilder.append(s);
        i = j;
        if (j != 0)
        {
            stringbuilder.append(", ");
            i = j;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        s = "ACTION_FOCUS";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "ACTION_CLEAR_FOCUS";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "ACTION_SELECT";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "ACTION_CLEAR_SELECTION";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "ACTION_CLICK";
        continue; /* Loop/switch isn't completed */
_L9:
        s = "ACTION_LONG_CLICK";
        continue; /* Loop/switch isn't completed */
_L10:
        s = "ACTION_ACCESSIBILITY_FOCUS";
        continue; /* Loop/switch isn't completed */
_L11:
        s = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        continue; /* Loop/switch isn't completed */
_L12:
        s = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        continue; /* Loop/switch isn't completed */
_L13:
        s = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        continue; /* Loop/switch isn't completed */
_L14:
        s = "ACTION_NEXT_HTML_ELEMENT";
        continue; /* Loop/switch isn't completed */
_L15:
        s = "ACTION_PREVIOUS_HTML_ELEMENT";
        continue; /* Loop/switch isn't completed */
_L16:
        s = "ACTION_SCROLL_FORWARD";
        continue; /* Loop/switch isn't completed */
_L17:
        s = "ACTION_SCROLL_BACKWARD";
        continue; /* Loop/switch isn't completed */
_L20:
        s = "ACTION_CUT";
        continue; /* Loop/switch isn't completed */
_L18:
        s = "ACTION_COPY";
        continue; /* Loop/switch isn't completed */
_L19:
        s = "ACTION_PASTE";
        continue; /* Loop/switch isn't completed */
_L21:
        s = "ACTION_SET_SELECTION";
        if (true) goto _L22; else goto _L2
_L2:
        stringbuilder.append("]");
        return stringbuilder.toString();
        if (true) goto _L24; else goto _L23
_L23:
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
