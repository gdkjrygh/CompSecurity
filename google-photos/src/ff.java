// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;

class ff extends fe
{

    ff()
    {
    }

    public final void a(Drawable drawable, float f, float f1)
    {
        drawable.setHotspot(f, f1);
    }

    public final void a(Drawable drawable, int i)
    {
        if (drawable instanceof fm)
        {
            c.a(drawable, i);
            return;
        } else
        {
            drawable.setTint(i);
            return;
        }
    }

    public final void a(Drawable drawable, int i, int j, int k, int l)
    {
        drawable.setHotspotBounds(i, j, k, l);
    }

    public final void a(Drawable drawable, ColorStateList colorstatelist)
    {
        if (drawable instanceof fm)
        {
            c.a(drawable, colorstatelist);
            return;
        } else
        {
            drawable.setTintList(colorstatelist);
            return;
        }
    }

    public final void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        if (drawable instanceof fm)
        {
            c.a(drawable, mode);
            return;
        } else
        {
            drawable.setTintMode(mode);
            return;
        }
    }

    public Drawable c(Drawable drawable)
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
            obj = new fm(drawable);
        }
        return ((Drawable) (obj));
    }
}
