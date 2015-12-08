// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//            ViewGroupCompatHC

public class ViewGroupCompat
{
    static class ViewGroupCompatHCImpl extends ViewGroupCompatStubImpl
    {

        public void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
        {
            ViewGroupCompatHC.setMotionEventSplittingEnabled(viewgroup, flag);
        }

        ViewGroupCompatHCImpl()
        {
        }
    }

    static class ViewGroupCompatIcsImpl extends ViewGroupCompatHCImpl
    {

        ViewGroupCompatIcsImpl()
        {
        }
    }

    static interface ViewGroupCompatImpl
    {

        public abstract void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag);
    }

    static class ViewGroupCompatJellybeanMR2Impl extends ViewGroupCompatIcsImpl
    {

        ViewGroupCompatJellybeanMR2Impl()
        {
        }
    }

    static class ViewGroupCompatLollipopImpl extends ViewGroupCompatJellybeanMR2Impl
    {

        ViewGroupCompatLollipopImpl()
        {
        }
    }

    static class ViewGroupCompatStubImpl
        implements ViewGroupCompatImpl
    {

        public void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
        {
        }

        ViewGroupCompatStubImpl()
        {
        }
    }


    static final ViewGroupCompatImpl IMPL;

    public static void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
    {
        IMPL.setMotionEventSplittingEnabled(viewgroup, flag);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            IMPL = new ViewGroupCompatLollipopImpl();
        } else
        if (i >= 18)
        {
            IMPL = new ViewGroupCompatJellybeanMR2Impl();
        } else
        if (i >= 14)
        {
            IMPL = new ViewGroupCompatIcsImpl();
        } else
        if (i >= 11)
        {
            IMPL = new ViewGroupCompatHCImpl();
        } else
        {
            IMPL = new ViewGroupCompatStubImpl();
        }
    }
}
