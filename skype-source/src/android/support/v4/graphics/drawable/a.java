// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            d, b, e, f, 
//            c, g, h

public final class android.support.v4.graphics.drawable.a
{
    static class a
        implements b
    {

        public void a(Drawable drawable)
        {
        }

        public void a(Drawable drawable, float f1, float f2)
        {
        }

        public void a(Drawable drawable, int i)
        {
            android.support.v4.graphics.drawable.b.a(drawable, i);
        }

        public void a(Drawable drawable, int i, int j, int k, int l)
        {
        }

        public void a(Drawable drawable, ColorStateList colorstatelist)
        {
            android.support.v4.graphics.drawable.b.a(drawable, colorstatelist);
        }

        public void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
        {
            android.support.v4.graphics.drawable.b.a(drawable, mode);
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
            if (!(drawable instanceof android.support.v4.graphics.drawable.e))
            {
                obj = new android.support.v4.graphics.drawable.e(drawable);
            }
            return ((Drawable) (obj));
        }

        public int d(Drawable drawable)
        {
            return 0;
        }

        a()
        {
        }
    }

    static interface b
    {

        public abstract void a(Drawable drawable);

        public abstract void a(Drawable drawable, float f1, float f2);

        public abstract void a(Drawable drawable, int i);

        public abstract void a(Drawable drawable, int i, int j, int k, int l);

        public abstract void a(Drawable drawable, ColorStateList colorstatelist);

        public abstract void a(Drawable drawable, android.graphics.PorterDuff.Mode mode);

        public abstract void a(Drawable drawable, boolean flag);

        public abstract void b(Drawable drawable, int i);

        public abstract boolean b(Drawable drawable);

        public abstract Drawable c(Drawable drawable);

        public abstract int d(Drawable drawable);
    }

    static class c extends a
    {

        public final void a(Drawable drawable)
        {
            drawable.jumpToCurrentState();
        }

        public Drawable c(Drawable drawable)
        {
            Object obj = drawable;
            if (!(drawable instanceof android.support.v4.graphics.drawable.f))
            {
                obj = new android.support.v4.graphics.drawable.f(drawable);
            }
            return ((Drawable) (obj));
        }

        c()
        {
        }
    }

    static class d extends c
    {

        public void b(Drawable drawable, int i)
        {
            android.support.v4.graphics.drawable.c.a(drawable, i);
        }

        public int d(Drawable drawable)
        {
            int i = android.support.v4.graphics.drawable.c.a(drawable);
            if (i < 0)
            {
                return i;
            } else
            {
                return 0;
            }
        }

        d()
        {
        }
    }

    static class e extends d
    {

        public final void a(Drawable drawable, boolean flag)
        {
            drawable.setAutoMirrored(flag);
        }

        public final boolean b(Drawable drawable)
        {
            return drawable.isAutoMirrored();
        }

        public Drawable c(Drawable drawable)
        {
            Object obj = drawable;
            if (!(drawable instanceof android.support.v4.graphics.drawable.g))
            {
                obj = new android.support.v4.graphics.drawable.g(drawable);
            }
            return ((Drawable) (obj));
        }

        e()
        {
        }
    }

    static class f extends e
    {

        public final void a(Drawable drawable, float f1, float f2)
        {
            drawable.setHotspot(f1, f2);
        }

        public final void a(Drawable drawable, int i)
        {
            if (drawable instanceof android.support.v4.graphics.drawable.h)
            {
                android.support.v4.graphics.drawable.b.a(drawable, i);
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
            if (drawable instanceof android.support.v4.graphics.drawable.h)
            {
                android.support.v4.graphics.drawable.b.a(drawable, colorstatelist);
                return;
            } else
            {
                drawable.setTintList(colorstatelist);
                return;
            }
        }

        public final void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
        {
            if (drawable instanceof android.support.v4.graphics.drawable.h)
            {
                android.support.v4.graphics.drawable.b.a(drawable, mode);
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
                obj = new android.support.v4.graphics.drawable.h(drawable);
            }
            return ((Drawable) (obj));
        }

        f()
        {
        }
    }

    static class g extends f
    {

        public final Drawable c(Drawable drawable)
        {
            return drawable;
        }

        g()
        {
        }
    }

    static final class h extends g
    {

        public final void b(Drawable drawable, int i)
        {
            drawable.setLayoutDirection(i);
        }

        public final int d(Drawable drawable)
        {
            return drawable.getLayoutDirection();
        }

        h()
        {
        }
    }


    static final b a;

    public static void a(Drawable drawable)
    {
        a.a(drawable);
    }

    public static void a(Drawable drawable, float f1, float f2)
    {
        a.a(drawable, f1, f2);
    }

    public static void a(Drawable drawable, int i)
    {
        a.a(drawable, i);
    }

    public static void a(Drawable drawable, int i, int j, int k, int l)
    {
        a.a(drawable, i, j, k, l);
    }

    public static void a(Drawable drawable, ColorStateList colorstatelist)
    {
        a.a(drawable, colorstatelist);
    }

    public static void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        a.a(drawable, mode);
    }

    public static void a(Drawable drawable, boolean flag)
    {
        a.a(drawable, flag);
    }

    public static void b(Drawable drawable, int i)
    {
        a.b(drawable, i);
    }

    public static boolean b(Drawable drawable)
    {
        return a.b(drawable);
    }

    public static Drawable c(Drawable drawable)
    {
        return a.c(drawable);
    }

    public static Drawable d(Drawable drawable)
    {
        Drawable drawable1 = drawable;
        if (drawable instanceof android.support.v4.graphics.drawable.d)
        {
            drawable1 = ((android.support.v4.graphics.drawable.d)drawable).a();
        }
        return drawable1;
    }

    public static int e(Drawable drawable)
    {
        return a.d(drawable);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 23)
        {
            a = new h();
        } else
        if (i >= 22)
        {
            a = new g();
        } else
        if (i >= 21)
        {
            a = new f();
        } else
        if (i >= 19)
        {
            a = new e();
        } else
        if (i >= 17)
        {
            a = new d();
        } else
        if (i >= 11)
        {
            a = new c();
        } else
        {
            a = new a();
        }
    }
}
