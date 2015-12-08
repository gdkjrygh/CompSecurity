// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;


public class ScaleGestureDetectorCompat
{

    static final ScaleGestureDetectorImpl IMPL;

    private ScaleGestureDetectorCompat()
    {
    }

    public static boolean isQuickScaleEnabled(Object obj)
    {
        return IMPL.isQuickScaleEnabled(obj);
    }

    public static void setQuickScaleEnabled(Object obj, boolean flag)
    {
        IMPL.setQuickScaleEnabled(obj, flag);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            IMPL = new ScaleGestureDetectorCompatKitKatImpl(null);
        } else
        {
            IMPL = new BaseScaleGestureDetectorImpl(null);
        }
    }

    private class ScaleGestureDetectorImpl
    {

        public abstract boolean isQuickScaleEnabled(Object obj);

        public abstract void setQuickScaleEnabled(Object obj, boolean flag);
    }


    private class ScaleGestureDetectorCompatKitKatImpl
        implements ScaleGestureDetectorImpl
    {

        public boolean isQuickScaleEnabled(Object obj)
        {
            return ScaleGestureDetectorCompatKitKat.isQuickScaleEnabled(obj);
        }

        public void setQuickScaleEnabled(Object obj, boolean flag)
        {
            ScaleGestureDetectorCompatKitKat.setQuickScaleEnabled(obj, flag);
        }

        private ScaleGestureDetectorCompatKitKatImpl()
        {
        }

        ScaleGestureDetectorCompatKitKatImpl(_cls1 _pcls1)
        {
            this();
        }
    }


    private class BaseScaleGestureDetectorImpl
        implements ScaleGestureDetectorImpl
    {

        public boolean isQuickScaleEnabled(Object obj)
        {
            return false;
        }

        public void setQuickScaleEnabled(Object obj, boolean flag)
        {
        }

        private BaseScaleGestureDetectorImpl()
        {
        }

        BaseScaleGestureDetectorImpl(_cls1 _pcls1)
        {
            this();
        }
    }

}
