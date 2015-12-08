// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompatIcs

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

        public AccessibilityNodeInfoCompat getChild(Object obj, int i)
        {
            return new AccessibilityNodeInfoCompat(AccessibilityNodeInfoCompat.IMPL.getChild(obj, i));
        }

        public volatile Object getChild(Object obj, int i)
        {
            return getChild(obj, i);
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

        public AccessibilityNodeInfoCompat getParent(Object obj)
        {
            return new AccessibilityNodeInfoCompat(AccessibilityNodeInfoCompat.IMPL.getParent(obj));
        }

        public volatile Object getParent(Object obj)
        {
            return getParent(obj);
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

        public abstract List findAccessibilityNodeInfosByText(Object obj, String s);

        public abstract int getActions(Object obj);

        public abstract void getBoundsInParent(Object obj, Rect rect);

        public abstract void getBoundsInScreen(Object obj, Rect rect);

        public abstract Object getChild(Object obj, int i);

        public abstract int getChildCount(Object obj);

        public abstract CharSequence getClassName(Object obj);

        public abstract CharSequence getContentDescription(Object obj);

        public abstract CharSequence getPackageName(Object obj);

        public abstract Object getParent(Object obj);

        public abstract CharSequence getText(Object obj);

        public abstract int getWindowId(Object obj);

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

        public abstract Object obtain();

        public abstract Object obtain(View view);

        public abstract Object obtain(Object obj);

        public abstract boolean performAction(Object obj, int i);

        public abstract void recycle(Object obj);

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

        public abstract void setPackageName(Object obj, CharSequence charsequence);

        public abstract void setParent(Object obj, View view);

        public abstract void setPassword(Object obj, boolean flag);

        public abstract void setScrollable(Object obj, boolean flag);

        public abstract void setSelected(Object obj, boolean flag);

        public abstract void setSource(Object obj, View view);

        public abstract void setText(Object obj, CharSequence charsequence);
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

        public List findAccessibilityNodeInfosByText(Object obj, String s)
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

        public CharSequence getPackageName(Object obj)
        {
            return null;
        }

        public AccessibilityNodeInfoCompat getParent(Object obj)
        {
            return null;
        }

        public volatile Object getParent(Object obj)
        {
            return getParent(obj);
        }

        public CharSequence getText(Object obj)
        {
            return null;
        }

        public int getWindowId(Object obj)
        {
            return 0;
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

        public Object obtain()
        {
            return null;
        }

        public Object obtain(View view)
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

        public void recycle(Object obj)
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

        public void setPackageName(Object obj, CharSequence charsequence)
        {
        }

        public void setParent(Object obj, View view)
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

        public void setText(Object obj, CharSequence charsequence)
        {
        }

        AccessibilityNodeInfoStubImpl()
        {
        }
    }


    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_SELECT = 4;
    private static final AccessibilityNodeInfoImpl IMPL;
    private final Object mInfo;

    public AccessibilityNodeInfoCompat(Object obj)
    {
        mInfo = obj;
    }

    public static AccessibilityNodeInfoCompat obtain()
    {
        return new AccessibilityNodeInfoCompat(IMPL.obtain());
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        return new AccessibilityNodeInfoCompat(IMPL.obtain(accessibilitynodeinfocompat.mInfo));
    }

    public static AccessibilityNodeInfoCompat obtain(View view)
    {
        return new AccessibilityNodeInfoCompat(IMPL.obtain(view));
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
        return new AccessibilityNodeInfoCompat(IMPL.getChild(mInfo, i));
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

    public Object getImpl()
    {
        return mInfo;
    }

    public CharSequence getPackageName()
    {
        return IMPL.getPackageName(mInfo);
    }

    public AccessibilityNodeInfoCompat getParent()
    {
        return new AccessibilityNodeInfoCompat(IMPL.getParent(mInfo));
    }

    public CharSequence getText()
    {
        return IMPL.getText(mInfo);
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

    public boolean performAction(int i)
    {
        return IMPL.performAction(mInfo, i);
    }

    public void recycle()
    {
        IMPL.recycle(mInfo);
    }

    public void setBoundsInParent(Rect rect)
    {
        IMPL.setBoundsInParent(mInfo, rect);
    }

    public void setBoundsInScreen(Rect rect)
    {
        IMPL.setBoundsInParent(mInfo, rect);
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

    public void setPackageName(CharSequence charsequence)
    {
        IMPL.setPackageName(mInfo, charsequence);
    }

    public void setParent(View view)
    {
        IMPL.setParent(mInfo, view);
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

    public void setText(CharSequence charsequence)
    {
        IMPL.setText(mInfo, charsequence);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new AccessibilityNodeInfoIcsImpl();
        } else
        {
            IMPL = new AccessibilityNodeInfoStubImpl();
        }
    }

}
