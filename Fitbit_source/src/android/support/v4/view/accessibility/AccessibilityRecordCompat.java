// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Parcelable;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat

public class AccessibilityRecordCompat
{

    private static final AccessibilityRecordImpl IMPL;
    private final Object mRecord;

    public AccessibilityRecordCompat(Object obj)
    {
        mRecord = obj;
    }

    public static AccessibilityRecordCompat obtain()
    {
    /* block-local class not found */
    class AccessibilityRecordImpl {}

        return new AccessibilityRecordCompat(IMPL.obtain());
    }

    public static AccessibilityRecordCompat obtain(AccessibilityRecordCompat accessibilityrecordcompat)
    {
        return new AccessibilityRecordCompat(IMPL.obtain(accessibilityrecordcompat.mRecord));
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
        obj = (AccessibilityRecordCompat)obj;
        if (mRecord != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((AccessibilityRecordCompat) (obj)).mRecord == null) goto _L1; else goto _L3
_L3:
        return false;
        if (mRecord.equals(((AccessibilityRecordCompat) (obj)).mRecord)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int getAddedCount()
    {
        return IMPL.getAddedCount(mRecord);
    }

    public CharSequence getBeforeText()
    {
        return IMPL.getBeforeText(mRecord);
    }

    public CharSequence getClassName()
    {
        return IMPL.getClassName(mRecord);
    }

    public CharSequence getContentDescription()
    {
        return IMPL.getContentDescription(mRecord);
    }

    public int getCurrentItemIndex()
    {
        return IMPL.getCurrentItemIndex(mRecord);
    }

    public int getFromIndex()
    {
        return IMPL.getFromIndex(mRecord);
    }

    public Object getImpl()
    {
        return mRecord;
    }

    public int getItemCount()
    {
        return IMPL.getItemCount(mRecord);
    }

    public int getMaxScrollX()
    {
        return IMPL.getMaxScrollX(mRecord);
    }

    public int getMaxScrollY()
    {
        return IMPL.getMaxScrollY(mRecord);
    }

    public Parcelable getParcelableData()
    {
        return IMPL.getParcelableData(mRecord);
    }

    public int getRemovedCount()
    {
        return IMPL.getRemovedCount(mRecord);
    }

    public int getScrollX()
    {
        return IMPL.getScrollX(mRecord);
    }

    public int getScrollY()
    {
        return IMPL.getScrollY(mRecord);
    }

    public AccessibilityNodeInfoCompat getSource()
    {
        return IMPL.getSource(mRecord);
    }

    public List getText()
    {
        return IMPL.getText(mRecord);
    }

    public int getToIndex()
    {
        return IMPL.getToIndex(mRecord);
    }

    public int getWindowId()
    {
        return IMPL.getWindowId(mRecord);
    }

    public int hashCode()
    {
        if (mRecord == null)
        {
            return 0;
        } else
        {
            return mRecord.hashCode();
        }
    }

    public boolean isChecked()
    {
        return IMPL.isChecked(mRecord);
    }

    public boolean isEnabled()
    {
        return IMPL.isEnabled(mRecord);
    }

    public boolean isFullScreen()
    {
        return IMPL.isFullScreen(mRecord);
    }

    public boolean isPassword()
    {
        return IMPL.isPassword(mRecord);
    }

    public boolean isScrollable()
    {
        return IMPL.isScrollable(mRecord);
    }

    public void recycle()
    {
        IMPL.recycle(mRecord);
    }

    public void setAddedCount(int i)
    {
        IMPL.setAddedCount(mRecord, i);
    }

    public void setBeforeText(CharSequence charsequence)
    {
        IMPL.setBeforeText(mRecord, charsequence);
    }

    public void setChecked(boolean flag)
    {
        IMPL.setChecked(mRecord, flag);
    }

    public void setClassName(CharSequence charsequence)
    {
        IMPL.setClassName(mRecord, charsequence);
    }

    public void setContentDescription(CharSequence charsequence)
    {
        IMPL.setContentDescription(mRecord, charsequence);
    }

    public void setCurrentItemIndex(int i)
    {
        IMPL.setCurrentItemIndex(mRecord, i);
    }

    public void setEnabled(boolean flag)
    {
        IMPL.setEnabled(mRecord, flag);
    }

    public void setFromIndex(int i)
    {
        IMPL.setFromIndex(mRecord, i);
    }

    public void setFullScreen(boolean flag)
    {
        IMPL.setFullScreen(mRecord, flag);
    }

    public void setItemCount(int i)
    {
        IMPL.setItemCount(mRecord, i);
    }

    public void setMaxScrollX(int i)
    {
        IMPL.setMaxScrollX(mRecord, i);
    }

    public void setMaxScrollY(int i)
    {
        IMPL.setMaxScrollY(mRecord, i);
    }

    public void setParcelableData(Parcelable parcelable)
    {
        IMPL.setParcelableData(mRecord, parcelable);
    }

    public void setPassword(boolean flag)
    {
        IMPL.setPassword(mRecord, flag);
    }

    public void setRemovedCount(int i)
    {
        IMPL.setRemovedCount(mRecord, i);
    }

    public void setScrollX(int i)
    {
        IMPL.setScrollX(mRecord, i);
    }

    public void setScrollY(int i)
    {
        IMPL.setScrollY(mRecord, i);
    }

    public void setScrollable(boolean flag)
    {
        IMPL.setScrollable(mRecord, flag);
    }

    public void setSource(View view)
    {
        IMPL.setSource(mRecord, view);
    }

    public void setSource(View view, int i)
    {
        IMPL.setSource(mRecord, view, i);
    }

    public void setToIndex(int i)
    {
        IMPL.setToIndex(mRecord, i);
    }

    static 
    {
    /* block-local class not found */
    class AccessibilityRecordIcsImpl {}

    /* block-local class not found */
    class AccessibilityRecordIcsMr1Impl {}

    /* block-local class not found */
    class AccessibilityRecordJellyBeanImpl {}

    /* block-local class not found */
    class AccessibilityRecordStubImpl {}

        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new AccessibilityRecordJellyBeanImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            IMPL = new AccessibilityRecordIcsMr1Impl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new AccessibilityRecordIcsImpl();
        } else
        {
            IMPL = new AccessibilityRecordStubImpl();
        }
    }
}
