// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v13.app;

import android.app.Fragment;

// Referenced classes of package android.support.v13.app:
//            FragmentCompatICS, FragmentCompatICSMR1

public class FragmentCompat
{
    static class BaseFragmentCompatImpl
        implements FragmentCompatImpl
    {

        public void setMenuVisibility(Fragment fragment, boolean flag)
        {
        }

        public void setUserVisibleHint(Fragment fragment, boolean flag)
        {
        }

        BaseFragmentCompatImpl()
        {
        }
    }

    static interface FragmentCompatImpl
    {

        public abstract void setMenuVisibility(Fragment fragment, boolean flag);

        public abstract void setUserVisibleHint(Fragment fragment, boolean flag);
    }

    static class ICSFragmentCompatImpl extends BaseFragmentCompatImpl
    {

        public void setMenuVisibility(Fragment fragment, boolean flag)
        {
            FragmentCompatICS.setMenuVisibility(fragment, flag);
        }

        ICSFragmentCompatImpl()
        {
        }
    }

    static class ICSMR1FragmentCompatImpl extends ICSFragmentCompatImpl
    {

        public void setUserVisibleHint(Fragment fragment, boolean flag)
        {
            FragmentCompatICSMR1.setUserVisibleHint(fragment, flag);
        }

        ICSMR1FragmentCompatImpl()
        {
        }
    }


    static final FragmentCompatImpl IMPL;

    public FragmentCompat()
    {
    }

    public static void setMenuVisibility(Fragment fragment, boolean flag)
    {
        IMPL.setMenuVisibility(fragment, flag);
    }

    public static void setUserVisibleHint(Fragment fragment, boolean flag)
    {
        IMPL.setUserVisibleHint(fragment, flag);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            IMPL = new ICSMR1FragmentCompatImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new ICSFragmentCompatImpl();
        } else
        {
            IMPL = new BaseFragmentCompatImpl();
        }
    }
}
