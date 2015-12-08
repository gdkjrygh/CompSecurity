// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ViewGroupCompat
{

    static final ViewGroupCompatImpl IMPL;
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

    private ViewGroupCompat()
    {
    }

    public static int getLayoutMode(ViewGroup viewgroup)
    {
    /* block-local class not found */
    class ViewGroupCompatImpl {}

        return IMPL.getLayoutMode(viewgroup);
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
    /* block-local class not found */
    class ViewGroupCompatApi21Impl {}

    /* block-local class not found */
    class ViewGroupCompatHCImpl {}

    /* block-local class not found */
    class ViewGroupCompatIcsImpl {}

    /* block-local class not found */
    class ViewGroupCompatJellybeanMR2Impl {}

    /* block-local class not found */
    class ViewGroupCompatStubImpl {}

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
            IMPL = new ViewGroupCompatStubImpl();
        }
    }
}
