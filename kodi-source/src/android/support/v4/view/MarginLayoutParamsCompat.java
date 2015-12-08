// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//            MarginLayoutParamsCompatJellybeanMr1

public class MarginLayoutParamsCompat
{
    static interface MarginLayoutParamsCompatImpl
    {

        public abstract int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams);

        public abstract int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams);
    }

    static class MarginLayoutParamsCompatImplBase
        implements MarginLayoutParamsCompatImpl
    {

        public int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            return marginlayoutparams.rightMargin;
        }

        public int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            return marginlayoutparams.leftMargin;
        }

        MarginLayoutParamsCompatImplBase()
        {
        }
    }

    static class MarginLayoutParamsCompatImplJbMr1
        implements MarginLayoutParamsCompatImpl
    {

        public int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            return MarginLayoutParamsCompatJellybeanMr1.getMarginEnd(marginlayoutparams);
        }

        public int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            return MarginLayoutParamsCompatJellybeanMr1.getMarginStart(marginlayoutparams);
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
