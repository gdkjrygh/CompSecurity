// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.a.a:
//            c, h, j

class b
    implements c
{

    b()
    {
    }

    public void a(Drawable drawable)
    {
    }

    public void a(Drawable drawable, float f, float f1)
    {
    }

    public void a(Drawable drawable, int i)
    {
        h.a(drawable, i);
    }

    public void a(Drawable drawable, int i, int k, int l, int i1)
    {
    }

    public void a(Drawable drawable, ColorStateList colorstatelist)
    {
        h.a(drawable, colorstatelist);
    }

    public void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        h.a(drawable, mode);
    }

    public void a(Drawable drawable, boolean flag)
    {
    }

    public boolean b(Drawable drawable)
    {
        return false;
    }

    public Drawable c(Drawable drawable)
    {
        Object obj = drawable;
        if (!(drawable instanceof j))
        {
            obj = new j(drawable);
        }
        return ((Drawable) (obj));
    }
}
