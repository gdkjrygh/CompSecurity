// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

public final class AccessibilityRecordCompat
{
    static class AccessibilityRecordIcsImpl extends AccessibilityRecordStubImpl
    {

        public final int getItemCount(Object obj)
        {
            return ((AccessibilityRecord)obj).getItemCount();
        }

        public final Object obtain()
        {
            return AccessibilityRecord.obtain();
        }

        public final void setFromIndex(Object obj, int i)
        {
            ((AccessibilityRecord)obj).setFromIndex(i);
        }

        public final void setItemCount(Object obj, int i)
        {
            ((AccessibilityRecord)obj).setItemCount(i);
        }

        public final void setScrollX(Object obj, int i)
        {
            ((AccessibilityRecord)obj).setScrollX(i);
        }

        public final void setScrollY(Object obj, int i)
        {
            ((AccessibilityRecord)obj).setScrollY(i);
        }

        public final void setScrollable(Object obj, boolean flag)
        {
            ((AccessibilityRecord)obj).setScrollable(flag);
        }

        public final void setSource(Object obj, View view)
        {
            ((AccessibilityRecord)obj).setSource(view);
        }

        public final void setToIndex(Object obj, int i)
        {
            ((AccessibilityRecord)obj).setToIndex(i);
        }

        AccessibilityRecordIcsImpl()
        {
        }
    }

    static class AccessibilityRecordIcsMr1Impl extends AccessibilityRecordIcsImpl
    {

        public final void setMaxScrollX(Object obj, int i)
        {
            ((AccessibilityRecord)obj).setMaxScrollX(i);
        }

        public final void setMaxScrollY(Object obj, int i)
        {
            ((AccessibilityRecord)obj).setMaxScrollY(i);
        }

        AccessibilityRecordIcsMr1Impl()
        {
        }
    }

    public static interface AccessibilityRecordImpl
    {

        public abstract int getItemCount(Object obj);

        public abstract Object obtain();

        public abstract void setFromIndex(Object obj, int i);

        public abstract void setItemCount(Object obj, int i);

        public abstract void setMaxScrollX(Object obj, int i);

        public abstract void setMaxScrollY(Object obj, int i);

        public abstract void setScrollX(Object obj, int i);

        public abstract void setScrollY(Object obj, int i);

        public abstract void setScrollable(Object obj, boolean flag);

        public abstract void setSource(Object obj, View view);

        public abstract void setToIndex(Object obj, int i);
    }

    static final class AccessibilityRecordJellyBeanImpl extends AccessibilityRecordIcsMr1Impl
    {

        AccessibilityRecordJellyBeanImpl()
        {
        }
    }

    static class AccessibilityRecordStubImpl
        implements AccessibilityRecordImpl
    {

        public int getItemCount(Object obj)
        {
            return 0;
        }

        public Object obtain()
        {
            return null;
        }

        public void setFromIndex(Object obj, int i)
        {
        }

        public void setItemCount(Object obj, int i)
        {
        }

        public void setMaxScrollX(Object obj, int i)
        {
        }

        public void setMaxScrollY(Object obj, int i)
        {
        }

        public void setScrollX(Object obj, int i)
        {
        }

        public void setScrollY(Object obj, int i)
        {
        }

        public void setScrollable(Object obj, boolean flag)
        {
        }

        public void setSource(Object obj, View view)
        {
        }

        public void setToIndex(Object obj, int i)
        {
        }

        AccessibilityRecordStubImpl()
        {
        }
    }


    public static final AccessibilityRecordImpl IMPL;
    public final Object mRecord;

    public AccessibilityRecordCompat(Object obj)
    {
        mRecord = obj;
    }

    public static AccessibilityRecordCompat obtain()
    {
        return new AccessibilityRecordCompat(IMPL.obtain());
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

    public final int hashCode()
    {
        if (mRecord == null)
        {
            return 0;
        } else
        {
            return mRecord.hashCode();
        }
    }

    public final void setFromIndex(int i)
    {
        IMPL.setFromIndex(mRecord, i);
    }

    public final void setItemCount(int i)
    {
        IMPL.setItemCount(mRecord, i);
    }

    public final void setScrollable(boolean flag)
    {
        IMPL.setScrollable(mRecord, flag);
    }

    public final void setToIndex(int i)
    {
        IMPL.setToIndex(mRecord, i);
    }

    static 
    {
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
