// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            DrawableCompatHoneycomb, DrawableCompatKitKat, DrawableCompatL

public final class DrawableCompat
{
    static class DrawableImpl
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
        }

        public void setTintList(Drawable drawable, ColorStateList colorstatelist)
        {
        }

        public void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode)
        {
        }

        DrawableImpl()
        {
        }
    }

    static class HoneycombDrawableImpl extends DrawableImpl
    {

        public final void jumpToCurrentState(Drawable drawable)
        {
            DrawableCompatHoneycomb.jumpToCurrentState(drawable);
        }

        HoneycombDrawableImpl()
        {
        }
    }

    static class KitKatDrawableImpl extends HoneycombDrawableImpl
    {

        public final boolean isAutoMirrored(Drawable drawable)
        {
            return DrawableCompatKitKat.isAutoMirrored(drawable);
        }

        public final void setAutoMirrored(Drawable drawable, boolean flag)
        {
            DrawableCompatKitKat.setAutoMirrored(drawable, flag);
        }

        KitKatDrawableImpl()
        {
        }
    }

    static final class LDrawableImpl extends KitKatDrawableImpl
    {

        public final void setHotspot(Drawable drawable, float f, float f1)
        {
            DrawableCompatL.setHotspot(drawable, f, f1);
        }

        public final void setHotspotBounds(Drawable drawable, int i, int j, int k, int l)
        {
            DrawableCompatL.setHotspotBounds(drawable, i, j, k, l);
        }

        public final void setTint(Drawable drawable, int i)
        {
            DrawableCompatL.setTint(drawable, i);
        }

        public final void setTintList(Drawable drawable, ColorStateList colorstatelist)
        {
            DrawableCompatL.setTintList(drawable, colorstatelist);
        }

        public final void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode)
        {
            DrawableCompatL.setTintMode(drawable, mode);
        }

        LDrawableImpl()
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

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            IMPL = new LDrawableImpl();
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
            IMPL = new DrawableImpl();
        }
    }
}
