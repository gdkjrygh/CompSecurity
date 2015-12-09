// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;


public final class MarginLayoutParamsCompat
{
    static interface MarginLayoutParamsCompatImpl
    {

        public abstract int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams);

        public abstract int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams);
    }

    static final class MarginLayoutParamsCompatImplBase
        implements MarginLayoutParamsCompatImpl
    {

        public final int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            return marginlayoutparams.rightMargin;
        }

        public final int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            return marginlayoutparams.leftMargin;
        }

        MarginLayoutParamsCompatImplBase()
        {
        }
    }

    static final class MarginLayoutParamsCompatImplJbMr1
        implements MarginLayoutParamsCompatImpl
    {

        public final int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            return marginlayoutparams.getMarginEnd();
        }

        public final int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            return marginlayoutparams.getMarginStart();
        }

        MarginLayoutParamsCompatImplJbMr1()
        {
        }
    }


    static final MarginLayoutParamsCompatImpl IMPL;

    public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        return IMPL.getMarginEnd(marginlayoutparams);
    }

    public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        return IMPL.getMarginStart(marginlayoutparams);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            IMPL = new MarginLayoutParamsCompatImplJbMr1();
        } else
        {
            IMPL = new MarginLayoutParamsCompatImplBase();
        }
    }
}
