// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;


public class MarginLayoutParamsCompat
{

    static final MarginLayoutParamsCompatImpl IMPL;

    public MarginLayoutParamsCompat()
    {
    }

    public static int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
    /* block-local class not found */
    class MarginLayoutParamsCompatImpl {}

        return IMPL.getLayoutDirection(marginlayoutparams);
    }

    public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        return IMPL.getMarginEnd(marginlayoutparams);
    }

    public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        return IMPL.getMarginStart(marginlayoutparams);
    }

    public static boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        return IMPL.isMarginRelative(marginlayoutparams);
    }

    public static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
    {
        IMPL.resolveLayoutDirection(marginlayoutparams, i);
    }

    public static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
    {
        IMPL.setLayoutDirection(marginlayoutparams, i);
    }

    public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
    {
        IMPL.setMarginEnd(marginlayoutparams, i);
    }

    public static void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
    {
        IMPL.setMarginStart(marginlayoutparams, i);
    }

    static 
    {
    /* block-local class not found */
    class MarginLayoutParamsCompatImplBase {}

    /* block-local class not found */
    class MarginLayoutParamsCompatImplJbMr1 {}

        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            IMPL = new MarginLayoutParamsCompatImplJbMr1();
        } else
        {
            IMPL = new MarginLayoutParamsCompatImplBase();
        }
    }
}
