// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            DrawableWrapper, DrawableWrapperDonut

class DrawableCompatBase
{

    DrawableCompatBase()
    {
    }

    public static void setTint(Drawable drawable, int i)
    {
        if (drawable instanceof DrawableWrapper)
        {
            ((DrawableWrapper)drawable).setTint(i);
        }
    }

    public static void setTintList(Drawable drawable, ColorStateList colorstatelist)
    {
        if (drawable instanceof DrawableWrapper)
        {
            ((DrawableWrapper)drawable).setTintList(colorstatelist);
        }
    }

    public static void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        if (drawable instanceof DrawableWrapper)
        {
            ((DrawableWrapper)drawable).setTintMode(mode);
        }
    }

    public static Drawable wrapForTinting(Drawable drawable)
    {
        Object obj = drawable;
        if (!(drawable instanceof DrawableWrapperDonut))
        {
            obj = new DrawableWrapperDonut(drawable);
        }
        return ((Drawable) (obj));
    }
}
