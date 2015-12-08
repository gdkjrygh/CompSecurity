// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityRecordCompatIcs, AccessibilityRecordCompatIcsMr1

public class AccessibilityRecordCompat
{
    static class AccessibilityRecordIcsImpl extends AccessibilityRecordStubImpl
    {

        public Object obtain()
        {
            return AccessibilityRecordCompatIcs.obtain();
        }

        public void setFromIndex(Object obj, int i)
        {
            AccessibilityRecordCompatIcs.setFromIndex(obj, i);
        }

        public void setItemCount(Object obj, int i)
        {
            AccessibilityRecordCompatIcs.setItemCount(obj, i);
        }

        public void setScrollX(Object obj, int i)
        {
            AccessibilityRecordCompatIcs.setScrollX(obj, i);
        }

        public void setScrollY(Object obj, int i)
        {
            AccessibilityRecordCompatIcs.setScrollY(obj, i);
        }

        public void setScrollable(Object obj, boolean flag)
        {
            AccessibilityRecordCompatIcs.setScrollable(obj, flag);
        }

        public void setToIndex(Object obj, int i)
        {
            AccessibilityRecordCompatIcs.setToIndex(obj, i);
        }

        AccessibilityRecordIcsImpl()
        {
        }
    }

    static class AccessibilityRecordIcsMr1Impl extends AccessibilityRecordIcsImpl
    {

        public void setMaxScrollX(Object obj, int i)
        {
            AccessibilityRecordCompatIcsMr1.setMaxScrollX(obj, i);
        }

        public void setMaxScrollY(Object obj, int i)
        {
            AccessibilityRecordCompatIcsMr1.setMaxScrollY(obj, i);
        }

        AccessibilityRecordIcsMr1Impl()
        {
        }
    }

    static interface AccessibilityRecordImpl
    {

        public abstract Object obtain();

        public abstract void setFromIndex(Object obj, int i);

        public abstract void setItemCount(Object obj, int i);

        public abstract void setMaxScrollX(Object obj, int i);

        public abstract void setMaxScrollY(Object obj, int i);

        public abstract void setScrollX(Object obj, int i);

        public abstract void setScrollY(Object obj, int i);

        public abstract void setScrollable(Object obj, boolean flag);

        public abstract void setToIndex(Object obj, int i);
    }

    static class AccessibilityRecordJellyBeanImpl extends AccessibilityRecordIcsMr1Impl
    {

        AccessibilityRecordJellyBeanImpl()
        {
        }
    }

    static class AccessibilityRecordStubImpl
        implements AccessibilityRecordImpl
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

        public void setToIndex(Object obj, int i)
        {
        }

        AccessibilityRecordStubImpl()
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

    public void setFromIndex(int i)
    {
        IMPL.setFromIndex(mRecord, i);
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

    public void setToIndex(int i)
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
