// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            ViewGroupCompatHC, NestedScrollingParent, ViewGroupCompatIcs, ViewGroupCompatJellybeanMR2, 
//            ViewGroupCompatLollipop

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

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            return ViewGroupCompatIcs.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
        }

        ViewGroupCompatIcsImpl()
        {
        }
    }

    static interface ViewGroupCompatImpl
    {

        public abstract int getLayoutMode(ViewGroup viewgroup);

        public abstract int getNestedScrollAxes(ViewGroup viewgroup);

        public abstract boolean isTransitionGroup(ViewGroup viewgroup);

        public abstract boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

        public abstract void setLayoutMode(ViewGroup viewgroup, int i);

        public abstract void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag);

        public abstract void setTransitionGroup(ViewGroup viewgroup, boolean flag);
    }

    static class ViewGroupCompatJellybeanMR2Impl extends ViewGroupCompatIcsImpl
    {

        public int getLayoutMode(ViewGroup viewgroup)
        {
            return ViewGroupCompatJellybeanMR2.getLayoutMode(viewgroup);
        }

        public void setLayoutMode(ViewGroup viewgroup, int i)
        {
            ViewGroupCompatJellybeanMR2.setLayoutMode(viewgroup, i);
        }

        ViewGroupCompatJellybeanMR2Impl()
        {
        }
    }

    static class ViewGroupCompatLollipopImpl extends ViewGroupCompatJellybeanMR2Impl
    {

        public int getNestedScrollAxes(ViewGroup viewgroup)
        {
            return ViewGroupCompatLollipop.getNestedScrollAxes(viewgroup);
        }

        public boolean isTransitionGroup(ViewGroup viewgroup)
        {
            return ViewGroupCompatLollipop.isTransitionGroup(viewgroup);
        }

        public void setTransitionGroup(ViewGroup viewgroup, boolean flag)
        {
            ViewGroupCompatLollipop.setTransitionGroup(viewgroup, flag);
        }

        ViewGroupCompatLollipopImpl()
        {
        }
    }

    static class ViewGroupCompatStubImpl
        implements ViewGroupCompatImpl
    {

        public int getLayoutMode(ViewGroup viewgroup)
        {
            return 0;
        }

        public int getNestedScrollAxes(ViewGroup viewgroup)
        {
            if (viewgroup instanceof NestedScrollingParent)
            {
                return ((NestedScrollingParent)viewgroup).getNestedScrollAxes();
            } else
            {
                return 0;
            }
        }

        public boolean isTransitionGroup(ViewGroup viewgroup)
        {
            return false;
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            return true;
        }

        public void setLayoutMode(ViewGroup viewgroup, int i)
        {
        }

        public void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
        {
        }

        public void setTransitionGroup(ViewGroup viewgroup, boolean flag)
        {
        }

        ViewGroupCompatStubImpl()
        {
        }
    }


    static final ViewGroupCompatImpl IMPL;
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

    private ViewGroupCompat()
    {
    }

    public static int getLayoutMode(ViewGroup viewgroup)
    {
        return IMPL.getLayoutMode(viewgroup);
    }

    public static int getNestedScrollAxes(ViewGroup viewgroup)
    {
        return IMPL.getNestedScrollAxes(viewgroup);
    }

    public static boolean isTransitionGroup(ViewGroup viewgroup)
    {
        return IMPL.isTransitionGroup(viewgroup);
    }

    public static boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return IMPL.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
    }

    public static void setLayoutMode(ViewGroup viewgroup, int i)
    {
        IMPL.setLayoutMode(viewgroup, i);
    }

    public static void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
    {
        IMPL.setMotionEventSplittingEnabled(viewgroup, flag);
    }

    public static void setTransitionGroup(ViewGroup viewgroup, boolean flag)
    {
        IMPL.setTransitionGroup(viewgroup, flag);
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
