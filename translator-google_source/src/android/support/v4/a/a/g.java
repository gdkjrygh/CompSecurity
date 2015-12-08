// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;

// Referenced classes of package android.support.v4.a.a:
//            f, p, j

class g extends f
{

    g()
    {
    }

    public final void a(Drawable drawable, float f1, float f2)
    {
        drawable.setHotspot(f1, f2);
    }

    public final void a(Drawable drawable, int i)
    {
        if (drawable instanceof p)
        {
            j.a(drawable, i);
            return;
        } else
        {
            drawable.setTint(i);
            return;
        }
    }

    public final void a(Drawable drawable, int i, int k, int l, int i1)
    {
        drawable.setHotspotBounds(i, k, l, i1);
    }

    public final void a(Drawable drawable, ColorStateList colorstatelist)
    {
        if (drawable instanceof p)
        {
            j.a(drawable, colorstatelist);
            return;
        } else
        {
            drawable.setTintList(colorstatelist);
            return;
        }
    }

    public final void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        if (drawable instanceof p)
        {
            j.a(drawable, mode);
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
            obj = new p(drawable);
        }
        return ((Drawable) (obj));
    }
}
