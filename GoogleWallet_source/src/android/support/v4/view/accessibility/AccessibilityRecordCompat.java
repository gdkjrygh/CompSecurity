// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.View;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityRecordCompatIcs

public final class AccessibilityRecordCompat
{
    static class AccessibilityRecordIcsImpl extends AccessibilityRecordImpl
    {

        public final Object obtain()
        {
            return AccessibilityRecordCompatIcs.obtain();
        }

        public final void setFromIndex(Object obj, int i)
        {
            AccessibilityRecordCompatIcs.setFromIndex(obj, i);
        }

        public final void setItemCount(Object obj, int i)
        {
            AccessibilityRecordCompatIcs.setItemCount(obj, i);
        }

        public final void setScrollable(Object obj, boolean flag)
        {
            AccessibilityRecordCompatIcs.setScrollable(obj, flag);
        }

        public final void setSource(Object obj, View view)
        {
            AccessibilityRecordCompatIcs.setSource(obj, view);
        }

        public final void setToIndex(Object obj, int i)
        {
            AccessibilityRecordCompatIcs.setToIndex(obj, i);
        }

        AccessibilityRecordIcsImpl()
        {
        }
    }

    static class AccessibilityRecordIcsMr1Impl extends AccessibilityRecordIcsImpl
    {

        AccessibilityRecordIcsMr1Impl()
        {
        }
    }

    static class AccessibilityRecordImpl
    {

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

        public void setScrollable(Object obj, boolean flag)
        {
        }

        public void setSource(Object obj, View view)
        {
        }

        public void setToIndex(Object obj, int i)
        {
        }

        AccessibilityRecordImpl()
        {
        }
    }

    static final class AccessibilityRecordJellyBeanImpl extends AccessibilityRecordIcsMr1Impl
    {

        AccessibilityRecordJellyBeanImpl()
        {
        }
    }


    private static final AccessibilityRecordImpl IMPL;
    private final Object mRecord;

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

    public final void setSource(View view)
    {
        IMPL.setSource(mRecord, view);
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
            IMPL = new AccessibilityRecordImpl();
        }
    }
}
