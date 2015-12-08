// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            DrawableWrapper

public class DrawableCompat
{

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

    public static Drawable unwrap(Drawable drawable)
    {
        Drawable drawable1 = drawable;
        if (drawable instanceof DrawableWrapper)
        {
            drawable1 = ((DrawableWrapper)drawable).getWrappedDrawable();
        }
        return drawable1;
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

    private class DrawableImpl
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


    private class LollipopMr1DrawableImpl extends LollipopDrawableImpl
    {
        private class LollipopDrawableImpl extends KitKatDrawableImpl
        {
            private class KitKatDrawableImpl extends HoneycombDrawableImpl
            {
                private class HoneycombDrawableImpl extends BaseDrawableImpl
                {
                    private class BaseDrawableImpl
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
                            return DrawableCompatBase.wrapForTinting(drawable);
                        }

                        BaseDrawableImpl()
                        {
                        }
                    }


                    public void jumpToCurrentState(Drawable drawable)
                    {
                        DrawableCompatHoneycomb.jumpToCurrentState(drawable);
                    }

                    public Drawable wrap(Drawable drawable)
                    {
                        return DrawableCompatHoneycomb.wrapForTinting(drawable);
                    }

                    HoneycombDrawableImpl()
                    {
                    }
                }


                public boolean isAutoMirrored(Drawable drawable)
                {
                    return DrawableCompatKitKat.isAutoMirrored(drawable);
                }

                public void setAutoMirrored(Drawable drawable, boolean flag)
                {
                    DrawableCompatKitKat.setAutoMirrored(drawable, flag);
                }

                public Drawable wrap(Drawable drawable)
                {
                    return DrawableCompatKitKat.wrapForTinting(drawable);
                }

                KitKatDrawableImpl()
                {
                }
            }


            public void setHotspot(Drawable drawable, float f, float f1)
            {
                DrawableCompatLollipop.setHotspot(drawable, f, f1);
            }

            public void setHotspotBounds(Drawable drawable, int i, int j, int k, int l)
            {
                DrawableCompatLollipop.setHotspotBounds(drawable, i, j, k, l);
            }

            public void setTint(Drawable drawable, int i)
            {
                DrawableCompatLollipop.setTint(drawable, i);
            }

            public void setTintList(Drawable drawable, ColorStateList colorstatelist)
            {
                DrawableCompatLollipop.setTintList(drawable, colorstatelist);
            }

            public void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode)
            {
                DrawableCompatLollipop.setTintMode(drawable, mode);
            }

            public Drawable wrap(Drawable drawable)
            {
                return DrawableCompatLollipop.wrapForTinting(drawable);
            }

            LollipopDrawableImpl()
            {
            }
        }


        public Drawable wrap(Drawable drawable)
        {
            return DrawableCompatApi22.wrapForTinting(drawable);
        }

        LollipopMr1DrawableImpl()
        {
        }
    }

}
