// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            DrawableWrapperLollipop, DrawableCompatBase

class DrawableCompatLollipop
{

    DrawableCompatLollipop()
    {
    }

    public static void setHotspot(Drawable drawable, float f, float f1)
    {
        drawable.setHotspot(f, f1);
    }

    public static void setHotspotBounds(Drawable drawable, int i, int j, int k, int l)
    {
        drawable.setHotspotBounds(i, j, k, l);
    }

    public static void setTint(Drawable drawable, int i)
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

    public static void setTintList(Drawable drawable, ColorStateList colorstatelist)
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

    public static void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode)
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

    public static Drawable wrapForTinting(Drawable drawable)
    {
        Object obj;
label0:
        {
            if (!(drawable instanceof GradientDrawable))
            {
                obj = drawable;
                if (!(drawable instanceof DrawableContainer))
                {
                    break label0;
                }
            }
            obj = new DrawableWrapperLollipop(drawable);
        }
        return ((Drawable) (obj));
    }
}
