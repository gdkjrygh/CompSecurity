// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            DrawableCompatHoneycomb

public class DrawableCompat
{
    static class BaseDrawableImpl
        implements DrawableImpl
    {

        public void jumpToCurrentState(Drawable drawable)
        {
        }

        BaseDrawableImpl()
        {
        }
    }

    static interface DrawableImpl
    {

        public abstract void jumpToCurrentState(Drawable drawable);
    }

    static class HoneycombDrawableImpl
        implements DrawableImpl
    {

        public void jumpToCurrentState(Drawable drawable)
        {
            DrawableCompatHoneycomb.jumpToCurrentState(drawable);
        }

        HoneycombDrawableImpl()
        {
        }
    }


    static final DrawableImpl IMPL;

    public DrawableCompat()
    {
    }

    public static void jumpToCurrentState(Drawable drawable)
    {
        IMPL.jumpToCurrentState(drawable);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new HoneycombDrawableImpl();
        } else
        {
            IMPL = new BaseDrawableImpl();
        }
    }
}
