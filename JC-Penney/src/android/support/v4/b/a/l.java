// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.b.a:
//            r, q

class l
{

    public static Drawable a(Drawable drawable)
    {
        Object obj = drawable;
        if (!(drawable instanceof r))
        {
            obj = new r(drawable);
        }
        return ((Drawable) (obj));
    }

    public static void a(Drawable drawable, int i)
    {
        if (drawable instanceof q)
        {
            ((q)drawable).setTint(i);
        }
    }

    public static void a(Drawable drawable, ColorStateList colorstatelist)
    {
        if (drawable instanceof q)
        {
            ((q)drawable).setTintList(colorstatelist);
        }
    }

    public static void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        if (drawable instanceof q)
        {
            ((q)drawable).setTintMode(mode);
        }
    }
}
