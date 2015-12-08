// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//            ViewGroupCompatHC

public final class ViewGroupCompat
{
    static final class ViewGroupCompatApi21Impl extends ViewGroupCompatJellybeanMR2Impl
    {

        ViewGroupCompatApi21Impl()
        {
        }
    }

    static class ViewGroupCompatHCImpl extends ViewGroupCompatImpl
    {

        public final void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
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

    static class ViewGroupCompatImpl
    {

        public void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
        {
        }

        ViewGroupCompatImpl()
        {
        }
    }

    static class ViewGroupCompatJellybeanMR2Impl extends ViewGroupCompatIcsImpl
    {

        ViewGroupCompatJellybeanMR2Impl()
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
            IMPL = new ViewGroupCompatApi21Impl();
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
            IMPL = new ViewGroupCompatImpl();
        }
    }
}
