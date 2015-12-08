// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            DrawableCompatHoneycomb, DrawableCompatKitKat

public class DrawableCompat
{
    static class BaseDrawableImpl
        implements DrawableImpl
    {

        public boolean isAutoMirrored(Drawable drawable)
        {
            return false;
        }

        public void jumpToCurrentState(Drawable drawable)
        {
        }

        public void setAutoMirrored(Drawable drawable, boolean flag)
        {
        }

        BaseDrawableImpl()
        {
        }
    }

    static interface DrawableImpl
    {

        public abstract boolean isAutoMirrored(Drawable drawable);

        public abstract void jumpToCurrentState(Drawable drawable);

        public abstract void setAutoMirrored(Drawable drawable, boolean flag);
    }

    static class HoneycombDrawableImpl extends BaseDrawableImpl
    {

        public void jumpToCurrentState(Drawable drawable)
        {
            DrawableCompatHoneycomb.jumpToCurrentState(drawable);
        }

        HoneycombDrawableImpl()
        {
        }
    }

    static class KitKatDrawableImpl extends HoneycombDrawableImpl
    {

        public boolean isAutoMirrored(Drawable drawable)
        {
            return DrawableCompatKitKat.isAutoMirrored(drawable);
        }

        public void setAutoMirrored(Drawable drawable, boolean flag)
        {
            DrawableCompatKitKat.setAutoMirrored(drawable, flag);
        }

        KitKatDrawableImpl()
        {
        }
    }


    static final DrawableImpl IMPL;

    public DrawableCompat()
    {
    }

    public static boolean isAutoMirrored(Drawable drawable)
    {
        return IMPL.isAutoMirrored(drawable);
    }

    public static void jumpToCurrentState(Drawable drawable)
    {
        IMPL.jumpToCurrentState(drawable);
    }

    public static void setAutoMirrored(Drawable drawable, boolean flag)
    {
        IMPL.setAutoMirrored(drawable, flag);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 19)
        {
            IMPL = new KitKatDrawableImpl();
        } else
        if (i >= 11)
        {
            IMPL = new HoneycombDrawableImpl();
        } else
        {
            IMPL = new BaseDrawableImpl();
        }
    }
}
