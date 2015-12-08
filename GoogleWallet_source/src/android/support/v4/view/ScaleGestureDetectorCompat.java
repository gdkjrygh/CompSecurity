// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//            ScaleGestureDetectorCompatKitKat

public final class ScaleGestureDetectorCompat
{
    static final class BaseScaleGestureDetectorImpl
        implements ScaleGestureDetectorImpl
    {

        public final boolean isQuickScaleEnabled(Object obj)
        {
            return false;
        }

        private BaseScaleGestureDetectorImpl()
        {
        }

    }

    static final class ScaleGestureDetectorCompatKitKatImpl
        implements ScaleGestureDetectorImpl
    {

        public final boolean isQuickScaleEnabled(Object obj)
        {
            return ScaleGestureDetectorCompatKitKat.isQuickScaleEnabled(obj);
        }

        private ScaleGestureDetectorCompatKitKatImpl()
        {
        }

    }

    static interface ScaleGestureDetectorImpl
    {

        public abstract boolean isQuickScaleEnabled(Object obj);
    }


    static final ScaleGestureDetectorImpl IMPL;

    public static boolean isQuickScaleEnabled(Object obj)
    {
        return IMPL.isQuickScaleEnabled(obj);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            IMPL = new ScaleGestureDetectorCompatKitKatImpl();
        } else
        {
            IMPL = new BaseScaleGestureDetectorImpl();
        }
    }
}
