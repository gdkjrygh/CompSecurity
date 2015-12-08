// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.c.a:
//            a, b, e

static class rawable
    implements rawable
{

    public void a(Drawable drawable)
    {
    }

    public void a(Drawable drawable, float f, float f1)
    {
    }

    public void a(Drawable drawable, int i)
    {
        android.support.v4.c.a.b.a(drawable, i);
    }

    public void a(Drawable drawable, int i, int j, int k, int l)
    {
    }

    public void a(Drawable drawable, ColorStateList colorstatelist)
    {
        android.support.v4.c.a.b.a(drawable, colorstatelist);
    }

    public void a(Drawable drawable, android.graphics.erDuff.Mode mode)
    {
        android.support.v4.c.a.b.a(drawable, mode);
    }

    public void a(Drawable drawable, boolean flag)
    {
    }

    public void b(Drawable drawable, int i)
    {
    }

    public boolean b(Drawable drawable)
    {
        return false;
    }

    public Drawable c(Drawable drawable)
    {
        Object obj = drawable;
        if (!(drawable instanceof e))
        {
            obj = new e(drawable);
        }
        return ((Drawable) (obj));
    }

    public int d(Drawable drawable)
    {
        return 0;
    }

    rawable()
    {
    }
}
