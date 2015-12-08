// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

public class DrawableCompat
{

    static final DrawableImpl a;

    public static void a(Drawable drawable, int i)
    {
        a.a(drawable, i);
    }

    public static boolean a(Drawable drawable)
    {
        return a.a(drawable);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 23)
        {
            a = new MDrawableImpl();
        } else
        if (i >= 22)
        {
            a = new LollipopMr1DrawableImpl();
        } else
        if (i >= 21)
        {
            a = new LollipopDrawableImpl();
        } else
        if (i >= 19)
        {
            a = new KitKatDrawableImpl();
        } else
        if (i >= 17)
        {
            a = new JellybeanMr1DrawableImpl();
        } else
        if (i >= 11)
        {
            a = new HoneycombDrawableImpl();
        } else
        {
            a = new BaseDrawableImpl();
        }
    }

    private class DrawableImpl
    {

        public abstract void a(Drawable drawable, int i);

        public abstract boolean a(Drawable drawable);
    }


    private class MDrawableImpl extends LollipopMr1DrawableImpl
    {
        private class LollipopMr1DrawableImpl extends LollipopDrawableImpl
        {
            private class LollipopDrawableImpl extends KitKatDrawableImpl
            {
                private class KitKatDrawableImpl extends JellybeanMr1DrawableImpl
                {
                    private class JellybeanMr1DrawableImpl extends HoneycombDrawableImpl
                    {
                        private class HoneycombDrawableImpl extends BaseDrawableImpl
                        {
                            private class BaseDrawableImpl
                                implements DrawableImpl
                            {

                                public void a(Drawable drawable, int i)
                                {
                                }

                                public boolean a(Drawable drawable)
                                {
                                    return false;
                                }

                                BaseDrawableImpl()
                                {
                                }
                            }


                            HoneycombDrawableImpl()
                            {
                            }
                        }


                        public void a(Drawable drawable, int i)
                        {
                            DrawableCompatJellybeanMr1.a(drawable, i);
                        }

                        JellybeanMr1DrawableImpl()
                        {
                        }
                    }


                    public boolean a(Drawable drawable)
                    {
                        return DrawableCompatKitKat.a(drawable);
                    }

                    KitKatDrawableImpl()
                    {
                    }
                }


                LollipopDrawableImpl()
                {
                }
            }


            LollipopMr1DrawableImpl()
            {
            }
        }


        public void a(Drawable drawable, int i)
        {
            DrawableCompatApi23.a(drawable, i);
        }

        MDrawableImpl()
        {
        }
    }

}
