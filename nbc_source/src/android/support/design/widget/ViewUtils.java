// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//            ValueAnimatorCompat, ValueAnimatorCompatImplHoneycombMr1, ValueAnimatorCompatImplEclairMr1, ViewUtilsLollipop

class ViewUtils
{
    private static interface ViewUtilsImpl
    {

        public abstract void setBoundsViewOutlineProvider(View view);
    }

    private static class ViewUtilsImplBase
        implements ViewUtilsImpl
    {

        public void setBoundsViewOutlineProvider(View view)
        {
        }

        private ViewUtilsImplBase()
        {
        }

    }

    private static class ViewUtilsImplLollipop
        implements ViewUtilsImpl
    {

        public void setBoundsViewOutlineProvider(View view)
        {
            ViewUtilsLollipop.setBoundsViewOutlineProvider(view);
        }

        private ViewUtilsImplLollipop()
        {
        }

    }


    static final ValueAnimatorCompat.Creator DEFAULT_ANIMATOR_CREATOR = new ValueAnimatorCompat.Creator() {

        public ValueAnimatorCompat createAnimator()
        {
            Object obj;
            if (android.os.Build.VERSION.SDK_INT >= 12)
            {
                obj = new ValueAnimatorCompatImplHoneycombMr1();
            } else
            {
                obj = new ValueAnimatorCompatImplEclairMr1();
            }
            return new ValueAnimatorCompat(((ValueAnimatorCompat.Impl) (obj)));
        }

    };
    private static final ViewUtilsImpl IMPL;

    ViewUtils()
    {
    }

    static ValueAnimatorCompat createAnimator()
    {
        return DEFAULT_ANIMATOR_CREATOR.createAnimator();
    }

    static void setBoundsViewOutlineProvider(View view)
    {
        IMPL.setBoundsViewOutlineProvider(view);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            IMPL = new ViewUtilsImplLollipop();
        } else
        {
            IMPL = new ViewUtilsImplBase();
        }
    }
}
