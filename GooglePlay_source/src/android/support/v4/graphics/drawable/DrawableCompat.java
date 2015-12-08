// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            DrawableCompatBase, DrawableWrapperDonut, DrawableWrapperHoneycomb, DrawableWrapperKitKat, 
//            DrawableWrapperLollipop

public final class DrawableCompat
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

        public void setHotspot(Drawable drawable, float f, float f1)
        {
        }

        public void setHotspotBounds(Drawable drawable, int i, int j, int k, int l)
        {
        }

        public void setTint(Drawable drawable, int i)
        {
            DrawableCompatBase.setTint(drawable, i);
        }

        public void setTintList(Drawable drawable, ColorStateList colorstatelist)
        {
            DrawableCompatBase.setTintList(drawable, colorstatelist);
        }

        public void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode)
        {
            DrawableCompatBase.setTintMode(drawable, mode);
        }

        public Drawable wrap(Drawable drawable)
        {
            Object obj = drawable;
            if (!(drawable instanceof DrawableWrapperDonut))
            {
                obj = new DrawableWrapperDonut(drawable);
            }
            return ((Drawable) (obj));
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

        public abstract void setHotspot(Drawable drawable, float f, float f1);

        public abstract void setHotspotBounds(Drawable drawable, int i, int j, int k, int l);

        public abstract void setTint(Drawable drawable, int i);

        public abstract void setTintList(Drawable drawable, ColorStateList colorstatelist);

        public abstract void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode);

        public abstract Drawable wrap(Drawable drawable);
    }

    static class HoneycombDrawableImpl extends BaseDrawableImpl
    {

        public final void jumpToCurrentState(Drawable drawable)
        {
            drawable.jumpToCurrentState();
        }

        public Drawable wrap(Drawable drawable)
        {
            Object obj = drawable;
            if (!(drawable instanceof DrawableWrapperHoneycomb))
            {
                obj = new DrawableWrapperHoneycomb(drawable);
            }
            return ((Drawable) (obj));
        }

        HoneycombDrawableImpl()
        {
        }
    }

    static class KitKatDrawableImpl extends HoneycombDrawableImpl
    {

        public final boolean isAutoMirrored(Drawable drawable)
        {
            return drawable.isAutoMirrored();
        }

        public final void setAutoMirrored(Drawable drawable, boolean flag)
        {
            drawable.setAutoMirrored(flag);
        }

        public Drawable wrap(Drawable drawable)
        {
            Object obj = drawable;
            if (!(drawable instanceof DrawableWrapperKitKat))
            {
                obj = new DrawableWrapperKitKat(drawable);
            }
            return ((Drawable) (obj));
        }

        KitKatDrawableImpl()
        {
        }
    }

    static class LollipopDrawableImpl extends KitKatDrawableImpl
    {

        public final void setHotspot(Drawable drawable, float f, float f1)
        {
            drawable.setHotspot(f, f1);
        }

        public final void setHotspotBounds(Drawable drawable, int i, int j, int k, int l)
        {
            drawable.setHotspotBounds(i, j, k, l);
        }

        public final void setTint(Drawable drawable, int i)
        {
            if (drawable instanceof DrawableWrapperLollipop)
            {
                DrawableCompatBase.setTint(drawable, i);
                return;
            } else
            {
                drawable.setTint(i);
                return;
            }
        }

        public final void setTintList(Drawable drawable, ColorStateList colorstatelist)
        {
            if (drawable instanceof DrawableWrapperLollipop)
            {
                DrawableCompatBase.setTintList(drawable, colorstatelist);
                return;
            } else
            {
                drawable.setTintList(colorstatelist);
                return;
            }
        }

        public final void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode)
        {
            if (drawable instanceof DrawableWrapperLollipop)
            {
                DrawableCompatBase.setTintMode(drawable, mode);
                return;
            } else
            {
                drawable.setTintMode(mode);
                return;
            }
        }

        public Drawable wrap(Drawable drawable)
        {
            Object obj = drawable;
            if (drawable instanceof GradientDrawable)
            {
                obj = new DrawableWrapperLollipop(drawable);
            }
            return ((Drawable) (obj));
        }

        LollipopDrawableImpl()
        {
        }
    }

    static final class LollipopMr1DrawableImpl extends LollipopDrawableImpl
    {

        public final Drawable wrap(Drawable drawable)
        {
            return drawable;
        }

        LollipopMr1DrawableImpl()
        {
        }
    }


    static final DrawableImpl IMPL;

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

    public static void setHotspot(Drawable drawable, float f, float f1)
    {
        IMPL.setHotspot(drawable, f, f1);
    }

    public static void setHotspotBounds(Drawable drawable, int i, int j, int k, int l)
    {
        IMPL.setHotspotBounds(drawable, i, j, k, l);
    }

    public static void setTint(Drawable drawable, int i)
    {
        IMPL.setTint(drawable, i);
    }

    public static void setTintList(Drawable drawable, ColorStateList colorstatelist)
    {
        IMPL.setTintList(drawable, colorstatelist);
    }

    public static void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        IMPL.setTintMode(drawable, mode);
    }

    public static Drawable wrap(Drawable drawable)
    {
        return IMPL.wrap(drawable);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 22)
        {
            IMPL = new LollipopMr1DrawableImpl();
        } else
        if (i >= 21)
        {
            IMPL = new LollipopDrawableImpl();
        } else
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
